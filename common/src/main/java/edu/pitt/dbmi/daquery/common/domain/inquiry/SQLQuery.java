package edu.pitt.dbmi.daquery.common.domain.inquiry;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.google.gson.annotations.Expose;

import edu.pitt.dbmi.daquery.common.domain.DataModel;
import edu.pitt.dbmi.daquery.common.domain.DataSource;
import edu.pitt.dbmi.daquery.common.domain.SQLDataSource;
import edu.pitt.dbmi.daquery.common.domain.SourceType;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.common.util.ResponseHelper;
import edu.pitt.dbmi.daquery.common.util.RngHelper;
import edu.pitt.dbmi.daquery.common.util.StringHelper;
import edu.pitt.dbmi.daquery.sql.AggregateSQLAnalyzer;

@Entity
@Table(name = "SQL_QUERY")
@DiscriminatorValue(value = InquiryType.TYPES.SQL_VAL)
@PrimaryKeyJoinColumn(name = "inq_id", referencedColumnName = "id")
public class SQLQuery extends Inquiry
{
	private static final long serialVersionUID = 2928392034234l;
	private final static Logger log = Logger.getLogger(SQLQuery.class.getName());
		
/*	@Expose
	@Column(name = "CODE")
	private String code; */
	
	
	
/*	@Expose
	@Column(name = "SQL_DIALECT")
	private String sqldialect; */
	
    @Expose
	protected Set<SQLCode> code = new HashSet<SQLCode>();


	
	public SQLQuery()
	{
		dataType = InquiryType.TYPES.SQL_VAL;
	}
	
	public SQLQuery(boolean generateUUID) {
		super(generateUUID);
	}
	
/*	@Transient
	public SQLDialect getSqlDialectEnum()
	{
		if (sqldialect == null) {
			return null;
		}
		return(SQLDialect.fromString(sqldialect));
	}
	public void setSqlDialectEnum(SQLDialect dialect)
	{
		if (dialect == null) {
			sqldialect = null;
		} else {
			sqldialect = dialect.toString();			
		}
	} 
	
	public String getCode(){return(code);}
	public void setCode(String code){this.code = code;} */
	@OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL, mappedBy="query", orphanRemoval=true)
	public Set<SQLCode> getCode(){return(code);}
	public void setCode(Set<SQLCode> code){this.code = code;}
	public void addCode(SQLCode code)
	{
		this.code.add(code);
		code.setQuery(this);
	}
	
	@Transient
	public String getCode(SQLDialect dialect)
	{
		if(code == null) return(null);
		SQLDialect searchDialect;
		if(dialect == null) searchDialect = SQLDialect.ANSI;
		else searchDialect = dialect;
		
		String rVal = null;
		String ansiCode = null;
		for(SQLCode c : code)
		{
			if(c != null && c.getDialectEnum() != null)
			{
				if(rVal == null && c.getDialectEnum().equals(searchDialect))
				{
					rVal = c.getCode();
				}
				//store ansi code if we find it
				if(c.getDialectEnum().equals(SQLDialect.ANSI))
				{
					ansiCode = c.getCode();
				}		
			}
		}
		
		//if a matching dialect isn't found use the ANSI code
		if(rVal == null) rVal = ansiCode;
		
		return(rVal);
	}
	
	@Override
	public DaqueryResponse run(DaqueryResponse response, DataModel model)
	{
		try
		{
			SQLDialect dialect = null;
			String lclCode = null;
			SQLDataSource ds = null;
			String errorMessage = null;
			if(model == null) errorMessage = "No data model found.";
			else if((ds = (SQLDataSource) model.getDataSource(SourceType.SQL)) == null) errorMessage = "No SQL data source found attached to model " + model.getName();
			else
			{
				dialect = ((SQLDataSource) model.getDataSource(SourceType.SQL)).getDialectEnum();
				lclCode = getCode(dialect);
				if(StringHelper.isEmpty(lclCode)) errorMessage = "No SQL code found to execute on db type: " + dialect;
			}
			
			if(errorMessage != null)
			{
				response.setStatusEnum(ResponseStatus.ERROR);
				response.setErrorMessage(errorMessage);
				return(response);			
			}

			
			if(isAggregate())
			//if(getQueryType().equals(QueryType.AGGREGATE.value))
			{
				AggregateSQLAnalyzer analyze = new AggregateSQLAnalyzer(lclCode);
				if(analyze.isRejected())
				{
					response.setStatusEnum(ResponseStatus.ERROR);
					response.setErrorMessage(analyze.getRejectionMessage());
				}
				else
				{

					//String sql = "select count(patid) from demographic;";
					Long val = ds.executeAggregate(lclCode);
					String strVal = null;
					if(val != null) strVal = RngHelper.obfuscateAggregateResult(val, response.getRequest().getNetwork()).toString();
					response.setValue(strVal);
					
					String aggregateValueSql = analyze.convertToValuesSql();
					if(val != null && val.longValue() >0 && ! StringHelper.isEmpty(aggregateValueSql))
					{
						response.setDownloadAvailable(true);
						SQLDownload dLoad = new SQLDownload(true);
						dLoad.addCode(new SQLCode(aggregateValueSql, dialect));
						response.setDownloadDirective(dLoad);
					}
					else
						response.setDownloadAvailable(false);
					
					response.setStatusEnum(ResponseStatus.COMPLETED);
				}
			}
			else
			{
				response.setStatusEnum(ResponseStatus.ERROR);
				response.setErrorMessage("Only queries that return a single aggregate result are supported at this time.");
			}
				
			return(response);
		}
		catch(DaqueryException de)
		{
			log.log(Level.SEVERE, "Application error while executing an aggregate query.", de);
			Throwable t = ResponseHelper.getRootCause(de);
			String causeMsg = "";
			if(! t.equals(de))
				causeMsg = t.getMessage() + " ";
			response.setStatusEnum(ResponseStatus.ERROR);
			response.setErrorMessage(removeErrorPrefix(causeMsg) + " " + removeErrorPrefix(de.getMessage()) + " Check the site logs for more information.");
			response.setStackTrace(StringHelper.stackToString(t));		
			return(response);
		}
		catch(Throwable t)
		{
			log.log(Level.SEVERE, "Unexpected error while executing an aggregate query: " + code, t);
			response.setStatusEnum(ResponseStatus.ERROR);
			response.setErrorMessage("An unexpected error occured. Check the site logs for more information." + t.getMessage());
			response.setStackTrace(StringHelper.stackToString(t));
			return(response);
		}
	}
	private String removeErrorPrefix(String err)
	{
		if(StringHelper.isEmpty(err)) return(err);
		String errComp = err.trim().toUpperCase();
		if(errComp.startsWith("ORA-") && errComp.indexOf(":") > 0)
			return(err.trim().substring(errComp.indexOf(":") + 1).trim());
		else
			return(err);
	}
}

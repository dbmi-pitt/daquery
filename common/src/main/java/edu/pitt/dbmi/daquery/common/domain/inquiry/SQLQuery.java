package edu.pitt.dbmi.daquery.common.domain.inquiry;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.google.gson.annotations.Expose;

import edu.pitt.dbmi.daquery.common.domain.DataModel;
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
		
	@Expose
	@Column(name = "CODE")
	private String code;
	
	@Expose
	@Column(name = "SQL_DIALECT")
	private String sqldialect;
	
	public SQLQuery()
	{
		dataType = InquiryType.TYPES.SQL_VAL;
	}
	
	public SQLQuery(boolean generateUUID) {
		super(generateUUID);
	}
	
	@Transient
	public SQLDialect getSqlDialectEnum()
	{
		if (sqldialect == null) {
			return null;
		}
		return(SQLDialect.valueOf(sqldialect));
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
	public void setCode(String code){this.code = code;}

	@Override
	public DaqueryResponse run(DaqueryResponse response, DataModel model)
	{
		try
		{	
			if(isAggregate())
			{
				AggregateSQLAnalyzer analyze = new AggregateSQLAnalyzer(code);
				if(analyze.isRejected())
				{
					response.setStatusEnum(ResponseStatus.ERROR);
					response.setErrorMessage(analyze.getRejectionMessage());
				}
				else
				{
					SQLDataSource ds = (SQLDataSource) model.getDataSource(SourceType.SQL);
					if(ds == null)
					{
						response.setStatusEnum(ResponseStatus.ERROR);
						response.setErrorMessage("A SQL data source attached to data model " + getNetwork().getDataModel().getName() + " was not found.");
					}
					//String sql = "select count(patid) from demographic;";
					String sql = ((SQLQuery) response.getRequest().getInquiry()).getCode();
					Long val = ds.executeAggregate(sql);
					String strVal = null;
					if(val != null) strVal = RngHelper.obfuscateAggregateResult(val, response.getRequest().getNetwork()).toString();
					response.setValue(strVal);
					
					String aggregateValueSql = analyze.convertToValuesSql();
					if(val != null && val.longValue() >0 && ! StringHelper.isEmpty(aggregateValueSql))
					{
						response.setDownloadAvailable(true);
						SQLDownload dLoad = new SQLDownload(true);
						dLoad.setCode(aggregateValueSql);
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

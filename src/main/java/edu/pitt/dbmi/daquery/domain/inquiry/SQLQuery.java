package edu.pitt.dbmi.daquery.domain.inquiry;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.google.gson.annotations.Expose;

import edu.pitt.dbmi.daquery.domain.DataModel;
import edu.pitt.dbmi.daquery.domain.SQLDataSource;
import edu.pitt.dbmi.daquery.domain.SourceType;
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
		return(SQLDialect.valueOf(sqldialect));
	}
	public void setSqlDialectEnum(SQLDialect dialect)
	{
		sqldialect = dialect.toString();
	}
	
	public String getCode(){return(code);}
	public void setCode(String code){this.code = code;}

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
				SQLDataSource ds = (SQLDataSource) model.getDataSource(SourceType.SQL);
				if(ds == null)
				{
					response.setStatusEnum(ResponseStatus.ERROR);
					response.setErrorMessage("A SQL data source attached to data model " + getNetwork().getDataModel().getName() + " was not found.");
				}
				String sql = "select count(patid) from demographic;";
				response.setValue(ds.executeAggregate(sql).toString());
				response.setStatusEnum(ResponseStatus.COMPLETED);
			}
			else
			{
				response.setStatusEnum(ResponseStatus.ERROR);
				response.setErrorMessage("Non-aggregate queries are not supported at this time.");
			}
				
			return(response);
		}
		catch(Throwable t)
		{
			log.log(Level.SEVERE, "Unexpected error while executing query: " + code, t);
			response.setStatusEnum(ResponseStatus.ERROR);
			response.setErrorMessage("An unexpected error occured. Check the site logs for more information." + t.getMessage());
			return(response);
		}
	}
}

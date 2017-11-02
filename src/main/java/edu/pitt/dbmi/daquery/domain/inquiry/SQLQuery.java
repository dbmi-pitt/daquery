package edu.pitt.dbmi.daquery.domain.inquiry;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.internal.util.StringHelper;

import com.google.gson.annotations.Expose;

import edu.pitt.dbmi.daquery.common.util.DaqueryException;

@Entity
@Table(name = "SQL_QUERY")
@DiscriminatorValue(value = InquiryType.TYPES.SQL_VAL)
@PrimaryKeyJoinColumn(name = "inq_id", referencedColumnName = "id")
public class SQLQuery extends Inquiry
{
	private static final long serialVersionUID = 2928392034234l;
	
	@Expose
	@Column(name = "SQL_CODE")
	private String sqlcode;
	
	@Expose
	@Column(name = "SQL_DIALECT")
	private String sqldialect;
	
	public SQLQuery()
	{
		dataType = InquiryType.TYPES.SQL_VAL;
	}
	
	@Transient
	public SQLDialect getSQLDialectEnum()
	{
		return(SQLDialect.valueOf(sqldialect));
	}
	public void setSQLDialect(SQLDialect dialect)
	{
		sqldialect = dialect.toString();
	}
	
	public String getSQLCode(){return(sqlcode);}
	public void setSQLCode(String code){sqlcode = code;}
	
	@Transient
	public boolean isAggregate() throws DaqueryException
	{
		if(StringHelper.isEmpty(sqlcode))
			return(false);
		return(true);
	}
	
	@Transient
	public Long runAggregate() throws DaqueryException
	{
		if(! isAggregate())
			throw new DaqueryException("The supplied query is not in the form to return a single aggregate result.  It must start with a single select clause of count(field)....");
		
		//throw excpetion for bad query 
		
		//run queryl
		
		return 17l;
	}
}

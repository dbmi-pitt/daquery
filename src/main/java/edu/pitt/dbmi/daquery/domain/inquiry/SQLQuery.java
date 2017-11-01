package edu.pitt.dbmi.daquery.domain.inquiry;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.google.gson.annotations.Expose;

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
}

package edu.pitt.dbmi.daquery.domain.inquiry;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "SQL_QUERY")
@DiscriminatorValue(value = InquiryType.TYPES.SAS_VAL)
@PrimaryKeyJoinColumn(name = "inq_id", referencedColumnName = "id")
public class SQLQuery extends Inquiry
{
	private static final long serialVersionUID = 2928392034234l;
	
	@Column(name = "SQL_CODE")
	private String sqlCode;
	
	@Column(name = "SQL_DIALECT")
	private String sqlDialect;
	
	public SQLDialect getSQLDialectEnum()
	{
		return(SQLDialect.valueOf(sqlDialect));
	}
	public void setSQLDialect(SQLDialect dialect)
	{
		sqlDialect = dialect.toString();
	}
}

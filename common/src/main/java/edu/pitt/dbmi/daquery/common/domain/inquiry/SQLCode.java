package edu.pitt.dbmi.daquery.common.domain.inquiry;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.common.util.StringHelper;

import com.google.gson.annotations.Expose;

import edu.pitt.dbmi.daquery.common.domain.DaqueryObject;

@Entity
@Table(name="SQL_CODE")
public class SQLCode extends DaqueryObject
{
	private static final long serialVersionUID = 2892792237423l;

    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID", unique=true, nullable=false)
	private Long id;
    
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="QUERY_ID")
    private SQLQuery query;

	@Expose
	private String code;
	
	@Expose String dialect;
	
	public SQLCode(){}
	public SQLCode(String code, SQLDialect dialect)
	{
		this.code = code;
		setDialectEnum(dialect);
	}
	
    public Long getId(){return(id);}
    public void setId(Long id){this.id = id;}
    
    public SQLQuery getQuery(){return(query);}
    public void setQuery(SQLQuery qry){query = qry;}
    
	public String getCode(){return(code);}
	public void setCode(String code){this.code = code;}
	
	public String getDialect(){return(dialect);}
	public void setDialect(String dialect){this.dialect = dialect;}
	
	@Transient
	public SQLDialect getDialectEnum()
	{
		if(StringHelper.isEmpty(dialect)) return(null);
		return(SQLDialect.fromString(dialect));
	}
	public void setDialectEnum(SQLDialect dialect)
	{
		if(dialect == null) this.dialect = null;
		this.dialect = dialect.val;
	}
}

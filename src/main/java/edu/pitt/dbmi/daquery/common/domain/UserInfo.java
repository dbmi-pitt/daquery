package edu.pitt.dbmi.daquery.common.domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.google.gson.annotations.Expose;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,include = JsonTypeInfo.As.PROPERTY, property = "utype")
@JsonSubTypes({@Type(value = UserInfo.class, name = UserInfo.INFO_ONLY),
               @Type(value = DaqueryUser.class, name = UserInfo.FULL_USER)})
@Entity  
@Table(name = "DQ_USER")  
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)  
@DiscriminatorColumn(name="utype",discriminatorType=DiscriminatorType.STRING)  
@DiscriminatorValue(value=UserInfo.INFO_ONLY)  
public class UserInfo extends DaqueryObject
{
	private static final long serialVersionUID = 293230423424234l;

	protected static final String INFO_ONLY = "INFO";
	protected static final String FULL_USER = "FULL";
	
    @Expose
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "ID", unique = true, length=50)
    protected String id;
    
    @Expose
	@Column(name="REAL_NAME", length=100)
	protected String realName;
    
    @Expose
    @Column(name="EMAIL", length = 500, nullable = true)
    protected String email;  
    
    @Expose
    @Column(name="UTYPE", insertable = false, updatable = false)
    protected String utype;
    
    public UserInfo(){}
    
    public UserInfo(DaqueryUser user)
    {
    	this.email = user.email;
    	this.id = user.id;
    	this.realName = user.realName;
    	this.utype = INFO_ONLY;
    }
    
    public String getId() {
    	if(id == null) return(null);
        return id.trim();
    }

    public void setId(String id) {
    	if(id == null) this.id = null;
        this.id = id.trim();
    }

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}
	
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    public String getUtype(){return(utype);}
    public void setUtype(String type){utype = type;}
    
}

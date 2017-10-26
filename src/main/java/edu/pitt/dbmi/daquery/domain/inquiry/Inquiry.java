package edu.pitt.dbmi.daquery.domain.inquiry;

import java.io.Serializable;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import edu.pitt.dbmi.daquery.domain.DaqueryUser;

@MappedSuperclass
public abstract class Inquiry implements Serializable
{
	private static final long serialVersionUID = 292872892223423l;
	
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private DaqueryUser user;
	
	//a UUID for this query
	//this id will be the same across multiple 
	//queries with different versions
	private String queryId;
	
	private int version;
	
	
	
	public abstract String getType();
	
	public DaqueryUser getUser(){return(user);}
	public void setUser(DaqueryUser user){this.user = user;}
	
	public String getQueryId(){return(queryId);}
	public void setQueryId(String id){queryId = id;}
	
	public int getVersion(){return(version);}
	public void setVersion(int vers){version = vers;}
	
	
}

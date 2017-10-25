package edu.pitt.dbmi.daquery.domain.inquiry;

import java.io.Serializable;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import edu.pitt.dbmi.daquery.domain.Site_User;

@MappedSuperclass
public abstract class Inquiry implements Serializable
{
	private static final long serialVersionUID = 292872892223423l;
	
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private Site_User user;
	
	public abstract String getType();
	
	public Site_User getUser(){return(user);}
	public void setUser(Site_User user){this.user = user;}
	
	
}

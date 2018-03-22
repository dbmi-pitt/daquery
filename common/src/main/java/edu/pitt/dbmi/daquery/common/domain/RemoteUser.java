package edu.pitt.dbmi.daquery.common.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Transient;

import com.google.gson.annotations.Expose;

public class RemoteUser extends UserInfo
{
	private static final long serialVersionUID = 29292852129897234l;
	
	@Expose
	@Transient
	List<String> roles = new ArrayList<String>();
	
	public RemoteUser(){}
	
	public RemoteUser(UserInfo ui)
	{
		this.email = ui.email;
		this.id = ui.id;
		this.realName = ui.realName;
	}
	
	public List<String> getRoles(){return roles;}
	public void setRoles(List<String> roles){this.roles = roles;}
	
	public void addRole(String role){roles.add(role);}
	
	@Expose
	@Transient
	Site site;
	
	public Site getSite(){return(site);}
	public void setSite(Site site){this.site = site;}
}

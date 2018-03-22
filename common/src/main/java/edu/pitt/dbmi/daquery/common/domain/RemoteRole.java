package edu.pitt.dbmi.daquery.common.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.google.gson.annotations.Expose;


/**
 * Link remote (from other sites) users to roles
 * 
 * @author devuser
 *
 */

@Entity
@Table(name="REMOTE_USER_ROLE")
@NamedQueries({
@NamedQuery(name=RemoteRole.FIND_BY_PARAMS, query="SELECT r FROM RemoteRole r WHERE r.roleId = :roleId and r.userId = :userId and r.siteId = :siteId and r.networkId = :netId"),
})
public class RemoteRole
{
	/*
CREATE TABLE REMOTE_USER_ROLE
{
  USER_ID varchar(50) NOT NULL,
  ROLE_ID bigint NOT NULL,
  SITE_ID varchar(50),
  NETWORK_ID varchar(50)
}
	 */
	
	public static final String FIND_BY_PARAMS = "RemoteRole.findByParams";
	
	@Expose
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private long id;

	@Expose
	@Column(name="USER_ID")
	private String userId;	
	
	@Expose
	@Column(name="ROLE_ID")
	private long roleId;
	
	@Expose
	@Column(name="SITE_ID")
	private String siteId;
	
	@Expose
	@Column(name="NETWORK_ID")
	private String networkId;
	
	public RemoteRole(){}
	
	public RemoteRole(long roleId, String userId, String siteId, String netId)
	{
		this.roleId = roleId;
		this.userId = userId;
		this.siteId = siteId;
		this.networkId = netId;
	}
	
	public long getId(){return this.id;}
	public void setId(long id){this.id = id;}
	
	public String getUserId(){return userId;}
	public void setUserId(String id){userId = id;}
	
	public long getRoleId(){return roleId;}
	public void setRoleId(long id){roleId = id;}
	
	public String getSiteId(){return siteId;}
	public void setSiteId(String id){siteId = id;}
	
	public String getNetworkId(){return networkId;}
	public void setNetworkId(String id){networkId = id;}
}

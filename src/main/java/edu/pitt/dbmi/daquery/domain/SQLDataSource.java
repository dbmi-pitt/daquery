package edu.pitt.dbmi.daquery.domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "SQL_DATA_SOURCE")
@DiscriminatorValue(value = SourceType.TYPES.SQL_VAL)
@PrimaryKeyJoinColumn(name = "ds_id", referencedColumnName = "ds_id")
public class SQLDataSource extends DataSource
{
	private static final long serialVersionUID = 29408234823894234l;
	
	public SQLDataSource(){}
	
	public SQLDataSource(String name, String connectionUrl, String password, String username)
	{
		this.name = name;
		this.connectionUrl = connectionUrl;
		this.password = password;
		this.username = username;		
	}
	
	@Column(name = "CONNECTION_URL")
	private String connectionUrl;
	
	@Column(name = "USERNAME")
	private String username;
	
	@Column(name = "PWD")
	private String password; 
	
	public String getConnectionUrl(){return(connectionUrl);}
	public void setConnectionUrl(String url){connectionUrl = url;}

	public String getUsername(){return(username);}
	public void setUsername(String uName){username = uName;}
	
	public String getPassword(){return(password);}
	public void setPassord(String pwd){password = pwd;}	
}

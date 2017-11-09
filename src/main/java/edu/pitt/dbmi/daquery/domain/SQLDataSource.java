package edu.pitt.dbmi.daquery.domain;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Hashtable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import edu.pitt.dbmi.daquery.common.util.ApplicationDBHelper;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;

@Entity
@Table(name = "SQL_DATA_SOURCE")
@DiscriminatorValue(value = SourceType.TYPES.SQL_VAL)
@PrimaryKeyJoinColumn(name = "ds_id", referencedColumnName = "ds_id")
public class SQLDataSource extends DataSource
{
	private static final long serialVersionUID = 29408234823894234l;
	
	private static Hashtable<Long, ComboPooledDataSource> datasources = new Hashtable<Long, ComboPooledDataSource>();
	
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
	public void setPassword(String pwd){password = pwd;}
	
	@Transient
	public String getDriverClass()
	{
		//TODO base class on database type 
		return("oracel.jdbc.driver.OracleDriver");
	}
	
	@Transient
	public Long executeAggregate(String sql) throws DaqueryException
	{
		Connection conn = null;
		Statement s = null;
		ResultSet rs = null;
		try
		{
			conn = getConnection();
			s = conn.createStatement();
			rs = s.executeQuery(sql);
			if(rs.next())
				return(rs.getLong(1));
			else
				throw new DaqueryException("No results returned from aggregate query.");
		}
		catch(DaqueryException de)
		{
			throw de;
		}
		catch(Throwable t)
		{
			throw(new DaqueryException("Error while executing SQL.", t));
		}
		finally
		{
			ApplicationDBHelper.closeConnection(conn, s, rs);
		}
		
	}
	
	private Long getSourceKey()
	{
		long sourceKey = connectionUrl.trim().toString().hashCode() +
				username.trim().toString().hashCode() + 
				password.trim().toString().hashCode() +
				this.getDriverClass().hashCode();
		
		return(sourceKey);
	}
	
	private ComboPooledDataSource getDataSource() throws PropertyVetoException
	{
		Long key = getSourceKey();
		if(! datasources.containsKey(getSourceKey()))
		{
			ComboPooledDataSource ds = new ComboPooledDataSource();
			ds.setDriverClass(this.getDriverClass());
			ds.setJdbcUrl(connectionUrl);
			ds.setPassword(password);
			ds.setUser(username);
		}
		return(datasources.get(key));
	}
	public Connection getConnection() throws SQLException, PropertyVetoException
	{
		ComboPooledDataSource dataSource = getDataSource();
		return(dataSource.getConnection());
	}	
}

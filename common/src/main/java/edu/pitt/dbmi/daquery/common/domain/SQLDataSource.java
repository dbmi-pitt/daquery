package edu.pitt.dbmi.daquery.common.domain;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.google.gson.annotations.Expose;
import com.mchange.v2.c3p0.ComboPooledDataSource;

import edu.pitt.dbmi.daquery.common.domain.DataSource;
import edu.pitt.dbmi.daquery.common.util.ApplicationDBHelper;
import edu.pitt.dbmi.daquery.common.util.C3P0Properties;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;

@Entity
@Table(name = "SQL_DATA_SOURCE")
@DiscriminatorValue(value = SourceType.TYPES.SQL_VAL)
@PrimaryKeyJoinColumn(name = "ds_id", referencedColumnName = "ds_id")
public class SQLDataSource extends DataSource
{
	private static final long serialVersionUID = 29408234823894234l;
	
	private static Logger log = Logger.getLogger(SQLDataSource.class.getName());
	
	private static Hashtable<Long, ComboPooledDataSource> datasources = new Hashtable<Long, ComboPooledDataSource>();
	
	public SQLDataSource(){}
	
	public SQLDataSource(String name, String connectionUrl, String password, String username)
	{
		this.name = name;
		this.connectionUrl = connectionUrl;
		this.password = password;
		this.username = username;		
	}

	@Expose
	@Column(name = "CONNECTION_URL")
	private String connectionUrl;
	
	@Expose
	@Column(name = "USERNAME")
	private String username;
	
	@Expose
	@Column(name = "PWD")
	private String password; 
	
	@Expose
	@Column(name = "DRIVER_CLASS")
	private String driverClass;
	
	public String getConnectionUrl(){return(connectionUrl);}
	public void setConnectionUrl(String url){connectionUrl = url;}

	public String getUsername(){return(username);}
	public void setUsername(String uName){username = uName;}
	
	public String getPassword(){return(password);}
	public void setPassword(String pwd){password = pwd;}
	
	public String getDriverClass(){return(driverClass);}
	public void setDriverClass(String cls){driverClass = cls;}
	
	@Transient
	public Long executeAggregate(String sql) throws DaqueryException
	{
		Connection conn = null;
		Statement s = null;
		ResultSet rs = null;
		try
		{
			String runSQL = sql.trim();
			if(runSQL.endsWith(";"))
				runSQL = runSQL.substring(0, runSQL.length() - 1);
			conn = getConnection();
			s = conn.createStatement();
			rs = s.executeQuery(runSQL);
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
	
	private ComboPooledDataSource getDataSource() throws PropertyVetoException, DaqueryException
	{
		Long key = getSourceKey();
		if(! datasources.containsKey(getSourceKey()))
		{
			ComboPooledDataSource ds = new ComboPooledDataSource();
			ds.setDriverClass(this.getDriverClass());
			ds.setJdbcUrl(connectionUrl);
			ds.setPassword(password);
			ds.setUser(username);
			
			if(C3P0Properties.fileExists())
				C3P0Properties.setProperties(ds);
			else
				log.log(Level.INFO, "No c3p0 properties file found.  No additional parameters set.");
			
/*			log.log(Level.INFO, "----------------------------------------------------- PREFERRED TEST QUERY" + ds.getPreferredTestQuery());
			log.log(Level.INFO, "----------------------------------------------------- IDLE CONNECTION TEST PERIOD" + ds.getIdleConnectionTestPeriod());
			log.log(Level.INFO, "----------------------------------------------------- TEST CONNECTION ON CHECKOUT" + ds.isTestConnectionOnCheckout()); */
			
			datasources.put(key,ds);
		}
		return(datasources.get(key));
	}
	public Connection getConnection() throws SQLException, PropertyVetoException, DaqueryException
	{
		ComboPooledDataSource dataSource = getDataSource();
		return(dataSource.getConnection());
	}	
}

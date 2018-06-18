package edu.pitt.dbmi.daquery.common.util;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import edu.pitt.dbmi.daquery.common.domain.DaqueryUser;
import edu.pitt.dbmi.daquery.common.domain.DataAttribute;
import edu.pitt.dbmi.daquery.common.domain.DataModel;
import edu.pitt.dbmi.daquery.common.domain.DataSource;
import edu.pitt.dbmi.daquery.common.domain.Network;
import edu.pitt.dbmi.daquery.common.domain.Notification;
import edu.pitt.dbmi.daquery.common.domain.RemoteRole;
import edu.pitt.dbmi.daquery.common.domain.Role;
import edu.pitt.dbmi.daquery.common.domain.SASDataSource;
import edu.pitt.dbmi.daquery.common.domain.SQLDataSource;
import edu.pitt.dbmi.daquery.common.domain.Site;
import edu.pitt.dbmi.daquery.common.domain.SiteConnection;
import edu.pitt.dbmi.daquery.common.domain.SourceType;
import edu.pitt.dbmi.daquery.common.domain.UserInfo;
import edu.pitt.dbmi.daquery.common.domain.inquiry.DaqueryRequest;
import edu.pitt.dbmi.daquery.common.domain.inquiry.DaqueryResponse;
import edu.pitt.dbmi.daquery.common.domain.inquiry.Fileset;
import edu.pitt.dbmi.daquery.common.domain.inquiry.Inquiry;
import edu.pitt.dbmi.daquery.common.domain.inquiry.SQLDownload;
import edu.pitt.dbmi.daquery.common.domain.inquiry.SQLQuery;

/**
 *  Singleton used to configure and get a Hibernate Session application wide. 
 *
 */
public class HibernateConfiguration {

    private final static Logger logger = Logger.getLogger(HibernateConfiguration.class.getName());
	
	
	private static SessionFactory sessFact = null;

	private static boolean erroredStartup = false;
	
	/**
	 * Open a new session/db connection
	 * 
	 * @return An open Hibernate session.  Take care to make sure the session is closed when you're finished with it... 
	 */
	public static Session openSession() throws DaqueryException
	{
		return(getSessionFactory().openSession());
	}
	
	/**
	 * Get the Hibernate SessionFactory
	 * @return
	 */
	public static SessionFactory getSessionFactory() throws DaqueryException
	{
		if(erroredStartup) return(null);
		
		if(sessFact != null)
			return(sessFact);
		
        Configuration hibernateConf = new Configuration();
    	hibernateConf.addAnnotatedClass(DataSource.class);	            	
    	hibernateConf.addAnnotatedClass(Network.class);
    	hibernateConf.addAnnotatedClass(Notification.class);
    	hibernateConf.addAnnotatedClass(Role.class);
    	hibernateConf.addAnnotatedClass(SASDataSource.class);
    	hibernateConf.addAnnotatedClass(DaqueryUser.class);
    	hibernateConf.addAnnotatedClass(Site.class);
    	hibernateConf.addAnnotatedClass(SourceType.class);
    	hibernateConf.addAnnotatedClass(SQLDataSource.class);
    	hibernateConf.addAnnotatedClass(DaqueryRequest.class);    	
    	hibernateConf.addAnnotatedClass(Inquiry.class);
    	hibernateConf.addAnnotatedClass(SQLQuery.class);
    	hibernateConf.addAnnotatedClass(SQLDownload.class);
    	hibernateConf.addAnnotatedClass(DaqueryResponse.class);
    	hibernateConf.addAnnotatedClass(UserInfo.class);
    	hibernateConf.addAnnotatedClass(Fileset.class);
    	hibernateConf.addAnnotatedClass(DataModel.class);
    	hibernateConf.addAnnotatedClass(DataAttribute.class);
    	hibernateConf.addAnnotatedClass(RemoteRole.class);
    	hibernateConf.addAnnotatedClass(SiteConnection.class);
    	
    	
        	

        hibernateConf.setProperty("hibernate.connection.driver_class", "org.apache.derby.jdbc.EmbeddedDriver" )
        .setProperty("hibernate.connection.username", "")
    	.setProperty("hibernate.connection.password", "")
    	.setProperty("hibernate.show_sql", "false")
        
        .setProperty("hibernate.c3p0.acquire_increment", "1")
        .setProperty("hibernate.c3p0.idle_test_period","240")
        .setProperty("hibernate.c3p0.timeout","600")	            
        .setProperty("hibernate.c3p0.max_size","100")
        .setProperty("hibernate.c3p0.min_size","3")
        .setProperty("hibernate.c3p0.validate", "false")
        .setProperty("hibernate.c3p0.max_statements", "500");    	
        
        try
        {
	        for(String name : C3P0Properties.getPropertyNames())
	        {
	        	String val = C3P0Properties.getProperty(name);
	        	if(!StringHelper.isEmpty(val))
	        		hibernateConf.setProperty(name, val);
	        }
        }
        catch(Throwable t)
        {
        	logger.log(Level.SEVERE, "Unable to load c3p0/hibernate/jdbc properties", t);
        }
        try {
        	hibernateConf.setProperty("hibernate.connection.url", ApplicationDBHelper.getDBURL());
        } catch (Exception e) {
        	String strMsg = "Unable to find hibernate.connection.url in properties file.";
        	logger.info(strMsg);
        	throw new DaqueryException(strMsg, e);
        }        
		
        StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder().applySettings(hibernateConf.getProperties());
        sessFact = hibernateConf.buildSessionFactory(ssrb.build());
        return sessFact;
	}
	
	public static void setErroredStartup(boolean val)
	{
		erroredStartup = val;
	}
}

package edu.pitt.dbmi.daquery.common.dao;

import java.util.HashMap;
import java.util.logging.Logger;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import edu.pitt.dbmi.daquery.common.domain.SQLDataSource;
import edu.pitt.dbmi.daquery.common.util.HibernateConfiguration;

public class SQLDataSourceDAO extends AbstractDAO {
	private final static Logger logger = Logger.getLogger(SQLDataSourceDAO.class.getName());
	
	public static SQLDataSource createSQLDataSource(HashMap<String, String> params) throws Exception {
		Session s = null;
    	try {
    		s = HibernateConfiguration.openSession();
    		s.getTransaction().begin();
    		
    		
    		SQLDataSource ds = new SQLDataSource();
    		ds.setConnectionUrl(params.get("url"));
    		ds.setName(params.get("name"));
    		ds.setUsername(params.get("username"));
    		ds.setPassword(params.get("password"));
    		
    		s.persist(ds);
    		s.getTransaction().commit();
    		
	        return ds;
	    
        } catch (HibernateException e) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(e.getLocalizedMessage());
            throw e;
        } finally {
        	if (s != null) {
	    		s.close();
	    	}
        }
	}
}

package edu.pitt.dbmi.daquery.common.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.HibernateException;
import org.hibernate.NonUniqueResultException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.pitt.dbmi.daquery.common.domain.DaqueryObject;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.common.util.HibernateConfiguration;



public abstract class AbstractDAO {

	private final static Logger log = Logger.getLogger(AbstractDAO.class.getName());
	
    private Session currentSession;
    private Transaction currentTransaction;

    public Session openCurrentSession() throws DaqueryException {
	currentSession = HibernateConfiguration.openSession();
	return currentSession;
    }

    public Session openCurrentSessionwithTransaction() throws DaqueryException {
	currentSession = HibernateConfiguration.openSession();
	currentTransaction = currentSession.beginTransaction();
	return currentSession;
    }

    public void closeCurrentSession() {
    	if (currentSession.isOpen()) {
    		currentSession.close();
    	}
    }

    public void closeCurrentSessionwithTransaction() {
    	if (currentTransaction.isActive()) {
    		currentTransaction.commit();
    	}
    	if (currentSession.isOpen()) {
    		currentSession.close();
    	}
    }

    public Session getCurrentSession() {
	return currentSession;
    }

    public void setCurrentSession(Session s) {
	currentSession = s;
    }

    public Transaction getCurrentTransaction() {
	return currentTransaction;
    }

    public void setCurrentTransaction(Transaction t) {
	currentTransaction = t;
    }

	public static void save(DaqueryObject obj) throws DaqueryException
	{
		Session session = null;
		Transaction t = null;
		try
		{
			session = HibernateConfiguration.openSession();
			t = session.beginTransaction();
			session.saveOrUpdate(obj);
			t.commit();
		}
		catch(Throwable tr)
		{
			if(t != null) t.rollback();
			tr.printStackTrace();
			String msg = "Unhandled exception while trying to save a daquery object.";
			log.log(Level.SEVERE, msg, t);
			throw new DaqueryException(msg, tr);			
		}
		finally
		{
			if(session != null) session.close();
		}
	}    
    
	/**
	 * Very generic query method that returns a List of objects from the database.
	 * @param namedQuery- the namedQuery to be executed
	 * @param params- the parameters to pass into the namedQuery (this may be null if no
	 * parameters are required by the namedQuery).
	 * @param logger- a logger instance to record any problems
	 * @return- a List of objects returned by a successful execution of namedQuery.  Returns
	 * empty list if no data is returned.
	 * @throws Exception
	 */
	
	//TODO: Add LIMIT and OFFSET options for query
	//check to see how to manage this in JPA
	//try this: https://stackoverflow.com/questions/25008472/pagination-in-spring-data-jpa-limit-and-offset
    public static <T> List<T> executeQueryReturnList(String namedQuery, List<ParameterItem> params, Logger logger) throws Exception {
    	logger.info("executing query: " + namedQuery);
    	Session s = null;
    	try {
    		s = HibernateConfiguration.openSession();
	        Query query = s.getNamedQuery(namedQuery);
	        if (params != null && !params.isEmpty()) {
	        	for (ParameterItem param : params) {
	        		query.setParameter(param.getParamName(), param.getParamObject());
	        	}
	        }
	        //it is best to return an empty list, not null
	        List<T> resultList = new ArrayList<T>();
	        resultList = (List<T>)query.list();
	        return resultList;
	    
        } catch (HibernateException he) {
    		logger.log(Level.SEVERE, "Error unable to connect to database.  Please check database settings.", he);
            throw he;
        } catch (Throwable t) {
    		logger.log(Level.SEVERE, "Error unable to connect to database.  Please check database settings.", t);
        	throw t;
        }
    	finally {
    		if (s != null) {
    			s.close();
    		}
    		
    	}
            
    }

    
	/**
	 * Very generic query method that returns a single object from the database.
	 * @param namedQuery- the namedQuery to be executed
	 * @param params- the parameters to pass into the namedQuery (this may be null if no
	 * parameters are required by the namedQuery).
	 * @param logger- a logger instance to record any problems
	 * @return- an object returned by a successful execution of namedQuery.  Returns
	 * null if no data is returned.
	 * @throws Exception
	 */
    public static <T> T executeQueryReturnSingle(String namedQuery, List<ParameterItem> params, Logger logger) throws Exception {
    	logger.info("executing query: " + namedQuery);
    	Session s = null;
    	try {
    		s = HibernateConfiguration.openSession();
	        Query query = s.getNamedQuery(namedQuery);
	        if (params != null && !params.isEmpty()) {
	        	for (ParameterItem param : params) {
	        		query.setParameter(param.getParamName(), param.getParamObject());
	        	}
	        }
	        T item = null;
	        item = (T)query.uniqueResult();
	        return item;
	    
        } catch (NonUniqueResultException nure) {
    		logger.info("Query Error: Expected a single result but more than one result returned for query:");
    		logger.info(namedQuery);
    		logger.info("Using these parameters: ");
        	for (ParameterItem param : params) {
        		logger.info(param.getParamName() + ": " + param.getParamObject().toString());
        	}    		    		
    		logger.info(nure.getLocalizedMessage());
            throw nure;
        } catch (HibernateException he) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(he.getLocalizedMessage());
            throw he;        	
    	} catch (Exception e) {
    		logger.info(e.getLocalizedMessage());
        	throw e;
        }
    	finally {
    		if (s != null) {
    			s.close();
    		}
    	}
            
    }

}

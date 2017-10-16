package edu.pitt.dbmi.daquery.dao;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;


public abstract class AbstractDAO {

	/**
	 * Very generic query method that returns a List of objects from the database.
	 * @param namedQuery- the namedQuery to be executed
	 * @param params- the parameters to pass into the namedQuery (this may be null if no
	 * parameters are required by the namedQuery).
	 * @param logger- a logger instance to record any problems
	 * @return- a List of objects returned by a successful execution of namedQuery.  Returns
	 * null if no data is returned.
	 * @throws Exception
	 */
	
	//TODO: Add LIMIT and OFFSET options for query
	//check to see how to manage this in JPA
	//try this: https://stackoverflow.com/questions/25008472/pagination-in-spring-data-jpa-limit-and-offset
    protected static <T> List<T> executeQueryReturnList(String namedQuery, List<ParameterItem> params, Logger logger) throws Exception {
    	logger.info("executing query: " + namedQuery);
    	EntityManagerFactory emf = null;
    	EntityManager em = null;
    	try {
	        emf = Persistence.createEntityManagerFactory("derby");
	        em = emf.createEntityManager();
	        Query query = em.createNamedQuery(namedQuery);
	        if (params != null && !params.isEmpty()) {
	        	for (ParameterItem param : params) {
	        		query.setParameter(param.getParamName(), param.getParamObject());
	        	}
	        }
	        List<T> queries = null;
	        queries = (List<T>)query.getResultList();
	        return queries;
	    
        } catch (PersistenceException pe) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(pe.getLocalizedMessage());
            throw pe;
        } catch (Exception e) {
    		logger.info(e.getLocalizedMessage());
        	throw e;
        }
    	finally {
    		if (em != null) {
    			em.close();
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
    protected static <T> T executeQueryReturnSingle(String namedQuery, List<ParameterItem> params, Logger logger) throws Exception {
    	logger.info("executing query: " + namedQuery);
    	EntityManagerFactory emf = null;
    	EntityManager em = null;
    	try {
	        emf = Persistence.createEntityManagerFactory("derby");
	        em = emf.createEntityManager();
	        Query query = em.createNamedQuery(namedQuery);
	        if (params != null && !params.isEmpty()) {
	        	for (ParameterItem param : params) {
	        		query.setParameter(param.getParamName(), param.getParamObject());
	        	}
	        }
	        T item = null;
	        item = (T)query.getSingleResult();
	        return item;
	    
        } catch (PersistenceException pe) {
    		logger.info("Error unable to connect to database.  Please check database settings.");
    		logger.info(pe.getLocalizedMessage());
            throw pe;
        } catch (Exception e) {
    		logger.info(e.getLocalizedMessage());
        	throw e;
        }
    	finally {
    		if (em != null) {
    			em.close();
    		}
    	}
            
    }

}

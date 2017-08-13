package edu.pitt.dbmi.daquery.rest;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import edu.pitt.dbmi.daquery.domain.DaqueryObject;
import edu.pitt.dbmi.daquery.domain.Inbound_Query;

public class AbstractEndpoint {

    /**
     * This inner class holds the database query parameter pairing for 
     * queries.  Each pairing is a string and object.
     * This object is stored in a List and then looped
     * when building the query.
     * @author devuser
     *
     */
	protected class ParameterItem {
		
		public String paramName;
		public Object paramObject;
		
		public ParameterItem(String name, Object obj) {
			this.paramName = name;
			this.paramObject = obj;
		}
		
		public String getParamName() {
			return this.paramName;
		}
		
		public Object getParamObject() {
			return this.paramObject;
		}
	}
	
	/**
	 * A simple method that converts an array of DaqueryObjects to a JSON array
	 * @param jsonList- the list of DaqueryObjects to represent as JSON
	 * @return a String representing a JSON array
	 */
	protected String toJsonArray(List<? extends DaqueryObject> jsonList) {
        String jsonString = "[";
        for (DaqueryObject obj : jsonList) {
        	jsonString = jsonString + obj.toJson() + ", ";
        }
        jsonString = jsonString.substring(0, jsonString.length()-2) + "]";
        
        //cover an empty list
        if (jsonList.isEmpty()) {
        	jsonString = "[ ]";
        }
        return jsonString;
		
	}
	
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
    protected <T> List<T> executeQueryReturnList(String namedQuery, List<ParameterItem> params, Logger logger) throws Exception {
    	logger.info("executing query: " + namedQuery);
    	EntityManagerFactory emf = null;
    	EntityManager em = null;
    	try {
	        emf = Persistence.createEntityManagerFactory("jpa-example");
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
    		if (emf != null) {
    			emf.close();
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
    protected <T> T executeQueryReturnSingle(String namedQuery, List<ParameterItem> params, Logger logger) throws Exception {
    	logger.info("executing query: " + namedQuery);
    	EntityManagerFactory emf = null;
    	EntityManager em = null;
    	try {
	        emf = Persistence.createEntityManagerFactory("jpa-example");
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
    		if (emf != null) {
    			emf.close();
    		}
    		
    	}
            
    }

}

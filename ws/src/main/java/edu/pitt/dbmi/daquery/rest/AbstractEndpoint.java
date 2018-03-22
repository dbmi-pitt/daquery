package edu.pitt.dbmi.daquery.rest;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.net.ssl.SSLContext;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.SslConfigurator;

import edu.pitt.dbmi.daquery.common.domain.DaqueryObject;
import edu.pitt.dbmi.daquery.common.domain.Site;
import edu.pitt.dbmi.daquery.common.util.WSConnectionUtil;


//TODO: Possible improvement: see if I can abstract the "getall", "getbyidentifier"
//, and create new object calls.  Try a factory to do this.  The factory takes 
//a class.  The class will convert the object name to the /{objectname} @Path item
public class AbstractEndpoint {

	private final static Logger absLog = Logger.getLogger(AbstractEndpoint.class.getName());
	
    /**
     * This inner class holds the database query parameter pairing for 
     * queries.  Each pairing is a string and object.
     * This object is stored in a List and then looped
     * when building the query.
     * @author devuser
     *
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
     */
	
	/**
	 * A simple method that converts an array of DaqueryObjects to a JSON array
	 * @param jsonList- the list of DaqueryObjects to represent as JSON
	 * @return a String representing a JSON array
	 */
	protected String toJsonArray(List<? extends DaqueryObject> jsonList) {
        //cover an empty list
        if (jsonList.isEmpty()) {
        	return "[]";
        }
        String jsonString = "[";
        for (DaqueryObject obj : jsonList) {
        	jsonString = jsonString + obj.toJson() + ", ";
        }
        jsonString = jsonString.substring(0, jsonString.length()-2) + "]";
        
        return jsonString;
		
	}
}

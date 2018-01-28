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
	
	/**
	 * This method executes a POST against a remote site.  If the connection is made via https, 
	 * the local site's keystore is examined.  The keystore file and keystore password are used 
	 * to create an SSL connection to the remote site.  For this call to work, the local site's
	 * certificate must be included in the remote site's keystore.  The alias for the certificate
	 * must match the local site's IP address or a resolvable server name.
	 * @param site- an object representing the remote site.
	 * @param serviceName- the portion of the URL to be contacted at the remote site (ex: sites/all)
	 * @param json- JSON encoded data to be POSTed
	 * @param securityToken- the current security token 
	 * @return- a Response object representing the data returned by the remote site
	 */
	protected static Response postJSONToRemoteSite(Site site, String serviceName, String json, String securityToken)
	{
		Client client = ClientBuilder.newClient();
		Entity<String> ent = Entity.entity(json, MediaType.APPLICATION_JSON_TYPE);
		
		Builder respBuilder = null;
		
		//handle an HTTPS connection
		if (site.getUrl().toLowerCase().startsWith("https")) {
			SslConfigurator sslConfig = SslConfigurator.newInstance()
					.trustStoreFile(WSConnectionUtil.getKeystorePath())
					.trustStorePassword(WSConnectionUtil.getKeystorePassword())
					.trustStoreType("JKS")
					.securityProtocol("SSL");

			SSLContext sslContext = sslConfig.createSSLContext();

			//redefine the client variable to include the sslContext
			client = ClientBuilder.newBuilder().sslContext(sslContext).build();
			respBuilder = client.target(site.getUrl() + "daquery/ws/" + serviceName).request(MediaType.APPLICATION_JSON);
		//handle an HTTP connection
		} else {
			respBuilder = client.target(site.getUrl() + "daquery/ws/" + serviceName).request(MediaType.APPLICATION_JSON);
		}
		if(securityToken != null)
			respBuilder = respBuilder.header("Authorization", securityToken);
		
		Response resp  = respBuilder.post(ent);
		
		return(resp);
	}
	
	/**
	 * This method performs the same function as the other getFromRemoteSite except it does not
	 * include the JWToken.If the connection is made via https, 
	 * the local site's keystore is examined.  The keystore file and keystore password are used 
	 * to create an SSL connection to the remote site.  For this call to work, the local site's
	 * certificate must be included in the remote site's keystore.  The alias for the certificate
	 * must match the local site's IP address or a resolvable server name.
	 * @param site- an object representing the remote site.
	 * @param serviceName- the portion of the URL to be contacted at the remote site (ex: sites/all)
	 * @param arguments- a Map of the parameters for the serviceName
	 * @return- a Response object representing the response from the remote site (most likely JSON)
	 * @throws UnsupportedEncodingException
	 */
	protected static Response getFromRemoteSite(Site site, String serviceName, Map<String, String> arguments) throws UnsupportedEncodingException
	{
		return(WSConnectionUtil.getFromRemoteSite(site, serviceName, arguments, null));
	}
}

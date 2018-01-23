package edu.pitt.dbmi.daquery.rest;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
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
import edu.pitt.dbmi.daquery.common.util.StringHelper;
import edu.pitt.dbmi.daquery.rest.util.WSConnectionUtil;


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
	
	
	//TODO: CDB change this to protected before deployment.  This was made public for testing.
	public static Response postJSONToRemoteSite(Site site, String serviceName, String json, String securityToken)
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
			System.out.println("IN SSL postJSONToRemoteSite.  Hitting URL: " + site.getUrl() + "daquery/ws/" + serviceName);
			respBuilder = client.target(site.getUrl() + "daquery/ws/" + serviceName).request(MediaType.APPLICATION_JSON);
		} else {
			System.out.println("IN HTTP postJSONToRemoteSite.  Hitting URL: " + site.getUrl() + "daquery/ws/" + serviceName);
			respBuilder = client.target(site.getUrl() + "daquery/ws/" + serviceName).request(MediaType.APPLICATION_JSON);
		}
		if(securityToken != null)
			respBuilder = respBuilder.header("Authorization", securityToken);
		
		Response resp  = respBuilder.post(ent);
		
		return(resp);
	}
	
	//TODO: CDB change this to protected before deployment.  This was made public for testing.
	public static Response getFromRemoteSite(Site site, String serviceName, Map<String, String> arguments) throws UnsupportedEncodingException
	{
		return(getFromRemoteSite(site, serviceName, arguments, null));
	}
	public static Response getFromRemoteSite(Site site, String serviceName, Map<String, String> arguments, String jwToken) throws UnsupportedEncodingException
	{
		Client client = ClientBuilder.newClient();
		Response resp = null;
		String getURL = buildGetUrl(site.getUrl(), serviceName, arguments);
		
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
		}
		Builder builder = client.target(getURL)
				.request(MediaType.APPLICATION_JSON); //.get();
		if(!StringHelper.isEmpty(jwToken))
			builder = builder.header("Authorization", "Bearer " + jwToken);
		resp = builder.get();
		return(resp);
	}

	private static String buildGetUrl(String siteUrl, String serviceName, Map<String, String> arguments) throws UnsupportedEncodingException {
		String retString = null;
		String args = "";
		if(arguments != null)
		{
			boolean first = true;
			for(String key : arguments.keySet())
			{
				String divide = "&";
				if(first)
				{
					divide = "?";
					first = false;
				}
				args = args + divide + URLEncoder.encode(key, "UTF-8") + "=" + URLEncoder.encode(arguments.get(key), "UTF-8");
			}
		}
//<<<<<<< HEAD
//		String url = site.getUrl() + "daquery/ws/" + serviceName + args;
//		Response resp = client.target(url).request(MediaType.APPLICATION_JSON).get();		
//		return(resp);
//	}		
//=======
		//add a trailing slash to the URL it is missing from the site URL
		if (!siteUrl.endsWith("/")) {
			siteUrl = siteUrl + "/";
		}
		String sName = serviceName.trim();
		if(sName.startsWith("/"))
			sName = sName.substring(1); 
		retString = siteUrl + "daquery/ws/" + sName + args;
		return retString;
	}
//>>>>>>> f6e8dd79f9d96b9b8eda41a4bd112d779c94e46a
}

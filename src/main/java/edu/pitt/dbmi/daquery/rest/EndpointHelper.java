package edu.pitt.dbmi.daquery.rest;

import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.ws.rs.core.Response;

import edu.pitt.dbmi.daquery.common.domain.Site;

/**
 * This class is an instantiation of the abstract AbstractEndpoint class
 * @author devuser
 *
 */
public class EndpointHelper extends AbstractEndpoint {

	public static Response postJSONToRemoteSite(Site site, String serviceName, String json, String securityToken) {
		return AbstractEndpoint.postJSONToRemoteSite(site, serviceName, json, securityToken);
	}
	
	public static Response getFromRemoteSite(Site site, String serviceName, Map<String, String> arguments) throws UnsupportedEncodingException {
		return AbstractEndpoint.getFromRemoteSite(site, serviceName, arguments, null); 
	}
	
	public static Response getFromRemoteSite(Site site, String serviceName, Map<String, String> arguments, String jwToken) throws UnsupportedEncodingException {
		return AbstractEndpoint.getFromRemoteSite(site, serviceName, arguments, jwToken);
	}


}

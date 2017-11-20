package edu.pitt.dbmi.daquery.util;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import edu.pitt.dbmi.daquery.common.domain.Network;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.StringHelper;

public class CentralServerClient
{
	private static final String centralTopPath = "daquery-central";
	private Client centralClient = ClientBuilder.newClient();
	private String baseUrl = null;
	
	public Network [] getAvailableNetworks(String siteId)
	{
		Response resp = centralClient.target(baseURL() + "availableNetworks")
		             .path(siteId)
					 .request(MediaType.APPLICATION_JSON)
					 .get();
		
		return(null);
	}
	
	private String baseURL()
	{
		if(baseUrl == null)
			baseUrl = StringHelper.ensureTrailingSlash(AppProperties.getCentralServerURL()) + StringHelper.ensureTrailingSlash(centralTopPath);
		return(baseUrl);
	}
}

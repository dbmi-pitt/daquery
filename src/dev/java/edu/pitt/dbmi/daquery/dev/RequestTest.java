package edu.pitt.dbmi.daquery.dev;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import edu.pitt.dbmi.daquery.common.domain.Network;
import edu.pitt.dbmi.daquery.common.domain.Site;
import edu.pitt.dbmi.daquery.common.domain.inquiry.DaqueryRequest;
import edu.pitt.dbmi.daquery.common.domain.inquiry.Inquiry;
import edu.pitt.dbmi.daquery.common.domain.inquiry.SQLQuery;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.JSONHelper;
import edu.pitt.dbmi.daquery.common.util.ResponseHelper;
import edu.pitt.dbmi.daquery.dao.DaqueryRequestDAO;

public class RequestTest
{
	public static void main(String [] args) throws Exception
	{
		AppProperties.setDevHomeDir("/home/devuser/dq-data");
		Client client = ClientBuilder.newClient();
/*		DaqueryRequest ir =  PopulateDevData.assembleOutgoingRequest();
		System.out.println(ir.getRequestId());
		ir.getInquiry().setDataType("SQL_QUERY");
		ir.getRequester().setUtype("FULL");
		ir.getInquiry().getAuthor().setUtype("FULL"); */
		
		DaqueryRequest ir = new DaqueryRequest();
		SQLQuery iq = new SQLQuery();
		iq.setDataType("SQL_QUERY");
		iq.setAggregate(true);
		iq.setCode("select count(*) from patient_dimension");
		Network net = new Network();
		net.setNetworkId("abcd-efgh-ijkm-nopq");
		ir.setNetwork(net);
		String siteId = "20b23b5c-61ad-44eb-8eef-886adcced18e";
		Site rSite = new Site(siteId);
		ir.setRequestSite(rSite);
		ir.setInquiry(iq);
		String token = ResponseHelper.issueToken("41050780-5a8a-4a24-af00-f635cb9d90e1", siteId);
		
		
//		DaqueryRequest ir = DaqueryRequestDAO.getRequestById("84a64748-a928-4891-b16f-d3564d478b5f");
		String json = JSONHelper.toJSON(ir);
		System.out.println(json);
		Entity<String> ent = Entity.entity(json, MediaType.APPLICATION_JSON_TYPE);
		//Response resp = client.target("http://localhost:8080/daquery/ws/hello").request(MediaType.TEXT_PLAIN).get();
		Response resp = client.target("http://localhost:8080/daquery/ws/request")
						                    .request(MediaType.APPLICATION_JSON).header("Authorization", token).post(ent);
				                    //.post(ent, ClientResponse.class); 
		System.out.println(resp.readEntity(String.class));
		//AppProperties.setDevHomeDir("/opt/apache-tomcat-6.0.53");
		/*DaqueryEndpoint de = new DaqueryEndpoint();
		System.out.println(de.isSiteSetup());
		Response r = de.setupSite("bill-dev", "abc123"); */		
	}
}

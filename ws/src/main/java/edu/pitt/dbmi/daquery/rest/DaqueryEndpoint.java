package edu.pitt.dbmi.daquery.rest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.ProcessingException;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.client.Client;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.UriInfo;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import edu.pitt.dbmi.daquery.common.dao.AbstractDAO;
import edu.pitt.dbmi.daquery.common.dao.DaqueryRequestDAO;
import edu.pitt.dbmi.daquery.common.dao.DaqueryUserDAO;
import edu.pitt.dbmi.daquery.common.dao.NetworkDAO;
import edu.pitt.dbmi.daquery.common.dao.ResponseDAO;
import edu.pitt.dbmi.daquery.common.dao.RoleDAO;
import edu.pitt.dbmi.daquery.common.dao.SQLQueryDAO;
import edu.pitt.dbmi.daquery.common.dao.SiteDAO;
import edu.pitt.dbmi.daquery.common.domain.DaqueryUser;
import edu.pitt.dbmi.daquery.common.domain.DataModel;
import edu.pitt.dbmi.daquery.common.domain.DecodedErrorInfo;
import edu.pitt.dbmi.daquery.common.domain.EmailContents;
import edu.pitt.dbmi.daquery.common.domain.ErrorInfo;
import edu.pitt.dbmi.daquery.common.domain.JsonWebToken;
import edu.pitt.dbmi.daquery.common.domain.Network;
import edu.pitt.dbmi.daquery.common.domain.NetworkAndCode;
import edu.pitt.dbmi.daquery.common.domain.Site;
import edu.pitt.dbmi.daquery.common.domain.SiteConnection;
import edu.pitt.dbmi.daquery.common.domain.SiteStatus;
import edu.pitt.dbmi.daquery.common.domain.TokenManager;
import edu.pitt.dbmi.daquery.common.domain.TokenManager.KeyedJWT;
import edu.pitt.dbmi.daquery.common.domain.UserInfo;
import edu.pitt.dbmi.daquery.common.domain.inquiry.DaqueryRequest;
import edu.pitt.dbmi.daquery.common.domain.inquiry.DaqueryResponse;
import edu.pitt.dbmi.daquery.common.domain.inquiry.Fileset;
import edu.pitt.dbmi.daquery.common.domain.inquiry.QueryInfo;
import edu.pitt.dbmi.daquery.common.domain.inquiry.ResponseStatus;
import edu.pitt.dbmi.daquery.common.domain.inquiry.SQLCode;
import edu.pitt.dbmi.daquery.common.domain.inquiry.SQLQuery;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.AppSetup;
import edu.pitt.dbmi.daquery.common.util.DaqueryErrorException;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.common.util.EmailUtil;
import edu.pitt.dbmi.daquery.common.util.FileHelper;
import edu.pitt.dbmi.daquery.common.util.HibernateConfiguration;
import edu.pitt.dbmi.daquery.common.util.JSONHelper;
import edu.pitt.dbmi.daquery.common.util.ResponseHelper;
import edu.pitt.dbmi.daquery.common.util.StringHelper;
import edu.pitt.dbmi.daquery.common.util.WSConnectionUtil;
import edu.pitt.dbmi.daquery.common.util.ZipUtil;
import edu.pitt.dbmi.daquery.queue.QueueManager;
import edu.pitt.dbmi.daquery.queue.ResponseTask;
import edu.pitt.dbmi.daquery.queue.TaskQueue;
import edu.pitt.dbmi.daquery.sql.AggregateSQLAnalyzer;
import edu.pitt.dbmi.daquery.sql.ReturnColumn;
import edu.pitt.dbmi.daquery.sql.ReturnFieldsAnalyzer;
import edu.pitt.dbmi.daquery.sql.domain.DeIdTag;
import io.jsonwebtoken.ExpiredJwtException;

@Path("/")
public class DaqueryEndpoint extends AbstractEndpoint {
	private final static Logger logger = Logger.getLogger(DaqueryEndpoint.class.getName());

	@Context
	private UriInfo uriInfo;

	@Context
	SecurityContext securityContext;

	@Context
	HttpHeaders httpHeaders;

	public static void main(String[] args) throws Exception {
		/*
		 * Client client = ClientBuilder.newClient();
		 * 
		 * Response rVal = client.target(
		 * "http://localhost:8080/daquery-central/availableNetworks?site-id=20b23b5c-61ad-44eb-8eef-886adcced18e"
		 * ).request(MediaType.APPLICATION_JSON).get();
		 * System.out.println(rVal);
		 */
		// System.out.println(callCentralServerAuth("bill-dev", "abc123"));
		/*
		 * InquiryRequest iq = PopulateDevData.createFullOutgoingRequest();
		 * String json = iq.toJson(); System.out.println(json);
		 */

		AppProperties.setDevHomeDir("/home/devuser/dq-data");

	}

	private static boolean containsSiteWhoIQuery(String networkId, String siteId) throws DaqueryException {
		Network net = NetworkDAO.getNetworkById(networkId);
		if (net == null)
			return (false);
		SiteConnection conn = net.findOutgoingSite(siteId);
		if (conn != null && conn.getStatusValue() != null && conn.getStatusValue().equals(SiteStatus.CONNECTED))
			return (true);

		return (false);
	}

	@GET
	@Path("/hello")
	@Produces(MediaType.TEXT_PLAIN)
	public Response helloWorld() {
		return (ResponseHelper.getBasicResponse(200, "Hello World"));
	}

	/**
	 * Send and error message for testing purposes.
	 * 
	 * @param message
	 *            A test error message.
	 * @param responseCode
	 *            An HTML error response code in the range 400 <= x < 600
	 * @return
	 */
	@GET
	@Path("/error")
	@Produces(MediaType.APPLICATION_JSON)
	public Response sendError(@DefaultValue("") @QueryParam("messge") String message,
			@DefaultValue("") @QueryParam("response-code") String responseCode) {
		int respCode = 500;
		if (!StringHelper.isEmpty(responseCode)) {
			try {
				respCode = Integer.parseInt(responseCode);
				if (respCode < 400 || respCode >= 600)
					return (ResponseHelper.getErrorResponse(400, "Response code must be in the range 400 <= x < 600",
							null, null));
			} catch (Exception e) {
				return (ResponseHelper.getErrorResponse(500, "Invalid response code " + responseCode, null, e));
			}
		}
		String msg = (StringHelper.isEmpty(message)) ? "This is some descriptive text about what the error is."
				: message;
		String longMsg = "This is a longer, more descriptive version of the other message.  It could be blank, so be carefull about output format. \n"
				+ msg + "\n\n" + msg + "\n\n " + msg;
		try {
			throw new DaqueryException("Generated error");
		} catch (DaqueryException ex) {
			return (ResponseHelper.getErrorResponse(respCode, msg, longMsg, ex));
		}
	}

	/**
	 * assume this method is for testing? CDB- Yes, this is for testing
	 */
	@POST
	@Path("/echopost")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response echoPost(Site data) {
		// I know you are, but what am I?
		return Response.ok(200).entity(data.toJson()).build();
	}

	/**
	 * Checks SQL code for valid aggregate or table return values. Two
	 * parameters, in JSON are required: networkUuid and sqlCode.
	 * 
	 * @param networkUuid
	 *            The uuid of the network where this will be run
	 * @param sqlCode
	 *            The SQL code to check
	 * @return
	 */
	@POST
	@Path("/check-sql")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response checkSql(NetworkAndCode netAndCode) {
		try {
			String sql = netAndCode.getSqlCode();
			if (StringHelper.isEmpty(sql))
				return (ResponseHelper.getErrorResponse(400, "No code provided.", null, null));
			QueryInfo info = new QueryInfo();
			Network net = NetworkDAO.queryNetwork(netAndCode.getNetworkUuid());
			DataModel model = net.getDataModels().iterator().next();
			AggregateSQLAnalyzer aggregateAnalyzer = new AggregateSQLAnalyzer(sql, model);
			if (aggregateAnalyzer.isRejected()) {
				ReturnFieldsAnalyzer rfAnalyzer = new ReturnFieldsAnalyzer(sql, model);
				if (rfAnalyzer.isRejected()) {
					info.setRejected(true);
					info.setRejectionMessage(rfAnalyzer.getRejectionMessage());
				} else {
					info.setType("TABLE_EXPORT");
					if (rfAnalyzer.hasWarnings()) {
						info.setWarnings(true);
						for (String warning : rfAnalyzer.getWarningList())
							info.addWarningMessage(warning);
					}
					for (ReturnColumn rc : rfAnalyzer.getReturnColumns()) {
						String name = rc.column.getDisplayName();
						DeIdTag tag = rc.deidTag;
						if (tag == null) {
							info.setDeidUnresolved(true);
							info.addReturnVal("<b><font color=\"red\">" + name
									+ ": WARNING: column does not have any de-identification information.</font></b>");
						} else {
							String boldName = "<b>" + name + ":</b> ";
							if (tag.isBirthdate())
								info.addReturnVal(boldName + "will be deidentified as a birth day");
							else if (tag.isDateShift())
								info.addReturnVal(boldName + "will be deidentified by date shifting");
							else if (tag.isId())
								info.addReturnVal(boldName + "will be deidentified by creating a serial id");
							else if (tag.isZipCode())
								info.addReturnVal(boldName + "will be deidentifed by converting to a three digit zip");
							else if (tag.isPhi()) {
								info.addReturnVal("<b><font color=\"red\">" + name
										+ ": WARNING: column is marked as phi, but contains no information about deidentification.</font></b>");
								info.setDeidUnresolved(true);
							} else
								info.addReturnVal(boldName + "will not be deidentifed.");
						}
					}
				}
			} else
				info.setType("AGGREGATE");
			return (ResponseHelper.getJsonResponseGen(200, info));
		} catch (Throwable t) {
			logger.log(Level.SEVERE, "An unexpeced error occurred while checking the sql.", t);
			return (ResponseHelper.getErrorResponse(500, "An unexpected error occurred while checking your SQL code.",
					null, t));
		}

	}

	@GET
	@Path("/display-version")
	@Produces(MediaType.TEXT_PLAIN)
	public Response version() {
		return (ResponseHelper.getBasicResponse(200, AppProperties.getDisplayVersion()));
	}

	@GET
	@Path("/check-update")
	@Produces(MediaType.TEXT_PLAIN)
	public Response checkUpdate() {
		try {
			return ResponseHelper.getBasicResponse(200, "{\"status\": \"" + AppProperties.getDBProperty("update_status")
					+ "\", \"message\": \"" + AppProperties.getDBProperty("update_message") + "\"}");
		} catch (DaqueryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ResponseHelper.getErrorResponse(500, "Cannot get update message",
				"Check the application error logs for more information.", null);
	}

	/**
	 * Check if the site database is set up or not.
	 * 
	 * @return A 200 response with a Y or N depending on whether the database is
	 *         set up (Y) or not (N). returns a 500 response if the database
	 *         state can't be determined.
	 */
	@GET
	@Path("/is-site-setup")
	@Produces(MediaType.TEXT_PLAIN)
	public Response isSiteSetup() {
		try {
			int dbStatus = AppSetup.getDBStatus();
			if (dbStatus == AppSetup.DBSTATUS_ALL_GOOD)
				return (ResponseHelper.getBasicResponse(200, "Y"));
			else if (dbStatus == AppSetup.DBSTATUS_NONEXISTENT || dbStatus == AppSetup.DBSTATUS_EMPTY)
				return (ResponseHelper.getBasicResponse(200, "N"));
			else
				return (ResponseHelper.getErrorResponse(500, "The application database is in an indeterminate state.",
						"Check the application error logs for more information.  You may need to delete the database at tomcat/conf/daquery-db and set the site up over again.",
						null));
		} catch (Throwable t) {
			return (ResponseHelper.getErrorResponse(500,
					"Unexpected error while checking to see if the site is set up.", null, t));
		}
	}

	/**
	 * Get a list of networks with associated sites from the central server that
	 * have not yet been set up for this site to query from.
	 * 
	 * @param only-non-connected-networks
	 *            - An optional parameter to exclude any networks (and
	 *            associated sites, whether connected or not) that are already
	 *            connected. Valid values are "true" or "yes". Any other value
	 *            or the absence of this parameter will trigger returning all
	 *            networks.
	 * 
	 * @return A list of NetworkInfo objects encoded as json
	 */
	@Secured(localRoles = {"ADMIN"})
	@GET
	@Path("/available-networks-to-query/")
	@Produces(MediaType.APPLICATION_JSON)
	public Response availableNetworks(
			@DefaultValue("false") @PathParam("only-non-connected-networks") String nonConnectedNetsOnly) {
		boolean nonConnNetsOnly = false;
		List<String> connectedNetworkIds = new ArrayList<String>();
		Response resp = null;
		try {
			String c = nonConnectedNetsOnly.trim().toUpperCase();
			if (c.equals("YES") || c.equals("TRUE"))
				nonConnNetsOnly = true;

			Map<String, String> idParam = new HashMap<String, String>();
			idParam.put("site-id", AppProperties.getDBProperty("site.id"));
			resp = WSConnectionUtil.centralServerGet("availableNetworks", idParam);
			if (resp.getStatus() == 200) {
				if (nonConnNetsOnly) {
					List<Network> nets = NetworkDAO.queryAllNetworks();
					for (Network net : nets)
						connectedNetworkIds.add(net.getNetworkId());
				}
				String json = resp.readEntity(String.class);
				Network[] netsFromCentral = JSONHelper.gson.fromJson(json, Network[].class);
				// List<Network> nets = NetworkDAO.queryAllNetworks();
				List<Site> sitesToRemove = new ArrayList<Site>();
				for (Network nFromCentral : netsFromCentral) {
					if (!connectedNetworkIds.contains(nFromCentral.getNetworkId())) {
						for (SiteConnection sc : nFromCentral.getSiteConnections()) {
							if (SiteConnection.isOutgoing(sc) && sc.getSite() != null) {
								if (containsSiteWhoIQuery(nFromCentral.getNetworkId(), sc.getSite().getSiteId()))
									sitesToRemove.add(sc.getSite());
							}
						}
						for (Site sr : sitesToRemove) {
							nFromCentral.removeOutgoingConnection(sr);
						}
						sitesToRemove.clear();
					}
				}
				List<Network> rlist = new ArrayList<Network>();
				for (Network n : netsFromCentral) {
					if (!connectedNetworkIds.contains(n.getNetworkId()))
						rlist.add(n);
				}
				return (ResponseHelper.getJsonResponseGen(200, rlist));
			} else {
				Response rVal = ResponseHelper.wrapServerResponse(resp, "Central Server");
				return (rVal);
			}
		} catch (DaqueryErrorException de) {
			if (de != null && de.getErrorInfo() != null) {
				logger.log(Level.SEVERE, de.getErrorInfo().getDisplayMessage(), de);
				return (ResponseHelper.getErrorResponse(500, de.getErrorInfo().getDisplayMessage(),
						de.getErrorInfo().getLongMessage(), de.getCause()));
			} else {
				logger.log(Level.SEVERE, de.getMessage(), de);
				return (ResponseHelper.getErrorResponse(500,
						"An unhandled error occurred while retrieving available network information.", null, de));
			}

		} catch (Throwable t) {
			logger.log(Level.SEVERE,
					"An unexpeced error occurred while obtaining a list of available networks and sites from the central server.",
					t);
			return (ResponseHelper.getErrorResponse(500, "An unexpected error occurred.",
					"An unexpected error occurred while obtaining a list of avaiilable networks and sites from the central server.  See the appication logs for more information.",
					t));
		} finally {
			if (resp != null)
				resp.close();
		}
	}

	/**
	 * Set up the application database for a local site and registers the site
	 * with the central server. Requires a site name and key to authenticate
	 * against the DaqueryCentral server.
	 * 
	 * @param siteName
	 *            DaqueryCentral registered site name.
	 * @param siteKey
	 *            DaqueryCentral key that matches
	 * @param adminEmail
	 *            email address for initial admin account
	 * @param adminPwd
	 *            password for initial admin account
	 * 
	 * @return On success a 200 http response with the site-id encoded in json.
	 *         On failure a 500 http response.
	 */

	@GET
	@Path("setupSite")
	public Response setupSite(@DefaultValue("") @QueryParam("site-name") String siteName,
			@DefaultValue("") @QueryParam("site-key") String siteKey,
			@DefaultValue("") @QueryParam("admin-email") String adminEmail,
			@DefaultValue("") @QueryParam("admin-pwd") String adminPwd,
			@DefaultValue("") @QueryParam("admin-real-name") String adminRealName) {
		try {
			if (!AppProperties.isDebugMode() && uriInfo.getRequestUri().getScheme() != "https") {
				return (ResponseHelper.getErrorResponse(500,
						"This service must be accessed via https only.", "A call to "
								+ uriInfo.getRequestUri().toString() + " was made.  This needs to be done via https.",
						null));
			}

			if (StringHelper.isEmpty(siteName) || StringHelper.isEmpty(adminEmail) || StringHelper.isEmpty(siteKey)
					|| StringHelper.isEmpty(adminPwd)) {
				String longMsg = "Parameters site-name, site-key, admin-email and admin-pwd are required.  Provided site-name: "
						+ siteName + " admin-email: " + adminEmail + " site-key:" + siteKey + " admin-pwd:"
						+ ((StringHelper.isEmpty(adminPwd)) ? "Not Provided" : "Provided");
				return (ResponseHelper.getErrorResponse(400, "Not all parameters provided.", longMsg, null));
			}

			String homeDir = AppProperties.getHomeDirectory();
			if (StringHelper.isEmpty(homeDir)) {
				logger.log(Level.SEVERE,
						"A configured database directory was not found.  This directory is the Tomcat conf directory which is found with the global environment variable CATALINA_HOME.");
				return (ResponseHelper.getErrorResponse(500, "Unable to find a configured database helper.",
						"A configured database was not found.  It is possible that the CATALINA_HOME environment variable needs to be set globaly.",
						null));
			}
			String confDir = AppProperties.getConfDirectory();
			File confDirF = new File(confDir);
			if (!confDirF.exists()) {
				java.nio.file.Path p = Paths.get(confDir);
				try {
					Files.createDirectories(p);
				} catch (Throwable t) {
					logger.log(Level.SEVERE, "Unable to create database directory: " + confDir, t);
					return (ResponseHelper.getErrorResponse(500, "Unable to create database directory.",
							"Ask your systems admin to check the log files.", t));
				}
			}
			if (!confDirF.exists() || !confDirF.canWrite()) {
				logger.log(Level.SEVERE, "The database directory, " + confDir + "does not exist or is not writable.");
				return (ResponseHelper.getErrorResponse(500, "Unable to write to the configured database directory.",
						" The directory " + confDir + " may not be writable or does not exist.", null));
			}

			int dbStatus = AppSetup.getDBStatus();
			if (dbStatus == AppSetup.DBSTATUS_NONEXISTENT) {
				Response centralAuthResponse = WSConnectionUtil.callCentralServerAuth(siteName, siteKey);
				if (centralAuthResponse.getStatus() != 200)
					return (centralAuthResponse);

				// add the initial values from the central server
				String jsonval = centralAuthResponse.readEntity(String.class);
				Map<String, String> jmap = JSONHelper.toMap(jsonval);
				if (AppSetup.initialSetup(jmap.get("site-id"), siteName, jmap.get("site-url"), adminEmail, adminPwd,
						adminRealName)) {

					String key = jmap.get("new-site-key");
					String siteId = jmap.get("site-id");
					AppProperties.setDBProperty("central.site.key", key);
					AppProperties.setDBProperty("site.id", siteId);
					AppProperties.setDBProperty("site.name", siteName);
					AppProperties.setTaskQueueMaxLength(TaskQueue.MAIN_QUEUE, 4);
					AppProperties.setTaskQueueMaxLength(TaskQueue.EXPORT_QUEUE, 1);
					AppProperties.setDeliverData(false);
					AppProperties.setThreeDigitZip(true);
					AppProperties.setDateShift(true);
					AppProperties.setFileOutputDir(System.getProperty("java.io.tmpdir"));
					AppProperties.setLocalDeliveryDir(System.getProperty("java.io.tmpdir"));
					AppProperties.setTrackingDir(System.getProperty("java.io.tmpdir"));

					AppProperties.setTempFileExportDir(AppProperties.getTempFileExportDir());
					AppProperties.setCasePerFile(AppProperties.getCasePerFile());
					AppProperties.setCentralURL(AppProperties.getCentralURL());
					AppProperties.setNotList(AppProperties.getNotList());

					DaqueryUser currentUser = DaqueryUserDAO.getAdminUser();
					Map<String, Object> addtionalVal = new HashMap<String, Object>();
					addtionalVal.put("user", currentUser);
					return (ResponseHelper.getTokenResponse(200, null, currentUser.getId(), siteId, null,
							addtionalVal));
				} else
					return (ResponseHelper.getErrorResponse(500,
							"An error occurred while initializing the application database.",
							"The error was unreported. Check the application logs for more information.", null));
			} else {
				String msg;
				if (dbStatus == AppSetup.DBSTATUS_EMPTY) {
					msg = "The application database was created, but is now empty.  Try deleting and setting up again.  The database is at: "
							+ AppProperties.getDBDir();
				} else if (dbStatus == AppSetup.DBSTATUS_ALL_GOOD) {
					msg = "This site has already been set up.";
				} else if (dbStatus == AppSetup.DBSTATUS_NEWER_VERSION || dbStatus == AppSetup.DBSTATUS_OLD_VERSION) {
					msg = "This site already exists and is a different version.  The application database is located at: "
							+ AppProperties.getDBDir();
				} else {
					msg = "This site cannot be set up.  The database is in an unidentifiable state.  You may need to delete the database in tomcat/conf/daquery-db and start over.";
				}
				return (ResponseHelper.getErrorResponse(500, "The database could not be set up.", msg, null));
			}
		} catch (Throwable t) {
			logger.log(Level.SEVERE, "An unexpected error occurred while setting up the site.", t);
			return (ResponseHelper.getErrorResponse(500, "An unexpected error occurred while setting up the site.",
					"More information may be available in the application logs.", t));
		}
	}

	@POST
	@Secured(localRoles={"ADMIN","STEWARD"},remoteRoles={"DATA_QUERIER","AGGREGATE_QUERIER"})
	@Path("request")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response request(DaqueryRequest request) throws DaqueryException {

        
        Response response = null;
		try {
			if (request == null || request.getRequestSite() == null || request.getRequestSite().getSiteId() == null) {
				String msg = "A request site with a valid request site UUID is required.";
				DaqueryResponse eResp = assembleErrorResponse(msg, null);
				return (ResponseHelper.getErrorResponse(400, msg, null, null, eResp));
			}

			if (request.getNetwork() == null || StringHelper.isBlank(request.getNetwork().getNetworkId())) {
				String msg = "A request must specify a valid network with a network id.";
				DaqueryResponse eResp = assembleErrorResponse(msg, null);
				return (ResponseHelper.getErrorResponse(400, msg, null, null, eResp));
			}

			if (request.getInquiry() == null || request.getInquiry().getDataType() == null) {
				String msg = "A request must have a valid inquiry attached with an associated data type ";
				DaqueryResponse eResp = assembleErrorResponse(msg, null);
				return (ResponseHelper.getErrorResponse(400, msg, null, null, eResp));
			}
			if (request.getRequestId() == null)
				request.setRequestId(UUID.randomUUID().toString());

			if (request.getInquiry().getInquiryId() == null)
				request.getInquiry().setInquiryId(UUID.randomUUID().toString());

			String requestSiteId = request.getRequestSite().getSiteId();
			Site mySite = SiteDAO.getLocalSite();

			Site requestSite = SiteDAO.getSiteByNameOrId(requestSiteId);
			if (requestSite == null) {
				String msg = "A request must have a valid inquiry attached with an associated data type ";
				DaqueryResponse eResp = assembleErrorResponse(msg, null);
				return (ResponseHelper.getErrorResponse(403, msg,
						"The querying site with id " + requestSiteId + " is not configured to work with this site.",
						null, eResp));
			}
			request.setRequestSite(requestSite);

			if (request.getRequesterSite() != null && (!StringHelper.isEmpty(request.getRequesterSite().getSiteId()))) {
				String requesterSiteId = request.getRequesterSite().getSiteId();
				Site requesterSite = SiteDAO.getSiteByNameOrId(requesterSiteId);
				if (requesterSite == null) {
					String msg = "The requester site is invalid or cannot be found";
					DaqueryResponse eResp = assembleErrorResponse(msg, null);
					return (ResponseHelper.getErrorResponse(403, msg, "The querying site with id " + requesterSiteId
							+ " is not configured to work with this site.", null, eResp));
				}
				request.setRequesterSite(requesterSite);
			}

			Network net = NetworkDAO.getNetworkById(request.getNetwork().getNetworkId());
			if (net == null) {
				String msg = "The network is not authorized to query.";
				DaqueryResponse eResp = assembleErrorResponse(msg, null);
				return (ResponseHelper
						.getErrorResponse(403, msg,
								"The network with id " + request.getNetwork().getNetworkId()
										+ " being queried within is not configured to work with this site.",
								null, eResp));
			}
			request.setNetwork(net);
			request.getInquiry().setNetwork(net);
			String securityToken = httpHeaders.getHeaderString("Authorization");
			//TokenManager tm = TokenManager.getTokenManager();
			//KeyedJWT kw = tm.getToken(securityToken.substring("Bearer".length()).trim());
			//JsonWebToken jwt = kw.getToken();
			//jwt.validate();
			//String requesterId = jwt.getUserId();
	    	Map<String,Object> claims = WSConnectionUtil.extractClaims(securityToken);
	    	String requesterId = (String)claims.get("sub");


			boolean isLocalRequester = DaqueryUserDAO.isLocalUserId(requesterId);
			if (isLocalRequester)
				request.setRequesterSite(mySite);

			UserInfo uInfo = DaqueryUserDAO.getUserInfo(requesterId);

			if (request.getInquiry().isAggregate()) {
				// *****************
				// Aggregate Request
				// *****************
				if (!isLocalRequester) {
					// Local Request (From Site)
					return handleAggregateRequestFromSite(uInfo, request, requesterId, net);
				} else {
					request.setRequester(uInfo);
					if (mySite.getSiteId().equals(requestSiteId)) {
						// Local Request (From UI)
						return handleLocalAggregateRequestFromUI(request, requesterId, net, uInfo);
					} else {
						// Remote Request (From UI)
						return handleRemoteAggregateRequestFromUI(request, response, requestSite, securityToken);
					}
				}

			} else if (request.getInquiry().isData()) {
				// ************
				// Data Request
				// ************
				Response rVal = null;
				if (!isLocalRequester) {
					// Local Request (From Site)
					rVal = handleDataRequestFromSite(uInfo, request, requesterId, net);
					if (rVal != null) {
						EmailContents email = new EmailContents();
						email.subject = "Data Request Submitted";
						String emailHeader = EmailUtil.generateEmailHeader(net.getName(),
								request.getRequesterSite().getName(), request.getInquiry().getInquiryName());
						email.message = emailHeader;
						email.message += "A data request in network " + request.getNetwork().getName() + " from "
								+ request.getRequesterSite().getName() + " was submitted to your site: "
								+ request.getRequestSite().getName()
								+ ".<br /><br /> Please log into Daquery and go to Incoming Requests to review the request.";
						for (DaqueryUser u : request.getNetwork().getContacts()) {
							email.toAddresses.add(u.getEmail());
						}
						if (email.toAddresses.size() == 0) {
							for (DaqueryUser u : DaqueryUserDAO.getSiteContacts()) {
								email.toAddresses.add(u.getEmail());
							}
						}
						if (email.toAddresses.size() == 0) {
							email.toAddresses.add(mySite.getAdminEmail());
						}
						request.getRequesterSite();
						EmailUtil.sendEmail(email);
					}
				} else {
					request.setRequester(uInfo);
					if (mySite.getSiteId().equals(requestSiteId)) {
						// Local Request (From UI)
						rVal = handleLocalDataRequestFromUI(request, requesterId, net, uInfo);
					} else {
						// Remote Request (From UI)
						rVal = handleRemoteDataRequestFromUI(request, response, requestSite, securityToken);
					}
				}
				return (rVal);
			} // else if (request.getInquiry().isTable()) {
			else {
				// *************
				// Table Request
				// *************
				Response rVal = null;
				if (!isLocalRequester) {
					// Local Request (From Site)
					rVal = handleTableRequestFromSite(uInfo, request, requesterId, net);
					if (rVal != null) {
						EmailContents email = new EmailContents();
						email.subject = "Data Request Submitted";
						email.message = "A data request in network " + request.getNetwork().getName() + " from "
								+ request.getRequesterSite().getName() + " was submitted to your site: "
								+ request.getRequestSite().getName()
								+ ".<br /><br /> Please log into Daquery and go to Incoming Requests to review the request.";
						for (DaqueryUser u : request.getNetwork().getContacts()) {
							email.toAddresses.add(u.getEmail());
						}
						if (email.toAddresses.size() == 0) {
							for (DaqueryUser u : DaqueryUserDAO.getSiteContacts()) {
								email.toAddresses.add(u.getEmail());
							}
						}
						if (email.toAddresses.size() == 0) {
							email.toAddresses.add(mySite.getAdminEmail());
						}
						request.getRequesterSite();
						EmailUtil.sendEmail(email);
					}
				} else {
					request.setRequester(uInfo);
					if (mySite.getSiteId().equals(requestSiteId)) {
						// Local Request (From UI)
						rVal = handleLocalTableRequestFromUI(request, requesterId, net, uInfo);
					} else {
						// Remote Request (From UI)
						rVal = handleRemoteTableRequestFromUI(request, response, requestSite, securityToken);
					}
				}
				return (rVal);
			}
		} catch (Throwable t) {
			String msg = "An unexpected error occurred while trying process an InquiryRequest.";
			logger.log(Level.SEVERE, msg, t);
			return (ResponseHelper.getErrorResponse(500, "An unexpected error occurred",
					msg + "Check the server logs at site: " + AppProperties.getDBProperty("site.name")
							+ " for further information.",
					t));
		} finally {
			if (response != null)
				response.close();
		}

	}

	private DaqueryResponse assembleErrorResponse(String message, Throwable t) throws DaqueryException {
		DaqueryResponse response = new DaqueryResponse(true);
		response.setStatusEnum(ResponseStatus.ERROR);
		response.setErrorMessage(message);
		if (t != null)
			response.setStackTrace(StringHelper.stackToString(t));
		ResponseDAO.saveOrUpdate(response);
		return (response);
	}

	private HashMap<String, Object> wrapResponse(DaqueryResponse response) {
		HashMap<String, Object> responseWrapper = new HashMap<String, Object>();
		responseWrapper.put("response", response);
		return (responseWrapper);
	}

	@GET
	@Secured(localRoles={"ADMIN","STEWARD","VIEWER"},remoteRoles={"DATA_QUERIER","AGGREGATE_QUERIER"})
	@Path("/response/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response response(@PathParam("id") String id) {
		if (StringHelper.isBlank(id))
			return (ResponseHelper.getErrorResponse(400, "A response id required.",
					"The response id should be provided as a path parameter in the request url : server/daquery/ws/response/{id}",
					null));

		if (!ResponseDAO.containsId(id))
			return (ResponseHelper.getErrorResponse(404, "No response found.",
					"A response with id:" + id + " was not found.", null));

		DaqueryResponse rVal = null;
		Response httpResponse = null;
		try {
			rVal = ResponseDAO.getResponseById(id);
			if (rVal == null)
				return (ResponseHelper.getErrorResponse(404, "Response not found.",
						"A Response with id " + id + " was not found.", null));
			Site mySite = SiteDAO.getLocalSite();
			String requestSiteId = rVal.getRequest().getRequestSite().getSiteId();
			if (!mySite.getSiteId().equals(requestSiteId)) { // remote response
				Site remoteSite = SiteDAO.getSiteByNameOrId(requestSiteId);
				Map<String, String> arguments = new HashMap<String, String>();
				arguments.put("networkid", rVal.getRequest().getNetwork().getNetworkId());
				httpResponse = WSConnectionUtil.getFromRemoteSite(remoteSite, "/response/" + id, arguments, httpHeaders.getHeaderString("Authorization"));

				if (httpResponse.getStatus() == 200) {
					String json = httpResponse.readEntity(String.class);
					ObjectMapper mapper = new ObjectMapper();
					TypeReference<DaqueryResponse> type = new TypeReference<DaqueryResponse>() {
					};
					DaqueryResponse resp = mapper.readValue(json, type);
					rVal.setStatus(resp.getStatus());
					rVal.setValue(resp.getValue());
					rVal.setStatusMessage(resp.getStatusMessage());
					rVal.setErrorMessage(resp.getErrorMessage());
					rVal.setDownloadAvailable(resp.isDownloadAvailable());
					if (resp.isDownloadAvailable() != null && resp.isDownloadAvailable().booleanValue()
							&& resp.getDownloadDirective() != null) {
						if (resp.getDownloadDirective() instanceof SQLQuery
								&& ((SQLQuery) resp.getDownloadDirective()).getCode() != null) {
							SQLQuery dDir = (SQLQuery) resp.getDownloadDirective();
							rVal.setDownloadDirective(resp.getDownloadDirective());
							List<SQLCode> toRemove = new ArrayList<SQLCode>();
							for (SQLCode cde : dDir.getCode()) {
								toRemove.add(cde);
								cde.setQuery(null);
								SQLCode nextCDE = new SQLCode();
								nextCDE.setCode(cde.getCode());
								nextCDE.setDialectEnum(cde.getDialectEnum());
								Long newId = (Long) AbstractDAO.save(nextCDE);
								SQLCode nC = AbstractDAO.get(SQLCode.class, newId);
								dDir.getCode().add(nC);
								nC.setQuery(dDir);
								AbstractDAO.updateOrSave(dDir);
							}
							for (SQLCode cd : toRemove) {
								cd.setQuery(null);
								dDir.getCode().remove(cd);
								AbstractDAO.delete(cd);
							}
						}
					}
					Fileset files = resp.getFiles();
					if (files != null)
						files.setId(null);
					rVal.setFiles(files);
					ResponseDAO.saveOrUpdate(rVal);
					return ResponseHelper.getJsonResponseGen(200, json);
				} else {
					DecodedErrorInfo decodedInfo = ResponseHelper.decodeErrorResponse(httpResponse);
					if (decodedInfo != null && decodedInfo.getErrorInfo() != null
							&& decodedInfo.getErrorInfo().getResponse() != null) {
						DaqueryResponse resp = decodedInfo.getErrorInfo().getResponse();
						rVal.setStatus(resp.getStatus());
						rVal.setValue(resp.getValue());
						ResponseDAO.saveOrUpdate(rVal);
					} else {
						String addlInfo = "";
						if (decodedInfo != null && decodedInfo.getErrorMessage() != null)
							addlInfo = "  Additional Information: " + decodedInfo.getErrorMessage();
						rVal.setStatusEnum(ResponseStatus.ERROR);
						rVal.setErrorMessage("An error was returned. " + addlInfo);
						ResponseDAO.saveOrUpdate(rVal);
					}
				}
			}
			ResponseTask rTask = (ResponseTask) QueueManager.getNamedQueue(TaskQueue.MAIN_QUEUE)
					.getTask(rVal.getResponseId());
			if (rVal.getStatusEnum().isQueuedOrRunning() && rTask == null) {
				rVal.setStatusEnum(ResponseStatus.STALLED);
				ResponseDAO.saveOrUpdate(rVal);
			}
			return ResponseHelper.getJsonResponseGen(200, rVal);
		} catch (Throwable t) {
			String msg = "An unhandled exception occurred while retrieving a response with id: " + id;
			logger.log(Level.SEVERE, msg, t);
			return (ResponseHelper.getErrorResponse(500, "An unhandled exception occurred.",
					msg + "Check the site server logs for more information.", t));
		} finally {
			if (httpResponse != null)
				httpResponse.close();
		}
	}

	/**
	 * Save an SQL query
	 * 
	 * @return On success a 201 http response with the sql query encoded in
	 *         json. On failure a 500 http response. example: /sqlquery
	 */
	@POST
	@Secured
	@Path("/sqlquery")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response saveSQLQuery(SQLQuery query) {
		SQLQueryDAO sqlqueryDAO = new SQLQueryDAO();
		try {
			sqlqueryDAO.openCurrentSessionwithTransaction();
			sqlqueryDAO.save(query);
			sqlqueryDAO.closeCurrentSessionwithTransaction();
		} catch (Throwable t) {
			String msg = "An unhandled exception occurred while saving sql query";
			logger.log(Level.SEVERE, msg, t);
			return (ResponseHelper.getErrorResponse(500, msg + "Check the site server logs for more information.", null,
					t));
		} finally {
			if (sqlqueryDAO.getCurrentSession() != null)
				sqlqueryDAO.closeCurrentSession();
		}
		return Response.ok(201).entity(query.toJson()).build();
	}

	@GET
	@Path("/count-sites")
	@Produces(MediaType.TEXT_PLAIN)
	public Response countSites() {
		String rVal = "";
		Session s = null;
		try {
			s = HibernateConfiguration.openSession();
			org.hibernate.SQLQuery q = s.createSQLQuery("select name, count(id) from site group by name order by name");
			List vals = q.list();
			for (Object o : vals) {
				Object[] a = (Object[]) o;
				rVal = rVal + a[0] + " " + a[1] + "\n";
			}

		} catch (Throwable t) {
			return (ResponseHelper.getErrorResponse(500, "Error while counting sites.", null, t));
		} finally {
			if (s != null)
				s.close();
		}
		return (ResponseHelper.getBasicResponse(200, rVal));
	}

	/**
	 * Get local roles
	 * 
	 * @return the list of roles except admin
	 */
	@GET
	@Secured
	@Path("/local-roles")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response localRoles() {
		try {
			return ResponseHelper.getJsonResponseGen(200, RoleDAO.queryAllRoles()); // Response.ok(200).entity(RoleDAO.queryAllRoles().toJson()).build();
		} catch (Throwable t) {
			String msg = "An unhandled exception occurred while getting roles";
			logger.log(Level.SEVERE, msg, t);
			return (ResponseHelper.getErrorResponse(500, msg + "Check the site server logs for more information.", null,
					t));
		}
	}

	/**
	 * renew JWT. (JSON Web Token) if the user's information is valid. example
	 * URL: daquery-ws/ws/renew-jwt
	 * 
	 * @return 200 with jwt otherwise, return a BAD REQUEST. Return an
	 *         UNAUTHORIZED for any other failure.
	 */
	@GET
	@Secured
	@Path("/renew-jwt")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response renewJWT(@HeaderParam(HttpHeaders.AUTHORIZATION) String oldTokenString,
			@DefaultValue("") @QueryParam("networkId") String networkId) {

        System.out.println("@@@@@@@ In DaqueryEndpoint renew-jwt call" );
		try {
			TokenManager tm = TokenManager.getTokenManager();
			oldTokenString = oldTokenString.substring("Bearer".length()).trim();
			String renewedTokenString = "";
			if (networkId.equalsIgnoreCase("")) { 
				renewedTokenString = tm.renewToken(oldTokenString);
			} else {
				renewedTokenString = tm.renewToken(oldTokenString, networkId);				
			}

			// Get the HTTP Authorization header from the request
			logger.log(Level.INFO, "#### renew jwt : " + oldTokenString);

			Response rVal = ResponseHelper.getRenewedTokenResponse(200, null, renewedTokenString, null);

			return rVal;

		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(500).build();
		}
	}

	/**
	 * Get current application properties which store in database. example url:
	 * daquery-ws/ws/properties
	 * 
	 * @return 200
	 * @throws DaqueryException
	 * @throws Exception
	 */
	@GET
	@Secured
	@Path("/properties")
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getProperties() throws DaqueryException {
		try {

			/*
			 * App DB properties taskQueueMaxLength exportTaskQueueMaxLength
			 * deliverData threeDigitZip dateShift fileOutputDir
			 * localDeliveryDir trackingOutputDir tempFileExportDir
			 */

			// Get the HTTP Authorization header from the request
			logger.log(Level.INFO, "Get properties");

			Map<String, String> properties = new HashMap<>();
			properties.put("taskQueueMaxLength",
					(new Integer(AppProperties.getTaskQueueMaxLength(TaskQueue.MAIN_QUEUE))).toString());
			properties.put("exportTaskQueueMaxLength",
					(new Integer(AppProperties.getTaskQueueMaxLength(TaskQueue.EXPORT_QUEUE))).toString());
			properties.put("deliverData", (new Boolean(AppProperties.getDeliverData())).toString());
			// properties.put("threeDigitZip", (new
			// Boolean(AppProperties.getThreeDigitZip())).toString());
			// properties.put("dateShift", (new
			// Boolean(AppProperties.getDateShift())).toString());
			properties.put("fileOutputDir", AppProperties.getFileOutputDir());
			properties.put("localDeliveryDir", AppProperties.getLocalDeliveryDir());
			properties.put("trackingOutputDir", AppProperties.getTrackingDir());
			properties.put("tempFileExportDir", AppProperties.getTempFileExportDir());
			properties.put("casePerFile", AppProperties.getCasePerFile());
			properties.put("centralURL", AppProperties.getCentralURL());
			properties.put("centralURLENVSet",
					String.valueOf(!StringHelper.isBlank(System.getenv("DAQUERY_CENT_URL"))));
			properties.put("notList", AppProperties.getNotList());
			return ResponseHelper.getJsonResponseGen(200, properties);

		} catch (Exception e) {
			String msg = e.getMessage();
			return ResponseHelper.getErrorResponse(500, "An unexpected error occurred",
					msg + "Check the server logs at site: " + AppProperties.getDBProperty("site.name"), e);
		}
	}

	/**
	 * Get current application properties which store in database. example url:
	 * daquery-ws/ws/properties
	 * 
	 * @return 200
	 * @throws Exception
	 */
	@PUT
	@Secured
	@Path("/properties")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response udpateProperties(Map<?, ?> properties) {
		try {

			/*
			 * App DB properties taskQueueMaxLength exportTaskQueueMaxLength
			 * deliverData threeDigitZip dateShift fileOutputDir
			 * localDeliveryDir trackingOutputDir tempFileExportDir centralURL
			 */

			// Get the HTTP Authorization header from the request
			logger.log(Level.INFO, "Update properties");

			// Validate taskQueueMaxLength and exportTaskQueueMaxLength
			if ((Integer) properties.get("taskQueueMaxLength") < 1)
				return ResponseHelper.getErrorResponse(500, "Task Queue Max Length must be greater than 1",
						"Task Queue Max Length must be greater than 1", null);
			if ((Integer) properties.get("exportTaskQueueMaxLength") < 1)
				return ResponseHelper.getErrorResponse(500, "Export Task Queue Max Length must be greater than 1",
						"Export Task Queue Max Length must be greater than 1", null);

			// Validate fileOutputDir, localDeliveryDir and trackingOutputDir
			String fileOutputDir = (String) properties.get("fileOutputDir");
			File f = new File(fileOutputDir);
			if (f.exists()) {
				if (!f.canWrite()) {
					return ResponseHelper.getErrorResponse(500, "The file output directory is not writable.",
							"The file output directory is not writable.", null);
				}
			} else {
				if (!f.mkdir()) {
					return ResponseHelper.getErrorResponse(500,
							"Unable to create the file output directory at " + fileOutputDir, null, null);
				}
			}

			String localDeliveryDir = (String) properties.get("localDeliveryDir");
			f = new File(localDeliveryDir);
			if (f.exists()) {
				if (!f.canWrite()) {
					return ResponseHelper.getErrorResponse(500, "The local delivery directory is not writable.",
							"The local delivery directory is not writable.", null);
				}
			} else {
				if (!f.mkdir()) {
					return ResponseHelper.getErrorResponse(500, "The local delivery directory is not able to create.",
							"The local delivery directory is not able to create.", null);
				}
			}

			String trackingOutputDir = AppProperties.getTrackingDir();
			f = new File(trackingOutputDir);
			if (f.exists()) {
				if (!f.canWrite()) {
					return ResponseHelper.getErrorResponse(500, "The tracking output directory is not writable.",
							"The tracking output directory is not writable.", null);
				}
			} else {
				if (!f.mkdir()) {
					return ResponseHelper.getErrorResponse(500, "The tracking output directory is not able to create.",
							"The tracking output directory is not able to create.", null);
				}
			}

			String tempFileExportDir = AppProperties.getTempFileExportDir();
			f = new File(tempFileExportDir);
			if (f.exists()) {
				if (!f.canWrite()) {
					return ResponseHelper.getErrorResponse(500, "The temp file export directory is not writable.",
							"The temp file export directory is not writable.", null);
				}
			} else {
				if (!f.mkdir()) {
					return ResponseHelper.getErrorResponse(500, "The temp file export directory is not able to create.",
							"The temp file export directory is not able to create.", null);
				}
			}

			// Test Central URL
			String url = (String) properties.get("centralURL");
			Client client = WSConnectionUtil.getRemoteClient(url);
			Response rVal = client.target(url + "/daquery-central/hello").request().get();
			if (rVal.getStatus() != 200) {
				return ResponseHelper.getErrorResponse(500, "The Central Server URL you entered is not accessible.",
						"The Central Server URL you entered is not accessible.", null);
			}

			AppProperties.setTaskQueueMaxLength(TaskQueue.MAIN_QUEUE,
					((Integer) properties.get("taskQueueMaxLength")).intValue());
			AppProperties.setTaskQueueMaxLength(TaskQueue.EXPORT_QUEUE,
					((Integer) properties.get("exportTaskQueueMaxLength")).intValue());
			AppProperties.setDeliverData(Boolean.parseBoolean((String) properties.get("deliverData")));
			AppProperties.setFileOutputDir((String) properties.get("fileOutputDir"));
			AppProperties.setLocalDeliveryDir((String) properties.get("localDeliveryDir"));
			AppProperties.setTrackingDir((String) properties.get("trackingOutputDir"));
			AppProperties.setTempFileExportDir((String) properties.get("tempFileExportDir"));
			AppProperties.setCasePerFile((String) properties.get("casePerFile"));
			AppProperties.setCentralURL((String) properties.get("centralURL"));
			AppProperties.setNotList(properties.get("notList").toString());

			return ResponseHelper.getJsonResponseGen(200, properties);

		} catch (ProcessingException pe) {
			pe.printStackTrace();
			return ResponseHelper.getErrorResponse(500, "The Central Server URL you entered is not accessible.",
					"The Central Server URL you entered is not accessible.", pe);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseHelper.getErrorResponse(500, "", "", e);
		}
	}

	private Response handleAggregateRequestFromSite(UserInfo uInfo, DaqueryRequest request, String requesterId,
			Network net) throws Exception {
		if (uInfo == null) {
			if (request.getRequester() == null || StringHelper.isEmpty(request.getRequester().getId())
					|| StringHelper.isEmpty(request.getRequester().getEmail())
					|| StringHelper.isEmpty(request.getRequester().getRealName())) {
				String msg = "Requester user information is required.";
				DaqueryResponse eResp = assembleErrorResponse(msg, null);
				return (ResponseHelper.getErrorResponse(400, msg,
						"Requester user information with a minimum of user id, email and real name for user with id "
								+ requesterId
								+ ".  This is needed because this user's information isn't currently listed at this site.",
						null, eResp));
			}
			if (!request.getRequester().getId().equals(requesterId)) {
				String msg = "The requester id does not match the authenticated user id.";
				DaqueryResponse eResp = assembleErrorResponse(msg, null);
				return (ResponseHelper
						.getErrorResponse(400, msg,
								"User with id " + requesterId + " sent the request, but a user with  id "
										+ request.getId() + " was provided with the request as the requester.",
								null, eResp));
			}
			uInfo = new UserInfo();
			uInfo.setEmail(request.getRequester().getEmail());
			uInfo.setId(request.getRequester().getId());
			uInfo.setRealName(request.getRequester().getRealName());
		}

		Session sess = null;
		Transaction trans = null;
		try {
			sess = HibernateConfiguration.openSession();
			trans = sess.beginTransaction();
			sess.saveOrUpdate(uInfo);
			trans.commit();
		} catch (Throwable t) {
			if (trans != null)
				trans.rollback();
			logger.log(Level.SEVERE, "Error saving UserInfo object with user id " + uInfo.getId(), t);
			String msg = "There was an error at the request site while trying to save some request information.";
			DaqueryResponse eResp = assembleErrorResponse(msg, t);
			return (ResponseHelper.getErrorResponse(500, msg,
					"An error occurred while trying to save the requester UserInfo on the local site please contact the site admin.",
					t, eResp));
		} finally {
			if (sess != null)
				sess.close();
		}

		if (request.getInquiry() == null) {
			String msg = "No inquiry provided.";
			DaqueryResponse eResp = assembleErrorResponse(msg, null);
			return (ResponseHelper.getErrorResponse(400, msg,
					"An Inquiry object is required and was not included with the request", null, eResp));
		}

		if (!DaqueryUserDAO.hasRole(requesterId, net.getNetworkId(), "AGGREGATE_QUERIER")) {
			String msg = "Requester does not have aggregate query role.";
			DaqueryResponse eResp = assembleErrorResponse(msg, null);
			return (ResponseHelper.getErrorResponse(403, msg,
					"User " + uInfo.getEmail() + " is not allowed to run aggregate queries against site: "
							+ AppProperties.getDBProperty("site.name"),
					null, eResp));
		}

		if (DaqueryUserDAO.isLocalUserId(requesterId))
			request.setDirection("IN-OUT");
		else
			request.setDirection("IN");

		// TODO decide if this is an immediate response or if it needs to be
		// reviewed
		// if it needs to be reviewed create a DaqueryResponse object, mark as
		// pending
		// and return- maybe send a message to someone??
		// else do the below..

		DaqueryResponse rVal = null;
		try {
			Site site = SiteDAO.getSiteByNameOrId(request.getRequesterSite().getSiteId());
			request.setId(null);
			request.setRequesterSite(site);
			DaqueryRequestDAO.saveOrUpdate(request);
			ResponseTask task = new ResponseTask(request, DaqueryUserDAO.getSysUser(),
					net.getDataModels().iterator().next());
			QueueManager.getNamedQueue(TaskQueue.MAIN_QUEUE).addTask(task);
			rVal = task.getResponse();
			rVal.setRequest(request);
			ResponseDAO.saveOrUpdate(rVal);
		} catch (Throwable e) {
			logger.log(Level.SEVERE, "Error while executing request with id: " + request.getRequestId(), e);
			DaqueryResponse dqResponse = new DaqueryResponse(true);
			dqResponse.setStatusEnum(ResponseStatus.ERROR);
			dqResponse.setErrorMessage(e.getMessage());
			String trace = StringHelper.stackToString(e);
			dqResponse.setStackTrace(trace);
			dqResponse.setReplyTimestamp(new Date());
			dqResponse.setRequest(request);
			ResponseDAO.saveOrUpdate(dqResponse);
			return (ResponseHelper.getErrorResponse(500, "Error while executing a request.",
					"An unexpected error occurred while executing the request with id:" + request.getRequestId(), e,
					dqResponse));
		}

		if (rVal == null) {
			String msg = "No response recieved for this request.";
			DaqueryResponse eResp = assembleErrorResponse(msg, null);
			return (ResponseHelper.getErrorResponse(500, msg,
					"A response was not recieved from the task queue for this request.  Please contact the site admin from where the response was sent to look at the server log files for potential issues.",
					null, eResp));
		} else {
			return (ResponseHelper.getJsonResponseGen(200, rVal));
		}
	}

	private Response handleLocalAggregateRequestFromUI(DaqueryRequest request, String requesterId, Network net,
			UserInfo uInfo) throws Exception {
		if (request.getInquiry() == null) {
			String msg = "No inquiry provided.";
			DaqueryResponse eResp = assembleErrorResponse(msg, null);
			return (ResponseHelper.getErrorResponse(400, msg,
					"An Inquiry object is required and was not included with the request", null, eResp));
		}

		if (!DaqueryUserDAO.hasRole(requesterId, net.getNetworkId(), "AGGREGATE_QUERIER")) {
			String msg = "Requester does not have aggregate query role.";
			DaqueryResponse eResp = assembleErrorResponse(msg, null);
			return (ResponseHelper.getErrorResponse(403, msg,
					"User " + uInfo.getEmail() + " is not allowed to run aggregate queries against site: "
							+ AppProperties.getDBProperty("site.name"),
					null, eResp));
		}

		if (DaqueryUserDAO.isLocalUserId(requesterId))
			request.setDirection("IN-OUT");
		else
			request.setDirection("IN");

		// TODO decide if this is an immediate response or if it needs to be
		// reviewed
		// if it needs to be reviewed create a DaqueryResponse object, mark as
		// pending
		// and return- maybe send a message to someone??
		// else do the below..

		DaqueryResponse rVal = null;
		try {
			request.setId(null);
			request.setSentTimestamp(new Date());
			request.setRequester(uInfo);
			DaqueryRequestDAO.saveOrUpdate(request);
			ResponseTask task = new ResponseTask(request, DaqueryUserDAO.getSysUser(),
					net.getDataModels().iterator().next());
			QueueManager.getNamedQueue(TaskQueue.MAIN_QUEUE).addTask(task);
			rVal = task.getResponse();
			rVal.setRequest(request);
			ResponseDAO.saveOrUpdate(rVal);
		} catch (Throwable e) {
			logger.log(Level.SEVERE, "Error while executing request with id: " + request.getRequestId(), e);
			DaqueryResponse dqResponse = new DaqueryResponse(true);
			dqResponse.setStatusEnum(ResponseStatus.ERROR);
			dqResponse.setErrorMessage(e.getMessage());
			String trace = StringHelper.stackToString(e);
			dqResponse.setStackTrace(trace);
			dqResponse.setReplyTimestamp(new Date());
			dqResponse.setRequest(request);
			ResponseDAO.saveOrUpdate(dqResponse);
			return (ResponseHelper.getErrorResponse(500, "Error while executing a request.",
					"An unexpected error occurred while executing the request with id:" + request.getRequestId(), e,
					dqResponse));
		}

		if (rVal == null) {
			String msg = "No response recieved for this request.";
			DaqueryResponse eResp = assembleErrorResponse(msg, null);
			return (ResponseHelper.getErrorResponse(500, msg,
					"A response was not recieved from the task queue for this request.  Please contact the site admin from where the response was sent to look at the server log files for potential issues.",
					null, eResp));
		} else {
			return (ResponseHelper.getJsonResponseGen(200, rVal));
		}
	}

	private Response handleRemoteAggregateRequestFromUI(DaqueryRequest request, Response response, Site requestSite,
			String securityToken) throws DaqueryException, JsonParseException, JsonMappingException, IOException {
 		request.setDirection("OUT");
		request.setSentTimestamp(new Date());
		SQLCode code = (((SQLQuery)request.getInquiry()).getCode()).iterator().next();
		code.setQuery((SQLQuery) request.getInquiry());
		DaqueryRequestDAO.updateOrSave(request);
		response = WSConnectionUtil.postJSONToRemoteSite(requestSite, "request", request.toJson(), securityToken);
		if (response.getStatus() == 200) {
			String json = response.readEntity(String.class);
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<DaqueryResponse> type = new TypeReference<DaqueryResponse>() {
			};
			DaqueryResponse resp = mapper.readValue(json, type);
			resp.setRequest(request);
			resp.setId(null);
			ResponseDAO.saveOrUpdate(resp);
			return ResponseHelper.getJsonResponseGen(200, resp);
		} else {
			DecodedErrorInfo decodedInfo = ResponseHelper.decodeErrorResponse(response);
			if (decodedInfo != null && decodedInfo.getErrorInfo() != null) {
				ErrorInfo errorInfo = decodedInfo.getErrorInfo();
				DaqueryResponse resp = errorInfo.getResponse();
				if (resp == null) {
					resp = new DaqueryResponse(true);
				}
				if (StringHelper.isBlank(resp.getResponseId())) {
					resp.setResponseId(UUID.randomUUID().toString());
				}
				resp.setStatusEnum(ResponseStatus.ERROR);
				if (StringHelper.isBlank(resp.getErrorMessage())) {
					resp.setErrorMessage(errorInfo.getDisplayMessage());
				}
				if (StringHelper.isBlank(resp.getStackTrace()) && !StringHelper.isBlank(errorInfo.getStackTrace())) {
					String trace = errorInfo.getStackTrace();
					if (trace.length() > 10000)
						trace = trace.substring(0, 9999);
					resp.setStackTrace(trace);
				}
				resp.setRequest(request);
				resp.setId(null);
				ResponseDAO.saveOrUpdate(resp);
				return ResponseHelper.getJsonResponseGen(response.getStatus(), errorInfo);
			} else {
				String addlInfo = "";
				if (decodedInfo != null && decodedInfo.getErrorMessage() != null)
					addlInfo = " Additional Info: " + decodedInfo.getErrorMessage();
				return (ResponseHelper.getErrorResponse(response.getStatus(),
						"Unhandled error during a remote request.",
						"Site " + requestSite.getName()
								+ " responded with an error.  Check the site logs for more information." + addlInfo,
						null));
			}
		}
	}

	private Response handleDataRequestFromSite(UserInfo uInfo, DaqueryRequest request, String requesterId, Network net)
			throws Exception {
		if (uInfo == null) {

			if (request.getRequester() == null || StringHelper.isEmpty(request.getRequester().getId())
					|| StringHelper.isEmpty(request.getRequester().getEmail())
					|| StringHelper.isEmpty(request.getRequester().getRealName())) {
				String msg = "Requester user information is required.";
				DaqueryResponse eResp = assembleErrorResponse(msg, null);
				return (ResponseHelper.getErrorResponse(400, msg,
						"Requester user information with a minimum of user id, email and real name for user with id "
								+ requesterId
								+ ".  This is needed because this user's information isn't currently listed at this site.",
						null, eResp));
			}
			if (!request.getRequester().getId().equals(requesterId)) {
				String msg = "The requester id does not match the authenticated user id.";
				DaqueryResponse eResp = assembleErrorResponse(msg, null);
				return (ResponseHelper
						.getErrorResponse(400, msg,
								"User with id " + requesterId + " sent the request, but a user with  id "
										+ request.getId() + " was provided with the request as the requester.",
								null, eResp));
			}
			uInfo = new UserInfo();
			uInfo.setEmail(request.getRequester().getEmail());
			uInfo.setId(request.getRequester().getId());
			uInfo.setRealName(request.getRequester().getRealName());
		}

		Session sess = null;
		Transaction trans = null;
		try {
			sess = HibernateConfiguration.openSession();
			trans = sess.beginTransaction();
			sess.saveOrUpdate(uInfo);
			trans.commit();
		} catch (Throwable t) {
			if (trans != null)
				trans.rollback();
			logger.log(Level.SEVERE, "Error saving UserInfo object with user id " + uInfo.getId(), t);
			String msg = "There was an error at the request site while trying to save some request information.";
			DaqueryResponse eResp = assembleErrorResponse(msg, t);
			return (ResponseHelper.getErrorResponse(500, msg,
					"An error occurred while trying to save the requester UserInfo on the local site please contact the site admin.",
					t, eResp));
		} finally {
			if (sess != null)
				sess.close();
		}

		if (request.getInquiry() == null) {
			String msg = "No inquiry provided.";
			DaqueryResponse eResp = assembleErrorResponse(msg, null);
			return (ResponseHelper.getErrorResponse(400, msg,
					"An Inquiry object is required and was not included with the request", null, eResp));
		}

		if (!DaqueryUserDAO.hasRole(requesterId, net.getNetworkId(), "DATA_QUERIER")) {
			String msg = "Requester does not have data download role.";
			DaqueryResponse eResp = assembleErrorResponse(msg, null);
			return (ResponseHelper.getErrorResponse(403, msg, "User " + uInfo.getEmail()
					+ " is not allowed to request date from site: " + AppProperties.getDBProperty("site.name"), null,
					eResp));
		}

		if (DaqueryUserDAO.isLocalUserId(requesterId))
			request.setDirection("IN-OUT");
		else
			request.setDirection("IN");

		// TODO decide if this is an immediate response or if it needs to be
		// reviewed
		// if it needs to be reviewed create a DaqueryResponse object, mark as
		// pending
		// and return- maybe send a message to someone??
		// else do the below..

		DaqueryResponse rVal = null;
		try {
			request.setId(null);
			request.setSentTimestamp(new Date());
			request.setRequester(uInfo);
			DaqueryRequestDAO.saveOrUpdate(request);
			rVal = new DaqueryResponse(true);
			rVal.setStatusEnum(ResponseStatus.PENDING);
			rVal.setDownloadAvailable(false);
			rVal.setRequest(request);
			Site requesterSite = SiteDAO.saveOrUpdate(request.getRequesterSite());
			Site requestSite = SiteDAO.saveOrUpdate(request.getRequestSite());
			request.setRequesterSite(requesterSite);
			request.setRequestSite(requestSite);
			ResponseDAO.saveOrUpdate(rVal);
			return ResponseHelper.getJsonResponseGen(201, rVal);
		} catch (Throwable e) {
			logger.log(Level.SEVERE, "Error while executing request with id: " + request.getRequestId(), e);
			return (ResponseHelper.getErrorResponse(500, "Error while saving a data request.",
					"An unexpected error occurred while saving the data request with id:" + request.getRequestId(), e));
		}
	}

	private Response handleLocalDataRequestFromUI(DaqueryRequest request, String requesterId, Network net,
			UserInfo uInfo) throws Exception {
		if (request.getInquiry() == null) {
			String msg = "No inquiry provided.";
			DaqueryResponse eResp = assembleErrorResponse(msg, null);
			return (ResponseHelper.getErrorResponse(400, msg,
					"An Inquiry object is required and was not included with the request", null, eResp));
		}

		if (!DaqueryUserDAO.hasRole(requesterId, net.getNetworkId(), "DATA_QUERIER")) {
			String msg = "Requester does not have data download role.";
			DaqueryResponse eResp = assembleErrorResponse(msg, null);
			return (ResponseHelper.getErrorResponse(403, msg, "User " + uInfo.getEmail()
					+ " is not allowed to request data from site: " + AppProperties.getDBProperty("site.name"), null,
					eResp));
		}

		if (DaqueryUserDAO.isLocalUserId(requesterId))
			request.setDirection("IN-OUT");
		else
			request.setDirection("IN");

		// TODO decide if this is an immediate response or if it needs to be
		// reviewed
		// if it needs to be reviewed create a DaqueryResponse object, mark as
		// pending
		// and return- maybe send a message to someone??
		// else do the below..

		try {
			request.setSentTimestamp(new Date());
			request.setRequester(uInfo);
			DaqueryRequestDAO.saveOrUpdate(request);
			DaqueryResponse dr = new DaqueryResponse(true);
			dr.setStatusEnum(ResponseStatus.PENDING);
			dr.setRequest(request);
			ResponseDAO.saveOrUpdate(dr);
			return ResponseHelper.getBasicResponse(201, "{}");
		} catch (Throwable e) {
			logger.log(Level.SEVERE, "Error while executing request with id: " + request.getRequestId(), e);
			return (ResponseHelper.getErrorResponse(500, "Error while saving a data request.",
					"An unexpected error occurred while saving the data request with id:" + request.getRequestId(), e));
		}
	}

	private Response handleRemoteDataRequestFromUI(DaqueryRequest request, Response response, Site requestSite,
			String securityToken) throws DaqueryException, JsonParseException, JsonMappingException, IOException {
		request.setDirection("OUT");
		request.setSentTimestamp(new Date());
		SQLCode code = (((SQLQuery)request.getInquiry()).getCode()).iterator().next();
		code.setQuery((SQLQuery) request.getInquiry());
		DaqueryRequestDAO.updateOrSave(request);
		response = WSConnectionUtil.postJSONToRemoteSite(requestSite, "request", request.toJson(), securityToken);
		if (response.getStatus() == 201) {
			String json = response.readEntity(String.class);
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<DaqueryResponse> type = new TypeReference<DaqueryResponse>() {
			};
			DaqueryResponse resp = mapper.readValue(json, type);
			resp.setRequest(request);
			resp.setId(null);
			ResponseDAO.saveOrUpdate(resp);
			return ResponseHelper.getJsonResponseGen(201, resp);
		} else {
			DecodedErrorInfo decodedInfo = ResponseHelper.decodeErrorResponse(response);
			if (decodedInfo != null && decodedInfo.getErrorInfo() != null) {
				ErrorInfo errorInfo = decodedInfo.getErrorInfo();
				DaqueryResponse resp = errorInfo.getResponse();
				if (resp == null) {
					resp = new DaqueryResponse(true);
				}
				if (StringHelper.isBlank(resp.getResponseId())) {
					resp.setResponseId(UUID.randomUUID().toString());
				}
				resp.setStatusEnum(ResponseStatus.ERROR);
				if (StringHelper.isBlank(resp.getErrorMessage())) {
					resp.setErrorMessage(errorInfo.getDisplayMessage());
				}
				if (StringHelper.isBlank(resp.getStackTrace()) && !StringHelper.isBlank(errorInfo.getStackTrace())) {
					String trace = errorInfo.getStackTrace();
					if (trace.length() > 10000)
						trace = trace.substring(0, 9999);
					resp.setStackTrace(trace);
				}
				resp.setRequest(request);
				resp.setId(null);
				ResponseDAO.saveOrUpdate(resp);
				return ResponseHelper.getJsonResponseGen(response.getStatus(), errorInfo);
			} else {
				String addlInfo = "";
				if (decodedInfo != null && decodedInfo.getErrorMessage() != null)
					addlInfo = " Additional Info: " + decodedInfo.getErrorMessage();
				return (ResponseHelper.getErrorResponse(response.getStatus(),
						"Unhandled error during a remote request.",
						"Site " + requestSite.getName()
								+ " responded with an error.  Check the site logs for more information." + addlInfo,
						null));
			}
		}
	}

	private Response handleTableRequestFromSite(UserInfo uInfo, DaqueryRequest request, String requesterId, Network net)
			throws Exception {
		if (uInfo == null) {
			if (request.getRequester() == null || StringHelper.isEmpty(request.getRequester().getId())
					|| StringHelper.isEmpty(request.getRequester().getEmail())
					|| StringHelper.isEmpty(request.getRequester().getRealName())) {
				String msg = "Requester user information is required.";
				DaqueryResponse eResp = assembleErrorResponse(msg, null);
				return (ResponseHelper.getErrorResponse(400, msg,
						"Requester user information with a minimum of user id, email and real name for user with id "
								+ requesterId
								+ ".  This is needed because this user's information isn't currently listed at this site.",
						null, eResp));
			}
			if (!request.getRequester().getId().equals(requesterId)) {
				String msg = "The requester id does not match the authenticated user id.";
				DaqueryResponse eResp = assembleErrorResponse(msg, null);
				return (ResponseHelper
						.getErrorResponse(400, msg,
								"User with id " + requesterId + " sent the request, but a user with  id "
										+ request.getId() + " was provided with the request as the requester.",
								null, eResp));
			}
			uInfo = new UserInfo();
			uInfo.setEmail(request.getRequester().getEmail());
			uInfo.setId(request.getRequester().getId());
			uInfo.setRealName(request.getRequester().getRealName());
		}

		Session sess = null;
		Transaction trans = null;
		try {
			sess = HibernateConfiguration.openSession();
			trans = sess.beginTransaction();
			sess.saveOrUpdate(uInfo);
			trans.commit();
		} catch (Throwable t) {
			if (trans != null)
				trans.rollback();
			logger.log(Level.SEVERE, "Error saving UserInfo object with user id " + uInfo.getId(), t);
			String msg = "There was an error at the request site while trying to save some request information.";
			DaqueryResponse eResp = assembleErrorResponse(msg, t);
			return (ResponseHelper.getErrorResponse(500, msg,
					"An error occurred while trying to save the requester UserInfo on the local site please contact the site admin.",
					t, eResp));
		} finally {
			if (sess != null)
				sess.close();
		}

		if (request.getInquiry() == null) {
			String msg = "No inquiry provided.";
			DaqueryResponse eResp = assembleErrorResponse(msg, null);
			return (ResponseHelper.getErrorResponse(400, msg,
					"An Inquiry object is required and was not included with the request", null, eResp));
		}

		if (!DaqueryUserDAO.hasRole(requesterId, net.getNetworkId(), "DATA_QUERIER")) {
			String msg = "Requester does not have data download role.";
			DaqueryResponse eResp = assembleErrorResponse(msg, null);
			return (ResponseHelper.getErrorResponse(403, msg, "User " + uInfo.getEmail()
					+ " is not allowed to request date from site: " + AppProperties.getDBProperty("site.name"), null,
					eResp));
		}

		if (DaqueryUserDAO.isLocalUserId(requesterId))
			request.setDirection("IN-OUT");
		else
			request.setDirection("IN");

		// TODO decide if this is an immediate response or if it needs to be
		// reviewed
		// if it needs to be reviewed create a DaqueryResponse object, mark as
		// pending
		// and return- maybe send a message to someone??
		// else do the below..

		DaqueryResponse rVal = null;
		try {
			request.setId(null);
			request.setSentTimestamp(new Date());
			request.setRequester(uInfo);
			// request.setRequesterSite(null);
			// request.setRequestSite(null);
			DaqueryRequestDAO.saveOrUpdate(request);
			rVal = new DaqueryResponse(true);
			rVal.setStatusEnum(ResponseStatus.PENDING);
			rVal.setDownloadAvailable(false);
			rVal.setRequest(request);
			Site requesterSite = SiteDAO.saveOrUpdate(request.getRequesterSite());
			Site requestSite = SiteDAO.saveOrUpdate(request.getRequestSite());
			request.setRequesterSite(requesterSite);
			request.setRequestSite(requestSite);
			ResponseDAO.saveOrUpdate(rVal);
			return ResponseHelper.getJsonResponseGen(201, rVal);
		} catch (Throwable e) {
			logger.log(Level.SEVERE, "Error while executing request with id: " + request.getRequestId(), e);
			return (ResponseHelper.getErrorResponse(500, "Error while saving a data request.",
					"An unexpected error occurred while saving the data request with id:" + request.getRequestId(), e));
		}
	}

	private Response handleLocalTableRequestFromUI(DaqueryRequest request, String requesterId, Network net,
			UserInfo uInfo) throws Exception {
		if (request.getInquiry() == null) {
			String msg = "No inquiry provided.";
			DaqueryResponse eResp = assembleErrorResponse(msg, null);
			return (ResponseHelper.getErrorResponse(400, msg,
					"An Inquiry object is required and was not included with the request", null, eResp));
		}

		if (!DaqueryUserDAO.hasRole(requesterId, net.getNetworkId(), "DATA_QUERIER")) {
			String msg = "Requester does not have data download role.";
			DaqueryResponse eResp = assembleErrorResponse(msg, null);
			return (ResponseHelper.getErrorResponse(403, msg, "User " + uInfo.getEmail()
					+ " is not allowed to request data from site: " + AppProperties.getDBProperty("site.name"), null,
					eResp));
		}

		if (DaqueryUserDAO.isLocalUserId(requesterId))
			request.setDirection("IN-OUT");
		else
			request.setDirection("IN");

		// TODO decide if this is an immediate response or if it needs to be
		// reviewed
		// if it needs to be reviewed create a DaqueryResponse object, mark as
		// pending
		// and return- maybe send a message to someone??
		// else do the below..

		// try
		// {
		// request.setSentTimestamp(new Date());
		// request.setRequester(uInfo);
		// DaqueryResponse dr = new DaqueryResponse(true);
		// dr.setStatusEnum(ResponseStatus.PENDING);
		// dr.setRequest(request);
		// ResponseDAO.saveOrUpdate(dr);
		// return ResponseHelper.getBasicResponse(201, "{}");
		// }
		// catch(Throwable e)
		// {
		// logger.log(Level.SEVERE, "Error while executing request with id: " +
		// request.getRequestId(), e);
		// return(ResponseHelper.getErrorResponse(500, "Error while saving a
		// data request.", "An unexpected error occurred while saving the data
		// request with id:" + request.getRequestId(), e));
		// }

		// ********************************************************
		DaqueryResponse rVal = null;
		try {
			request.setId(null);
			request.setSentTimestamp(new Date());
			request.setRequester(uInfo);
			DaqueryRequestDAO.saveOrUpdate(request);
			rVal = new DaqueryResponse(true);
			rVal.setResponder(uInfo);
			rVal.setStatusEnum(ResponseStatus.PENDING);
			rVal.setRequest(request);
			ResponseDAO.saveOrUpdate(rVal);
		} catch (Throwable e) {
			logger.log(Level.SEVERE, "Error while executing request with id: " + request.getRequestId(), e);
			DaqueryResponse dqResponse = new DaqueryResponse(true);
			dqResponse.setStatusEnum(ResponseStatus.ERROR);
			dqResponse.setErrorMessage(e.getMessage());
			String trace = StringHelper.stackToString(e);
			dqResponse.setStackTrace(trace);
			dqResponse.setReplyTimestamp(new Date());
			dqResponse.setRequest(request);
			ResponseDAO.saveOrUpdate(dqResponse);
			return (ResponseHelper.getErrorResponse(500, "Error while executing a request.",
					"An unexpected error occurred while executing the request with id:" + request.getRequestId(), e,
					dqResponse));
		}

		if (rVal == null) {
			String msg = "No response recieved for this request.";
			DaqueryResponse eResp = assembleErrorResponse(msg, null);
			return (ResponseHelper.getErrorResponse(500, msg,
					"A response was not recieved from the task queue for this request. Please contact the site admin from where the response was sent to look at the server log files for potential issues.",
					null, eResp));
		} else {
			return (ResponseHelper.getJsonResponseGen(200, rVal));
		}
	}

	private Response handleRemoteTableRequestFromUI(DaqueryRequest request, Response response, Site requestSite,
			String securityToken) throws DaqueryException, JsonParseException, JsonMappingException, IOException {
		request.setDirection("OUT");
		request.setSentTimestamp(new Date());
		DaqueryRequestDAO.saveOrUpdate(request);
		response = WSConnectionUtil.postJSONToRemoteSite(requestSite, "request", request.toJson(), securityToken);
		if (response.getStatus() == 201) {
			String json = response.readEntity(String.class);
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<DaqueryResponse> type = new TypeReference<DaqueryResponse>() {
			};
			DaqueryResponse resp = mapper.readValue(json, type);
			resp.setRequest(request);
			resp.setId(null);
			ResponseDAO.saveOrUpdate(resp);
			return ResponseHelper.getJsonResponseGen(201, resp);
		} else {
			DecodedErrorInfo decodedInfo = ResponseHelper.decodeErrorResponse(response);
			if (decodedInfo != null && decodedInfo.getErrorInfo() != null) {
				ErrorInfo errorInfo = decodedInfo.getErrorInfo();
				DaqueryResponse resp = errorInfo.getResponse();
				if (resp == null) {
					resp = new DaqueryResponse(true);
				}
				if (StringHelper.isBlank(resp.getResponseId())) {
					resp.setResponseId(UUID.randomUUID().toString());
				}
				resp.setStatusEnum(ResponseStatus.ERROR);
				if (StringHelper.isBlank(resp.getErrorMessage())) {
					resp.setErrorMessage(errorInfo.getDisplayMessage());
				}
				if (StringHelper.isBlank(resp.getStackTrace()) && !StringHelper.isBlank(errorInfo.getStackTrace())) {
					String trace = errorInfo.getStackTrace();
					if (trace.length() > 10000)
						trace = trace.substring(0, 9999);
					resp.setStackTrace(trace);
				}
				resp.setRequest(request);
				resp.setId(null);
				ResponseDAO.saveOrUpdate(resp);
				return ResponseHelper.getJsonResponseGen(response.getStatus(), errorInfo);
			} else {
				String addlInfo = "";
				if (decodedInfo != null && decodedInfo.getErrorMessage() != null)
					addlInfo = " Additional Info: " + decodedInfo.getErrorMessage();
				return (ResponseHelper.getErrorResponse(response.getStatus(),
						"Unhandled error during a remote request.",
						"Site " + requestSite.getName()
								+ " responded with an error.  Check the site logs for more information." + addlInfo,
						null));
			}
		}
	}

	@POST
	@Path("/data-file")
	@Consumes(MediaType.APPLICATION_OCTET_STREAM)
	@Produces(MediaType.TEXT_PLAIN)
	public Response receiveDataFile(InputStream is, @DefaultValue("") @QueryParam("filename") String filename,
			@DefaultValue("") @QueryParam("output-dir") String outputDirName,
			@DefaultValue("") @QueryParam("from-site-id") String fromSiteId) {
		OutputStream out = null;
		try {
			if (StringHelper.isBlank(filename)) {
				logger.log(Level.SEVERE, "Did not recieve a file name when trying to copy a file.");
				return ResponseHelper.getErrorResponse(400,
						"Required parameter filename not received during a file transfer.", null, null);
			}
			if (StringHelper.isEmpty(outputDirName)) {
				return ResponseHelper.getErrorResponse(400,
						"Required output directory name parameter not recieved during file transfer.",
						"Output directory name not recieved on transfer of file " + filename, null);
			}
			if (StringHelper.isEmpty(fromSiteId)) {
				return ResponseHelper.getErrorResponse(400,
						"Required site id parameter not recieved during file transfer.",
						"Request id not recieved when for transfer of file " + filename, null);
			}

			Site fromSite = SiteDAO.querySiteByID(fromSiteId);
			if (fromSite == null) {
				return ResponseHelper.getErrorResponse(500, "Unable to find site.",
						"The sending site with id " + fromSiteId + " was not found when sending file " + filename + ".",
						null);
			}

			// construct the output directory, if needed
			// the output directory is the application set output dir (defaults
			// to sys temp)
			// plus the request group id for this request
			String outputDirectoryPath = AppProperties.getFileOutputDir();
			File outputDirectory = new File(outputDirectoryPath);
			if (!outputDirectory.exists()) {
				if (!outputDirectory.mkdirs())
					return ResponseHelper.getErrorResponse(500, "Unable to create output directory.", "The directory "
							+ outputDirectoryPath + " could not be created when sending file " + filename + ".", null);
			}
			File groupOutputDir = Paths.get(outputDirectoryPath, outputDirName.replaceAll(":", "-")).toFile();
			if (!groupOutputDir.exists()) {
				if (!groupOutputDir.mkdirs())
					return ResponseHelper.getErrorResponse(500, "Unable to create output directory.",
							"The directory " + groupOutputDir.getAbsolutePath()
									+ " could not be created when sending file " + filename + ".",
							null);
			}

			// construct the output file name by prefixing the site name
			// to it and postfixing a serializer if it already exists
			// also replace any colons with dashes because Windows doesn't like
			// the colons
			String outputFilename = fromSite.getName().trim() + "_" + filename.replace(':', '-');
			File outFileTemp = Paths.get(groupOutputDir.getAbsolutePath(), outputFilename).toFile();
			File outFile = FileHelper.serializeFilename(outFileTemp);
			if (!groupOutputDir.canWrite())
				return ResponseHelper.getErrorResponse(500, "Unable to write output file.",
						"The file " + outFile.getAbsolutePath() + " could not be created.", null);

			out = new FileOutputStream(outFile);
			byte[] buffer = new byte[1024];
			int bytesRead;
			while ((bytesRead = is.read(buffer)) != -1) {
				out.write(buffer, 0, bytesRead);
			}

			return (ResponseHelper.getBasicResponse(200, outFile.getAbsolutePath()));
		} catch (Throwable e) {
			logger.log(Level.SEVERE, "Unable to copy file a file.", e);
			// NotifyUserWithErrorMessage(request_site_table_id, filename,
			// senderUsername, i2b2AdminEmail, senderEmail, e);
			return ResponseHelper.getErrorResponse(500, "Unable to transfer file " + filename, null, e);
		} finally {
			try {
				if (is != null)
					is.close();
			} catch (Throwable t) {
				logger.log(Level.SEVERE, "Error while closing input stream during ");
			}
			try {
				if (out != null)
					out.close();
			} catch (Throwable t) {
				logger.log(Level.SEVERE, "Error while closing output stream during ");
			}

		}
	}

	@GET
	@Path("/is-update-available/")
	@Produces(MediaType.APPLICATION_JSON)
	public Response isUpdateAvailable() throws DaqueryException {
		Response resp = null;
		try {
			String currentBuild = AppProperties.getBuildNo();
			resp = WSConnectionUtil.centralServerGet("latest-build", null);
			if (resp.getStatus() == 200) {
				String jsonval = resp.readEntity(String.class);
				Map<String, String> jmap = JSONHelper.toMap(jsonval);
				if (Integer.parseInt(jmap.get("build_num")) > Integer.parseInt(currentBuild)) {
					return Response.ok(200).entity(jsonval).build();
				} else {
					return Response.ok(200).entity("{\"updateAvailable\": false}").build();
				}
			}

			return Response.ok(200).entity("{\"updateAvailable\": false}").build();
		} catch (Exception e) {
			AppProperties.setDBProperty("update_status", "failed");
			AppProperties.setDBProperty("update_message",
					"An unexpeced error occurred while updating the daquery application");
			logger.log(Level.SEVERE, "An unexpeced error occurred while checking is update available", e);
			return Response.ok(200).entity("{\"updateAvailable\": false}").build();

		} finally {
			if (resp != null)
				resp.close();
		}
	}

	@Secured(localRoles={"ADMIN"})
	@GET
	@Path("/system-update/")
	@Produces(MediaType.APPLICATION_JSON)
	public Response systemUpdate() throws DaqueryException {
		// Check Paths available.
		try {
			File f = new File(AppProperties.getHomeDirectory() + "/temp/");
			if (!f.canWrite()) {
				AppProperties.setDBProperty("update_status", "failed");
				AppProperties.setDBProperty("update_message", "Tomcat temp directory is not accessible.");
				logger.log(Level.SEVERE, "tomcat/temp is not exist or writable");
				return (ResponseHelper.getErrorResponse(500, "tomcat/temp is not exist or writable.",
						"tomcat/temp is not exist or writable. See the appication logs for more information.", null));
			}
		} catch (Throwable t) {
			logger.log(Level.SEVERE, "tomcat paths is not exist or accessible");
			return (ResponseHelper.getErrorResponse(500, "tomcat paths is not exist or accessible.",
					"tomcat paths is not exist or accessible. See the appication logs for more information.", null));
		}

		try {
			// Check script file list
			String[] fileNames = new String[] { "startup.sh", "shutdown.sh" };
			for (String n : fileNames) {
				File f = new File(AppProperties.getHomeDirectory() + "/bin/" + n);
				if (!(f.exists() && !f.isDirectory())) {
					AppProperties.setDBProperty("update_status", "failed");
					AppProperties.setDBProperty("update_message", "startup or(and) shutdown script is missing");
					logger.log(Level.SEVERE, n + "file missing");
					return (ResponseHelper.getErrorResponse(500, n + " file missing",
							n + "file missing. See the appication logs for more information.", null));
				}
			}
		} catch (Throwable t) {
			logger.log(Level.SEVERE, "tomcat script is not exist or accessible");
			return (ResponseHelper.getErrorResponse(500, "tomcat script is not exist or accessible.",
					"tomcat script is not exist or accessible. See the appication logs for more information.", null));
		}

		try {
			// Check if bash shell exist
			Process proc = Runtime.getRuntime().exec("echo $BASH_VERSION");
			proc.waitFor();

			StringBuilder sb = new StringBuilder();
			BufferedReader reader = new BufferedReader(new InputStreamReader(proc.getInputStream()));

			String line = "";
			while ((line = reader.readLine()) != null) {
				sb.append(line + "\n");
			}
			if (sb.toString().trim().equals("")) {
				AppProperties.setDBProperty("update_status", "failed");
				AppProperties.setDBProperty("update_message", "Bash is not the current shell");
				logger.log(Level.SEVERE, "bash is not the current shell");
				return (ResponseHelper.getErrorResponse(500, "bash is not running.",
						"bash is not running. See the appication logs for more information.", null));
			}
		} catch (Throwable t) {
			AppProperties.setDBProperty("update_status", "failed");
			AppProperties.setDBProperty("update_message",
					"An unexpeced error occurred while updating the daquery application");
			logger.log(Level.SEVERE, "An unexpeced error occurred while updating the daquery application", t);
			return (ResponseHelper.getErrorResponse(500, "An unexpected error occurred.",
					"An unexpected error occurred while updating the daquery application.  See the appication logs for more information.",
					t));
		}

		try {
			// Check Task Queues if empty
			boolean mainQueueClear = QueueManager.getNamedQueue(TaskQueue.MAIN_QUEUE).queueLength() == 0;
			boolean exportQueueClear = QueueManager.getNamedQueue(TaskQueue.EXPORT_QUEUE).queueLength() == 0;

			if (!mainQueueClear || !exportQueueClear) {
				AppProperties.setDBProperty("update_status", "failed");
				AppProperties.setDBProperty("update_message", "There are jobs are still running");
				logger.log(Level.SEVERE, "There are jobs are still running");
				return (ResponseHelper.getErrorResponse(500, "There are jobs are still running.",
						"There are jobs are still running. See the appication logs for more information.", null));
			}
		} catch (Throwable t) {
			AppProperties.setDBProperty("update_status", "failed");
			AppProperties.setDBProperty("update_message", "Error happen when check the task queues");
			logger.log(Level.SEVERE, "Error happen when check the task queues");
			return (ResponseHelper.getErrorResponse(500, "Error happen when check the task queues.",
					"Error happen when check the task queues. See the appication logs for more information.", null));
		}

		Response resp = null;
		try {
			String url = null;
			resp = WSConnectionUtil.centralServerGet("latest-build", null);
			if (resp.getStatus() == 200) {
				String jsonval = resp.readEntity(String.class);
				Map<String, String> jmap = JSONHelper.toMap(jsonval);
				url = jmap.get("package_url");
			}
			URL website = new URL(url);
			ReadableByteChannel rbc = Channels.newChannel(website.openStream());
			FileOutputStream fos = new FileOutputStream(AppProperties.getHomeDirectory() + "/temp/daquery_update.zip");
			fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);

			String zipFile = AppProperties.getHomeDirectory() + "/temp/daquery_update.zip";
			String destination = AppProperties.getHomeDirectory() + "/temp";

			ZipUtil zu = new ZipUtil();
			zu.unZip(zipFile, destination);

			// Check file list
			String[] fileNames = new String[] { "daquery.war", "update.sh" };
			for (String n : fileNames) {
				File f = new File(AppProperties.getHomeDirectory() + "/temp/daquery_update/daquery_update/" + n);
				if (!(f.exists() && !f.isDirectory())) {
					AppProperties.setDBProperty("update_status", "failed");
					AppProperties.setDBProperty("update_message", "Update file(s) missing");
					logger.log(Level.SEVERE, n + "file missing");
					return (ResponseHelper.getErrorResponse(500,
							"update zip file is not completed. " + n + " file missing",
							"update zip file is not completed. " + n
									+ " file missing. See the appication logs for more information.",
							null));
				}
			}

			// Mark database updating
			AppProperties.setDBProperty("update_status", "updating");

			logger.log(Level.SEVERE, "Before update!");
			Process proc = Runtime.getRuntime()
					.exec("chmod u+x " + destination + "/daquery_update/daquery_update/update.sh");
			String[] script = new String[] { "/bin/bash", "-c",
					destination + "/daquery_update/daquery_update/update.sh " + AppProperties.getHomeDirectory() };
			// String[] script = new String[]{"/bin/bash", "-c", "ls"};
			Runtime run = Runtime.getRuntime();
			proc = run.exec(script);
			// proc.waitFor();
			//
			// StringBuilder sb = new StringBuilder();
			// BufferedReader reader =
			// new BufferedReader(new InputStreamReader(proc.getInputStream()));
			//
			// String line = "";
			// while ((line = reader.readLine())!= null) {
			// sb.append(line + "\n");
			// }
			// logger.log(Level.INFO, sb.toString());
			logger.log(Level.SEVERE, "After update!");

			return Response.ok(200).entity("{}").build();
		} catch (Throwable t) {
			AppProperties.setDBProperty("update_status", "failed");
			AppProperties.setDBProperty("update_message",
					"An unexpeced error occurred while updating the daquery application");
			logger.log(Level.SEVERE, "An unexpeced error occurred while updating the daquery application", t);
			return (ResponseHelper.getErrorResponse(500, "An unexpected error occurred.",
					"An unexpected error occurred while updating the daquery application.  See the appication logs for more information.",
					t));
		} finally {
			if (resp != null)
				resp.close();
		}
	}
}

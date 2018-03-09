package edu.pitt.dbmi.daquery.common.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Target;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;

import org.glassfish.jersey.SslConfigurator;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.ClientProperties;
import org.glassfish.jersey.client.JerseyClient;
import org.glassfish.jersey.client.JerseyClientBuilder;
import org.glassfish.jersey.client.JerseyWebTarget;
import org.glassfish.jersey.client.RequestEntityProcessing;
import org.glassfish.jersey.media.multipart.FormDataMultiPart;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.media.multipart.file.FileDataBodyPart;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

import edu.pitt.dbmi.daquery.common.domain.ErrorInfo;
import edu.pitt.dbmi.daquery.common.domain.Site;

public class WSConnectionUtil {
 
	private final static Logger log = Logger.getLogger(WSConnectionUtil.class.getName());
/*	protected static SSLSocketFactory daquerySSLFactory = null;
	
	
	
	static
	{
		try {
			daquerySSLFactory = getDaqueryKeyStoreSSLFactory();
		} catch (Exception e) {
			log.log(Level.SEVERE, "Unable to set daquerySSLFactory");
			System.err.println("Unable to set daquerySSLFactory" + e.getMessage());
		}
	} */
	
	public static void main(String [] args)
	{
		System.out.println(checkConnection("dbmi-shrine-dev01.dbmi.pitt.edu", 2342));
	}
	
	/**
	 * Check a TCP connection.  Try to connect to a port, if it times out after two seconds
	 * @param server The DNS name or ip of the server
	 * @param port The port to try to connect to.
	 * @return
	 */
	public static boolean checkConnection(String server, Integer port)
	{
		try{
			Socket s = new Socket();
			s.connect(new InetSocketAddress(server, port), 2000);
			try{s.close();}catch(Throwable t){}
			return true;
	    } catch (Exception ex) {
	        /* ignore */
	    }
	    return false;
	}
	
	/**
	 * Return an SSLSocetFactory based on the Shrine keystore files found on this machine.
	 * The code assumes the keystore files are stored in the standard locations according to 
	 * Shrine's configuration file (ex: /opt/shrine/shrine.conf)
	 * @return- an SSLSocketFactory using the keystore information found on this machine. 
	 * @throws Exception
	 */
/*	public static SSLSocketFactory getDaqueryKeyStoreSSLFactory() throws Exception
	{
		if(daquerySSLFactory == null)
		{
			String keyStorePath = getKeystorePath();
			if(keyStorePath.isEmpty())
				throw new FileNotFoundException("Path to Shrine keystore not found.  Check Shrine configuration expected to find file here: " + keyStorePath +".");
			File keyStoreF = new File(keyStorePath);
			boolean exists = keyStoreF.exists();
			if(! exists)
				throw new FileNotFoundException("The Daquery keystore at " + keyStorePath + " was not found.  Check the Shrine configuration.");
			KeyStore shrineKeystore = KeyStore.getInstance(KeyStore.getDefaultType());
			FileInputStream keysIS = new FileInputStream(keyStoreF);
			shrineKeystore.load(keysIS, null);
			keysIS.close();
			TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
			tmf.init(shrineKeystore);
			SSLContext ctx = SSLContext.getInstance("TLS");
			ctx.init(null,  tmf.getTrustManagers(), null);
			daquerySSLFactory = ctx.getSocketFactory();
		}
		return(daquerySSLFactory);
	} */
	
	/**
	 * This method returns the keystore path for this machine's Shrine setup.  The keystore path is found within the
	 * shrine.conf file. The shrine.conf file is a HOCON format: 
	 * https://open.med.harvard.edu/wiki/display/SHRINE/Shrine.conf+File+-+SHRINE+1.22.8.
	 * It looks like JSON, but the format is slightly different.
	 * @return- a String containing the keystore path found in shrine.conf
	 */
	public static String getKeystorePath() {
		String retString = null;
		File configDir = new File(AppProperties.getHomeDirectory(), "lib");
		File configFile = new File(configDir, "shrine.conf");
        Config conf = ConfigFactory.parseFile(configFile);
        retString = conf.getString("shrine.keystore.file");

		return retString;
	}

	/**
	 * This method returns the keystore password for this machine's Shrine setup.  The keystore password is found within the
	 * shrine.conf file. The shrine.conf file is a HOCON format: 
	 * https://open.med.harvard.edu/wiki/display/SHRINE/Shrine.conf+File+-+SHRINE+1.22.8.
	 * It looks like JSON, but the format is slightly different.
	 * @return- a String containing the keystore password found in shrine.conf
	 */
	public static String getKeystorePassword() {
		String retString = null;
		File configDir = new File(AppProperties.getHomeDirectory(), "lib");
		File configFile = new File(configDir, "shrine.conf");
        Config conf = ConfigFactory.parseFile(configFile);
        retString = conf.getString("shrine.keystore.password");

		return retString;
	}
	
	public static List<KeystoreAlias> getAliasList() throws Exception {
		String keystorePath = getKeystorePath();
		log.info("Keystore path is: " + keystorePath);
		if (keystorePath == null) {
			throw new Exception("No keystore file found.");
		}
		String keystorePassword = getKeystorePassword();
		if (keystorePassword == null) {
			throw new Exception("No password for keystore found.");
		}
		InputStream is = null;
		//KeystoreAliasList retKAL = new KeystoreAliasList();
		List<KeystoreAlias> aliasList = new ArrayList<KeystoreAlias>();
		try {

	        File file = new File(keystorePath);
	        is = new FileInputStream(file);
	        KeyStore keystore = KeyStore.getInstance(KeyStore.getDefaultType());
	        keystore.load(is, keystorePassword.toCharArray());


	        Enumeration enumeration = keystore.aliases();
	        while(enumeration.hasMoreElements()) {
	            String alias = (String)enumeration.nextElement();
	            KeystoreAlias ka = new KeystoreAlias(alias);
	            aliasList.add(ka);
	            System.out.println("alias name: " + alias);
	            //Certificate certificate = keystore.getCertificate(alias);
	            //System.out.println(certificate.toString());

	        }

	    } catch (java.security.cert.CertificateException e) {
	        e.printStackTrace();
	    } catch (NoSuchAlgorithmException e) {
	        e.printStackTrace();
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } catch (KeyStoreException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }finally {
	        if(null != is)
	            try {
	                is.close();
	            } catch (IOException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }
	    }
		
		//retKAL.setAliasList(aliasList);
		return aliasList;
	}

	private static TrustManager [] allowSelfSignedTM = null;
	private static TrustManager [] getTrustingManager()
	{
		if(allowSelfSignedTM == null)
		{
			allowSelfSignedTM = new TrustManager[]
					{
						new X509TrustManager()
						{
							public java.security.cert.X509Certificate[] getAcceptedIssuers() {return null;}
							public void checkClientTrusted(java.security.cert.X509Certificate[] certs, String authType){}
							public void checkServerTrusted(java.security.cert.X509Certificate[] certs, String authType) {}
				       }
					}; 			
		}
		return(allowSelfSignedTM);
	}
	
	private static Client getRemoteClient(String url) throws KeyManagementException
	{
		Client client = null;
		//handle an HTTPS connection
		if (url.trim().startsWith("https")) {
			SslConfigurator sslConfig = SslConfigurator.newInstance()
					.securityProtocol("SSL");
					//.trustStoreFile(WSConnectionUtil.getKeystorePath())
					//.trustStorePassword(WSConnectionUtil.getKeystorePassword())
					//.trustStoreType("JKS")
			SSLContext sslContext = sslConfig.createSSLContext();
			
			sslContext.init(null, getTrustingManager(), new SecureRandom());
			
			//redefine the client variable to include the sslContext
			client = ClientBuilder.newBuilder().sslContext(sslContext).build();
		}
		else
		{
			client = ClientBuilder.newClient();
		}
		return(client);
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
		//add a trailing slash to the URL if it is missing from the site URL
		if (!siteUrl.endsWith("/")) {
			siteUrl = siteUrl + "/";
		}
		String sName = serviceName.trim();
		if(sName.startsWith("/"))
			sName = sName.substring(1); 
		retString = siteUrl + "daquery/ws/" + sName + args;
		return retString;
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
	public static Response postJSONToRemoteSite(Site site, String serviceName, String json, String securityToken)
	{
		Client client = null;
		Entity<String> ent = Entity.entity(json, MediaType.APPLICATION_JSON_TYPE);
		
		Builder respBuilder = null;
		
		try
		{
			URL url = new URL(site.getUrl());
			if(!checkConnection(url.getHost(), url.getPort()))
					return(ResponseHelper.getErrorResponse(500, "Server is not reachable at site " + site.getName(), "Cannot connect to " + url.getHost(), null));
			
			client = getRemoteClient(site.getUrl());
		}
		catch(KeyManagementException kme)
		{
			return(ResponseHelper.getErrorResponse(500, "Unable to contact remote site " + site.getName(), "An error happened while configuring the secure key management for the site POST connection.", kme));
		}
		catch(MalformedURLException mue)
		{
			return(ResponseHelper.getErrorResponse(500, "Unable to contact remote site, bad site address.  Site:" + site.getName(), "This was due to a malformed url: " + site.getUrl(), mue));
		}
		
		respBuilder = client.target(site.getUrl() + "daquery/ws/" + serviceName).request(MediaType.APPLICATION_JSON);

		if(securityToken != null)
			respBuilder = respBuilder.header("Authorization", securityToken);
		
		Response resp  = respBuilder.post(ent);
		
		return(resp);
	}	
	/**
	 * This method executes a GET against a remote site.  If the connection is made via https, 
	 * the local site's keystore is examined.  The keystore file and keystore password are used 
	 * to create an SSL connection to the remote site.  For this call to work, the local site's
	 * certificate must be included in the remote site's keystore.  The alias for the certificate
	 * must match the local site's IP address or a resolvable server name.
	 * @param site- an object representing the remote site.
	 * @param serviceName- the portion of the URL to be contacted at the remote site (ex: sites/all)
	 * @param arguments- a Map of the parameters for the serviceName
	 * @param jwToken- the current JWToken
	 * @return- a Response object representing the response from the remote site (most likely JSON)
	 * @throws UnsupportedEncodingException
	 */
	public static Response getFromRemoteSite(Site site, String serviceName, Map<String, String> arguments, String jwToken) throws UnsupportedEncodingException
	{
		Client client = null;
		Response resp = null;
		String getURL = buildGetUrl(site.getUrl(), serviceName, arguments);
		
		
		try
		{
			URL url = new URL(getURL);
			if(!checkConnection(url.getHost(), url.getPort()))
					return(ResponseHelper.getErrorResponse(500, "Server is not reachable for site " + site.getName() + ".", "Cannot connect to " + url.getHost(), null));

			client = getRemoteClient(site.getUrl());
		}
		catch(KeyManagementException kme)
		{
			return(ResponseHelper.getErrorResponse(500, "Unable to contact remote site " + site.getName(), "An error happened while configuring the secure key management for the site GET connection.", kme));
		}
		catch(MalformedURLException mue)
		{
			return(ResponseHelper.getErrorResponse(500, "Unable to contact remote site, bad site address for site " + site.getName() + ".", "This was due to a malformed url: " + getURL, mue));
		}


		Builder builder = client.target(getURL)
				.request(MediaType.APPLICATION_JSON); //.get();
		if(!StringHelper.isEmpty(jwToken))
			builder = builder.header("Authorization", "Bearer " + jwToken);
		resp = builder.get();
		return(resp);
	}
	
	public static void sendFileToSite(File localFileAndPath, String outputFilename, Site toSite) throws DaqueryErrorException
	{
		FormDataMultiPart fdmp1 = null;
		try
		{
			Map<String, String> args = new HashMap<String, String>();
			args.put("filename", URLEncoder.encode(outputFilename, "UTF-8"));			
			
			if(! localFileAndPath.exists())
				throw new DaqueryException("File " + localFileAndPath.getName() + " being sent to site " + toSite.getName() + " does not exist.");
			
			Client client = ClientBuilder.newBuilder().register(MultiPartFeature.class).build();
				   client.property(ClientProperties.CHUNKED_ENCODING_SIZE, 1024);
			FileDataBodyPart filePart = new FileDataBodyPart("file", localFileAndPath);
			fdmp1 = new FormDataMultiPart();
			FormDataMultiPart fdmp = (FormDataMultiPart) fdmp1.bodyPart(filePart);
			WebTarget target = client.target(buildGetUrl(toSite.getUrl(), "receive-data-file", args));
			target.property(ClientProperties.REQUEST_ENTITY_PROCESSING, RequestEntityProcessing.CHUNKED);
			target.property(ClientProperties.CHUNKED_ENCODING_SIZE, 1024);
			
			Response response = target.request(fdmp.getMediaType()).post(Entity.entity(fdmp, fdmp.getMediaType()));
		
			if(response.getStatus() != 200)
			{
				ErrorInfo ei = new ErrorInfo();
				String msg = "An error occured while transfering " + outputFilename + " to site " + toSite.getName();
				ei.setDisplayMessage(msg);
				DaqueryErrorException dee = new DaqueryErrorException(msg, ei);
				throw dee;
			}
			
		}
		catch(DaqueryErrorException dee)
		{
			throw dee;
		}
		catch(Throwable t)
		{
				ErrorInfo ei = new ErrorInfo();
				String msg = "An unexpected error occured while transfering " + outputFilename + " to site " + toSite.getName();
				ei.setDisplayMessage(msg);
				DaqueryErrorException dee = new DaqueryErrorException(msg, t, ei);
				throw dee;			
		}
		finally
		{
			try{if(fdmp1 != null) fdmp1.close();}catch(Throwable t1){log.log(Level.SEVERE, "", t1);}
		}
	}
	
	public static Response callCentralServer(String serviceName, Map<String, String> additionalParameters) throws DaqueryException
	{
		Response authResp = null;
		String centServerURL = null;
		try
		{
			String siteId = AppProperties.getDBProperty("site.id");
			String siteKey = AppProperties.getDBProperty("central.site.key");
			authResp = callCentralServerAuth(siteId, siteKey);
			if(authResp.getStatus() != 200)
				return(ResponseHelper.wrapServerResponse(authResp, "Central Server Auth"));
			//TODO grab the token from the auth response and send it along with the call
			centServerURL = AppProperties.getCentralServerURL();
			String url = centServerURL + "/daquery-central/" +  serviceName;
			if(additionalParameters != null)
			{
				String paramDivider = "?";
				if(url.contains("?"))
					paramDivider = "&";			
				boolean firstParam = true;
				for(String key :additionalParameters.keySet())
				{
					url = url + paramDivider + key + "=" + additionalParameters.get(key);
					if(firstParam)
					{
						paramDivider = "&";
						firstParam = false;
					}
				}
			}
			
			URL cUrl = new URL(centServerURL);
			if(!checkConnection(cUrl.getHost(), cUrl.getPort()))
					return(ResponseHelper.getErrorResponse(500, "The central server is not reachable.", "Cannot connect to " + centServerURL, null));			
			Client client = getRemoteClient(url);			
			Response rVal = client.target(url).request(MediaType.APPLICATION_JSON).get();
			return(rVal);			
		}
		catch(KeyManagementException kme)
		{
			return(ResponseHelper.getErrorResponse(500, "Unable to contact central server.", "An error happened while configuring the secure key management for the site connection.", kme));
		}
		catch(MalformedURLException mue)
		{
			return(ResponseHelper.getErrorResponse(500, "Unable to contact the central server because of a bad site address." , "This was due to a malformed url: " + centServerURL, mue));
		}
		finally
		{
			if(authResp != null) authResp.close();
		}
	}
	
	public static Response callCentralServerAuth(String siteName, String siteKey) throws DaqueryException
	{
		Map<String, String> params = new HashMap<String, String>();
		params.put("site", siteName);
		params.put("key", siteKey);
		String centServerURL = AppProperties.getCentralServerURL();
		String url = centServerURL + "/daquery-central/authenticateSite?site=" +siteName + "&key=" + siteKey;
		Client client = null;
		try
		{
			URL cUrl = new URL(centServerURL);
			if(!checkConnection(cUrl.getHost(), cUrl.getPort()))
					return(ResponseHelper.getErrorResponse(500, "The central server is not reachable.", "Cannot connect to " + centServerURL, null));			
			client = getRemoteClient(url);
			Response answer = client.target(url).request(MediaType.APPLICATION_JSON).get();
			return(answer);

		}
		catch(KeyManagementException kme)
		{
			return(ResponseHelper.getErrorResponse(500, "Unable to contact central server during authentication.", "An error happened while configuring the secure key management for the site connection.", kme));
		}
		catch(MalformedURLException mue)
		{
			return(ResponseHelper.getErrorResponse(500, "Unable to contact the central server because of a bad site address." , "This was due to a malformed url: " + centServerURL, mue));
		}
	}		
}

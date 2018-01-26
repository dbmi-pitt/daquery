package edu.pitt.dbmi.daquery.rest.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.Certificate;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManagerFactory;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

import edu.pitt.dbmi.daquery.common.util.AppProperties;

public class WSConnectionUtil {
 
	
	protected static SSLSocketFactory daquerySSLFactory = null;
	private final static Logger log = Logger.getLogger(WSConnectionUtil.class.getName());
	
	
	static
	{
		try {
			daquerySSLFactory = getDaqueryKeyStoreSSLFactory();
		} catch (Exception e) {
			log.log(Level.SEVERE, "Unable to set daquerySSLFactory");
			System.err.println("Unable to set daquerySSLFactory" + e.getMessage());
		}
	}
	
	/**
	 * Return an SSLSocetFactory based on the Shrine keystore files found on this machine.
	 * The code assumes the keystore files are stored in the standard locations according to 
	 * Shrine's configuration file (ex: /opt/shrine/shrine.conf)
	 * @return- an SSLSocketFactory using the keystore information found on this machine. 
	 * @throws Exception
	 */
	public static SSLSocketFactory getDaqueryKeyStoreSSLFactory() throws Exception
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
	}
	
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
	
}

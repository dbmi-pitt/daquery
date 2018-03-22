package edu.pitt.dbmi.daquery.dev;

import java.net.MalformedURLException;
import java.net.URL;
import java.security.cert.Certificate;
import java.io.*;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class HttpsTester
{
	public static void main(String[] args)
	{
		new HttpsTester().test();
	}

	private void test()
	{
		//FROM HERE===================================
		
		//Install a trust manager that ignores certificate chains
		TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager(){
			public java.security.cert.X509Certificate[] getAcceptedIssuers() {return null;}
			public void checkClientTrusted(java.security.cert.X509Certificate[] certs, String authType){}
			public void checkServerTrusted(java.security.cert.X509Certificate[] certs, String authType) {}
	       }
		}; 

		try
		{
			SSLContext sc = SSLContext.getInstance("SSL");
			sc.init(null, trustAllCerts, new java.security.SecureRandom());
			HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
		}
		catch (Exception e) { /*need to handle these*/} 

	   //TO HERE======================================

		String urlStr = "https://pathi2b2-test.dbmi.pitt.edu:6443/";
		URL url;
		try
		{
			url = new URL(urlStr);
			HttpsURLConnection con = (HttpsURLConnection)url.openConnection();
		
			//dumpl all cert info
			print_https_cert(con);
		
			//dump all the content
			print_content(con);
		
		}
		catch (MalformedURLException me)
		{
			me.printStackTrace();
		} 
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}

	private void print_https_cert(HttpsURLConnection con)
	{
		if(con!=null){
			try
			{
				System.out.println("Response Code : " + con.getResponseCode());
				System.out.println("Cipher Suite : " + con.getCipherSuite());
				System.out.println("\n");
		
				Certificate[] certs = con.getServerCertificates();
				for(Certificate cert : certs)
				{
					System.out.println("Cert Type : " + cert.getType());
					System.out.println("Cert Hash Code : " + cert.hashCode());
					System.out.println("Cert Public Key Algorithm : " + cert.getPublicKey().getAlgorithm());
					System.out.println("Cert Public Key Format : " + cert.getPublicKey().getFormat());
					System.out.println("\n");
				}
			}
			catch (SSLPeerUnverifiedException e)
			{
				e.printStackTrace();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

	private void print_content(HttpsURLConnection con)
	{
		if(con!=null)
		{
			try
			{
				System.out.println("****** Content of the URL ********");
				BufferedReader br =new BufferedReader(new InputStreamReader(con.getInputStream()));
				String input;
				while ((input = br.readLine()) != null)
				{
					System.out.println(input);
				}
				br.close();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
   }
}
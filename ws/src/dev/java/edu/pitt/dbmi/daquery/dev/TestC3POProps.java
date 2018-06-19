package edu.pitt.dbmi.daquery.dev;

import java.util.List;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.C3P0Properties;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.common.util.StringHelper;

public class TestC3POProps
{
	public static void main(String [] args) throws DaqueryException
	{
		AppProperties.setDevHomeDir("/opt/apache-tomcat-6.0.53/conf");
		ComboPooledDataSource ds = new ComboPooledDataSource();
		
		List<String> names = C3P0Properties.getPropertyNames();
		for(String name : names)
		{
			System.out.println(name);
			if(StringHelper.startsWithIgnoreCase(name, "c3p0."))
			{
				String value = C3P0Properties.getProperty(name);
				String propertyName = name.substring(5);
			}
				
				
		}
		
		//String v = C3P0Properties.getProperty("c3p0.preferredTestQuery");

	}
}

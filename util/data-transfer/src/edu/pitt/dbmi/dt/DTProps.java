package edu.pitt.dbmi.dt;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import edu.pitt.dbmi.util.StringHelper;

public class DTProps
{
	public static void main(String [] args)
	{
		System.out.println(getProperty("HARVEST_SELECT"));
	}
	private static Properties props = null;
	public static Properties getProps()
	{
		if(props == null)
		{
			InputStream is = DTProps.class.getResourceAsStream("/dt.props");
			props = new Properties();
			try{props.load(is);}
			catch(Throwable t)
			{
				t.printStackTrace();
				return(null);
			}
		}
		return(props);
	}
	
	public static String getProperty(String propertyName)
	{
		return(getProperty(propertyName, ""));
	}
	
	public static String getProperty(String propertyName, String defaultValue)
	{
		Properties properties = getProps();
		if(properties == null) return(defaultValue);
		return(properties.getProperty(propertyName, defaultValue));
	}
	
	/**
	 * Return a list of values from a comma separated list
	 * @param propertyName
	 * @return
	 */
	public static List<String> getValues(String propertyName)
	{
		String vals = getProperty(propertyName, "");
		if(! StringHelper.isEmpty(vals))
		{
			return(Arrays.asList(vals.split("\\s*,\\s*")));
		}
		else
			return(null);
		
	}
}

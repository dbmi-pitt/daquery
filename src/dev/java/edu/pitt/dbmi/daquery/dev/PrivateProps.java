package edu.pitt.dbmi.daquery.dev;

import java.io.InputStream;
import java.util.Properties;

public class PrivateProps
{
	private static Properties props = null;
	public static Properties getProps()
	{
		if(props == null)
		{
			InputStream is = PrivateProps.class.getResourceAsStream("/edu/pitt/dbmi/daquery/dev/private-data.props");
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
}

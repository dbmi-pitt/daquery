package edu.pitt.dbmi.daquery.common.domain;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * A class to hold simple site information.
 *
 */
public class SiteInfo extends DaqueryObject
{
	public String id;
	public String accessKey;
	public boolean tempKey;
	public String siteName;
	public boolean emailAccess;
	public String siteURL;
	
	public SiteInfo(){}
	
	public SiteInfo(ResultSet rs) throws SQLException
	{
		id = rs.getString("id");
		accessKey = rs.getString("access_key");
		tempKey = rs.getBoolean("tempkey");
		siteName = rs.getString("name");
		emailAccess = rs.getBoolean("email_access");
		siteURL = rs.getString("site_url");
	}
}
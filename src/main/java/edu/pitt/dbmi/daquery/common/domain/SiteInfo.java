package edu.pitt.dbmi.daquery.common.domain;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.google.gson.annotations.Expose;

/**
 * A class to hold simple site information.
 *
 */
public class SiteInfo extends DaqueryObject
{
	@Expose
	public String id;
	@Expose
	public String siteName;	
	@Expose
	public String siteURL;
	@Expose
	public boolean emailAccess;

	public SiteInfo(){}
	
	public SiteInfo(ResultSet rs) throws SQLException
	{
		id = rs.getString("id");
		siteName = rs.getString("name");
		emailAccess = rs.getBoolean("email_access");
		siteURL = rs.getString("site_url");
	}
}
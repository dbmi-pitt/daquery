package edu.pitt.dbmi.daquery.central;

import java.sql.ResultSet;
import java.sql.SQLException;

import edu.pitt.dbmi.daquery.common.domain.SiteInfo;

public class ExtendedSiteInfo extends SiteInfo
{
	public String accessKey;
	public boolean tempKey;

	public ExtendedSiteInfo(){}
	public ExtendedSiteInfo(ResultSet rs) throws SQLException
	{
		super(rs);
		accessKey = rs.getString("access_key");
		tempKey = rs.getBoolean("tempkey");		
	}
}

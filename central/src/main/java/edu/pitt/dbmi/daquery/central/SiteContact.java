package edu.pitt.dbmi.daquery.central;

import java.sql.ResultSet;
import java.sql.SQLException;


public class SiteContact {
	public String siteId;
	public String userId;
	public String email;
	public String realName;
	
	public SiteContact() {}
	public SiteContact(ResultSet rs) throws SQLException {
		this.siteId = rs.getString("site_id");
		this.userId = rs.getString("user_id");
		this.email = rs.getString("email");
		this.realName = rs.getString("real_name");
	}
}

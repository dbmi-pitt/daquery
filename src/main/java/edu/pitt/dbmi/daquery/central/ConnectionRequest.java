package edu.pitt.dbmi.daquery.central;

import java.sql.ResultSet;
import java.sql.SQLException;


public class ConnectionRequest {
	public String networkId;
	public String fromSiteId;
	public String toSiteId;
	
	public ConnectionRequest() {}
	public ConnectionRequest(ResultSet rs) throws SQLException {
		this.networkId = rs.getString("network_id");
		this.fromSiteId = rs.getString("from_site_id");
		this.toSiteId = rs.getString("to_site_id");
	}
}

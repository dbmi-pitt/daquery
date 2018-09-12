package edu.pitt.dbmi.daquery.central;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import edu.pitt.dbmi.daquery.common.domain.DaqueryObject;

public class DaqueryVersion extends DaqueryObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 395899689858695419L;
	
	public Integer build_num;
	public String package_url;
	public Date release_date;
	public String version;
	public Boolean force_update;
	
	
	public DaqueryVersion() {}
	public DaqueryVersion(ResultSet rs) throws SQLException, ParseException {
		this.build_num = Integer.parseInt(rs.getString("build_num"));
		this.package_url = rs.getString("package_url");
		this.release_date = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSSS").parse(rs.getString("release_date"));
		this.version = rs.getString("version");
		this.force_update = Boolean.parseBoolean(rs.getString("force_update"));
	}
}

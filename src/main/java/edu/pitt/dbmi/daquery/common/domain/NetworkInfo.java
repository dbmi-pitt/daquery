package edu.pitt.dbmi.daquery.common.domain;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;

public class NetworkInfo extends DaqueryObject
{
	private static final long serialVersionUID = 392782092723l;
	
	@Expose
	public String id;
	@Expose
	public String name;
	
	@Expose
	public DataModel dataModel;
	
	@Expose
	public List<SiteInfo> allowedSites = new ArrayList<SiteInfo>();

}

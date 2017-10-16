package edu.pitt.dbmi.daquery.common.domain;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;

public class NetworkInfo extends DaqueryObject
{
	@Expose
	public String id;
	@Expose
	public String name;
	@Expose
	public String dataModel;
	@Expose
	public List<SiteInfo> allowedSites = new ArrayList<SiteInfo>();		
}

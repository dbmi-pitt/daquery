package edu.pitt.dbmi.daquery.common.domain;

import java.util.ArrayList;
import java.util.List;

public class NetworkInfo extends DaqueryObject
{
	public String id;
	public String name;
	public List<SiteInfo> allowedSites = new ArrayList<SiteInfo>();		
}

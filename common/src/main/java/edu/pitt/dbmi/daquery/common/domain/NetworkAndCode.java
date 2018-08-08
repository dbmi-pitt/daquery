package edu.pitt.dbmi.daquery.common.domain;

import com.google.gson.annotations.Expose;

public class NetworkAndCode extends DaqueryObject
{
	@Expose private String networkUuid;
	@Expose private String sqlCode;
	
	public String getNetworkUuid(){return(networkUuid);}
	public void setNetworkUuid(String uuid){networkUuid = uuid;}
	
	public String getSqlCode(){return(sqlCode);}
	public void setSqlCode(String code){sqlCode = code;}
}

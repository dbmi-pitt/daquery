package edu.pitt.dbmi.daquery.common.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.google.gson.annotations.Expose;

@Entity
@Table(name="SITE_CONNECTION")
public class SiteConnection extends DaqueryObject
{

	@Expose
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="SITE_ID")
	private Site site;
	
	@Expose
	private String status;
	
	public Site getSite(){return(site);}
	public void setSite(Site s){site = s;}
	
	public String getStatus(){return(status);}
	public void setStatus(String stat){status = stat;}
	
	@Transient
	public SiteStatus getStatusValue() {
		if (status == null) {
			return null;
		}
		return SiteStatus.valueOf(status);
	}

	public void setStatusValue(SiteStatus statusValue) {
		if (statusValue == null) {
			status = null;
		} else {
			status = statusValue.name();
		}
	}
}

package edu.pitt.dbmi.daquery.domain.inquiry;

import java.util.Date;
import java.util.Set;

import edu.pitt.dbmi.daquery.domain.Site;

public interface OutgoingInquiry
{

	public Set<Site> getSites();
	public Date sentDate();
	
}

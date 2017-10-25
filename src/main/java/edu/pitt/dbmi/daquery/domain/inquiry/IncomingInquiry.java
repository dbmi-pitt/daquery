package edu.pitt.dbmi.daquery.domain.inquiry;

import java.util.Date;

import edu.pitt.dbmi.daquery.domain.Site;

public interface IncomingInquiry
{
	public Site getSite();
	public Date receiveDate();
	
}

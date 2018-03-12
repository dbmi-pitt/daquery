package edu.pitt.dbmi.daquery.common.domain;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;

public class EmailContents extends DaqueryObject
{
	private static final long serialVersionUID = 98837383453453l;
	
	@Expose public List<String> toAddresses = new ArrayList<String>();
	@Expose public String subject;
	@Expose public String message;
	
}

package edu.pitt.dbmi.daquery.common.util;

import com.google.gson.annotations.Expose;

import edu.pitt.dbmi.daquery.common.domain.DaqueryObject;

public class DataBaseTestResult extends DaqueryObject{
	@Expose
	boolean result;
	@Expose
	String errorMsg;
	@Expose
	String detailErrorMsg;
	
	public DataBaseTestResult(boolean result, String errorMsg, String detailErrorMsg) {
		super();
		this.result = result;
		this.errorMsg = errorMsg;
		this.detailErrorMsg = detailErrorMsg;
	}
}

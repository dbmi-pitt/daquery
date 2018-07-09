package edu.pitt.dbmi.daquery.common.domain.inquiry;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import edu.pitt.dbmi.daquery.common.domain.inquiry.InquiryType.TYPES;

public enum QueryType {	
	AGGREGATE_QUERY("AGGREGATE"),
	DATA_QUERY("DATA"),
	TABLE_QUERY("TABLE");
	
	String value = null;
	
	QueryType(String val){
		this.value = val;
	}
	
	@Override
	public String toString(){
		return this.name();
	}
}
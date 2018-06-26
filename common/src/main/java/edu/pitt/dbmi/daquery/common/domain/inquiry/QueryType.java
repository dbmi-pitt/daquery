package edu.pitt.dbmi.daquery.common.domain.inquiry;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import edu.pitt.dbmi.daquery.common.domain.inquiry.InquiryType.TYPES;

public enum QueryType {	
	AGGREGATE_QUERY(1),
	DATA_QUERY(2),
	TABLE_QUERY(3);
	
	int val;
	private String jsonValue;
	
	QueryType(int val){
		this.val = val;
	}
	
	@Override
	public String toString(){
		return this.name();
	}
}
package edu.pitt.dbmi.daquery.common.domain.inquiry;

public enum QueryType {	
	AGGREGATE("AGGREGATE"),
	DATA("DATA"),
	TABLE("TABLE");
	
	String value = null;
	
	QueryType(String val){
		this.value = val;
	}
	
	@Override
	public String toString(){
		return this.name();
	}
}
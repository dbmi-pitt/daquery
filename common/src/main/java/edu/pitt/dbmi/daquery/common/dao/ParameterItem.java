package edu.pitt.dbmi.daquery.common.dao;

/**
 * This inner class holds the database query parameter pairing for 
 * queries.  Each pairing is a string and object.
 * This object is stored in a List and then looped
 * when building the query.
 * @author devuser
 *
 */
public class ParameterItem {

	public String paramName;
	public Object paramObject;
	
	public ParameterItem(String name, Object obj) {
		this.paramName = name;
		this.paramObject = obj;
	}
	
	public String getParamName() {
		return this.paramName;
	}
	
	public Object getParamObject() {
		return this.paramObject;
	}
}

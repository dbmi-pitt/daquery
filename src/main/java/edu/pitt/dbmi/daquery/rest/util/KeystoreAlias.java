package edu.pitt.dbmi.daquery.rest.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.google.gson.annotations.Expose;

import edu.pitt.dbmi.daquery.common.domain.DaqueryObject;

public class KeystoreAlias extends DaqueryObject {

	@Expose
	private String aliasName;
	
	public KeystoreAlias() {		
	}
	
	public KeystoreAlias(String newAlias) {
		this.setAliasName(newAlias);
	}

	public String getAliasName() {
		return aliasName;
	}

	public void setAliasName(String name) {
		this.aliasName = name;
	}
	

}

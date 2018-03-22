package edu.pitt.dbmi.daquery.sql.domain;

import java.util.List;

public interface SQLPhrase extends SQLFragment {

	public String toString();
	public List<SQLFragment> children();
	
}

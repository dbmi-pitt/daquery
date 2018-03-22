package edu.pitt.dbmi.daquery.sql.domain;

public interface QuerySegment {

	public boolean check() throws SQLConversionError;
	
}

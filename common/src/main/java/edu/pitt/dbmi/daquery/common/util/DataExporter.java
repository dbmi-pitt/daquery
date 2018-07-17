package edu.pitt.dbmi.daquery.common.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public interface DataExporter {
	
	public void init(Connection conn, Statement st, ResultSet rs, String sql) throws Throwable;
	
	public int getNumFiles();
	
	public boolean hasNextExport();
	
	public String exportNext() throws Throwable;
	
	public void writeTrackingFile() throws IOException, DaqueryErrorException, DaqueryException;
	
	public void close() throws IOException;
}

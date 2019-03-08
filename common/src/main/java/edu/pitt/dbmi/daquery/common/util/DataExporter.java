package edu.pitt.dbmi.daquery.common.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import edu.pitt.dbmi.daquery.common.domain.DataSource;
import edu.pitt.dbmi.daquery.common.domain.SQLDataSource;

public interface DataExporter {
	
	public boolean init(Connection conn, ResultSet rs, String sql, SQLDataSource ds, String tempTableName) throws Throwable;
	
	public int getNumFiles();
	
	public boolean hasNextExport();
	
	public String exportNext(Connection conn, String tempTableName) throws Throwable;
	
	public void writeTrackingFile() throws IOException, DaqueryErrorException, DaqueryException;
	
	public void close() throws IOException;

	public int getCasesPerFile();
	
	public String getFailureMessage();
}

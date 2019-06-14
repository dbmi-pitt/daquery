package edu.pitt.dbmi.daquery.common.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.pitt.dbmi.daquery.common.domain.DataModel;
import edu.pitt.dbmi.daquery.common.domain.SQLDataSource;
import edu.pitt.dbmi.daquery.common.domain.SourceType;
import edu.pitt.dbmi.daquery.common.domain.inquiry.DaqueryRequest;
import edu.pitt.dbmi.daquery.common.domain.inquiry.DaqueryResponse;
import edu.pitt.dbmi.daquery.sql.ReturnColumn;
import edu.pitt.dbmi.daquery.sql.ReturnFieldsAnalyzer;
import edu.pitt.dbmi.daquery.sql.domain.DeIdTag;

public class TableExporter extends AbstractExporter implements DataExporter {
		
	private int rowsPerFile;
	private int nFiles = 1;
	private String sqlCode;
	private String failureMessage;
	private ReturnFieldsAnalyzer sqlAnalyzer;
	private int currentFile = 0;
	
	private final static Logger logger = Logger.getLogger(TableExporter.class.getName());
	
	public TableExporter(DaqueryResponse response, DataModel model, String dataDir) throws DaqueryException{
		super(response, model, dataDir);

		rowsPerFile = 1000;
	}
	
	@Override
	public boolean init(Connection conn, ResultSet rs, String sql, SQLDataSource ds, String tempTableName)
			throws Throwable {
		this.sqlCode = sql;
		sqlAnalyzer = new ReturnFieldsAnalyzer(sql, model);
		if(sqlAnalyzer.isRejected())
		{
			failureMessage = sqlAnalyzer.getRejectionMessage();
			return(false);
		}
		return true;
	}
	
	@Override
	public String getFailureMessage(){return(failureMessage);}
	
	@Override
	public int getNumFiles() {
		return(nFiles);
	}
	
	@Override
	public boolean hasNextExport() {
		if(currentFile < nFiles)
			return(true);
		else
			return(false);
	}

	@Override
	public String exportNext(Connection conn, String tempTableName) throws Throwable {
		try
		{
			//just make sure all is okay with the tracking file writer before doing any export- several errors could get thrown from this call
			//getTrackingFileWriter();
			
			if(! hasNextExport()) return null;
			
			currentFile++;

			File tmpDir = FileHelper.createExportTempDirectory();
			File zipFile = dumpData(conn, tmpDir, daqueryRequest, currentFile, nFiles, rowsPerFile);
	
			//send the file to remote requester
			String outputFilename = daqueryRequest.getFilePrefix() + "_" + currentFile + ".zip";
			
			String filename = null;
			if(deliverData) {
				filename = WSConnectionUtil.sendFileToSite(zipFile, outputFilename, daqueryRequest.getRequesterSite(), daqueryResponse.getRequest().getRequestGroup());
			}
			else
			{
				File downDir = new File(AppProperties.getLocalDeliveryDir());
				FileHelper.checkAndCreateDir(downDir);
				Path p = Paths.get(AppProperties.getLocalDeliveryDir(), outputFilename);
				Files.copy(zipFile.toPath(), p, StandardCopyOption.REPLACE_EXISTING);
				filename = p.toString();
			}	
			FileHelper.deleteDirectory(tmpDir);
			return(filename);

		} catch (Throwable t) {
			logger.log(Level.SEVERE, "An error occurred during the ", t);
			if(t instanceof DaqueryErrorException)
			{
				DaqueryErrorException dee = (DaqueryErrorException) t;
				logger.log(Level.SEVERE, "Error Message: " + dee.getMessage());
				if(dee.getCause() != null)
					logger.log(Level.SEVERE, "Detailed Error Message: " + dee.getErrorInfo(), dee.getCause());
				else
					logger.log(Level.SEVERE, "Detailed Error Message: " + dee.getErrorInfo());
			}
			throw t;
		}
	}

	@Override
	public void writeTrackingFile() throws IOException, DaqueryErrorException, DaqueryException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		
	}
	
	private File dumpData(Connection conn, File tmpDir, DaqueryRequest daqueryRequest, int currentFileNumber, int pageCount, int rowPerFile) throws Throwable
	{
		String filenamePrefix = daqueryRequest.getFilePrefix();
//		Hashtable<OutputFile, OutputStreamWriter> outputStreams = new Hashtable<>();
//		for(OutputFile outputfile : this.dataExportConfig.outputFiles){
//			if(outputfile.source == null){
//				FileOutputStream ontologyOutputStream = null;
//				String ontologyFilename = filenamePrefix + "-" + outputfile.name;
//				ontologyOutputStream = new FileOutputStream(new File(tmpDir.getAbsolutePath() + File.separator + ontologyFilename));
//				
//				outputStreams.put(outputfile, new OutputStreamWriter(ontologyOutputStream));
//				
//			}else{
//				writeCustomCSVFile(new OutputStreamWriter(new FileOutputStream(new File(tmpDir.getAbsolutePath() + File.separator + filenamePrefix + "-" + outputfile.name))), daqueryRequest, currentFileNumber, patientsPerFile, outputfile);
//			}
//		}
//		
//		// writeOntologyCSVFile(outputStreams, daqueryRequest, currPage, pageSize, this.conceptCDs);	
//		
//		for(OutputStreamWriter w : outputStreams.values()){
//			w.close();
//		}
		
/*
 * 
getSerializedId(patientNum);
threeDigitZip(rs.getString(j), threeDigitZip);
handleBirthday(patientNum, rs.getDate(j)));
csvSafeString(dateShift(patientNum, (Date)obj));
dateShift

		
 */
		
//		SQLDataSource ds = (SQLDataSource) daqueryRequest.getNetwork().getDataModels().iterator().next().getDataSource(SourceType.SQL);
//		conn = ds.getConnection();
		ResultSet rs = null;
		
		String runSQL = sqlCode.trim();
		if(runSQL.endsWith(";"))
			runSQL = runSQL.substring(0, runSQL.length() - 1);
		Statement s = conn.createStatement();
		rs = s.executeQuery(runSQL);
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnCount = rsmd.getColumnCount();
		List<ReturnColumn> returnColumns = sqlAnalyzer.getReturnColumns();
		if(columnCount != returnColumns.size())
			throw new DaqueryException("The number of columns returned by the query (" + columnCount + ") does not match the number of columns recieved by the SQL analyzer (" + returnColumns.size() + ")");
		
		OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(new File(tmpDir.getAbsolutePath() + File.separator + filenamePrefix + "Table.csv")));
		
		//write header
		boolean first = true;
		for(ReturnColumn col : returnColumns)
		{
			String comma = ", ";
			if(first)
			{
				comma = "";
				first = false;
			}
			writer.write(comma + csvSafeString(col.column.getDisplayName()));
		}
/*		for(int i = 1; i <= columnCount; i++) {
			writer.write(rsmd.getColumnName(i));
			if(i < columnCount)
				writer.write(", ");
		} */
		
		writer.write("\n");
		while (rs.next()) {
			for(int i = 1; i <= columnCount; i++) {
				writeValue(writer, rs, i, returnColumns.get(i - 1));
				//writer.write(rs.getString(i) == null ? "(null)" : rs.getString(i));
				if(i < columnCount)
					writer.write(", ");
			}
			writer.write("\n");
		}
		
		writer.close();
		
		//create a zip file containing the two files that we just wrote			
		File zipFile = new File(tmpDir.getAbsolutePath() + File.separator + daqueryRequest.getFilePrefix() + ".zip");
		FileHelper.zipDirectory(tmpDir, zipFile, false);

		rs.close();
		s.close();

		return zipFile;
	}

	private void writeValue(OutputStreamWriter writer, ResultSet rs, int colNum, ReturnColumn retCol) throws SQLException, DaqueryException, IOException
	{
		if(retCol == null || retCol.deidTag == null)
			writer.write(csvSafeString(rs.getString(colNum)));
		else
		{
			DeIdTag tag = retCol.deidTag;
			if(tag.isBirthdate())
				writer.write(csvSafeString(handleBirthday("FIXED", rs.getDate(colNum))));
			else if(tag.isDateField())
				writer.write(csvSafeString(dateShift("FIXED", rs.getDate(colNum))));
			else if(tag.isZipCode())
				writer.write(threeDigitZip(rs.getString(colNum), threeDigitZip));
			else if(tag.isId())
			{
				String val = getSerializedId(rs.getString(colNum), tag.getIdName());
				if(StringHelper.isBlank(val)) val = "";
				writer.write(val);
			}
			else
				writer.write(csvSafeString(rs.getString(colNum)));
		}	
	}
	@Override
	public int getCasesPerFile() {
		// TODO Auto-generated method stub
		return this.rowsPerFile;
	}
}

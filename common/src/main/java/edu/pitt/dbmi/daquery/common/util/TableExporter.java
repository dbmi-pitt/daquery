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
import java.sql.Statement;
import java.util.Hashtable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.pitt.dbmi.daquery.common.domain.SQLDataSource;
import edu.pitt.dbmi.daquery.common.domain.SourceType;
import edu.pitt.dbmi.daquery.common.domain.inquiry.DaqueryRequest;
import edu.pitt.dbmi.daquery.common.domain.inquiry.DaqueryResponse;
import edu.pitt.dbmi.daquery.common.domain.inquiry.SQLQuery;
import edu.pitt.dbmi.daquery.download.properties.OutputFile;

public class TableExporter implements DataExporter {
	
	DaqueryResponse daqueryResponse;
	DaqueryRequest daqueryRequest;
	DataExportConfig dataExportConfig;
	String dataDir;
	boolean deliverData;
	List<String> idList;
	private final int patientBlockSize = 500;
	boolean debugDataExport;
	boolean threeDigitZip;
	boolean dateShift;
	Hashtable<String, OutputFile> conceptCDs = null;
	int rowsPerFile;
	int nFiles = 1;
	int currentFile = 0;
	
	private final static Logger logger = Logger.getLogger(TableExporter.class.getName());
	
	public TableExporter(DaqueryResponse response, DataExportConfig exportConfig, String dataDir) {
		this.daqueryResponse = response;
		this.daqueryRequest = response.getRequest();

		this.dataDir = dataDir;
		this.deliverData = AppProperties.getDeliverData();
		this.debugDataExport = AppProperties.getDebugDataExport();
		
		this.dateShift = daqueryResponse.getRequest().getNetwork().getShiftDates();
		rowsPerFile = 1000;
	}

	@Override
	public void init(Connection conn, Statement st, ResultSet rs, String sql) throws Throwable {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public int getNumFiles() {
		return(nFiles);
	}
	
	@Override
	public boolean hasNextExport() {
		return true;
	}

	@Override
	public String exportNext() throws Throwable {
		try
		{
			//just make sure all is okay with the tracking file writer before doing any export- several errors could get thrown from this call
			//getTrackingFileWriter();
			
			if(! hasNextExport()) return null;
			
			currentFile++;

			File tmpDir = FileHelper.createExportTempDirectory();
			File zipFile = dumpData(tmpDir, daqueryRequest, currentFile, nFiles, rowsPerFile);
	
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
			logger.log(Level.SEVERE, "An error occured during the ", t);
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
	
	private File dumpData(File tmpDir, DaqueryRequest daqueryRequest, int currentFileNumber, int pageCount, int rowPerFile) throws Throwable
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
		Connection conn = null;
		SQLDataSource ds = (SQLDataSource) daqueryRequest.getNetwork().getDataModel().getDataSource(SourceType.SQL);
		conn = ds.getConnection();
		Statement s = null;
		ResultSet rs = null;
		String sql = ((SQLQuery) daqueryRequest.getInquiry()).getCode();
		String runSQL = sql.trim();
		if(runSQL.endsWith(";"))
			runSQL = runSQL.substring(0, runSQL.length() - 1);
		s = conn.createStatement();
		rs = s.executeQuery(runSQL);
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnCount = rsmd.getColumnCount();
		OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(new File(tmpDir.getAbsolutePath() + File.separator + filenamePrefix + "Table.csv")));
		for(int i = 1; i <= columnCount; i++) {
			writer.write(rsmd.getColumnName(i));
			if(i < columnCount)
				writer.write(", ");
		}
		writer.write("\n");
		while (rs.next()) {
			for(int i = 1; i <= columnCount; i++) {
				writer.write(rs.getString(i) == null ? "(null)" : rs.getString(i));
				if(i < columnCount)
					writer.write(", ");
			}
			writer.write("\n");
		}
		
		writer.close();
		
		//create a zip file containing the two files that we just wrote			
		File zipFile = new File(tmpDir.getAbsolutePath() + File.separator + daqueryRequest.getFilePrefix() + ".zip");
		FileHelper.zipDirectory(tmpDir, zipFile, false);
		
		return zipFile;
	}

	@Override
	public int getCasesPerFile() {
		// TODO Auto-generated method stub
		return this.rowsPerFile;
	}

}

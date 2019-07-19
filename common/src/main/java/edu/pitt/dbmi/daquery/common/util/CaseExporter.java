package edu.pitt.dbmi.daquery.common.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.Session;

import edu.pitt.dbmi.daquery.common.dao.NetworkDAO;
import edu.pitt.dbmi.daquery.common.domain.DataModel;
import edu.pitt.dbmi.daquery.common.domain.DataSource;
import edu.pitt.dbmi.daquery.common.domain.Network;
import edu.pitt.dbmi.daquery.common.domain.SQLDataSource;
import edu.pitt.dbmi.daquery.common.domain.SourceType;
import edu.pitt.dbmi.daquery.common.domain.inquiry.DaqueryRequest;
import edu.pitt.dbmi.daquery.common.domain.inquiry.DaqueryResponse;
import edu.pitt.dbmi.daquery.download.properties.Concept;
import edu.pitt.dbmi.daquery.download.properties.ConceptColumn;
import edu.pitt.dbmi.daquery.download.properties.CustomColumnSet;
import edu.pitt.dbmi.daquery.download.properties.DefaultValue;
import edu.pitt.dbmi.daquery.download.properties.Field;
import edu.pitt.dbmi.daquery.download.properties.Modifier;
import edu.pitt.dbmi.daquery.download.properties.ModifierColumn;
import edu.pitt.dbmi.daquery.download.properties.OntologyTable;
import edu.pitt.dbmi.daquery.download.properties.OutputFile;
import edu.pitt.dbmi.daquery.download.properties.ValueCode;


public class CaseExporter extends AbstractExporter implements DataExporter {
	
	public static void main(String[] args) throws Throwable {
        AppProperties.setDevHomeDir("/opt/apache-tomcat-6.0.53");
        Session s = HibernateConfiguration.openSession();
        DaqueryRequest r = (DaqueryRequest) s.get(DaqueryRequest.class, new Long(1009l));
        DataModel dm = (DataModel) s.get(DataModel.class, Long.parseLong("102"));
        //DataExport de = new DataExport(dm.getDataExportConf());
//        List<String> pList = new ArrayList<String>();
//        pList.add("PIT686766");
//        pList.add("PIT637837");
//        pList.add("PIT982221");
        Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
        CaseExporter dataExporter = new CaseExporter(r.getResponses().iterator().next(), dm, AppProperties.getDBProperty("output.path"));
        //dataExporter.init(conn, st, rs, "select PATID from demographic where PATID='PIT686766' OR PATID='PIT637837' OR PATID='PIT982221'");
        //dataExporter.dumpData(new File("."), r, 1, 1, 10);
        dataExporter.close();
        //while(dataExporter.hasNextExport())
        //	dataExporter.exportNext();
        
        SQLDataSource ds = (SQLDataSource) NetworkDAO.getNetworkById(1).getDataModels().iterator().next().getDataSource(SourceType.SQL);
        ds.setUsername("cdm_41_etl");
        ds.setPassword("dbmi72etl");
		conn = ds.getConnection();
		st = conn.createStatement();
		String query = "SELECT DISTINCT DEMOGRAPHIC.PATID " +
					   "FROM CDM_41_ETL.DEMOGRAPHIC " +
					   "WHERE TRUNC((TRUNC(TO_DATE('01/01/2014','MM/DD/YYYY') - DEMOGRAPHIC.BIRTH_DATE) / 365.25)) >= 55";
		
		ArrayList<String> patids = new ArrayList<>();
		try{
			rs = st.executeQuery(query);
			while(rs.next()){
				patids.add(rs.getString(1));
			}
			
			long startTime = System.nanoTime();
			int load = 0;
			System.out.println("patid size :" + patids.size());
			while((patids.size() - load * 500 > 0) && load * 500 <= 70000){
				String inClause = dataExporter.buildQueryInClause(patids, load, 500);
				String entQuery = "select PATID, ENCOUNTERID, ADMIT_DATE, ADMIT_TIME, DISCHARGE_DATE, DISCHARGE_TIME, PROVIDERID, " + 
								"FACILITY_LOCATION, ENC_TYPE, FACILITYID, DISCHARGE_DISPOSITION, DISCHARGE_STATUS, DRG, DRG_TYPE, " + 
								"ADMITTING_SOURCE, RAW_SITEID, RAW_ENC_TYPE, RAW_DISCHARGE_DISPOSITION, RAW_DISCHARGE_STATUS, RAW_DRG_TYPE, " + 
								"RAW_ADMITTING_SOURCE, FACILITY_TYPE, PAYER_TYPE_PRIMARY, PAYER_TYPE_SECONDARY, RAW_FACILITY_TYPE, " + 
								"RAW_PAYER_ID_PRIMARY, RAW_PAYER_ID_SECONDARY, RAW_PAYER_TYPE_PRIMARY, RAW_PAYER_TYPE_SECONDARY from encounter enc " + 
								"WHERE enc.PATID IN (" + inClause + ")";
				rs = st.executeQuery(entQuery);
				while(rs.next()){
					String a = rs.getString(1);
				}
				load += 1;
				System.out.println("load :" + load);
			}
			long endTime = System.nanoTime();
			long duration = (endTime - startTime); 
			System.out.println("where clause: " + duration / 1000000000 + "sec");
			System.out.println("count: " + load * 500);
//			long startTime = System.nanoTime();
//		
//			query = "insert into CDM_41_ETL.QUERY_SET_TEMP (" + 
//					"SELECT DISTINCT DEMOGRAPHIC.PATID " +
//					"FROM CDM_41_ETL.DEMOGRAPHIC " +
//					"WHERE TRUNC((TRUNC(TO_DATE('01/01/2014','MM/DD/YYYY') - DEMOGRAPHIC.BIRTH_DATE) / 365.25)) >= 55)";
//		
//			st.executeQuery(query);
//			
//			String entQuery = "select enc.PATID, ENCOUNTERID, ADMIT_DATE, ADMIT_TIME, DISCHARGE_DATE, DISCHARGE_TIME, PROVIDERID, " + 
//						"FACILITY_LOCATION, ENC_TYPE, FACILITYID, DISCHARGE_DISPOSITION, DISCHARGE_STATUS, DRG, DRG_TYPE, ADMITTING_SOURCE, " + 
//					"RAW_SITEID, RAW_ENC_TYPE, RAW_DISCHARGE_DISPOSITION, RAW_DISCHARGE_STATUS, RAW_DRG_TYPE, RAW_ADMITTING_SOURCE, " + 
//					"FACILITY_TYPE, PAYER_TYPE_PRIMARY, PAYER_TYPE_SECONDARY, RAW_FACILITY_TYPE, RAW_PAYER_ID_PRIMARY, RAW_PAYER_ID_SECONDARY, " + 
//					"RAW_PAYER_TYPE_PRIMARY, RAW_PAYER_TYPE_SECONDARY from encounter enc, QUERY_SET_TEMP setids where setids.PATID = enc.patid";
//			
//			rs = st.executeQuery(entQuery);
//			int count = 1;
//			while(count < 70000 && rs.next()){
//				String a = rs.getString(1);
//				count += 1;
//			}
//			long endTime = System.nanoTime();
//			long duration = (endTime - startTime); 
//			System.out.println("where clause: " + duration / 1000000000 + "sec" );
//			System.out.println("count:" + count);

		}catch (Throwable t) {
			throw t;
		}finally {
			dataExporter.close();
		}
	}
	
	private static final int BASICINFO_COLUMN_COUNT = 9;
	private static final int VALUE_INDEX = BASICINFO_COLUMN_COUNT;
	private static final int UNIT_INDEX = VALUE_INDEX + 1;
	private static final int COREINFO_COLUMN_COUNT = BASICINFO_COLUMN_COUNT - 2;
	
	private final static Logger logger = Logger.getLogger(CaseExporter.class.getName());
	
	List<String> idList;
	
	private final int patientBlockSize = 500;
	
	Hashtable<String, OutputFile> conceptCDs = null;
	int nFiles;
	int currentFile = 0;
	private String failureMessage;
	private String dataBaseType;
	
	@Override
	public boolean init(Connection conn, ResultSet rs, String sql, SQLDataSource ds, String tempTableName) throws Throwable {
		DatabaseMetaData dbm = conn.getMetaData();
		// check if table is there
		ResultSet tables = dbm.getTables(null, null, "QUERY_SET_TEMP", null);
		
		if(ds.getDriverClass().contains("oracle")) {
			dataBaseType = "oracle";
			if (!tables.next()) {
				throw new DaqueryErrorException("Global temp table does not exist.");
			}
		} else if(ds.getDriverClass().contains("sqlserver")){
			dataBaseType = "sqlserver";
//			if (!tables.next()) {
//				String createTempTable = "CREATE TABLE " + tempTableName + " ([PATID] [varchar](50) " +
//										"PRIMARY KEY CLUSTERED " + 
//										"([PATID] ASC)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]) ON [PRIMARY]";
//				st = conn.createStatement();
//				st.execute(createTempTable);
//			}
		}
		
		//get the list of identifiers			
		List<String> pList = new ArrayList<String>();
		try
		{
			sql = sql.trim();
			if(sql.endsWith(";"))
				sql = sql.substring(0, sql.length() - 1);
			Statement st = conn.createStatement();
			rs = st.executeQuery(sql + " order by patid");
			while(rs.next())
			{
				String val = rs.getString(1);
				if(val == null)
					continue;

				if(val instanceof String)
					pList.add((String) val);
				else
				{
					throw new Exception("Invalid case identifier: \"An invalid case identifier \" + val.toString() + \" of type \" + val.getClass().getName() + \" was found.\"");
//					response.setStatusEnum(ResponseStatus.ERROR);
//					response.setErrorMessage("An invalid case identifier " + val.toString() + " of type " + val.getClass().getName() + " was found.");
//					return(response);
				}
			}
			
			rs.close();
			st.close();
			
			this.idList = pList;
			nFiles = (int) Math.ceil((double)idList.size() / casesPerFile);
		}
		catch(Throwable t)
		{
			throw t;
//			response.setStatusEnum(ResponseStatus.ERROR);
//			response.setErrorMessage("Unexpected error while gathering case ids.");
//			response.setStackTrace(StringHelper.stackToString(t));
//			return(response);
		}
		
		// Put patid into global temp table
		try {
			if(sql.endsWith(";"))
				sql = sql.substring(0, sql.length() - 1);
			String insertTempTableQuery = "";
			if(ds.getDriverClass().contains("oracle"))
				insertTempTableQuery = "insert into QUERY_SET_TEMP (" + sql + ")";
			else
				if(sql.toLowerCase().indexOf("from", 0) > 0){
					String sqlFirstPart = sql.substring(0, sql.toLowerCase().indexOf("from", 0));
					String sqlSecondPart = sql.substring(sql.toLowerCase().indexOf("from", 0));
					insertTempTableQuery = sqlFirstPart + "into " + tempTableName + " " + sqlSecondPart;
				}
			Statement st = conn.createStatement();
			st.execute(insertTempTableQuery);
			st.close();
			return true;
		} catch (Throwable t){
			throw t;
		}
		
	}
		
	public CaseExporter(DaqueryResponse daqueryResponse, DataModel model, String dataDir) throws DaqueryException
	{
		super(daqueryResponse, model, dataDir);
	}

	@Override
	public String getFailureMessage()
	{
		return(failureMessage);
	}
	public int getNumFiles()
	{
		return(nFiles);
	}

	private void buildConceptCDsMap(DaqueryRequest daqueryRequest) throws Throwable {
		conceptCDs = new Hashtable<>();
		Connection conn = null;
		Statement s = null;
		ResultSet rs = null;
		try {
		// Get all the concept_cd from ontology
			// ### DataModel Select
			SQLDataSource ds = (SQLDataSource) daqueryRequest.getNetwork().getDataModels().iterator().next().getDataSource(SourceType.SQL);
			conn = ds.getConnection();
			//Connection ontologyConnection = PathDBHelper.getOntologyConnection(project_id);
			//String ontologySchemaPrefix = PathDBHelper.getOntologySchemaPrefix(project_id);
			for(OutputFile outputFile : model.getExportConfig().outputFiles){
				if (outputFile.pivotLevel != null && outputFile.pivotLevel.equals("concept")){
					for(ConceptColumn CC : outputFile.conceptColumns){
						conceptCDs.put(CC.conceptCD, outputFile);
						if(CC.type != null && CC.type.equals("value-list")){
							for(ValueCode vc : CC.valueCodes){
								conceptCDs.put(vc.code, outputFile);
							}
						}
					}
				} else {
					for(OntologyTable ot : outputFile.ontologyTables){
						s = conn.createStatement();
						String query = "select c_basecode from "
									+ ot.name
									+ " where c_basecode is not null"
									+ buildInExClause(ot, "");
						
						rs = s.executeQuery(query);
						while (rs.next()) {
							conceptCDs.put(rs.getString(1), outputFile);
						}
					}
				}
			}
		}catch (Throwable t) {
			logger.log(Level.SEVERE, "Unexpected error while build ConceptCD map.", t);
			throw t;
		} finally {
			ApplicationDBHelper.closeConnection(conn, s, rs);
		}
	}
	
	public boolean hasNextExport()
	{
		if(currentFile < nFiles)
			return(true);
		else
			return(false);
	}
	
	private FileWriter trackFileWriter = null;
	private FileWriter getTrackingFileWriter() throws DaqueryException, IOException, DaqueryErrorException
	{
		if(trackFileWriter == null)
		{
			String trackingFileDir = StringHelper.ensureTrailingSlashFile(AppProperties.getTrackingDir());
			File trackingDir = new File(trackingFileDir);
			if(! trackingDir.exists())
			{
				try{trackingDir.mkdirs();}
				catch(Throwable ioe)
				{
					String msg = "Unable to create tracking file directory at " + trackingFileDir;
					logger.log(Level.SEVERE, msg, ioe);
					throw new DaqueryErrorException(msg, ioe);
				}
			}
			if(! trackingDir.isDirectory())
			{
				String msg = "The configured directory for tracking files is not a directory. " + trackingFileDir;
				logger.log(Level.SEVERE, msg);
				throw new DaqueryErrorException(msg);
			}
			if(! trackingDir.canWrite())
			{
				String msg = "The configured tracking file directory is not writable.  " + trackingFileDir;
				logger.log(Level.SEVERE, msg);
				throw new DaqueryErrorException(msg);
			}			
			
			String trackingFilePath = trackingFileDir + daqueryRequest.getFilePrefix() + "_" + currentFile + ".log";
			trackFileWriter = new FileWriter(trackingFilePath, true);
			trackFileWriter.write("Export started: " + dateFormat.format(new Date()) + "\n");
			trackFileWriter.write("exported patient id, db patient id, date shift\n");
		}
		return(trackFileWriter);
	}
	
	//returns the file and path where the exported file is stored
	//either remotely or locally 
	public String exportNext(Connection conn, String tempTableName) throws Throwable
	{
		try
		{
			//clear hashtables
			this.serializedIdsByType = new Hashtable<String, Hashtable<String, Integer>>();
			this.shiftDaysByPatientId = new Hashtable<String, Integer>();
			
			//just make sure all is okay with the tracking file writer before doing any export- several errors could get thrown from this call
			getTrackingFileWriter();
			
			if(! hasNextExport()) return null;
				currentFile++;

			File tmpDir = FileHelper.createExportTempDirectory();
			File zipFile = dumpData(conn, tmpDir, daqueryRequest, currentFile, nFiles, casesPerFile, tempTableName);
	
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
				Files.copy(zipFile.toPath(), p, StandardCopyOption.REPLACE_EXISTING );
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

	
	public void close() throws IOException
	{
		if(trackFileWriter != null) trackFileWriter.close();
		trackFileWriter = null;
	}
	
	public void writeTrackingFile() throws IOException, DaqueryErrorException, DaqueryException
	{
		//make a list of all patients 
		HashSet<String> patientIds = new HashSet<String>();
		for(String id : getSerializedIds("CASEID").keySet())
		{
			if(!patientIds.contains(id))
				patientIds.add(id);
		}
		for(String id : shiftDaysByPatientId.keySet())
		{
			if(!patientIds.contains(id))
				patientIds.add(id);
		}
		
		FileWriter trckFile = getTrackingFileWriter();
		for(String id : patientIds)
		{
			Integer shiftDays = null;
			Integer patNum = null;
			
			if(shiftDaysByPatientId.containsKey(id))
				shiftDays = shiftDaysByPatientId.get(id);
			if(getSerializedIds("CASEID").containsKey(id))
				patNum = getSerializedIds("CASEID").get(id);
			
			trckFile.write(id + "," + ((patNum == null)?"":patNum.toString()) + "," + ((shiftDays == null)?"":shiftDays.toString()) + "\n");
		}		
	}

	
    private String appendFileNumber(String fileName, int fileNumber)
    {
          if(StringHelper.isBlank(fileName)) return(fileName);
          String fNum = "-" + Integer.toString(fileNumber);
          String fName = fileName.trim();
          if(fName.length() <= 4)
                fName = fName + fNum;
          else
                fName = fName.substring(0, fName.length() - 4) + fNum + fName.substring(fName.length() - 4);
          return(fName);
    }
	
	
	private File dumpData(Connection conn, File tmpDir, DaqueryRequest daqueryRequest, int currentFileNumber, int pageCount, int patientsPerFile, String tempTableName) throws Throwable
	{
		String filenamePrefix = daqueryRequest.getFilePrefix();
		Hashtable<OutputFile, OutputStreamWriter> outputStreams = new Hashtable<>();
		for(OutputFile outputfile : model.getExportConfig().outputFiles){
			if(outputfile.source == null){
				FileOutputStream ontologyOutputStream = null;
				String ontologyFilename = filenamePrefix + "-" + appendFileNumber(outputfile.name, currentFileNumber);
				ontologyOutputStream = new FileOutputStream(new File(tmpDir.getAbsolutePath() + File.separator + ontologyFilename));
				
				outputStreams.put(outputfile, new OutputStreamWriter(ontologyOutputStream));
				
			}else{
				writeCustomCSVFile(conn, new OutputStreamWriter(new FileOutputStream(new File(tmpDir.getAbsolutePath() + File.separator + filenamePrefix + "-" + appendFileNumber(outputfile.name, currentFileNumber)))), daqueryRequest, currentFileNumber, patientsPerFile, outputfile, tempTableName);
			}
		}
		
		// writeOntologyCSVFile(outputStreams, daqueryRequest, currPage, pageSize, this.conceptCDs);	
		
		for(OutputStreamWriter w : outputStreams.values()){
			w.close();
		}
		
		//write patient id mapping log file
//		String lfilename = senddata.propFile.getPatientNumMappingDirectory() + File.separator + logFilename;
//		log.info("Mapping file name:" + lfilename);
//		File lfile = new File(lfilename);
//		log.info("Mapping file writable:" + lfile.canWrite());
//		FileOutputStream patientIdOutputStream = new FileOutputStream(new File(lfilename));
//		csvdata.writePatientIdLogfile(new OutputStreamWriter(patientIdOutputStream));	
//		patientIdOutputStream.close();
		
//		if(senddata.context != null){
//			//add the code-lookup.csv and data dictionary to the zip
//			InputStream codesCSVIS = senddata.context.getResourceAsStream("/WEB-INF/resources/pro-code-lookup.xlsx");
//			Files.copy(codesCSVIS, Paths.get(tmpDir.getAbsolutePath(), "pro-code-lookup.xlsx"), StandardCopyOption.REPLACE_EXISTING);
//			codesCSVIS.close();
//			InputStream dataDictIS = senddata.context.getResourceAsStream("/WEB-INF/resources/PaTH-Export-Data-Dictionary.docx");
//			Files.copy(dataDictIS, Paths.get(tmpDir.getAbsolutePath(), "PaTH-Export-Data-Dictionary.docx"), StandardCopyOption.REPLACE_EXISTING);
//			dataDictIS.close();
//		}

		//create a zip file containing the two files that we just wrote			
		File zipFile = new File(tmpDir.getAbsolutePath() + File.separator + daqueryRequest.getFilePrefix() + ".zip");
		FileHelper.zipDirectory(tmpDir, zipFile, false);
		
		return zipFile;
	}
	
	
	private String extractErrorMsg(Throwable t){
		String errorMsg = "";
		if (t instanceof FileNotFoundException){
			errorMsg = "Error occurs when data files generated.";
		} else if (t instanceof NoSuchFileException){
			errorMsg = "Error occurs when data files generated.";
		} else if (t instanceof IOException){
			errorMsg = "System error occurs when data files generated.";
		} else if (t instanceof SQLException){
			errorMsg = "Database error occurs when data files generated.";
		} else {
			errorMsg = "Unexpected error occurs when data files generated.";
		}
		return errorMsg;
	}
	
	//a request was accepted and a file sent
	//log it and send an email
	private void acceptRequestFinish(String request_site_table_id, String filename, String senderUsername, String siteName, String securityKey) throws FileNotFoundException, UnsupportedEncodingException
	{
//		WSResponse response = PaTHi2b2WebServices.restfulShrineGet("acceptDataRequestFinish", "request_site_table_id=" + request_site_table_id + "&filename=" + filename + "&senderUsername=" + senderUsername + "&siteSecurityKey=" + securityKey + "&siteName=" + siteName, null);
//		if(response.getStatus() != 200)
//		{
//			log.error("SHRINE+ ws acceptRequest returned an error status while trying to send notice of a request acceptance. " + "siteName: " + propFile.getSiteName() + " request_site_table_id:" + request_site_table_id + " filename:" + filename + " sender_username:" + senderUsername + " localDirectory: " + "\n status=" + response.getStatus() + " - " + response.getValue());
//		}
		// send finish msg to requester site.
	}
	
	//a request was accepted and the file was stored locally
	//log it and send an email to the user who is responding
	private void acceptRequestLocally(String request_site_table_id, String filename, String senderUsername, String localDirectory, String siteName, String securityKey) throws FileNotFoundException, UnsupportedEncodingException
	{
//		WSResponse response = PaTHi2b2WebServices.restfulShrineGet("acceptDataRequestLocal", "request_site_table_id=" + request_site_table_id 
//				+ "&filename=" + filename + "&senderUsername=" + senderUsername 
//				+ "&localDir=" + localDirectory + "&siteSecurityKey=" + securityKey + "&siteName=" + siteName, null);
//		if(response.getStatus() != 200)
//		{
//			log.error("SHRINE+ ws acceptDataRequestLocal returned an error status while trying to send notice of a local acceptance. " + "siteName: " + propFile.getSiteName() + " request_site_table_id:" + request_site_table_id + " filename:" + filename + " sender_username:" + senderUsername + " localDirectory: " + localDirectory + "\n status=" + response.getStatus() + " - " + response.getValue());
//		}
		
		// send finish locally msg to requester site.
	}

	private void writeCustomCSVFile(Connection conn, OutputStreamWriter writer, DaqueryRequest daqueryRequest, int currentFileNum, int patientsPerFile, OutputFile outputFile, String tempTableName) throws Throwable {
		ResultSet rs = null;
		Statement s = null;
		try {
//			SQLDataSource ds = (SQLDataSource) daqueryRequest.getNetwork().getDataModels().iterator().next().getDataSource(SourceType.SQL);
//			conn = ds.getConnection();
			
			buildCSVHeader(writer, outputFile.custom_column_set);
			
			//*
			//ArrayList<String> patients = getPatientIDofCurrPage(currentFileNum, patientsPerFile); 
			int patientsPerLoad = this.patientBlockSize;
//			if(outputFile.source.equals("patient_dimension")){
//				patientsPerLoad = this.propFile.getPatientDimensionPatientBlockSize() == null ? this.patientDimensionPatientBlockSize : this.propFile.getPatientDimensionPatientBlockSize();
//			} else if(outputFile.source.equals("visit_dimension")){
//				patientsPerLoad = this.propFile.getVistiDimensionPatientBlockSize() == null ? this.visitDimensionPatientBlockSize : this.propFile.getVistiDimensionPatientBlockSize();
//			}
			patientsPerLoad = patientsPerLoad > 1000 ? 1000 : patientsPerLoad;
			
			//*
			//int nLoads = (int) Math.ceil(((double) patients.size()) / ((double) patientsPerLoad));
			
			HashSet<String> columnSet = new HashSet<>();
			String getColumnsQuery = "";
			if(dataBaseType.equals("oracle")) {
				getColumnsQuery = "select COLUMN_NAME from ALL_TAB_COLUMNS where LOWER(Table_Name) = '"+ outputFile.source.toLowerCase() + "'";
			} else if(dataBaseType.equals("sqlserver")){
				getColumnsQuery = "select column_name from information_schema.columns where LOWER(table_Name) = '"+ outputFile.source.toLowerCase() + "'";
			}
			s = conn.createStatement();
			rs = s.executeQuery(getColumnsQuery);
			while(rs.next()){
				String name = rs.getString(1);
				columnSet.add(name);
			}
			
			String colPrefix = "";
			if(outputFile.source.trim().toUpperCase().equals("PATH_COHORT"))
				colPrefix = "PATH_COHORT.";
			else if(outputFile.source.trim().toUpperCase().equals("PATH_STUDY"))
				colPrefix = "PATH_STUDY.";
			
			String columns = "";
			String columnsNoAs = "";
			for(Field f : outputFile.custom_column_set.fields){
				columnsNoAs += colPrefix + f.colName + ", ";
				if(columnSet.contains(f.colName))
					columns += colPrefix + f.colName + " AS " + f.colName + ", ";
				else
					columns += "'' AS " + f.colName + ", ";
			}
			columns = columns.substring(0, columns.length() - 2);
			columnsNoAs = columnsNoAs.substring(0, columnsNoAs.length() - 2);

			String startPatid = this.idList.get((currentFileNum - 1) * casesPerFile);
			String endPatid = "";
			if(currentFileNum * casesPerFile - 1 > this.idList.size()){
				endPatid = this.idList.get(this.idList.size() - 1);
			} else {
				endPatid = this.idList.get(currentFileNum * casesPerFile - 1);
			}

			long startTime = System.nanoTime();
			String entQuery;
			int extraColumns = 1;
			int fieldOffset = 2;
			boolean overrideDateShift = false;
			if(! StringHelper.isBlank(outputFile.idColumn) && outputFile.idColumn.trim().toUpperCase().equals("PATID"))
			    entQuery = "select src.patid, " + columns + " from " + outputFile.source + " src , " + tempTableName + 
					" setids where setids.PATID = src.patid and src.patid >= '" + startPatid + 
					"' and src.patid <= '" + endPatid + "'";
			else if(outputFile.source.trim().toUpperCase().equals("PATH_COHORT"))
			{
				entQuery = "select " + columns + " from path_cohort, path_trial, " + tempTableName + " setids where path_trial.COHORTID = path_cohort.COHORTID" +
			                 " AND path_trial.patid = setids.patid and setids.patid >= '" + startPatid + 
			                 "' AND setids.patid <= '" + endPatid + "' group by " +  columnsNoAs ;
				extraColumns = 0;
				fieldOffset = 1;
				overrideDateShift = true;
			}
			else if(outputFile.source.trim().toUpperCase().equals("PATH_STUDY"))
			{
				entQuery = "select " + columns + " from path_study, path_cohort, path_trial, " + tempTableName + " setids " +
			             "where " +
						    "path_trial.COHORTID = path_cohort.COHORTID " +
			                "AND path_cohort.associated_study = path_study.studyid " +
		                    "AND path_trial.patid = setids.patid and setids.patid >= '" + startPatid + 
		                 "' AND setids.patid <= '" + endPatid + "' group by " +  columnsNoAs;
				extraColumns = 0;
				fieldOffset = 1;
				overrideDateShift = true;
			}
			else
				throw new DaqueryException("Unsupported query.  Only tables with PATID or COHORTID are supported.");
			
				
			s = conn.createStatement(java.sql.ResultSet.TYPE_FORWARD_ONLY,
		              java.sql.ResultSet.CONCUR_READ_ONLY);
			s.setFetchSize(10);
			try{
				rs = s.executeQuery(entQuery);
			} catch (SQLSyntaxErrorException ssee){
				if(ssee.getMessage().contains("table or view does not exist")){
					logger.log(Level.INFO, "table is not exist", ssee);
				} else {
					throw ssee;
				}
			}
			String[] outLine = new String[extraColumns + outputFile.custom_column_set.fields.size() + (debugDataExport ? 2 : 0)];
			Arrays.fill(outLine, "");
			
			StringBuilder outLine_sb = new StringBuilder();
			while(rs.next()){
				outLine_sb.setLength(0);
				// create a new row
				/*
				outLine = new String[outLine.length];
				Arrays.fill(outLine, "");
				*/
				
				String patientNum = rs.getString(1);
				//outLine[0] = csvSafeString(patientNum);
				if(daqueryRequest.getNetwork().getSerializePatientId()){
					//outLine[0] = this.getSerializedId(patientNum, "CASEID");
					outLine_sb.append(this.getSerializedId(patientNum, "CASEID") + ",");
				} else {
					//outLine[0] = patientNum;
					outLine_sb.append(patientNum + ",");
				}
				
				int outLineEnd = debugDataExport ? outLine.length - 2 : outLine.length;
				for(int j = fieldOffset; j <= outLineEnd; j++){
					if(outputFile.custom_column_set.fields.get(j-fieldOffset).deid != null && outputFile.custom_column_set.fields.get(j-fieldOffset).deid.equals("zip")){
						//outLine[j-1] = threeDigitZip(rs.getString(j), threeDigitZip);
						outLine_sb.append(threeDigitZip(rs.getString(j), threeDigitZip) + ",");
					}
					else if (outputFile.custom_column_set.fields.get(j-fieldOffset).deid != null && outputFile.custom_column_set.fields.get(j-fieldOffset).deid.equals("birthday")){
						//outLine[j-1] = csvSafeString(handleBirthday(patientNum, rs.getDate(j)));
						outLine_sb.append(csvSafeString(handleBirthday(patientNum, rs.getDate(j))) + ",");
					}
					else if (outputFile.custom_column_set.fields.get(j-fieldOffset).deid != null && outputFile.custom_column_set.fields.get(j-fieldOffset).deid.equals("source")){
						String SourceSystem = rs.getString(j);
						//outLine[j-1] = csvSafeString(SourceSystem);
						outLine_sb.append(csvSafeString(SourceSystem) + ",");
					}
					else{
						Object obj = rs.getObject(j);
						if(obj instanceof Date){
							//outLine[j-1] = csvSafeString(dateShift(patientNum, (Date)obj));
							//outLine_sb.append(csvSafeString(dateShift(patientNum, (Date)obj)) + ",");
							if(overrideDateShift)
								csvSafeString(dateFormat.format((Date)obj), outLine_sb);
							else
								csvSafeString(dateShift(patientNum, (Date)obj), outLine_sb);
							outLine_sb.append(",");
						}
						else{
							//outLine[j-1] = obj == null ? "" : csvSafeString(obj.toString());
							if(obj == null){
								outLine_sb.append(",");
							} else {
								csvSafeString(obj.toString(), outLine_sb);
								outLine_sb.append(",");
							}
							//outLine_sb.append(obj == null ? "" : csvSafeString(obj.toString()) + ",");
						}
					}
				}
				
				// For testing purpose
				if (debugDataExport) {
					//outLine[outLine.length - 2] = patientNum;
					outLine_sb.append(patientNum + ",");
					if (dateShift) {
						//outLine[outLine.length - 1] = Integer.toString(getShiftDays(patientNum));
						outLine_sb.append(Integer.toString(getShiftDays(patientNum)) + ",");
					} else {
						//outLine[outLine.length - 1] = "0";
						outLine_sb.append("0" + ",");
					}
				}
				
				// write the previous entry to file
//				outLine_sb.setLength(0);
//				String delim = "";
//				for(int j = 0; j < outLine.length; j++){
//					outLine_sb.append(delim + outLine[j]);
//					delim = ",";
//				}
//				
				outLine_sb.deleteCharAt(outLine_sb.length() - 1);
				outLine_sb.append("\n");
				String preRow = outLine_sb.toString();
				writer.write(outLine_sb.toString());
			}
			long endTime = System.nanoTime();
			long duration = (endTime - startTime);
			System.out.println("File: " + outputFile.name + " done. " + ((float)duration / 1000000000) + "sec");
			
			rs.close();
			s.close();
			
//			for (int i = 0; i < nLoads; i++) {
//				String inClause = buildQueryInClause(patients, i, patientsPerLoad);
//				s = conn.createStatement();
//				String query = "select " + outputFile.idColumn + ", " + columns + " from " + outputFile.source
//								+ " where " + outputFile.idColumn + " IN (" + inClause + ")"
//								+ " order by " + outputFile.idColumn;
//				rs = s.executeQuery(query);
//				
//				String[] outLine = new String[1 + outputFile.custom_column_set.fields.size() + (debugDataExport ? 2 : 0)];
//				Arrays.fill(outLine, "");
//				while (rs.next()) {
//					// create a new row
//					outLine = new String[outLine.length];
//					Arrays.fill(outLine, "");
//					
//					String patientNum = rs.getString(1);
//					//outLine[0] = csvSafeString(patientNum);
//					if(daqueryRequest.getNetwork().getSerializePatientId())
//						outLine[0] = this.getSerializedId(patientNum, "CASEID");
//					else
//						outLine[0] = patientNum;
//					
//					int outLineEnd = debugDataExport ? outLine.length - 2 : outLine.length;
//					for(int j = 2; j <= outLineEnd; j++){
//						if(outputFile.custom_column_set.fields.get(j-2).deid != null && outputFile.custom_column_set.fields.get(j-2).deid.equals("zip"))
//							outLine[j-1] = threeDigitZip(rs.getString(j), threeDigitZip);
//						else if (outputFile.custom_column_set.fields.get(j-2).deid != null && outputFile.custom_column_set.fields.get(j-2).deid.equals("birthday"))
//							outLine[j-1] = csvSafeString(handleBirthday(patientNum, rs.getDate(j)));
//						else if (outputFile.custom_column_set.fields.get(j-2).deid != null && outputFile.custom_column_set.fields.get(j-2).deid.equals("source")){
//							String SourceSystem = rs.getString(j);
//							outLine[j-1] = csvSafeString(SourceSystem);
//						}
//						else{
//							Object obj = rs.getObject(j);
//							if(obj instanceof Date)
//								outLine[j-1] = csvSafeString(dateShift(patientNum, (Date)obj));
//							else
//								outLine[j-1] = obj == null ? "" : csvSafeString(obj.toString());
//						}
//					}
//					
//					// For testing purpose
//					if (debugDataExport) {
//						outLine[outLine.length - 2] = patientNum;
//						if (dateShift) {
//							outLine[outLine.length - 1] = Integer.toString(getShiftDays(patientNum));
//						} else {
//							outLine[outLine.length - 1] = "0";
//						}
//					}
//					
//					// write the previous entry to file
//					StringBuilder outLine_sb = new StringBuilder();
//					String delim = "";
//					for(int j = 0; j < outLine.length; j++){
//						outLine_sb.append(delim).append(outLine[j]);
//						delim = ",";
//					}
//				
//					String preRow = outLine_sb.toString() + "\n";
//					writer.write(preRow);			
//				}
//				rs.close();
//				s.close();
//			}
			writer.close();
		} catch (Throwable t) {
			logger.log(Level.SEVERE, "Unexpected error while generating an observation CSV file.", t);
			throw t;
		} 
//		finally {
//			ApplicationDBHelper.closeConnection(conn, s, rs);
//		}
	}
	
	public void writeOntologyCSVFile(Hashtable<OutputFile, OutputStreamWriter> outputStreams, DaqueryRequest daqueryRequest, int currPage, int pageSize, Hashtable<String, OutputFile> ConceptCDs) throws Throwable {
		Connection conn = null;
		Statement s = null;
		ResultSet rs = null;
		try {
			Network net = daqueryRequest.getNetwork();
			SQLDataSource ds = (SQLDataSource) net.getDataModels().iterator().next().getDataSource(SourceType.SQL);
			conn = ds.getConnection();
			String DatabaseName = conn.getMetaData().getDatabaseProductName();
			
			// Create site source system mapping
			//Hashtable<String, String> source_system_mapping = buildSourceSystemMapping(pathExportConfig, siteName);
			
			int patientsPerLoad = 1000;
			patientsPerLoad = patientsPerLoad > 1000 ? 1000 : patientsPerLoad;
			Hashtable<String, Hashtable<String, Modifier>> modifiers = new Hashtable<>();
			Hashtable<String, Hashtable<String, Concept>> conceptColumns = new Hashtable<>();
			Hashtable<String, String[]> outLines = new Hashtable<>();
			for(OutputFile outputFile : model.getExportConfig().outputFiles){
				if(outputFile.pivotLevel != null && outputFile.pivotLevel.equals("concept")){
					buildConceptColumns(outputFile, conceptColumns);
					outLines.put(outputFile.name, new String[COREINFO_COLUMN_COUNT + 1 + conceptColumnCount(outputFile) + (debugDataExport ? 2 : 0) ]);
					Arrays.fill(outLines.get(outputFile.name), "");
				} else {
					modifiers.put(outputFile.name, buildModifierHash(outputFile));
					outLines.put(outputFile.name, new String[BASICINFO_COLUMN_COUNT + 1 + modifierColumnCount(outputFile) + (debugDataExport ? 2 : 0) + (addUnitInOutputFile(outputFile) ? 1 : 0)]);
					Arrays.fill(outLines.get(outputFile.name), "");
				}
			}
			
			for(Entry<OutputFile, OutputStreamWriter> e : outputStreams.entrySet()){
				buildCSVHeader(e.getValue(), e.getKey());
			}
			
			Hashtable<String, Integer> conceptPivotCoreColumns = new Hashtable<>();
			conceptPivotCoreColumns.put("Original Patient Number", 0);
			conceptPivotCoreColumns.put("Patient Number", 1);
			conceptPivotCoreColumns.put("Encounter Number", 2);
			conceptPivotCoreColumns.put("Start Date", 3);
			conceptPivotCoreColumns.put("End Date", 4);
			conceptPivotCoreColumns.put("Instance Number", 5);
			conceptPivotCoreColumns.put("Provider ID", 6);
			conceptPivotCoreColumns.put("Source System", 7);
			conceptPivotCoreColumns.put("Value", 8);
			
			Hashtable<String, Integer> modiferPivotCoreColumns = new Hashtable<>();
			modiferPivotCoreColumns.put("Original Patient Number", 0);
			modiferPivotCoreColumns.put("Patient Number", 1);
			modiferPivotCoreColumns.put("Encounter Number", 2);
			modiferPivotCoreColumns.put("Concept Code", 3);
			modiferPivotCoreColumns.put("Start Date", 4);
			modiferPivotCoreColumns.put("End Date", 5);
			modiferPivotCoreColumns.put("Instance Number", 6);
			modiferPivotCoreColumns.put("Provider ID", 7);
			modiferPivotCoreColumns.put("Source System", 8);
			modiferPivotCoreColumns.put("Value", 9);
			
			ArrayList<String> patients = getPatientIDofCurrPage(currPage, pageSize);
			int nLoads = (int) Math.ceil(((double) patients.size()) / ((double) patientsPerLoad));
			
			for (int i = 0; i < nLoads; i++) {
				String inClause = buildQueryInClause(patients, i, patientsPerLoad);
				s = conn.createStatement();
				String query = "select o.patient_num, o.encounter_num, o.concept_cd, o.start_date, o.end_date, o.modifier_cd, o.instance_num, o.provider_id, o.sourcesystem_cd, o.valtype_cd, o.tval_char, o.nval_num, units_cd, o.observation_blob from " + "observation_fact o"
						+ " where o.patient_num IN (" + inClause + ")"
						+ " order by patient_num, encounter_num, start_date, instance_num, concept_cd, modifier_cd";
				rs = s.executeQuery(query);
				
				while (rs.next()) {
					// valueMatch pattern
					OutputFile outputFile = getOutputFileByValueMatch(rs.getString("CONCEPT_CD"), model.getExportConfig());
					// Find outputFile in ConceptCDs HashMap
					outputFile = outputFile == null ? ConceptCDs.get(rs.getString("CONCEPT_CD")) : outputFile;
					if(outputFile == null) continue;
					String[] outLine = outLines.get(outputFile.name);
					
					if(outputFile.pivotLevel != null && outputFile.pivotLevel.equals("concept")){
						if(isNewEntryForConceptPivot(rs, outLine, outputFile.distinct)){
							if (!isFirstRow(outLine)){
								writeToStream(outLine, outputStreams, outputFile, 5, conceptPivotCoreColumns, outputFile.defaultValues);
							}
							
							String patientNum = rs.getString("PATIENT_NUM");
							BigDecimal encounterNum = rs.getBigDecimal("ENCOUNTER_NUM");
							String conceptCD = rs.getString("CONCEPT_CD");
							String startDate = dateShift(patientNum, rs.getDate("START_DATE"));
							String endDate = dateShift(patientNum, rs.getDate("END_DATE"));
							String modifierCD = rs.getString("MODIFIER_CD");
							String InstanceNum = rs.getBigDecimal("INSTANCE_NUM").toString();
							String ProviderID = rs.getString("PROVIDER_ID");
							String SourceSystem = rs.getString("SOURCESYSTEM_CD");
							//SourceSystem = source_system_mapping.get(SourceSystem) == null ? SourceSystem : source_system_mapping.get(SourceSystem);
							outLine[0] = patientNum.toString();
							outLine[1] = csvSafeString(patientNum);
							outLine[2] = csvSafeString(encounterNum.toString());
							outLine[3] = csvSafeString(startDate);
							outLine[4] = csvSafeString(endDate);		
							outLine[5] = csvSafeString(InstanceNum);
							outLine[6] = csvSafeString(ProviderID);
							outLine[7] = csvSafeString(SourceSystem);
							if(modifierCD.equals("@")){
								fillInConceptValue(rs, outLine, conceptColumns.get(outputFile.name), outputFile.name, DatabaseName);
							} else {
								fillInModifierValue(rs, outLine, conceptColumns.get(outputFile.name).get(conceptCD), DatabaseName);
							}
						} else {
							String modifierCD = rs.getString("MODIFIER_CD");
							String conceptCD = rs.getString("CONCEPT_CD");
							
							if(modifierCD.equals("@")){
								fillInConceptValue(rs, outLine, conceptColumns.get(outputFile.name), outputFile.name, DatabaseName);
							} else {
								fillInModifierValue(rs, outLine, conceptColumns.get(outputFile.name).get(conceptCD), DatabaseName);
							}
						}
					} else {
						if(isNewEntry(rs, outLine)){
							if (!isFirstRow(outLine)){
								writeToStream(outLine, outputStreams, outputFile, 6, modiferPivotCoreColumns, outputFile.defaultValues);
							}
							
							String patientNum = rs.getString("PATIENT_NUM");
							BigDecimal encounterNum = rs.getBigDecimal("ENCOUNTER_NUM");
							String conceptCD = rs.getString("CONCEPT_CD");
							String startDate = dateShift(patientNum, rs.getDate("START_DATE"));
							String endDate = dateShift(patientNum, rs.getDate("END_DATE"));
							String modifierCD = rs.getString("MODIFIER_CD");
							String InstanceNum = rs.getBigDecimal("INSTANCE_NUM").toString();
							String ProviderID = rs.getString("PROVIDER_ID");
							String SourceSystem = rs.getString("SOURCESYSTEM_CD");
							//SourceSystem = source_system_mapping.get(SourceSystem) == null ? SourceSystem : source_system_mapping.get(SourceSystem);
							outLine[0] = patientNum.toString();
							outLine[1] = csvSafeString(patientNum);
							outLine[2] = csvSafeString(encounterNum.toString());
							outLine[3] = csvSafeString(conceptCD);
							outLine[4] = csvSafeString(startDate);
							outLine[5] = csvSafeString(endDate);		
							outLine[6] = csvSafeString(InstanceNum);
							outLine[7] = csvSafeString(ProviderID);
							outLine[8] = csvSafeString(SourceSystem);
							if(modifierCD.equals("@")){
								String Value = getObservationValue(rs, DatabaseName);
								outLine[VALUE_INDEX] = csvSafeString(Value);
								if(addUnitInOutputFile(outputFile)){
									outLine[UNIT_INDEX] = csvSafeString(rs.getString("UNITS_CD"));
								}
							} else {
								fillInModifierValue(rs, outLine, modifiers.get(outputFile.name), DatabaseName);
//								if(outLine[VALUE_INDEX].trim().equals("")){
//									String Value = getObservationValue(rs);
//									outLine[VALUE_INDEX] = csvSafeString(Value);
//								}
							}
						}
						else{
							fillInModifierValue(rs, outLine, modifiers.get(outputFile.name), DatabaseName);
						}
					}
				}
				
				for(OutputFile outputFile : model.getExportConfig().outputFiles){
					if(outputFile.source == null){
						String[] outLine = outLines.get(outputFile.name);
						if(!isEmptyArray(outLine)){
							Hashtable<String, Integer> coreColumns = outputFile.pivotLevel != null && outputFile.pivotLevel.equals("concept") ? conceptPivotCoreColumns : modiferPivotCoreColumns;
							int instantNumIndex = outputFile.pivotLevel != null && outputFile.pivotLevel.equals("concept") ? 5 : 6;
							writeToStream(outLine, outputStreams, outputFile, instantNumIndex, coreColumns, outputFile.defaultValues);
						}
					}
				}
				
				rs.close();
				s.close();
			}
		} catch (Throwable t) {
			logger.log(Level.SEVERE, "Unexpected error while generating an observation CSV file.",t);
			throw t;
		} finally {
			ApplicationDBHelper.closeConnection(conn, s, rs);
		}
	}
	

	private void buildCSVHeader(OutputStreamWriter writer, CustomColumnSet custom_column_set) throws IOException {
		StringBuilder sb = new StringBuilder();
		sb.append("patient_num,");
		for(Field f : custom_column_set.fields){
			sb.append(f.name + ",");
		}
		writer.write(sb.deleteCharAt(sb.length() - 1).toString());
//		if (PathExportPropertyFile.instance().addDebugTestData())
//			writer.write(",i2b2 Patient Number,Date Shift");
		writer.write("\n");
	}
	
	private ArrayList<String> getPatientIDofCurrPage(int curr_page, int patient_page_size){
		ArrayList<String> patients = new ArrayList<>();
		int firstPatientIndex = (curr_page - 1) * patient_page_size;
		int lastPatientIndex = Math.min(firstPatientIndex + patient_page_size - 1, this.idList.size() - 1);
		
		for (int i = firstPatientIndex; i <= lastPatientIndex; i++) {
			patients.add(this.idList.get(i));
		}
		
		return patients;
	}
	
	private String buildQueryInClause(ArrayList<String> patients, int load, int patientPerLoad){
		int firstPatient = load * patientPerLoad;
		int lastPatient = Math.min(firstPatient + patientPerLoad - 1, patients.size() - 1);
		String inClause = "";
		boolean first = true;
		for (int j = firstPatient; j <= lastPatient; j++) {
			if (!first)
				inClause = inClause + " ,";
			else
				first = false;
			inClause = inClause + "'" + patients.get(j) + "'";
		}
		return inClause;
	}

	private Integer maxShiftDays = null;
	
	private int getMaxShiftDays() throws NumberFormatException, DaqueryException {
		if (maxShiftDays == null)
			maxShiftDays = 300; //new Integer(AppProperties.getDBProperty("date.shift.max.day"));

		return (maxShiftDays.intValue());

	}
	
	private void buildConceptColumns(OutputFile outputFile, Hashtable<String, Hashtable<String, Concept>> conceptColumns) {
		int columnIndex = COREINFO_COLUMN_COUNT + 1;
		conceptColumns.put(outputFile.name, new Hashtable<String, Concept>());
		for(ConceptColumn cc : outputFile.conceptColumns){
			Concept c = new Concept(cc.conceptCD, cc.name, columnIndex++, cc.addUnit, cc.type, cc.valueCodes);
			conceptColumns.get(outputFile.name).put(cc.conceptCD, c);
			if(cc.type != null && cc.type.equals("value-list")){
				for(ValueCode vc : cc.valueCodes){
					conceptColumns.get(outputFile.name).put(vc.code, c);
				}
			}
			if(cc.addUnit) columnIndex++;
			for(ModifierColumn mc : cc.modifierColumns){
				if(mc.type.equals("value")){
					conceptColumns.get(outputFile.name).get(cc.conceptCD).modifiers.put(mc.modifierCD, new Modifier(mc.modifierCD, mc.name, columnIndex, mc.addUnit, mc.valueCodes));
					if (mc.addUnit)
						columnIndex += 2;
					else 
						columnIndex += 1;
				}
				else if (mc.type.equals("value-list")){
					Modifier m = new Modifier(mc.modifierCD, mc.name, columnIndex, mc.addUnit, mc.valueCodes);
					if (mc.addUnit)
						columnIndex += 2;
					else 
						columnIndex += 1;
					for(ValueCode vc : mc.valueCodes){
						conceptColumns.get(outputFile.name).get(cc.conceptCD).modifiers.put(vc.code, m);
					}
				}
			}
		}
	}
	
	private int conceptColumnCount(OutputFile outputFile) {
		int count = 0;
		for(ConceptColumn cc : outputFile.conceptColumns){
			count++;
			if(cc.addUnit) count++;
			for(ModifierColumn mc : cc.modifierColumns){
				count++;
			}
		}
		return count;
	}
	
	private int modifierColumnCount(OutputFile outputFile) {
		int count = 0;
		for(OntologyTable ot : outputFile.ontologyTables){
			for(ModifierColumn mc : ot.modifierColumns){
				count++;
				if(mc.addUnit) count++;
			}
		}
		if(outputFile.valueMatch != null){
			for(ModifierColumn mc : outputFile.valueMatch.modifierColumns){
				count++;
				if(mc.addUnit) count++;
			}
		}
		return count;
	}
	
	private Hashtable<String, Modifier> buildModifierHash(OutputFile outputFile) throws SQLException {
		Hashtable<String, Modifier> modifiers = new Hashtable<>();
		
		int columnIndex = BASICINFO_COLUMN_COUNT + 1;
		boolean unitAdded = false;
		for(OntologyTable ontologyTable : outputFile.ontologyTables){
			if(ontologyTable.addUnit && !unitAdded){
				columnIndex++;
				unitAdded = true;
			}
			for(ModifierColumn modifierColumn : ontologyTable.modifierColumns){
				if(modifierColumn.type.equals("value")){
					modifiers.put(modifierColumn.modifierCD, new Modifier(modifierColumn.modifierCD, modifierColumn.name, columnIndex, modifierColumn.addUnit));
					if (modifierColumn.addUnit)
						columnIndex += 2;
					else 
						columnIndex += 1;
				} else if(modifierColumn.type.equals("value-list")){
					for(ValueCode vc : modifierColumn.valueCodes){
						Modifier m = new Modifier(modifierColumn.modifierCD, modifierColumn.name, columnIndex, modifierColumn.addUnit, modifierColumn.valueCodes);
						modifiers.put(vc.code, m);
					}
					if (modifierColumn.addUnit)
						columnIndex += 2;
					else 
						columnIndex += 1;
				}
			}
		}
		if(outputFile.valueMatch != null){
			for(ModifierColumn modifierColumn : outputFile.valueMatch.modifierColumns){
				if(modifierColumn.type.equals("value")){
					modifiers.put(modifierColumn.modifierCD, new Modifier(modifierColumn.modifierCD, modifierColumn.name, columnIndex, modifierColumn.addUnit));
					if (modifierColumn.addUnit)
						columnIndex += 2;
					else 
						columnIndex += 1;
				} else if(modifierColumn.type.equals("value-list")){
					for(ValueCode vc : modifierColumn.valueCodes){
						Modifier m = new Modifier(modifierColumn.modifierCD, modifierColumn.name, columnIndex, modifierColumn.addUnit, modifierColumn.valueCodes);
						modifiers.put(vc.code, m);
					}
					if (modifierColumn.addUnit)
						columnIndex += 2;
					else 
						columnIndex += 1;
				}
			}
		}
		return modifiers;
	}
	
	private void buildCSVHeader(OutputStreamWriter writer, OutputFile outputFile) throws IOException {
		if(outputFile.pivotLevel != null && outputFile.pivotLevel.equals("concept")){
			StringBuilder sb = new StringBuilder();
			
			for(ConceptColumn cc : outputFile.conceptColumns){
				sb.append(csvSafeString(cc.name) + ",");
				if(cc.addUnit)
					sb.append(csvSafeString(cc.unitName) + ",");
				for(ModifierColumn mc : cc.modifierColumns){
					sb.append(csvSafeString(mc.name) + ",");
					if(mc.addUnit){
						sb.append(csvSafeString(mc.unitName) + ",");
					}
				}
			}
			if(sb.length() > 1) sb.deleteCharAt(sb.length() - 1);
			
			ArrayList<String> coreColumns = new ArrayList<>();
			coreColumns.add("Patient Number");
			coreColumns.add("Encounter Number");
			coreColumns.add("Start Date");
			coreColumns.add("End Date");
			coreColumns.add("Provider ID");
			coreColumns.add("Source System");
			String modifiedHeader = modifyDefaultColumns(coreColumns, outputFile.defaultValues);
			
			writer.write(modifiedHeader + sb.toString());
			if (debugDataExport)
				writer.write(",i2b2 Patient Number,Date Shift");
			writer.write("\n");
		} else {
			StringBuilder sb = new StringBuilder();
			
			for(OntologyTable ot : outputFile.ontologyTables){
				if(ot.addUnit){
					sb.append(csvSafeString(ot.unitName) + ",");
					break;
				}
				
			}
			
			if(outputFile.valueMatch != null){
				for(ModifierColumn mc : outputFile.valueMatch.modifierColumns){
					sb.append(csvSafeString(mc.name) + ",");
					if(mc.addUnit){
						sb.append(csvSafeString(mc.unitName) + ",");
					}
				}
			} else {
				for(OntologyTable ot : outputFile.ontologyTables){
					for(ModifierColumn mc : ot.modifierColumns){
						sb.append(csvSafeString(mc.name) + ",");
						if(mc.addUnit){
							sb.append(csvSafeString(mc.unitName) + ",");
						}
					}
				}
			}

			ArrayList<String> coreColumns = new ArrayList<>();
			coreColumns.add("Patient Number");
			coreColumns.add("Encounter Number");
			coreColumns.add("Concept Code");
			coreColumns.add("Start Date");
			coreColumns.add("End Date");
			coreColumns.add("Provider ID");
			coreColumns.add("Source System");
			coreColumns.add("Value");
			
			String modifiedHeader = sb.insert(0, modifyDefaultColumns(coreColumns, outputFile.defaultValues)).deleteCharAt(sb.length() - 1).toString();
			writer.write(modifiedHeader);
			if (debugDataExport)
				writer.write(",i2b2 Patient Number,Date Shift");
			writer.write("\n");
		}
	}
	
	private String modifyDefaultColumns(ArrayList<String> coreColumns, List<DefaultValue> defaultValues) {
		StringBuilder sb = new StringBuilder();
		for(DefaultValue df : defaultValues){
			for(int i = 0; i < coreColumns.size(); i++){
				if(coreColumns.get(i).equals(df.column)){
					if(df.suppress != null && df.suppress){
						coreColumns.remove(i);
					} else {
						coreColumns.set(i, df.name);
					}
				}
			}
		}
		for(String s : coreColumns){
			sb.append(s).append(",");
		}
		return sb.toString();
	}
	
	private boolean addUnitInOutputFile(OutputFile outputFile) {
		for(OntologyTable ot : outputFile.ontologyTables){
			if(ot.addUnit) return true;
		}
		return false;
	}
	
	private boolean isNewEntryForConceptPivot(ResultSet rs,	String[] outLine, String distinct) throws SQLException, DaqueryException {
		if (distinct != null && distinct.equals("patient")){
			return outLine == null || !(rs.getBigDecimal("PATIENT_NUM").toString().equals(outLine[0]));
		} else {
			return outLine == null || !(rs.getBigDecimal("PATIENT_NUM").toString().equals(outLine[0]) && rs.getBigDecimal("ENCOUNTER_NUM").toString().equals(outLine[2]) && csvSafeString(dateShift(rs.getString("PATIENT_NUM"), rs.getDate("START_DATE"))).equals(outLine[3]) && String.valueOf(rs.getLong("INSTANCE_NUM")).equals(outLine[5]));
		}
	}
	
	private boolean isFirstRow(String[] outLine) {
		for(int i = 0; i < outLine.length; i++){
			if(outLine[i] != null && !outLine[i].equals("")) return false;
		}
		return true;
	}
	private void writeToStream(String[] outLine, Hashtable<OutputFile, OutputStreamWriter> outputStreams, OutputFile outputFile, int instantNumIndex, Hashtable<String, Integer> coreColumns,             List<DefaultValue> defalutValues) throws IOException, DaqueryException {
		// For testing purpose
		if (debugDataExport) {
			outLine[outLine.length - 2] = outLine[0];
			if (dateShift) {
				outLine[outLine.length - 1] = Integer.toString(getShiftDays(outLine[0]));
			} else {
				outLine[outLine.length - 1] = "0";
			}
		}
	
		// write the previous entry to file
		StringBuilder outLine_sb = new StringBuilder();
		String delim = "";
		for(int j = 1; j < outLine.length; j++){
			if(j != instantNumIndex){
				Boolean skip = false;
				for(DefaultValue df : defalutValues){
					if (coreColumns.get(df.column) != null && j != coreColumns.get(df.column).intValue()){
						continue;
					} else {
						if (coreColumns.get(df.column) != null && j == coreColumns.get(df.column) && df.suppress != null && df.suppress){
							skip = true;
							break;
						} else {
							break;
						}
					}
				}
				if (!skip){
					outLine_sb.append(delim).append(outLine[j]);
					delim = ",";
				}
			}
		}
	
		String preRow = outLine_sb.toString() + "\n";
		outputStreams.get(outputFile).write(preRow);
		// create a new row
		Arrays.fill(outLine, "");
	}
	
	public Hashtable<String, Integer> dupLog;
	
	private void fillInConceptValue(ResultSet rs, String[] outLine, Hashtable<String, Concept> concepts, String outputFileName, String DatabaseName) throws SQLException, IOException {
		String Value = getObservationValue(rs, DatabaseName); 
		Concept c = concepts.get(rs.getString("CONCEPT_CD"));
		if(c.type != null && c.type.equals("value-list")){
			Value = c.options.get(rs.getString("CONCEPT_CD"));
		}
		// if outLine[c.columnIndex] has value, log dup in dupLog
		if(!outLine[c.columnIndex].equals("")){
			String key = outputFileName + "|" + c.code;
			Integer count = dupLog.get(key);
			if(count == null){
				dupLog.put(key, 2);
			} else {
				dupLog.put(key, count + 1);
			}
		}
		
		outLine[c.columnIndex] = csvSafeString(Value);
		if(c.addUnit) outLine[c.columnIndex + 1] = rs.getString("UNITS_CD");
	}
	
	private String getObservationValue(ResultSet rs, String DatabaseName) throws SQLException, IOException {
		if(rs.getString("VALTYPE_CD") == null) return "";
		
		if(rs.getString("VALTYPE_CD").trim().equals("T")){
			return rs.getString("TVAL_CHAR") == null ? "" : rs.getString("TVAL_CHAR");
		} else if (rs.getString("VALTYPE_CD").trim().equals("N")){
			return rs.getBigDecimal("NVAL_NUM") == null ? "" : rs.getBigDecimal("NVAL_NUM").toString();
		} else if (rs.getString("VALTYPE_CD").trim().equals("B")) {
				String clob = rs.getString("OBSERVATION_BLOB");
				return clob;
		} else{
			return "";
		}
	}
	
	private void fillInModifierValue(ResultSet rs, String[] outLine, Hashtable<String, Modifier> modifiers, String DatabaseName) throws SQLException, IOException {
		String Value = getObservationValue(rs, DatabaseName);
		Modifier modifier = modifiers.get(rs.getString("MODIFIER_CD"));
		if(modifier == null){
			//log.info(rs.getString("MODIFIER_CD") + " is not in specified on configuration file.");
		} else {
			if(modifier.options.size() > 0)
				outLine[modifier.columnIndex] = modifier.options.get(rs.getString("MODIFIER_CD"));
			else{
				outLine[modifier.columnIndex] = csvSafeString(Value);
				if(modifier.addUnit){
					outLine[modifier.columnIndex + 1] = csvSafeString(rs.getString("UNITS_CD"));
				}
			}
		}
	}
	
	private void fillInModifierValue(ResultSet rs, String[] outLine, Concept concept, String DatabaseName) throws SQLException, IOException {
		String Value = getObservationValue(rs, DatabaseName);
		Modifier modifier = concept.modifiers.get(rs.getString("MODIFIER_CD"));
		if(modifier == null){
			//log.info(rs.getString("MODIFIER_CD") + " is not in specified on configuration file.");
		} else {
			if(modifier.options.size() > 0)
				outLine[modifier.columnIndex] = modifier.options.get(rs.getString("MODIFIER_CD"));
			else{
				outLine[modifier.columnIndex] = csvSafeString(Value);
				if(modifier.addUnit){
					outLine[modifier.columnIndex + 1] = csvSafeString(rs.getString("UNITS_CD"));
				}
			}
		}
	}
	
	private boolean isNewEntry(ResultSet rs, String[] outLine) throws SQLException, DaqueryException {
		return outLine == null || !(rs.getBigDecimal("PATIENT_NUM").toString().equals(outLine[0]) && rs.getBigDecimal("ENCOUNTER_NUM").toString().equals(outLine[2]) && rs.getString("CONCEPT_CD").equals(outLine[3]) && csvSafeString(dateShift(rs.getString("PATIENT_NUM"), rs.getDate("START_DATE"))).equals(outLine[4]) && String.valueOf(rs.getLong("INSTANCE_NUM")).equals(outLine[6]));
	}
	
	private boolean isEmptyArray(String[] outLine) {
		for(String s : outLine){
			if(s != null && !s.equals("")) return false;
		}
		return true;
	}
	
	private OutputFile getOutputFileByValueMatch(String conceptCD, DataExportConfig dataModel) {
		OutputFile ret = null;
		for(OutputFile outputFile : dataModel.outputFiles){
			if(outputFile.valueMatch != null){
				if(conceptCD.matches(outputFile.valueMatch.pattern)) return outputFile;
			}
		}
		
		return ret;
	}
	
	private String buildInExClause(OntologyTable ontologyTable, String ontologySchemaPrefix) {
		StringBuilder sb = new StringBuilder();
		
		if(!(ontologyTable.includes.size() > 0 || ontologyTable.excludes.size() > 0)){
			return "";
		}
		
		if(ontologyTable.includes.size() > 0){
			sb.append(" and ( ");
			for(int j = 0; j < ontologyTable.includes.size(); j++){
				sb.append("c_fullname like '" + ontologyTable.includes.get(j) + "'");
				if (j < ontologyTable.includes.size() - 1)
					sb.append(" or ");
				else
					sb.append(")");
			}
		}
		if(ontologyTable.excludes.size() > 0){
			sb.append(" and (");
			for(int j = 0; j < ontologyTable.excludes.size(); j++){
				sb.append("c_fullname not like '" + ontologyTable.excludes.get(j) + "'");
				if (j < ontologyTable.excludes.size() - 1)
					sb.append(" and ");
				else
					sb.append(")");
			}
		}
		
		return sb.toString();
	}

	@Override
	public int getCasesPerFile() {
		// TODO Auto-generated method stub
		return this.casesPerFile;
	}
}

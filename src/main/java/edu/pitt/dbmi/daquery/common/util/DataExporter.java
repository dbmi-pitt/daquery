package edu.pitt.dbmi.daquery.common.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.Session;

import edu.pitt.dbmi.daquery.common.domain.DataModel;
import edu.pitt.dbmi.daquery.common.domain.SQLDataSource;
import edu.pitt.dbmi.daquery.common.domain.SourceType;
import edu.pitt.dbmi.daquery.common.domain.inquiry.DaqueryRequest;
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


public class DataExporter {
	
	public static void main(String[] args) throws Throwable {
        AppProperties.setDevHomeDir("C:\\Users\\del20");
        Session s = HibernateConfiguration.openSession();
        DaqueryRequest r = (DaqueryRequest) s.get(DaqueryRequest.class, Long.parseLong("2201"));
        DataModel dm = (DataModel) s.get(DataModel.class, Long.parseLong("1"));
        //DataExport de = new DataExport(dm.getDataExportConf());
        List<String> pList = new ArrayList<String>();
        pList.add("PIT686766");
        pList.add("PIT637837");
        pList.add("PIT982221");        
        DataExporter dataExporter = new DataExporter(r, dm.getExportConfig(), AppProperties.getDBProperty("output.path"), pList);
        while(dataExporter.hasNextExport())
        	dataExporter.exportNext();
	}
	
	private static final int BASICINFO_COLUMN_COUNT = 9;
	private static final int VALUE_INDEX = BASICINFO_COLUMN_COUNT;
	private static final int UNIT_INDEX = VALUE_INDEX + 1;
	private static final int COREINFO_COLUMN_COUNT = BASICINFO_COLUMN_COUNT - 2;
	
	private final static Logger logger = Logger.getLogger(DataExporter.class.getName());
	
	DaqueryRequest dauqeryRequest;
	DataExportConfig dataExportConfig;
	String dataDir;
	boolean deliverData;
	List<String> idList;
	private final int pientBlockSize = 500;
	boolean debugDataExport;
	boolean threeDigitZip;
	boolean dateShift;
	Hashtable<String, OutputFile> conceptCDs = null;
	int casesPerFile;
	int nFiles;
	int currentFile = 0;
		
	public DataExporter(DaqueryRequest daqueryRequest, DataExportConfig dataExportConfig, String dataDir, List<String> idList) throws DaqueryException {
		this.dauqeryRequest = daqueryRequest;
		this.dataExportConfig = dataExportConfig;
		this.dataDir = dataDir;
		this.deliverData = AppProperties.getDeliverData();
		this.debugDataExport = AppProperties.getDebugDataExport();
		this.threeDigitZip = AppProperties.getThreeDigitZip();
		this.dateShift = AppProperties.getDateShift();
		this.idList = idList;
		
		casesPerFile = this.dataExportConfig.pageSize;
		nFiles = (int) Math.ceil((double)idList.size() / casesPerFile);
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
			SQLDataSource ds = (SQLDataSource) daqueryRequest.getNetwork().getDataModel().getDataSource(SourceType.SQL);
			conn = ds.getConnection();
			//Connection ontologyConnection = PathDBHelper.getOntologyConnection(project_id);
			//String ontologySchemaPrefix = PathDBHelper.getOntologySchemaPrefix(project_id);
			for(OutputFile outputFile : dataExportConfig.outputFiles){
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
	public void exportNext() throws Throwable
	{
		try
		{
			if(! hasNextExport()) return;
				currentFile++;
	
			File tmpDir = FileHelper.createTempDirectory();
			File zipFile = dumpData(tmpDir, dauqeryRequest, currentFile, nFiles, casesPerFile);
	
			//send the file to remote requester
			String outputFilename = dauqeryRequest.getFilePrefix() + "-" + currentFile + ".zip";
			if(deliverData) {
				WSConnectionUtil.sendFileToSite(zipFile, outputFilename, dauqeryRequest.getRequestSite());
			}
			else
			{ //just copy the file locally and send an email to the current user
				Files.copy(zipFile.toPath(), Paths.get(AppProperties.getLocalDeliveryDir(), outputFilename), StandardCopyOption.REPLACE_EXISTING );
			}	
			FileHelper.deleteDirectory(tmpDir);

		} catch (Throwable t) {
			logger.log(Level.SEVERE, "Error occurs on data export", t);
			throw t;
		}
	}
	
	private File dumpData(File tmpDir, DaqueryRequest daqueryRequest, int currPage, int pageCount, int pageSize) throws Throwable
	{
		String filenamePrefix = daqueryRequest.getFilePrefix();
		Hashtable<OutputFile, OutputStreamWriter> outputStreams = new Hashtable<>();
		for(OutputFile outputfile : this.dataExportConfig.outputFiles){
			if(outputfile.source == null){
				FileOutputStream ontologyOutputStream = null;
				String ontologyFilename = filenamePrefix + "-" + outputfile.name;
				ontologyOutputStream = new FileOutputStream(new File(tmpDir.getAbsolutePath() + File.separator + ontologyFilename));
				
				outputStreams.put(outputfile, new OutputStreamWriter(ontologyOutputStream));
				
			}else{
				writeCustomCSVFile(new OutputStreamWriter(new FileOutputStream(new File(tmpDir.getAbsolutePath() + File.separator + filenamePrefix + "-" + outputfile.name))), daqueryRequest, currPage, pageSize, outputfile);
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

	private void writeCustomCSVFile(OutputStreamWriter writer, DaqueryRequest daqueryRequest, int currPage, int pageSize, OutputFile outputFile) throws Throwable {
		Connection conn = null;
		Statement s = null;
		ResultSet rs = null;
		try {
			SQLDataSource ds = (SQLDataSource) daqueryRequest.getNetwork().getDataModel().getDataSource(SourceType.SQL);
			conn = ds.getConnection();
			
			buildCSVHeader(writer, outputFile.custom_column_set);
			
			ArrayList<String> patients = getPatientIDofCurrPage(currPage, pageSize); 
			int patientsPerLoad = this.pientBlockSize;
//			if(outputFile.source.equals("patient_dimension")){
//				patientsPerLoad = this.propFile.getPatientDimensionPatientBlockSize() == null ? this.patientDimensionPatientBlockSize : this.propFile.getPatientDimensionPatientBlockSize();
//			} else if(outputFile.source.equals("visit_dimension")){
//				patientsPerLoad = this.propFile.getVistiDimensionPatientBlockSize() == null ? this.visitDimensionPatientBlockSize : this.propFile.getVistiDimensionPatientBlockSize();
//			}
			patientsPerLoad = patientsPerLoad > 1000 ? 1000 : patientsPerLoad;
					
			int nLoads = (int) Math.ceil(((double) patients.size()) / ((double) patientsPerLoad));
			
			String columns = "";
			for(Field f : outputFile.custom_column_set.fields){
				columns += f.colName + ", ";
			}
			columns = columns.substring(0, columns.length() - 2);

			for (int i = 0; i < nLoads; i++) {
				String inClause = buildQueryInClause(patients, i, patientsPerLoad);
				s = conn.createStatement();
				String query = "select " + outputFile.idColumn + ", " + columns + " from " + outputFile.source
								+ " where " + outputFile.idColumn + " IN (" + inClause + ")"
								+ " order by " + outputFile.idColumn;
				rs = s.executeQuery(query);
				
				String[] outLine = new String[2 + outputFile.custom_column_set.fields.size() + (debugDataExport ? 2 : 0)];
				Arrays.fill(outLine, "");
				while (rs.next()) {
					// create a new row
					outLine = new String[outLine.length];
					Arrays.fill(outLine, "");
					
					String patientNum = rs.getString(1);
					outLine[0] = patientNum.toString();
					outLine[1] = csvSafeString(patientNum);
					int outLineEnd = debugDataExport ? outLine.length - 3 : outLine.length - 1;
					for(int j = 2; j <= outLineEnd; j++){
						if(outputFile.custom_column_set.fields.get(j-2).deid != null && outputFile.custom_column_set.fields.get(j-2).deid.equals("zip"))
							outLine[j] = threeDigitZip(rs.getString(j), threeDigitZip);
						else if (outputFile.custom_column_set.fields.get(j-2).deid != null && outputFile.custom_column_set.fields.get(j-2).deid.equals("birthday"))
							outLine[j] = csvSafeString(handleBirthday(patientNum, rs.getDate(j)));
						else if (outputFile.custom_column_set.fields.get(j-2).deid != null && outputFile.custom_column_set.fields.get(j-2).deid.equals("source")){
							String SourceSystem = rs.getString(j);
							outLine[j] = csvSafeString(SourceSystem);
						}
						else{
							Object obj = rs.getObject(j);
							if(obj instanceof Date)
								outLine[j] = csvSafeString(dateShift(patientNum, (Date)obj));
							else
								outLine[j] = obj == null ? "" : csvSafeString(obj.toString());
						}
					}
					
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
						outLine_sb.append(delim).append(outLine[j]);
						delim = ",";
					}
				
					String preRow = outLine_sb.toString() + "\n";
					writer.write(preRow);			
				}
				rs.close();
				s.close();
			}
				
			writer.close();
		} catch (Throwable t) {
			logger.log(Level.SEVERE, "Unexpected error while generating an observation CSV file.", t);
			throw t;
		} finally {
			ApplicationDBHelper.closeConnection(conn, s, rs);
		}
	}
	
	public void writeOntologyCSVFile(Hashtable<OutputFile, OutputStreamWriter> outputStreams, DaqueryRequest daqueryRequest, int currPage, int pageSize, Hashtable<String, OutputFile> ConceptCDs) throws Throwable {
		Connection conn = null;
		Statement s = null;
		ResultSet rs = null;
		try {
			SQLDataSource ds = (SQLDataSource) daqueryRequest.getNetwork().getDataModel().getDataSource(SourceType.SQL);
			conn = ds.getConnection();
			String DatabaseName = conn.getMetaData().getDatabaseProductName();
			
			// Create site source system mapping
			//Hashtable<String, String> source_system_mapping = buildSourceSystemMapping(pathExportConfig, siteName);
			
			int patientsPerLoad = 1000;
			patientsPerLoad = patientsPerLoad > 1000 ? 1000 : patientsPerLoad;
			Hashtable<String, Hashtable<String, Modifier>> modifiers = new Hashtable<>();
			Hashtable<String, Hashtable<String, Concept>> conceptColumns = new Hashtable<>();
			Hashtable<String, String[]> outLines = new Hashtable<>();
			for(OutputFile outputFile : dataExportConfig.outputFiles){
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
					OutputFile outputFile = getOutputFileByValueMatch(rs.getString("CONCEPT_CD"), dataExportConfig);
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
				
				for(OutputFile outputFile : dataExportConfig.outputFiles){
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
	
	private String dateShift(String ptId, Date date) throws DaqueryException {
		return (dateShiftToString(getShiftDays(ptId), date));
	}
	
	private String dateShiftToString(int daysToShift, Date date) throws DaqueryException {
		if (date == null)
			return ("");
		Date dt = dateShift(daysToShift, date);
		if (dt == null)
			return ("");

		return (dateFormat.format(dt));
	}
	
	private Hashtable<String, Integer> shiftDaysByPatientId = new Hashtable<String, Integer>();
	private Random rand = new Random();
	
	private int getShiftDays(String patientId) throws DaqueryException {
		if (!shiftDaysByPatientId.containsKey(patientId)) {
			Integer shiftDays;
			String scheme = AppProperties.getDBProperty("date.shift.scheme").trim().toUpperCase();
			int maxDays = getMaxShiftDays();
			shiftDays = new Integer(0);
			while (shiftDays.intValue() == 0) // don't allow a shift of zero
			{
				int dayShift = rand.nextInt(maxDays);
				if (scheme.equals("PAST"))
					shiftDays = new Integer(dayShift * -1);
				else if (scheme.equals("FUTURE"))
					shiftDays = new Integer(dayShift);
				else
					// default to +-
					shiftDays = new Integer(dayShift - (maxDays / 2));
			}
			shiftDaysByPatientId.put(patientId, shiftDays);
		}
		return (shiftDaysByPatientId.get(patientId).intValue());
	}
	
	private Integer maxShiftDays = null;
	
	private int getMaxShiftDays() throws NumberFormatException, DaqueryException {
		if (maxShiftDays == null)
			maxShiftDays = new Integer(AppProperties.getDBProperty("date.shift.max.day"));

		return (maxShiftDays.intValue());

	}
	
	private int ptIdCounter = 1;
	private int patientIdOffset;
	private Hashtable<BigDecimal, Integer> serialIdByI2b2Id = new Hashtable<BigDecimal, Integer>();
	
	private String getSerializedId(BigDecimal patientId) {
		if (!serialIdByI2b2Id.containsKey(patientId)) {
			Integer newId = new Integer(ptIdCounter++);
			serialIdByI2b2Id.put(patientId, this.patientIdOffset + newId);
		}
		String rVal = Integer.toString(serialIdByI2b2Id.get(patientId));
		return (rVal);
	}
	
	private static String csvSafeString(String val) {
		if (StringHelper.isBlank(val))
			return ("");

		// escape entire string if has comma (,)
		if (val.contains(",")) {
			val = "\"" + val + "\"";
		}
		// escape double quotes (") in string
		else if (val.contains("\"")) {
			val = val.replaceAll("\"", "\"\"");
		}
		return val;
	}
	
	private static String threeDigitZip(String zip, boolean threeDigit) {
		if (StringHelper.isBlank(zip))
			return ("");
		String val = zip.trim();
		if (!isZipCodeFormat(val)) {
			logger.log(Level.WARNING ,"A zip code that is being exported doesn't look like a zip code: "
					+ zip);
			return ("");
		}
		
		if(threeDigit)return (val.substring(0, 3) + "XX");
	
		return val;		
	}
	
	private static boolean isZipCodeFormat(String zip) {
		String val = zip.trim();
		// remove spaces and dashes
		val = val.replace(" ", "");
		val = val.replace("-", "");
		return (val.length() >= 3 && val.length() <= 9 && val.matches("d*\\d+"));
	}
	
	private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	// if data shifting is turned on and a shifted age is > 85
	// change it to exactly 85
	protected String handleBirthday(String ptId, Date birthday) throws DaqueryException {
		Date bDay = null;
		if (birthday == null) {
			return "";
		}
		if (StringHelper.stringToBool(AppProperties.getDBProperty("date.shift"))) {
			bDay = dateShift(getShiftDays(ptId), birthday);
			if (bDay == null) {
				return "";
			}
			Calendar dob = Calendar.getInstance();
			dob.setTime(bDay);
			Calendar today = Calendar.getInstance();
			int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
			if (today.get(Calendar.MONTH) < dob.get(Calendar.MONTH)) {
				age--;
			} else if (today.get(Calendar.MONTH) == dob.get(Calendar.MONTH)
					&& today.get(Calendar.DAY_OF_MONTH) < dob
							.get(Calendar.DAY_OF_MONTH)) {
				age--;
			}
			if (age >= 85) {
				int birthYear = today.get(Calendar.YEAR) - 85;
				Calendar newBday = Calendar.getInstance();
				int month = today.get(Calendar.MONTH);
				int day = today.get(Calendar.DAY_OF_MONTH);
				newBday.set(birthYear, month, day);
				bDay = newBday.getTime();
			}
			return (dateFormat.format(bDay));
		} else {
			return (dateFormat.format(birthday));
		}
	}
	
	private Date dateShift(int daysToShift, Date date) throws DaqueryException {
		if (date == null)
			return (null);

		if (StringHelper.stringToBool(AppProperties.getDBProperty("date.shift"))) {
			Calendar dt = Calendar.getInstance();
			dt.setTime(date);
			dt.add(Calendar.DATE, daysToShift);
			return (dt.getTime());
		} else
			return (date);
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
}

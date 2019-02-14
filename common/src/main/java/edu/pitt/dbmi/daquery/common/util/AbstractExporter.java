package edu.pitt.dbmi.daquery.common.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.pitt.dbmi.daquery.common.domain.DataModel;
import edu.pitt.dbmi.daquery.common.domain.Network;
import edu.pitt.dbmi.daquery.common.domain.inquiry.DaqueryRequest;
import edu.pitt.dbmi.daquery.common.domain.inquiry.DaqueryResponse;

abstract class AbstractExporter implements DataExporter
{
	private final static Logger logger = Logger.getLogger(AbstractExporter.class.getName());
	
	//protected Hashtable<String, Integer> serialIdByI2b2Id = new Hashtable<String, Integer>();
	protected Hashtable<String, Hashtable<String, Integer>> serializedIdsByType = new Hashtable<String, Hashtable<String, Integer>>();
	
	
	private int ptIdCounter = 1;
	private int patientIdOffset;	
	protected DaqueryRequest daqueryRequest;
	protected DaqueryResponse daqueryResponse;
	protected String dataDir;
	protected boolean deliverData;	
	protected boolean debugDataExport;
	protected boolean threeDigitZip;
	protected boolean dateShift;	
	protected int casesPerFile;
	protected DataModel model;
	
	protected AbstractExporter(DaqueryResponse response, DataModel model, String dataDir) throws DaqueryException
	{
		this.model = model;
		this.daqueryResponse = response;
		this.daqueryRequest = response.getRequest();
		this.dataDir = dataDir;
		this.deliverData = AppProperties.getDeliverData();
		this.debugDataExport = AppProperties.getDebugDataExport();
		this.threeDigitZip =  response.getRequest().getNetwork().getShiftDates();
		
		this.dateShift = response.getRequest().getNetwork().getShiftDates();
		
		if(AppProperties.getDBProperty("case.per.file") != null){
			casesPerFile = Integer.parseInt(AppProperties.getDBProperty("case.per.file"));
		} else {
			casesPerFile = model.getExportConfig().getCasesPerFile();
		}
		
		
	}
	
	protected String getSerializedId(String id, String idType)
	{
		Hashtable<String, Integer> serializedIds = getSerializedIds(idType);
		String idKey = getIdKey(id);
		if (!serializedIds.containsKey(idKey)) {
			Integer newId = new Integer(ptIdCounter++);
			serializedIds.put(idKey, this.patientIdOffset + newId);
		}
		String rVal = Integer.toString(serializedIds.get(idKey));
		return (rVal);
	}
	
	protected Hashtable<String, Integer> getSerializedIds(String idType)
	{
		String lclIdType;
		if(StringHelper.isEmpty(idType))
			lclIdType = "NULL";
		else
			lclIdType = idType.trim().toUpperCase();
		
		if(!serializedIdsByType.containsKey(lclIdType))
		{
			serializedIdsByType.put(lclIdType, new Hashtable<String, Integer>());
		}
		return(serializedIdsByType.get(lclIdType));
	}
	
	private String getIdKey(String val)
	{
		if(val == null) return(null);
		return(val.trim().toUpperCase());
	}
	
	protected static String csvSafeString(String val) {
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
	
	protected static void csvSafeString(String val, StringBuilder sb) {
		// escape entire string if has comma (,)
		if (val.contains(",")) {
			//val = "\"" + val + "\"";
			sb.append("\"").append(val).append("\"");
		}
		// escape double quotes (") in string
		else if (val.contains("\"")) {
			val = val.replaceAll("\"", "\"\"");
		}
		sb.append(val);
	}
	
	protected static String threeDigitZip(String zip, boolean threeDigit) {
		if (StringHelper.isBlank(zip))
			return ("");
		String val = zip.trim();
		if (!isZipCodeFormat(val)) {
//			logger.log(Level.WARNING ,"A zip code that is being exported doesn't look like a zip code: "
//					+ zip);
			return ("");
		}
		
		if(threeDigit)return (val.substring(0, 3) + "XX");
	
		return val;		
	}
	
	protected static boolean isZipCodeFormat(String zip) {
		String val = zip.trim();
		// remove spaces and dashes
		val = val.replace(" ", "");
		val = val.replace("-", "");
		return (val.length() >= 3 && val.length() <= 9 && val.matches("d*\\d+"));
	}
	
	protected SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	// if data shifting is turned on and a shifted age is > 85
	// change it to exactly 85
	protected String handleBirthday(String ptId, Date birthday) throws DaqueryException {
		Date bDay = null;
		if (birthday == null) {
			return "";
		}
		Network net = daqueryRequest.getNetwork();
		if (net.getShiftDates()) {
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
	
	protected String dateShift(String ptId, Date date) throws DaqueryException {
		return (dateShiftToString(getShiftDays(ptId), date));
	}
	
	private String dateShiftToString(int daysToShift, Date date) throws DaqueryException
	{
		if (date == null)
			return ("");
		if(dateShift)
		{
			Date dt = dateShift(daysToShift, date);
			if (dt == null)
				return ("");
			
			return (dateFormat.format(dt));
		}
		else
			return(dateFormat.format(date));
	}
		
	protected Date dateShift(int daysToShift, Date date) throws DaqueryException {
		if (date == null)
			return (null);
		Network net = daqueryRequest.getNetwork();
		if (net.getShiftDates()) {
			Calendar dt = Calendar.getInstance();
			dt.setTime(date);
			dt.add(Calendar.DATE, daysToShift);
			return (dt.getTime());
		} else
			return (date);
	}

	protected Hashtable<String, Integer> shiftDaysByPatientId = new Hashtable<String, Integer>();
	
	protected int getShiftDays(String patientId) throws DaqueryException {
		String idKey = getIdKey(patientId);
		if (!shiftDaysByPatientId.containsKey(idKey)) {
			Network net = daqueryRequest.getNetwork();
			if(! net.getShiftDates())
			{
				shiftDaysByPatientId.put(idKey, new Integer(0));
			}
			else
			{
				if(net.getMinDateShift() == net.getMaxDateShift())
				{
					throw new DaqueryException("Warning: dates cannot be shifted because the min and max date shift are equal.");
				}
				int shiftDays = 0;
				while (shiftDays == 0) // don't allow a shift of zero
				{
					shiftDays = RngHelper.nextIntInRange(net.getMinDateShift(), net.getMaxDateShift()); 
				}
				shiftDaysByPatientId.put(idKey, new Integer(shiftDays));
			}
		}
		return (shiftDaysByPatientId.get(idKey).intValue());
	}
	
}

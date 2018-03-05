package edu.pitt.dbmi.daquery.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.pitt.dbmi.daquery.common.domain.DataModel;
import edu.pitt.dbmi.daquery.common.domain.Network;
import edu.pitt.dbmi.daquery.common.domain.inquiry.DaqueryRequest;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.util.properties.DataExport;
import edu.pitt.dbmi.daquery.util.properties.PropfileException;

public class SendData implements Runnable {

	private final static Logger logger = Logger.getLogger(SendData.class.getName());

	DaqueryRequest dq;
	
	public SendData(DaqueryRequest daqueryRequest) {
		this.dq = daqueryRequest;
	}
	
	@Override
	public void run() {
		try {
		// Get Data Export Config
		
		// Get list of patient
		List<String> pList = new ArrayList<String>();
		
		Network n = this.dq.getNetwork();
		DataModel dm = n.getDataModel();
		DataExport de = new DataExport(dm.getDataExportConf());
		
		DataExporter dataExporter = new DataExporter(this.dq, de.dataModel, AppProperties.getDBProperty("output.path"));
		de = new DataExport(dm.getDataExportConf());
		dataExporter.export(pList);
		
		
		} catch (IOException | DaqueryException e) {
			logger.log(Level.SEVERE, "Can't load the data export configuration", e);
		} catch (Throwable e) {
			logger.log(Level.SEVERE, "Can't export data", e);
		}
	}

}

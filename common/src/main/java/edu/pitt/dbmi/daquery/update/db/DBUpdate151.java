package edu.pitt.dbmi.daquery.update.db;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Hashtable;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.annotations.common.util.StringHelper;

import edu.pitt.dbmi.daquery.common.dev.util.CreateCDMModelInfo;
import edu.pitt.dbmi.daquery.common.domain.DataAttribute;
import edu.pitt.dbmi.daquery.common.domain.DataModel;
import edu.pitt.dbmi.daquery.common.domain.SiteStatus;
import edu.pitt.dbmi.daquery.common.domain.inquiry.SQLDialect;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.common.util.HibernateConfiguration;
import edu.pitt.dbmi.daquery.common.util.JSONHelper;
import edu.pitt.dbmi.daquery.update.DBUpdater;
import edu.pitt.dbmi.daquery.update.DBVersion;

@DBVersion(version=1.51f, ddlFile="db-update-v1.51.ddl")
public class DBUpdate151 implements DBUpdater {

	@Override
	public void updateData(Connection conn) throws Exception {
		Long id = importModel();
		Statement s = conn.createStatement();
		s.executeUpdate("update network set data_model_id=" + id.toString());
		s.executeUpdate("update data_source set model_id=" + id.toString());
		s.close();
	}
	
	@Override
	public void updateCentralData(Connection conn) throws Exception {
		//nothing to do on central for this update
	}
	
	private Long importModel() throws IOException, DaqueryException
	{
		InputStream is = CreateCDMModelInfo.class.getResourceAsStream("/data-modelCDM-3.1.json");
		DataModel dm = JSONHelper.fromJson(is, DataModel.class);
		for(DataAttribute da : dm.getAttributes())
			da.setDataModel(dm);
		//dm.setId(null);
		Session sess = null;
		try
		{
			sess = HibernateConfiguration.openSession();
			Transaction t = sess.beginTransaction();
			sess.save(dm);
			t.commit();
			return(dm.getId());
		}
		catch(Throwable tr)
		{
			throw new DaqueryException("Error while saving data model.", tr);
		}
		finally
		{
			if(sess != null) sess.close();
		}		
		
	}	
}

package edu.pitt.dbmi.daquery.dev;

import org.hibernate.Session;

import edu.pitt.dbmi.daquery.common.domain.DataAttribute;
import edu.pitt.dbmi.daquery.common.domain.DataModel;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.HibernateConfiguration;
import edu.pitt.dbmi.daquery.sql.ReturnColumn;
import edu.pitt.dbmi.daquery.sql.ReturnFieldsAnalyzer;

public class ReturnFieldsTest
{
	public static void main(String [] args) throws Throwable
	{
		AppProperties.setDevHomeDir("/opt/apache-tomcat-6.0.53");
		Session s = null;
		try
		{
			s = HibernateConfiguration.openSession();
			DataModel dm = (DataModel) s.get(DataModel.class, new Long(201));
			System.out.println("ehere");
		//	for(DataAttribute da : dm.getAttributes())
		//		System.out.println(da.getEntityName() + ":" + da.getFieldName());
			ReturnFieldsAnalyzer analyze = new ReturnFieldsAnalyzer("select patid, SEX, diagnosisid from demographic, (select patid pid, DIAGNOSISID from DIAGNOSIS);", dm);
			for(ReturnColumn c : analyze.getReturnColumns())
			{
				System.out.println(c);
			}
		}
		catch(Throwable t){throw t;}
		finally
		{
			if(s != null) s.close();
		}
	}
}

package edu.pitt.dbmi.daquery.dev;

import org.hibernate.Session;

import edu.pitt.dbmi.daquery.common.domain.DataAttribute;
import edu.pitt.dbmi.daquery.common.domain.DataModel;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.HibernateConfiguration;
import edu.pitt.dbmi.daquery.sql.ReturnFieldsAnalyzer;

public class ReturnFieldsTest
{
	public static void main(String [] args) throws Throwable
	{
		AppProperties.setDevHomeDir("/usr/local/apache-tomcat-6.0.53");
		Session s = null;
		try
		{
			s = HibernateConfiguration.openSession();
			DataModel dm = (DataModel) s.get(DataModel.class, new Long(501));
			System.out.println("ehere");
		//	for(DataAttribute da : dm.getAttributes())
		//		System.out.println(da.getEntityName() + ":" + da.getFieldName());
			ReturnFieldsAnalyzer analyze = new ReturnFieldsAnalyzer("select pid from (select patid as pid from demographic))", dm);
		}
		catch(Throwable t){throw t;}
		finally
		{
			if(s != null) s.close();
		}
	}
}

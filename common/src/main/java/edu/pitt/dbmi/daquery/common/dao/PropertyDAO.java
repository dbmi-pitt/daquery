package edu.pitt.dbmi.daquery.common.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import edu.pitt.dbmi.daquery.common.domain.Property;
import edu.pitt.dbmi.daquery.common.domain.inquiry.DaqueryRequest;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.common.util.HibernateConfiguration;

public class PropertyDAO extends AbstractDAO {
	public static List<Property> getProperties() throws DaqueryException {
		Session sess = null;
		try
		{
			String hql = "select p from Property p where name in ('taskQueueMaxLength', 'exportTaskQueueMaxLength', 'deliverData', 'threeDigitZip', 'dateShift', 'fileOutputDir', 'localDeliveryDir')";
			sess = HibernateConfiguration.openSession();
			Query q = sess.createQuery(hql);
			List<Property> properties = q.list();
			return(properties);
		}
		catch(Throwable t)
		{
			throw new DaqueryException("Error while retrieving properties.", t);
		}
		finally
		{
			if(sess != null) sess.close();
		}
	}
}

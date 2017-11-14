package edu.pitt.dbmi.daquery.dao;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.Session;

import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.domain.inquiry.DaqueryResponse;

public class ResponseDAO extends AbstractDAO
{
	private final static Logger log = Logger.getLogger(ResponseDAO.class.getName());
	
	public static void saveOrUpdate(DaqueryResponse response) throws DaqueryException
	{
		Session ses = null;
		try
		{
			ses = HibernateConfiguration.openSession();
			ses.saveOrUpdate(response);
		}
		catch(Throwable t)
		{
			String msg = "Unhandled exception while trying to save a response object with id: " + response.getResponseId();
			log.log(Level.SEVERE, msg, t);
			throw new DaqueryException("msg", t);
		}
		finally
		{
			if(ses != null) ses.close();
		}
	}
}

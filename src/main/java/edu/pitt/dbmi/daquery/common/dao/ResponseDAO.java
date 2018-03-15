package edu.pitt.dbmi.daquery.common.dao;

import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.pitt.dbmi.daquery.common.domain.inquiry.DaqueryResponse;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.common.util.HibernateConfiguration;
import edu.pitt.dbmi.daquery.common.util.StringHelper;

public class ResponseDAO extends AbstractDAO
{
	private final static Logger log = Logger.getLogger(ResponseDAO.class.getName());
	
	
	public static void saveOrUpdate(DaqueryResponse response) throws DaqueryException
	{
		response.setReplyTimestamp(new Date());
		AbstractDAO.save(response);
	}
	
	public static DaqueryResponse getResponseById(String responseId) throws DaqueryException
	{
		Session sess = null;
		try
		{
			
			if(StringHelper.isBlank(responseId)) return(null);
			sess = HibernateConfiguration.openSession();
			Query q = sess.createQuery("SELECT r FROM DaqueryResponse r WHERE upper(r.responseId) = '" + responseId.toUpperCase().trim() + "'");
			DaqueryResponse resp = (DaqueryResponse) q.uniqueResult();
			return(resp);
		}
		catch(Throwable t)
		{
			String msg = "Unhandled exception while trying to retrieve a DaqueryResponse with id: " + responseId;
			log.log(Level.SEVERE, msg, t);
			throw new DaqueryException(msg + "Check the site server logs for more information", t);
		}
		finally
		{
			if(sess != null) sess.close();
		}
	}
	
	public static boolean containsId(String responseId)
	{
		Session sess = null;
		try
		{
			if(StringHelper.isBlank(responseId)) return(false);
			sess = HibernateConfiguration.openSession();
			SQLQuery q = sess.createSQLQuery("select id from daquery_response where upper(response_id) = '" + responseId.trim().toUpperCase() + "'");
			List<?> results = q.list();
			if(results.size() >= 1)
				return(true);
			else
				return(false);
			
		}
		catch(Throwable t)
		{
			String msg = "Unhandled exception while checking a DaqueryResponse id: " + responseId;
			log.log(Level.SEVERE, msg, t);
			return(false);
		}
		finally
		{
			if(sess != null) sess.close();
		}
	}
}

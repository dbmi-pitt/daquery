package edu.pitt.dbmi.daquery.dao;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import edu.pitt.dbmi.daquery.common.dao.AbstractDAO;
import edu.pitt.dbmi.daquery.common.domain.inquiry.DaqueryRequest;
import edu.pitt.dbmi.daquery.common.domain.inquiry.Inquiry;
import edu.pitt.dbmi.daquery.common.domain.inquiry.SQLQuery;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.common.util.HibernateConfiguration;
import edu.pitt.dbmi.daquery.common.util.StringHelper;

public class DaqueryRequestDAO extends AbstractDAO {
	private static final Logger log = Logger.getLogger(DaqueryRequestDAO.class.getName());

	public static void main(String [] args) throws Exception
	{
		AppProperties.setDevHomeDir("/home/devuser/dq-data");
		DaqueryRequest r = getRequestById("35866a75-9d3b-400b-9462-c103b2226be8");
		System.out.println(r);
	}
	
	public static DaqueryRequest getRequestById(String requestId) throws DaqueryException
	{		
		Session sess = null;
		try
		{	
			if(StringHelper.isBlank(requestId)) return(null);
			sess = HibernateConfiguration.openSession();
			Query q = sess.createQuery("SELECT r FROM DaqueryRequest r WHERE upper(r.requestId) = '" + requestId.toUpperCase().trim() + "'");
			DaqueryRequest req = (DaqueryRequest) q.uniqueResult();
			return(req);
		}
		catch(Throwable t)
		{
			String msg = "Unhandled exception while trying to retrieve a DaqueryRequest with id: " + requestId;
			log.log(Level.SEVERE, msg, t);
			throw new DaqueryException(msg + "Check the site server logs for more information", t);
		}
		finally
		{
			if(sess != null) sess.close();
		}		
	}

	public long save(DaqueryRequest request) {
		return (Long) getCurrentSession().save(request);
	}
	
	public DaqueryRequest get(long id) {
		return (DaqueryRequest) getCurrentSession().get(DaqueryRequest.class, id);
	}
	
	public List list(String direction) throws DaqueryException{
		return getCurrentSession().createCriteria(DaqueryRequest.class)
								  .add(Restrictions.eq("direction", direction))
				  				  .list();
	}
	
	public void update(long id, DaqueryRequest request) throws DaqueryException {
		getCurrentSession().update(request);
	}
	
	public void delete(DaqueryRequest request) throws DaqueryException {
		getCurrentSession().delete(request);
	}
}

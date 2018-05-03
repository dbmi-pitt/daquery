package edu.pitt.dbmi.daquery.common.dao;

import java.util.ArrayList;
//works for Java 1.8
//import java.time.LocalDateTime;
//import java.time.ZoneId;
import java.util.List;
import java.util.logging.Logger;

import org.hibernate.criterion.Restrictions;

import edu.pitt.dbmi.daquery.common.domain.inquiry.Inquiry;
import edu.pitt.dbmi.daquery.common.domain.inquiry.SQLQuery;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;

public class InquiryDAO extends AbstractDAO {
	private final static Logger logger = Logger.getLogger(InquiryDAO.class.getName());
	
	public void main(String[] args) {
	}
	
	public long save(Inquiry query) {
		return (Long) getCurrentSession().save(query);
	}
	
	public Inquiry get(long id) {
		return (SQLQuery) getCurrentSession().get(Inquiry.class, id);
	}
	
	public Inquiry getByUUID(String id) {
		return (SQLQuery) getCurrentSession().createCriteria(Inquiry.class)
											 .add(Restrictions.eq("inquiryId", id))
											 .uniqueResult();
	}
	
	public List list() throws DaqueryException{
		return getCurrentSession().createCriteria(Inquiry.class)
				  				  .list();
	}
	
	public void update(long id, Inquiry query) throws DaqueryException {
		getCurrentSession().update(query);
	}
	
	public void delete(Inquiry query) throws DaqueryException {
		getCurrentSession().delete(query);
	}
	
	public List listSavedInquiries() throws DaqueryException {
		List i =  getCurrentSession().createCriteria(Inquiry.class)
				  				     .list();
		List ret = new ArrayList();
		for(Object a : i) {
			Inquiry inquiry = ((Inquiry) a);
			if(inquiry.getRequests().size() == 0)
				if(inquiry.getDataType().equals("SQL_QUERY")) 
					ret.add((SQLQuery)inquiry);
		}
		
		return ret;
	}
}

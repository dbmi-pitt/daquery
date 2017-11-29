package edu.pitt.dbmi.daquery.dao;

import java.util.ArrayList;
//works for Java 1.8
//import java.time.LocalDateTime;
//import java.time.ZoneId;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import edu.pitt.dbmi.daquery.domain.Network;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.domain.Site;
import edu.pitt.dbmi.daquery.domain.inquiry.Inquiry;
import edu.pitt.dbmi.daquery.domain.inquiry.SQLQuery;

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
}

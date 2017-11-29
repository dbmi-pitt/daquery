package edu.pitt.dbmi.daquery.dao;

//works for Java 1.8
//import java.time.LocalDateTime;
//import java.time.ZoneId;
import java.util.List;
import java.util.logging.Logger;

import edu.pitt.dbmi.daquery.common.dao.AbstractDAO;
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

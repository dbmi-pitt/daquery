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
import org.hibernate.Transaction;

import edu.pitt.dbmi.daquery.domain.Network;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.domain.Site;
import edu.pitt.dbmi.daquery.domain.inquiry.DaqueryRequest;
import edu.pitt.dbmi.daquery.domain.inquiry.Inquiry;
import edu.pitt.dbmi.daquery.domain.inquiry.SQLQuery;

public class SQLQueryDAO extends AbstractDAO {
private final static Logger logger = Logger.getLogger(SQLQueryDAO.class.getName());
	
	public static void main(String[] args) {
		
		AppProperties.setDevHomeDir("C:\\Users\\del20");
		SQLQueryDAO t = new SQLQueryDAO();
		
		SQLQuery q = new SQLQuery(true);
		
		try {
			q.setAggregate(true);
			q.setDataType("ABC");
			q.setVersion(1);
			q.setCode("SELECT * FROM TABLE");
			
			t.openCurrentSessionwithTransaction();
			long id = t.save(q);
			t.closeCurrentSessionwithTransaction();
			
			
			System.out.println(id);
			System.out.println(q.getCode());
			
			t.openCurrentSession();
			q = t.get(id);
			t.closeCurrentSession();
			System.out.println(q.getCode());
			q.setCode("SELECT * FROM TABLE22");
			
			t.openCurrentSessionwithTransaction();
			t.update(id, q);
			t.closeCurrentSessionwithTransaction();
			
			t.openCurrentSession();
			List<SQLQuery> l = t.list();
			t.closeCurrentSession();
			System.out.println(l);
			
			
			t.openCurrentSession();
			q = t.get(id);
			t.closeCurrentSession();
			System.out.println(q);
			
		} catch (DaqueryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public long save(SQLQuery query) {
		return (Long) getCurrentSession().save(query);
	}
	
	public SQLQuery get(long id) {
		return (SQLQuery) getCurrentSession().get(SQLQuery.class, id);
	}
	
	public List list() throws DaqueryException{
		return getCurrentSession().createCriteria(SQLQuery.class)
				  				  .list();
	}
	
	public void update(long id, SQLQuery query) throws DaqueryException {
		getCurrentSession().update(query);
	}
	
	public void delete(SQLQuery query) throws DaqueryException {
		getCurrentSession().delete(query);
	}
}

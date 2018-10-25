package edu.pitt.dbmi.daquery.common.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
//works for Java 1.8
//import java.time.LocalDateTime;
//import java.time.ZoneId;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.pitt.dbmi.daquery.common.domain.ConnectionDirection;
import edu.pitt.dbmi.daquery.common.domain.DaqueryUser;
import edu.pitt.dbmi.daquery.common.domain.DataModel;
import edu.pitt.dbmi.daquery.common.domain.DataSource;
import edu.pitt.dbmi.daquery.common.domain.Network;
import edu.pitt.dbmi.daquery.common.domain.SQLDataSource;
import edu.pitt.dbmi.daquery.common.domain.Site;
import edu.pitt.dbmi.daquery.common.domain.SiteConnection;
import edu.pitt.dbmi.daquery.common.domain.SiteStatus;
import edu.pitt.dbmi.daquery.common.domain.SourceType;
import edu.pitt.dbmi.daquery.common.domain.inquiry.DaqueryRequest;
import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.common.util.HibernateConfiguration;
import edu.pitt.dbmi.daquery.common.util.StringHelper;



public class DataModelDAO extends AbstractDAO {

    private final static Logger logger = Logger.getLogger(DataModelDAO.class.getName());
    
    public static DataModel getDataModelbyId(Long NetworkId, String DataModelId) throws Exception{
    	Session s = null;
    	try {
    		s = HibernateConfiguration.openSession();
    		
    		String hql = "select dm from DataModel dm where dm.network.id = " + NetworkId + " and dm.dataModelId = '" + DataModelId + "'";
			Query q = s.createQuery(hql);
			DataModel dataModel =  (DataModel) q.uniqueResult();
			return dataModel;
	    
        } catch (HibernateException e) {
        	String msg = "Error unable to connect to database.  Please check database settings.";
        	logger.log(Level.SEVERE, msg);
        	logger.log(Level.SEVERE, msg, e);
            throw e;
        } catch (Throwable t) {
        	String msg = "Unexpected error when accessing dataModel id [" + DataModelId + "].";
        	logger.log(Level.SEVERE, msg);
        	logger.log(Level.SEVERE, msg, t);
        	throw t;
        }
    }
}


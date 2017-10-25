package edu.pitt.dbmi.daquery.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import edu.pitt.dbmi.daquery.domain.DataSource;
import edu.pitt.dbmi.daquery.domain.Network;
import edu.pitt.dbmi.daquery.domain.Notification;
import edu.pitt.dbmi.daquery.domain.Role;
import edu.pitt.dbmi.daquery.domain.SASDataSource;
import edu.pitt.dbmi.daquery.domain.SQLDataSource;
import edu.pitt.dbmi.daquery.domain.Site;
import edu.pitt.dbmi.daquery.domain.DaqueryUser;
import edu.pitt.dbmi.daquery.domain.SourceType;

/**
 *  Singleton used to configure and get a Hibernate Session application wide. 
 *
 */
public class HibernateConfiguration {

	private static SessionFactory sessFact = null;

	/**
	 * Open a new session/db connection
	 * 
	 * @return An open Hibernate session.  Take care to make sure the session is closed when you're finished with it... 
	 */
	public static Session openSession()
	{
		return(getSessionFactory().openSession());
	}
	
	/**
	 * Get the Hibernate SessionFactory
	 * @return
	 */
	public static SessionFactory getSessionFactory()
	{
		if(sessFact != null)
			return(sessFact);
		
        Configuration hibernateConf = new Configuration();
    	hibernateConf.addAnnotatedClass(DataSource.class);	            	
    	hibernateConf.addAnnotatedClass(Network.class);
    	hibernateConf.addAnnotatedClass(Notification.class);
    	hibernateConf.addAnnotatedClass(Role.class);
    	hibernateConf.addAnnotatedClass(SASDataSource.class);
    	hibernateConf.addAnnotatedClass(DaqueryUser.class);
    	hibernateConf.addAnnotatedClass(Site.class);
    	hibernateConf.addAnnotatedClass(SourceType.class);
    	hibernateConf.addAnnotatedClass(SQLDataSource.class);
        	

        hibernateConf.setProperty("hibernate.connection.driver_class", "org.apache.derby.jdbc.EmbeddedDriver" )
        .setProperty("hibernate.connection.url", "jdbc:derby:/opt/apache-tomcat-6.0.53/conf/daquery-db")
        .setProperty("hibernate.connection.username", "")
    	.setProperty("hibernate.connection.password", "");
/*      .setProperty("hibernate.dialect", props.getProperty("hibernate.dialect", "org.hibernate.dialect.Oracle9Dialect")) */         
/*	    .setProperty("hibernate.connection.release_mode", "after_statement") */
/*    	.setProperty("hibernate.show_sql", props.getProperty("hibernate.show_sql", "false")) */
/*	    .setProperty("hibernate.cache.provider_class","net.sf.ehcache.hibernate.EhCacheProvider") */
/*    	.setProperty("hibernate.current_session_context_class", "thread")
    	.setProperty("hibernate.connection.provider_class","org.hibernate.connection.C3P0ConnectionProvider")
        .setProperty("hibernate.c3p0.acquire_increment", "1")
        .setProperty("hibernate.c3p0.idle_test_period","240")
        .setProperty("hibernate.c3p0.timeout","600")	            
        .setProperty("hibernate.c3p0.max_size","100")
        .setProperty("hibernate.c3p0.min_size","3")
        .setProperty("hibernate.c3p0.validate", "false") */  /*this is an expensive property to turn on...*/
/*      .setProperty("hibernate.c3p0.max_statements", "500")
    	.setProperty("hibernate.cache.use_second_level_cache","false")
        .setProperty("hibernate.jdbc.batch.size","20")
        .setProperty("hibernate.search.default.directory_provider", "org.hibernate.search.store.FSDirectoryProvider")
        .setProperty("hibernate.search.worker.batch.max_merge_docs", "1000")	            
        .setProperty("hibernate.search.worker.batch.merge_factor", "100")	            	            
        .setProperty("hibernate.search.worker.batch.max_buffered_docs", "100")
        .setProperty("hibernate.search.worker.thread_pool.size", "20")
        .setProperty("hibernate.search.default.exclusive_index_use", "true")
        .setProperty("hibernate.search.indexing_strategy", "manual")
    	.setProperty("hibernate.search.default.indexBase", 
    			props.getProperty("hibernate.search.default.indexBase", 
    					"C:/DevTools/Workspaces/Shindig/digital-vitaWS/lucene/indexes")  */
/*	        					.setListener("post-load", new DVHibernatePostProcessor())
    					.setListener("pre-update", new DVHibernatePreProcessor())
    					.setListener("pre-insert", new DVHibernatePreProcessor())
    					.setListener("save-update", )  */
//    					);
        
/*
     config.setListener("auto-flush",new NoisyAutoFlushEventListener());
     config.setListener("delete",new NoisyDeleteEventListener());
	 config.setListener("dirty-check",new NoisyDirtyCheckEventListener());
	 config.setListener("evict",new NoisyEvictEventListener());
	 config.setListener("flush-entity",new NoisyFlushEntityEventListener());
	 config.setListener("flush",new NoisyFlushEventListener());
	 config.setListener("load-collection",new NoisyInitializeCollectionEventListener());
	 config.setListener("load",new NoisyLoadEventListener());
	 config.setListener("lock",new NoisyLockEventListener());
	 config.setListener("merge",new NoisyMergeEventListener());
	 config.setListener("persist",new NoisyPersistEventListener());
	 config.setListener("post-delete",new NoisyPostDeleteEventListener());
	 config.setListener("post-insert",new NoisyPostInsertEventListener());
	 config.setListener("post-load",new NoisyPostLoadEventListener());
	 config.setListener("post-update",new NoisyPostUpdateEventListener());
	 config.setListener("pre-delete",new NoisyPreDeleteEventListener());
	 config.setListener("pre-insert",new NoisyPreInsertEventListener());
	 config.setListener("pre-load",new NoisyPreLoadEventListener());
	 config.setListener("pre-update",new NoisyPreUpdateEventListener());
	 config.setListener("refresh",new NoisyRefreshEventListener());
	 config.setListener("replicate",new NoisyReplicateEventListener());
	 config.setListener("save-update",new NoisySaveOrUpdateEventListener());
 */
//        if(! hbm2ddl.trim().equalsIgnoreCase("none"))
//        	hibernateConf.setProperty("hibernate.hbm2ddl.auto", hbm2ddl);
        
/*        if(useInterceptor)
        	lclSessionFactory = hibernateConf.setInterceptor(new VitaAuditInterceptor()).buildSessionFactory();
        else
        	lclSessionFactory = hibernateConf.buildSessionFactory(); */
        
/*	            if(keepAlive == null)
        	keepAlive = new ConnectionKeepAlive();
        else
        	keepAlive.stop();
        
        Thread thread = new Thread(keepAlive);
		thread.start(); */	            
		
        StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder().applySettings(hibernateConf.getProperties());
        
    	return hibernateConf.buildSessionFactory(ssrb.build());
	}
	
}

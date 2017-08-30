package edu.pitt.dbmi.daquery.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import java.util.Objects;
import java.util.logging.Logger;

import org.hibernate.annotations.Type;
import org.joda.time.*;

import com.google.gson.Gson;

/**
 * 
 * @author devuser
 *
 */

@NamedQueries({
        @NamedQuery(name = Inbound_Query.FIND_ALL, query = "SELECT u FROM Inbound_Query u ORDER BY u.lastupdate DESC"),
        @NamedQuery(name = Inbound_Query.FIND_BY_ID, query = "SELECT u FROM Inbound_Query u WHERE u.id = :id"),
        @NamedQuery(name = Inbound_Query.COUNT_ALL, query = "SELECT COUNT(u) FROM Inbound_Query u"),
        @NamedQuery(name = Inbound_Query.FIND_BY_STATUS, query = "SELECT u FROM Inbound_Query u WHERE u.status = :status"),
        @NamedQuery(name = Inbound_Query.FIND_BY_SITE, query = "SELECT u FROM Inbound_Query u WHERE u.site = :site"),
        @NamedQuery(name = Inbound_Query.FIND_BY_STUDY, query = "SELECT u FROM Inbound_Query u WHERE u.studyname = :studyname"),
        @NamedQuery(name = Inbound_Query.FIND_BY_SITE_STATUS, query = "SELECT u FROM Inbound_Query u WHERE u.site = :site AND u.status = :status"),
        @NamedQuery(name = Inbound_Query.FIND_BY_USER_STATUS, query = "SELECT u FROM Inbound_Query u WHERE u.username = :username AND u.status = :status"),
 //       @NamedQuery(name = Inbound_Query.FIND_BY_USERNAME, query = "SELECT u FROM Inbound_Query u WHERE u.username = :username"),
})


@Entity
@Table(name = "Inbound_Query")
public class Inbound_Query extends DaqueryObject {

    // ======================================
    // =             Constants              =
    // ======================================

    public static final String FIND_ALL = "Inbound_Query.findAll";
    public static final String COUNT_ALL = "Inbound_Query.countAll";
    public static final String FIND_BY_ID = "Inbound_Query.findById";
    public static final String FIND_BY_STATUS = "Inbound_Query.findByStatus";
    public static final String FIND_BY_SITE = "Inbound_Query.findBySite";
    public static final String FIND_BY_STUDY = "Inbound_Query.findByStudy";
    public static final String FIND_BY_SITE_STATUS = "Inbound_Query.findBySiteStatus";
    public static final String FIND_BY_USER_STATUS = "Inbound_Query.findByUserStatus";
   // public static final String FIND_BY_USERNAME = "Inbound_Query.findByUsername";

    private final static Logger logger = Logger.getLogger(Inbound_Query.class.getName());
    
    // ======================================
    // =             Attributes             =
    // ======================================

    @Id
    @SequenceGenerator(name = "SEQ_GEN", sequenceName = "SEQ_DAQUERY", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_GEN")
    @Column(name="ID", unique = true, nullable = false)
    private long id;
    @Column(name="STUDYNAME", length = 500)
    private String studyname;
    @Column(name="QUERYNAME", length = 500)
    private String queryname;
    @Column(name="QUERYTYPE", length = 500)
    private String querytype;
    @Column(name="SITE", length = 500)
    private String site;    
    @Column(name="USERNAME", length = 500)
    private String username; //TODO: should this be userid?  If they create a query, we
    //should check to make sure we have their id in our own records
    @Column(name="LASTUPDATE", length = 500)
    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    private DateTime lastupdate;
    //TODO: coordinate the status list with Desheng
    @Column(name="STATUS", length = 500)
    private String status;
    @Column(name="ORACLEQUERY", length = 500)
    private String oraclequery;
    @Column(name="SQLQUERY", length = 500)
    private String sqlquery;

    // ======================================
    // =            Constructors            =
    // ======================================

    public Inbound_Query() {
    	
    }
    
    
    public Inbound_Query(long id, String studyName, String queryName, String queryType, String site, String userName,
			DateTime lastUpdate, String status, String oracleQuery, String sqlQuery) {
		super();
		this.id = id;
		this.studyname = studyName;
		this.queryname = queryName;
		this.querytype = queryType;
		this.site = site;
		this.username = userName;
		this.lastupdate = lastUpdate;
		this.status = status;
		this.oraclequery = oracleQuery;
		this.sqlquery = sqlQuery;
	}


    // ======================================
    // =          Getters & Setters         =
    // ======================================

    public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}

	public String getStudyName() {
		return studyname;
	}

	public void setStudyName(String studyName) {
		this.studyname = studyName;
	}

	public String getQueryName() {
		return queryname;
	}

	public void setQueryName(String queryName) {
		this.queryname = queryName;
	}

	public String getQueryType() {
		return querytype;
	}

	public void setQueryType(String queryType) {
		this.querytype = queryType;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String userName) {
		this.username = userName;
	}

	public DateTime getLastUpdate() {
		return lastupdate;
	}

	public void setLastUpdate(DateTime lastUpdate) {
		this.lastupdate = lastUpdate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOracleQuery() {
		return oraclequery;
	}

	public void setOracleQuery(String oracleQuery) {
		this.oraclequery = oracleQuery;
	}

	public String getSqlQuery() {
		return sqlquery;
	}

	public void setSqlQuery(String sqlQuery) {
		this.sqlquery = sqlQuery;
	}


    // ======================================
    // =   Methods hash, equals, toString   =
    // ======================================

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inbound_Query user = (Inbound_Query) o;
        return Objects.equals(id, user.id);
    }


	@Override
    public int hashCode() {
        return Objects.hash(id);
    }

	@Override
	public String toString() {
		return "Inbound_Query [id=" + id + ", studyName=" + studyname + ", queryName=" + queryname + ", queryType="
				+ querytype + ", site=" + site + ", userName=" + username + ", lastUpdate=" + lastupdate + ", status="
				+ status + ", oracleQuery=" + oraclequery + ", sqlQuery=" + sqlquery + "]";
	}
	


}

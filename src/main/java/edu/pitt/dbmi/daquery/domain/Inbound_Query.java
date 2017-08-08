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

/**
 * @author Antonio Goncalves
 *         http://www.antoniogoncalves.org
 *         --
 */


@NamedQueries({
        @NamedQuery(name = Inbound_Query.FIND_ALL, query = "SELECT u FROM Inbound_Query u ORDER BY u.lastUpdate DESC"),
        @NamedQuery(name = Inbound_Query.FIND_BY_ID, query = "SELECT u FROM Inbound_Query u WHERE u.id = :id"),
        @NamedQuery(name = Inbound_Query.COUNT_ALL, query = "SELECT COUNT(u) FROM Inbound_Query u"),
})


@Entity
@Table(name = "Inbound_Query")
public class Inbound_Query {

    // ======================================
    // =             Constants              =
    // ======================================

    public static final String FIND_ALL = "Inbound_Query.findAll";
    public static final String COUNT_ALL = "Inbound_Query.countAll";
    public static final String FIND_BY_ID = "Inbound_Query.findById";

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
    private String studyName;
    @Column(name="QUERYNAME", length = 500)
    private String queryName;
    @Column(name="QUERYTYPE", length = 500)
    private String queryType;
    @Column(name="SITE", length = 500)
    private String site;    
    @Column(name="USERNAME", length = 500)
    private String userName; //TODO: should this be userid?  If they create a query, we
    //should check to make sure we have their id in our own records
    @Column(name="LASTUPDATE", length = 500)
    @Type(type="org.joda.time.contrib.hibernate.PersistentDateTime")
    private DateTime lastUpdate;
    //TODO: coordinate the status list with Desheng
    @Column(name="STATUS", length = 500)
    private String status;
    @Column(name="ORACLEQUERY", length = 500)
    private String oracleQuery;
    @Column(name="SQLQUERY", length = 500)
    private String sqlQuery;

    // ======================================
    // =            Constructors            =
    // ======================================

    public Inbound_Query() {
    	
    }
    
    
    public Inbound_Query(long id, String studyName, String queryName, String queryType, String site, String userName,
			DateTime lastUpdate, String status, String oracleQuery, String sqlQuery) {
		super();
		this.id = id;
		this.studyName = studyName;
		this.queryName = queryName;
		this.queryType = queryType;
		this.site = site;
		this.userName = userName;
		this.lastUpdate = lastUpdate;
		this.status = status;
		this.oracleQuery = oracleQuery;
		this.sqlQuery = sqlQuery;
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
		return studyName;
	}

	public void setStudyName(String studyName) {
		this.studyName = studyName;
	}

	public String getQueryName() {
		return queryName;
	}

	public void setQueryName(String queryName) {
		this.queryName = queryName;
	}

	public String getQueryType() {
		return queryType;
	}

	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public DateTime getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(DateTime lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOracleQuery() {
		return oracleQuery;
	}

	public void setOracleQuery(String oracleQuery) {
		this.oracleQuery = oracleQuery;
	}

	public String getSqlQuery() {
		return sqlQuery;
	}

	public void setSqlQuery(String sqlQuery) {
		this.sqlQuery = sqlQuery;
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
		return "Inbound_Query [id=" + id + ", studyName=" + studyName + ", queryName=" + queryName + ", queryType="
				+ queryType + ", site=" + site + ", userName=" + userName + ", lastUpdate=" + lastUpdate + ", status="
				+ status + ", oracleQuery=" + oracleQuery + ", sqlQuery=" + sqlQuery + "]";
	}


}

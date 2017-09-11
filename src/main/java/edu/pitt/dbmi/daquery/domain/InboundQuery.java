package edu.pitt.dbmi.daquery.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;


/**
 * The persistent class for the INBOUND_QUERIES database table.
 * 
 */
@Entity
@Table(name="INBOUND_QUERIES")
@NamedQueries({
    @NamedQuery(name = InboundQuery.FIND_ALL, query = "SELECT u FROM InboundQuery u ORDER BY u.lastupdate DESC"),
    @NamedQuery(name = InboundQuery.FIND_BY_ID, query = "SELECT u FROM InboundQuery u WHERE u.id = :id"),
    @NamedQuery(name = InboundQuery.COUNT_ALL, query = "SELECT COUNT(u) FROM InboundQuery u"),
    @NamedQuery(name = InboundQuery.FIND_BY_STATUS, query = "SELECT u FROM InboundQuery u WHERE u.status = :status"),
    @NamedQuery(name = InboundQuery.FIND_BY_SITE, query = "SELECT u FROM InboundQuery u WHERE u.site = :site"),
    @NamedQuery(name = InboundQuery.FIND_BY_STUDY, query = "SELECT u FROM InboundQuery u WHERE u.studyname = :studyname"),
    @NamedQuery(name = InboundQuery.FIND_BY_SITE_STATUS, query = "SELECT u FROM InboundQuery u WHERE u.site = :site AND u.status = :status"),
    @NamedQuery(name = InboundQuery.FIND_BY_USER_STATUS, query = "SELECT u FROM InboundQuery u WHERE u.user = :user AND u.status = :status"),
})
public class InboundQuery extends DaqueryObject implements Serializable {
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
    
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private long id;

	private Timestamp lastupdate;

	@Column(length=500)
	private String oraclequery;

	@Column(length=500)
	private String queryname;

	@Column(length=50)
	private String querytype;

	@Column(length=500)
	private String sqlquery;

	@Column(length=500)
	private String status;

	@Column(length=500)
	private String studyname;

	//bi-directional many-to-one association to Network
	@ManyToOne
	@JoinColumn(name="NETWORK_ID")
	private Network network;

	//bi-directional many-to-one association to Site
	@ManyToOne
	@JoinColumn(name="SITE_ID")
	private Site site;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private User user;

	public InboundQuery() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Timestamp getLastupdate() {
		return this.lastupdate;
	}

	public void setLastupdate(Timestamp lastupdate) {
		this.lastupdate = lastupdate;
	}

	public String getOraclequery() {
		return this.oraclequery;
	}

	public void setOraclequery(String oraclequery) {
		this.oraclequery = oraclequery;
	}

	public String getQueryname() {
		return this.queryname;
	}

	public void setQueryname(String queryname) {
		this.queryname = queryname;
	}

	public String getQuerytype() {
		return this.querytype;
	}

	public void setQuerytype(String querytype) {
		this.querytype = querytype;
	}

	public String getSqlquery() {
		return this.sqlquery;
	}

	public void setSqlquery(String sqlquery) {
		this.sqlquery = sqlquery;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStudyname() {
		return this.studyname;
	}

	public void setStudyname(String studyname) {
		this.studyname = studyname;
	}

	public Network getNetwork() {
		return this.network;
	}

	public void setNetwork(Network network) {
		this.network = network;
	}

	public Site getSite() {
		return this.site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	 // ======================================
    // =   Methods hash, equals, toString   =
    // ======================================

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InboundQuery inbound_query = (InboundQuery) o;
        return Objects.equals(id, inbound_query.id);
    }


	@Override
    public int hashCode() {
        return Objects.hash(id);
    }

	@Override
	public String toString() {
		return "Inbound_Query {id=" + id + ", studyName=" + studyname + ", queryName=" + queryname + ", queryType="
				+ querytype + ", site=" + site + ", user=" + user + ", lastUpdate=" + lastupdate + ", status="
				+ status + ", oracleQuery=" + oraclequery + ", sqlQuery=" + sqlquery + "}";
	}

}
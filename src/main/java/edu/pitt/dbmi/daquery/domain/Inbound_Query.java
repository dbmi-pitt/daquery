package edu.pitt.dbmi.daquery.domain;

import java.io.Serializable;
import javax.persistence.*;

import com.google.gson.annotations.Expose;

import java.sql.Timestamp;
import java.util.Objects;


/**
 * The persistent class for the INBOUND_QUERIES database table.
 * 
 */


@NamedQueries({
    @NamedQuery(name = Inbound_Query.FIND_ALL, query = "SELECT u FROM Inbound_Query u ORDER BY u.lastupdate DESC"),
    @NamedQuery(name = Inbound_Query.FIND_BY_ID, query = "SELECT u FROM Inbound_Query u WHERE u.id = :id"),
    @NamedQuery(name = Inbound_Query.COUNT_ALL, query = "SELECT COUNT(u) FROM Inbound_Query u"),
})
/*    @NamedQuery(name = Inbound_Query.FIND_BY_STATUS, query = "SELECT u FROM Inbound_Query u WHERE u.status = :status"),
    @NamedQuery(name = Inbound_Query.FIND_BY_SITE, query = "SELECT u FROM Inbound_Query u WHERE u.site_id = :site_id"),
    @NamedQuery(name = Inbound_Query.FIND_BY_STUDY, query = "SELECT u FROM Inbound_Query u WHERE u.studyname = :studyname"),
    @NamedQuery(name = Inbound_Query.FIND_BY_SITE_STATUS, query = "SELECT u FROM Inbound_Query u WHERE u.site_id = :site_id AND u.status = :status"),
    @NamedQuery(name = Inbound_Query.FIND_BY_USER_STATUS, query = "SELECT u FROM Inbound_Query u WHERE u.user_id = :user_id AND u.status = :status"),
})
*/

@Entity
@Table(name="Inbound_Query")
public class Inbound_Query extends DaqueryObject implements Serializable {
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

	@Expose
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private long id;

	private Timestamp lastupdate;

	@Expose
	@Column(length=500)
	private String oraclequery;

	@Expose
	@Column(length=500)
	private String queryname;

	@Expose
	@Column(length=50)
	private String querytype;

	@Expose
	@Column(length=500)
	private String sqlquery;

	@Expose
	@Column(length=500)
	private String status;

	@Expose
	@Column(length=500)
	private String studyname;

	//single directional many-to-one association to Network
	@Expose
	@ManyToOne
	@JoinColumn(name="NETWORK_ID")
	private Network network;

	//single directional many-to-one association to Site
	@Expose
	@ManyToOne
	@JoinColumn(name="SITE_ID")
	private Site site;

	//single directional many-to-one association to User
	@Expose
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private Site_User user;

	public Inbound_Query() {
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
	
    public Long getSiteId() {
    	if (this.site == null)
    		return (long) -1;
    	return this.site.getId();
    }	
	
	public void setSiteId(long site_id) {
		//TODO: this is a dummy call right now
		//to satisfy JPA
		//we need to look up the site according to site_id
	}

	public void setSite(Site site) {
		this.site = site;
	}
	
	public String getUserId() {
		if (this.user == null) {
			return null;
		}
		return this.user.getId();
	}
	
	public void setUserId(String userID) {
		//TODO: this is a dummy call right now
		//to satisfy JPA
		//we need to look up the user according to user_id
		
	}

	public Site_User getUser() {
		return this.user;
	}

	public void setUser(Site_User user) {
		this.user = user;
	}
	
	 // ======================================
    // =   Methods hash, equals, toString   =
    // ======================================

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inbound_Query inbound_query = (Inbound_Query) o;
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
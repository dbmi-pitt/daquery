package edu.pitt.dbmi.daquery.domain;

import java.io.Serializable;
import javax.persistence.*;

import edu.pitt.dbmi.daquery.common.domain.DaqueryObject;

import java.sql.Timestamp;


/**
 * The persistent class for the OUTBOUND_QUERIES database table.
 * 
 */
@Entity
@Table(name="Outbound_Query")
@NamedQuery(name="OutboundQuery.findAll", query="SELECT o FROM OutboundQuery o")
public class OutboundQuery extends DaqueryObject implements Serializable {
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
	private Site_User user;

	public OutboundQuery() {
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

	public Site_User getUser() {
		return this.user;
	}

	public void setUser(Site_User user) {
		this.user = user;
	}

}
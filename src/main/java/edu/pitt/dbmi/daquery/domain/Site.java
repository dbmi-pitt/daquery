package edu.pitt.dbmi.daquery.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.google.gson.annotations.Expose;

import edu.pitt.dbmi.daquery.common.domain.DaqueryObject;
import edu.pitt.dbmi.daquery.common.domain.SiteStatus;

import java.util.List;
import java.util.Objects;


/**
 * The persistent class for the SITES database table.
 * 
 */
@NamedQueries({
	@NamedQuery(name=Site.FIND_ALL, query="SELECT s FROM Site s"),
	@NamedQuery(name=Site.FIND_BY_ID, query="SELECT s FROM Site s WHERE s.id = :id"),
	@NamedQuery(name=Site.FIND_BY_TYPE, query="SELECT s FROM Site s WHERE s.type = :type"),
	@NamedQuery(name=Site.COUNT_ALL, query="SELECT count(s) FROM Site s")
})

@Entity
@Table(name="Site")
public class Site extends DaqueryObject implements Serializable {
	// ======================================
    // =             Constants              =
    // ======================================

    public static final String FIND_ALL = "Site.findAll";
    public static final String FIND_BY_ID = "Site.findId";
    public static final String COUNT_ALL = "Site.countAll";
    public static final String FIND_BY_TYPE = "Site.findByType";

	private static final long serialVersionUID = 1L;

	@Expose
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID", unique=true, nullable=false)
	private long id;

	@Expose
    @Column(name = "SITE_ID", unique = true, length=50)
	private String site_id;

	@Expose
	@Column(name= "NAME", nullable=false, length=100)
	private String name;

	@Expose
	@Column(name= "TYPE", nullable=false, length=100)
	private String type;

	@Expose
	@Column(name= "URL", nullable=false, length=500)
	private String url;

	@Expose
	@Column(name= "ADMIN_EMAIL", nullable=false, length=500)
	private String admin_email;

	@Column(name= "STATUS", nullable=false, length=500)
	private int status;
	
	@Expose
	@Transient
	private SiteStatus statusValue;
	
	//bi-directional many-to-one association to InboundQuery
    @Transient
	@OneToMany(mappedBy="site")
	private List<Inbound_Query> inboundQueries;

	//bi-directional many-to-one association to OutboundQuery
    @Transient
	@OneToMany(mappedBy="site")
	private List<OutboundQuery> outboundQueries;

	//bi-directional many-to-one association to Network
	@Expose
	@ManyToOne
	@JoinColumn(name="NETWORK_ID", nullable=false)
	private Network network;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "REQUEST_SENT")
	private java.util.Date request_sent;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "REQUEST_REPLIED")
	private java.util.Date request_replied;
	
	public Site() {
	}
	
	//TODO: I need some more constructors
	//take nmae, URL, adminEmail, status as parameters 
	//make an option one that take a UUID
	public Site(String newName) {
		this.name = newName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSite_id() {
		return site_id;
	}

	public void setSite_id(String site_id) {
		this.site_id = site_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getAdmin_email() {
		return admin_email;
	}

	public void setAdmin_email(String admin_email) {
		this.admin_email = admin_email;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public SiteStatus getStatusValue() {
		return statusValue;
	}

	public void setStatusValue(SiteStatus statusValue) {
		this.statusValue = statusValue;
	}

	public Network getNetwork() {
		return network;
	}

	public void setNetwork(Network network) {
		this.network = network;
	}

	public java.util.Date getRequest_sent() {
		return request_sent;
	}

	public void setRequest_sent(java.util.Date request_sent) {
		this.request_sent = request_sent;
	}

	public java.util.Date getRequest_replied() {
		return request_replied;
	}

	public void setRequest_replied(java.util.Date request_replied) {
		this.request_replied = request_replied;
	}

	public List<Inbound_Query> getInboundQueries() {
		return this.inboundQueries;
	}

	public void setInboundQueries(List<Inbound_Query> inboundQueries) {
		this.inboundQueries = inboundQueries;
	}

	public Inbound_Query addInboundQuery(Inbound_Query inboundQuery) {
		getInboundQueries().add(inboundQuery);
		inboundQuery.setSite(this);

		return inboundQuery;
	}

	public Inbound_Query removeInboundQuery(Inbound_Query inboundQuery) {
		getInboundQueries().remove(inboundQuery);
		inboundQuery.setSite(null);

		return inboundQuery;
	}

	public List<OutboundQuery> getOutboundQueries() {
		return this.outboundQueries;
	}

	public void setOutboundQueries(List<OutboundQuery> outboundQueries) {
		this.outboundQueries = outboundQueries;
	}

	public OutboundQuery addOutboundQuery(OutboundQuery outboundQuery) {
		getOutboundQueries().add(outboundQuery);
		outboundQuery.setSite(this);

		return outboundQuery;
	}

	public OutboundQuery removeOutboundQuery(OutboundQuery outboundQuery) {
		getOutboundQueries().remove(outboundQuery);
		outboundQuery.setSite(null);

		return outboundQuery;
	}

	
	// ======================================
    // =   Methods hash, equals, toString   =
    // ======================================

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Site site = (Site) o;
        return Objects.equals(id, site.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Site {" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
    

}
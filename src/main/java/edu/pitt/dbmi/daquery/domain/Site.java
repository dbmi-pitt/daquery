package edu.pitt.dbmi.daquery.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import java.util.Objects;


/**
 * The persistent class for the SITES database table.
 * 
 */
@Entity
@Table(name="SITES")
@NamedQueries({
	@NamedQuery(name=Site.FIND_ALL, query="SELECT s FROM Site s"),
	@NamedQuery(name=Site.FIND_BY_TYPE, query="SELECT s FROM Site s WHERE s.type = :type"),
	@NamedQuery(name=Site.COUNT_ALL, query="SELECT count(s) FROM Site s")
})
public class Site extends DaqueryObject implements Serializable {
	// ======================================
    // =             Constants              =
    // ======================================

    public static final String FIND_ALL = "Site.findAll";
    public static final String COUNT_ALL = "Site.countAll";
    public static final String FIND_BY_TYPE = "Site.findByType";

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private long id;

	@Column(nullable=false, length=100)
	private String name;

	@Column(nullable=false, length=100)
	private String type;

	//bi-directional many-to-one association to InboundQuery
	@OneToMany(mappedBy="site")
	private List<InboundQuery> inboundQueries;

	//bi-directional many-to-one association to OutboundQuery
	@OneToMany(mappedBy="site")
	private List<OutboundQuery> outboundQueries;

	//bi-directional many-to-one association to Network
	@ManyToOne
	@JoinColumn(name="NETWORK_ID", nullable=false)
	private Network network;

	public Site() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<InboundQuery> getInboundQueries() {
		return this.inboundQueries;
	}

	public void setInboundQueries(List<InboundQuery> inboundQueries) {
		this.inboundQueries = inboundQueries;
	}

	public InboundQuery addInboundQuery(InboundQuery inboundQuery) {
		getInboundQueries().add(inboundQuery);
		inboundQuery.setSite(this);

		return inboundQuery;
	}

	public InboundQuery removeInboundQuery(InboundQuery inboundQuery) {
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

	public Network getNetwork() {
		return this.network;
	}

	public void setNetwork(Network network) {
		this.network = network;
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
    
    /**
     * The toJson method in DaqueryObject needs to be overriden
     * The user's encrypted password needs to be removed from the Json string
     */
    @Override
	public String toJson() {
    	return super.toJson();    	
    }

}
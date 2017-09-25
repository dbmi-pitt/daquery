package edu.pitt.dbmi.daquery.domain;

import java.io.Serializable;
import javax.persistence.*;

import com.google.gson.annotations.Expose;

import edu.pitt.dbmi.daquery.common.domain.DaqueryObject;

import java.util.List;
import java.util.Objects;


/**
 * The persistent class for the SITES database table.
 * 
 */
@NamedQueries({
	@NamedQuery(name=Site.FIND_ALL, query="SELECT s FROM Site s"),
	@NamedQuery(name=Site.FIND_BY_TYPE, query="SELECT s FROM Site s WHERE s.type = :type"),
	@NamedQuery(name=Site.COUNT_ALL, query="SELECT count(s) FROM Site s")
})

@Entity
@Table(name="SITE")
public class Site extends DaqueryObject implements Serializable {
	// ======================================
    // =             Constants              =
    // ======================================

    public static final String FIND_ALL = "Site.findAll";
    public static final String COUNT_ALL = "Site.countAll";
    public static final String FIND_BY_TYPE = "Site.findByType";

	private static final long serialVersionUID = 1L;

	@Expose
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private long id;

	@Expose
	@Column(nullable=false, length=100)
	private String name;

	@Expose
	@Column(nullable=false, length=100)
	private String type;

	//bi-directional many-to-one association to InboundQuery
	@OneToMany(mappedBy="site")
	private List<Inbound_Query> inboundQueries;

	//bi-directional many-to-one association to OutboundQuery
	@OneToMany(mappedBy="site")
	private List<OutboundQuery> outboundQueries;

	//bi-directional many-to-one association to Network
	@Expose
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
    

}
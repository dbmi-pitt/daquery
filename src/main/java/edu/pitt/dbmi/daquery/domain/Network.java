package edu.pitt.dbmi.daquery.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import java.util.Objects;


/**
 * The persistent class for the NETWORKS database table.
 * 
 */
@Entity
@Table(name="NETWORKS")
@NamedQuery(name="Network.findAll", query="SELECT n FROM Network n")
public class Network extends DaqueryObject implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private long id;

	@Column(nullable=false, length=100)
	private String name;

	//bi-directional many-to-one association to InboundQuery
	@OneToMany(mappedBy="network")
	private List<InboundQuery> inboundQueries;

	//bi-directional many-to-one association to OutboundQuery
	@OneToMany(mappedBy="network")
	private List<OutboundQuery> outboundQueries;

	//bi-directional many-to-one association to Site
	@OneToMany(mappedBy="network")
	private List<Site> sites;

	public Network() {
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
		inboundQuery.setNetwork(this);

		return inboundQuery;
	}

	public InboundQuery removeInboundQuery(InboundQuery inboundQuery) {
		getInboundQueries().remove(inboundQuery);
		inboundQuery.setNetwork(null);

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
		outboundQuery.setNetwork(this);

		return outboundQuery;
	}

	public OutboundQuery removeOutboundQuery(OutboundQuery outboundQuery) {
		getOutboundQueries().remove(outboundQuery);
		outboundQuery.setNetwork(null);

		return outboundQuery;
	}

	public List<Site> getSites() {
		return this.sites;
	}

	public void setSites(List<Site> sites) {
		this.sites = sites;
	}

	public Site addSite(Site site) {
		getSites().add(site);
		site.setNetwork(this);

		return site;
	}

	public Site removeSite(Site site) {
		getSites().remove(site);
		site.setNetwork(null);

		return site;
	}
	
	// ======================================
    // =   Methods hash, equals, toString   =
    // ======================================

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Network network = (Network) o;
        return Objects.equals(id, network.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Network {" +
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
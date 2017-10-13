package edu.pitt.dbmi.daquery.domain;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import com.google.gson.annotations.Expose;

import edu.pitt.dbmi.daquery.common.domain.DaqueryObject;

import java.util.List;
import java.util.Objects;

@NamedQueries({
    @NamedQuery(name = Network.FIND_ALL, query = "SELECT u FROM Network u ORDER BY u.name DESC"),
    @NamedQuery(name = Network.FIND_BY_ID, query = "SELECT u FROM Network u WHERE u.id = :id"),
    @NamedQuery(name = Network.FIND_BY_UUID, query = "SELECT u FROM Network u WHERE u.network_id = :uuid"),
})

/**
 * The persistent class for the NETWORKS database table.
 * 
 */
@Entity
@Table(name="Network")
public class Network extends DaqueryObject implements Serializable {
	private static final long serialVersionUID = 1L;
    public static final String FIND_ALL = "Network.findAll";
    public static final String FIND_BY_ID = "Network.findByID";
    public static final String FIND_BY_UUID = "Network.findByUUID";


    @Expose
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID", unique=true, nullable=false)
	private long id;
    
	@Expose
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "NETWORK_ID", unique = true, length=50)
	private String network_id;

	@Expose
	@Column(name = "NAME", nullable=false, length=100)
	private String name;
	
	@Column(name = "DATABASE_URL", nullable=true, length=500)
	private String database_url;
	
	@Column(name = "DATABASE_USERNAME", nullable=true, length=100)
	private String database_username;
	
	@Column(name = "DATABASE_PASSWORD", nullable=true, length=100)
	private String database_password;
	
	@Expose
	@Column(name = "DATA_MODEL", nullable=true, length=100)
	private String data_model;
	
	//bi-directional many-to-one association to InboundQuery
	@Transient
	@OneToMany(mappedBy="network")
	private List<Inbound_Query> inboundQueries;

	//bi-directional many-to-one association to OutboundQuery
	@Transient
	@OneToMany(mappedBy="network")
	private List<OutboundQuery> outboundQueries;

	//bi-directional many-to-one association to Site
	//@Transient
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy="network")
	private List<Site> sites;

	public Network() {
	}
	
	public Network(String newName) {
		this.name = newName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNetwork_Id() {
		return this.network_id;
	}

	public void setNetwork_Id(String id) {
		this.network_id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getDatabase_url() {
		return database_url;
	}

	public void setDatabase_url(String database_url) {
		this.database_url = database_url;
	}

	public String getDatabase_username() {
		return database_username;
	}

	public void setDatabase_username(String database_username) {
		this.database_username = database_username;
	}

	public String getDatabase_password() {
		return database_password;
	}

	public void setDatabase_password(String database_password) {
		this.database_password = database_password;
	}

	public String getData_model() {
		return data_model;
	}

	public void setData_model(String data_model) {
		this.data_model = data_model;
	}

	public List<Inbound_Query> getInboundQueries() {
		return this.inboundQueries;
	}

	public void setInboundQueries(List<Inbound_Query> inboundQueries) {
		this.inboundQueries = inboundQueries;
	}

	public Inbound_Query addInboundQuery(Inbound_Query inboundQuery) {
		getInboundQueries().add(inboundQuery);
		inboundQuery.setNetwork(this);

		return inboundQuery;
	}

	public Inbound_Query removeInboundQuery(Inbound_Query inboundQuery) {
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
        return Objects.equals(network_id, network.network_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(network_id);
    }


    
    @Override
	public String toString() {
		return "Network [id=" + id + ", network_id=" + network_id + ", name=" + name + ", inboundQueries="
				+ inboundQueries + ", outboundQueries=" + outboundQueries + ", sites=" + sites + "]";
	}
    

}
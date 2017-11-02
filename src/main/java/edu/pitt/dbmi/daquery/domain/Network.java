package edu.pitt.dbmi.daquery.domain;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import com.google.gson.annotations.Expose;

import edu.pitt.dbmi.daquery.common.domain.DaqueryObject;
import edu.pitt.dbmi.daquery.domain.inquiry.DaqueryRequest;

import java.util.Objects;
import java.util.Set;

@NamedQueries({
    @NamedQuery(name = Network.FIND_ALL, query = "SELECT u FROM Network u ORDER BY u.name DESC"),
    @NamedQuery(name = Network.FIND_BY_ID, query = "SELECT u FROM Network u WHERE u.id = :id"),
    @NamedQuery(name = Network.FIND_BY_UUID, query = "SELECT u FROM Network u WHERE u.networkId = :uuid"),

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
    @Column(name = "NETWORK_ID", unique = true, length=50)
	private String networkId;

	@Expose
	@Column(name = "NAME", nullable=false, length=100)
	private String name;
	
	@Expose
	@Column(name = "DATA_MODEL", nullable=true, length=100)
	private String dataModel;

	@Expose
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "OUTGOING_QUERY_SITES", joinColumns = @JoinColumn(name="NETWORK_ID"), inverseJoinColumns = @JoinColumn(name = "SITE_ID"))
	private Set<Site> outgoingQuerySites;

	@Expose
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "INCOMING_QUERY_SITES", joinColumns = @JoinColumn(name="NETWORK_ID"), inverseJoinColumns = @JoinColumn(name = "SITE_ID"))
	private Set<Site> incomingQuerySites;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "SOURCE_TO_NETWORK", joinColumns = { @JoinColumn(name = "NETWORK_ID") }, inverseJoinColumns = { @JoinColumn(name = "DATA_SOURCE_ID") })
	private Set<DataSource> dataSources;

	@Expose
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "OUTGOING_REQUESTS", joinColumns = @JoinColumn(name="NETWORK_ID"), inverseJoinColumns = @JoinColumn(name = "REQUEST_ID"))
	private Set<DaqueryRequest> outgoingRequests;

	@Expose
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "INCOMING_REQUESTS", joinColumns = @JoinColumn(name="NETWORK_ID"), inverseJoinColumns = @JoinColumn(name = "REQUEST_ID"))
	private Set<DaqueryRequest> incomingRequests;
	
	public Network(){}
	
	public Network(String newName) {
		this.name = newName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNetworkId() {
		return this.networkId;
	}

	public void setNetworkId(String id) {
		this.networkId = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getData_model() {
		return dataModel;
	}

	public void setData_model(String data_model) {
		this.dataModel = data_model;
	}



	public Set<Site> getOutgoingQuerySites()
	{
		return(outgoingQuerySites);
	}
	public void setOutgoingQuerySites(Set<Site> sites)
	{
		outgoingQuerySites = sites;
	}
	
	public Set<Site> getIncomingQuerySites()
	{
		return(incomingQuerySites);
	}
	public void setIncomingQuerySites(Set<Site> sites)
	{
		incomingQuerySites = sites;
	}

	public Set<DataSource> getDataSources(){return(dataSources);}
	public void setDataSources(Set<DataSource> ds){dataSources = ds;}
	
	public Set<DaqueryRequest> getOutgoingRequests(){return(outgoingRequests);}
	public void setOutgoingRequests(Set<DaqueryRequest> requests){outgoingRequests = requests;}
	
	public Set<DaqueryRequest> getIncomingRequests(){return(incomingRequests);}
	public void setIncomingRequests(Set<DaqueryRequest> requests){incomingRequests = requests;}
	
/*	public List<Site> getSites() {
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
	*/
	
	
	// ======================================
    // =   Methods hash, equals, toString   =
    // ======================================

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Network network = (Network) o;
        return Objects.equals(networkId, network.networkId);
    }

    
    @Override
	public String toString() {
		return "Network [id=" + id + ", network id=" + networkId + ", name=" + name  + "]";
	}
    

}
package edu.pitt.dbmi.daquery.common.domain;

import java.io.Serializable;
import javax.persistence.*;

import com.google.gson.annotations.Expose;

import java.util.Set;
import java.util.UUID;

@NamedQueries({
    @NamedQuery(name = Network.FIND_ALL, query = "SELECT u FROM Network u ORDER BY u.name DESC"),
    @NamedQuery(name = Network.FIND_BY_ID, query = "SELECT u FROM Network u WHERE u.id = :id"),
    @NamedQuery(name = Network.FIND_BY_NAME, query = "SELECT u FROM Network u WHERE u.name = :name"),
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
    public static final String FIND_BY_NAME = "Network.findByName";


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
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="DATA_MODEL_ID")
    private DataModel dataModel;
	
	@Expose
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "OUTGOING_QUERY_SITES", joinColumns = @JoinColumn(name="NETWORK_ID"), inverseJoinColumns = @JoinColumn(name = "SITE_ID"))
	private Set<Site> outgoingQuerySites;

	@Expose
	@Column(name="MAX_DATE_SHIFT")
	private Integer maxDateShift;
	
	@Expose
	@Column(name="MIN_DATE_SHIFT")
	private Integer minDateShift;
	
	@Expose
	@Column(name="SHIFT_DATES")
	private Boolean shiftDates;
	
	@Expose
	@Column(name="SERIALIZE_PATIENT_ID")
	private Boolean serializePatientId;
	
	@Expose
	@Column(name="OBFUSCATE_AGGREGATE_RESULTS")
	private Boolean obfuscateAggregateResults;
	
	@Expose
	@Column(name="AGGREGATE_OBFUSCATE_TYPE")
	private String aggregateObfuscateType; //RANGE or PERCENTAGE are the allowed values
	
	@Expose
	@Column(name="AGGREGATE_OBFUSCATE_PERCENT")
	private Float aggregateObfuscatePercent;
	
	@Expose
	@Column(name="AGGREGATE_OBFUSCATE_RANGE")
	private Integer aggregateObfuscateRange;

	@Expose
	@Column(name="AGGREGATE_OBFUSCATE_THRESHOLD")
	private Integer aggregateObfuscateThreshold;

	
	@Expose
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "INCOMING_QUERY_SITES", joinColumns = @JoinColumn(name="NETWORK_ID"), inverseJoinColumns = @JoinColumn(name = "SITE_ID"))
	private Set<Site> incomingQuerySites;
	
	public Network(){}
	
	public Network(boolean generateUUID) {
		if (generateUUID) {
			UUID newUUID = UUID.randomUUID();
			this.setNetworkId(newUUID.toString());
		}
	}
	
	public Network(String uuid) {
		this.networkId = uuid;
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
	
	public Integer getMaxDateShift(){if(maxDateShift == null) return(new Integer(0)); else return maxDateShift;}
	public void setMaxDateShift(Integer val){maxDateShift = val;}
	
	public Integer getMinDateShift(){if(minDateShift == null) return(new Integer(-365)); else return minDateShift;}
	public void setMinDateShift(Integer val){minDateShift = val;}
	
	public Boolean getShiftDates(){if(shiftDates == null) return(new Boolean(true)); else return shiftDates;}
	public void setShiftDates(Boolean val){shiftDates = val;}
	
	public Boolean getSerializePatientId(){if(serializePatientId == null) return(new Boolean(true)); else return serializePatientId;}
	public void setSerializePatientId(Boolean val){serializePatientId = val;}
	
	public Boolean getObfuscateAggregateResults(){if(obfuscateAggregateResults == null) return(new Boolean(true)); else return obfuscateAggregateResults;}
	public void setObfuscateAggregateResults(Boolean val){obfuscateAggregateResults = val;}
	
	public String getAggregateObfuscateType(){if(aggregateObfuscateType == null) return("RANGE"); else return aggregateObfuscateType;}
	public void setAggregateObfuscateType(String val){aggregateObfuscateType = val;}
	
	public Float getAggregtaeObfucatePercent(){if(aggregateObfuscatePercent == null) return(new Float(0.10f)); else return aggregateObfuscatePercent;}
	public void setAggregtaeObfucatePercent(Float val){aggregateObfuscatePercent = val;}
	
	public Integer getAggregateObfuscateRange(){if(aggregateObfuscateRange == null) return(new Integer(10)); else return aggregateObfuscateRange;}
	public void setAggregateObfuscateRange(Integer val){aggregateObfuscateRange = val;}
	
	public Integer getAggregateObfuscateThreshold(){if(aggregateObfuscateThreshold == null) return(new Integer(10)); else return aggregateObfuscateThreshold;}
	public void setAggregateObfuscateThreshold(Integer val){aggregateObfuscateThreshold = val;}
	//#TODO: add a method addIncomingSite(Site) 
	
	public DataModel getDataModel(){return(dataModel);}
	public void setDataModel(DataModel model){dataModel = model;}
    
    @Override
	public String toString() {
		return "Network [id=" + id + ", network id=" + networkId + ", name=" + name  + "]";
	}
    

}
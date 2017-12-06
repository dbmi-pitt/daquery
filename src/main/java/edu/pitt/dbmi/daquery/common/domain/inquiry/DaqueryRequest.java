package edu.pitt.dbmi.daquery.common.domain.inquiry;

import java.util.Date;
import java.util.Set;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.google.gson.annotations.Expose;

import edu.pitt.dbmi.daquery.common.domain.DaqueryObject;
import edu.pitt.dbmi.daquery.common.domain.DaqueryUser;
import edu.pitt.dbmi.daquery.common.domain.Network;
import edu.pitt.dbmi.daquery.common.domain.Site;

@Entity
@Table(name="DAQUERY_REQUEST")
public class DaqueryRequest extends DaqueryObject
{
	private static final long serialVersionUID = 292729082342423l;
	
    @Expose
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID", unique=true, nullable=false)
	private long id;
    
	@Expose
    @Column(name = "REQUESTID",unique = true, length=50)
	private String requestId;
	
	@Expose
	@Column(name = "REQUEST_GROUP")
	private String requestGroup;
	
	@Expose
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="REQUEST_SITE_ID")
    private Site requestSite;
    
    @Expose
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="SENT_TIMESTAMP")
    private Date sentTimestamp;

    @Expose
    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="REQUESTER_ID")
    private DaqueryUser requester;

    @Expose
	private String direction;

    @Expose
    @ManyToOne(fetch=FetchType.EAGER, cascade={CascadeType.ALL})
    @JoinColumn(name = "INQUIRY_ID")
    private Inquiry inquiry;
    
    @Expose
	@OneToMany(fetch = FetchType.EAGER, cascade={CascadeType.ALL}, mappedBy="request")
	private Set<DaqueryResponse> responses;
		
	public DaqueryRequest() {
		
	}
	
	public DaqueryRequest(boolean generateUUID) {
		if (generateUUID) {
			UUID newUUID = UUID.randomUUID();
			this.setRequestId(newUUID.toString());
		}
		
	}
	
	@Expose
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="NETWORK_ID")
	private Network network;
	
	public long getId(){return(id);}
	public void setId(long id){this.id = id;}
	
	public String getRequestId(){return(requestId);}
	public void setRequestId(String id){requestId = id;}
	
	public String getRequestGroup(){return(requestGroup);}
	public void setRequestGroup(String group){requestGroup = group;}
	
	public Site getRequestSite(){return(requestSite);}
	public void setRequestSite(Site site){requestSite = site;}
	
	public Date getSentTimestamp(){return(sentTimestamp);}
	public void setSentTimestamp(Date timestamp){sentTimestamp = timestamp;}
	
	public DaqueryUser getRequester(){return(requester);}
	public void setRequester(DaqueryUser user){requester = user;}
	
	public String getDirection(){return(direction);}
	public void setDirection(String direction){this.direction = direction;}
	
	public Inquiry getInquiry(){return(inquiry);}
	public void setInquiry(Inquiry inq){inquiry = inq;}
	
	public Set<DaqueryResponse> getResponses(){return(responses);}
	public void setResponses(Set<DaqueryResponse> resps){responses = resps;}
	
	public RequestDirection getDirectionEnum(){return(RequestDirection.valueOf(direction));}
	public void setDirectionEnum(RequestDirection dir){direction = dir.toString();}
	
	public Network getNetwork(){return(network);}
	public void setNetwork(Network net){network = net;}

}

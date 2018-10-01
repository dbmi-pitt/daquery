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
import javax.persistence.Transient;

import com.google.gson.annotations.Expose;

import edu.pitt.dbmi.daquery.common.domain.DaqueryObject;
import edu.pitt.dbmi.daquery.common.domain.Network;
import edu.pitt.dbmi.daquery.common.domain.Site;
import edu.pitt.dbmi.daquery.common.domain.UserInfo;
import edu.pitt.dbmi.daquery.common.util.StringHelper;

@Entity
@Table(name="DAQUERY_REQUEST")
public class DaqueryRequest extends DaqueryObject
{
	private static final long serialVersionUID = 292729082342423l;
	
    @Expose
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID", unique=true, nullable=false)
	private Long id;
    
	@Expose
    @Column(name = "REQUESTID",unique = true, length=50)
	private String requestId;
	
	@Expose
	@Column(name = "REQUEST_GROUP")
	private String requestGroup;
	
	@Expose
    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="REQUEST_SITE_ID")
    private Site requestSite;
	
	@Expose
    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="REQUESTER_SITE_ID")
    private Site requesterSite;
    
    @Expose
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="SENT_TIMESTAMP")
    private Date sentTimestamp;

    @Expose
    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="REQUESTER_ID")
    private UserInfo requester;

    @Expose
	private String direction;

    @Expose
    @ManyToOne(fetch=FetchType.EAGER, cascade={CascadeType.ALL})
    @JoinColumn(name = "INQUIRY_ID")
    private Inquiry inquiry;
    
    @Expose
	@OneToMany(fetch = FetchType.EAGER, cascade={CascadeType.ALL}, mappedBy="request")
	private Set<DaqueryResponse> responses;
    
    @Expose
    @Transient
    private String code;
    
    @Expose
    private Boolean archived;
		
	public DaqueryRequest() {
		
	}
	
	public DaqueryRequest(boolean generateUUID) {
		if (generateUUID) {
			UUID newUUID = UUID.randomUUID();
			this.setRequestId(newUUID.toString());
		}
		
	}
	
	@Expose
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="NETWORK_ID")
	private Network network;
	
	public Long getId(){return(id);}
	public void setId(Long id){this.id = id;}
	
	public String getRequestId(){return(requestId);}
	public void setRequestId(String id){requestId = id;}
	
	public String getRequestGroup(){return(requestGroup);}
	public void setRequestGroup(String group){requestGroup = group;}
	
	public Site getRequestSite(){return(requestSite);}
	public void setRequestSite(Site site){requestSite = site;}
	
	public Site getRequesterSite(){return(requesterSite);}
	public void setRequesterSite(Site site){requesterSite = site;}
	
	public Date getSentTimestamp(){return(sentTimestamp);}
	public void setSentTimestamp(Date timestamp){sentTimestamp = timestamp;}
	
	public UserInfo getRequester(){return(requester);}
	public void setRequester(UserInfo user){requester = user;}
	
	public String getDirection(){return(direction);}
	public void setDirection(String direction){this.direction = direction;}
	
	public Inquiry getInquiry(){return(inquiry);}
	public void setInquiry(Inquiry inq){inquiry = inq;}
	
	public Set<DaqueryResponse> getResponses(){return(responses);}
	public void setResponses(Set<DaqueryResponse> resps){responses = resps;}
	
	public Boolean getArchived(){return archived;}
	public void setArchived(Boolean archived){this.archived = archived;}
	
	public RequestDirection getDirectionEnum()
	{
		//check for null
		if (direction == null) {
			return null;
		}
		return(RequestDirection.valueOf(direction));
	}
	public void setDirectionEnum(RequestDirection dir)
	{
		//check for null
		if (dir == null) {
			direction = null;
		} 
		else 
		{
			direction = dir.toString();
		}
	}
	
	public Network getNetwork(){return(network);}
	public void setNetwork(Network net){network = net;}
	
	public String getCode() { return code; }
	public void setCode(String code){ this.code = code; }
	
	@Transient
	public String getFilePrefix()
	{
		String username = "";
		String inqName = "";
		String dtTime = "";
		if(getRequester() != null && !StringHelper.isEmpty(getRequester().getEmail()))
			username = StringHelper.usernameFromEmail(getRequester().getEmail()) + "-";
		if(getInquiry() != null && ! StringHelper.isEmpty(getInquiry().getInquiryName()))
			inqName = StringHelper.replaceInFilename(getInquiry().getInquiryName()) + "-";
		if(this.getSentTimestamp() != null)
			dtTime = StringHelper.formatDate(getSentTimestamp());
		return username + inqName + dtTime;
	}

	@Override
	public String toString()
	{
		String rVal = null;
		if(getInquiry() == null || getInquiry().getInquiryName() == null)
			rVal = "null:";
		else
			rVal = getInquiry().getInquiryName() + ":";
		
		if(getRequestId() == null)
			rVal = rVal + "null";
		else
			rVal = rVal + getRequestId();
				return(rVal);
	}
}

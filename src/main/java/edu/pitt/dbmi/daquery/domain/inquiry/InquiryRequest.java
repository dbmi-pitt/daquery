package edu.pitt.dbmi.daquery.domain.inquiry;

import java.util.Date;
import java.util.Set;

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
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.domain.DaqueryUser;
import edu.pitt.dbmi.daquery.domain.Site;

@Entity
@Table(name="INQUIRY_REQUEST")
public class InquiryRequest extends DaqueryObject
{
	private static final long serialVersionUID = 292729082342423l;
	
    @Expose
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID", unique=true, nullable=false)
	private long id;
    
	@Expose
    @Column(name = "REQUEST_ID",unique = true, length=50)
	private String requestId;
	
	
    @OneToOne
    @JoinColumn(name="REQUEST_SITE_ID")
    private Site requestSite;

    @Expose
    @Column(name="REQUEST_SITE_ID", insertable = false, updatable = false)
	private String requestSiteId;
    
    @Expose
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="SENT_TIMESTAMP")
    private Date sentTimestamp;
    
    @OneToOne
    @JoinColumn(name="REQUESTER_ID")
    private DaqueryUser requester;

    @Expose
    @Column(name="REQUESTER_ID", insertable = false, updatable = false)
    private String requesterId;

    @Expose
	private String direction;

    @Expose
    @ManyToOne(fetch=FetchType.EAGER, cascade={CascadeType.ALL})
    @JoinColumn(name = "INQUIRY_ID")
    private Inquiry inquiry;
    
	@OneToMany(fetch = FetchType.EAGER, cascade={CascadeType.ALL}, mappedBy="request")
	private Set<InquiryResponse> responses;
		
	public long getId(){return(id);}
	public void setId(long id){this.id = id;}
	
	public String getRequestId(){return(requestId);}
	public void setRequestId(String id){requestId = id;}
	
	public Site getRequestSite(){return(requestSite);}
	public void setRequestSite(Site site){requestSite = site;}
	
	public String getRequestSiteId(){return(requestSiteId);}
	public void setRequestSiteId(String id)throws DaqueryException{ throw new DaqueryException("InquiryRequest.requestSiteId is obtained from the requestSite field and cannot be set.");}
	
	public Date getSentTimestamp(){return(sentTimestamp);}
	public void setSentTimestamp(Date timestamp){sentTimestamp = timestamp;}
	
	public DaqueryUser getRequester(){return(requester);}
	public void setRequester(DaqueryUser user){requester = user;}
	
	public String getDirection(){return(direction);}
	public void setDirection(String direction){this.direction = direction;}
	
	public Inquiry getInquiry(){return(inquiry);}
	public void setInquiry(Inquiry inq){inquiry = inq;}
	
	public Set<InquiryResponse> getResponses(){return(responses);}
	public void setResponses(Set<InquiryResponse> resps){responses = resps;}
	
	public RequestDirection getDirectionEnum(){return(RequestDirection.valueOf(direction));}
	public void setDirectionEnum(RequestDirection dir){direction = dir.toString();}

}

package edu.pitt.dbmi.daquery.domain.inquiry;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.google.gson.annotations.Expose;

import edu.pitt.dbmi.daquery.domain.DaqueryUser;
import edu.pitt.dbmi.daquery.domain.Site;

public class InquiryRequest
{
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
    @Column(name="REQUEST_SITE_ID")
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
    private Inquiry inquiry;
    
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "RESPONSE_ID", nullable = false)
	private InquiryResponse response;
	
	public RequestDirection getDirectionEnum()
	{
		return(RequestDirection.valueOf(direction));
	}
	public void setDirectionEnum(RequestDirection dir)
	{
		direction = direction.toString();
	}
	
}

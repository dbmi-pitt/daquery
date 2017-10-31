package edu.pitt.dbmi.daquery.domain.inquiry;

import java.util.Date;

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

import edu.pitt.dbmi.daquery.domain.Site;
import edu.pitt.dbmi.daquery.domain.UserInfo;

@Entity
@Table(name="INQUIRY_RESPONSE")
public class InquiryResponse
{
    @Expose
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID", unique=true, nullable=false)
	private long id;
    
    @Expose
    @Temporal(TemporalType.TIMESTAMP)	
	@Column(name="RECEIVED_TIMESTAMP")    
	private Date receivedTimestamp;
    
	private String status;
	
	@Column(name="RESPONSE_VALUE")
	private String value;
	
    @OneToOne
    @JoinColumn(name="USER_ID")
	private UserInfo responder;
    
    @OneToOne(fetch=FetchType.EAGER, cascade={CascadeType.ALL})
	@JoinColumn(name="fileset_id", nullable=false)
	private Fileset files;

    @OneToOne
    @JoinColumn(name="SITE_ID")
	private Site site;
	
    @ManyToOne(fetch=FetchType.EAGER)
    private InquiryRequest request;
}

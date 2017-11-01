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
	@Column(name="REPLY_TIMESTAMP")    
	private Date replyTimestamp;
    
    @Expose
	private String status;
	
	@Column(name="RESPONSE_VALUE")
	private String value;
	
	@Expose
    @OneToOne
    @JoinColumn(name="USER_ID")
	private UserInfo responder;
    
    @OneToOne(fetch=FetchType.EAGER, cascade={CascadeType.ALL})
	@JoinColumn(name="fileset_id", nullable=false)
	private Fileset files;

    @Expose
    @OneToOne
    @JoinColumn(name="SITE_ID")
	private Site site;
	
    @Expose
    @ManyToOne(fetch=FetchType.EAGER)
    private InquiryRequest request;
    
    @Expose
    @Column(name = "ERROR_MESSAGE")
    private String errorMessage;
    
    public long getId(){return(id);}
    public void setId(long id){this.id = id;}
    
    public Date getReplyTimestamp(){return(replyTimestamp);}
    public void setReplyTimestamp(Date timestamp){replyTimestamp = timestamp;}
    
    public String getStatus(){return(status);}
    public void setStatus(String stat){status = stat;}
    
    public ResponseStatus getStatusEnum(){return(ResponseStatus.valueOf(status));}
    public void setStatusEnum(ResponseStatus stat){status = stat.name();}
    
    public String getValue(){return(value);}
    public void setValue(String val){value = val;}
    
    public UserInfo getResponder(){return(responder);}
    public void setResponder(UserInfo respnder){responder = respnder;}
    
    public Fileset getFiles(){return(files);}
    public void setFiles(Fileset files){this.files = files;}
    
    public Site getSite(){return(site);}
    public void setSite(Site site){this.site = site;}
    
    public InquiryRequest getRequest(){return(request);}
    public void setRequest(InquiryRequest reqst){request = reqst;}
    
    public String getErrorMessage(){return(errorMessage);}
    public void setErrorMessage(String msg){errorMessage = msg;}
    
}

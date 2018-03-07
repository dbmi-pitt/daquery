package edu.pitt.dbmi.daquery.common.domain.inquiry;

import java.util.Date;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.google.gson.annotations.Expose;

import edu.pitt.dbmi.daquery.common.domain.DaqueryObject;
import edu.pitt.dbmi.daquery.common.domain.Site;
import edu.pitt.dbmi.daquery.common.domain.UserInfo;

@Entity
@Table(name="DAQUERY_RESPONSE")
public class DaqueryResponse extends DaqueryObject
{
	private static final long serialVersionUID = 2923990823424234234l;
	
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID", unique=true, nullable=false)
	private Long id;

    @Expose
    @Column(name = "RESPONSE_ID")
    String responseId;
    
    @Expose
    @Temporal(TemporalType.TIMESTAMP)	
	@Column(name="REPLY_TIMESTAMP")    
	private Date replyTimestamp;
    
    @Expose
	private String status;
	
    @Expose
	@Column(name="RESPONSE_VALUE")
	private String value;
	
	@Expose
    @OneToOne
    @JoinColumn(name="USER_ID")
	private UserInfo responder;
    
    @OneToOne(fetch=FetchType.EAGER, cascade={CascadeType.ALL})
	@JoinColumn(name="fileset_id", nullable=false)
	private Fileset files;

    @OneToOne
    @JoinColumn(name="SITE_ID")
	private Site site;

    @Expose
    @Column(name="SITE_ID", insertable = false, updatable = false)
    private String siteId;
    
    @ManyToOne(fetch=FetchType.EAGER, cascade={CascadeType.ALL})
    @JoinColumn(name="REQID")
    private DaqueryRequest request;
    
    @Expose
    @Column(name = "ERROR_MESSAGE")
    private String errorMessage;
    
    @Expose
    @Column(name = "DOWNLOAD_AVAILABLE")
    private Boolean downloadAvailable;
    
    @Expose
    @ManyToOne(fetch=FetchType.EAGER, cascade={CascadeType.ALL})
    @JoinColumn(name = "DOWNLOAD_INQUIRY_ID")
    private Inquiry downloadDirective;

    
    @Expose
    @Transient
    private String stackTrace;
    
    public DaqueryResponse(){}
    
    public DaqueryResponse(boolean createUUID)
    {
    	responseId = UUID.randomUUID().toString();
    }
    
    public DaqueryResponse(String uuid)
    {
    	responseId = uuid;
    }
    
    public Long getId(){return(id);}
    public void setId(Long id){this.id = id;}
    
    public Date getReplyTimestamp(){return(replyTimestamp);}
    public void setReplyTimestamp(Date timestamp){replyTimestamp = timestamp;}
    
    public String getStatus(){return(status);}
    public void setStatus(String stat){status = stat;}
    
    public ResponseStatus getStatusEnum()
    {
    	if (status == null) {
    		return null;
    	}
    	return(ResponseStatus.valueOf(status));
    }
    public void setStatusEnum(ResponseStatus stat)
    {
    	if (stat == null) {
    		status = null;
    	}
    	else
    	{
    		status = stat.name();
    	}
    }
    
    public String getValue(){return(value);}
    public void setValue(String val){value = val;}
    
    public UserInfo getResponder(){return(responder);}
    public void setResponder(UserInfo respnder){responder = respnder;}
    
    public Fileset getFiles(){return(files);}
    public void setFiles(Fileset files){this.files = files;}
    
    public Site getSite(){return(site);}
    public void setSite(Site site){this.site = site; this.siteId = site.getSiteId();}
    
    public DaqueryRequest getRequest(){return(request);}
    public void setRequest(DaqueryRequest reqst){request = reqst;}
    
    public String getErrorMessage(){return(errorMessage);}
    public void setErrorMessage(String msg){errorMessage = msg;}
    
    public String getResponseId(){return(responseId);}
    public void setResponseId(String id){responseId = id;}
    
    public String getStackTrace(){return(stackTrace);}
    public void setStackTrace(String trace){stackTrace = trace;}
    
    public Inquiry getDownloadDirective(){return(downloadDirective);}
    public void setDownloadDirective(Inquiry directive){downloadDirective = directive;}
    
    public boolean isDownloadAvailable(){return(downloadAvailable);}
    public void setDownloadAvailable(boolean available){downloadAvailable = available;}
    
}

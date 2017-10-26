package edu.pitt.dbmi.daquery.domain.inquiry;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.google.gson.annotations.Expose;

import edu.pitt.dbmi.daquery.domain.DaqueryUser;

@Entity
@Table(name="INQUIRY")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "INQUIRY_TYPE", discriminatorType = DiscriminatorType.STRING)
public abstract class Inquiry implements Serializable
{
	private static final long serialVersionUID = 1272382834723l;
	
    @Expose
	private long id;
    
    /**
     * A network wide UUID used to track this inquiry
     * This id will be the same across multiple 
	 * queries with different versions, when combined with
	 * version will create a unique identifier.
     */
	@Expose
	private String inquiryId;
	
	@Expose
	private int version;
	
	private DaqueryUser requester;
		
	@Expose
	private String requesterId;
	
	@Expose
	protected String dataType;
	
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID", unique=true, nullable=false)	
	public long getId(){return(id);}
	public void setId(long id){this.id = id;}
	
	@Column(name = "INQUIRY_ID", unique = true, length=50)
	public String getInquiryId(){return(inquiryId);}
	public void setInquiryId(String id){inquiryId = id;}	
	
	@Transient
	public String getRequesterId(){return(requesterId);}
	public void setRequesterId(String id){requesterId = id;}
	
	public int getVersion(){return(version);}
	public void setVersion(int vers){version = vers;}
	
	@ManyToOne
	@JoinColumn(name="REQUESTER_ID")
	public DaqueryUser getRequester(){return(requester);}
	public void setRequester(DaqueryUser user)
	{
		this.requester = user;
		requesterId = user.getId();
	}
	

	@Column(name="INQUIRY_TYPE", insertable = false, updatable = false)
	public String getDataType(){return(dataType);}
	public void setDataType(String type){dataType = type;}
	
	@Transient
	public InquiryType getDataTypeEnum()
	{
		return(InquiryType.valueOf(dataType));
	}	
}

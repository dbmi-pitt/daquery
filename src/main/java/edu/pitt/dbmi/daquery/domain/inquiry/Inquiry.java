package edu.pitt.dbmi.daquery.domain.inquiry;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.google.gson.annotations.Expose;

import edu.pitt.dbmi.daquery.common.util.DaqueryException;
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
	
	@Expose
	protected String dataType;
	
	protected Set<InquiryRequest> requests;
	
	@Expose
	protected DaqueryUser author;
	
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID", unique=true, nullable=false)	
	public long getId(){return(id);}
	public void setId(long id){this.id = id;}
	
	@Column(name = "INQUIRY_ID", unique = true, length=50)
	public String getInquiryId(){return(inquiryId);}
	public void setInquiryId(String id){inquiryId = id;}	
	
	public int getVersion(){return(version);}
	public void setVersion(int vers){version = vers;}
	
	@Column(name="INQUIRY_TYPE", insertable = false, updatable = false)
	public String getDataType(){return(dataType);}
	public void setDataType(String type) throws DaqueryException
	{
		throw new DaqueryException("Inquiry.dataType is automatically set.");
	}
	
	@Transient
	public InquiryType getDataTypeEnum()
	{
		return(InquiryType.valueOf(dataType));
	}
	
	@OneToMany(fetch = FetchType.EAGER,cascade=CascadeType.ALL, mappedBy="inquiry")
	public Set<InquiryRequest> getRequests(){return(requests);}
	public void setRequests(Set<InquiryRequest> reqs){requests = reqs;}

	@ManyToOne
	@JoinColumn(name="AUTHOR_ID")
	public DaqueryUser getAuthor(){return(author);}
	public void setAuthor(DaqueryUser auth){author = auth;}
	
	
}

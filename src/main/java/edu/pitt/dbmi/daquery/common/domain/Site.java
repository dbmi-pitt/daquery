package edu.pitt.dbmi.daquery.common.domain;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;


/**
 * The persistent class for the SITES database table.
 * 
 */
@NamedQueries({
	@NamedQuery(name=Site.FIND_ALL, query="SELECT s FROM Site s"),
	@NamedQuery(name=Site.FIND_BY_ID, query="SELECT s FROM Site s WHERE s.id = :id"),
	@NamedQuery(name=Site.FIND_BY_UUID, query="SELECT s FROM Site s WHERE s.siteId = :uuid"),
	@NamedQuery(name=Site.FIND_BY_NAME, query="SELECT s FROM Site s WHERE s.name = :name"),
	@NamedQuery(name=Site.COUNT_ALL, query="SELECT count(s) FROM Site s")
})

@Entity
@Table(name="Site")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Site extends DaqueryObject implements Serializable {
	// ======================================
    // =             Constants              =
    // ======================================

    public static final String FIND_ALL = "Site.findAll";
    public static final String FIND_BY_ID = "Site.findId";
    public static final String FIND_BY_UUID = "Site.findUUId";
    public static final String COUNT_ALL = "Site.countAll";
    public static final String FIND_BY_NAME = "Site.findByName";

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID", unique=true, nullable=false)
	private long id;

	@Expose
//	@GeneratedValue(generator = "uuid")
//    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "SITE_ID", unique = true, length=50)
	private String siteId;

	@Expose
	@Column(name= "NAME", nullable=false, length=100)
	private String name;

	@Expose
	@Column(name= "URL", nullable=false, length=500)
	private String url;

	@Expose
	@Column(name= "ADMIN_EMAIL", nullable=false, length=500)
	private String adminEmail;

	@Column(name= "STATUS", nullable=false, length=500)
	private String status;
	
/*	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "REQUEST_SENT")
	private java.util.Date request_sent;
*/
	/**
	 * The access key used to make and receive calls to/from this site.
	 */
	@Column(name = "ACCESS_KEY")
	private String accessKey;
	
	/**
	 * The encryption key used to encrypt data sent to this site.
	 */
	@Column(name = "COMM_ENC_KEY")
	private String commEncKey;
	
	/**
	 * The type of encryption used to send data to this site.
	 */
	@Column(name = "ENC_TYPE")
	private String commEncType;
	
	public Site()
	{
		
	}
	
	public Site(boolean generateUUID) {
		if (generateUUID) {
			UUID newUUID = UUID.randomUUID();
			this.setSiteId(newUUID.toString());
		}
	}
	
	public Site(String siteId, String name, String url, String admin_email) {
		this.siteId = siteId;
		this.name = name;
		this.url = url;
		this.adminEmail = admin_email;
	}
	
	public Site (String accessKey,
			  String adminEmail,
			  String commEncKey,
			  EncryptionType commType,
			  String name,
			  String siteId,
			  SiteStatus status,
			  String url)
	{
		this.setAccessKey(accessKey);
		this.setAdmin_email(adminEmail);
		this.setComEncKey(commEncKey);
		this.setCommTypeValue(commType);
		this.setName(name);
		this.setSiteId(siteId);
		this.setStatusValue(status);
		this.setUrl(url);
	}	
	
	//TODO: I need some more constructors
	//take name, URL, adminEmail, status as parameters 
	//make an option one that take a UUID
	public Site(String newName) {
		this.name = newName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSiteId() {
		return siteId;
	}

	public void setSiteId(String id) {
		this.siteId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getAdmin_email() {
		return adminEmail;
	}

	public void setAdmin_email(String admin_email) {
		this.adminEmail = admin_email;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Transient
	public SiteStatus getStatusValue() {
		return SiteStatus.valueOf(status);
	}

	public void setStatusValue(SiteStatus statusValue) {
		status = statusValue.name();
	}

	/**
	 * The access key used to make and receive calls to/from this site.
	 */
	public String getAccessKey(){return(accessKey);}
	public void setAccessKey(String key){accessKey = key;}

	/**
	 * The encryption key used to encrypt data sent to this site.
	 */
	public String getCommEncKey(){return(commEncKey);}
	public void setComEncKey(String key){commEncKey = key;}
	
	/**
	 * The type of encryption used to send data to this site.
	 */
	public String getCommEncType(){return(commEncType);}
	public void setCommEncType(String type){this.commEncType = type;}	
	@Transient
	public EncryptionType getCommTypeValue(){return(EncryptionType.valueOf(commEncType));}
	public void setCommTypeValue(EncryptionType et){commEncType = et.toString();}
	
	// ======================================
    // =   Methods hash, equals, toString   =
    // ======================================

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Site site = (Site) o;
        return Objects.equals(id, site.id);
    }

    @Override
    public String toString() {
        return "Site {" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
    

}
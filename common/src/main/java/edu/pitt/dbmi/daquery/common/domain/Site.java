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
	@NamedQuery(name=Site.FIND_BY_NAME_NC, query="SELECT s FROM Site s WHERE upper(s.name) = :name"),
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
    public static final String FIND_BY_NAME_NC = "Site.findByNameNc";

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
	
/*	@Expose
	@Column(name= "STATUS", nullable=false, length=500)
	private String status; */
	
	@Column(name="TEMPKEY")
	private boolean tempKey;
	
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
	
	/**
	 * The string representing the site within the keystore file.
	 * For example "130.1.2.3" or "server.institution.edu"
	 */
	@Column(name = "KEYSTORE_ALIAS")
	private String keystoreAlias;
	
	/**
	 * The filepath to the keystore file.
	 * For example /opt/apache-tomcat-6.0.53/shrine.keystore
	 */
	@Column(name = "KEYSTORE_PATH")
	private String keystorePath;
	
	public Site()
	{
		
	}
	
	public Site(boolean generateUUID) {
		if (generateUUID) {
			UUID newUUID = UUID.randomUUID();
			this.setSiteId(newUUID.toString());
		}
	}
	
	public Site(String siteId, String name, String url, String email) {
		this.siteId = siteId;
		this.name = name;
		this.url = url;
		this.adminEmail = email;
	}
	
	public Site (String accessKey,
			  String adminEmail,
			  String commEncKey,
			  EncryptionType commType,
			  String name,
			  String siteId,
//			  SiteStatus status,
			  String url)
	{
		this.setAccessKey(accessKey);
		this.setAdminEmail(adminEmail);
		this.setComEncKey(commEncKey);
		this.setCommTypeValue(commType);
		this.setName(name);
		this.setSiteId(siteId);
//		this.setStatusValue(status);
		this.setUrl(url);
	}	
	
	public Site(String uuid) {
		this.siteId = uuid;
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

	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String email) {
		this.adminEmail = email;
	}

/*	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Transient
	public SiteStatus getStatusValue() {
		if (status == null) {
			return null;
		}
		return SiteStatus.valueOf(status);
	}

	public void setStatusValue(SiteStatus statusValue) {
		if (statusValue == null) {
			status = null;
		} else {
			status = statusValue.name();
		}
	}*/

	/**
	 * The access key used to make and receive calls to/from this site.
	 */
	public String getAccessKey(){return(accessKey);}
	public void setAccessKey(String key){accessKey = key;}

	//TODO: CDB- I think this needs to be wrapped by Boolean class instead of using the boolean
	//The boolean throws the following error if the column is NULL:
	//org.hibernate.PropertyAccessException: Null value was assigned to a property of primitive type setter of edu.pitt.dbmi.daquery.common.domain.Site.tempKey

	public boolean isTempKey(){return(tempKey);}
	public void setTempKey(boolean temp){tempKey = temp;}
	
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
	public EncryptionType getCommTypeValue()
	{
		if (commEncType == null) {
			return null;
		}
		return(EncryptionType.valueOf(commEncType));
	}
	public void setCommTypeValue(EncryptionType et)
	{
		if (et == null) {
			commEncType = null;
		}
		else
		{
			commEncType = et.toString();
		}
	}
	
	public String getKeystoreAlias() {
		return keystoreAlias;
	}

	public void setKeystoreAlias(String keystoreAlias) {
		this.keystoreAlias = keystoreAlias;
	}

	public String getKeystorePath() {
		return keystorePath;
	}

	public void setKeystorePath(String keystorePath) {
		this.keystorePath = keystorePath;
	}

	
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
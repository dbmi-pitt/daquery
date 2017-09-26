package edu.pitt.dbmi.daquery.domain;

import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

import com.google.gson.annotations.Expose;

import edu.pitt.dbmi.daquery.common.util.PasswordUtils;
import edu.pitt.dbmi.daquery.util.UserStatus;


/**
 * @author Antonio Goncalves
 *         http://www.antoniogoncalves.org
 *         --
 */


@NamedQueries({
        @NamedQuery(name = Site_User.FIND_ALL, query = "SELECT u FROM Site_User u ORDER BY u.realName DESC"),
        @NamedQuery(name = Site_User.FIND_BY_LOGIN_PASSWORD, query = "SELECT u FROM Site_User u WHERE u.username = :login AND u.password = :password"),
        @NamedQuery(name = Site_User.FIND_BY_ID_PASSWORD, query = "SELECT u FROM Site_User u WHERE u.id = :id AND u.password = :password"),
        @NamedQuery(name = Site_User.FIND_BY_EMAIL_PASSWORD, query = "SELECT u FROM Site_User u WHERE u.email = :email AND u.password = :password"),
        @NamedQuery(name = Site_User.FIND_BY_ID, query = "SELECT u FROM Site_User u WHERE u.id = :id"),
        @NamedQuery(name = Site_User.COUNT_ALL, query = "SELECT COUNT(u) FROM Site_User u")
})


@Entity
@Table(name = "Site_User")
public class Site_User extends DaqueryObject {

    // ======================================
    // =             Constants              =
    // ======================================

    public static final String FIND_ALL = "Site_User.findAll";
    public static final String COUNT_ALL = "Site_User.countAll";
    public static final String FIND_BY_LOGIN_PASSWORD = "Site_User.findByLoginAndPassword";
    public static final String FIND_BY_ID_PASSWORD = "Site_User.findByIDAndPassword";
    public static final String FIND_BY_EMAIL_PASSWORD = "Site_User.findByEmailAndPassword";
    public static final String FIND_BY_ID = "Site_User.findByID";

    // assumes the current class is called MyLogger
    private final static Logger logger = Logger.getLogger(Site_User.class.getName());
    
    // ======================================
    // =             Attributes             =
    // ======================================

    @Expose
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "ID", unique = true, length=50)
    private String id;
    
    @Expose
	@Column(name="REAL_NAME", length=100)
	private String realName;
    
    @Expose
    @Column(name="USERNAME", unique = true, length = 500, nullable = false)
    private String username;
    
    @Column(name="PASSWORD", length = 500, nullable = false)
    private String password;
    
    @Transient
    private String newPassword;
    
    @Transient
    private String oldPassword;
    
    @Expose
    @Column(name="STATUS")
    private Integer status;

    @Expose
    @Column(name="EMAIL", length = 500, nullable = true)
    private String email;
    
	//bi-directional many-to-one association to InboundQuery
    @Transient
	@OneToMany(mappedBy="user")
	private List<Inbound_Query> inboundQueries;

	//bi-directional many-to-one association to OutboundQuery
    @Transient
	@OneToMany(mappedBy="user")
	private List<OutboundQuery> outboundQueries;


    //TODO: determine if this should be transient or if
    //we want Site_User to manage its user role updates (we could manage it separately)
	//bi-directional many-to-many association to Role
    @Expose
	@ManyToMany(cascade = { 
	        CascadeType.PERSIST, 
	        CascadeType.MERGE
	})
	@JoinTable(
		name="USERS_ROLES"
		, joinColumns={
			@JoinColumn(name="USER_ID", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="ROLE_ID", nullable=false)
			}
		)
	private List<Role> roles;

    
    // ======================================
    // =            Constructors            =
    // ======================================

    public Site_User() {
    }

    public Site_User(String id, String realName, String login, String password) {
        this.id = id;
        this.realName = realName;
        this.username = login;
        this.setPassword(password);
    }

    public Site_User(String id, String login, String password) {
        this.id = id;
        this.username = login;
        this.setPassword(password);
    }

    public Site_User(String login, String password) {
        this.username = login;
        this.setPassword(password);
    }
    

    // ======================================
    // =          Getters & Setters         =
    // ======================================

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String login) {
        this.username = login;
    }
    
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }
    
    public String getOldPassword() {
        return this.oldPassword;
    }
    
    public void setOldPassword(String newPassword) {
        this.oldPassword = newPassword;
    }

    public String getNewPassword() {
        return this.newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
    
    public void setPassword(String plaintextPassword) {
        this.password = PasswordUtils.digestPassword(plaintextPassword);
    }
    
    public boolean isPasswordSet() {
    	if (password == null)
    		return false;
    	return password.length() > 0;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public int getStatus() {
    	if (this.status == null) {
    		return -1;
    	}
        return this.status;
    }
    
    @Transient
    public UserStatus getStatusEnum()
    {
    	return UserStatus.fromInt(status);
    }
    public void setStatusEnum(UserStatus stat)
    {
    	setStatus(status);
    }

    
	public List<Inbound_Query> getInboundQueries() {
		return this.inboundQueries;
	}

	public void setInboundQueries(List<Inbound_Query> inboundQueries) {
		this.inboundQueries = inboundQueries;
	}

	public Inbound_Query addInboundQuery(Inbound_Query inboundQuery) {
		getInboundQueries().add(inboundQuery);
		inboundQuery.setUser(this);

		return inboundQuery;
	}

	public Inbound_Query removeInboundQuery(Inbound_Query inboundQuery) {
		getInboundQueries().remove(inboundQuery);
		inboundQuery.setUser(null);

		return inboundQuery;
	}

	public List<OutboundQuery> getOutboundQueries() {
		return this.outboundQueries;
	}

	public void setOutboundQueries(List<OutboundQuery> outboundQueries) {
		this.outboundQueries = outboundQueries;
	}

	public OutboundQuery addOutboundQuery(OutboundQuery outboundQuery) {
		getOutboundQueries().add(outboundQuery);
		outboundQuery.setUser(this);

		return outboundQuery;
	}

	public OutboundQuery removeOutboundQuery(OutboundQuery outboundQuery) {
		getOutboundQueries().remove(outboundQuery);
		outboundQuery.setUser(null);

		return outboundQuery;
	}

	
	public List<Role> getRoles() {
		return this.roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

    
    // ======================================
    // =   Methods hash, equals, toString   =
    // ======================================

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Site_User user = (Site_User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    //TODO: Add loop to print out the roles, queries, etc.
    @Override
    public String toString() {
    	String passwordSet = "blank password";
        if (this.isPasswordSet()) {
        	passwordSet = "password is set"; 
        }
        return "User{" +
                "id='" + id + '\'' +
                ", realName='" + realName + '\'' +
                 ", login='" + username + '\'' +
                ", password='" + passwordSet + '\'' +
                '}';
    }
    
}

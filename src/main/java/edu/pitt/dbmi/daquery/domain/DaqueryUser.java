package edu.pitt.dbmi.daquery.domain;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

import edu.pitt.dbmi.daquery.common.domain.DaqueryObject;
import edu.pitt.dbmi.daquery.common.domain.UserStatus;

import com.google.gson.annotations.Expose;

import edu.pitt.dbmi.daquery.common.util.PasswordUtils;

@NamedQueries({
        @NamedQuery(name = DaqueryUser.FIND_ALL, query = "SELECT u FROM DaqueryUser u ORDER BY u.realName DESC"),
        @NamedQuery(name = DaqueryUser.FIND_BY_LOGIN_PASSWORD, query = "SELECT u FROM DaqueryUser u WHERE u.username = :login AND u.password = :password"),
        @NamedQuery(name = DaqueryUser.FIND_BY_ID_PASSWORD, query = "SELECT u FROM DaqueryUser u WHERE u.id = :id AND u.password = :password"),
        @NamedQuery(name = DaqueryUser.FIND_BY_EMAIL_PASSWORD, query = "SELECT u FROM DaqueryUser u WHERE u.email = :email AND u.password = :password"),
        @NamedQuery(name = DaqueryUser.FIND_BY_ID, query = "SELECT u FROM DaqueryUser u WHERE u.id = :id"),
        @NamedQuery(name = DaqueryUser.FIND_ADMIN, query = "SELECT u FROM DaqueryUser u WHERE u.username = 'admin'"),
        @NamedQuery(name = DaqueryUser.COUNT_ALL, query = "SELECT COUNT(u) FROM DaqueryUser u")
})


@Entity
@Table(name = "DQ_USER")
public class DaqueryUser extends DaqueryObject {

	private static final long serialVersionUID = 29290820752342l;
	
    // ======================================
    // =             Constants              =
    // ======================================

    public static final String FIND_ALL = "DaqueryUser.findAll";
    public static final String COUNT_ALL = "DaqueryUser.countAll";
    public static final String FIND_BY_LOGIN_PASSWORD = "DaqueryUser.findByLoginAndPassword";
    public static final String FIND_BY_ID_PASSWORD = "DaqueryUser.findByIDAndPassword";
    public static final String FIND_BY_EMAIL_PASSWORD = "DaqueryUser.findByEmailAndPassword";
    public static final String FIND_BY_ID = "DaqueryUser.findByID";
    public static final String FIND_ADMIN = "DaqueryUser.findAdmin";

    
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
    private String status;

    @Expose
    @Column(name="EMAIL", length = 500, nullable = true)
    private String email;
    
    //TODO: determine if this should be transient or if
    //we want DaqueryUser to manage its user role updates (we could manage it separately)
	//bi-directional many-to-many association to Role
    @Expose
	@ManyToMany(fetch = FetchType.EAGER,
			cascade = { 			
	        CascadeType.PERSIST, 
	        CascadeType.MERGE
	})
	@JoinTable(
		name="USER_ROLE"
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

    public DaqueryUser() {
    }

    public DaqueryUser(String realName, String login, String password) {
        this.realName = realName;
        this.username = login;
        this.setPassword(password);
    }

    public DaqueryUser(String login, String password) {
        this.username = login;
        this.setPassword(password);
    }
    

    // ======================================
    // =          Getters & Setters         =
    // ======================================

    public String getId() {
    	if(id == null) return(null);
        return id.trim();
    }

    public void setId(String id) {
    	if(id == null) this.id = null;
        this.id = id.trim();
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

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
    
    @Transient
    public UserStatus getStatusEnum()
    {
    	return UserStatus.valueOf(status);
    }
    public void setStatusEnum(UserStatus stat)
    {
    	setStatus(stat.toString());
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
        DaqueryUser user = (DaqueryUser) o;
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

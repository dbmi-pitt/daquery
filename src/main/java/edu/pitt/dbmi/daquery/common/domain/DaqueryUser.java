package edu.pitt.dbmi.daquery.common.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Transient;

import com.google.gson.annotations.Expose;

import edu.pitt.dbmi.daquery.common.util.PasswordUtils;

@NamedQueries({
        @NamedQuery(name = DaqueryUser.FIND_ALL, query = "SELECT u FROM DaqueryUser u ORDER BY u.realName DESC"),
        @NamedQuery(name = DaqueryUser.FIND_BY_LOGIN_PASSWORD, query = "SELECT u FROM DaqueryUser u WHERE u.username = :login AND u.password = :password"),
        @NamedQuery(name = DaqueryUser.FIND_BY_ID_PASSWORD, query = "SELECT u FROM DaqueryUser u WHERE u.id = :id AND u.password = :password"),
        @NamedQuery(name = DaqueryUser.FIND_BY_EMAIL_PASSWORD, query = "SELECT u FROM DaqueryUser u WHERE u.email = :email AND u.password = :password"),
        @NamedQuery(name = DaqueryUser.FIND_BY_ID, query = "SELECT u FROM DaqueryUser u WHERE u.id = :id"),
        @NamedQuery(name = DaqueryUser.FIND_BY_USERNAME, query = "SELECT u FROM DaqueryUser u WHERE u.username = :username"),
        @NamedQuery(name = DaqueryUser.FIND_ADMIN, query = "SELECT u FROM DaqueryUser u WHERE lower(trim(u.username)) = 'admin' and upper(trim(u.utype)) = '" + UserInfo.FULL_USER + "'"),
        @NamedQuery(name = DaqueryUser.COUNT_ALL, query = "SELECT COUNT(u) FROM DaqueryUser u")
})


@Entity
@DiscriminatorValue(UserInfo.FULL_USER)  
public class DaqueryUser extends UserInfo {

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
    public static final String FIND_BY_USERNAME = "DaqueryUser.findByUsername";
    public static final String FIND_ADMIN = "DaqueryUser.findAdmin";

    
    // ======================================
    // =             Attributes             =
    // ======================================
    
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
    
	//bi-directional many-to-many association to Role
    @Expose
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name="USER_ROLE",
	           joinColumns={@JoinColumn(name="USER_ID", nullable=false)},
	           inverseJoinColumns={@JoinColumn(name="ROLE_ID", nullable=false)}
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

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String login) {
        this.username = login;
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
	
	public UserInfo myInfo()
	{
		UserInfo rUser = new UserInfo();
		rUser.setEmail(getEmail());
		rUser.setId(getId());
		rUser.setRealName(getRealName());
		rUser.setUtype(INFO_ONLY);
		return(rUser);
	}
	
    //TODO: Add loop to print out the roles, queries, etc.
    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", realName='" + realName + '\'' +
                 ", login='" + username + '\'' +
                '}';
    }
    
}

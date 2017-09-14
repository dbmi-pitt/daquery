package edu.pitt.dbmi.daquery.domain;

import java.util.Objects;
import java.util.logging.Logger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

import edu.pitt.dbmi.daquery.util.UserStatus;


/**
 * @author Antonio Goncalves
 *         http://www.antoniogoncalves.org
 *         --
 */


@NamedQueries({
        @NamedQuery(name = Site_User.FIND_ALL, query = "SELECT u FROM Site_User u ORDER BY u.lastName DESC"),
        @NamedQuery(name = Site_User.FIND_BY_LOGIN_PASSWORD, query = "SELECT u FROM Site_User u WHERE u.username = :login AND u.password = :password"),
        @NamedQuery(name = Site_User.FIND_BY_UUID_PASSWORD, query = "SELECT u FROM Site_User u WHERE u.uuid = :uuid AND u.password = :password"),
        @NamedQuery(name = Site_User.FIND_BY_UUID, query = "SELECT u FROM Site_User u WHERE u.uuid = :uuid"),
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
    public static final String FIND_BY_UUID_PASSWORD = "Site_User.findByUUIDAndPassword";
    public static final String FIND_BY_UUID = "Site_User.findByUUID";

    // assumes the current class is called MyLogger
    private final static Logger logger = Logger.getLogger(Site_User.class.getName());
    
    // ======================================
    // =             Attributes             =
    // ======================================

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "UUID", unique = true, length=50)
    private String uuid;
    @Column(name="LASTNAME", length = 500)
    private String lastName;
    @Column(name="FIRSTNAME", length = 500)
    private String firstName;
    @Column(name="USERNAME", unique = true, length = 500, nullable = false)
    private String username;
    @Column(name="PASSWORD", length = 500, nullable = false)
    private String password;
    @Column(name="STATUS")
    private int status;

    // ======================================
    // =            Constructors            =
    // ======================================

    public Site_User() {
    }

    public Site_User(String id, String lastName, String firstName, String login, String password) {
        this.uuid = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.username = login;
        this.setPassword(password);
    }

    public Site_User(String id, String login, String password) {
        this.uuid = id;
        this.lastName = "";
        this.firstName = "";
        this.username = login;
        this.setPassword(password);
    }

    public Site_User(String login, String password) {
        this.lastName = "";
        this.firstName = "";
        this.username = login;
        this.setPassword(password);
    }
    

    // ======================================
    // =          Getters & Setters         =
    // ======================================

    public String getId() {
        return uuid;
    }

    public void setId(String id) {
        this.uuid = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String login) {
        this.username = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String plaintextPassword) {
        this.password = PasswordUtils.digestPassword(plaintextPassword);
    }
    
    public boolean isPasswordSet() {
    	if (password == null)
    		return false;
    	return password.length() > 0;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
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
    
    // ======================================
    // =   Methods hash, equals, toString   =
    // ======================================

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Site_User user = (Site_User) o;
        return Objects.equals(uuid, user.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid);
    }

    @Override
    public String toString() {
    	String passwordSet = "blank password";
        if (this.isPasswordSet()) {
        	passwordSet = "password is set"; 
        }
        return "User{" +
                "id='" + uuid + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", login='" + username + '\'' +
                ", password='" + passwordSet + '\'' +
                '}';
    }
    
    /**
     * The toJson method in DaqueryObject needs to be overriden
     * The user's encrypted password needs to be removed from the Json string
     */
    @Override
	public String toJson() {
    	//we gotta hide the password
    	//1-2-3-4-5? That's the stupidest combination I've ever heard of in my life! That's the kinda thing an idiot would have on his luggage!
    	String initialJson = super.toJson();    	
    	String pattern = ",\"password\"\\:\".*\"";    	    	
    	String json = initialJson.replaceAll(pattern, "");
    	return json;

    }
}

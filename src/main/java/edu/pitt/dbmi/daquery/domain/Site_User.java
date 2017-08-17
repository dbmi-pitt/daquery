package edu.pitt.dbmi.daquery.domain;

import edu.pitt.dbmi.daquery.util.PasswordUtils;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import java.util.Objects;
import java.util.logging.Logger;

/**
 * @author Antonio Goncalves
 *         http://www.antoniogoncalves.org
 *         --
 */


@NamedQueries({
        @NamedQuery(name = Site_User.FIND_ALL, query = "SELECT u FROM Site_User u ORDER BY u.lastName DESC"),
        @NamedQuery(name = Site_User.FIND_BY_LOGIN_PASSWORD, query = "SELECT u FROM Site_User u WHERE u.login = :login AND u.password = :password"),
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

    // assumes the current class is called MyLogger
    private final static Logger logger = Logger.getLogger(Site_User.class.getName());
    
    // ======================================
    // =             Attributes             =
    // ======================================

    @Id
    @SequenceGenerator(name = "SEQ_GEN", sequenceName = "SEQ_DAQUERY", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_GEN")
    @Column(name="ID", unique = true, nullable = false)
    private long id;
    @Column(name="LASTNAME", length = 500)
    private String lastName;
    @Column(name="FIRSTNAME", length = 500)
    private String firstName;
    @Column(name="LOGIN", unique = true, length = 500, nullable = false)
    private String login;
    @Column(name="PASSWORD", length = 500, nullable = false)
    private String password;

    // ======================================
    // =            Constructors            =
    // ======================================

    public Site_User() {
    }

    public Site_User(int id, String lastName, String firstName, String login, String password) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.login = login;
        this.setPassword(password);
    }

    public Site_User(int id, String login, String password) {
        this.id = id;
        this.lastName = "";
        this.firstName = "";
        this.login = login;
        this.setPassword(password);
    }

    public Site_User(String login, String password) {
        this.lastName = "";
        this.firstName = "";
        this.login = login;
        this.setPassword(password);
    }
    

    // ======================================
    // =          Getters & Setters         =
    // ======================================

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

    @Override
    public String toString() {
    	String passwordSet = "blank password";
        if (this.isPasswordSet()) {
        	passwordSet = "password is set"; 
        }
        return "User{" +
                "id='" + id + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", login='" + login + '\'' +
                ", password='" + passwordSet + '\'' +
                '}';
    }
}

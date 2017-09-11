package edu.pitt.dbmi.daquery.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the USERS database table.
 * 
 */

@Entity
@Table(name="USERS")
@NamedQueries({
    @NamedQuery(name = User.FIND_ALL, query = "SELECT u FROM User u ORDER BY u.realName DESC"),
    @NamedQuery(name = User.FIND_BY_EMAIL_PASSWORD, query = "SELECT u FROM User u WHERE u.email = :email AND u.passwordDigest = :passwordDigest"),
    @NamedQuery(name = User.FIND_BY_ID_PASSWORD, query = "SELECT u FROM User u WHERE u.id = :uuid AND u.passwordDigest = :passwordDigest"),
    @NamedQuery(name = User.FIND_BY_ID, query = "SELECT u FROM User u WHERE u.id = :id"),
    @NamedQuery(name = User.COUNT_ALL, query = "SELECT COUNT(u) FROM User u")
})

public class User extends DaqueryObject implements Serializable {
	// ======================================
    // =             Constants              =
    // ======================================

    public static final String FIND_ALL = "User.findAll";
    public static final String COUNT_ALL = "User.countAll";
    public static final String FIND_BY_EMAIL_PASSWORD = "User.findByEmailAndPassword";
    public static final String FIND_BY_ID_PASSWORD = "User.findByIDAndPassword";
    public static final String FIND_BY_ID = "User.findByID";
    
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false, length=16)
	private String id;

	@Column(length=100)
	private String email;

	@Column(name="PASSWORD_DIGEST", length=100)
	private String passwordDigest;

	@Column(name="REAL_NAME", length=100)
	private String realName;

	@Column(length=10)
	private String status;

	//bi-directional many-to-one association to InboundQuery
	@OneToMany(mappedBy="user")
	private List<InboundQuery> inboundQueries;

	//bi-directional many-to-one association to OutboundQuery
	@OneToMany(mappedBy="user")
	private List<OutboundQuery> outboundQueries;

	//bi-directional many-to-many association to Role
	@ManyToMany
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

	public User() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasswordDigest() {
		return this.passwordDigest;
	}

	public void setPasswordDigest(String passwordDigest) {
		this.passwordDigest = passwordDigest;
	}

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<InboundQuery> getInboundQueries() {
		return this.inboundQueries;
	}

	public void setInboundQueries(List<InboundQuery> inboundQueries) {
		this.inboundQueries = inboundQueries;
	}

	public InboundQuery addInboundQuery(InboundQuery inboundQuery) {
		getInboundQueries().add(inboundQuery);
		inboundQuery.setUser(this);

		return inboundQuery;
	}

	public InboundQuery removeInboundQuery(InboundQuery inboundQuery) {
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

}
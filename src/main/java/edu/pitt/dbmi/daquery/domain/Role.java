package edu.pitt.dbmi.daquery.domain;

import java.io.Serializable;
import javax.persistence.*;

import com.google.gson.annotations.Expose;

import edu.pitt.dbmi.daquery.common.domain.DaqueryObject;

import java.util.List;
import java.util.Objects;


/**
 * The persistent class for the ROLES database table.
 * 
 */
@Entity
@Table(name="Role")
@NamedQueries({
@NamedQuery(name=Role.FIND_ALL, query="SELECT r FROM Role r"),
@NamedQuery(name=Role.FIND_BY_NAME, query="SELECT r FROM Role r WHERE name = :name"),
})
public class Role extends DaqueryObject implements Serializable {

	private static final long serialVersionUID = 979278294724242L;
	
	public static final String AGGREGATE_QUERIER = "AGGREGATE_AUERIER";
	public static final String DATA_QUERIER = "DATA_QUERIER";
	public static final String ADMIN = "ADMIN";
	public static final String STEWARD = "STEWARD";
	public static final String VIEWER = "VIEWER";

	public static final String FIND_ALL = "Role.findAll";
	public static final String FIND_BY_NAME = "Role.findByName";


	@Expose
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ROLE_ID", unique=true, nullable=false)
	private long id;

	@Expose
	@Column(nullable=false, length=50)
	private String name;

	//bi-directional many-to-many association to User
	@ManyToMany(mappedBy="roles")
	private List<DaqueryUser> users;

	public Role() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<DaqueryUser> getUsers() {
		return this.users;
	}

	public void setUsers(List<DaqueryUser> users) {
		this.users = users;
	}
}
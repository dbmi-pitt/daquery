package edu.pitt.dbmi.daquery.common.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.google.gson.annotations.Expose;


/**
 * The persistent class for the ROLES database table.
 * 
 */
@Entity
@Table(name="Role")
@NamedQueries({
@NamedQuery(name=Role.FIND_ALL, query="SELECT r FROM Role r"),
@NamedQuery(name=Role.FIND_BY_NAME, query="SELECT r FROM Role r WHERE trim(upper(name)) = :name"),
})
public class Role extends DaqueryObject implements Serializable {

	private static final long serialVersionUID = 979278294724242L;
	
	public static final String AGGREGATE_QUERIER = "AGGREGATE_QUERIER";
	public static final String DATA_QUERIER = "DATA_QUERIER";
	public static final String ADMIN = "ADMIN";
	public static final String STEWARD = "STEWARD";
	public static final String VIEWER = "VIEWER";

	public static final String FIND_ALL = "Role.findAll";
	public static final String FIND_BY_NAME = "Role.findByName";


	@Expose
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private long id;

	@Expose
	@Column(nullable=false, length=50)
	private String name;

	//bi-directional many-to-many association to User
	@ManyToMany(mappedBy="roles", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<DaqueryUser> users;

	public Role() {}

	public long getId(){return this.id;}
	public void setId(long id){this.id = id;}

	public String getName(){return this.name;}
	public void setName(String name) {this.name = name;}

	public List<DaqueryUser> getUsers(){return this.users;}
	public void setUsers(List<DaqueryUser> users){this.users = users;}
}
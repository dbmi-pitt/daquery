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
@NamedQuery(name="Role.findAll", query="SELECT r FROM Role r")
public class Role extends DaqueryObject implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Expose
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
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

	
    // ======================================
    // =   Methods hash, equals, toString   =
    // ======================================

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return Objects.equals(id, role.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    
    @Override
    public String toString() {
    	return this.name;
    }
	
}
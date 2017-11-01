package edu.pitt.dbmi.daquery.domain;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.google.gson.annotations.Expose;

import edu.pitt.dbmi.daquery.common.domain.DaqueryObject;
import edu.pitt.dbmi.daquery.domain.inquiry.InquiryType;
import edu.pitt.dbmi.daquery.domain.inquiry.SQLQuery;


/**
 * The persistent class for the ROLES database table.
 * 
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,include = JsonTypeInfo.As.PROPERTY, property = "dtype")
@JsonSubTypes({@Type(value = SQLDataSource.class, name = SourceType.TYPES.SQL_VAL),
	           @Type(value = SASDataSource.class, name = SourceType.TYPES.SAS_VAL)})
@Entity
@Table(name="DATA_SOURCE")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "dtype", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value = SourceType.TYPES.BASE_VAL)
public abstract class DataSource extends DaqueryObject implements Serializable {
	private static final long serialVersionUID = 12342392828383l;
	
	@Expose
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false, name="ds_id")
	private long id;

	@Expose
	@Column(nullable=false, length=50)
	protected String name;

	@Expose
	@Column(name="DTYPE", insertable = false, updatable = false)
	protected String dtype;
	
	//bi-directional many-to-many association to User
	@ManyToMany(mappedBy="dataSources")
	protected Set<Network> networks;

	
	public DataSource() {
		
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
	
	public Set<Network> getNetworks(){
		return this.networks;
	}
	
	public void setNetworks(Set<Network> networks) {
		this.networks = networks;
	}


	
    // ======================================
    // =   Methods hash, equals, toString   =
    // ======================================

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataSource ds = (DataSource) o;
        return Objects.equals(id, ds.id);
    }
}

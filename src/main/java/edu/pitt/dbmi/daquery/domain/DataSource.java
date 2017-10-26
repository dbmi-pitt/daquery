package edu.pitt.dbmi.daquery.domain;

import java.io.Serializable;
import javax.persistence.*;

import com.google.gson.annotations.Expose;

import edu.pitt.dbmi.daquery.common.domain.DaqueryObject;

import java.util.Objects;


/**
 * The persistent class for the ROLES database table.
 * 
 */
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

package edu.pitt.dbmi.daquery.common.domain.inquiry;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.google.gson.annotations.Expose;

import edu.pitt.dbmi.daquery.common.domain.DaqueryObject;

@Entity
@Table(name="FILESET")
public class Fileset extends DaqueryObject
{
	private static final long serialVersionUID = 393873934l;
	
    @Expose
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID", unique=true, nullable=false)
	private long id;
    
    @Expose
	@ElementCollection
	@CollectionTable(name="filepath", joinColumns=@JoinColumn(name="fileset_id"))
	@Column(name="path")
	@OrderColumn
	private Set<String> filepaths;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Set<String> getFilepaths() {
		return filepaths;
	}

	public void setFilepaths(Set<String> filepaths) {
		this.filepaths = filepaths;
	}
	
	@Transient
	public void addFile(File file)
	{
		if(filepaths == null) filepaths = new HashSet<String>();
		filepaths.add(file.getAbsolutePath());
	}
}

package edu.pitt.dbmi.daquery.domain.inquiry;

import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

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
    	
	@ElementCollection
	@CollectionTable(name="filepath", joinColumns=@JoinColumn(name="fileset_id"))
	@Column(name="path")
	private Set<String> filepaths;
}

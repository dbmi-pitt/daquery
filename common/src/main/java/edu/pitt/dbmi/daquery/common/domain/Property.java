package edu.pitt.dbmi.daquery.common.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.gson.annotations.Expose;

@Entity
@Table(name="PROPERTY")
public class Property {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID", unique=true, nullable=false)
	private long id;
	
	@Expose
	@Column(name = "NAME")
	private String name;
	
	@Expose
	@Column(name = "VALUE")
	private String value;
}

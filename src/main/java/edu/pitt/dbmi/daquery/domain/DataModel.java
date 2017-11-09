package edu.pitt.dbmi.daquery.domain;

import java.util.Set;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.google.gson.annotations.Expose;

@Entity
@Table(name="DATA_MODEL")
public class DataModel
{	
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID", unique=true, nullable=false)
	private long id;
    
	@Expose
	private String name;	
	
	@Expose
	@Column(name = "DATA_MODEL_ID")
	private String dataModelId;

	@Expose
	private String description;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy="dataModel")
	private Set<DataSource> dataSources;	

	@Expose
	@OneToMany(fetch = FetchType.EAGER, cascade={CascadeType.ALL}, mappedBy="dataModel")
	private Set<DataAttribute> attributes;	
	
	public DataModel(){}
	
	public DataModel(boolean createUUID)
	{
		if (createUUID)
			setDataModelId(UUID.randomUUID().toString());
	}
	
	public DataModel(String uuid)
	{
		setDataModelId(uuid);
	}
	
	public long getId(){return(id);}
	public void setId(Long id){this.id = id;}
	
	public String getName(){return(name);}
	public void setName(String name){this.name = name;}
	
	public String getDescription(){return(description);}
	public void setDescription(String desc){this.description = desc;}	
	
	public String getDataModelId(){return(dataModelId);}
	public void setDataModelId(String id){dataModelId = id;}
	
	public Set<DataSource> getDataSources(){return(dataSources);}
	public void setDataSources(Set<DataSource> sources){dataSources = sources;}
	
	public Set<DataAttribute> getAttributes(){return(attributes);}
	public void setAttributes(Set<DataAttribute> attribs){attributes = attribs;}

	@Transient
	public DataSource getDataSource(SourceType type)
	{
		for(DataSource ds: dataSources)
		{
			if(ds.getSourceTypeEnum() == type)
			{
				return(ds);
			}
		}
		return(null);
	}
}

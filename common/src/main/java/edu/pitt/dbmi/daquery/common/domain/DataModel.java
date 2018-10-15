package edu.pitt.dbmi.daquery.common.domain;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Serializable;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.google.gson.annotations.Expose;

import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.common.util.DataExportConfig;
import edu.pitt.dbmi.daquery.common.util.StringHelper;
import edu.pitt.dbmi.daquery.sql.domain.TableColumn;

@Entity
@Table(name="DATA_MODEL")
public class DataModel extends DaqueryObject implements Serializable
{
	private static final long serialVersionUID = 29292842342523123l;

	private static final DataAttribute emptyAttribute = new DataAttribute();
	private static final List<DataAttribute> emptyAttributeList = new ArrayList<DataAttribute>();
	
	private static Hashtable<String, Hashtable<String, DataAttribute>> attributeInfoByModelId = new Hashtable<String, Hashtable<String, DataAttribute>>();
	private static Hashtable<String, Hashtable<String, List<DataAttribute>>> attributeByTableByModelId = new Hashtable<String, Hashtable<String, List<DataAttribute>>>();
	
	@Transient
	private Hashtable<String, DataAttribute> attributesByAttributeName = null;
	@Transient
	private Hashtable<String, List<DataAttribute>> attributesByTableName = null;

	@Transient
	List<DataAttribute> aggregatableAttributes = null;

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID", unique=true, nullable=false)
	private long id;
    
	@Expose
	private String name;	
	
	@Expose
	@Column(name = "DATA_MODEL_ID")
	private String dataModelId;
	
	@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="NETWORK_ID")
    Network network;

	@Expose
	private String description;
	
	@Expose
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy="dataModel")
	private Set<DataSource> dataSources;	

	@Expose
	@OneToMany(fetch = FetchType.EAGER, cascade={CascadeType.ALL}, mappedBy="dataModel")
	private Set<DataAttribute> attributes;	

	@Expose
	@Column(name = "DATA_EXPORT_CONF")
	private String dataExportConf;

	@Expose
	@Column(name = "REVISION")
	private Long revision;

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

	public static void main(String [] args)
	{
		String [] bs = "a.b".split("\\.");
		System.out.println(bs[bs.length -1]);
	}

	public boolean contains(edu.pitt.dbmi.daquery.sql.domain.Table table)
	{
		if(table == null || StringHelper.isEmpty(table.getName())) return(false);
		String key = getTableKey(table.getName());
		return(getAttributesByTable().containsKey(key));
	}
	public List<DataAttribute> getAttributesForTable(edu.pitt.dbmi.daquery.sql.domain.Table table)
	{
		String key = getTableKey(table.getName());
		if(! getAttributesByTable().containsKey(key)) return emptyAttributeList;
		return(getAttributesByTable().get(key));
	}
	public String getTableKey(String name)
	{
		return(name.trim().toUpperCase());
	}
	public Hashtable<String, List<DataAttribute>> getAttributesByTable()
	{
		if(attributesByTableName == null)
		{
			if(attributeByTableByModelId.containsKey(dataModelId))
				attributesByTableName = attributeByTableByModelId.get(dataModelId);
			else
			{
				attributesByTableName = buildAttributesByTable();
				attributeByTableByModelId.put(dataModelId, attributesByTableName);
			}
		}
		return(attributesByTableName);
	}

	Hashtable<String, List<DataAttribute>> buildAttributesByTable()
	{
		Hashtable<String, List<DataAttribute>> tbl = new Hashtable<String, List<DataAttribute>>();
		for(DataAttribute da : this.attributes)
		{
			if((! StringHelper.isEmpty(da.getEntityName())) && (! StringHelper.isEmpty(da.getFieldName())))
			{
				
				String key = getTableKey(da.getEntityName());
				if(! tbl.containsKey(key))
					tbl.put(key, new ArrayList<DataAttribute>());
				tbl.get(key).add(da);
			}
		}
		return(tbl);		
	}

	public boolean contains(TableColumn col)
	{
		if(StringHelper.isBlank(col.getName()) || StringHelper.isBlank(col.getTableName())) return(false);
		String key = getAttribKey(col.getName(), col.getTableName());
		Hashtable<String, DataAttribute> attribs = getAttributeTable();
		return(attribs.containsKey(key));
	}

	public DataAttribute getAttribute(TableColumn col)
	{
		if(col == null) return null;
		return(getAttribute(col.getName(), col.getTableName()));
	}

	private DataAttribute getAttribute(String attribName, String tableName)
	{
		if(StringHelper.isEmpty(attribName) || StringHelper.isEmpty(tableName))
			return(null);
		String key = getAttribKey(attribName, tableName);
		Hashtable<String, DataAttribute> attribs = getAttributeTable();
		DataAttribute rVal = null;
		if(attribs.containsKey(key))
		{
			DataAttribute da = attribs.get(key);
			if(! da.equals(emptyAttribute)) rVal = da;
		}
		return(rVal);
	}
	private String getAttribKey(String attribName, String tableName)
	{
		return(attribName.trim().toUpperCase() + ":" + tableName.trim().toUpperCase());
	}

	private Hashtable<String, DataAttribute> getAttributeTable()
	{
		if(attributesByAttributeName == null)
		{
			if(attributeInfoByModelId.containsKey(dataModelId))
				attributesByAttributeName = attributeInfoByModelId.get(dataModelId);
			else
			{
				attributesByAttributeName = buildAttributeTable();
				attributeInfoByModelId.put(dataModelId, attributesByAttributeName);
			}
		}
		return(attributesByAttributeName);
	}

	private Hashtable<String, DataAttribute> buildAttributeTable()
	{
		Hashtable<String, DataAttribute> tbl = new Hashtable<String, DataAttribute>();
		for(DataAttribute da : this.attributes)
		{
			if((! StringHelper.isEmpty(da.getEntityName())) && (! StringHelper.isEmpty(da.getFieldName())))
			{
				String key = getAttribKey(da.getFieldName(), da.getEntityName());
				tbl.put(key, da);
			}
		}
		return(tbl);
	}

	List<DataAttribute> getAggregatableAttributes()
	{
		if(aggregatableAttributes == null)
		{
			aggregatableAttributes = new ArrayList<DataAttribute>();
			for(DataAttribute da : getAttributes())
				if(da.isAggregatable()) aggregatableAttributes.add(da);
		}
		return(aggregatableAttributes);
	}
	public boolean isAggregatableName(String name)
	{
		if(StringHelper.isEmpty(name)) return(false);
		String uName = name.trim().toUpperCase();
		String [] parts = uName.split("\\.");
		String fieldName = parts[parts.length - 1];
		for(DataAttribute da : getAggregatableAttributes())
		{
			String field = da.getFieldName();
			if(!StringHelper.isEmpty(field))
			{
				if(field.toUpperCase().trim().equals(fieldName)) return(true);
			}
		}
		return(false);
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

	public String getDataExportConf() { return this.dataExportConf; }
	public void setDataExportConf(String dataExportConf) { this.dataExportConf = dataExportConf; }

	public Long getRevision(){return(revision);}
	public void setRevision(Long rev){revision = rev;}
	
	@Transient
	public DataSource getDataSource(SourceType type)
	{
		for(DataSource ds: dataSources)
		{
			if(ds.getSourceTypeEnum().equals(type))
			{
				return(ds);
			}
		}
		return(null);
	}
	
	@Transient
	public DataExportConfig getExportConfig() throws DaqueryException
	{
		try {

			if(StringHelper.isBlank(dataExportConf)) return null;
			
			JAXBContext jaxbContext = JAXBContext.newInstance(DataExportConfig.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			StringReader reader = new StringReader(dataExportConf);
			DataExportConfig exportConfig = (DataExportConfig) jaxbUnmarshaller.unmarshal(reader);
			return(exportConfig);
		} catch(JAXBException je) {
			throw new DaqueryException("Error data export configuration.  Possibly the XML is not formated correctly.", je);
		}

	}
	
	@Transient
	public DataExportConfig getCDM31ExportConfigFromFile() throws DaqueryException
	{
		try
		{
			InputStream is = DataModel.class.getResourceAsStream("/data-export-config-cdm-v3.1.xml");
			if(is == null)
			{
				is = new FileInputStream(new File("/home/devuser/projects/daquery/ws/src/main/resources/data-export-config-cdm-v3.1.xml"));
			}
			Scanner inputScanner = new Scanner(is);
			dataExportConf = "";
			while(inputScanner.hasNextLine())
				dataExportConf = dataExportConf + inputScanner.nextLine() + "\n";
			inputScanner.close();

			JAXBContext jaxbContext = JAXBContext.newInstance(DataExportConfig.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			StringReader reader = new StringReader(dataExportConf);
			DataExportConfig exportConfig = (DataExportConfig) jaxbUnmarshaller.unmarshal(reader);
			reader.close();
			return(exportConfig);
		}
		catch(JAXBException je)
		{
			throw new DaqueryException("Error data export configuration.  Possibly the XML is not formated correctly.", je);
		}
		catch(FileNotFoundException fnfe)
		{
			throw new DaqueryException("File not found!!!!");
		}		
	}
	
	@Transient
	public DataExportConfig getCDM41ExportConfigFromFile() throws DaqueryException
	{
		try
		{
			InputStream is = DataModel.class.getResourceAsStream("/data-export-config-cdm-v4.1.xml");
			if(is == null)
			{
				is = new FileInputStream(new File("/home/devuser/projects/daquery/ws/src/main/resources/data-export-config-cdm-v4.1.xml"));
			}
			Scanner inputScanner = new Scanner(is);
			dataExportConf = "";
			while(inputScanner.hasNextLine())
				dataExportConf = dataExportConf + inputScanner.nextLine() + "\n";
			inputScanner.close();

			JAXBContext jaxbContext = JAXBContext.newInstance(DataExportConfig.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			StringReader reader = new StringReader(dataExportConf);
			DataExportConfig exportConfig = (DataExportConfig) jaxbUnmarshaller.unmarshal(reader);
			reader.close();
			return(exportConfig);
		}
		catch(JAXBException je)
		{
			throw new DaqueryException("Error data export configuration.  Possibly the XML is not formated correctly.", je);
		}
		catch(FileNotFoundException fnfe)
		{
			throw new DaqueryException("File not found!!!!");
		}		
	}	
//	@Override
//	public String toJson() {
//        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
//        DataModel tempDM = new DataModel();
//        tempDM.setId(this.getId());
//        tempDM.setName(this.getName());
//        tempDM.setDescription(this.getDescription());
//        tempDM.setDataModelId(this.getDataModelId());
//        //CDB I had to remove this otherwise it throws a Stack Overflow
//        //The attributes contain an owner which is a DataModel.  This DataModel 
//        //generates attributes with another DataModel, etc.
//        Set<DataAttribute> tempAttr = this.getAttributes();
//        tempAttr.remove("owner");
//        tempDM.setAttributes(new HashSet<DataAttribute>());
//        //just in case there are some double quotes in the XML, replace them with single quotes
//        //otherwise the JSON thinks it is an unterminated string
//        tempDM.setDataExportConf(this.getDataExportConf().replace('"', '\''));
//        return gson.toJson(tempDM);
//        
//	}
	
	private String escapeQuotes(String inputStr) {
		String retString = inputStr.replace('"', '\"');
		return retString;
	}

}

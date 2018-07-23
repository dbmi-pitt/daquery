package edu.pitt.dbmi.daquery.common.domain;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Serializable;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.annotations.Expose;

import edu.pitt.dbmi.daquery.common.domain.DaqueryObject;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;
import edu.pitt.dbmi.daquery.common.util.DataExportConfig;
import edu.pitt.dbmi.daquery.common.util.StringHelper;
import edu.pitt.dbmi.daquery.update.db.DBUpdate137;

@Entity
@Table(name="DATA_MODEL")
public class DataModel extends DaqueryObject implements Serializable
{	

	private static final long serialVersionUID = 29292842342523123l;

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
	
	@Expose
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy="dataModel")
	private Set<DataSource> dataSources;	

	@Expose
	@OneToMany(fetch = FetchType.EAGER, cascade={CascadeType.ALL}, mappedBy="dataModel")
	private Set<DataAttribute> attributes;	

	@Expose
	@Column(name = "DATA_EXPORT_CONF")
	private String dataExportConf;
	
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
	
	public String getDataExportConf() { return this.dataExportConf; }
	public void setDataExportConf(String dataExportConf) { this.dataExportConf = dataExportConf; }

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
	
	@Transient
	public DataExportConfig getExportConfig() throws DaqueryException
	{
		try {
			//TODO: Hack for now.  If export config is empty read it from our file
			if(StringHelper.isBlank(dataExportConf))
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
			}
			JAXBContext jaxbContext = JAXBContext.newInstance(DataExportConfig.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			StringReader reader = new StringReader(dataExportConf);
			DataExportConfig exportConfig = (DataExportConfig) jaxbUnmarshaller.unmarshal(reader);
			return(exportConfig);
		} catch(JAXBException je) {
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

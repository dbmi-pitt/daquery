package edu.pitt.dbmi.daquery.common.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.google.gson.annotations.Expose;

@Entity
@Table(name="DATA_ATTRIBUTE")
public class DataAttribute
{
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID", unique=true, nullable=false)
	private long id;
    
    @Expose
    @Column(name = "ENTITY_NAME")
    private String entityName;
    
    @Expose
    @Column(name = "FIELD_NAME")
    private String fieldName;
    
    @Expose
    @Column(name = "FIELD_TYPE")
    private String fieldType;
    
    @Expose
    @Column(name = "PHI")
    private boolean phi = true;
    
    @Expose
    private boolean aggregatable = false;
    
    @Expose
    @Column(name = "IDENTIFIER")
    private boolean identifier = false;
    
    @Expose
    @Column(name = "IDENT_NAME")
    private String identifierName;
    
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="MODEL_ID")
    DataModel dataModel;    
    
    public long getId(){return(id);}
    public void setId(long id){this.id = id;}
    
    public String getEntityName(){return(entityName);}
    public void setEntityName(String name){entityName = name;}
    
    public String getFieldName(){return(fieldName);}
    public void setFieldName(String name){fieldName = name;}

    public String getFieldType(){return(fieldType);}
    public void setFieldType(String type){fieldType = type;}
    
    public boolean isPhi(){return(phi);}
    public void setPhi(boolean phi){this.phi = phi;}
    
    public boolean isAggregatable(){return(aggregatable);}
    public void setAggregatable(boolean aggregate){aggregatable = aggregate;}
    
    public DataModel getDataModel(){return(dataModel);}
    public void setDataModel(DataModel model){dataModel = model;}
    
    public boolean isIdentifier(){return(identifier);}
    public void setIdentifier(boolean ident){identifier = ident;}
    
    public String getIdentifierName(){return(identifierName);}
    public void setIdentiferName(String identName){identifierName = identName;}
    
}

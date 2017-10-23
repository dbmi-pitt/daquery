package edu.pitt.dbmi.daquery.domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "SAS_DATA_SOURCE")
@DiscriminatorValue(value = SourceType.TYPES.SAS_VAL)
@PrimaryKeyJoinColumn(name = "ds_id", referencedColumnName = "ds_id")
public class SASDataSource extends DataSource
{
	private static final long serialVersionUID = 234230709782l;
	
	@Column(name = "DATASET_LOCATION")
	private String datasetLocation;
	
	public String getDatasetLocation(){return(datasetLocation);}
	public void setDatasetLocation(String dSet){datasetLocation = dSet;}
}

package edu.pitt.dbmi.daquery.sql.domain;

import edu.pitt.dbmi.daquery.common.domain.DataAttribute;
import edu.pitt.dbmi.daquery.common.domain.DataModel;
import edu.pitt.dbmi.daquery.common.util.StringHelper;

public class Table extends AbstractElement implements ColumnProvider, SQLElement
{
	private String name;
	private String dbName;
	private String alias;

	public String getName(){return name;}
	public void setName(String name){this.name = name;}
	
	public String getAlias(){return alias;}
	public void setAlias(String alias){this.alias = alias;}

	public String getDBName(){return(dbName);}
	public void setDBName(String name){dbName = name;}
	
	@Override
	public boolean matchesName(String name)
	{
		if(StringHelper.isEmpty(name)) return(false);
		if(StringHelper.isEmpty(this.name) && StringHelper.isEmpty(alias)) return(false);
		return(StringHelper.equalIgnoreCase(this.name, name) || StringHelper.equalIgnoreCase(name, alias));
	}
	
	//resolves to deid info given that col is a TableColumn AND both table name and field name are provided
	public DeIdTag resolveColumnPhiInfo(Column col, DataModel dm)
	{
		return(getDeidInfo(col, dm));
	}
	
	public DeIdTag getDeidInfo(Column col, DataModel dm)
	{
		if(col instanceof TableColumn && dm.contains((TableColumn)col))
		{
			DataAttribute attrib = dm.getAttribute((TableColumn) col);
			DeIdTag tag = new DeIdTag();
			boolean phi = attrib.isPhi();

			if(attrib.isAggregatable()){tag.setObfuscate(true); phi = true;}
			if(attrib.getFieldType().equals("DATE"))
			{
				phi = true;
				tag.setDateShiftTrackByTableName(attrib.getEntityName());
				tag.setDateShiftTrackByName(attrib.getFieldName());
			}
			if(attrib.isIdentifier()){tag.setId(true); phi = true;}
			tag.setPhi(phi);
			return(tag);
		}
		else return(null);
	}	
}

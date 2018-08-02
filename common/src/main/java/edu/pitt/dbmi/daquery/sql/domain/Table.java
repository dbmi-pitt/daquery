package edu.pitt.dbmi.daquery.sql.domain;

import java.util.ArrayList;
import java.util.List;

import edu.pitt.dbmi.daquery.common.domain.DataAttribute;
import edu.pitt.dbmi.daquery.common.domain.DataModel;
import edu.pitt.dbmi.daquery.common.util.StringHelper;
import edu.pitt.dbmi.daquery.sql.ReturnColumn;

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
	public boolean matchesName(String val)
	{
		if(StringHelper.isEmpty(val)) return(false);
		if(StringHelper.isEmpty(this.name) && StringHelper.isEmpty(alias)) return(false);
		if(StringHelper.isBlank(alias))
			return(StringHelper.equalIgnoreCase(val, this.name));
		else
			return(StringHelper.equalIgnoreCase(val, alias));
	}
	
	@Override
	public List<ReturnColumn> getReturnColumns(DataModel dm)
	{
		List<ReturnColumn> rCols = new ArrayList<ReturnColumn>();
		List<DataAttribute> fields = dm.getAttributesForTable(this);
		for(DataAttribute attrib : fields)
		{
			ReturnColumn rCol = new ReturnColumn();
			Column col = new TableColumn();
			col.setName(attrib.getFieldName());
			rCol.column = col;

			DeIdTag tag = new DeIdTag();
			boolean phi = attrib.isPhi();
			if(attrib.isAggregatable()){tag.setObfuscate(true); phi = true;}
			if(attrib.getFieldType().equals("DATE") || attrib.isDateField())
			{
				phi = true;
				tag.setDateShiftTrackByTableName(attrib.getEntityName());
				tag.setDateShiftTrackByName("PATID");
				tag.setDateField(true);
			}
			if(attrib.isIdentifier()){tag.setId(true); phi = true; tag.setIdName(attrib.getIdentifierName());}
			if(attrib.isBirthDate()){tag.setBirthdate(true); phi = true;}
			if(attrib.isZipCode()){tag.setZipCode(true); phi = true;}
			tag.setPhi(phi);			
			rCol.deidTag = tag;
			rCols.add(rCol);
		}
		return(rCols);
	}
	

}

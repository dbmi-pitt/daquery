package edu.pitt.dbmi.daquery.sql.domain;

import java.util.List;

import edu.pitt.dbmi.daquery.common.domain.DataModel;
import edu.pitt.dbmi.daquery.sql.ReturnColumn;

public interface ColumnProvider {
	public boolean matchesName(String name);
	public String getAlias();
	public void setAlias(String alias);
	public List<ReturnColumn> getReturnColumns(DataModel dm);
}

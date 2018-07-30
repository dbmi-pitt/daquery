package edu.pitt.dbmi.daquery.sql.domain;

import edu.pitt.dbmi.daquery.common.domain.DataModel;
import edu.pitt.dbmi.daquery.sql.ReturnColumn;

public interface ColumnProvider {
	public boolean matchesName(String name);
	public ReturnColumn resolveColumn(Column col, DataModel dm);
	public DeIdTag resolveColumnPhiInfo(Column col, DataModel dm);
	public String getAlias();
	public void setAlias(String alias);
}

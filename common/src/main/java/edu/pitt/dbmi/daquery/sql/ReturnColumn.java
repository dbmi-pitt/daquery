package edu.pitt.dbmi.daquery.sql;

import edu.pitt.dbmi.daquery.sql.domain.Column;
import edu.pitt.dbmi.daquery.sql.domain.DeIdTag;

public class ReturnColumn
{
	public Column column;
	public DeIdTag deidTag;
	public boolean multipleMatchingReferences = false;
}

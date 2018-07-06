package edu.pitt.dbmi.daquery.sql.domain;

import java.util.List;

public interface SQLElement
{
	public void setParent(SQLElement parent);
	public SQLElement getParent();
	
	public void addChild(SQLElement child);
	public List<SQLElement> getChildren();
}

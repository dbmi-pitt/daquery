package edu.pitt.dbmi.daquery.sql.domain;

import java.util.ArrayList;
import java.util.List;

public class AbstractElement implements SQLElement {

	protected List<SQLElement> children = new ArrayList<SQLElement>();
	protected SQLElement parent = null;
	
	@Override
	public void setParent(SQLElement parent) {this.parent = parent;}
	@Override
	public SQLElement getParent(){return(parent);}
	
	@Override
	public void addChild(SQLElement child) {children.add(child);}
	@Override
	public List<SQLElement> getChildren(){return(children);}

}

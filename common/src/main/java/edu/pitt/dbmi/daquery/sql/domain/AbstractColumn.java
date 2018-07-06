package edu.pitt.dbmi.daquery.sql.domain;

public class AbstractColumn extends AbstractElement implements SQLElement, Column
{
	private DeIdTag deIdTag;
	
	public DeIdTag getDeIdTag(){return(deIdTag);}
	public void setDeIdTag(DeIdTag tag){deIdTag = tag;}
	
	@Override public void addChild(SQLElement child)
	{
		children.add(child);
		if(child instanceof DeIdTag) setDeIdTag((DeIdTag) child);
	}
}

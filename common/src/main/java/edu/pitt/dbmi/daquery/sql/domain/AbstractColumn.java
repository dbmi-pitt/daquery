package edu.pitt.dbmi.daquery.sql.domain;

public abstract class AbstractColumn extends AbstractElement implements SQLElement, Column
{
	private DeIdTag deIdTag;
	
	public DeIdTag getDeIdTag(){return(deIdTag);}
	public void setDeIdTag(DeIdTag tag){deIdTag = tag;}
	protected String name;
	protected String alias;
	
	@Override public String getName(){return(name);}
	@Override public void setName(String name){this.name = name;}
	
	@Override public String getAlias(){return(alias);}
	@Override public void setAlias(String name){alias = name;}	
	
	@Override public void addChild(SQLElement child)
	{
		children.add(child);
		if(child instanceof DeIdTag) setDeIdTag((DeIdTag) child);
	}	
}

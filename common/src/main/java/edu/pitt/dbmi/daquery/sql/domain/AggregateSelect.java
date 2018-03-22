package edu.pitt.dbmi.daquery.sql.domain;

public class AggregateSelect extends SingleSelect {
	
	public AggregateSelect(Term term)
	{
		super();
		this.setTerm(new AggregateField(term));
	}
	
	@Override
	public boolean check()
	{
		return(true);
	}
	
	private class AggregateField extends Field
	{
		public AggregateField(Term term)
		{
			this.distinct = term.isDistinct();
			this.count = true;
			this.name = term.getName();
		}
			
		//don't allow count setting to be changed
		@Override
		public void setCount(boolean count){}
		
	}
	

}

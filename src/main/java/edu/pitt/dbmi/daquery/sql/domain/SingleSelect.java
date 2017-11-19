package edu.pitt.dbmi.daquery.sql.domain;

public class SingleSelect extends SelectClause {
	
	private Term term;
	
	protected SingleSelect(){}
	
	public SingleSelect(Term term)
	{
		this.term = term;
	}
	
	//converts an aggregate (count) clause to a select
	//that will return the value instead of the count
	SingleSelect(AggregateSelect sel)
	{
		this.term = sel.getTerm();
		this.term.setCount(false);
	}
	
	public Term getTerm()
	{
		return(term);
	}
	public void setTerm(Term term)
	{
		this.term = term;
	}
	
	@Override
	public String getClause() {
		String rVal = term.getTerm();
		if(isDistinct())
			rVal = "distinct " + rVal;
		
		return(rVal);
	}

	@Override
	public boolean check() {
		return true;
	}

}

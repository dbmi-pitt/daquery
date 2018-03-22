package edu.pitt.dbmi.daquery.sql.domain;

import java.util.ArrayList;
import java.util.List;

public class MultipleSelect extends SelectClause {

	private List<Term> terms = new ArrayList<Term>();
	
	@Override
	public boolean check() {
		return true;
	}

	@Override
	public String getClause() throws SQLConversionError{
		if(terms.size() == 0)
			throw new SQLConversionError("Error, multiple select clause contains no terms.  A query cannont be constructed without a select clause;");
		String rVal = "select ";
		boolean firstTerm = true;
		for(Term t : terms)
		{
			if(! firstTerm)
				rVal = rVal + ", ";
			else
				firstTerm = false;
			
			rVal = rVal + t.getTerm();
		}
		return(rVal);
	}

}

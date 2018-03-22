package edu.pitt.dbmi.daquery.sql.domain;

import java.util.ArrayList;
import java.util.List;

public class FromClause implements QuerySegment
{

	private List<FromExpression> expressions = new ArrayList<FromExpression>();
	
	@Override
	public boolean check() throws SQLConversionError
	{
		return(true);
	}
	
	public String getClause(DBSchema schema)
	{
		boolean firstElement = true;
		String rVal = ""; 
		for(FromExpression expr : expressions)
		{
			if(firstElement)
				firstElement = false;
			else
				rVal = rVal + ", ";
			
			rVal = rVal + expr.getExpression(schema);
		}
		
		return(rVal);
	}

}

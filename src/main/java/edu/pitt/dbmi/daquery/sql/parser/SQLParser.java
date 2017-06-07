package edu.pitt.dbmi.daquery.sql.parser;

import java.util.List;

import edu.pitt.dbmi.daquery.sql.domain.SelectQuery;


public class SQLParser
{
	public static List<SelectQuery> parse(String sql)
	{
	    return(SQLListener.parse(sql));
	}
}

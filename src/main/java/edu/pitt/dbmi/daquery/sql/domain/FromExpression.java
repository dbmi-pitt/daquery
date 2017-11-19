package edu.pitt.dbmi.daquery.sql.domain;

public interface FromExpression extends QuerySegment
{
	public String getExpression(DBSchema schema);
}

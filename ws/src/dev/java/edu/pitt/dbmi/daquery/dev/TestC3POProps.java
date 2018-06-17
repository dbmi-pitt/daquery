package edu.pitt.dbmi.daquery.dev;

import java.util.List;

import edu.pitt.dbmi.daquery.common.util.AppProperties;
import edu.pitt.dbmi.daquery.common.util.C3P0Properties;
import edu.pitt.dbmi.daquery.common.util.DaqueryException;

public class TestC3POProps
{
	public static void main(String [] args) throws DaqueryException
	{
		AppProperties.setDevHomeDir("/Users/bill/dq-test");
		List<String> names = C3P0Properties.getPropertyNames();
		for(String name : names)
			System.out.println(name);
	}
}

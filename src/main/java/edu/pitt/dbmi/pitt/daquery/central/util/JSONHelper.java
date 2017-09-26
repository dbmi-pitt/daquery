package edu.pitt.dbmi.pitt.daquery.central.util;

import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.pitt.dbmi.daquery.common.domain.DaqueryObject;

public class JSONHelper
{
	/**
	 * Convert an object to JSON.
     * @param value An object to convert to JSON. Valid object types are
     * 								   DaqueryObject, List<DaqueryObject> or Map<String, Object)
     *                                 where the String/Object types on map are attribute name/data (toString, used)
     *                              
	 * @return The json representation of an object.
	 * @throws DaqueryException if the input value isn't one of the supported types.
	 */
	public static String toJSON(Object value) throws DaqueryException
	{
		if(value instanceof Map)
		{
			Map vals = (Map) value;
			Set keys = vals.keySet();
			for(Object key : keys)
			{
				if(key instanceof String)
				{
					
				}
				else
				{
					throw new DaqueryException("A non-String attribute name was found in a Map being converted to JSON");
				}
			}
		}
		else if(value instanceof DaqueryObject)
		{
			
		}
		else if(value instanceof List)
		{
			
		}
	}
}

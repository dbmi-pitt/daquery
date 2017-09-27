package edu.pitt.dbmi.daquery.common.util;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.json.Json;
import javax.json.JsonBuilderFactory;
import javax.json.JsonObjectBuilder;

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
		if(value == null)
			throw new DaqueryException("Null value found while converting JSON.");
		
		if(value instanceof Map)
		{
			Map vals = (Map) value;
			Set keys = vals.keySet();
	        JsonBuilderFactory jFactory = Json.createBuilderFactory(null);
	        JsonObjectBuilder jsonData = jFactory.createObjectBuilder();

			for(Object key : keys)
			{
				if(key instanceof String)
				{
	        		Object obj = vals.get(key);
	        		if(obj instanceof DaqueryObject)
	        			jsonData.add((String) key, ((DaqueryObject) obj).toJson());
	        		else if(obj instanceof List)
	        			jsonData.add((String)key, toJSON(obj));
	        		else
	        			jsonData.add((String) key, vals.get(key).toString());
				}
				else
					throw new DaqueryException("A non-String attribute name was found in a Map being converted to JSON");
			}
			return(jsonData.build().toString());
		}
		else if(value instanceof DaqueryObject)
			return((DaqueryObject) value).toJson();
		else if(value instanceof List)
		{
			String rVal = "[";
			String comma = "";
			boolean first = false;
			for(Object obj : (List) value)
			{
				rVal = rVal + comma + "{" + toJSON(obj) + "}";
				if(first)
				{
					first = false;
					comma = ", ";
				}
			}
				
			rVal = rVal + "]";
			return(rVal);
		}
		else
			throw new DaqueryException("JSON conversion is only supported for types Map<String, Object>, DaqueryObject and List<DaqueryObject>.  An object of type " + value.getClass().getSimpleName() +  " found"); 
	} 
}

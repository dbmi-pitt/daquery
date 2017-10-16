package edu.pitt.dbmi.daquery.common.util;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.joda.time.DateTime;
import org.joda.time.format.ISODateTimeFormat;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.reflect.TypeToken;

import edu.pitt.dbmi.daquery.common.domain.DaqueryObject;

public class JSONHelper
{
	
    public static Gson gson = new GsonBuilder()
    		.excludeFieldsWithoutExposeAnnotation()
            .registerTypeAdapter(DateTime.class, new JsonSerializer<DateTime>() {
                
                public JsonElement serialize(DateTime src, Type typeOfSrc, JsonSerializationContext context) {
                    return new JsonPrimitive(ISODateTimeFormat.dateTime().print(src));
                }
            }).create();
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
			if(vals.size() == 0)
				return("{}");
			Set keys = vals.keySet();

			String rJson = "{";
			boolean first = true;
			String comma = "";
			for(Object key : keys)
			{
				if(key instanceof String)
				{
	        		Object obj = vals.get(key);
	        		if(obj instanceof DaqueryObject)
	        			rJson = rJson + comma + "\"" + (String) key + "\":" + ((DaqueryObject) obj).toJson();
	        		else if(obj instanceof List)
	        			rJson = rJson + "\"" + comma + (String) key + "\":" + toJSON(obj);
	        		else
	        			rJson = rJson + comma + "\"" + (String) key + "\":" + jsonValue(obj);

	        		if(first)
	        		{
	        			first = false;
	        			comma = ",";
	        		}
				}
				else
					throw new DaqueryException("A non-String attribute name was found in a Map being converted to JSON");
			}
			rJson = rJson + "}";
			return(rJson);
		}
		else if(value instanceof DaqueryObject)
			return((DaqueryObject) value).toJson();
		else if(value instanceof List)
		{
			if(((List) value).size() == 0) return("[]");
			String rVal = "[";
			String comma = "";
			boolean first = true;
			for(Object obj : (List) value)
			{
				rVal = rVal + comma + toJSON(obj);
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
	
	/**
	 * Convert json formatted text to a HashMap
	 * 
	 * @param json
	 * @return
	 */
	public static Map<String, String> toMap(String json)
	{
		Type type = new TypeToken<Map<String, String>>(){}.getType();
		Map<String, String> rVal = gson.fromJson(json, type);
		return(rVal);
	}
	private static String jsonValue(Object obj)
	{
		if(obj instanceof Integer || obj instanceof Double || obj instanceof Float || obj instanceof Long)
		{
			return(obj.toString());
		}
		else
		{
			return("\"" + obj.toString() + "\"");
		}
	}
}

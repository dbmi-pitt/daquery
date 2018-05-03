package edu.pitt.dbmi.daquery.common.domain;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import edu.pitt.dbmi.daquery.common.util.StringHelper;

/**
 * This class provides common methods for all the daquery domain objects
 * @author devuser
 *
 */

//Note: This method is used in conjunction with the @Expose annotation
//the @Expose is used to prevent the Gson code from entering an infinite loop
//by trying to serialize all the nested objects.  The @Expose annotation
//should be used to exclude nested objects that reference one another
//and cause circular references within the JSON.
public abstract class DaqueryObject implements Serializable{
	
	private static final long serialVersionUID = 29220787101312l;
	
	private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
	
	public String toJson() {
        Gson gson = new GsonBuilder()
        		.excludeFieldsWithoutExposeAnnotation()
                .registerTypeAdapter(Date.class, new JsonSerializer<Date>() {
                    
                    public JsonElement serialize(Date src, Type typeOfSrc, JsonSerializationContext context) {
                    	return new JsonPrimitive(dateFormat.format(src));
                        //return new JsonPrimitive(ISODateTimeFormat.dateTime().print(src));
                    }
                }).create();
		//return StringHelper.unEscapeQuotes(gson.toJson(this));
        return gson.toJson(this);
	}
}
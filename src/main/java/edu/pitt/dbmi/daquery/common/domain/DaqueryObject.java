package edu.pitt.dbmi.daquery.common.domain;

import java.io.Serializable;
import java.lang.reflect.Type;

import javax.json.JsonValue;

import org.joda.time.DateTime;
import org.joda.time.format.ISODateTimeFormat;

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
	
	public String toJson() {
        Gson gson = new GsonBuilder()
        		.excludeFieldsWithoutExposeAnnotation()
                .registerTypeAdapter(DateTime.class, new JsonSerializer<DateTime>() {
                    
                    public JsonElement serialize(DateTime src, Type typeOfSrc, JsonSerializationContext context) {
                        return new JsonPrimitive(ISODateTimeFormat.dateTime().print(src));
                    }
                }).create();
		return StringHelper.unEscapeQuotes(gson.toJson(this));
	}
	
	
}
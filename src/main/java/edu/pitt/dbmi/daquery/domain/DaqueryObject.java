package edu.pitt.dbmi.daquery.domain;

import java.lang.reflect.Type;

import org.joda.time.DateTime;
import org.joda.time.format.ISODateTimeFormat;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

/**
 * This class provides common methods for all the daquery domain objects
 * @author devuser
 *
 */
public abstract class DaqueryObject {
	
	public String toJson() {
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(DateTime.class, new JsonSerializer<DateTime>() {
                    @Override
                    public JsonElement serialize(DateTime src, Type typeOfSrc, JsonSerializationContext context) {
                        return new JsonPrimitive(ISODateTimeFormat.dateTime().print(src));
                    }
                }).create();
		return gson.toJson(this);
	}
	
}
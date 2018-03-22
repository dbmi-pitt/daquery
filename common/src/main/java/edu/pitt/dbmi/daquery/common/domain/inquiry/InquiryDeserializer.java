package edu.pitt.dbmi.daquery.common.domain.inquiry;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import antlr.TokenBuffer;

/**
 * This class is currently not used, but left as an example.  To install it add
 * @JsonDeserialize(as = SQLQuery.class) to SQLQuery and @JsonDeserialize(using = InquiryDeserializer.class) to Inquiry
 * @author devuser
 *
 */
public class InquiryDeserializer extends JsonDeserializer<Inquiry> {

    @Override
    public Inquiry deserialize(JsonParser jp,  DeserializationContext ctxt) throws IOException, JsonProcessingException {
//    	String json = jp.readValueAsTree().toString();
//    	Inquiry rv = new ObjectMapper().readValue(json, SQLQuery.class);
        ObjectMapper mapper = (ObjectMapper) jp.getCodec();
/*        if(node == null) return(null);
        JsonNode typeNode = node.get("dataType");
        if(typeNode == null) return(null);
        String dType = typeNode.asText();
        Class<? extends Inquiry> typeClass = null;
        if(dType.equals(InquiryType.TYPES.SQL_VAL))
        	typeClass = SQLQuery.class;
        else
        	return(null); */
        Inquiry rVal = mapper.readValue(jp, SQLQuery.class ); 
        return rVal;
    }
}

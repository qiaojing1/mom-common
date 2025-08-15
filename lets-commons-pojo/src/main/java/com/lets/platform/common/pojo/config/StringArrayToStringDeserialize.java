package com.lets.platform.common.pojo.config;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.util.StringJoiner;

public class StringArrayToStringDeserialize extends JsonDeserializer<String> {

    @Override
    public String deserialize(JsonParser jsonParser, DeserializationContext context) throws IOException {
        String[] parts = jsonParser.readValueAs(String[].class);
        if (parts.length > 0) {
            StringJoiner joiner = new StringJoiner(",");
            for (String part : parts) {
                joiner.add(part);
            }
            return joiner.toString();
        } else {
            return "";
        }
    }
}
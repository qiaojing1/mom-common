package com.lets.platform.common.pojo.tools;

import cn.hutool.core.collection.CollUtil;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;

public class JsonColDeserializer extends JsonDeserializer<String> {

    public static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonColDeserializer.class);

    @Override
    public String deserialize(JsonParser p, DeserializationContext context) throws IOException, JsonProcessingException {
        List<String> list = OBJECT_MAPPER.readValue(p, List.class);
        if (CollUtil.isNotEmpty(list)) {
            return "[\"" + String.join("\",\"", list) + "\"]";
        } else {
            return null;
        }
    }
}

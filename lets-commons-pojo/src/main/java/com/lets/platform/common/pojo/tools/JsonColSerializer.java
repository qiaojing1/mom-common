package com.lets.platform.common.pojo.tools;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * <一句话功能简述>
 *
 * @author DING WEI
 * @ClassName JsonColSerializer
 * @date 2019/5/28 15:33
 * @since 1.0.0
 **/
public class JsonColSerializer extends JsonSerializer<String> {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonColSerializer.class);

    public static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    @Override
    public void serialize(String value, JsonGenerator generator, SerializerProvider provider) throws IOException {
        if (value == null || value.isEmpty()) {
            generator.writeString("");
            return;
        }
        if (value.startsWith("{") && value.endsWith("}")) {
            try {
                Map map = OBJECT_MAPPER.readValue(value, Map.class);
                generator.writeObject(map);
            } catch (Exception e) {
                LOGGER.error("json转换Map报错:" + e);
                generator.writeString(value);
            }
        } else if (value.startsWith("[") && value.endsWith("]")) {
            try {
                List<Map> list = (List<Map>) OBJECT_MAPPER.readValue(value, List.class);
                generator.writeObject(list);
            } catch (Exception e) {
                LOGGER.error("json转换list报错:" + e);
                generator.writeString(value);
            }
        } else {
            generator.writeString(value);
        }
    }
}

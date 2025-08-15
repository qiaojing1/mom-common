package com.lets.platform.common.pojo.config;

import cn.hutool.core.util.StrUtil;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class StringToStringArraySerializer extends StdSerializer<String> {

    public StringToStringArraySerializer() {
        super(String.class);
    }

    @Override
    public void serialize(String value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        if (StrUtil.isEmpty(value) || "[]".equals(value)) {
            gen.writeObject(new String[0]);
        } else {
            String[] parts = value.split(",");
            gen.writeObject(parts);
        }
    }
}
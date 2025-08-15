package com.lets.platform.common.pojo.config;

import cn.hutool.core.date.LocalDateTimeUtil;
import cn.hutool.core.util.StrUtil;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateDeserializer extends JsonDeserializer<LocalDate> {
    private final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Override
    public Class<?> handledType() {
        return LocalDate.class;
    }

    @Override
    public LocalDate deserialize(JsonParser p, DeserializationContext context) throws IOException {
        String str = p.getText();
        if (StrUtil.isEmpty(str)) {
            return null;
        } else if (str.length() == 10) {
            // 如果字符串的长度等于10，说明它可能是一个日期字符串
            return LocalDate.parse(str, dateFormatter);
        } else {
            // 否则，我们假设它是一个日期时间字符串
            if (str.contains("T")) {
                if (str.contains("Z")) {
                    return LocalDateTimeUtil.parse(str, DateTimeFormatter.ISO_INSTANT).toLocalDate();
                } else {
                    return LocalDateTimeUtil.parse(str, DateTimeFormatter.ISO_LOCAL_DATE_TIME).toLocalDate();
                }
            }
            return LocalDateTime.parse(str, dateTimeFormatter).toLocalDate();
        }
    }
}

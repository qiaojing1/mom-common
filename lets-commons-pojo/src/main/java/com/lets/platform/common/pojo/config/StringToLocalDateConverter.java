package com.lets.platform.common.pojo.config;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component
public class StringToLocalDateConverter implements Converter<String, LocalDate> {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    @Override
    public LocalDate convert(@Nullable String source) {
        if (source == null) {
            return null;
        }
        return LocalDate.parse(source, formatter);
    }
}

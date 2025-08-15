package com.lets.platform.common.pojo.config;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.LocalDateTimeUtil;
import org.springframework.cloud.openfeign.FeignFormatterRegistrar;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class LocalDateFeignFormatterRegistrar implements FeignFormatterRegistrar {
    @Override
    public void registerFormatters(FormatterRegistry registry) {
        registry.addConverter(LocalDate.class, String.class, source -> LocalDateTimeUtil.format(source, DatePattern.NORM_DATE_PATTERN));
    }
}
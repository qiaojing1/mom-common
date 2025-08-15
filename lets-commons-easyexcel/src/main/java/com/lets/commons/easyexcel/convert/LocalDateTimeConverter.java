package com.lets.commons.easyexcel.convert;

import cn.hutool.core.date.LocalDateTimeUtil;
import cn.hutool.core.util.StrUtil;
import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.data.ReadCellData;
import com.alibaba.excel.metadata.data.WriteCellData;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeConverter implements Converter<LocalDateTime> {
    private final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Override
    public Class<LocalDateTime> supportJavaTypeKey() {
        return LocalDateTime.class;
    }

    @Override
    public CellDataTypeEnum supportExcelTypeKey() {
        return CellDataTypeEnum.STRING;
    }

    @Override
    public LocalDateTime convertToJavaData(ReadCellData cellData, ExcelContentProperty contentProperty, GlobalConfiguration globalConfiguration) {
        String str = cellData.getStringValue();
        if (StrUtil.isEmpty(str)) {
            return null;
        } else if (str.length() == 10) {
            // 如果字符串的长度等于10，说明它可能是一个日期字符串
            LocalDate date = LocalDate.parse(str, dateFormatter);
            return date.atStartOfDay();
        } else {
            // 否则，我们假设它是一个日期时间字符串
            if (str.contains("T")) {
                if (str.contains("Z")) {
                    return LocalDateTimeUtil.parse(str, DateTimeFormatter.ISO_INSTANT);
                } else {
                    return LocalDateTimeUtil.parse(str, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
                }
            }
            return LocalDateTime.parse(str, dateTimeFormatter);
        }
    }

    @Override
    public WriteCellData<String> convertToExcelData(LocalDateTime value, ExcelContentProperty contentProperty, GlobalConfiguration globalConfiguration) {
        if (contentProperty != null && contentProperty.getField() != null) {
            JsonFormat jsonFormat = contentProperty.getField().getAnnotation(JsonFormat.class);
            if (jsonFormat != null) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern(jsonFormat.pattern());
                return new WriteCellData<>(LocalDateTimeUtil.format(value, formatter));
            }
        }
        return new WriteCellData<>(LocalDateTimeUtil.format(value, dateTimeFormatter));
    }
}

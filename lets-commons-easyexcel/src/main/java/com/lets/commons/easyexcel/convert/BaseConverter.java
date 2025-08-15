package com.lets.commons.easyexcel.convert;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.data.ReadCellData;
import com.alibaba.excel.metadata.data.WriteCellData;
import com.alibaba.excel.metadata.property.ExcelContentProperty;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class BaseConverter<T> implements Converter<T> {
    private final Class<T> clazz;
    private final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public BaseConverter(Class<T> clazz) {
        this.clazz = clazz;
    }

    @Override
    public CellDataTypeEnum supportExcelTypeKey() {
        return CellDataTypeEnum.STRING;
    }

    @Override
    public Class<T> supportJavaTypeKey() {
        return clazz;
    }

    @Override
    public T convertToJavaData(
            ReadCellData cellData,
            ExcelContentProperty contentProperty,
            GlobalConfiguration globalConfiguration) {
        // LocalDateTime 时间转换
        if (cellData.getData() instanceof LocalDate) {
            if (cellData.getType().equals(CellDataTypeEnum.NUMBER)) {
                LocalDate localDate = LocalDate.of(1900, 1, 1);
                localDate = localDate.plusDays(cellData.getNumberValue().longValue());
                return (T) localDate;
            } else if (cellData.getType().equals(CellDataTypeEnum.STRING)) {
                return (T) LocalDate.parse(cellData.getStringValue(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            } else {
                return null;
            }
        }

        // LocalDateTime 时间转换
        if (cellData.getData() instanceof LocalDateTime) {
            return (T) LocalDateTime.parse(cellData.getStringValue(), dateTimeFormatter);
        }
        return null;
    }

    @Override
    public WriteCellData<T> convertToExcelData(T o, ExcelContentProperty excelContentProperty, GlobalConfiguration globalConfiguration) {
        if (o instanceof LocalDate) {
            LocalDate localDate = LocalDate.parse(o.toString());
            return new WriteCellData<>(localDate.toString());
        }

        if (o instanceof LocalDateTime) {
            LocalDateTime localDateTime = LocalDateTime.parse(o.toString());
            return new WriteCellData<>(localDateTime.format(dateTimeFormatter));
        }

        return new WriteCellData<>(o.toString());
    }
}

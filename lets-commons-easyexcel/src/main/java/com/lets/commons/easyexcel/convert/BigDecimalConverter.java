package com.lets.commons.easyexcel.convert;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.converters.WriteConverterContext;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.data.ReadCellData;
import com.alibaba.excel.metadata.data.WriteCellData;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import com.lets.platform.common.pojo.constant.GlobalConstant;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * BigDecimal转换
 * @author: DING WEI
 * @date: 2025/2/25 10:54
 */
public class BigDecimalConverter implements Converter<BigDecimal> {

    @Override
    public Class<BigDecimal> supportJavaTypeKey() {
        return BigDecimal.class;
    }

    @Override
    public WriteCellData<?> convertToExcelData(WriteConverterContext<BigDecimal> context) throws Exception {
        if (Objects.isNull(context) || Objects.isNull(context.getValue())) {
            return new WriteCellData<>(GlobalConstant.DOUBLE_MIDDLE_LINE);
        } else {
            return new WriteCellData<>(context.getValue().toPlainString());
        }
    }

    @Override
    public BigDecimal convertToJavaData(ReadCellData<?> cellData, ExcelContentProperty contentProperty, GlobalConfiguration globalConfiguration) throws Exception {
        if (cellData.getType() == CellDataTypeEnum.STRING) {
            return new BigDecimal(cellData.getStringValue());
        } else if (cellData.getType() == CellDataTypeEnum.NUMBER) {
            return cellData.getNumberValue();
        }
        return null;
    }

}

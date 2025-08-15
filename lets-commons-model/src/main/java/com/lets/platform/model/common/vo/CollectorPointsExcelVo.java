package com.lets.platform.model.common.vo;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @ClassName CollectorPointsExcelVo
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2023/10/30
 */
@Data
public class CollectorPointsExcelVo {
    @ExcelIgnore
    private String dataItemId;
    @ExcelIgnore
    private String sheetName;
    @ExcelIgnore
    private Integer rowIndex;

    @ExcelIgnore
    private String groupId;

    @ExcelProperty("原始数据项标识")
    private String sourceField;
    @ExcelProperty("数据项名称")
    private String fieldName;
    @ExcelProperty("数据项标识")
    private String field;
    @ExcelProperty("数据项单位")
    private String unit;
    @ExcelProperty("数据项分组")
    private String groupName;
    @ExcelProperty("数据项来源")
    private String itemSource;
    @ExcelProperty("数据项类型")
    private String itemType;
}

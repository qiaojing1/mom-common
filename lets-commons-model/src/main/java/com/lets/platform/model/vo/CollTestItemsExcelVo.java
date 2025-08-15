package com.lets.platform.model.collection.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhangweiyan
 * @ClassName CollTestItemsExcelVo
 * @Description 试验项目模板类
 * @Date 2024/1/8 15:37
 **/
@Getter
@Setter
public class CollTestItemsExcelVo {

    @ExcelProperty("试验项目")
    private String name;

    @ExcelProperty("标准")
    private String standardName;

    /**
     * 是 -> Y ；否 -> N
     */
    @ExcelProperty("考察泄漏率")
    private String isCheckLeakageName;

    @ExcelProperty("计量方法")
    private String measurementMethod;

    @ExcelProperty("试验方向")
    private String detectDirection;

    @ExcelProperty("试验顺序")
    private String step;

    @ExcelProperty("备注")
    private String remark;
}

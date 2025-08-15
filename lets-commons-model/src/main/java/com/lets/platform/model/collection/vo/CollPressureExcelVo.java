package com.lets.platform.model.collection.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhangweiyan
 * @ClassName CollPressureExcelVo
 * @Description 压力模板类
 * @Date 2024/1/8 15:37
 **/
@Setter
@Getter
public class CollPressureExcelVo {

    @ExcelProperty("压力(PN)")
    private String name;

    @ExcelProperty("压力(CLASS)")
    private String name2;

    @ExcelProperty("备注")
    private String remark;
}

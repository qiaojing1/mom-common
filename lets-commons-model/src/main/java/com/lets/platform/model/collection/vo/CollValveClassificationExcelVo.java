package com.lets.platform.model.collection.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhangweiyan
 * @ClassName CollValveClassificationExcelVo
 * @Description 阀门分类模板类
 * @Date 2024/1/8 15:37
 **/
@Getter
@Setter
public class CollValveClassificationExcelVo {

    @ExcelProperty("阀门分类")
    private String name;

    @ExcelProperty("标准")
    private String standardName;

    /**
     * @enum ValveScopeEnum
     */
    @ExcelProperty("应用范围")
    private String scopeName;

    @ExcelProperty("阀门类型")
    private String valveTypeName;

    @ExcelProperty("备注")
    private String remark;
}

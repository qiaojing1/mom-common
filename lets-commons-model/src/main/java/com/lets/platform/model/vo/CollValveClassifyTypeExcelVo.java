package com.lets.platform.model.collection.vo;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhangweiyan
 * @ClassName CollValveClassifyTypeExcelVo
 * @Description 阀门分类关联阀门类型模板类
 * @Date 2024/1/8 15:37
 **/
@Getter
@Setter
public class CollValveClassifyTypeExcelVo {

    @ExcelProperty("阀门类型")
    private String name;

    @ExcelProperty("备注")
    private String remark;

    @ExcelIgnore
    private String valveClassifyName;

    @ExcelIgnore
    private Integer lineNumber;

}

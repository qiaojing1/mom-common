package com.lets.platform.model.collection.vo;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhangweiyan
 * @ClassName CollValveTypeExcelVo
 * @Description 阀门类型模板类
 * @Date 2024/1/8 15:37
 **/
@Getter
@Setter
public class CollValveTypeExcelVo {


    @ExcelProperty("阀门类型")
    private String name;

    @ExcelProperty("类型代号")
    private String code;
    @ExcelProperty("结构代号")
    private String structCode;
    @ExcelProperty("备注")
    private String remark;

    @ApiModelProperty("行号")
    @ExcelIgnore
    private String lineNumber;

    @ApiModelProperty("阀门分类 + 标准 + 应用范围")
    @ExcelIgnore
    private String valveClassifyName;

    @ApiModelProperty("行号")
    @ExcelIgnore
    private Integer excelRowIndex;
}

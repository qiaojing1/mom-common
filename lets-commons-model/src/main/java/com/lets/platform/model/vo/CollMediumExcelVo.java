package com.lets.platform.model.collection.vo;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhangweiyan
 * @ClassName CollMediumExcelVo
 * @Description 介质模板类
 * @Date 2024/1/8 15:37
 **/
@Getter
@Setter
public class CollMediumExcelVo {

    @ExcelProperty("介质")
    private String name;

    @ExcelProperty("介质分类")
    private String mediaTypeName;
    @ExcelProperty("泄漏率单位")
    private String leakageUnitName;
    @ExcelIgnore
    private String mediaType;
    @ExcelIgnore
    private String leakageUnitId;
    @ExcelProperty("备注")
    private String remark;
}

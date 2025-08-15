package com.lets.platform.model.collection.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhangweiyan
 * @ClassName CollLeakageLevelExcelVo
 * @Description 泄漏等级模板类
 * @Date 2024/1/8 15:37
 **/
@Getter
@Setter
public class CollLeakageLevelExcelVo {

    @ExcelProperty("泄漏等级")
    private String name;

    @ExcelProperty("标准")
    private String standardName;

    @ExcelProperty("备注")
    private String remark;
}

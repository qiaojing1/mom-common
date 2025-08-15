package com.lets.platform.model.collection.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhangweiyan
 * @ClassName CollLeakageRateUnitExcelVo
 * @Description 泄漏率模板类
 * @Date 2024/1/8 15:37
 **/
@Getter
@Setter
public class CollLeakageRateUnitExcelVo  {

    @ExcelProperty("泄漏率单位")
    private String name;

    @ExcelProperty("备注")
    private String remark;
}

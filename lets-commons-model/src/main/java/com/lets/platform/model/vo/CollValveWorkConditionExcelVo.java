package com.lets.platform.model.collection.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.lets.platform.model.collection.entity.CollectionDetectDict;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhangweiyan
 * @ClassName CollValveWorkConditionExcelVo
 * @Description 工况模板类
 * @Date 2024/1/8 15:37
 **/
@Getter
@Setter
public class CollValveWorkConditionExcelVo {

    @ExcelProperty("工况")
    private String name;

    @ExcelProperty("备注")
    private String remark;
}

package com.lets.platform.model.collection.vo;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.lets.platform.model.collection.entity.CollectionDetectDict;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhangweiyan
 * @ClassName CollAdverseCausesExcelVo
 * @Description 不良原因模板类
 * @Date 2024/1/8 15:37
 **/
@Getter
@Setter
public class CollAdverseCausesExcelVo {

    @ExcelProperty("不良原因")
    private String name;

    @ExcelProperty("备注")
    private String remark;
}

package com.lets.platform.model.collection.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhangweiyan
 * @ClassName CollCaliberExcelVo
 * @Description 口径模板类
 * @Date 2024/1/8 15:37
 **/
@Getter
@Setter
public class CollCaliberExcelVo {

    @ExcelProperty("口径(DN)")
    private String name;

    @ExcelProperty("口径(NPS)")
    private String name2;

    @ExcelProperty("备注")
    private String remark;
}

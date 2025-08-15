package com.lets.platform.model.collection.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhangweiyan
 * @ClassName CollCaliberExcelVo
 * @Description 材质模板类
 * @Date 2024/1/8 15:37
 **/
@Getter
@Setter
public class CollMaterialQualityExcelVo  {

    @ExcelProperty("材质")
    private String name;

    @ExcelProperty("标准")
    private String standardName;

    @ExcelProperty("材质分组")
    private String valveMaterialGroupName;

    @ExcelProperty("备注")
    private String remark;
}

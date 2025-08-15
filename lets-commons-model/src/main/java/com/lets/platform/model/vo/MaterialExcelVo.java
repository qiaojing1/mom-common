package com.lets.platform.model.collection.vo;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableField;
import com.lets.platform.model.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MaterialExcelVo extends BaseEntity {

    @ExcelIgnore
    @TableField(exist = false)
    private Integer rowIndex;


    @ExcelProperty("代号")
    private String code;

    @ExcelProperty("材质")
    private String value;

    @ExcelProperty("备注")
    private String remark;


}

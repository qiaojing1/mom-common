package com.lets.platform.model.collection.vo;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableField;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PressureLevelExcelVo extends BaseEntity {

    @ExcelIgnore
    @TableField(exist = false)
    private Integer rowIndex;


    @ExcelProperty("代号")
    private String code;

    @ExcelProperty("压力等级")
    private String value;

    @ExcelProperty("单位")
    private String unit;

    @ExcelProperty("备注")
    private String remark;


}

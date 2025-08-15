/*
 * csy
 */

package com.lets.platform.model.mes.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;

import java.math.BigDecimal;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 公差数据库
 * </p>
 *
 * @author csy
 * @since 2025-06-03
 */
@Getter
@Setter
@TableName("mes_tolerance_base")
@ApiModel(value = "MesToleranceBase对象", description = "公差数据库")
public class MesToleranceBase extends BaseEntity {

    @TableField(exist = false)
    @ExcelIgnore
    private String name;

    @TableField(exist = false)
    @ExcelIgnore
    private Integer rowIndex;

    @ApiModelProperty("尺寸类型")
    @TableField("size_type")
    @ExcelIgnore
    private String sizeType;
    @TableField(exist = false)
    @ExcelProperty("尺寸类型")
    private String sizeTypeName;

    @ApiModelProperty("公差等级")
    @TableField("level")
    @ExcelIgnore
    private String level;
    @TableField(exist = false)
    @ExcelProperty("公差等级")
    private String levelName;

    @ApiModelProperty("尺寸下限")
    @TableField("size_min")
    @ExcelIgnore
    private BigDecimal sizeMin;
    @ExcelProperty("尺寸下限")
    @TableField(exist = false)
    private String sizeMinStr;

    @ExcelIgnore
    @ApiModelProperty("尺寸上限")
    @TableField("size_max")
    private BigDecimal sizeMax;
    @ExcelProperty("尺寸上限")
    @TableField(exist = false)
    private String sizeMaxStr;

    @ExcelIgnore
    @ApiModelProperty("公差下限")
    @TableField("tolerance_min")
    private BigDecimal toleranceMin;
    @ExcelProperty("公差下限")
    @TableField(exist = false)
    private String toleranceMinStr;

    @ExcelIgnore
    @ApiModelProperty("公差上限")
    @TableField("tolerance_max")
    private BigDecimal toleranceMax;
    @ExcelProperty("公差上限")
    @TableField(exist = false)
    private String toleranceMaxStr;

    @TableField("remark")
    @ExcelProperty("备注")
    private String remark;


    public boolean minEqualsMax() {
        return this.sizeMin.compareTo(this.sizeMax) == 0;
    }
}

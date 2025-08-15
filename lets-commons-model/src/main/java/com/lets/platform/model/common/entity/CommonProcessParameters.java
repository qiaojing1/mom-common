package com.lets.platform.model.common.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 工艺参数
 * </p>
 *
 * @author zhangweiyan
 * @since 2023-11-09
 */
@Getter
@Setter
@TableName("common_process_parameters")
@ApiModel(value = "CommonProcessParameters对象", description = "工艺参数")
public class CommonProcessParameters extends BaseEntity {

    @ApiModelProperty("参数编码")
    @TableField("code")
    @ExcelProperty("参数编码")
    private String code;

    @ApiModelProperty("参数名称")
    @TableField("name")
    @ExcelProperty("参数名称")
    private String name;

    @ApiModelProperty("单位")
    @TableField("unit")
    @ExcelProperty("单位")
    private String unit;

    @ApiModelProperty("是否启用 0：未启用；1：已启用")
    @TableField("enable")
    @ExcelIgnore
    private Integer enable;

    @TableField(exist = false)
    @ExcelIgnore
    private String enableName;

    @ApiModelProperty("描述")
    @TableField("description")
    @ExcelProperty("备注")
    private String description;

    @ExcelIgnore
    @TableField(exist = false)
    @ApiModelProperty(hidden = true)
    private Integer index;
}

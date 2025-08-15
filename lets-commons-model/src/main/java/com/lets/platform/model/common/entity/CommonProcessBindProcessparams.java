package com.lets.platform.model.common.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * <p>
 * 工序维护-工艺参数
 * </p>
 *
 * @author csy
 * @since 2023-11-14
 */
@Getter
@Setter
@TableName("common_process_bind_processparams")
@ApiModel(value = "CommonProcessBindProcessparams对象", description = "工序维护-工艺参数")
public class CommonProcessBindProcessparams extends BaseEntity {

    @ApiModelProperty("工序id")
    @TableField("process_id")
    @ExcelIgnore
    private String processId;
    @TableField(exist = false)
    @ExcelProperty("工序编码")
    private String processCode;

    @ApiModelProperty("工艺参数id")
    @TableField("params_id")
    @ExcelIgnore
    private String paramsId;
    @TableField(exist = false)
    @ExcelProperty("工艺参数编码")
    private String paramCode;
    @TableField(exist = false)
    @ExcelIgnore
    private String name;

    @ApiModelProperty("数据项id")
    @TableField("data_item_id")
    @ExcelIgnore
    private String dataItemId;
    @ExcelProperty("数据项标识")
    @TableField(exist = false)
    private String dataItemName;

    @ApiModelProperty("标准值")
    @TableField("standard_value")
    @ExcelIgnore
    private BigDecimal standardValue;
    @ExcelProperty("标准值")
    @TableField(exist = false)
    private String standardValueStr;

    @ExcelIgnore
    @ApiModelProperty("最大值")
    @TableField("max_value")
    private BigDecimal maxValue;
    @TableField(exist = false)
    @ExcelProperty("最大值")
    private String maxValueStr;

    @ExcelIgnore
    @ApiModelProperty("最小值")
    @TableField("min_value")
    private BigDecimal minValue;
    @TableField(exist = false)
    @ExcelProperty("最小值")
    private String minValueStr;

    @ExcelIgnore
    @TableField(exist = false)
    private Integer index;

    @ExcelIgnore
    @TableField(exist = false)
    private String processName;

    @ExcelIgnore
    @TableField(exist = false)
    private String itemField;
    @ExcelIgnore
    @TableField(exist = false)
    private String itemSourceField;
}

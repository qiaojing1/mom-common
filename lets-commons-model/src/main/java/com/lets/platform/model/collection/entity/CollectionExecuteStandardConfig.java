package com.lets.platform.model.collection.entity;

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
 * 执行标准配置
 * </p>
 *
 * @author csy
 * @since 2024-04-07
 */
@Getter
@Setter
@TableName("collection_execute_standard_config")
@ApiModel(value = "CollectionExecuteStandardConfig对象", description = "执行标准配置")
public class CollectionExecuteStandardConfig extends BaseEntity {

    @ExcelIgnore
    @TableField(exist = false)
    private Integer rowIndex;

    @ExcelIgnore
    @TableField(exist = false)
    private String code;


    @ApiModelProperty("执行标准")
    @TableField("execute_standard")
    @ExcelProperty("执行标准")
    private String executeStandard;

    @ApiModelProperty("压力标准")
    @TableField("pressure_standard")
    @ExcelIgnore
    private String pressureStandard;
    @TableField(exist = false)
    @ExcelProperty("压力标准")
    private String pressureStandardName;

    @ApiModelProperty("常规试验标准")
    @TableField("routine_standard")
    @ExcelIgnore
    private String routineStandard;
    @TableField(exist = false)
    @ExcelProperty("常规试验标准")
    private String routineStandardName;

    @ApiModelProperty("低温试验标准")
    @TableField("low_temp_standard")
    @ExcelIgnore
    private String lowTempStandard;
    @TableField(exist = false)
    @ExcelProperty("低温试验标准")
    private String lowTempStandardName;

    @ApiModelProperty("洁净试验标准")
    @TableField("clean_standard")
    @ExcelIgnore
    private String cleanStandard;
    @TableField(exist = false)
    @ExcelProperty("洁净试验标准")
    private String cleanStandardName;

    @ApiModelProperty("逸散性试验标准")
    @TableField("escape_standard")
    @ExcelIgnore
    private String escapeStandard;
    @TableField(exist = false)
    @ExcelProperty("逸散性试验标准")
    private String escapeStandardName;

    @ApiModelProperty("动作试验标准")
    @TableField("movement_standard")
    @ExcelIgnore
    private String movementStandard;
    @TableField(exist = false)
    @ExcelProperty("动作试验标准")
    private String movementStandardName;

    @ApiModelProperty("压力试验标准")
    @TableField("pressure_test_standard")
    @ExcelIgnore
    private String pressureTestStandard;
    @TableField(exist = false)
    @ExcelProperty("压力试验标准")
    private String pressureTestStandardName;

    @ApiModelProperty("寿命试验标准")
    @TableField("life_standard")
    @ExcelIgnore
    private String lifeStandard;
    @TableField(exist = false)
    @ExcelProperty("寿命试验标准")
    private String lifeStandardName;

    @ApiModelProperty("流阻试验标准")
    @TableField("flow_standard")
    @ExcelIgnore
    private String flowStandard;
    @TableField(exist = false)
    @ExcelProperty("流阻试验标准")
    private String flowStandardName;

    @ApiModelProperty("热水试验标准")
    @TableField("hot_standard")
    @ExcelIgnore
    private String hotStandard;
    @TableField(exist = false)
    @ExcelProperty("热水试验标准")
    private String hotStandardName;

    @ApiModelProperty("默认试验类型")
    @TableField("default_type")
    @ExcelIgnore
    private String defaultType;
    @ExcelProperty("默认试验类型")
    @TableField(exist = false)
    private String defaultTypeName;

    @ApiModelProperty("备注")
    @TableField("remark")
    @ExcelProperty("备注")
    private String remark;
}

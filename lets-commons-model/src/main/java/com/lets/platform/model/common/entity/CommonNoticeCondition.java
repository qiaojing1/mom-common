package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 预警-条件明细表
 * </p>
 *
 * @author csy
 * @since 2023-11-15
 */
@Getter
@Setter
@TableName("common_notice_condition")
@ApiModel(value = "CommonNoticeCondition对象", description = "预警-条件明细表")
public class CommonNoticeCondition extends BaseEntity {

    @ApiModelProperty("规则主键")
    @TableField("rule_id")
    private String ruleId;

    @ApiModelProperty("参数主键")
    @TableField("parameter_id")
    private String parameterId;
    @TableField(exist = false)
    @ApiModelProperty("参数名称")
    private String paramName;
    @TableField(exist = false)
    private String sqlParameter;
    @TableField(exist = false)
    private List<Map<String,Object>> resultMap;

    @ApiModelProperty("条件 1:大于2:等于3:大于等于4:小于5:小于等于")
    @TableField("condition_id")
    private String conditionId;
    @TableField(exist = false)
    private String conditionName;

    @ApiModelProperty("类型[1固定值2阈值参数]")
    @TableField("type")
    private String type;
    @TableField(exist = false)
    @ApiModelProperty("类型名称")
    private String typeName;

    @ApiModelProperty("固定值参数/参数id 由类型决定")
    @TableField("variable")
    private String variable;
    @TableField(exist = false)
    private String variableSql;
    @TableField(exist = false)
    private List<Map<String,Object>> variableResult;
    @TableField(exist = false)
    @ApiModelProperty("判断参数名称 类型为固定值时为null")
    private String variableName;

    //阈值
    @TableField(exist = false)
    private String threshold;

    @TableField(exist = false)
    private String menuName;
}

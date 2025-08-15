package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 计划运算定时任务
 * </p>
 *
 * @author FZY
 * @since 2023-12-20
 */
@Getter
@Setter
@TableName("psi_plan_scheduled_task")
public class PsiPlanScheduledTask extends BaseEntity {

    @ApiModelProperty("编码")
    @TableField("code")
    private String code;

    @ApiModelProperty("MRP方案ID")
    @TableField("program_id")
    private String programId;

    @ApiModelProperty("MRP方案名称")
    @TableField(exist = false)
    private String programName;

    @ApiModelProperty("起始日期")
    @TableField(exist = false)
    private LocalDate startDate;

    @ApiModelProperty("截止日期")
    @TableField(exist = false)
    private LocalDate endDate;

    @ApiModelProperty("MPS计划运算")
    @TableField("mps")
    private Integer mps;

    @ApiModelProperty("MRP计划运算")
    @TableField("mrp")
    private Integer mrp;

    @ApiModelProperty("仅运算未运算的需求单据")
    @TableField("without_calculated_order")
    private Integer withoutCalculatedOrder;

    @ApiModelProperty("计算周期[1:每日;2:每周;3:每月]")
    @TableField("calculation_rate")
    private Integer calculationRate;

    @ApiModelProperty("计算周期")
    @TableField(exist = false)
    private String calculationRateName;

    @ApiModelProperty("计算周期值")
    @TableField("calculation_rate_values")
    private String calculationRateValues;

    @ApiModelProperty("计算周期时间")
    @TableField("calculation_rate_times")
    private String calculationRateTimes;

    @ApiModelProperty("计算周期值")
    @TableField(exist = false)
    private List<String> calculationRateValueList;

    @ApiModelProperty("计算周期时间")
    @TableField(exist = false)
    private List<String> calculationRateTimeList;

    @ApiModelProperty("corn表达式")
    @TableField("schedule_conf")
    private String scheduleConf;

    @ApiModelProperty("下次计算时间")
    @TableField("next_time")
    private LocalDateTime nextTime;

    @ApiModelProperty("xxlJob任务ID")
    @TableField("xxl_job_task_id")
    private Integer xxlJobTaskId;

    @ApiModelProperty("启用状态[0:停用;1:启用]")
    @TableField("enable")
    private Integer enable;

    @ApiModelProperty("启用状态")
    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;
}

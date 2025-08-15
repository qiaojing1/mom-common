package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 计划运算任务
 * </p>
 *
 * @author FZY
 * @since 2025-02-08
 */
@Getter
@Setter
@TableName("psi_plan_calculation_task")
@ApiModel(value = "PsiPlanCalculationTask对象", description = "计划运算任务")
public class PsiPlanCalculationTask extends BaseEntity {

    @ApiModelProperty("编码")
    @TableField("code")
    private String code;

    @ApiModelProperty("计划方案ID")
    @TableField("program_id")
    private String programId;

    @ApiModelProperty("计划方案名称")
    @TableField(exist = false)
    private String programName;

    @ApiModelProperty("MPS计划运算")
    @TableField("mps")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Integer mps;

    @ApiModelProperty("MRP计划运算")
    @TableField("mrp")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Integer mrp;

    @ApiModelProperty("仅运算未运算的需求单据")
    @TableField("without_calculated_order")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Integer withoutCalculatedOrder;

    @ApiModelProperty("独立选单运算")
    @TableField("independent_mode")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Integer independentMode;

    @ApiModelProperty("计算方式[0:直接计算;1:指定时间计算]")
    @TableField("type")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Integer type;

    @ApiModelProperty("计算时间")
    @TableField("task_time")
    private LocalDateTime taskTime;

    @ApiModelProperty("启动时间")
    @TableField("start_time")
    private LocalDateTime startTime;

    @ApiModelProperty("结束时间")
    @TableField("end_time")
    private LocalDateTime endTime;

    @ApiModelProperty("预计量开始日期")
    @TableField("order_start_time")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime orderStartTime;

    @ApiModelProperty("截止日期")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime orderEndTime;

    @ApiModelProperty("定时任务ID")
    @TableField("scheduled_task_id")
    private String scheduledTaskId;

    @ApiModelProperty("xxlJob任务ID")
    @TableField("xxl_job_task_id")
    private Integer xxlJobTaskId;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("计算状态")
    @TableField("status")
    private Integer status;

    @TableField(exist = false)
    private String statusName;

    @TableField(exist = false)
    private List<PsiPlanCalculationTaskDetail> detailList;

    @TableField(exist = false)
    private List<PsiPlanCalculationTaskMessage> messageList;
}

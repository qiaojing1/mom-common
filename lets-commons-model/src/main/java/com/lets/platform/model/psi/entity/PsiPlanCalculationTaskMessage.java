package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * <p>
 * 任务消息表
 * </p>
 *
 * @author FZY
 * @since 2025-02-11
 */
@Getter
@Setter
@TableName("psi_plan_calculation_task_message")
@ApiModel(value = "PsiPlanCalculationTaskMessage对象", description = "任务消息表")
public class PsiPlanCalculationTaskMessage extends BaseEntity {

    @TableField("task_id")
    private String taskId;

    @ApiModelProperty("类型")
    @TableField("type")
    private Integer type;

    @TableField(exist = false)
    private String typeName;

    @ApiModelProperty("状态[NORMAL:正常;SUCCESS:成功;WARNING:警告;ERROR:错误]")
    @TableField("status")
    private String status;

    @ApiModelProperty("排序")
    @TableField("sort")
    private Integer sort;

    @ApiModelProperty("内容")
    @TableField("message")
    private String message;

    @ApiModelProperty("时间")
    @TableField("time")
    private LocalDateTime time;

    @ApiModelProperty("进度百分比")
    @TableField("percent")
    private Integer percent;

    @ApiModelProperty("跳转单据地址")
    @TableField("url")
    private String url;
}

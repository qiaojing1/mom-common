package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 排程算法模型
 * </p>
 *
 * @author FZY
 * @since 2024-09-19
 */
@Getter
@Setter
@TableName("common_scheduling_program")
@ApiModel(value = "CommonSchedulingProgram对象", description = "排程算法模型")
public class CommonSchedulingProgram extends BaseEntity {

    @ApiModelProperty("编码")
    @TableField("code")
    private String code;

    @ApiModelProperty("名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("排程方法")
    @TableField("method")
    private String method;

    @ApiModelProperty("是否默认[N否Y是]")
    @TableField("is_default")
    private String isDefault;

    @TableField(exist = false)
    private String isDefaultName;

    @ApiModelProperty("是否预设[N否Y是]")
    @TableField("is_preset")
    private String isPreset;

    @TableField(exist = false)
    private String isPresetName;

    @ApiModelProperty("是否启用[0停用1启用]")
    @TableField("enable")
    private Integer enable;

    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("考虑工序迭代")
    @TableField("consider_process_iteration")
    private String considerProcessIteration;

    @ApiModelProperty("考虑排队时间")
    @TableField("consider_queue_time")
    private String considerQueueTime;

    @ApiModelProperty("考虑等待时间")
    @TableField("consider_waiting_time")
    private String considerWaitingTime;

    @ApiModelProperty("考虑转移时间")
    @TableField("consider_transfer_time")
    private String considerTransferTime;

    @ApiModelProperty("重排已确认计划")
    @TableField("reschedule_confirmed_plans")
    private String rescheduleConfirmedPlans;

    @ApiModelProperty("重排已下达计划")
    @TableField("reschedule_released_plans")
    private String rescheduleReleasedPlans;

    @ApiModelProperty("倒排时间在过去时自动按当前日期正排")
    @TableField("auto_forward_schedule_if_in_past")
    private String autoForwardScheduleIfInPast;
}

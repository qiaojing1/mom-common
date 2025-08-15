package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * 派工-明细-时间记录
 * @author DING WEI
 * @since 2024-01-09
 */
@Getter
@Setter
@TableName("mes_dispatch_detail_time_record")
@ApiModel(value = "MesDispatchDetailTimeRecord对象", description = "派工-明细-时间记录")
public class MesDispatchDetailTimeRecord extends BaseEntity {

    @ApiModelProperty("工序任务主键")
    @TableField("dispatch_id")
    private String dispatchId;

    @ApiModelProperty("生产工单主键")
    @TableField("produce_order_id")
    private String produceOrderId;

    @ApiModelProperty("生产工单明细主键")
    @TableField("produce_detail_id")
    private String produceDetailId;

    @ApiModelProperty("工序计划主键")
    @TableField("process_plan_id")
    private String processPlanId;

    @ApiModelProperty("生产计划明细主键")
    @TableField("process_plan_detail_id")
    private String processPlanDetailId;

    @ApiModelProperty("开始时间")
    @TableField("start_time")
    private LocalDateTime startTime;

    @ApiModelProperty("开始人")
    @TableField("start_user")
    private String startUser;

    @ApiModelProperty("开始人名称")
    @TableField("start_user_name")
    private String startUserName;

    @ApiModelProperty("结束时间")
    @TableField("end_time")
    private LocalDateTime endTime;

    @ApiModelProperty("结束人")
    @TableField("end_user")
    private String endUser;

    @ApiModelProperty("结束人名称")
    @TableField("end_user_name")
    private String endUserName;

    @ApiModelProperty("状态(1开工，2暂停，3完工)")
    @TableField("status")
    private Integer status;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private Integer index;
}

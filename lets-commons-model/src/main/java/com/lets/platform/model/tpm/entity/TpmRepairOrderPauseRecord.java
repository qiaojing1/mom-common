package com.lets.platform.model.tpm.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 故障维修工单-暂停记录
 * @author DING WEI
 * @since 2024-11-20
 */
@Getter
@Setter
@TableName("tpm_repair_order_pause_record")
@ApiModel(value = "TpmRepairOrderPauseRecord对象", description = "故障维修工单-暂停记录")
public class TpmRepairOrderPauseRecord extends BaseEntity {

    @ApiModelProperty("工单主键")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("报修工单主键")
    @TableField("call_repair_id")
    private String callRepairId;

    @ApiModelProperty("暂停开始时间")
    @TableField("start_time")
    private LocalDateTime startTime;

    @ApiModelProperty("暂停结束时间")
    @TableField("end_time")
    private LocalDateTime endTime;

    @ApiModelProperty("暂停时长（秒）")
    @TableField("pause_duration")
    private BigDecimal pauseDuration;

    @ApiModelProperty("暂停原因")
    @TableField("reason")
    private String reason;
}

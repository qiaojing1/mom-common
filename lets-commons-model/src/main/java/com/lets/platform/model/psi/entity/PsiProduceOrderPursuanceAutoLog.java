package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 生产工单-自动执行-日志
 * @author DING WEI
 * @since 2024-12-24
 */
@Getter
@Setter
@TableName("psi_produce_order_pursuance_auto_log")
@ApiModel(value = "PsiProduceOrderPursuanceAutoLog对象", description = "生产工单-自动执行-日志")
public class PsiProduceOrderPursuanceAutoLog extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("生产工单-明细主键")
    @TableField("produce_detail_id")
    private String produceDetailId;

    @ApiModelProperty("工位机主键")
    @TableField("hmi_id")
    private String hmiId;

    @ApiModelProperty("类型[1:生产配料、2:半成品生产、3:生产执行-开工报工、3-1:扫码上料、3-2:扫码执行、3-3:扫码装箱]")
    @TableField("type")
    private String type;

    @ApiModelProperty("扫码点位")
    @TableField("item_key")
    private String itemKey;

    @ApiModelProperty("扫码内容")
    @TableField("item_value")
    private String itemValue;

    @ApiModelProperty("扫码时间")
    @TableField("scan_time")
    private LocalDateTime scanTime;

    @ApiModelProperty("是否成功[0失败1成功]")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("采集器主键")
    @TableField("collector_id")
    private String collectorId;

    @ApiModelProperty("采集器编码")
    @TableField("collector_code")
    private String collectorCode;

    @ApiModelProperty("设备主键")
    @TableField("device_id")
    private String deviceId;

    @ApiModelProperty("设备编码")
    @TableField("device_code")
    private String deviceCode;

    @ApiModelProperty("设备名称")
    @TableField("device_name")
    private String deviceName;

    @ApiModelProperty("扫码上料的扫码内容")
    @TableField(exist = false)
    private String scanCode;

}

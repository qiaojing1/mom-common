package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 自动线建-上料缓存区
 * @author DING WEI
 * @since 2024-07-04
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("mes_auto_line_modeling_feeding_buffer")
@ApiModel(value = "AutoLineModelingFeedingBuffer对象", description = "自动线建-上料缓存区")
public class AutoLineModelingFeedingBuffer extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * @see com.lets.platform.model.mes.enums.FeedingBufferTypeEnum
     */
    @ApiModelProperty("类型[1缓存区,2输送区]")
    @TableField("type")
    private String type;

    @ApiModelProperty("码")
    @TableField("code")
    private String code;

    @ApiModelProperty("自动线建模主键")
    @TableField("auto_line_id")
    private String autoLineId;

    @ApiModelProperty("自动线建模编号")
    @TableField("auto_line_code")
    private String autoLineCode;

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

    @ApiModelProperty("扫码时间")
    @TableField("scan_time")
    private LocalDateTime scanTime;
    @ApiModelProperty("扫码时间(毫秒)")
    @TableField(exist = false)
    private Long scanTimeAsMillis;

    @ApiModelProperty("触发点位")
    @TableField("item_key")
    private String itemKey;
    @ApiModelProperty("触发点位值")
    @TableField("item_value")
    private String itemValue;

    @ApiModelProperty("更新时间(毫秒)")
    @TableField("update_time_millis")
    private Long updateTimeAsMillis;

    @ApiModelProperty("工艺路线-工序-主键")
    @TableField("route_process_id")
    private String routeProcessId;
    @ApiModelProperty("生产作业单明细主键")
    @TableField("job_order_detail_id")
    private String jobOrderDetailId;
}

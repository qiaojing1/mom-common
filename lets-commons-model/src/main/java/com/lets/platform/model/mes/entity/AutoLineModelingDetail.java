package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 自动线建模-明细
 * @author DING WEI
 * @since 2024-07-02
 */
@Getter
@Setter
@TableName("mes_auto_line_modeling_detail")
@ApiModel(value = "AutoLineModelingDetail对象", description = "自动线建模-明细")
public class AutoLineModelingDetail extends BaseEntity {

    @ApiModelProperty("单据主键")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("设备主键")
    @TableField("device_id")
    private String deviceId;
    @ApiModelProperty("设备编码")
    @TableField("device_code")
    private String deviceCode;
    @ApiModelProperty("设备名称")
    @TableField("device_name")
    private String deviceName;
    @ApiModelProperty("设备类型主键")
    @TableField(exist = false)
    private String deviceTypeId;
    @ApiModelProperty("设备类型名称")
    @TableField(exist = false)
    private String deviceTypeName;
    @ApiModelProperty("设备型号主键")
    @TableField(exist = false)
    private String deviceModelId;
    @ApiModelProperty("设备型号名称")
    @TableField(exist = false)
    private String deviceModelName;

    @ApiModelProperty("设备上料完成数据项主键")
    @TableField("feeding_finish_item_id")
    private String feedingFinishItemId;
    @ApiModelProperty("设备上料完成数据项key")
    @TableField("feeding_finish_item_key")
    private String feedingFinishItemKey;
    @ApiModelProperty("设备上料完成数据项名称")
    @TableField("feeding_finish_item_name")
    private String feedingFinishItemName;

    @ApiModelProperty("位置顺序")
    @TableField("position_sequence")
    private Integer positionSequence;

    @ApiModelProperty("工艺顺序")
    @TableField("process_sequence")
    private Integer processSequence;

    @ApiModelProperty("批次号")
    @TableField(exist = false)
    private String batchNumber;
}

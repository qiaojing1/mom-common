package com.lets.platform.model.collection.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 设备数据项实时点位
 * @author DING WEI
 * @since 2023-11-27
 */
@Data
@TableName("coll_device_item_realtime")
@ApiModel(value = "CollDeviceItemRealtime对象", description = "设备数据项实时点位")
public class CollDeviceItemRealtime extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("设备主键")
    @TableField("device_id")
    private String deviceId;

    @ApiModelProperty("数据项key")
    @TableField("item_key")
    private String itemKey;

    @ApiModelProperty("数据项value")
    @TableField("item_value")
    private String itemValue;

    @ApiModelProperty("采集时间")
    @TableField("collection_time")
    private LocalDateTime collectionTime;
    @TableField(exist = false)
    private String collectionTimeFormat;

    @ApiModelProperty("采集器主键")
    @TableField(exist = false)
    private String collectionId;
    @TableField(exist = false)
    private String status;
    @TableField(exist = false)
    private String currentValue;
    @TableField(exist = false)
    private String oldValue;
    //产品编码
    @TableField(exist = false)
    private String productCode;
    //班制id
    @TableField(exist = false)
    private String shiftSystemId;
    //班制名称
    @TableField(exist = false)
    private String shiftSystemName;
    //班制编码
    @TableField(exist = false)
    private String shiftSystemCode;
    //班次id
    @TableField(exist = false)
    private String shiftId;
    //班次名称
    @TableField(exist = false)
    private String shiftName;
    //班次code
    @TableField(exist = false)
    private String shiftCode;
    //班次匹配时间段开始
    @TableField(exist = false)
    private String shiftStartTime;
    //班次匹配时间段结束
    @TableField(exist = false)
    private String shiftEndTime;
    //是否计划外
    @TableField(exist = false)
    private Integer unplanned;
    @TableField(exist = false)
    private String factoryModeId;
    @TableField(exist = false)
    private Integer enableYieldStat;
}

package com.lets.platform.model.collection.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 设备通道绑定记录表
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-01-31
 */
@Getter
@Setter
@TableName("coll_device_channels")
@ApiModel(value = "CollDeviceChannels对象", description = "设备通道绑定记录表")
public class CollDeviceChannels extends BaseEntity {

    @ApiModelProperty("设备id")
    @TableField("device_id")
    private String deviceId;

    @TableField("device_code")
    @ApiModelProperty(hidden = true)
    private String deviceCode;

    @TableField("tester_nm")
    private String testerNm;

    @TableField("tester_id")
    private String testerId;

    @ApiModelProperty("通道索引")
    @TableField("channel_idx")
    private String channelIdx;

    @ApiModelProperty("通道id")
    @TableField("channel_id")
    private String channelId;

    @ApiModelProperty("通道名称")
    @TableField("channel_nm")
    private String channelNm;

    @ApiModelProperty("压力值精度位数")
    @TableField("pressure_precision")
    private String pressurePrecision;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;
}

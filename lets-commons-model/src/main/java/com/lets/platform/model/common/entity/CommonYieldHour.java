package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * <p>
 * 产量小时表
 * </p>
 *
 * @author qiao jing
 * @since 2024-06-26
 */
@Getter
@Setter
@TableName("common_yield_hour")
@ApiModel(value = "CommonYieldHour对象", description = "产量小时表")
public class CommonYieldHour extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("日期")
    @TableField("date")
    private String date;
    @TableField(exist = false)
    private LocalDate localDate;

    @ApiModelProperty("小时")
    @TableField("hour")
    private Integer hour;

    @ApiModelProperty("产量")
    @TableField("yield")
    private String yield;

    @ApiModelProperty("采集器id")
    @TableField("collection_id")
    private String collectionId;

    @ApiModelProperty("设备id")
    @TableField("device_id")
    private String deviceId;

    //产品编码
    @ApiModelProperty("设备id")
    @TableField("product_code")
    private String productCode;
    //班制id
    @ApiModelProperty("班制id")
    @TableField("shift_system_id")
    private String shiftSystemId;
    //班次id
    @ApiModelProperty("班次id")
    @TableField("shift_id")
    private String shiftId;
    //班次名称
    @ApiModelProperty("班次名称")
    @TableField("shift_name")
    private String shiftName;
    //班次code
    @ApiModelProperty("班次名称")
    @TableField("shift_code")
    private String shiftCode;
    //班次匹配时间段开始
    @ApiModelProperty("班次匹配时间段开始")
    @TableField("shift_start_time")
    private String shiftStartTime;
    //班次匹配时间段结束
    @ApiModelProperty("班次匹配时间段结束")
    @TableField("shift_end_time")
    private String shiftEndTime;
    //是否计划外
    @ApiModelProperty("是否计划外")
    @TableField("unplanned")
    private Integer unplanned;

    @ApiModelProperty("产品实际开始时间,结束时间")
    @TableField("product_time")
    private String productTime;

    @ApiModelProperty("时长")
    @TableField("run_time")
    private Long runTime;

    @TableField(exist = false)
    private String groupFormat;

    @TableField(exist = false)
    private LocalDateTime startLocalTime;
    @TableField(exist = false)
    private LocalDateTime endLocalTime;
}

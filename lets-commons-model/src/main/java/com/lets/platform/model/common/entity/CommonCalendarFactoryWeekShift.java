package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * 行事历-生产单元配置
 * @author DING WEI
 * @since 2025-04-16
 */
@Getter
@Setter
@TableName("common_calendar_factory_week_shift")
@ApiModel(value = "CommonCalendarFactoryWeekShift对象", description = "行事历-生产单元配置")
public class CommonCalendarFactoryWeekShift extends BaseEntity {

    @ApiModelProperty("生产单元主键")
    @TableField("factory_mode_id")
    private String factoryModeId;

    @ApiModelProperty("年份")
    @TableField("`year`")
    private Integer year;

    @ApiModelProperty("周x")
    @TableField("work_day")
    private Integer workDay;

    @ApiModelProperty("班制主键")
    @TableField("shift_id")
    private String shiftId;
    @ApiModelProperty("班制名称")
    @TableField("shift_name")
    private String shiftName;
    @ApiModelProperty("总时长（小时）")
    @TableField(exist = false)
    private BigDecimal shiftTotalHour;

    @TableField(exist = false)
    private List<CommonShiftTimes> timesList;

}

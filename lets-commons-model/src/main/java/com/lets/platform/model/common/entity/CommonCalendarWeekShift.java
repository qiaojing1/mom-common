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

/**
 * <p>
 * 行事历周班次配置
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-09-25
 */
@Getter
@Setter
@TableName("common_calendar_week_shift")
@ApiModel(value = "CommonCalendarWeekShift对象", description = "行事历周班次配置")
public class CommonCalendarWeekShift extends BaseEntity {

    @ApiModelProperty("周x")
    @TableField("work_day")
    private String workDay;

    @ApiModelProperty("年份")
    @TableField("year")
    private String year;

    @ApiModelProperty("班制id")
    @TableField("shift_id")
    private String shiftId;

    @ApiModelProperty("班制名称")
    @TableField("shift_name")
    private String shiftName;
}

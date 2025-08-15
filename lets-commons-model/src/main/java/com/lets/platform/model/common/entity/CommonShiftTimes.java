package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalTime;

/**
 * <p>
 * 班组-时间
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-07-01
 */
@Getter
@Setter
@TableName("common_shift_times")
@ApiModel(value = "CommonShiftTimes对象", description = "班组-时间")
public class CommonShiftTimes extends BaseEntity {

    @ApiModelProperty("班次id")
    @TableField("shift_id")
    private String shiftId;

    @ApiModelProperty("上班时间")
    @TableField("start_time")
    private String startTime;
    @TableField(exist = false)
    private LocalTime startTimeAsLt;

    @ApiModelProperty("下班时间")
    @TableField("end_time")
    private String endTime;
    @TableField(exist = false)
    private LocalTime endTimeAsLt;

    @ApiModelProperty("时长")
    @TableField("times")
    private BigDecimal times;

    @TableField(exist = false)
    private String shiftName;
    @TableField(exist = false)
    private String shiftCode;
}

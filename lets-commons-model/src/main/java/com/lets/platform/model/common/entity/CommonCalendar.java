package com.lets.platform.model.common.entity;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.enums.RandomReInspectCycleEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/**
 * <p>
 * 行事历
 * </p>
 *
 * @author csy
 * @since 2024-06-17
 */
@Getter
@Setter
@TableName("common_calendar")
@ApiModel(value = "CommonCalendar对象", description = "行事历")
public class CommonCalendar extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    public CommonCalendar() {
    }

    public CommonCalendar(String tenancyId,LocalDate date, Integer year, Integer quarter, Integer month, Integer day, Integer week, String workDay, String holidayName, String overtime) {
        this.setTenancyId(tenancyId);
        this.date = date;
        this.year = year;
        this.quarter = quarter;
        this.month = month;
        this.day = day;
        this.week = week;
        this.workDay = workDay;
        this.holidayName = holidayName;
        this.overtime = overtime;
    }

    @ApiModelProperty("日期")
    @TableField("date")
    private LocalDate date;

    @ApiModelProperty("年")
    @TableField("year")
    private Integer year;

    @ApiModelProperty("季度")
    @TableField("quarter")
    private Integer quarter;

    @ApiModelProperty("月")
    @TableField("month")
    private Integer month;

    @ApiModelProperty("日")
    @TableField("day")
    private Integer day;

    @ApiModelProperty("周")
    @TableField("week")
    private Integer week;

    @ApiModelProperty("是否工作日[Y是N否]")
    @TableField("work_day")
    private String workDay;

    @ApiModelProperty("是否节假日")
    @TableField("holiday_name")
    private String holidayName;

    @ApiModelProperty("是否有改动")
    @TableField("is_modify")
    private String isModify;

    @ApiModelProperty("是否为加班日")
    @TableField("overtime")
    private String overtime;

    @TableField(exist = false)
    private String shiftId;
    @TableField(exist = false)
    private String shiftName;
    @TableField(exist = false)
    private BigDecimal shiftTotal;
    @TableField(exist = false)
    private List<CommonShiftTimes> shiftTimes;
    @TableField(exist = false)
    private String factoryModeId;

    public String getSignByCycle(String inspectCycle) {
        if (RandomReInspectCycleEnum.WEEK.getValue().equals(inspectCycle)) {
            return String.valueOf(week);
        } else if (RandomReInspectCycleEnum.MONTH.getValue().equals(inspectCycle)) {
            return String.valueOf(day);
        } else if (RandomReInspectCycleEnum.YEAR.getValue().equals(inspectCycle)) {
            return StrUtil.fillBefore(String.valueOf(month), '0', 2) + GlobalConstant.MIDDLE_LINE + StrUtil.fillBefore(String.valueOf(day), '0', 2);
        }
        return GlobalConstant.EMPTY_STR;
    }

}

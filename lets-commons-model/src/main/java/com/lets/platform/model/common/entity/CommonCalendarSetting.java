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
import net.sf.cglib.core.Local;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 行事历设置
 * </p>
 *
 * @author csy
 * @since 2024-06-17
 */
@Getter
@Setter
@TableName("common_calendar_setting")
@ApiModel(value = "CommonCalendarSetting对象", description = "行事历设置")
public class CommonCalendarSetting extends BaseEntity {


    @ApiModelProperty("节假日默认名称")
    @TableField("default_name")
    private String defaultName;

    @ApiModelProperty("节假期自定义名称")
    @TableField("custom_name")
    private String customName;

    @ApiModelProperty("节假期开始时间")
    @TableField("start_time")
    private LocalDate startTime;

    @ApiModelProperty("节假日结束时间")
    @TableField("end_time")
    private LocalDate endTime;

    @ApiModelProperty("工作日范围[0,6]逗号分割")
    @TableField("work_day")
    private String workDay;

    @ApiModelProperty("所属年份")
    @TableField("year")
    private Integer year;

    @TableField(exist = false)
    private List<String> date;

    @ApiModelProperty("周班次列表")
    @TableField(exist = false)
    private List<Map<String, Object>> weekMapShift;

}

package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 行事历-生产单元-工作日配置
 * @author DING WEI
 * @since 2025-04-16
 */
@Getter
@Setter
@TableName("common_calendar_factory_overtime")
@ApiModel(value = "CommonCalendarFactoryOvertime对象", description = "行事历-生产单元-工作日配置")
public class CommonCalendarFactoryOvertime extends BaseEntity {

    @ApiModelProperty("生产单元主键")
    @TableField("factory_mode_id")
    private String factoryModeId;

    @ApiModelProperty("季度")
    @TableField("quarter")
    private Integer quarter;

    @ApiModelProperty("是否为加班日[Y是N否]")
    @TableField("overtime")
    private String overtime;

    @ApiModelProperty("年月日(yyyyMMdd)")
    @TableField("year_month_day")
    private Integer yearMonthDay;
}

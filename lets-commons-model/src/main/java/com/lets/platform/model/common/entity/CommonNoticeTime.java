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

import java.util.List;

/**
 * <p>
 * 预警规则-时间明细表
 * </p>
 *
 * @author csy
 * @since 2023-11-15
 */
@Getter
@Setter
@TableName("common_notice_time")
@ApiModel(value = "CommonNoticeTime对象", description = "预警规则-时间明细表")
public class CommonNoticeTime extends BaseEntity {

    @ApiModelProperty("规则主键")
    @TableField("rule_id")
    private String ruleId;

    @ApiModelProperty("开始时间(如08:23,存储为823)")
    @TableField("start_time")
    private Integer startTime;
    @ApiModelProperty("开始时间(HH:mm)")
    @TableField(exist = false)
    private String startTimeStr;

    @ApiModelProperty("结束时间(如23:23,存储为2323)")
    @TableField("end_time")
    private Integer endTime;
    @ApiModelProperty("结束时间(HH:mm)")
    @TableField(exist = false)
    private String endTimeStr;

    @ApiModelProperty("开始时间~结束时间(如:08:23~23:23)")
    @TableField("start_end_time")
    private String startEndTime;

    @TableField(exist = false)
    private List<String> timeInterval;
}

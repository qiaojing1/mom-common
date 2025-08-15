package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 报工记录
 * </p>
 *
 * @author csy
 * @since 2024-07-11
 */
@Getter
@Setter
@TableName("mes_report_record_summary")
@ApiModel(value = "MesReportRecordSummary对象", description = "报工记录")
public class MesReportRecordSummary extends BaseEntity {

    @ApiModelProperty("员工")
    @TableField("report_user")
    private String reportUser;
    @TableField(exist = false)
    private String code;
    @TableField(exist = false)
    private String isLeader;
    @TableField(exist = false)
    private BigDecimal duration;

    @ApiModelProperty("员工")
    @TableField("report_user_name")
    private String reportUserName;

    @ApiModelProperty("部门")
    @TableField("org_id")
    private String orgId;

    @ApiModelProperty("部门")
    @TableField("org_name")
    private String orgName;
    @ApiModelProperty("状态")
    @TableField("status")
    private Integer status;
    @ApiModelProperty("状态")
    @TableField(exist = false)
    private String statusName;
    @ApiModelProperty("报工时间")
    @TableField("report_Date")
    private LocalDateTime reportDate;
    @ApiModelProperty("报工时间")
    @TableField(exist = false)
    private String reportDateStr;

    @TableField(exist = false)
    private LocalDateTime startTime;
    @TableField(exist = false)
    private LocalDateTime endTime;
    @TableField(exist = false)
    private String businessCode;

    @TableField(exist = false)
    private Integer current;
    @TableField(exist = false)
    private Integer size;

    @TableField(exist = false)
    private List<MesReportRecord> recordList;


}

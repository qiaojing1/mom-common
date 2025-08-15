package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

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
@TableName("mes_report_record")
@ApiModel(value = "MesReportRecord对象", description = "报工记录")
public class MesReportRecord extends BaseEntity {

    @ApiModelProperty("编码")
    @TableField("code")
    private String code;

    @TableField(exist = false)
    private String orderCodeStr;

    @ApiModelProperty("员工")
    @TableField("report_user")
    private String reportUser;

    @ApiModelProperty("员工")
    @TableField("report_user_name")
    private String reportUserName;

    @ApiModelProperty("部门")
    @TableField("org_id")
    private String orgId;

    @ApiModelProperty("部门")
    @TableField("org_name")
    private String orgName;

    @ApiModelProperty("开始时间")
    @TableField("start_time")
    private LocalDateTime startTime;

    @ApiModelProperty("结束时间")
    @TableField("end_time")
    private LocalDateTime endTime;

    @ApiModelProperty("开始时间-时间戳")
    @TableField(exist = false)
    private Long startTimeLong;

    @ApiModelProperty("结束时间-时间戳")
    @TableField(exist = false)
    private Long endTimeLong;

    @ApiModelProperty("报工日期")
    @TableField(exist = false)
    private LocalDateTime reportDate;

    @ApiModelProperty("时长")
    @TableField("duration")
    private BigDecimal duration;

    @ApiModelProperty("上班时长")
    @TableField("workday_duration")
    private BigDecimal workdayDuration;
    @ApiModelProperty("加班时长")
    @TableField("overtime_duration")
    private BigDecimal overtimeDuration;
    @ApiModelProperty("午休时长")
    @TableField("siesta_duration")
    private BigDecimal siestaDuration;

    @ApiModelProperty("总时长")
    @TableField(exist = false)
    private BigDecimal totalDuration;

    @ApiModelProperty("报工类型")
    @TableField("type")
    private String type;
    @TableField(exist = false)
    private String typeName;

    @ApiModelProperty("项目编号")
    @TableField("project_code")
    private String projectCode;
    @TableField(exist = false)
    private String projectCodeStr;

    @ApiModelProperty("项目编号")
    @TableField("project_id")
    private String projectId;

    @ApiModelProperty("项目明细id")
    @TableField("project_detail_id")
    private String projectDetailId;

    @ApiModelProperty("项目序号")
    @TableField("project_detail_line_number")
    private String projectDetailLineNumber;

    @ApiModelProperty("项目明细工序id")
    @TableField("project_detail_process_id")
    private String projectDetailProcessId;

    @ApiModelProperty("炉型编号")
    @TableField("device_code")
    private String deviceCode;

    @ApiModelProperty("设备")
    @TableField("device_name")
    private String deviceName;

    @ApiModelProperty("炉型Id")
    @TableField("device_id")
    private String deviceId;

    @ApiModelProperty("炉型")
    @TableField("device_basic_model")
    private String deviceBasicModel;

    @ApiModelProperty("规格")
    @TableField("device_model")
    private String deviceModel;

    @ApiModelProperty("任务/系统")
    @TableField("group_code")
    private String groupCode;

    @ApiModelProperty("任务/系统")
    @TableField("group_id")
    private String groupId;

    @ApiModelProperty("任务/系统")
    @TableField("group_name")
    private String groupName;

    @ApiModelProperty("任务/系统")
    @TableField("group_type")
    private String groupType;

    @ApiModelProperty("子任务/工序")
    @TableField("process_id")
    private String processId;

    @ApiModelProperty("子任务/工序")
    @TableField("process_name")
    private String processName;

    @ApiModelProperty("子任务/工序")
    @TableField("process_code")
    private String processCode;

    @ApiModelProperty("额定工时")
    @TableField("standard_hour")
    private Integer standardHour;

    @ApiModelProperty("责任部门")
    @TableField("responsible_part_id")
    private String responsiblePartId;

    @ApiModelProperty("责任部门")
    @TableField("responsible_part_name")
    private String responsiblePartName;

    @ApiModelProperty("工作内容")
    @TableField("job_content")
    private String jobContent;

    @ApiModelProperty("状态")
    @TableField("status")
    private Integer status;
    @ApiModelProperty("状态")
    @TableField("parent_id")
    private String parentId;

    @TableField(exist = false)
    private String statusName;
    @TableField(exist = false)
    private String isLeader;

    @TableField(exist = false)
    private Integer projectStatus;

    @TableField(exist = false)
    private String timeZone;
}

package com.lets.platform.model.tpm.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.lets.platform.model.tpm.enums.ConfigRelationTypeEnum;
import com.lets.platform.model.tpm.enums.RunningSituation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 巡检工单
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-12-16
 */
@Getter
@Setter
@TableName("tpm_inspection_project_order")
@ApiModel(value = "TpmInspectionProjectOrder对象", description = "巡检工单")
public class TpmInspectionProjectOrder extends BaseEntity {

    @ApiModelProperty("工单编号")
    @TableField("code")
    private String code;

    /**
     * @see com.lets.platform.model.tpm.enums.ConfigCycle
     */
    @ApiModelProperty("巡检周期 (1:每天 2:每周 3:每月 4:每季度 5:每半年 6:每年)")
    @TableField("inspection_cycle")
    private String inspectionCycle;

    @ApiModelProperty("巡检计划id")
    @TableField("plan_id")
    private String planId;

    @ApiModelProperty("巡检计划名称")
    @TableField(exist = false)
    private String planName;

    @ApiModelProperty("巡检路线id")
    @TableField("route_id")
    private String routeId;

    @ApiModelProperty("巡检路线名称")
    @TableField("route_name")
    private String routeName;

    @ApiModelProperty("巡检路线")
    @TableField(exist = false)
    private String routeMaps;

    /**
     * @see ConfigRelationTypeEnum
     */
    @ApiModelProperty("巡检方式")
    @TableField("inspection_way")
    private String inspectionWay;
    @ApiModelProperty("巡检方式")
    @TableField(exist = false)
    private String inspectionWayName;

    @ApiModelProperty("巡检人员")
    @TableField("inspect_user_id")
    private String inspectUserId;

    @ApiModelProperty("巡检人员名称")
    @TableField("inspect_user_name")
    private String inspectUserName;

    @ApiModelProperty("巡检时间")
    @TableField("inspection_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime inspectionTime;

    @ApiModelProperty("响应时间")
    @TableField("response_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime responseTime;

    @ApiModelProperty("响应时长(min)")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal responseDuration;

    @ApiModelProperty("完成时间")
    @TableField("finish_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime finishTime;

    @ApiModelProperty("巡检时长(min)")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal finishDuration;

    /**
     * @see RunningSituation
     */
    @ApiModelProperty("巡检情况")
    @TableField("running_situation")
    private String runningSituation;
    @ApiModelProperty("巡检情况")
    @TableField(exist = false)
    private String runningSituationName;

    @ApiModelProperty("巡检结果")
    @TableField("result")
    private String result;
    @ApiModelProperty("巡检结果")
    @TableField(exist = false)
    private String resultName;

    @ApiModelProperty("总结")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("审核状态")
    @TableField("status")
    private Integer status;
    @ApiModelProperty("审核状态")
    @TableField(exist = false)
    private String statusName;

    /**
     * @see com.lets.platform.model.tpm.enums.ProjectRouteOrderStatus
     */
    @ApiModelProperty("工单状态 1:待响应 2:巡检中 3:已完成")
    @TableField("order_status")
    private Integer orderStatus;
    @ApiModelProperty("工单状态")
    @TableField(exist = false)
    private String orderStatusName;

    @ApiModelProperty("审核人")
    @TableField("approve_user")
    private String approveUser;

    @ApiModelProperty("审核人")
    @TableField("approve_user_name")
    private String approveUserName;

    @ApiModelProperty("审核时间")
    @TableField("approve_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime approveTime;

    @ApiModelProperty("审核时长(min)")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal approveDuration;

    @ApiModelProperty("审核时间")
    @TableField(exist = false)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime auditTime;
    @ApiModelProperty("审核人")
    @TableField(exist = false)
    @ExcelIgnore
    private String auditUser;
    @ApiModelProperty("审核人姓名")
    @TableField(exist = false)
    @ExcelIgnore
    private String auditUserName;

    @TableField(exist = false)
    private List<TpmInspectionProjectOrderDetail> details;

    @TableField(exist = false)
    private List<TpmInspectionProjectOrderDetailItems> items;

    @TableField(exist = false)
    private Integer excelIndex;
}

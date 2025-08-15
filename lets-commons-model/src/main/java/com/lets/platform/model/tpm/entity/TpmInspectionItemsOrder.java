package com.lets.platform.model.tpm.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.tpm.enums.OverdueFlagStatusEnum;
import com.lets.platform.model.tpm.enums.RunningSituation;
import com.lets.platform.model.tpm.enums.SpotOrderStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 点检工单
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-11-12
 */
@Getter
@Setter
@TableName("tpm_inspection_items_order")
@ApiModel(value = "TpmInspectionItemsOrder对象", description = "点检工单")
public class TpmInspectionItemsOrder extends BaseEntity {

    @ApiModelProperty("工单编号")
    @TableField("code")
    private String code;

    /**
     * @see com.lets.platform.model.tpm.enums.ConfigCycle
     */
    @ApiModelProperty("点检周期 (1:每天 2:每周 3:每月 4:每季度 5:每半年 6:每年)")
    @TableField("inspection_cycle")
    private String inspectionCycle;
    @TableField(exist = false)
    private String inspectionCycleName;

    @ApiModelProperty("点检计划id")
    @TableField("plan_id")
    private String planId;

    @ApiModelProperty("点检计划名称")
    @TableField(exist = false)
    private String planName;

    @ApiModelProperty("班次id")
    @TableField("shift_id")
    private String shiftId;

    @ApiModelProperty("班次名称")
    @TableField("shift_name")
    private String shiftName;

    @ApiModelProperty("设备id")
    @TableField("device_id")
    private String deviceId;

    @ApiModelProperty("设备编码")
    @TableField("device_code")
    private String deviceCode;

    @ApiModelProperty("设备名称")
    @TableField("device_name")
    private String deviceName;

    @ApiModelProperty("设备类型id")
    @TableField("device_type_id")
    private String deviceTypeId;
    @ApiModelProperty("设备类型")
    @TableField(exist = false)
    private String deviceTypeName;

    @ApiModelProperty("设备型号id")
    @TableField("device_model_id")
    private String deviceModelId;
    @ApiModelProperty("设备型号")
    @TableField(exist = false)
    private String deviceModelName;

    @ApiModelProperty("设备生产单元id")
    @TableField(exist = false)
    private String deviceFactoryId;
    @ApiModelProperty("设备生产单元名称")
    @TableField(exist = false)
    private String deviceFactoryName;
    @ApiModelProperty("设备生产单元编码")
    @TableField(exist = false)
    private String deviceFactoryCode;

    @ApiModelProperty("设备使用部门id")
    @TableField(exist = false)
    private String deviceUseOrgId;
    @ApiModelProperty("设备使用部门名称")
    @TableField(exist = false)
    private String deviceUseOrgName;
    @TableField(exist = false)
    @ApiModelProperty(value = "设备等级")
    private String deviceLevel;

    @ApiModelProperty("点检人员")
    @TableField("inspect_user_id")
    private String inspectUserId;

    @ApiModelProperty("点检人员名称")
    @TableField("inspect_user_name")
    private String inspectUserName;

    @ApiModelProperty("协助人员（上限5人）")
    @TableField("assist_user_ids")
    private String assistUserIds;

    @ApiModelProperty("协助人员名称（上限5人）")
    @TableField("assist_user_names")
    private String assistUserNames;

    @ApiModelProperty("点检时间")
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

    @ApiModelProperty("点检时长(min)")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal finishDuration;

    /**
     * @see RunningSituation
     */
    @ApiModelProperty("运行情况 1:正常运行 2:故障待修 3:停用 4:报废")
    @TableField("running_situation")
    private String runningSituation;
    @ApiModelProperty("运行情况")
    @TableField(exist = false)
    private String runningSituationName;

    @ApiModelProperty("总结")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("审核状态")
    @TableField("status")
    private Integer status;
    @ApiModelProperty("审核状态")
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("审核时间")
    @TableField(value = "approve_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime approveTime;

    @ApiModelProperty("审核时长(min)")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal approveDuration;

    @ApiModelProperty("审核人")
    @TableField(value = "approve_user")
    @ExcelIgnore
    private String approveUser;

    @ApiModelProperty("审核人姓名")
    @TableField(value = "approve_user_name")
    @ExcelIgnore
    private String approveUserName;

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

    /**
     * @see SpotOrderStatus
     */
    @ApiModelProperty("工单状态 1:待响应 2:点检中 3:已完成")
    @TableField("order_status")
    private Integer orderStatus;
    @ApiModelProperty("工单状态 1:待响应 2:点检中 3:已完成")
    @TableField(exist = false)
    private String orderStatusName;

    @ApiModelProperty("巡检结果")
    @TableField("result")
    private String result;
    @ApiModelProperty("巡检结果名称")
    @TableField(exist = false)
    private String resultName;

    @ApiModelProperty("是否逾期 N否 Y是")
    @TableField("overdue_flag")
    private String overdueFlag;
    @ApiModelProperty("是否逾期")
    @TableField(exist = false)
    private String overdueFlagName;

    /**
     * @see OverdueFlagStatusEnum
     */
    @ApiModelProperty("逾期状态 1:正常 2：逾期未接 3：逾期未检")
    @TableField(exist = false)
    private String overdueFlagStatus;
    @ApiModelProperty("是否逾期")
    @TableField(exist = false)
    private String overdueFlagStatusName;

    @ApiModelProperty("点检项明细")
    @TableField(exist = false)
    private List<TpmInspectionItemsOrderDetail> details;

    @TableField(exist = false)
    @ApiModelProperty(hidden = true)
    private Integer excelIndex;

    @TableField(exist = false)
    private String groupFormat;

    @Override
    public String toString() {
        return "TpmInspectionItemsOrder{" +
                "code='" + code + '\'' +
                ", shiftName='" + shiftName + '\'' +
                ", deviceCode='" + deviceCode + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", inspectUserName='" + inspectUserName + '\'' +
                ", inspectionTime=" + inspectionTime +
                '}';
    }
}

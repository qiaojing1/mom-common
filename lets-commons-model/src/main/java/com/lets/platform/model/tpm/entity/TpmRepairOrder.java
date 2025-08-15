package com.lets.platform.model.tpm.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonFile;
import com.lets.platform.model.tpm.enums.RepairOrderStatusEnum;
import com.lets.platform.model.tpm.enums.RepairWayEnum;
import com.lets.platform.model.uc.entity.SysUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 故障维修工单
 *
 * @author DING WEI
 * @since 2024-11-19
 */
@Getter
@Setter
@TableName("tpm_repair_order")
@ApiModel(value = "TpmRepairOrder对象", description = "故障维修工单")
public class TpmRepairOrder extends BaseEntity {

    @ApiModelProperty("报修工单主键")
    @TableField("call_repair_id")
    private String callRepairId;
    @ApiModelProperty("报修单号")
    @TableField(exist = false)
    private String callRepairCode;
    /**
     * @see com.lets.platform.model.tpm.enums.CallRepairCategoryEnum
     */
    @ApiModelProperty("报修类别")
    @TableField(exist = false)
    private String callCategory;
    @TableField(exist = false)
    private String callCategoryName;
    @ApiModelProperty("报修部门")
    @TableField(exist = false)
    private String callOrgId;
    @TableField(exist = false)
    private String callOrgName;
    @ApiModelProperty("报修人员")
    @TableField(exist = false)
    private String callUserId;
    @TableField(exist = false)
    private String callUserName;
    /**
     * @see com.lets.platform.model.tpm.enums.CallRepairTypeEnum
     */
    @ApiModelProperty("报修类型")
    @TableField(exist = false)
    private String callType;
    @TableField(exist = false)
    private String callTypeName;
    /**
     * @see com.lets.platform.model.tpm.enums.CallRepairSourceEnum
     */
    @ApiModelProperty("报修来源")
    @TableField(exist = false)
    private String callSource;
    @TableField(exist = false)
    private String callSourceName;
    @ApiModelProperty("报修时间")
    @TableField(exist = false)
    private LocalDateTime callTime;
    @ApiModelProperty("维修优先级[1:最高,2:较高,3:普通]")
    @TableField(exist = false)
    private String repairPriority;
    @TableField(exist = false)
    private String repairPriorityName;
    @ApiModelProperty("故障影响")
    @TableField(exist = false)
    private String faultEffect;
    @ApiModelProperty("报修内容")
    @TableField(exist = false)
    private String callContent;

    @ApiModelProperty("工单编号")
    @TableField("code")
    private String code;

    @ApiModelProperty("故障类型主键(用户数据字典-故障分类)")
    @TableField("type_id")
    private String typeId;
    @ApiModelProperty("故障类型名称")
    @TableField("type_name")
    private String typeName;

    @ApiModelProperty("设备主键")
    @TableField("device_id")
    private String deviceId;
    @ApiModelProperty("设备编码")
    @TableField("device_code")
    private String deviceCode;
    @ApiModelProperty("设备名称")
    @TableField("device_name")
    private String deviceName;
    @ApiModelProperty("设备等级")
    @TableField("device_level")
    private String deviceLevel;
    @ApiModelProperty("生产单元主键")
    @TableField("factory_mode_id")
    private String factoryModeId;
    @ApiModelProperty("生产单元名称")
    @TableField("factory_mode_name")
    private String factoryModeName;
    @TableField(exist = false)
    private String deviceTypeId;
    @TableField(exist = false)
    private String deviceTypeName;
    @TableField(exist = false)
    private String deviceModelId;
    @TableField(exist = false)
    private String deviceModelName;
    @TableField(exist = false)
    private String deviceControllerId;
    @TableField(exist = false)
    private String deviceControllerName;
    @TableField(exist = false)
    private List<String> faultCodeCode;

    @Length(max = 1000, groups = {Save.class, Update.class}, message = "[原因分析]长度1-1000,支持汉字、字母、数字及常用符号")
    @ApiModelProperty("原因分析")
    @TableField("reason_analysis")
    private String reasonAnalysis;
    @Length(max = 1000, groups = {Save.class, Update.class}, message = "[维修内容]长度1-1000,支持汉字、字母、数字及常用符号")
    @ApiModelProperty("维修内容")
    @TableField("repair_content")
    private String repairContent;
    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("班组主键")
    @TableField("teams_id")
    private String teamsId;
    @ApiModelProperty("班组名称")
    @TableField("teams_name")
    private String teamsName;

    @ApiModelProperty("维修人员主键")
    @TableField("repair_user_id")
    private String repairUserId;
    @ApiModelProperty("维修人员名称")
    @TableField("repair_user_name")
    private String repairUserName;
    @TableField(exist = false)
    private List<SysUser> repairUserList;
    @ApiModelProperty("派工协助人员主键")
    @TableField("dispatch_assist_user_id")
    private String dispatchAssistUserId;
    @ApiModelProperty("派工协助人员名称")
    @TableField("dispatch_assist_user_name")
    private String dispatchAssistUserName;
    @TableField(exist = false)
    private List<SysUser> dispatchAssistUserList;
    @ApiModelProperty("确认协助人员")
    @TableField("confirm_assist_user_id")
    private String confirmAssistUserId;
    @ApiModelProperty("确认协助人员名称")
    @TableField("confirm_assist_user_name")
    private String confirmAssistUserName;

    @ApiModelProperty("维修响应时间")
    @TableField("repair_response_time")
    private LocalDateTime repairResponseTime;
    @TableField(exist = false)
    private String groupFormat;
    @ApiModelProperty("维修开始时间")
    @TableField("repair_start_time")
    private LocalDateTime repairStartTime;
    @ApiModelProperty("维修开始人员-接单人员")
    @TableField("repair_start_user")
    private String repairStartUser;
    @ApiModelProperty("维修开始人员-接单人员名称")
    @TableField("repair_start_user_name")
    private String repairStartUserName;
    @ApiModelProperty("维修完成时间")
    @TableField("repair_end_time")
    private LocalDateTime repairEndTime;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("响应时长（H）=(首次)维修派发时间-报修确认时间")
    @TableField("repair_response_duration")
    private BigDecimal repairResponseDuration;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("维修时长（H）=维修完成时间-维修开始时间")
    @TableField("repair_duration")
    private BigDecimal repairDuration;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("暂停时长（H）=SUM(暂停结束时间-暂停开始时间)")
    @TableField("pause_duration")
    private BigDecimal pauseDuration;
    @ApiModelProperty("接单时长（H）=维修开始时间 - 维修响应时间")
    @TableField(exist = false)
    private BigDecimal reponseDuration;

    @ApiModelProperty("暂停原因")
    @TableField(exist = false)
    private String pauseReason;

    @ApiModelProperty("验收时长(min)=报修单审核时间-维修完成时间")
    @TableField("acceptance_duration")
    private BigDecimal acceptanceDuration;

    @ValidatedEnum(enumClass = RepairWayEnum.class, required = true, groups = {Save.class, Update.class}, message = "[维修方式]非法")
    @ApiModelProperty("维修方式[1：内修、2：委外、3：无需维修]")
    @TableField("repair_way")
    private String repairWay;
    @TableField(exist = false)
    private String repairWayName;

    @ApiModelProperty("无需维修原因")
    @TableField("no_need_repair_reason")
    private String noNeedRepairReason;

    @ApiModelProperty("委外维修主键")
    @TableField("outsourcing_id")
    private String outsourcingId;
    @ApiModelProperty("委外维修单号")
    @TableField("outsourcing_code")
    private String outsourcingCode;
    @ApiModelProperty("委外维修明细主键")
    @TableField("outsourcing_detail_id")
    private String outsourcingDetailId;
    @ApiModelProperty("委外维修供应商主键")
    @TableField("outsourcing_supplier_id")
    private String outsourcingSupplierId;
    @ApiModelProperty("委外维修供应商名称")
    @TableField("outsourcing_supplier_name")
    private String outsourcingSupplierName;

    @ApiModelProperty("附件主键集合")
    @TableField("enclosure_ids")
    private String enclosureIds;
    @TableField(exist = false)
    private List<CommonFile> enclosureList;

    @ValidatedEnum(enumClass = RepairOrderStatusEnum.class, required = true, groups = {Save.class, Update.class}, message = "[工单状态]非法")
    @ApiModelProperty("工单状态[1：待响应、2：待处理、3：处理中、4：已委外、5：已暂停、6：待审核、7：已完成]")
    @TableField("order_status")
    private Integer orderStatus;
    @TableField(exist = false)
    private String orderStatusName;

    @ApiModelProperty("审核状态")
    @TableField("status")
    private Integer status;
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    private LocalDateTime auditTime;
    @ApiModelProperty("审核人")
    @TableField("audit_user")
    private String auditUser;
    @ApiModelProperty("审核人名称")
    @TableField("audit_user_name")
    private String auditUserName;

    @ApiModelProperty("完成时间[工单状态变成已完成的时刻]")
    @TableField("complete_time")
    private LocalDateTime completeTime;

    @ApiModelProperty("预计维修时长(h)")
    @TableField("expect_hours")
    private BigDecimal expectHours;

    @ApiModelProperty("预计完成时间")
    @TableField("expect_finish_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime expectFinishTime;

    /**
     * @see com.lets.platform.model.psi.enums.IsOrNotEnum
     */
    @ApiModelProperty(hidden = true, value = "是否进行中[一个报修单只能有一个进行中的维修单]")
    @TableField("on_going")
    private Integer onGoing;

    @ApiModelProperty("备件明细")
    @TableField(exist = false)
    private List<TpmRepairOrderDetail> details;
    @TableField(exist = false)
    private List<TpmSparePartsRequisitionOrderDetail> sparePartsDetails;
}

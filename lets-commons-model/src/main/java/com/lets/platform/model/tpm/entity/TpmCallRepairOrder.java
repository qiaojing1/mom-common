package com.lets.platform.model.tpm.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonFile;
import com.lets.platform.model.tpm.enums.CallRepairCategoryEnum;
import com.lets.platform.model.tpm.enums.CallRepairPriorityEnum;
import com.lets.platform.model.tpm.enums.CallRepairSourceEnum;
import com.lets.platform.model.tpm.enums.CallRepairTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 故障报修管理
 * @author DING WEI
 * @since 2024-11-18
 */
@Getter
@Setter
@TableName("tpm_call_repair_order")
@ApiModel(value = "TpmCallRepairOrder对象", description = "故障报修管理")
public class TpmCallRepairOrder extends BaseEntity {

    @ApiModelProperty("工单编号")
    @TableField("code")
    private String code;

    @ValidatedEnum(enumClass = CallRepairCategoryEnum.class, required = true, groups = {Save.class, Update.class}, message = "[报修类别]非法")
    @ApiModelProperty("报修类别[1:设备报修,2:零星报修]")
    @TableField("category")
    private String category;
    @TableField(exist = false)
    private String categoryName;

    @ValidatedEnum(enumClass = CallRepairTypeEnum.class, required = true, groups = {Save.class, Update.class}, message = "[报修类型]非法")
    @ApiModelProperty("报修类型[1:机械故障,2:电气报修,3:其他故障]")
    @TableField("type")
    private String type;
    @TableField(exist = false)
    private String typeName;

    @ValidatedEnum(enumClass = CallRepairSourceEnum.class, required = true, groups = {Save.class, Update.class}, message = "[报修来源]非法")
    @ApiModelProperty("报修来源[1:点检,2:采集,3:手动,4:巡检,5:预警]")
    @TableField("source")
    private String source;
    @TableField(exist = false)
    private String sourceName;

    @NotBlank(groups = {Save.class, Update.class}, message = "[报修部门]不能为空")
    @ApiModelProperty("报修部门主键")
    @TableField("org_id")
    private String orgId;
    @ApiModelProperty("报修部门名称")
    @TableField("org_name")
    private String orgName;

    @NotBlank(groups = {Save.class, Update.class}, message = "[报修人员]不能为空")
    @ApiModelProperty("报修人员主键")
    @TableField("user_id")
    private String userId;
    @ApiModelProperty("报修人员名称")
    @TableField("user_name")
    private String userName;

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

    @ValidatedEnum(enumClass = CallRepairPriorityEnum.class, required = true, groups = {Save.class, Update.class}, message = "[维修优先级]非法")
    @ApiModelProperty("维修优先级[1:最高,2:较高,3:普通]")
    @TableField("repair_priority")
    private String repairPriority;
    @TableField(exist = false)
    private String repairPriorityName;

    @Length(max = 40, groups = {Save.class, Update.class}, message = "[故障影响]长度0-40；支持汉字、字母、数字与常用符号")
    @ApiModelProperty("故障影响")
    @TableField("fault_effect")
    private String faultEffect;

    @Length(min = 1, max = 1000, groups = {Save.class, Update.class}, message = "[报修内容]长度1-1000；支持汉字、字母、数字与常用符号")
    @ApiModelProperty("报修内容")
    @TableField("content")
    private String content;

    @ApiModelProperty("附件主键集合")
    @TableField("enclosure_ids")
    private String enclosureIds;
    @Size(max = 20, message = "Order.enclosureIds", groups = {Save.class, Update.class})
    @TableField(exist = false)
    private List<CommonFile> enclosureList;

    @ApiModelProperty("报修时间")
    @TableField("call_time")
    private LocalDateTime callTime;
    @ApiModelProperty("报修人员")
    @TableField("call_user")
    private String callUser;
    @ApiModelProperty("报修人员名称")
    @TableField("call_user_name")
    private String callUserName;

    @ApiModelProperty("报修确认时间")
    @TableField("call_confirm_time")
    private LocalDateTime callConfirmTime;
    @ApiModelProperty("报修确认人员")
    @TableField("call_confirm_user")
    private String callConfirmUser;
    @ApiModelProperty("报修确认人员名称")
    @TableField("call_confirm_user_name")
    private String callConfirmUserName;

    /**
     * @see com.lets.platform.model.tpm.enums.CallRepairOrderStatusEnum
     */
    @ApiModelProperty("工单状态")
    @TableField("order_status")
    private Integer orderStatus;
    @TableField(exist = false)
    private String orderStatusName;

    /**
     * @see com.lets.platform.model.base.enums.OrderStatusEnum
     */
    @ApiModelProperty("审核状态")
    @TableField("status")
    private Integer status;
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("完成时间[工单状态变成已完成的时刻]")
    @TableField("complete_time")
    private LocalDateTime completeTime;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    private LocalDateTime auditTime;
    @ApiModelProperty("审核人")
    @TableField("audit_user")
    private String auditUser;
    @ApiModelProperty("审核人名称")
    @TableField("audit_user_name")
    private String auditUserName;

    @ApiModelProperty("故障明细")
    @TableField(exist = false)
    private List<TpmCallRepairOrderDetail> details;

    @ApiModelProperty("维修主键")
    @TableField(exist = false)
    private String repairId;
    @ApiModelProperty("维修单号")
    @TableField(exist = false)
    private String repairCode;
    @ApiModelProperty("维修人员主键")
    @TableField(exist = false)
    private String repairUserId;
    @ApiModelProperty("维修人员名称")
    @TableField(exist = false)
    private String repairUserName;
    /**
     * @see com.lets.platform.model.tpm.enums.RepairWayEnum
     */
    @ApiModelProperty("维修方式[1：内修、2：委外、3：无需维修]")
    @TableField(exist = false)
    private String repairWay;
    @TableField(exist = false)
    private String repairWayName;
    @ApiModelProperty("维修响应时间=派工时间")
    @TableField(exist = false)
    private LocalDateTime repairResponseTime;
    @ApiModelProperty("维修开始时间=接单时间")
    @TableField(exist = false)
    private LocalDateTime repairStartTime;
    @ApiModelProperty("维修完成时间")
    @TableField(exist = false)
    private LocalDateTime repairEndTime;


    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("维修等待时长（H）=报修确认时间-报修时间")
    @TableField("repair_wait_duration")
    private BigDecimal repairWaitDuration;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("响应时长（H）=(首次)维修派发时间-报修确认时间")
    @TableField(exist = false)
    private BigDecimal repairResponseDuration;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("维修时长（H）=维修完成时间-维修开始时间")
    @TableField(exist = false)
    private BigDecimal repairDuration;
    @ApiModelProperty("接单时长（H）=维修开始时间 - 维修响应时间")
    @TableField(exist = false)
    private BigDecimal reponseDuration;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("暂停时长（H）=SUM(暂停结束时间-暂停开始时间)")
    @TableField(exist = false)
    private BigDecimal pauseDuration;
    @ApiModelProperty("暂停原因")
    @TableField(exist = false)
    private String pauseReason;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("验收时长(min)=报修单审核时间-维修完成时间")
    @TableField(exist = false)
    private BigDecimal acceptanceDuration;

    @ApiModelProperty("故障类型")
    @TableField(exist = false)
    private String faultTypeId;
    @TableField(exist = false)
    private String faultTypeName;
    @ApiModelProperty("周期标识")
    @TableField(exist = false)
    private String cycle;
}

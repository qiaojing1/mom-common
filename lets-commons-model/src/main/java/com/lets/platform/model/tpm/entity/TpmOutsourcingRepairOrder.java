package com.lets.platform.model.tpm.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonFile;
import com.lets.platform.model.tpm.enums.OutsourcingCreateSourceEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 委外维修工单
 * @author DING WEI
 * @since 2024-12-04
 */
@Getter
@Setter
@TableName("tpm_outsourcing_repair_order")
@ApiModel(value = "TpmOutsourcingRepairOrder对象", description = "委外维修工单")
public class TpmOutsourcingRepairOrder extends BaseEntity {

    @ApiModelProperty("报修工单主键")
    @TableField("call_repair_id")
    private String callRepairId;

    @ApiModelProperty("维修工单主键")
    @TableField("repair_order_id")
    private String repairOrderId;
    @ApiModelProperty("维修工单单号")
    @TableField("repair_order_code")
    private String repairOrderCode;
    @ApiModelProperty("维修工单状态")
    @TableField("repair_order_status")
    private Integer repairOrderStatus;
    @TableField(exist = false)
    private TpmRepairOrder repairOrder;

    @ValidatedEnum(enumClass = OutsourcingCreateSourceEnum.class, required = true, message = "[创建来源]不能为空", groups = {Save.class, Update.class})
    @ApiModelProperty("创建来源[1:维修派发，2:维修处理]")
    @TableField("create_source")
    private Integer createSource;

    @ApiModelProperty("委外维修单号")
    @TableField("code")
    private String code;

    @ApiModelProperty("设备主键")
    @TableField("device_id")
    private String deviceId;
    @ApiModelProperty("设备编码")
    @TableField("device_code")
    private String deviceCode;
    @ApiModelProperty("设备名称")
    @TableField("device_name")
    private String deviceName;

    @Length(max = 200, message = "[委外维修描述]长度1-200，支持汉字、字母、数字及常用符号", groups = {Save.class, Update.class})
    @ApiModelProperty("委外维修描述")
    @TableField("outsourcing_describe")
    private String outsourcingDescribe;

    @NotNull(message = "[委外时间]不能为空", groups = {Save.class, Update.class})
    @ApiModelProperty("委外时间")
    @TableField("outsourcing_time")
    private LocalDateTime outsourcingTime;
    @NotBlank(message = "[委外维修人员]不能为空", groups = {Save.class, Update.class})
    @ApiModelProperty("委外维修人员")
    @TableField("outsourcing_user")
    private String outsourcingUser;
    @NotBlank(message = "[委外维修人员名称]不能为空", groups = {Save.class, Update.class})
    @ApiModelProperty("委外维修人员名称")
    @TableField("outsourcing_user_name")
    private String outsourcingUserName;

    @NotBlank(message = "[委外供应商]不能为空", groups = {Save.class, Update.class})
    @ApiModelProperty("委外维修供应商主键")
    @TableField("outsourcing_supplier_id")
    private String outsourcingSupplierId;
    @NotBlank(message = "[委外维修供应商名称]不能为空", groups = {Save.class, Update.class})
    @ApiModelProperty("委外维修供应商名称")
    @TableField("outsourcing_supplier_name")
    private String outsourcingSupplierName;

    @ApiModelProperty("委外接收时间")
    @TableField("outsourcing_receive_time")
    private LocalDateTime outsourcingReceiveTime;
    @ApiModelProperty("委外接收人员")
    @TableField("outsourcing_receive_user")
    private String outsourcingReceiveUser;
    @ApiModelProperty("委外接收人员名称")
    @TableField("outsourcing_receive_user_name")
    private String outsourcingReceiveUserName;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("委外接收时长（H）=委外接收时间-委外时间")
    @TableField("outsourcing_receive_duration")
    private BigDecimal outsourcingReceiveDuration;

    @ApiModelProperty("委外完成时间")
    @TableField("outsourcing_finish_time")
    private LocalDateTime outsourcingFinishTime;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("委外维修时长（H）=委外完成时间-委外接收时间")
    @TableField("outsourcing_repair_duration")
    private BigDecimal outsourcingRepairDuration;

    @ApiModelProperty("原因分析")
    @TableField("reason_analysis")
    private String reasonAnalysis;

    @ApiModelProperty("维修内容")
    @TableField("repair_content")
    private String repairContent;

    @ApiModelProperty("故障类型主键(用户数据字典-故障分类)")
    @TableField("type_id")
    private String typeId;
    @ApiModelProperty("故障类型名称")
    @TableField("type_name")
    private String typeName;

    @ApiModelProperty("委外质保时间(天)")
    @TableField("outsourcing_warranty_days")
    private Integer outsourcingWarrantyDays;

    @ApiModelProperty("附件主键集合")
    @TableField("enclosure_ids")
    private String enclosureIds;
    @Size(max = 20, message = "Order.enclosureIds", groups = {Save.class, Update.class})
    @TableField(exist = false)
    private List<CommonFile> enclosureList;

    /**
     * @see com.lets.platform.model.base.enums.OrderStatusEnum
     */
    @ApiModelProperty("审核状态")
    @TableField("status")
    private Integer status;
    @TableField(exist = false)
    private String statusName;

    /**
     * @see com.lets.platform.model.tpm.enums.OutsourcingOrderStatusEnum
     */
    @ApiModelProperty("工单状态[1:待接收、2:已接收、3:待审核、4:已完成]")
    @TableField("order_status")
    private Integer orderStatus;
    @TableField(exist = false)
    private String orderStatusName;

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

    @ApiModelProperty("生产单元 detail.factoryModeId")
    @TableField(exist = false)
    private String callFactoryModeId;
    @TableField(exist = false)
    private String callFactoryModeName;
    @ApiModelProperty("报修单号 detail.code")
    @TableField(exist = false)
    private String callRepairCode;
    @ApiModelProperty("报修类别 detail.category")
    @TableField(exist = false)
    private String callCategory;
    @TableField(exist = false)
    private String callCategoryName;
    @ApiModelProperty("报修类型 detail.type")
    @TableField(exist = false)
    private String callType;
    @TableField(exist = false)
    private String callTypeName;
    @ApiModelProperty("报修来源 detail.source")
    @TableField(exist = false)
    private String callSource;
    @TableField(exist = false)
    private String callSourceName;
    @ApiModelProperty("报修部门 detail.orgId")
    @TableField(exist = false)
    private String callOrgId;
    @TableField(exist = false)
    private String callOrgName;
    @ApiModelProperty("报修人员 detail.userId")
    @TableField(exist = false)
    private String callUserId;
    @TableField(exist = false)
    private String callUserName;
    @ApiModelProperty("报修时间 detail.callTime")
    @TableField(exist = false)
    private LocalDateTime callTime;
}

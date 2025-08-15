package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 产品维修工单
 * @author DING WEI
 * @since 2025-06-04
 */
@Getter
@Setter
@TableName("mes_product_repair_order")
@ApiModel(value = "MesProductRepairOrder对象", description = "产品维修工单")
public class MesProductRepairOrder extends BaseEntity {

    @ApiModelProperty("单据编号")
    @TableField("code")
    private String code;

    @ApiModelProperty("单据类别")
    @TableField("order_category_id")
    private String orderCategoryId;
    @ApiModelProperty("单据类别编码")
    @TableField("order_category_code")
    private String orderCategoryCode;
    @ApiModelProperty("单据类别名称")
    @TableField("order_category_name")
    private String orderCategoryName;
    @ApiModelProperty("业务类型")
    @TableField("business_id")
    private String businessId;
    @TableField(exist = false)
    private String businessName;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("单据日期")
    @TableField("order_time")
    private LocalDateTime orderTime;

    @NotBlank(message = "[客户]不能为空", groups = {Save.class, Update.class})
    @ApiModelProperty("客户主键")
    @TableField("custom_id")
    private String customId;
    @ApiModelProperty("客户名称")
    @TableField("custom_name")
    private String customName;
    @ApiModelProperty("客户-联系人")
    @TableField("custom_user")
    private String customUser;
    @ApiModelProperty("客户-联系人名称")
    @TableField("custom_user_name")
    private String customUserName;
    @ApiModelProperty("客户-联系电话")
    @TableField("custom_phone")
    private String customPhone;
    @ApiModelProperty("客户-联系地址")
    @TableField("custom_address")
    private String customAddress;

    @ApiModelProperty("业务部门主键")
    @TableField("business_org_id")
    private String businessOrgId;
    @ApiModelProperty("业务部门名称")
    @TableField("business_org_name")
    private String businessOrgName;
    @ApiModelProperty("业务员主键")
    @TableField("business_user_id")
    private String businessUserId;
    @ApiModelProperty("业务员名称")
    @TableField("business_user_name")
    private String businessUserName;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("派工日期")
    @TableField("dispatch_time")
    private LocalDateTime dispatchTime;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("完成日期")
    @TableField("finish_time")
    private LocalDateTime finishTime;

    @NotBlank(message = "[结算币种]不能为空", groups = {Save.class, Update.class})
    @ApiModelProperty("结算币种")
    @TableField("settlement_currency_id")
    private String settlementCurrencyId;
    @ApiModelProperty("结算币种名称")
    @TableField("settlement_currency_name")
    private String settlementCurrencyName;
    @ApiModelProperty("结算币种单价精度")
    @TableField("settlement_currency_price_accuracy")
    private Integer settlementCurrencyPriceAccuracy;
    @ApiModelProperty("结算币种金额精度")
    @TableField("settlement_currency_amount_accuracy")
    private Integer settlementCurrencyAmountAccuracy;
    @ApiModelProperty("结算币种舍入类型")
    @TableField("settlement_currency_round_off_type")
    private Integer settlementCurrencyRoundOffType;

    /**
     * @see com.lets.platform.model.mes.enums.ProductRepairStatusEnum
     */
    @ApiModelProperty("维修状态[1:待派工、2:已派工、3:已完成]")
    @TableField("repair_status")
    private Integer repairStatus;
    @TableField(exist = false)
    private String repairStatusName;

    /**
     * @see com.lets.platform.model.psi.enums.IsOrNotEnum
     */
    @ApiModelProperty("是否收费[0:否;1:是]")
    @TableField("charge")
    private Integer charge;
    @TableField(exist = false)
    private String chargeName;

    /**
     * @see com.lets.platform.model.base.enums.OrderStatusEnum
     */
    @ApiModelProperty("单据状态")
    @TableField("status")
    private Integer status;
    @TableField(exist = false)
    private String statusName;

    /**
     * @see com.lets.platform.model.base.enums.CloseStatusEnum
     */
    @ApiModelProperty("关闭状态[0:关闭;1:正常]")
    @TableField("enable")
    private Integer enable;
    @TableField(exist = false)
    private String enableName;

    @Length(max = 200, message = "[备注]长度1-200，支持中文、字母、数字及常用符号", groups = {Save.class, Update.class})
    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @NotBlank(message = "[产品]不能为空", groups = {Save.class, Update.class})
    @ApiModelProperty("物料主键")
    @TableField("material_id")
    private String materialId;
    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;
    @ApiModelProperty("物料名称")
    @TableField("material_name")
    private String materialName;
    @ApiModelProperty("物料规格型号")
    @TableField("material_specs")
    private String materialSpecs;
    @ApiModelProperty("物料类型")
    @TableField("material_type")
    private String materialType;
    @TableField(exist = false)
    private String materialTypeName;

    @ApiModelProperty("基本单位")
    @TableField("basic_unit_id")
    private String basicUnitId;
    @ApiModelProperty("基本单位编码")
    @TableField("basic_unit_code")
    private String basicUnitCode;
    @ApiModelProperty("基本单位名称")
    @TableField("basic_unit_name")
    private String basicUnitName;
    @ApiModelProperty("基本单位精度")
    @TableField("basic_unit_accuracy")
    private Integer basicUnitAccuracy;
    @ApiModelProperty("基本单位舍入类型")
    @TableField("basic_unit_round_off_type")
    private Integer basicUnitRoundOffType;

    @NotNull(message = "[维修数量]不能为空", groups = {Save.class, Update.class})
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("维修数量")
    @TableField("repair_number")
    private BigDecimal repairNumber;
    @NotNull(message = "[维修单价]不能为空", groups = {Save.class, Update.class})
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("维修单价")
    @TableField("repair_price")
    private BigDecimal repairPrice;
    @NotNull(message = "[维修金额]不能为空", groups = {Save.class, Update.class})
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("维修金额")
    @TableField("repair_amount")
    private BigDecimal repairAmount;

    @ApiModelProperty("已收数量（应收单）")
    @TableField("already_ar_number")
    private BigDecimal alreadyArNumber;
    @TableField(exist = false)
    private BigDecimal oldAlreadyArNumber;
    @ApiModelProperty("应收占用数量（应收单）")
    @TableField("occupy_ar_number")
    private BigDecimal occupyArNumber;
    @TableField(exist = false)
    private BigDecimal oldOccupyArNumber;
    @ApiModelProperty("可下发应收数量")
    @TableField(exist = false)
    private BigDecimal canArNumber;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("出厂日期")
    @TableField("leave_factory_time")
    private LocalDateTime leaveFactoryTime;

    @ApiModelProperty("产品批号")
    @TableField("batch_number")
    private String batchNumber;

    @ApiModelProperty("产品序列号")
    @TableField("serial_number")
    private String serialNumber;

    @ApiModelProperty("合同编号")
    @TableField("contract_code")
    private String contractCode;

    @ApiModelProperty("收发仓库主键")
    @TableField("receive_dispatch_store_id")
    private String receiveDispatchStoreId;
    @ApiModelProperty("收发仓库名称")
    @TableField("receive_dispatch_store_name")
    private String receiveDispatchStoreName;

    @Length(max = 200, message = "[故障描述]长度1-200，支持中文、字母、数字及常用符号", groups = {Save.class, Update.class})
    @ApiModelProperty("故障描述")
    @TableField("fault_describe")
    private String faultDescribe;
    @Length(max = 200, message = "[故障原因]长度1-200，支持中文、字母、数字及常用符号", groups = {Save.class, Update.class})
    @ApiModelProperty("故障原因")
    @TableField("fault_reason")
    private String faultReason;
    @Length(max = 200, message = "[维修方法]长度1-200，支持中文、字母、数字及常用符号", groups = {Save.class, Update.class})
    @ApiModelProperty("维修方法")
    @TableField("repair_method")
    private String repairMethod;
    @Length(max = 200, message = "[用户意见]长度1-200，支持中文、字母、数字及常用符号", groups = {Save.class, Update.class})
    @ApiModelProperty("用户意见")
    @TableField("customer_opinion")
    private String customerOpinion;

    @ApiModelProperty("源单主键")
    @TableField("source_order_id")
    private String sourceOrderId;
    @ApiModelProperty("源单单号")
    @TableField("source_order_code")
    private String sourceOrderCode;
    @ApiModelProperty("源单类型")
    @TableField("source_order_type")
    private String sourceOrderType;
    @ApiModelProperty("源单明细id")
    @TableField("source_detail_id")
    private String sourceDetailId;
    @ApiModelProperty("源单行号")
    @TableField("source_line_number")
    private Long sourceLineNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("发料数量")
    @TableField("already_picking_number")
    private BigDecimal alreadyPickingNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("退料数量")
    @TableField("already_return_number")
    private BigDecimal alreadyReturnNumber;

    @ApiModelProperty("关闭时间")
    @TableField("close_time")
    private LocalDateTime closeTime;
    @ApiModelProperty("关闭人")
    @TableField("close_user")
    private String closeUser;
    @ApiModelProperty("关闭人名称")
    @TableField("close_user_name")
    private String closeUserName;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    private LocalDateTime auditTime;
    @ApiModelProperty("审核人")
    @TableField("audit_user")
    private String auditUser;
    @ApiModelProperty("审核人名称")
    @TableField("audit_user_name")
    private String auditUserName;

    @ApiModelProperty("附件")
    @TableField("enclosure_ids")
    private String enclosureIds;
    @TableField(exist = false)
    private List<CommonFile> enclosureFileList;
}

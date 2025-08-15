package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.psi.vo.SupplyEnclosureVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 协同送货单
 * @author DING WEI
 * @since 2025-04-02
 */
@Getter
@Setter
@TableName("psi_cooperate_deliver_order")
@ApiModel(value = "PsiCooperateDeliverOrder对象", description = "协同送货单")
public class PsiCooperateDeliverOrder extends BaseEntity {

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
    @TableField(exist = false)
    private PsiOrderCategory orderCategory;

    @ApiModelProperty("业务类型")
    @TableField("business_id")
    private String businessId;
    @ApiModelProperty("业务类型")
    @TableField("business_name")
    private String businessName;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("单据日期")
    @TableField("order_time")
    private LocalDateTime orderTime;

    @ApiModelProperty("供应商主键")
    @TableField("supplier_id")
    private String supplierId;
    @ApiModelProperty("供应商名称")
    @TableField("supplier_name")
    private String supplierName;

    @ApiModelProperty("采购部门主键")
    @TableField("purchase_org_id")
    private String purchaseOrgId;
    @ApiModelProperty("采购部门名称")
    @TableField("purchase_org_name")
    private String purchaseOrgName;

    @ApiModelProperty("采购员主键")
    @TableField("purchase_user_id")
    private String purchaseUserId;
    @ApiModelProperty("采购员名称")
    @TableField("purchase_user_name")
    private String purchaseUserName;

    @ApiModelProperty("供应商用户")
    @TableField("supplier_user_id")
    private String supplierUserId;
    @ApiModelProperty("供应商用户名称")
    @TableField("supplier_user_name")
    private String supplierUserName;

    @ApiModelProperty("企业联系人")
    @TableField("contact_person")
    private String contactPerson;
    @ApiModelProperty("企业联系方式")
    @TableField("contact_phone")
    private String contactPhone;
    @ApiModelProperty("物流名称")
    @TableField("logistics_name")
    private String logisticsName;
    @ApiModelProperty("物流单号")
    @TableField("logistics_code")
    private String logisticsCode;
    @ApiModelProperty("物流联系人")
    @TableField("logistics_person")
    private String logisticsPerson;
    @ApiModelProperty("物流联系方式")
    @TableField("logistics_phone")
    private String logisticsPhone;

    @ApiModelProperty("车牌号")
    @TableField("plate_number")
    private String plateNumber;

    @ApiModelProperty("单据状态")
    @TableField("status")
    private Integer status;
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("关闭状态[0:关闭;1:正常]")
    @TableField("enable")
    private Integer enable;
    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("关闭时间")
    @TableField("disable_time")
    private LocalDateTime disableTime;
    @ApiModelProperty("关闭人")
    @TableField("disable_user")
    private String disableUser;
    @ApiModelProperty("关闭人名称")
    @TableField("disable_user_name")
    private String disableUserName;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    private LocalDateTime auditTime;
    @ApiModelProperty("审核人")
    @TableField("audit_user")
    private String auditUser;
    @ApiModelProperty("审核人名称")
    @TableField("audit_user_name")
    private String auditUserName;

    /**
     * @see com.lets.platform.model.psi.enums.SupplyEnclosureStatusEnum
     */
    @ApiModelProperty("供货资料上传状态[0：未上传,1：部分上传,2：已上传]")
    @TableField("supply_enclosure_status")
    private String supplyEnclosureStatus;
    @TableField(exist = false)
    private String supplyEnclosureStatusName;

    @ApiModelProperty("供货资料")
    @TableField(exist = false)
    private List<SupplyEnclosureVo> supplyEnclosures;

    @ApiModelProperty("送货明细")
    @TableField(exist = false)
    private List<PsiCooperateDeliverOrderDetail> details;

    @ApiModelProperty("协同送货订单")
    @TableField(exist = false)
    private String orderId;

    @ApiModelProperty("行号")
    @TableField(exist = false)
    private Long lineNumber;

    @ApiModelProperty("物料主键")
    @TableField(exist = false)
    private String materialId;
    @ApiModelProperty("物料编码")
    @TableField(exist = false)
    private String materialCode;
    @ApiModelProperty("物料名称")
    @TableField(exist = false)
    private String materialName;
    @ApiModelProperty("物料规格型号")
    @TableField(exist = false)
    private String materialSpecs;
    @ApiModelProperty("物料特征属性名称")
    @TableField(exist = false)
    private String materialSpecific;
    @ApiModelProperty("物料类型")
    @TableField(exist = false)
    private String materialType;

    @ApiModelProperty("采购单位")
    @TableField(exist = false)
    private String purchaseUnitId;
    @ApiModelProperty("采购单位编码")
    @TableField(exist = false)
    private String purchaseUnitCode;
    @ApiModelProperty("采购单位名称")
    @TableField(exist = false)
    private String purchaseUnitName;
    @ApiModelProperty("采购单位精度")
    @TableField(exist = false)
    private Integer purchaseUnitAccuracy;
    @ApiModelProperty("采购单位舍入类型")
    @TableField(exist = false)
    private Integer purchaseUnitRoundOffType;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("采购数量")
    @TableField(exist = false)
    private BigDecimal purchaseNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("送货数量")
    @TableField(exist = false)
    private BigDecimal deliverNumber;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("送货日期")
    @TableField(exist = false)
    private LocalDate demandDate;

    @ApiModelProperty("批号")
    @TableField(exist = false)
    private String batchNumber;

    @ApiModelProperty("备注")
    @TableField(exist = false)
    private String detailRemark;

    @ApiModelProperty("行状态[0:关闭;1:正常]")
    @TableField(exist = false)
    private Integer detailEnable;
    @TableField(exist = false)
    private String detailEnableName;

    @ApiModelProperty("源单id")
    @TableField(exist = false)
    private String sourceOrderId;
    @ApiModelProperty("源单单号")
    @TableField(exist = false)
    private String sourceOrderCode;
    @ApiModelProperty("源单类型")
    @TableField(exist = false)
    private String sourceOrderType;
    @TableField(exist = false)
    private String sourceOrderTypeName;
    @ApiModelProperty("源单明细id")
    @TableField(exist = false)
    private String sourceDetailId;
    @ApiModelProperty("源单行号")
    @TableField(exist = false)
    private Long sourceDetailLineNumber;

    @ApiModelProperty("计划跟踪号")
    @TableField(exist = false)
    private String trackNo;
    @ApiModelProperty("源单订货客户id")
    @TableField(exist = false)
    private String sourceOrderCustomerId;
    @ApiModelProperty("源单订货客户名称")
    @TableField(exist = false)
    private String sourceOrderCustomerName;

    @ApiModelProperty("目标状态")
    @TableField(exist = false)
    private Integer toStatus;

}

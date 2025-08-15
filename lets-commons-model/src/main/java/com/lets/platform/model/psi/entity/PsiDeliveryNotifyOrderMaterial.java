package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
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
 * 出货通知单物料明细
 * </p>
 *
 * @author FZY
 * @since 2023-08-16
 */
@Getter
@Setter
@TableName("psi_delivery_notify_order_material")
@ApiModel(value = "PsiDeliveryNotifyOrderMaterial对象", description = "出货通知单物料明细")
public class PsiDeliveryNotifyOrderMaterial extends BaseEntity {

    @ApiModelProperty("出货通知单ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("出货通知单")
    @TableField(exist = false)
    private PsiDeliveryNotifyOrder order;

    @ApiModelProperty("销售部门ID")
    @TableField("sale_org_id")
    private String saleOrgId;

    @ApiModelProperty("销售部门名称")
    @TableField("sale_org_name")
    private String saleOrgName;

    @ApiModelProperty("销售员ID")
    @TableField("sale_user_id")
    private String saleUserId;

    @ApiModelProperty("销售员名称")
    @TableField("sale_user_name")
    private String saleUserName;

    @ApiModelProperty("销售分组ID")
    @TableField("sale_group_id")
    private String saleGroupId;

    @ApiModelProperty("销售分组名称")
    @TableField("sale_group_name")
    private String saleGroupName;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Long lineNumber;

    @ApiModelProperty("客户物料编码ID")
    @TableField("customer_material_id")
    private String customerMaterialId;

    @ApiModelProperty("客户物料编码")
    @TableField("customer_material_code")
    private String customerMaterialCode;

    @ApiModelProperty("客户物料名称")
    @TableField("customer_material_name")
    private String customerMaterialName;

    @ApiModelProperty("物料编码ID")
    @TableField("material_id")
    private String materialId;

    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;

    @ApiModelProperty("物料类型")
    @TableField("material_type")
    private String materialType;

    @ApiModelProperty("物料名称")
    @TableField("material_name")
    private String materialName;

    @ApiModelProperty("物料规格型号")
    @TableField("material_specs")
    private String materialSpecs;

    @ApiModelProperty("特征属性名称")
    @TableField("material_characteristic_names")
    private String materialCharacteristicNames;

    @ApiModelProperty("超发上限(%)")
    @TableField("over_limit")
    private BigDecimal overLimit;

    @ApiModelProperty("超发下限(%)")
    @TableField("under_limit")
    private BigDecimal underLimit;

    @ApiModelProperty("收货客户ID")
    @TableField("receive_customer_id")
    private String receiveCustomerId;

    @ApiModelProperty("收货客户名称")
    @TableField("receive_customer_name")
    private String receiveCustomerName;

    @ApiModelProperty("收货联系人ID")
    @TableField("receive_customer_contact_user_id")
    private String receiveCustomerContactUserId;

    @ApiModelProperty("收货联系人")
    @TableField("receive_customer_contact_user")
    private String receiveCustomerContactUser;

    @ApiModelProperty("收货联系电话")
    @TableField("receive_customer_contact_phone_number")
    private String receiveCustomerContactPhoneNumber;

    @ApiModelProperty("收货联系地址")
    @TableField("receive_customer_contact_address")
    private String receiveCustomerContactAddress;

    @ApiModelProperty("库存单位ID")
    @TableField("inventory_unit_id")
    private String inventoryUnitId;

    @ApiModelProperty("库存单位名称")
    @TableField("inventory_unit_name")
    private String inventoryUnitName;

    @ApiModelProperty("库存单位精度")
    @TableField("inventory_unit_accuracy")
    private Integer inventoryUnitAccuracy;

    @ApiModelProperty("库存单位舍入类型")
    @TableField("inventory_unit_round_off_type")
    private Integer inventoryUnitRoundOffType;

    @ApiModelProperty("数量")
    @TableField("quantity")
    private BigDecimal quantity;

    @ApiModelProperty("确认数量")
    @TableField(value = "confirm_quantity", updateStrategy = FieldStrategy.ALWAYS)
    private BigDecimal confirmQuantity;

    @TableField(exist = false)
    private BigDecimal confirmQuantityAndQuantityOffset;

    @ApiModelProperty("可申请数量")
    @TableField(exist = false)
    private BigDecimal availableQuantity;

    @ApiModelProperty("要货日期")
    @TableField("need_date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime needDate;

    @ApiModelProperty("计划发货日期")
    @TableField("plan_date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime planDate;

    @ApiModelProperty("仓库ID")
    @TableField("store_id")
    private String storeId;

    @ApiModelProperty("仓库名称")
    @TableField("store_name")
    private String storeName;

    @ApiModelProperty("批号ID")
    @TableField("batch_number_id")
    private String batchNumberId;

    @ApiModelProperty("批号名称")
    @TableField("batch_number_name")
    private String batchNumberName;

    @ApiModelProperty("生产日期")
    @TableField("production_date")
    private LocalDateTime productionDate;

    @ApiModelProperty("保质期到期日")
    @TableField("expiration_date")
    private LocalDateTime expirationDate;

    @ApiModelProperty("参考单位ID")
    @TableField("reference_unit_id")
    private String referenceUnitId;

    @ApiModelProperty("参考单位名称")
    @TableField("reference_unit_name")
    private String referenceUnitName;

    @ApiModelProperty("参考单位精度")
    @TableField("reference_unit_accuracy")
    private Integer referenceUnitAccuracy;

    @ApiModelProperty("参考单位舍入类型")
    @TableField("reference_unit_round_off_type")
    private String referenceUnitRoundOffType;

    @ApiModelProperty("参考单位与库存单位比例")
    @TableField("reference_unit_rate")
    private BigDecimal referenceUnitRate;

    @ApiModelProperty("参考数量")
    @TableField("reference_quantity")
    private BigDecimal referenceQuantity;

    @ApiModelProperty("项目编号")
    @TableField("project_code")
    private String projectCode;

    @ApiModelProperty("合同编号")
    @TableField("contract_code")
    private String contractCode;

    @ApiModelProperty("源单类型")
    @TableField("source_order_type")
    private String sourceOrderType;

    @ApiModelProperty("源单类型名称")
    @TableField(exist = false)
    private String sourceOrderTypeName;

    @ApiModelProperty("源单单号")
    @TableField("source_id")
    private String sourceId;

    @ApiModelProperty("源单单号")
    @TableField("source_code")
    private String sourceCode;

    @ApiModelProperty("源单物料明细ID")
    @TableField("source_material_id")
    private String sourceMaterialId;

    @ApiModelProperty("源单物料明细行号")
    @TableField("source_material_line_number")
    private Long sourceMaterialLineNumber;

    @ApiModelProperty("源单发货明细ID")
    @TableField("source_delivery_id")
    private String sourceDeliveryId;

    @ApiModelProperty("源单发货明细行号")
    @TableField("source_delivery_line_number")
    private Long sourceDeliveryLineNumber;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("扩展1")
    @TableField("ext_1")
    private String ext1;

    @ApiModelProperty("行状态[0:关闭;1:正常]")
    @TableField("enable")
    private Integer enable;

    @ApiModelProperty("行状态名称")
    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("已出库数量")
    @TableField("stock_out_quantity")
    private BigDecimal stockOutQuantity;

    @ApiModelProperty("出库占用数量")
    @TableField("stock_out_occupied_quantity")
    private BigDecimal stockOutOccupiedQuantity;

    @ApiModelProperty("剩余未出数量")
    @TableField("remain_stock_out_quantity")
    private BigDecimal remainStockOutQuantity;

    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;

    @ApiModelProperty("源销售订单订货客户id")
    @TableField("source_order_customer_id")
    private String sourceOrderCustomerId;

    @ApiModelProperty("源销售订单订货客户名称")
    @TableField("source_order_customer_name")
    private String sourceOrderCustomerName;

    @ApiModelProperty("发货检验")
    @TableField("is_delivery_inspection")
    private String isDeliveryInspection;

    @ApiModelProperty("周转箱物料编码ID")
    @TableField("box_material_id")
    private String boxMaterialId;

    @ApiModelProperty("周转箱物料编码")
    @TableField("box_material_code")
    private String boxMaterialCode;

    @ApiModelProperty("周转箱物料类型")
    @TableField("box_material_type")
    private String boxMaterialType;

    @ApiModelProperty("周转箱物料名称")
    @TableField("box_material_name")
    private String boxMaterialName;

    @ApiModelProperty("周转箱数量")
    @TableField("box_material_quantity")
    private BigDecimal boxMaterialQuantity;

    @ApiModelProperty("扩展字段1")
    @TableField("ext_field1")
    private String extField1;

    @ApiModelProperty("扩展字段2")
    @TableField("ext_field2")
    private String extField2;

    @ApiModelProperty("周转箱物料库存单位id")
    @TableField(exist = false)
    private String boxMaterialUnitId;

    @ApiModelProperty("周转箱物料库存单位精度")
    @TableField(exist = false)
    private Integer boxMaterialUnitAccuracy;

    @ApiModelProperty("周转箱物料库存单位id")
    @TableField(exist = false)
    private String boxMaterialUnitRoundoffType;

    @ApiModelProperty("物料标准装箱量")
    @TableField(exist = false)
    private BigDecimal boxQuantity;

    @TableField(exist = false)
    private String materialSpecific;

    @TableField(exist = false)
    private BigDecimal basicAvailableQuantity;

    @TableField(exist = false)
    private List<PsiDeliveryPacking> packingList;

    @ApiModelProperty("计价单位")
    @TableField("pricing_unit_id")
    private String pricingUnitId;
    @ApiModelProperty("计价单位编码")
    @TableField("pricing_unit_code")
    private String pricingUnitCode;
    @ApiModelProperty("计价单位名称")
    @TableField("pricing_unit_name")
    private String pricingUnitName;
    @ApiModelProperty("计价单位精度")
    @TableField("pricing_unit_accuracy")
    private Integer pricingUnitAccuracy;
    @ApiModelProperty("计价单位舍入类型")
    @TableField("pricing_unit_round_off_type")
    private Integer pricingUnitRoundOffType;

    @TableField("pricing_number")
    private BigDecimal pricingNumber;

    @ApiModelProperty("单价")
    @TableField("price")
    private BigDecimal price;
    @TableField(exist = false)
    private String priceFormat;

    @ApiModelProperty("税种ID")
    @TableField("tax_id")
    private String taxId;

    @ApiModelProperty("税率精度")
    @TableField("tax_accuracy")
    private Integer taxAccuracy;

    @ApiModelProperty("税种名称")
    @TableField("tax_name")
    private String taxName;

    @ApiModelProperty("订货客户税种分类")
    @TableField("tax_type")
    private String taxType;

    @ApiModelProperty("税率")
    @TableField("tax_rate")
    private String taxRate;

    @ApiModelProperty("含税单价")
    @TableField("price_including_tax")
    private BigDecimal priceIncludingTax;
    @TableField(exist = false)
    private String priceIncludingTaxFormat;

    @ApiModelProperty("金额")
    @TableField("amount")
    private BigDecimal amount;
    @TableField(exist = false)
    private String amountFormat;

    @ApiModelProperty("金额(本位币)")
    @TableField("base_currency_amount")
    private BigDecimal baseCurrencyAmount;
    @TableField(exist = false)
    private String baseCurrencyAmountFormat;

    @ApiModelProperty("税额")
    @TableField("tax_amount")
    private BigDecimal taxAmount;
    @TableField(exist = false)
    private String taxAmountFormat;

    @ApiModelProperty("税额(本位币)")
    @TableField("base_currency_tax_amount")
    private BigDecimal baseCurrencyTaxAmount;
    @TableField(exist = false)
    private String baseCurrencyTaxAmountFormat;

    @ApiModelProperty("含税合计")
    @TableField("amount_including_tax")
    private BigDecimal amountIncludingTax;
    @TableField(exist = false)
    private String amountIncludingTaxFormat;

    @ApiModelProperty("含税合计(本位币)")
    @TableField("base_currency_amount_including_tax")
    private BigDecimal baseCurrencyAmountIncludingTax;
    @TableField(exist = false)
    private String baseCurrencyAmountIncludingTaxFormat;

    @ApiModelProperty("特征属性列表")
    @TableField(exist = false)
    private List<PsiDeliveryNotifyOrderMaterialCharacteristic> materialCharacteristicList;


    /**
     * 物料扩展规格属性
     */
    @ApiModelProperty("备注1")
    @TableField(exist = false)
    private String remark1;
    @ApiModelProperty("备注2")
    @TableField(exist = false)
    private String remark2;
    @ApiModelProperty("扩展规格属性分类一")
    @TableField(exist = false)
    private String extFl1;
    @ApiModelProperty("扩展规格属性分类二")
    @TableField(exist = false)
    private String extFl2;
    @ApiModelProperty("扩展规格属性分类三")
    @TableField(exist = false)
    private String extFl3;
    @ApiModelProperty("扩展规格属性分类四")
    @TableField(exist = false)
    private String extFl4;
    @ApiModelProperty("扩展规格属性分类五")
    @TableField(exist = false)
    private String extFl5;
    @ApiModelProperty("扩展规格属性分类六")
    @TableField(exist = false)
    private String extFl6;
    @ApiModelProperty("扩展规格属性分类七")
    @TableField(exist = false)
    private String extFl7;
    @ApiModelProperty("扩展规格属性分类八")
    @TableField(exist = false)
    private String extFl8;
    @ApiModelProperty("扩展规格属性分类九")
    @TableField(exist = false)
    private String extFl9;
    @ApiModelProperty("扩展规格属性分类十")
    @TableField(exist = false)
    private String extFl10;
    @ApiModelProperty("扩展规格属性分类十一")
    @TableField(exist = false)
    private String extFl11;
    @ApiModelProperty("扩展规格属性分类十二")
    @TableField(exist = false)
    private String extFl12;
    @ApiModelProperty("扩展规格属性分类十三")
    @TableField(exist = false)
    private String extFl13;
    @ApiModelProperty("扩展规格属性分类十四")
    @TableField(exist = false)
    private String extFl14;
    @ApiModelProperty("扩展规格属性分类十五")
    @TableField(exist = false)
    private String extFl15;
    @ApiModelProperty("扩展规格属性分类十六")
    @TableField(exist = false)
    private String extFl16;
    @ApiModelProperty("扩展规格属性分类十七")
    @TableField(exist = false)
    private String extFl17;
    @ApiModelProperty("扩展规格属性分类十八")
    @TableField(exist = false)
    private String extFl18;
    @ApiModelProperty("扩展规格属性分类十九")
    @TableField(exist = false)
    private String extFl19;
    @ApiModelProperty("扩展规格属性分类二十")
    @TableField(exist = false)
    private String extFl20;
    @ApiModelProperty("扩展规格属性分类二十一")
    @TableField(exist = false)
    private String extFl21;
    @ApiModelProperty("扩展规格属性分类二十二")
    @TableField(exist = false)
    private String extFl22;
    @ApiModelProperty("扩展规格属性分类二十三")
    @TableField(exist = false)
    private String extFl23;
    @ApiModelProperty("扩展规格属性分类二十四")
    @TableField(exist = false)
    private String extFl24;
    @ApiModelProperty("扩展规格属性分类二十五")
    @TableField(exist = false)
    private String extFl25;
    @ApiModelProperty("扩展规格属性分类二十六")
    @TableField(exist = false)
    private String extFl26;
    @ApiModelProperty("扩展规格属性分类二十七")
    @TableField(exist = false)
    private String extFl27;
    @ApiModelProperty("扩展规格属性分类二十八")
    @TableField(exist = false)
    private String extFl28;
    @ApiModelProperty("扩展规格属性分类二十九")
    @TableField(exist = false)
    private String extFl29;
    @ApiModelProperty("扩展规格属性分类三十")
    @TableField(exist = false)
    private String extFl30;
    @ApiModelProperty("扩展规格属性分类三十一")
    @TableField(exist = false)
    private String extFl31;
    @ApiModelProperty("扩展规格属性分类三十二")
    @TableField(exist = false)
    private String extFl32;
    @ApiModelProperty("扩展规格属性分类一")
    @TableField(exist = false)
    private String extFlName1;
    @ApiModelProperty("扩展规格属性分类二")
    @TableField(exist = false)
    private String extFlName2;
    @ApiModelProperty("扩展规格属性分类三")
    @TableField(exist = false)
    private String extFlName3;
    @ApiModelProperty("扩展规格属性分类四")
    @TableField(exist = false)
    private String extFlName4;
    @ApiModelProperty("扩展规格属性分类五")
    @TableField(exist = false)
    private String extFlName5;
    @ApiModelProperty("扩展规格属性分类六")
    @TableField(exist = false)
    private String extFlName6;
    @ApiModelProperty("扩展规格属性分类七")
    @TableField(exist = false)
    private String extFlName7;
    @ApiModelProperty("扩展规格属性分类八")
    @TableField(exist = false)
    private String extFlName8;
    @ApiModelProperty("扩展规格属性分类九")
    @TableField(exist = false)
    private String extFlName9;
    @ApiModelProperty("扩展规格属性分类十")
    @TableField(exist = false)
    private String extFlName10;
    @ApiModelProperty("扩展规格属性分类十一")
    @TableField(exist = false)
    private String extFlName11;
    @ApiModelProperty("扩展规格属性分类十二")
    @TableField(exist = false)
    private String extFlName12;
    @ApiModelProperty("扩展规格属性分类十三")
    @TableField(exist = false)
    private String extFlName13;
    @ApiModelProperty("扩展规格属性分类十四")
    @TableField(exist = false)
    private String extFlName14;
    @ApiModelProperty("扩展规格属性分类十五")
    @TableField(exist = false)
    private String extFlName15;
    @ApiModelProperty("扩展规格属性分类十六")
    @TableField(exist = false)
    private String extFlName16;
    @ApiModelProperty("扩展规格属性分类十七")
    @TableField(exist = false)
    private String extFlName17;
    @ApiModelProperty("扩展规格属性分类十八")
    @TableField(exist = false)
    private String extFlName18;
    @ApiModelProperty("扩展规格属性分类十九")
    @TableField(exist = false)
    private String extFlName19;
    @ApiModelProperty("扩展规格属性分类二十")
    @TableField(exist = false)
    private String extFlName20;
    @ApiModelProperty("扩展规格属性分类二十一")
    @TableField(exist = false)
    private String extFlName21;
    @ApiModelProperty("扩展规格属性分类二十二")
    @TableField(exist = false)
    private String extFlName22;
    @ApiModelProperty("扩展规格属性分类二十三")
    @TableField(exist = false)
    private String extFlName23;
    @ApiModelProperty("扩展规格属性分类二十四")
    @TableField(exist = false)
    private String extFlName24;
    @ApiModelProperty("扩展规格属性分类二十五")
    @TableField(exist = false)
    private String extFlName25;
    @ApiModelProperty("扩展规格属性分类二十六")
    @TableField(exist = false)
    private String extFlName26;
    @ApiModelProperty("扩展规格属性分类二十七")
    @TableField(exist = false)
    private String extFlName27;
    @ApiModelProperty("扩展规格属性分类二十八")
    @TableField(exist = false)
    private String extFlName28;
    @ApiModelProperty("扩展规格属性分类二十九")
    @TableField(exist = false)
    private String extFlName29;
    @ApiModelProperty("扩展规格属性分类三十")
    @TableField(exist = false)
    private String extFlName30;
    @ApiModelProperty("扩展规格属性分类三十一")
    @TableField(exist = false)
    private String extFlName31;
    @ApiModelProperty("扩展规格属性分类三十二")
    @TableField(exist = false)
    private String extFlName32;


    @ApiModelProperty("扩展字段3")
    @TableField(exist = false)
    private String extField3;

    @ApiModelProperty("扩展字段4")
    @TableField(exist = false)
    private String extField4;

    @ApiModelProperty("扩展字段5")
    @TableField(exist = false)
    private String extField5;

    @ApiModelProperty("扩展字段6")
    @TableField(exist = false)
    private String extField6;

    @ApiModelProperty("扩展字段7")
    @TableField(exist = false)
    private String extField7;

    @ApiModelProperty("扩展字段8")
    @TableField(exist = false)
    private String extField8;

    @ApiModelProperty("扩展字段9")
    @TableField(exist = false)
    private String extField9;

    @ApiModelProperty("扩展字段10")
    @TableField(exist = false)
    private String extField10;


    @TableField(exist = false)
    private String reservationStoreId;
    @TableField(exist = false)
    private String reservationStoreName;
    @TableField(exist = false)
    private String reservationAreaId;
    @TableField(exist = false)
    private String reservationAreaName;
    @TableField(exist = false)
    private String reservationPositionId;
    @TableField(exist = false)
    private String reservationPositionName;
    @TableField(exist = false)
    private String reservationBatchNumber;
    @TableField(exist = false)
    private String reservationSpecific;

    @TableField(exist = false)
    private List<PsiDeliveryNotifyOrderMaterial> children;
    @TableField("substitute_detail_id")
    private String substituteDetailId;
    @TableField("substituted_id")
    private String substitutedId;
    @TableField("is_substitution")
    private Integer isSubstitution;

    @ApiModelProperty("销售订单单据日期,快捷导入用到")
    @TableField(exist = false)
    private LocalDateTime sourceOrderTime;

    @ApiModelProperty("图号")
    @TableField(exist = false)
    private String drawingNumber;
}

package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 调拨单单物料明细
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-03-05
 */
@Getter
@Setter
@TableName("psi_transfer_order_material")
@ApiModel(value = "PsiTransferOrderMaterial对象", description = "调拨单单物料明细")
public class PsiTransferOrderMaterial extends BaseEntity {
    /**
     * -----以下为表头信息------
     **/
    @ApiModelProperty("单据编号")
    @TableField(exist = false)
    private String code;

    @ApiModelProperty("附件id")
    @TableField(exist = false)
    private String enclosureIds;

    @ApiModelProperty("附件")
    @TableField(exist = false)
    private List<CommonFile> enclosureFiles;

    @ApiModelProperty("单据类别ID")
    @TableField(exist = false)
    private String orderCategoryId;

    @ApiModelProperty("单据类别编码")
    @TableField(exist = false)
    private String orderCategoryCode;

    @ApiModelProperty("单据类别名称")
    @TableField(exist = false)
    private String orderCategoryName;

    @ApiModelProperty("业务类型ID")
    @TableField(exist = false)
    private String businessId;

    @ApiModelProperty("业务类型名称")
    @TableField(exist = false)
    private String businessName;

    @ApiModelProperty("单据日期")
    @TableField(exist = false)
    private LocalDateTime orderTime;

    @ApiModelProperty("单据日期")
    @TableField(exist = false)
    private String orderTimeStr;
    @ApiModelProperty("仓库部门ID")
    @TableField(exist = false)
    private String storeOrgId;

    @ApiModelProperty("仓库部门名称")
    @TableField(exist = false)
    private String storeOrgName;

    @ApiModelProperty("库管员ID")
    @TableField(exist = false)
    private String storeUserId;

    @ApiModelProperty("库管员名称")
    @TableField(exist = false)
    private String storeUserName;

    @ApiModelProperty("库管员名称")
    @TableField(exist = false)
    private String remark;

    @ApiModelProperty("调拨方向 1: 发出 2: 退回")
    @TableField(exist = false)
    private String transferDirection;
    @TableField(exist = false)
    @ApiModelProperty("调拨方向中文")
    private String transferDirectionName;

    @ApiModelProperty("本位币ID")
    @TableField(exist = false)
    private String baseCurrencyId;

    @ApiModelProperty("本位币名称")
    @TableField(exist = false)
    private String baseCurrencyName;

    @ApiModelProperty("本位币金额精度")
    @TableField(exist = false)
    private Integer baseCurrencyAmountAccuracy;

    @ApiModelProperty("本位币单价精度")
    @TableField(exist = false)
    private Integer baseCurrencyPriceAccuracy;

    @ApiModelProperty("本位币舍入类型")
    @TableField(exist = false)
    private Integer baseCurrencyRoundOffType;

    @ApiModelProperty("结算方式ID")
    @TableField(exist = false)
    private String settlementMethodId;

    @ApiModelProperty("结算方式名称")
    @TableField(exist = false)
    private String settlementMethodName;

    @ApiModelProperty("收款条件ID")
    @TableField(exist = false)
    private String paymentConditionId;

    @ApiModelProperty("收款条件名称")
    @TableField(exist = false)
    private String paymentConditionName;

    @ApiModelProperty("订货客户ID")
    @TableField(exist = false)
    private String orderCustomerId;

    @ApiModelProperty("订货客户名称")
    @TableField(exist = false)
    private String orderCustomerName;

    @ApiModelProperty("单据状态")
    @TableField(exist = false)
    private Integer status;
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("作废状态")
    @TableField(exist = false)
    private String cancelStatus;
    @TableField(exist = false)
    private String cancelStatusName;

    @ApiModelProperty("开启关闭状态")
    @TableField(exist = false)
    private Integer enable;
    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("过账时间")
    @TableField(exist = false)
    private LocalDateTime realPostingTime;

    @ApiModelProperty("过账时间")
    @TableField(exist = false)
    private LocalDateTime postingTime;
    @TableField(exist = false)
    private String postingTimeStr;

    @ApiModelProperty("过账人")
    @TableField(exist = false)
    private String realPostingUser;

    @ApiModelProperty("过账人名称")
    @TableField(exist = false)
    private String realPostingUserName;

    @ApiModelProperty("关闭时间")
    @TableField(exist = false)
    private LocalDateTime disableTime;

    @ApiModelProperty("关闭人")
    @TableField(exist = false)
    private String disableUser;

    @ApiModelProperty("关闭人名称")
    @TableField(exist = false)
    private String disableUserName;

    @ApiModelProperty("审核时间")
    @TableField(exist = false)
    private LocalDateTime auditTime;

    @ApiModelProperty("审核人")
    @TableField(exist = false)
    private String auditUser;

    @ApiModelProperty("审核人名称")
    @TableField(exist = false)
    private String auditUserName;
    /**
     * -----以上为表头信息------
     **/

    @ApiModelProperty("调拨单ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Long lineNumber;

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

    // PDA扫码调拨时传了这个字段
    @ApiModelProperty("特征属性名称")
    @TableField(exist = false)
    private String materialSpecificName;

    @ApiModelProperty("库存单位ID")
    @TableField("store_unit_id")
    private String storeUnitId;

    @ApiModelProperty("库存单位名称")
    @TableField("store_unit_name")
    private String storeUnitName;

    @ApiModelProperty("库存单位精度")
    @TableField("store_unit_accuracy")
    private Integer storeUnitAccuracy;

    @ApiModelProperty("库存单位舍入类型")
    @TableField("store_unit_round_off_type")
    private Integer storeUnitRoundOffType;

    @ApiModelProperty("调拨数量")
    @TableField("transfer_quantity")
    private BigDecimal transferQuantity;

    @ApiModelProperty("应出库数量")
    @TableField("plan_stock_out_quantity")
    private BigDecimal planStockOutQuantity;

    @ApiModelProperty("可用库存量")
    @TableField("available_quantity")
    private BigDecimal availableQuantity;

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

    @ApiModelProperty("周转箱调出仓库id")
    @TableField("box_material_out_store_id")
    private String boxMaterialOutStoreId;

    @ApiModelProperty("周转箱调出仓库name")
    @TableField("box_material_out_store_name")
    private String boxMaterialOutStoreName;

    @ApiModelProperty("周转箱调入仓库id")
    @TableField("box_material_in_store_id")
    private String boxMaterialInStoreId;

    @ApiModelProperty("周转箱调入仓库name")
    @TableField("box_material_in_store_name")
    private String boxMaterialInStoreName;

    @ApiModelProperty("调出仓库ID")
    @TableField("stock_out_store_id")
    private String stockOutStoreId;

    @TableField(exist = false)
    @ApiModelProperty("调出仓库是否开启库区管理 Y:是")
    private String stockOutStoreEnableArea;

    @ApiModelProperty("调出仓库name")
    @TableField("stock_out_store_name")
    private String stockOutStoreName;

    @ApiModelProperty("调出库区ID")
    @TableField("stock_out_area_id")
    private String stockOutAreaId;
    @TableField(exist = false)
    @ApiModelProperty("调出仓库是否开启库位管理 Y:是")
    private String stockOutAreaEnablePosition;

    @ApiModelProperty("调出库区名称")
    @TableField("stock_out_area_name")
    private String stockOutAreaName;

    @ApiModelProperty("调出库位ID")
    @TableField("stock_out_position_id")
    private String stockOutPositionId;

    @ApiModelProperty("调出库位名称")
    @TableField("stock_out_position_name")
    private String stockOutPositionName;

    @ApiModelProperty("调入仓库ID")
    @TableField("stock_in_store_id")
    private String stockInStoreId;
    @TableField(exist = false)
    @ApiModelProperty("调入仓库是否开启库区管理 Y:是")
    private String stockInStoreEnableArea;

    @ApiModelProperty("调入仓库name")
    @TableField("stock_in_store_name")
    private String stockInStoreName;

    @ApiModelProperty("调入库区ID")
    @TableField("stock_in_area_id")
    private String stockInAreaId;
    @TableField(exist = false)
    @ApiModelProperty("调入库区是否开启库位管理 Y:是")
    private String stockInAreaEnablePosition;

    @ApiModelProperty("调入库区名称")
    @TableField("stock_in_area_name")
    private String stockInAreaName;

    @ApiModelProperty("调入库位ID")
    @TableField("stock_in_position_id")
    private String stockInPositionId;

    @ApiModelProperty("调入库位名称")
    @TableField("stock_in_position_name")
    private String stockInPositionName;

    @ApiModelProperty("批号")
    @TableField("batch_number")
    private String batchNumber;
    @ExcelIgnore
    @ApiModelProperty("批号控制方式")
    @TableField("lot_no_control_type")
    private String lotNoControlType;
    @ExcelIgnore
    @ApiModelProperty("批号应用范围")
    @TableField("lot_no_scope")
    private String lotNoScope;

    @ApiModelProperty("生产日期")
    @TableField("production_date")
    private LocalDateTime productionDate;

    @ApiModelProperty("保质期到期日")
    @TableField("expiration_date")
    private LocalDateTime expirationDate;

    @ApiModelProperty("退货类型（调拨方向为退货时才有值） 1: 直接退货 2: 退货补货")
    @TableField("return_type")
    private String returnType;
    @TableField(exist = false)
    @ApiModelProperty("退货类型")
    private String returnTypeName;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String rowRemark;

    @ApiModelProperty("入库类型")
    @TableField("stock_in_type")
    private String stockInType;

    @ApiModelProperty("特征属性列表")
    @TableField(exist = false)
    private List<PsiTransferOrderMaterialCharacteristic> materialCharacteristics;

    @ApiModelProperty("拣货策略")
    @TableField("pick_strategy")
    private String pickStrategy;

    @ApiModelProperty("物料特征规格")
    @TableField("material_specific")
    private String materialSpecific;

    /**
     * -----------以下均为销售订单相关字段-------------
     **/

    @ApiModelProperty("参考单位ID")
    @TableField(exist = false)
    private String referenceUnitId;

    @ApiModelProperty("参考单位名称")
    @TableField(exist = false)
    private String referenceUnitName;

    @ApiModelProperty("参考单位精度")
    @TableField(exist = false)
    private Integer referenceUnitAccuracy;

    @ApiModelProperty("参考单位舍入方式")
    @TableField(exist = false)
    private String referenceUnitRoundOffType;

    @ApiModelProperty("参考单位与库存单位比例")
    @TableField(exist = false)
    private BigDecimal referenceUnitRate;

    @ApiModelProperty("参考数量")
    @TableField(exist = false)
    private BigDecimal referenceQuantity;

    @ApiModelProperty("销售单位ID")
    @TableField(exist = false)
    private String saleUnitId;

    @ApiModelProperty("销售单位精度")
    @TableField(exist = false)
    private Integer saleUnitAccuracy;

    @ApiModelProperty("销售单位舍入类型")
    @TableField(exist = false)
    private Integer saleUnitRoundOffType;

    @ApiModelProperty("销售单位名称")
    @TableField(exist = false)
    private String saleUnitName;

    @ApiModelProperty("销售数量")
    @TableField(exist = false)
    private BigDecimal saleQuantity;

    @ApiModelProperty("已开票数量")
    @TableField(exist = false)
    private BigDecimal invoicedQuantity;

    @ApiModelProperty("开票占用数量")
    @TableField(exist = false)
    private BigDecimal invoicedOccupyQuantity;

    @ApiModelProperty("未开票数量 包括占用数量")
    @TableField(exist = false)
    private BigDecimal unvoicedQuantity;

    @ApiModelProperty("可开票数量")
    @TableField(exist = false)
    private BigDecimal invoicedAbleQuantity;

    @ApiModelProperty("已退货申请数量")
    @TableField(exist = false)
    private BigDecimal returnQuantity;

    @ApiModelProperty("退货申请占用数量")
    @TableField(exist = false)
    private BigDecimal returnOccupyQuantity;

    @ApiModelProperty("剩余可退货申请数量")
    @TableField(exist = false)
    private BigDecimal remainReturnQuantity;

    @ApiModelProperty("开票未税金额")
    @TableField(exist = false)
    private BigDecimal invoicedUnpaidTaxAmount;

    @ApiModelProperty("未开票未税金额")
    @TableField(exist = false)
    private BigDecimal unvoicedUnpaidTaxAmount;

    @ApiModelProperty("源单据类别编码")
    @TableField(exist = false)
    private String sourceOrderCategoryCode;

    @ApiModelProperty("源单主数据ID")
    @TableField(exist = false)
    private String sourceId;

    @ApiModelProperty("源单物料明细单号")
    @TableField(exist = false)
    private String sourceDetailCode;

    @ApiModelProperty("明细行关联的source表id")
    @TableField(exist = false)
    private String detailSourceId;

    @ApiModelProperty("单价")
    @TableField(exist = false)
    private BigDecimal price;

    @ApiModelProperty("含税单价")
    @TableField(exist = false)
    private BigDecimal priceIncludingTax;

    @ApiModelProperty("税种ID")
    @TableField(exist = false)
    private String taxId;

    @ApiModelProperty("税种分类")
    @TableField(exist = false)
    private String taxType;

    @ApiModelProperty("税种名称")
    @TableField(exist = false)
    private String taxName;

    @ApiModelProperty("税率")
    @TableField(exist = false)
    private String taxRate;

    @ApiModelProperty("税种精度")
    @TableField(exist = false)
    private Integer taxAccuracy;

    @ApiModelProperty("税额")
    @TableField(exist = false)
    private BigDecimal taxAmount;
    @TableField(exist = false)
    @ApiModelProperty("金额")
    private BigDecimal amount;
    @ApiModelProperty("金额(本位币)")
    @TableField(exist = false)
    private BigDecimal baseCurrencyAmount;

    @ApiModelProperty("税额(本位币)")
    @TableField(exist = false)
    private BigDecimal baseCurrencyTaxAmount;

    @ApiModelProperty("含税合计")
    @TableField(exist = false)
    private BigDecimal amountIncludingTax;

    @ApiModelProperty("含税合计(本位币)")
    @TableField(exist = false)
    private BigDecimal baseCurrencyAmountIncludingTax;

    @ApiModelProperty("结算客户id")
    @TableField(exist = false)
    private String settlementCustomerId;

    @ApiModelProperty("结算客户name")
    @TableField(exist = false)
    private String settlementCustomerName;

    @ApiModelProperty("结算币种id")
    @TableField(exist = false)
    private String currencyId;

    @ApiModelProperty("结算币种id")
    @TableField(exist = false)
    private String currencyName;

    @ApiModelProperty("结算币种金额精度")
    @TableField(exist = false)
    private Integer currencyAmountAccuracy;

    @ApiModelProperty("结算币种单价精度")
    @TableField(exist = false)
    private Integer currencyPriceAccuracy;

    @ApiModelProperty("结算币种舍入类型")
    @TableField(exist = false)
    private Integer currencyRoundOffType;

    @ApiModelProperty("结算币种符号")
    @TableField(exist = false)
    private String currencySymbol;

    @ApiModelProperty("本位币种符号")
    @TableField(exist = false)
    private String baseCurrencySymbol;

    @ApiModelProperty("基本单位ID")
    @TableField(exist = false)
    private String basicUnitId;

    @ApiModelProperty("基本单位名称")
    @TableField(exist = false)
    private String basicUnitName;

    @ApiModelProperty("基本单位精度")
    @TableField(exist = false)
    private Integer basicUnitAccuracy;

    @ApiModelProperty("基本单位舍入方式")
    @TableField(exist = false)
    private String basicUnitRoundOffType;

    @ApiModelProperty("基本单位与库存单位比例")
    @TableField(exist = false)
    private BigDecimal basicUnitRate;

    @ApiModelProperty("基本数量")
    @TableField(exist = false)
    private BigDecimal basicQuantity;

    @ApiModelProperty("库存单位ID")
    @TableField(exist = false)
    private String inventoryUnitId;

    @ApiModelProperty("库存单位名称")
    @TableField(exist = false)
    private String inventoryUnitName;

    @ApiModelProperty("库存单位精度")
    @TableField(exist = false)
    private Integer inventoryUnitAccuracy;

    @ApiModelProperty("库存单位舍入类型")
    @TableField(exist = false)
    private Integer inventoryUnitRoundOffType;

    @ApiModelProperty("汇率表ID")
    @TableField(exist = false)
    private String exchangeRateId;

    @ApiModelProperty("汇率表名称")
    @TableField(exist = false)
    private String exchangeRateName;

    @ApiModelProperty("汇率")
    @TableField(exist = false)
    private String exchangeRate;

    @TableField(exist = false)
    private String detailCode;

    @TableField(exist = false)
    private String sourceDeliveryId;

    @ApiModelProperty("批号入库日期")
    @TableField("batch_stock_in_date")
    private LocalDateTime batchStockInDate;

    @ApiModelProperty("销售发票查询寄售调拨单时的源明细列表")
    @TableField(exist = false)
    private List<PsiTransferOrderMaterial> sources;

    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;

    @ApiModelProperty("源销售订单订货客户id")
    @TableField("source_order_customer_id")
    private String sourceOrderCustomerId;

    @ApiModelProperty("源销售订单订货客户名称")
    @TableField("source_order_customer_name")
    private String sourceOrderCustomerName;

    @ApiModelProperty("源单类型")
    @TableField("source_order_type")
    private String sourceOrderType;

    @TableField(exist = false)
    private String sourceOrderTypeName;

    @ApiModelProperty("源单据类别ID")
    @TableField("source_order_category_id")
    private String sourceOrderCategoryId;

    @ApiModelProperty("源单据类别名称")
    @TableField("source_order_category_name")
    private String sourceOrderCategoryName;

    @ApiModelProperty("源单主键")
    @TableField("source_order_id")
    private String sourceOrderId;

    @ApiModelProperty("源单编码")
    @TableField("source_order_code")
    private String sourceOrderCode;

    @ApiModelProperty("源单明细主键")
    @TableField("source_detail_id")
    private String sourceDetailId;

    @ApiModelProperty("源单行号")
    @TableField("source_line_number")
    private Long sourceLineNumber;

    @ApiModelProperty("源出货通知单表体id")
    @TableField(exist = false)
    private String sourceNotifyDetailId;

    @ApiModelProperty("源销售订单表体id")
    @TableField(exist = false)
    private String sourceSaleOrderDetailId;

    @ApiModelProperty("源寄售调拨单表头id 仅退回方向的调拨单适用")
    @TableField(exist = false)
    private String sourceTransferOrderId;

    @TableField(exist = false)
    @ApiModelProperty(hidden = true)
    private PsiTransferOrder order;

    @TableField(exist = false)
    @ApiModelProperty(hidden = true)
    private String projectCode;
    @TableField(exist = false)
    private String contractCode;

    @TableField(exist = false)
    @ApiModelProperty(hidden = true)
    private PsiTransferOrderSource source;
    @TableField(exist = false)
    private String isMateialDemand;

    @TableField(exist = false)
    private List<PsiStoreMaterialSpecific> specificList;

    /**
     * 物料扩展规格属性
     */
    @ApiModelProperty("备注一")
    @TableField(exist = false)
    private String remark1;
    @ApiModelProperty("备注二")
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

    @ApiModelProperty("扩展字段1")
    @TableField(exist = false)
    private String extField1;

    @ApiModelProperty("扩展字段2")
    @TableField(exist = false)
    private String extField2;

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
}

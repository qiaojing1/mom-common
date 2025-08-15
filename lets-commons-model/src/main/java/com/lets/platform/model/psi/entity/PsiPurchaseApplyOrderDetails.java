package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.common.pojo.annotation.ValidBigDecimal;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 * 采购价目表明细
 *
 * @author csy
 * @since 2023-11-23
 */
@Getter
@Setter
@TableName("psi_purchase_apply_order_details")
@ApiModel(value = "PsiPurchaseApplyOrderDetails对象", description = "采购价目表明细")
public class PsiPurchaseApplyOrderDetails extends BaseEntity {

    @TableField(exist = false)
    @ExcelIgnore
    private Integer index;

    @TableField(exist = false)
    private String orderStatus;

    @TableField(exist = false)
    @ExcelProperty("单据编号")
    private String orderCode;

    @TableField(exist = false)
    @ExcelProperty("申请日期")
    private LocalDateTime applyTime;

    @ApiModelProperty("采购价目表ID")
    @TableField("order_id")
    @ExcelIgnore
    private String orderId;

    @ApiModelProperty("行号")
    @TableField("line_number")
    @ExcelIgnore
    private Integer lineNumber;

    @ApiModelProperty("物料编码ID")
    @TableField("material_id")
    @ExcelIgnore
    private String materialId;

    @ApiModelProperty("物料编码")
    @TableField("material_code")
    @ExcelProperty("物料编码")
    private String materialCode;

    @ApiModelProperty("物料名称")
    @TableField("material_name")
    @ExcelIgnore
    private String materialName;

    @ApiModelProperty("物料规格型号")
    @TableField("material_specs")
    @ExcelIgnore
    private String materialSpecs;

    /**
     * @see com.lets.platform.model.psi.enums.MaterialTypeEnum
     */
    @ExcelIgnore
    @ApiModelProperty("物料类型")
    @TableField("material_type")
    private String materialType;

    @ExcelIgnore
    @ApiModelProperty("是否可采购")
    @TableField("purchasable")
    private Integer purchasable;

    @ApiModelProperty("特征属性名称")
    @TableField("material_characteristic_names")
    @ExcelIgnore
    private String materialCharacteristicNames;

    @ApiModelProperty("采购单位ID")
    @TableField("purchase_unit")
    @ExcelIgnore
    private String purchaseUnit;

    @ApiModelProperty("采购单位code")
    @TableField("purchase_unit_code")
    @ExcelIgnore
    private String purchaseUnitCode;

    @ApiModelProperty("采购单位名称")
    @TableField("purchase_unit_name")
    @ExcelProperty("采购单位")
    private String purchaseUnitName;

    @ApiModelProperty("采购单位精度")
    @TableField("purchase_unit_accuracy")
    @ExcelIgnore
    private Integer purchaseUnitAccuracy;

    @ApiModelProperty("采购单位舍入类型")
    @TableField("purchase_unit_round_off_type")
    @ExcelIgnore
    private Integer purchaseUnitRoundOffType;

    @ApiModelProperty("可用库存数量")
    @TableField("available_number")
    @ExcelIgnore
    private BigDecimal availableNumber;

    @ApiModelProperty("数量")
    @TableField("number")
    @ExcelIgnore
    @ValidBigDecimal(message = "[数量] 大于0，小于1000000000", required = true, min = "0", max = "10000000000", includeMax = false, includeMin = false, groups = {Save.class, Update.class})
    private BigDecimal number;
    @ExcelProperty("数量")
    @TableField(exist = false)
    private String numberStr;

    @ApiModelProperty("需求日期")
    @TableField("demand_date")
    @ExcelIgnore
    private LocalDate demandDate;
    @ExcelProperty("需求日期")
    @TableField(exist = false)
    private String demandDateStr;

    @ApiModelProperty("采购提前期")
    @TableField("in_advance_days")
    @ExcelIgnore
    private Integer inAdvanceDays;
    @ExcelProperty("采购提前期")
    @TableField(exist = false)
    private String inAdvanceDaysStr;

    @ApiModelProperty("建议采购日期")
    @TableField("advise_date")
    @ExcelIgnore
    private LocalDate adviseDate;
    @ExcelIgnore
    @TableField(exist = false)
    private String adviseDateStr;

    @ExcelIgnore
    @ApiModelProperty("建议供应商")
    @TableField("advise_supplier_id")
    private String adviseSupplierId;

    @ApiModelProperty("建议供应商名称")
    @TableField("advise_supplier_name")
    @ExcelProperty("建议供应商")
    private String adviseSupplierName;

    @ApiModelProperty("备注")
    @TableField("remark")
    @ExcelProperty("备注")
    private String remark;

    /**
     * @see PurchaseApplyOrderSourceEnum
     */
    @ExcelIgnore
    @ApiModelProperty(hidden = true)
    @TableField("order_source")
    private String orderSource;
    @ExcelIgnore
    @ApiModelProperty(hidden = true)
    @TableField("source_order_id")
    private String sourceOrderId;

    @ApiModelProperty("下发数量")
    @ExcelIgnore
    @TableField(exist = false)
    private BigDecimal distributeNumber;
    @ApiModelProperty("已下发数量")
    @ExcelIgnore
    @TableField("already_distribute_number")
    private BigDecimal alreadyDistributeNumber;
    @ExcelIgnore
    @ApiModelProperty("占用数量")
    @TableField("occupy_number")
    private BigDecimal occupyNumber;
    @ApiModelProperty("未下发数量")
    @ExcelIgnore
    @TableField(exist = false)
    private BigDecimal notDistributeNumber;
    @ApiModelProperty(value = "可下发数量", hidden = true)
    @ExcelIgnore
    @TableField(exist = false)
    private BigDecimal canDistributeNumber;
    @ExcelIgnore
    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;
    @ExcelIgnore
    @ApiModelProperty("源销售订单订货客户id")
    @TableField("source_order_customer_id")
    private String sourceOrderCustomerId;
    @ExcelIgnore
    @ApiModelProperty("源销售订单订货客户名称")
    @TableField("source_order_customer_name")
    private String sourceOrderCustomerName;

    @ExcelIgnore
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("可用库存")
    @TableField(exist = false)
    private BigDecimal storeNumber;

    /**
     * @see com.lets.platform.model.base.enums.CloseStatusEnum
     */
    @ExcelIgnore
    @ApiModelProperty("明细关闭状态[01]")
    @TableField("enable")
    private Integer detailEnable;
    @ExcelIgnore
    @TableField(exist = false)
    private String detailEnableName;

    @ExcelIgnore
    @ApiModelProperty("关闭时间")
    @TableField("disable_time")
    private LocalDateTime disableTime;

    @ExcelIgnore
    @ApiModelProperty("关闭人")
    @TableField("disable_user")
    private String disableUser;

    @ExcelIgnore
    @ApiModelProperty("关闭人名称")
    @TableField("disable_user_name")
    private String disableUserName;

    /**
     * 采购申请单下发时带过来的询价单的价格
     */
    @ExcelIgnore
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private BigDecimal price;

    // "含税单价"
    @ExcelIgnore
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private BigDecimal includingTaxPrice;

    // "税种"
    @ExcelIgnore
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String taxId;

    // "税种名称"
    @ExcelIgnore
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String taxName;

    // "税率"
    @ExcelIgnore
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private BigDecimal taxRate;

    // "税种类型"
    @ExcelIgnore
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String taxType;

    // "税种精度"
    @ExcelIgnore
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private Integer taxAccuracy;

    // "金额"
    @ExcelIgnore
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private BigDecimal amount;

    // "价税合计"
    @ExcelIgnore
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private BigDecimal amountIncludingTax;

    // "采购询价单供应商id"
    @ExcelIgnore
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String inquirySupplierId;

    @ExcelIgnore
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String projectCode;

    @ExcelIgnore
    @TableField(exist = false)
    private String contractCode;

    @ExcelIgnore
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private PsiPurchaseApplyOrderDetailDemand purchaseMaterialDemand;

    @ApiModelProperty("是否有技术要求")
    @TableField("is_purchase_material_demand")
    private String isPurchaseMaterialDemand;

    @ExcelIgnore
    @TableField(exist = false)
    private String targetId;

    @ExcelIgnore
    @TableField(exist = false)
    private String targetDetailId;

    @ExcelIgnore
    @TableField(exist = false)
    private String targetCode;

    @TableField(exist = false)
    private LocalDateTime auditTime;

    @ExcelIgnore
    @TableField(exist = false)
    private List<PsiPurchaseApplyMaterialCharacteristic> materialCharacteristicList;

    /**
     * 物料扩展属性
     */
    @TableField(exist = false)
    @ApiModelProperty("扩展规格备注一")
    private String remark1;
    @ApiModelProperty("扩展规格备注二")
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
    @ApiModelProperty("图号")
    @TableField(exist = false)
    private String drawingNumber;
    public BigDecimal alreadyDistributeNumberNotNull() {
        if (Objects.isNull(alreadyDistributeNumber)) {
            return BigDecimal.ZERO;
        } else {
            return alreadyDistributeNumber;
        }
    }

    public BigDecimal numberNotNull() {
        if (Objects.isNull(number)) {
            return BigDecimal.ZERO;
        } else {
            return number;
        }
    }

    public BigDecimal occupyNumberNotNull() {
        if (Objects.isNull(occupyNumber)) {
            return BigDecimal.ZERO;
        } else {
            return occupyNumber;
        }
    }
}

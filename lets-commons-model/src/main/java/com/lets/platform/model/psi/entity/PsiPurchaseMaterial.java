package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Objects;

@Data
@ApiModel(value = "采购物料", description = "物料信息")
public class PsiPurchaseMaterial {

    private String id;

    @ApiModelProperty("物料编码")
    private String code;
    @ApiModelProperty("物料名称")
    private String name;
    @ApiModelProperty("规格型号")
    private String specs;
    @ApiModelProperty("助记码")
    private String mnemonicCode;
    @ApiModelProperty("旧编码")
    private String oldCode;
    @ApiModelProperty("物料属性")
    private String type;
    private String typeName;
    @ApiModelProperty("物料分组")
    private String groupId;
    private String groupName;
    @ApiModelProperty("生命周期")
    private String lifeCycleId;
    private String lifeCycleName;
    @ApiModelProperty("英文名称")
    private String englishName;
    @ApiModelProperty("图号")
    private String drawingNumber;

    @ApiModelProperty("单据状态")
    private Integer status;
    @ApiModelProperty("是否启用[0:禁用;1:启用]")
    private Integer enable;
    @ApiModelProperty("默认税种")
    private String taxId;
    @ApiModelProperty("默认税种名称")
    private String taxName;
    @ApiModelProperty("默认类型")
    private String taxType;
    @ApiModelProperty("默认税率")
    private BigDecimal taxRate;
    @ApiModelProperty("税种精度")
    private Integer taxAccuracy;
    @ApiModelProperty("可采购")
    private Integer purchasable;
    @ApiModelProperty("可存货")
    private Integer storable;

    @ApiModelProperty("采购单位")
    private String purchaseUnitId;
    private String purchaseUnitName;
    private Integer purchaseUnitAccuracy;
    private Integer purchaseUnitRoundOffType;

    @ApiModelProperty("扩展规格备注一")
    private String remark1;
    @ApiModelProperty("扩展规格备注二")
    private String remark2;
    @ApiModelProperty("扩展规格属性分类一")
    private String extFl1;
    @ApiModelProperty("扩展规格属性分类二")
    private String extFl2;
    @ApiModelProperty("扩展规格属性分类三")
    private String extFl3;
    @ApiModelProperty("扩展规格属性分类四")
    private String extFl4;
    @ApiModelProperty("扩展规格属性分类五")
    private String extFl5;
    @ApiModelProperty("扩展规格属性分类六")
    private String extFl6;
    @ApiModelProperty("扩展规格属性分类七")
    private String extFl7;
    @ApiModelProperty("扩展规格属性分类八")
    private String extFl8;
    @ApiModelProperty("扩展规格属性分类九")
    private String extFl9;
    @ApiModelProperty("扩展规格属性分类十")
    private String extFl10;
    @ApiModelProperty("扩展规格属性分类十一")
    private String extFl11;
    @ApiModelProperty("扩展规格属性分类十二")
    private String extFl12;
    @ApiModelProperty("扩展规格属性分类一")
    private String extFlName1;
    @ApiModelProperty("扩展规格属性分类二")
    private String extFlName2;
    @ApiModelProperty("扩展规格属性分类三")
    private String extFlName3;
    @ApiModelProperty("扩展规格属性分类四")
    private String extFlName4;
    @ApiModelProperty("扩展规格属性分类五")
    private String extFlName5;
    @ApiModelProperty("扩展规格属性分类六")
    private String extFlName6;
    @ApiModelProperty("扩展规格属性分类七")
    private String extFlName7;
    @ApiModelProperty("扩展规格属性分类八")
    private String extFlName8;
    @ApiModelProperty("扩展规格属性分类九")
    private String extFlName9;
    @ApiModelProperty("扩展规格属性分类十")
    private String extFlName10;
    @ApiModelProperty("扩展规格属性分类十一")
    private String extFlName11;
    @ApiModelProperty("扩展规格属性分类十二")
    private String extFlName12;

    @ApiModelProperty("超收上限(%)")
    private BigDecimal purchaseOverLimit;
    @ApiModelProperty("超收下限(%)")
    private BigDecimal purchaseUnderLimit;
    @ApiModelProperty("最小采购量")
    private BigDecimal purchaseMinQuantity;
    @ApiModelProperty("采购批量")
    private BigDecimal purchaseLotQuantity;
    /**
     * @see com.lets.platform.model.psi.enums.ControlTypeEnum
     */
    @ApiModelProperty("采购批量控制方式")
    private String purchaseLotControlType;
    /**
     * @see com.lets.platform.model.psi.enums.LotControlTypeEnum
     */
    @ApiModelProperty("批号控制方式")
    private String lotNoControlType;
    /**
     * @see com.lets.platform.model.psi.enums.LotUseRangeEnum
     */
    @ApiModelProperty("批号应用范围")
    private String lotNoScope;
    private String purchaseOrgId;
    private String purchaseUserId;

    @ApiModelProperty("库存单位")
    private String inventoryUnitId;
    @ApiModelProperty("参考单位")
    private String inventoryReferenceUnitId;

    @ApiModelProperty("基础单位")
    private String basicUnitId;
    private String basicUnitCode;
    private String basicUnitName;
    private Integer basicUnitAccuracy;
    private Integer basicUnitRoundOffType;

    @ApiModelProperty("采购计价单位主键")
    @TableField("purchase_pricing_unit_id")
    private String purchasePricingUnitId;
    @ApiModelProperty("采购计价单位编码")
    @TableField("purchase_pricing_unit_code")
    private String purchasePricingUnitCode;
    @ApiModelProperty("采购计价单位名称")
    @TableField("purchase_pricing_unit_name")
    private String purchasePricingUnitName;
    @ApiModelProperty("采购计价单位精度")
    @TableField("purchase_pricing_unit_accuracy")
    private Integer purchasePricingUnitAccuracy;
    @ApiModelProperty("采购计价单位舍入方式")
    @TableField("purchase_pricing_unit_round_off_type")
    private Integer purchasePricingUnitRoundOffType;

    @TableField(exist = false)
    private String isOsqc;

    public BigDecimal purchaseOverLimitNotNull() {
        if (Objects.isNull(purchaseOverLimit)) {
            return BigDecimal.ZERO;
        } else {
            return purchaseOverLimit;
        }
    }
    public BigDecimal purchaseUnderLimitNotNull() {
        if (Objects.isNull(purchaseUnderLimit)) {
            return BigDecimal.ZERO;
        } else {
            return purchaseUnderLimit;
        }
    }

    public BigDecimal taxRateNotNull() {
        if (Objects.isNull(taxRate)) {
            return BigDecimal.ZERO;
        } else {
            return taxRate;
        }
    }
}

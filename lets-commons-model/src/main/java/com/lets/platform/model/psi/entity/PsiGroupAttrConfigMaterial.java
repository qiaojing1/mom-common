package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 物料分组属性配置
 * @author DING WEI
 * @since 2024-07-17
 */
@Getter
@Setter
@TableName("psi_group_attr_config_material")
@ApiModel(value = "PsiGroupAttrConfigMaterial对象", description = "物料分组属性配置")
public class PsiGroupAttrConfigMaterial extends BaseEntity {

    /**
     * @see com.lets.platform.model.psi.enums.MaterialTypeEnum
     */
    @ApiModelProperty("物料类型")
    @TableField("type")
    private String type;

    /**
     * @see com.lets.platform.model.psi.enums.MaterialAssetTypeEnum
     */
    @ApiModelProperty("资产类型")
    @TableField("asset_type")
    private String assetType;

    @ApiModelProperty("基础单位ID")
    @TableField("basic_unit_id")
    private String basicUnitId;
    @ApiModelProperty("基础单位名称")
    @TableField("basic_unit_name")
    private String basicUnitName;

    @ApiModelProperty("可采购")
    @TableField("purchasable")
    private Integer purchasable;
    @ApiModelProperty("可销售")
    @TableField("salable")
    private Integer salable;
    @ApiModelProperty("可生产")
    @TableField("producible")
    private Integer producible;
    @ApiModelProperty("可存货")
    @TableField("storable")
    private Integer storable;
    @ApiModelProperty("可委外")
    @TableField("outsourceable")
    private Integer outsourceable;

    @ApiModelProperty("重量单位ID")
    @TableField("weight_unit_id")
    private String weightUnitId;
    @ApiModelProperty("重量单位名称")
    @TableField("weight_unit_name")
    private String weightUnitName;

    @ApiModelProperty("尺寸单位ID")
    @TableField("size_unit_id")
    private String sizeUnitId;
    @ApiModelProperty("尺寸单位名称")
    @TableField("size_unit_name")
    private String sizeUnitName;

    @ApiModelProperty("默认税种ID")
    @TableField("tax_id")
    private String taxId;
    @ApiModelProperty("税种名称")
    @TableField("tax_name")
    private String taxName;
    @ApiModelProperty("税种类型")
    @TableField("tax_type")
    private String taxType;
    @ApiModelProperty("税率")
    @TableField("tax_rate")
    private String taxRate;
    @ApiModelProperty("税种精度")
    @TableField("tax_accuracy")
    private Integer taxAccuracy;

    @ApiModelProperty("是否启用配置")
    @TableField(exist = false)
    private Integer enableConfig;

    @ApiModelProperty("库存属性")
    @TableField(exist = false)
    private PsiGroupAttrConfigMaterialInventory materialInventory;
    @ApiModelProperty("销售属性")
    @TableField(exist = false)
    private PsiGroupAttrConfigMaterialSale materialSale;
    @ApiModelProperty("采购属性")
    @TableField(exist = false)
    private PsiGroupAttrConfigMaterialPurchase materialPurchase;
    @ApiModelProperty("生产属性")
    @TableField(exist = false)
    private PsiGroupAttrConfigMaterialProduction materialProduction;
    @ApiModelProperty("质量属性")
    @TableField(exist = false)
    private PsiGroupAttrConfigMaterialQuality materialQuality;
    @ApiModelProperty("计划属性")
    @TableField(exist = false)
    private PsiGroupAttrConfigMaterialPlan materialPlan;
    @ApiModelProperty("特征属性")
    @TableField(exist = false)
    private List<PsiGroupAttrConfigMaterialCharacteristic> materialCharacteristic;
}

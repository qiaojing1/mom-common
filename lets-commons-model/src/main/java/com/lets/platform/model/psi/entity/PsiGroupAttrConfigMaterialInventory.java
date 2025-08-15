package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 物料分组属性配置-库存信息
 * @author DING WEI
 * @since 2024-07-17
 */
@Getter
@Setter
@TableName("psi_group_attr_config_material_inventory")
@ApiModel(value = "PsiGroupAttrConfigMaterialInventory对象", description = "物料分组属性配置-库存信息")
public class PsiGroupAttrConfigMaterialInventory extends BaseEntity {

    @ApiModelProperty("库存单位ID")
    @TableField("inventory_unit_id")
    private String inventoryUnitId;

    @ApiModelProperty("库存单位名称")
    @TableField("inventory_unit_name")
    private String inventoryUnitName;

    @ApiModelProperty("参考单位ID")
    @TableField("inventory_reference_unit_id")
    private String inventoryReferenceUnitId;

    @ApiModelProperty("参考单位名称")
    @TableField("inventory_reference_unit_name")
    private String inventoryReferenceUnitName;

    @ApiModelProperty("默认仓库ID")
    @TableField("inventory_store_id")
    private String inventoryStoreId;

    @ApiModelProperty("默认仓库名称")
    @TableField("inventory_store_name")
    private String inventoryStoreName;

    @ApiModelProperty("默认库区ID")
    @TableField("inventory_area_id")
    private String inventoryAreaId;
    @ApiModelProperty("默认库区名称")
    @TableField("inventory_area_name")
    private String inventoryAreaName;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private Boolean emptyAreaId;

    @ApiModelProperty("默认库位ID")
    @TableField("inventory_position_id")
    private String inventoryPositionId;
    @ApiModelProperty("默认库位名称")
    @TableField("inventory_position_name")
    private String inventoryPositionName;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private Boolean emptyPositionId;

    @ApiModelProperty("最小库存量")
    @TableField("inventory_min_quantity")
    private BigDecimal inventoryMinQuantity;

    @ApiModelProperty("最小库存量预警")
    @TableField("inventory_min_warn")
    private Integer inventoryMinWarn;

    @ApiModelProperty("最大库存量")
    @TableField("inventory_max_quantity")
    private BigDecimal inventoryMaxQuantity;

    @ApiModelProperty("最大库存量预警")
    @TableField("inventory_max_warn")
    private Integer inventoryMaxWarn;

    @ApiModelProperty("安全库存量")
    @TableField("inventory_safe_quantity")
    private BigDecimal inventorySafeQuantity;

    @ApiModelProperty("安全存量预警")
    @TableField("inventory_safe_warn")
    private Integer inventorySafeWarn;

    @ApiModelProperty("允许库存锁定[0:不允许;1:允许]")
    @TableField("inventory_lock")
    private Integer inventoryLock;

    @ApiModelProperty("启用保质期管理[0:不启用;1:启用]")
    @TableField("expiration_date_managed")
    private Integer expirationDateManaged;

    @ApiModelProperty("保质期控制方式")
    @TableField("expiration_date_control_type")
    private String expirationDateControlType;

    @ApiModelProperty("保质期")
    @TableField("expiration_date")
    private Short expirationDate;

    @ApiModelProperty("保质期单位")
    @TableField("expiration_date_unit")
    private String expirationDateUnit;

    @ApiModelProperty("货架寿命")
    @TableField("shelf_life")
    private Short shelfLife;

    @ApiModelProperty("货架寿命单位")
    @TableField("shelf_life_unit")
    private String shelfLifeUnit;

    @ApiModelProperty("批号控制方式")
    @TableField("lot_no_control_type")
    private String lotNoControlType;

    @ApiModelProperty("批号编码方式")
    @TableField("lot_no_code_rule_id")
    private String lotNoCodeRuleId;

    @ApiModelProperty("批号应用范围")
    @TableField("lot_no_scope")
    private String lotNoScope;

    @ApiModelProperty("序列号控制方式")
    @TableField("serial_number_control_type")
    private String serialNumberControlType;

    @ApiModelProperty("序列号编码方式")
    @TableField("serial_number_code_rule_id")
    private String serialNumberCodeRuleId;

    @ApiModelProperty("序列号应用范围")
    @TableField("serial_number_scope")
    private String serialNumberScope;

    @ApiModelProperty("拣货策略")
    @TableField("pick_strategy")
    private String pickStrategy;

    @ApiModelProperty("条码控制方式")
    @TableField("barcode_control_type")
    private String barcodeControlType;

    @ApiModelProperty("条码标准包装量")
    @TableField("package_quantity")
    private BigDecimal packageQuantity;

    @ApiModelProperty("标准装箱量")
    @TableField("box_quantity")
    private BigDecimal boxQuantity;
}

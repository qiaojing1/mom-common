package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

/**
 * <p>
 * 物料库存信息
 * </p>
 *
 * @author FZY
 * @since 2023-07-18
 */
@Getter
@Setter
@TableName("psi_material_inventory")
@ApiModel(value = "PsiMaterialInventory对象", description = "物料库存信息")
public class PsiMaterialInventory extends MaterialBaseEntity {

    @ApiModelProperty("物料类型")
    @TableField(exist = false)
    private String materialType;

    @ApiModelProperty("库存单位ID")
    @TableField("inventory_unit_id")
    @NotBlank(message = "[库存单位]不能为空")
    private String inventoryUnitId;

    @TableField(exist = false)
    private String inventoryUnitCode;

    @ApiModelProperty("库存单位名称")
    @TableField(exist = false)
    private String inventoryUnitName;

    @ApiModelProperty("库存单位精度")
    @TableField(exist = false)
    private Integer inventoryUnitAccuracy;

    @ApiModelProperty("库存单位舍入类型")
    @TableField(exist = false)
    private String inventoryUnitRoundOffType;

    @ApiModelProperty("参考单位ID")
    @TableField("inventory_reference_unit_id")
    private String inventoryReferenceUnitId;

    @TableField(exist = false)
    private String inventoryReferenceUnitCode;

    @ApiModelProperty("参考单位名称")
    @TableField(exist = false)
    private String inventoryReferenceUnitName;

    @ApiModelProperty("参考单位精度")
    @TableField(exist = false)
    private Integer inventoryReferenceUnitAccuracy;

    @ApiModelProperty("参考单位舍入类型")
    @TableField(exist = false)
    private Integer inventoryReferenceUnitRoundOffType;

    @ApiModelProperty("物料基本单位")
    @TableField(exist = false)
    private String basicUnitId;
    @TableField(exist = false)
    private String basicUnitName;
    @TableField(exist = false)
    private String basicUnitCode;
    @TableField(exist = false)
    private Integer basicUnitAccuracy;
    @TableField(exist = false)
    private Integer basicUnitRoundOffType;

    @ApiModelProperty("默认仓库ID")
    @TableField("inventory_store_id")
    private String inventoryStoreId;

    @ApiModelProperty("默认仓库名称")
    @TableField(exist = false)
    private String inventoryStoreName;

    @ApiModelProperty("默认库区ID")
    @TableField("inventory_area_id")
    private String inventoryAreaId;

    @ApiModelProperty("默认库区名称")
    @TableField(exist = false)
    private String inventoryAreaName;

    @ApiModelProperty("默认库位ID")
    @TableField("inventory_position_id")
    private String inventoryPositionId;

    @ApiModelProperty("默认库位名称")
    @TableField(exist = false)
    private String inventoryPositionName;

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

    /**
     * @see com.lets.platform.model.psi.enums.ControlTypeEnum
     */
    @ApiModelProperty("保质期控制方式")
    @TableField("expiration_date_control_type")
    private String expirationDateControlType;

    @ApiModelProperty("保质期控制方式名称")
    @TableField(exist = false)
    private String expirationDateControlTypeName;

    @ApiModelProperty("保质期")
    @TableField("expiration_date")
    private Short expirationDate;

    /**
     * @see com.lets.platform.model.base.enums.YearMonthDayEnum
     */
    @ApiModelProperty("保质期单位")
    @TableField("expiration_date_unit")
    private String expirationDateUnit;

    @ApiModelProperty("保质期单位名称")
    @TableField(exist = false)
    private String expirationDateUnitName;

    @ApiModelProperty("货架寿命")
    @TableField("shelf_life")
    private Short shelfLife;

    @ApiModelProperty("货架寿命单位")
    @TableField("shelf_life_unit")
    private String shelfLifeUnit;

    @ApiModelProperty("货架寿命单位名称")
    @TableField(exist = false)
    private String shelfLifeUnitName;

    /**
     * @see com.lets.platform.model.psi.enums.LotControlTypeEnum
     */
    @ApiModelProperty("批号控制方式")
    @TableField("lot_no_control_type")
    private String lotNoControlType;

    @ApiModelProperty("批号控制方式名称")
    @TableField(exist = false)
    private String lotNoControlTypeName;

    @ApiModelProperty("批号编码方式")
    @TableField("lot_no_code_rule_id")
    private String lotNoCodeRuleId;

    @ApiModelProperty("批号编码方式名称")
    @TableField(exist = false)
    private String lotNoCodeRuleName;

    /**
     * @see com.lets.platform.model.psi.enums.LotUseRangeEnum
     */
    @ApiModelProperty("批号应用范围")
    @TableField("lot_no_scope")
    private String lotNoScope;

    @ApiModelProperty("批号应用范围名称")
    @TableField(exist = false)
    private String lotNoScopeName;

    @ApiModelProperty("序列号控制方式")
    @TableField("serial_number_control_type")
    private String serialNumberControlType;

    @ApiModelProperty("序列号控制方式名称")
    @TableField(exist = false)
    private String serialNumberControlTypeName;

    @ApiModelProperty("序列号编码方式")
    @TableField("serial_number_code_rule_id")
    private String serialNumberCodeRuleId;

    @ApiModelProperty("序列号编码方式名称")
    @TableField(exist = false)
    private String serialNumberCodeRuleName;

    @ApiModelProperty("序列号应用范围")
    @TableField("serial_number_scope")
    private String serialNumberScope;

    @ApiModelProperty("序列号应用范围名称")
    @TableField(exist = false)
    private String serialNumberScopeName;

    @ApiModelProperty("拣货策略")
    @TableField("pick_strategy")
    private String pickStrategy;

    @ApiModelProperty("拣货策略名称")
    @TableField(exist = false)
    private String pickStrategyName;

    @ApiModelProperty("条码控制方式")
    @TableField("barcode_control_type")
    private String barcodeControlType;

    @ApiModelProperty("条码控制方式名称")
    @TableField(exist = false)
    private String barcodeControlTypeName;

    @ApiModelProperty("条码标准包装量")
    @TableField("package_quantity")
    private BigDecimal packageQuantity;

    @ApiModelProperty("标准装箱量")
    @TableField("box_quantity")
    private BigDecimal boxQuantity;

    @ApiModelProperty("税种")
    @TableField(exist = false)
    private String taxId;
    @TableField(exist = false)
    private String taxName;
    @TableField(exist = false)
    private String taxType;
    @TableField(exist = false)
    private BigDecimal taxRate;
    @TableField(exist = false)
    private Integer taxAccuracy;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String groupId;
}

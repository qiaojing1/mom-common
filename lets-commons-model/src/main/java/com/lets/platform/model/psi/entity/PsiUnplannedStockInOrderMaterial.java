package com.lets.platform.model.psi.entity;

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
 * 计划外入库单物料明细
 * </p>
 *
 * @author FZY
 * @since 2023-09-18
 */
@Getter
@Setter
@TableName("psi_unplanned_stock_in_order_material")
@ApiModel(value = "PsiUnplannedStockInOrderMaterial对象", description = "计划外入库单物料明细")
public class PsiUnplannedStockInOrderMaterial extends BaseEntity {

    @ApiModelProperty("销售订单ID")
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
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private Integer storable;
    @ApiModelProperty("特征属性名称")
    @TableField("material_characteristic_names")
    private String materialCharacteristicNames;

    @ApiModelProperty("库存单位ID")
    @TableField("inventory_unit_id")
    private String inventoryUnitId;
    @ApiModelProperty("库存单位编码")
    @TableField(exist = false)
    private String inventoryUnitCode;
    @ApiModelProperty("库存单位名称")
    @TableField("inventory_unit_name")
    private String inventoryUnitName;
    @ApiModelProperty("库存单位精度")
    @TableField("inventory_unit_accuracy")
    private Integer inventoryUnitAccuracy;
    @ApiModelProperty("库存单位舍入类型")
    @TableField("inventory_unit_round_off_type")
    private String inventoryUnitRoundOffType;

    @ApiModelProperty("数量")
    @TableField("quantity")
    private BigDecimal quantity;

    @ApiModelProperty("启用保质期管理[0:不启用;1:启用]")
    @TableField("expiration_date_managed")
    private Integer expirationDateManaged;

    @ApiModelProperty("保质期控制方式")
    @TableField("expiration_date_control_type")
    private String expirationDateControlType;

    @ApiModelProperty("保质期时长")
    @TableField("expiration_time")
    private Short expirationTime;

    @ApiModelProperty("保质期单位")
    @TableField("expiration_date_unit")
    private String expirationDateUnit;

    @ApiModelProperty("生产日期")
    @TableField("production_date")
    private LocalDateTime productionDate;

    @ApiModelProperty("保质期到期日")
    @TableField("expiration_date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime expirationDate;

    @ApiModelProperty("仓库ID")
    @TableField("store_id")
    private String storeId;

    @ApiModelProperty("仓库名称")
    @TableField("store_name")
    private String storeName;

    @ApiModelProperty("库区ID")
    @TableField("area_id")
    private String areaId;

    @ApiModelProperty("库区名称")
    @TableField("area_name")
    private String areaName;

    @ApiModelProperty("库位ID")
    @TableField("position_id")
    private String positionId;

    @ApiModelProperty("库位名称")
    @TableField("position_name")
    private String positionName;

    @ApiModelProperty("批号控制方式")
    @TableField("lot_no_control_type")
    private String lotNoControlType;

    @ApiModelProperty("批号编码方式")
    @TableField("lot_no_code_rule_id")
    private String lotNoCodeRuleId;

    @ApiModelProperty("批号应用范围")
    @TableField("lot_no_scope")
    private String lotNoScope;

    @ApiModelProperty("批号")
    @TableField("batch_number")
    private String batchNumber;

    @ApiModelProperty("基本单位ID")
    @TableField("basic_unit_id")
    private String basicUnitId;
    @TableField(exist = false)
    private String basicUnitCode;
    @ApiModelProperty("基本单位名称")
    @TableField("basic_unit_name")
    private String basicUnitName;
    @ApiModelProperty("基本单位精度")
    @TableField("basic_unit_accuracy")
    private Integer basicUnitAccuracy;
    @ApiModelProperty("基本单位舍入方式")
    @TableField("basic_unit_round_off_type")
    private String basicUnitRoundOffType;
    @ApiModelProperty("基本数量")
    @TableField("basic_quantity")
    private BigDecimal basicQuantity;

    @ApiModelProperty("参考单位ID")
    @TableField("reference_unit_id")
    private String referenceUnitId;
    @TableField(exist = false)
    private String referenceUnitCode;
    @ApiModelProperty("参考单位名称")
    @TableField("reference_unit_name")
    private String referenceUnitName;
    @ApiModelProperty("参考单位精度")
    @TableField("reference_unit_accuracy")
    private Integer referenceUnitAccuracy;
    @ApiModelProperty("参考单位舍入方式")
    @TableField("reference_unit_round_off_type")
    private String referenceUnitRoundOffType;

    @ApiModelProperty("库存单位转基本单位")
    @TableField("basic_target")
    private BigDecimal basicTarget;

    @ApiModelProperty("参考单位与库存单位比例")
    @TableField("basic_source")
    private BigDecimal basicSource;

    @ApiModelProperty("库存单位转参考单位")
    @TableField("reference_target")
    private BigDecimal referenceTarget;

    @ApiModelProperty("参考单位与库存单位比例")
    @TableField("reference_source")
    private BigDecimal referenceSource;

    @ApiModelProperty("参考数量")
    @TableField("reference_quantity")
    private BigDecimal referenceQuantity;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("特征属性列表")
    @TableField(exist = false)
    private List<PsiUnplannedStockInOrderMaterialCharacteristic> materialCharacteristicList;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private Integer rowIndex;

    @TableField("source_order_id")
    private String sourceOrderId;
    @TableField("source_order_code")
    private String sourceOrderCode;
    /**
     * @see com.lets.platform.model.psi.enums.StockSourceEnum
     */
    @TableField("source_order_type")
    private String sourceOrderType;
    @TableField(exist = false)
    private String sourceOrderTypeName;
    @TableField("source_line_number")
    private String sourceLineNumber;
    @TableField("source_detail_id")
    private String sourceDetailId;
    @TableField("track_no")
    private String trackNo;
    @TableField("source_order_customer_id")
    private String sourceOrderCustomerId;
    @TableField("source_order_customer_name")
    private String sourceOrderCustomerName;
    @TableField(exist = false)
    private String projectCode;
    @TableField(exist = false)
    private String contractCode;

    @TableField(exist = false)
    private String storeOrgId;
    @TableField(exist = false)
    private String storeOrgName;
    @TableField(exist = false)
    private String storeUserId;
    @TableField(exist = false)
    private String storeUserName;
    @ApiModelProperty(value = "基本单位和kg是否存在单位转换", hidden = true)
    @TableField(exist = false)
    private Boolean canConvertKg;
    @TableField(exist = false)
    private String isMateialDemand;

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

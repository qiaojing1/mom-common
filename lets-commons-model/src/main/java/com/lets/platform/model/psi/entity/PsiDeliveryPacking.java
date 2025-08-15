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
 * <p>
 * 发货装箱明细表
 * </p>
 *
 * @author FZY
 * @since 2024-07-01
 */
@Getter
@Setter
@TableName("psi_delivery_packing")
@ApiModel(value = "PsiDeliveryPacking对象", description = "发货装箱明细表")
public class PsiDeliveryPacking extends BaseEntity {

    @ApiModelProperty("出货通知单ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("发货明细ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("发货明细-行号")
    @TableField("line_number")
    private long lineNumber;

    @ApiModelProperty("包装箱ID")
    @TableField("container_id")
    private String containerId;

    @ApiModelProperty("包装箱编码")
    @TableField("container_code")
    private String containerCode;

    @ApiModelProperty("包装箱名称")
    @TableField("container_name")
    private String containerName;

    @ApiModelProperty("包装箱限重")
    @TableField("container_weight_limit")
    private String containerWeightLimit;

    @ApiModelProperty("包装箱规格")
    @TableField("container_specs")
    private String containerSpecs;

    @ApiModelProperty("包装箱条码ID")
    @TableField("container_barcode_id")
    private String containerBarcodeId;

    @ApiModelProperty("包装箱条码")
    @TableField("container_barcode")
    private String containerBarcode;

    @ApiModelProperty("物料编码ID")
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

    @ApiModelProperty("特征属性名称")
    @TableField("material_characteristic_names")
    private String materialCharacteristicNames;

    @ApiModelProperty("单位ID")
    @TableField("unit_id")
    private String unitId;

    @ApiModelProperty("单位名称")
    @TableField("unit_name")
    private String unitName;

    @ApiModelProperty("单位精度")
    @TableField("unit_accuracy")
    private Integer unitAccuracy;

    @ApiModelProperty("单位舍入类型")
    @TableField("unit_round_off_type")
    private Integer unitRoundOffType;

    @ApiModelProperty("数量")
    @TableField("quantity")
    private BigDecimal quantity;

    @ApiModelProperty("已发货数量")
    @TableField("delivery_quantity")
    private BigDecimal deliveryQuantity;

    @ApiModelProperty("已发货数量")
    @TableField(exist = false)
    private BigDecimal afterDeliveryQuantity;

    @TableField(exist = false)
    private String materialSpecific;
}

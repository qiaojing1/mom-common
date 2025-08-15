package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import java.math.BigDecimal;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 发运单-物料明细
 * </p>
 *
 * @author csy
 * @since 2024-07-05
 */
@Getter
@Setter
@TableName("psi_ship_order_material")
@ApiModel(value = "PsiShipOrderMaterial对象", description = "发运单-物料明细")
public class PsiShipOrderMaterial extends BaseEntity {

    @ApiModelProperty("单据主键")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("箱条码")
    @TableField("container_barcode")
    private String containerBarcode;

    @ApiModelProperty("物料")
    @TableField("material_id")
    private String materialId;

    @ApiModelProperty("物料")
    @TableField("material_code")
    private String materialCode;

    @ApiModelProperty("物料")
    @TableField("material_name")
    private String materialName;

    @ApiModelProperty("物料")
    @TableField("material_specs")
    private String materialSpecs;

    @ApiModelProperty("物料")
    @TableField("material_characteristic_names")
    private String materialCharacteristicNames;

    @ApiModelProperty("标签数量")
    @TableField("quantity")
    private BigDecimal quantity;

    @ApiModelProperty("库存单位")
    @TableField("inventory_unit_id")
    private String inventoryUnitId;

    @ApiModelProperty("库存单位")
    @TableField("inventory_unit_code")
    private String inventoryUnitCode;

    @ApiModelProperty("库存单位")
    @TableField("inventory_unit_name")
    private String inventoryUnitName;

    @ApiModelProperty("库存单位")
    @TableField("inventory_unit_round_off_type")
    private Integer inventoryUnitRoundOffType;

    @ApiModelProperty("库存单位")
    @TableField("inventory_unit_accuracy")
    private Integer inventoryUnitAccuracy;

    @ApiModelProperty("批号")
    @TableField("batch_number")
    private String batchNumber;

    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;

    @ApiModelProperty("容器主键")
    @TableField("source_order_detail_id")
    private String sourceOrderDetailId;
}

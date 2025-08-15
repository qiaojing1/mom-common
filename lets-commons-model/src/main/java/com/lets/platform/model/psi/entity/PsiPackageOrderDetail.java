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
 * 装箱单-明细
 * </p>
 *
 * @author csy
 * @since 2024-07-01
 */
@Getter
@Setter
@TableName("psi_package_order_detail")
@ApiModel(value = "PsiPackageOrderDetail对象", description = "装箱单-明细")
public class PsiPackageOrderDetail extends BaseEntity {

    @ApiModelProperty("装箱单id")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;

    @ApiModelProperty("物料主键")
    @TableField("material_id")
    private String materialId;

    @ApiModelProperty("物料主键")
    @TableField("material_name")
    private String materialName;

    @ApiModelProperty("规格属性")
    @TableField("specs")
    private String specs;

    @ApiModelProperty("特征属性")
    @TableField("material_characteristic_names")
    private String materialCharacteristicNames;

    @ApiModelProperty("物料数量")
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

    @ApiModelProperty("装箱明细id")
    @TableField("delivery_packing_id")
    private String deliveryPackingId;

    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Long lineNumber;
}

package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * <p>
 * 转储单物料条码明细
 * </p>
 *
 * @author csy
 * @since 2025-01-21
 */
@Getter
@Setter
@TableName("psi_stock_transfer_order_barcode_detail")
@ApiModel(value = "PsiStockTransferOrderBarcodeDetail对象", description = "转储单物料条码明细")
public class PsiStockTransferOrderBarcodeDetail extends BaseEntity {

    @ApiModelProperty("单据编号")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("物料条码")
    @TableField("barcode")
    private String barcode;

    @ApiModelProperty("物料主键")
    @TableField("material_id")
    private String materialId;

    @ApiModelProperty("物料名称")
    @TableField("material_name")
    private String materialName;

    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;

    @ApiModelProperty("物料规格")
    @TableField("material_specs")
    private String materialSpecs;

    @ApiModelProperty("物料特征属性")
    @TableField("material_specific")
    private String materialSpecific;

    @ApiModelProperty("物料特征属性")
    @TableField("material_specific_name")
    private String materialSpecificName;

    @ApiModelProperty("库存单位")
    @TableField("unit_id")
    private String unitId;

    @ApiModelProperty("库存单位")
    @TableField("unit_name")
    private String unitName;

    @ApiModelProperty("数量")
    @TableField("number")
    private BigDecimal number;

    @ApiModelProperty("批号")
    @TableField("batch_number")
    private String batchNumber;

    @ApiModelProperty("源仓库")
    @TableField("source_store_id")
    private String sourceStoreId;

    @ApiModelProperty("源仓库")
    @TableField("source_store_name")
    private String sourceStoreName;

    @ApiModelProperty("源库区")
    @TableField("source_area_id")
    private String sourceAreaId;

    @ApiModelProperty("源库区")
    @TableField("source_area_name")
    private String sourceAreaName;

    @ApiModelProperty("源库位")
    @TableField("source_position_id")
    private String sourcePositionId;

    @ApiModelProperty("源库位")
    @TableField("source_position_name")
    private String sourcePositionName;

    @ApiModelProperty("仓库")
    @TableField("store_id")
    private String storeId;

    @ApiModelProperty("仓库")
    @TableField("store_name")
    private String storeName;

    @ApiModelProperty("库区")
    @TableField("area_id")
    private String areaId;

    @ApiModelProperty("库区")
    @TableField("area_name")
    private String areaName;

    @ApiModelProperty("库位")
    @TableField("position_id")
    private String positionId;

    @ApiModelProperty("库位")
    @TableField("position_name")
    private String positionName;
}

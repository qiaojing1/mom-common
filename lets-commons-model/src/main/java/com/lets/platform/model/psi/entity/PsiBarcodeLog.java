package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * PDA扫码记录
 * </p>
 *
 * @author FZY
 * @since 2024-03-28
 */
@Getter
@Setter
@TableName("psi_barcode_log")
@ApiModel(value = "PsiBarcodeLog对象", description = "PDA扫码记录")
public class PsiBarcodeLog extends BaseEntity {

    @ApiModelProperty("容器条码ID")
    @TableField("container_barcode_id")
    private String containerBarcodeId;

    @ApiModelProperty("容器条码")
    @TableField("container_barcode")
    private String containerBarcode;

    @ApiModelProperty("单据编码")
    @TableField("order_code")
    private String orderCode;

    @ApiModelProperty("物料条码")
    @TableField("material_barcode_id")
    private String materialBarcodeId;

    @ApiModelProperty("物料条码")
    @TableField("material_barcode")
    private String materialBarcode;

    @ApiModelProperty("菜单编码")
    @TableField("menu_code")
    private String menuCode;

    @ApiModelProperty("菜单编码")
    @TableField(exist = false)
    private String menuName;

    @ApiModelProperty("扫码时间")
    @TableField("scan_time")
    private LocalDateTime scanTime;

    @TableField(exist = false)
    private String materialId;

    @TableField(exist = false)
    private String materialCode;

    @TableField(exist = false)
    private String materialName;

    @TableField(exist = false)
    private String materialSpecs;

    @TableField(exist = false)
    private String materialSpecific;

    @TableField(exist = false)
    private String materialCharacteristicNames;

    @TableField(exist = false)
    private String materialGroupName;

    @TableField(exist = false)
    private BigDecimal quantity;

    @TableField(exist = false)
    private String inventoryUnitId;

    @TableField(exist = false)
    private String inventoryUnitCode;

    @TableField(exist = false)
    private String inventoryUnitName;

    @TableField(exist = false)
    private Integer inventoryUnitAccuracy;

    @TableField(exist = false)
    private Integer inventoryUnitRoundOffType;

    @TableField(exist = false)
    private String batchNumber;

    @TableField(exist = false)
    private String serialNumber;

    @TableField(exist = false)
    private String relateOrderCode;

    @TableField(exist = false)
    private String relateOrderDetailId;

    @TableField(exist = false)
    private Long relateOrderLineNumber;

    @TableField(exist = false)
    private String trackNo;
}

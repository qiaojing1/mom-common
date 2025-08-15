package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 转储单表头
 * </p>
 *
 * @author csy
 * @since 2025-01-21
 */
@Getter
@Setter
@TableName("psi_stock_transfer_order")
@ApiModel(value = "PsiStockTransferOrder对象", description = "转储单表头")
public class PsiStockTransferOrder extends BaseEntity {

    @ApiModelProperty("单据编号")
    @TableField("code")
    private String code;

    @ApiModelProperty("单据日期")
    @TableField("order_time")
    private LocalDateTime orderTime;

    @ApiModelProperty("操作人员")
    @TableField("operator_id")
    private String operatorId;

    @ApiModelProperty("操作人员")
    @TableField("operator_name")
    private String operatorName;

    @TableField(exist = false)
    private List<PsiStockTransferOrderDetail> detailList;

    @TableField(exist = false)
    private List<PsiStockTransferOrderBarcodeDetail> barcodeDetailList;

    @TableField(exist = false)
    private String detailId;

    @TableField(exist = false)
    private String orderId;
    @TableField(exist = false)
    private String orderCode;

    @ApiModelProperty("行号")
    @TableField(exist = false)
    private Long lineNumber;

    @ApiModelProperty("物料主键")
    @TableField(exist = false)
    private String materialId;

    @ApiModelProperty("物料名称")
    @TableField(exist = false)
    private String materialName;

    @ApiModelProperty("物料编码")
    @TableField(exist = false)
    private String materialCode;

    @ApiModelProperty("物料规格")
    @TableField(exist = false)
    private String materialSpecs;

    @ApiModelProperty("物料特征属性")
    @TableField(exist = false)
    private String materialSpecific;

    @ApiModelProperty("物料特征属性")
    @TableField(exist = false)
    private String materialSpecificName;

    @ApiModelProperty("库存单位")
    @TableField(exist = false)
    private String unitId;

    @ApiModelProperty("库存单位")
    @TableField(exist = false)
    private String unitName;

    @ApiModelProperty("数量")
    @TableField(exist = false)
    private BigDecimal number;

    @ApiModelProperty("批号")
    @TableField(exist = false)
    private String batchNumber;

    @ApiModelProperty("源仓库")
    @TableField(exist = false)
    private String sourceStoreId;

    @ApiModelProperty("源仓库")
    @TableField(exist = false)
    private String sourceStoreName;

    @ApiModelProperty("源库区")
    @TableField(exist = false)
    private String sourceAreaId;

    @ApiModelProperty("源库区")
    @TableField(exist = false)
    private String sourceAreaName;

    @ApiModelProperty("源库位")
    @TableField(exist = false)
    private String sourcePositionId;

    @ApiModelProperty("源库位")
    @TableField(exist = false)
    private String sourcePositionName;

    @ApiModelProperty("仓库")
    @TableField(exist = false)
    private String storeId;

    @ApiModelProperty("仓库")
    @TableField(exist = false)
    private String storeName;

    @ApiModelProperty("库区")
    @TableField(exist = false)
    private String areaId;

    @ApiModelProperty("库区")
    @TableField(exist = false)
    private String areaName;

    @ApiModelProperty("库位")
    @TableField(exist = false)
    private String positionId;

    @ApiModelProperty("库位")
    @TableField(exist = false)
    private String positionName;
}

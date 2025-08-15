package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 分步调拨单物料明细
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-09-09
 */
@Getter
@Setter
@TableName("psi_step_transfer_order_material")
@ApiModel(value = "PsiStepTransferOrderMaterial对象", description = "分步调拨单物料明细")
public class PsiStepTransferOrderMaterial extends BaseEntity {

    @ApiModelProperty("调拨单ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("调拨单编码")
    @TableField(exist = false)
    private String orderCode;

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

    @ApiModelProperty("特征属性名称")
    @TableField("material_characteristic_names")
    private String materialCharacteristicNames;

    @ApiModelProperty("库存单位ID")
    @TableField("store_unit_id")
    private String storeUnitId;

    @ApiModelProperty("库存单位名称")
    @TableField("store_unit_name")
    private String storeUnitName;

    @ApiModelProperty("库存单位精度")
    @TableField("store_unit_accuracy")
    private Integer storeUnitAccuracy;

    @ApiModelProperty("库存单位舍入类型")
    @TableField("store_unit_round_off_type")
    private Integer storeUnitRoundOffType;

    @ApiModelProperty("参考单位ID")
    @TableField("reference_unit_id")
    private String referenceUnitId = "";

    @ApiModelProperty("参考单位编码")
    @TableField(exist = false)
    private String referenceUnitCode = "";

    @ApiModelProperty("参考单位名称")
    @TableField("reference_unit_name")
    private String referenceUnitName = "";

    @ApiModelProperty("参考单位精度")
    @TableField("reference_unit_accuracy")
    private Integer referenceUnitAccuracy = 2;

    @ApiModelProperty("参考单位舍入方式")
    @TableField("reference_unit_round_off_type")
    private Integer referenceUnitRoundOffType = 4;

    @ApiModelProperty("调拨数量")
    @TableField("transfer_quantity")
    private BigDecimal transferQuantity = BigDecimal.ZERO;

    @ApiModelProperty("调拨数量(参考单位)")
    @TableField("transfer_reference_quantity")
    private BigDecimal transferReferenceQuantity = BigDecimal.ZERO;

    @ApiModelProperty("应出库数量")
    @TableField("plan_stock_out_quantity")
    private BigDecimal planStockOutQuantity;

    @ApiModelProperty("可用库存量")
    @TableField("available_quantity")
    private BigDecimal availableQuantity;

    @ApiModelProperty("分步调拨入库数量")
    @TableField("transfer_in_quantity")
    private BigDecimal transferInQuantity;

    @ApiModelProperty("分步调拨已过账入库数量")
    @TableField("already_transfer_in_quantity")
    private BigDecimal alreadyTransferInQuantity;

    @ApiModelProperty("分步调拨已占用入库数量")
    @TableField("locked_transfer_in_quantity")
    private BigDecimal lockedTransferInQuantity;

    @ApiModelProperty("分步调拨可调入数量")
    @TableField(exist = false)
    private BigDecimal transferInAbleQuantity;

    @ApiModelProperty("调出仓库ID")
    @TableField("stock_out_store_id")
    private String stockOutStoreId;

    @ApiModelProperty("调出仓库name")
    @TableField("stock_out_store_name")
    private String stockOutStoreName;

    @ApiModelProperty("调出库区ID")
    @TableField("stock_out_area_id")
    private String stockOutAreaId;

    @ApiModelProperty("调出库区名称")
    @TableField("stock_out_area_name")
    private String stockOutAreaName;

    @ApiModelProperty("调出库位ID")
    @TableField("stock_out_position_id")
    private String stockOutPositionId;

    @ApiModelProperty("调出库位名称")
    @TableField("stock_out_position_name")
    private String stockOutPositionName;

    @ApiModelProperty("调入仓库ID")
    @TableField("stock_in_store_id")
    private String stockInStoreId;

    @ApiModelProperty("调入仓库name")
    @TableField("stock_in_store_name")
    private String stockInStoreName;

    @ApiModelProperty("调入库区ID")
    @TableField("stock_in_area_id")
    private String stockInAreaId;

    @ApiModelProperty("调入库区名称")
    @TableField("stock_in_area_name")
    private String stockInAreaName;

    @ApiModelProperty("调入库位ID")
    @TableField("stock_in_position_id")
    private String stockInPositionId;

    @ApiModelProperty("调入库位名称")
    @TableField("stock_in_position_name")
    private String stockInPositionName;

    @ApiModelProperty("批号")
    @TableField("batch_number")
    private String batchNumber;

    @ApiModelProperty("特征属性")
    @TableField("material_specific")
    private String materialSpecific;

    @ApiModelProperty("批号控制方式[0不管控,1不可有批号,2必须有批号]")
    @TableField("lot_no_control_type")
    private String lotNoControlType;

    @ApiModelProperty("批号应用范围[0全部,1库存管理,2生产管理]")
    @TableField("lot_no_scope")
    private String lotNoScope;

    @ApiModelProperty("生产日期")
    @TableField("production_date")
    private LocalDateTime productionDate;

    @ApiModelProperty("保质期到期日")
    @TableField("expiration_date")
    private LocalDateTime expirationDate;

    @ApiModelProperty("批号入库日期")
    @TableField("batch_stock_in_date")
    private LocalDateTime batchStockInDate;

    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;

    @ApiModelProperty("源销售订单单订货客户id")
    @TableField("source_order_customer_id")
    private String sourceOrderCustomerId;

    @ApiModelProperty("源销售订单订货客户名称")
    @TableField("source_order_customer_name")
    private String sourceOrderCustomerName;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("行状态[0:关闭;1:正常]")
    @TableField("enable")
    private Integer enable;
    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("源单类型")
    @TableField("source_order_type")
    private String sourceOrderType;
    @TableField(exist = false)
    @ApiModelProperty("源单类型")
    private String sourceOrderTypeName;

    @ApiModelProperty("源单据类别ID")
    @TableField("source_order_category_id")
    private String sourceOrderCategoryId;

    @ApiModelProperty("源单据类别名称")
    @TableField("source_order_category_name")
    private String sourceOrderCategoryName;

    @ApiModelProperty("源单ID")
    @TableField("source_order_id")
    private String sourceOrderId;

    @ApiModelProperty("源单编码")
    @TableField("source_order_code")
    private String sourceOrderCode;

    @ApiModelProperty("源单明细ID")
    @TableField("source_detail_id")
    private String sourceDetailId;

    @ApiModelProperty("源单行号")
    @TableField("source_line_number")
    private String sourceLineNumber;

    @TableField(exist = false)
    @ApiModelProperty("调出仓库是否开启库区管理 Y:是")
    private String stockOutStoreEnableArea;

    @ApiModelProperty("调出库区是否开启库位管理 Y:是")
    @TableField(exist = false)
    private String stockOutAreaEnablePosition;

    @TableField(exist = false)
    @ApiModelProperty("调入仓库是否开启库区管理 Y:是")
    private String stockInStoreEnableArea;

    @ApiModelProperty("调入库区是否开启库位管理 Y:是")
    @TableField(exist = false)
    private String stockInAreaEnablePosition;

    @ApiModelProperty("基本单位")
    @TableField(exist = false)
    private String basicUnitId = "";

    @TableField(exist = false)
    private List<PsiStoreMaterialSpecific> specificList;

    @TableField(exist = false)
    private Integer excelIndex;

    @TableField(exist = false)
    private List<PsiStepTransferOrderMaterialCharacteristic> materialCharacteristics;

    public BigDecimal getTransferInQuantity() {
        return Objects.nonNull(transferInQuantity) ? transferInQuantity : transferQuantity;
    }

    public BigDecimal getAlreadyTransferInQuantity() {
        return Objects.nonNull(alreadyTransferInQuantity) ? alreadyTransferInQuantity : BigDecimal.ZERO;
    }

    public BigDecimal getLockedTransferInQuantity() {
        return Objects.nonNull(lockedTransferInQuantity) ? lockedTransferInQuantity : BigDecimal.ZERO;
    }
}

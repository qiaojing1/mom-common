package com.lets.platform.model.tpm.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.tpm.enums.ChangeReasonEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 备件领用单物料明细
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-11-21
 */
@Getter
@Setter
@TableName("tpm_spare_parts_requisition_order_detail")
@ApiModel(value = "TpmSparePartsRequisitionOrderDetail对象", description = "备件领用单物料明细")
public class TpmSparePartsRequisitionOrderDetail extends BaseEntity {

    @ApiModelProperty("销售订单ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Long lineNumber;

    @ApiModelProperty("物料ID")
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

    @ApiModelProperty("特征属性")
    @TableField("material_specific")
    private String materialSpecific;

    @ApiModelProperty("特征属性名称")
    @TableField("material_characteristic_names")
    private String materialCharacteristicNames;

    @ApiModelProperty("单位ID")
    @TableField("unit_id")
    private String unitId;

    @ApiModelProperty("单位精度")
    @TableField("unit_accuracy")
    private Integer unitAccuracy;

    @ApiModelProperty("单位舍入类型")
    @TableField("unit_round_off_type")
    private Integer unitRoundOffType;

    @ApiModelProperty("单位名称")
    @TableField("unit_name")
    private String unitName;

    @ApiModelProperty("领用数量")
    @TableField("quantity")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal quantity;

    @ApiModelProperty("可领用数量")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal requisitionAbleQuantity;

    @ApiModelProperty("可用库存数量")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal availableQuantity;

    /**
     * @see ChangeReasonEnum
     */
    @ApiModelProperty("更换原因")
    @TableField("change_reason")
    private String changeReason;
    @ApiModelProperty("更换原因")
    @TableField(exist = false)
    private String changeReasonName;

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

    @ApiModelProperty("批号ID")
    @TableField("batch_number_id")
    private String batchNumberId;

    @ApiModelProperty("批号名称")
    @TableField("batch_number_name")
    private String batchNumberName;

    @ApiModelProperty("生产日期")
    @TableField("production_date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime productionDate;

    @ApiModelProperty("批号入库日期")
    @TableField("batch_stock_in_date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime batchStockInDate;

    @ApiModelProperty("保质期到期日")
    @TableField("expiration_date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime expirationDate;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("基本单位ID")
    @TableField(exist = false)
    private String basicUnitId;

    @TableField(exist = false)
    private List<TpmSparePartsRequisitionOrderDetailCharacteristic> materialCharacteristicList;




    @ApiModelProperty("是否人工录入")
    @TableField("is_manual")
    private Integer isManual;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @TableField("price")
    private BigDecimal price;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @TableField("price_including_tax")
    private BigDecimal priceIncludingTax;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @TableField("amount")
    private BigDecimal amount;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @TableField("tax_amount")
    private BigDecimal taxAmount;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @TableField("amount_including_tax")
    private BigDecimal amountIncludingTax;

    @TableField("tax_id")
    private String taxId;

    @TableField("tax_name")
    private String taxName;

    @TableField("tax_type")
    private String taxType;
    @JsonFormat(shape = JsonFormat.Shape.STRING)

    @TableField("tax_accuracy")
    private Integer taxAccuracy;

    @TableField("tax_rate")
    private BigDecimal taxRate;
}

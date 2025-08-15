package com.lets.platform.model.mes.entity;

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
 * 生产退料单-明细
 * @author DING WEI
 * @since 2023-12-25
 */
@Getter
@Setter
@TableName("mes_produce_return_detail")
@ApiModel(value = "MesProduceReturnDetail对象", description = "生产退料单-明细")
public class MesProduceReturnDetail extends BaseEntity {

    @ApiModelProperty("明细主键")
    @TableField(exist = false)
    private String detailId;
    @ApiModelProperty("单据主键")
    @TableField("order_id")
    private String orderId;
    @TableField(exist = false)
    private String orderCode;
    @TableField(exist = false)
    private String orderStatus;
    @TableField(exist = false)
    private LocalDateTime orderTime;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Long lineNumber;

    @ApiModelProperty("生产工单主键")
    @TableField("produce_order_id")
    private String produceOrderId;
    @ApiModelProperty("生产工单单号")
    @TableField("produce_order_code")
    private String produceOrderCode;
    @ApiModelProperty("生产工单行号")
    @TableField("produce_line_number")
    private Long produceLineNumber;
    @ApiModelProperty("生产工单-明细主键")
    @TableField("produce_detail_id")
    private String produceDetailId;

    @ApiModelProperty("关联单据主键")
    @TableField("source_order_id")
    private String sourceOrderId;
    @ApiModelProperty("关联单据编码")
    @TableField("source_order_code")
    private String sourceOrderCode;
    @ApiModelProperty("关联单据明细主键")
    @TableField("source_detail_id")
    private String sourceDetailId;
    @ApiModelProperty("源单行号")
    @TableField("source_line_number")
    private Long sourceLineNumber;
    @ApiModelProperty("源单行号")
    @TableField("source_order_type")
    private String sourceOrderType;
    @ApiModelProperty("源单类型")
    @TableField(exist = false)
    private String sourceOrderTypeName;

    @ApiModelProperty("生产工单物料主键")
    @TableField("produce_material_id")
    private String produceMaterialId;
    @ApiModelProperty("生产工单物料编码")
    @TableField("produce_material_code")
    private String produceMaterialCode;
    @ApiModelProperty("生产工单物料名称")
    @TableField("produce_material_name")
    private String produceMaterialName;
    @ApiModelProperty("生产工单-物料规格型号")
    @TableField("produce_material_specs")
    private String produceMaterialSpecs;
    @ApiModelProperty("生产工单-物料特征属性")
    @TableField("produce_material_specific")
    private String produceMaterialSpecific;
    @ApiModelProperty("生产工单-生产单位主键")
    @TableField("produce_produce_unit_id")
    private String produceProduceUnitId;
    @ApiModelProperty("生产工单-生产单位名称")
    @TableField("produce_produce_unit_name")
    private String produceProduceUnitName;
    @ApiModelProperty("生产工单-生产单位精度")
    @TableField("produce_produce_unit_accuracy")
    private Integer produceProduceUnitAccuracy;
    @ApiModelProperty("生产工单-生产单位舍入方式")
    @TableField("produce_produce_unit_round_off_type")
    private Integer produceProduceUnitRoundOffType;

    @ApiModelProperty("子项物料主键")
    @TableField("sub_material_id")
    private String subMaterialId;
    @ApiModelProperty("子项物料编码")
    @TableField("sub_material_code")
    private String subMaterialCode;
    @ApiModelProperty("子项物料名称")
    @TableField("sub_material_name")
    private String subMaterialName;
    @ApiModelProperty("子项物料规格型号")
    @TableField("sub_material_specs")
    private String subMaterialSpecs;
    @ApiModelProperty("子项物料特征属性")
    @TableField("sub_material_specific")
    private String subMaterialSpecific;
    @ApiModelProperty("子项物料特征属性名称")
    @TableField("sub_material_specific_name")
    private String subMaterialSpecificName;

    @ApiModelProperty("仓库主键")
    @TableField("store_id")
    private String storeId;
    @ApiModelProperty("仓库名称")
    @TableField("store_name")
    private String storeName;
    @ApiModelProperty("库区主键")
    @TableField("area_id")
    private String areaId;
    @ApiModelProperty("库区名称")
    @TableField("area_name")
    private String areaName;
    @ApiModelProperty("库位主键")
    @TableField("position_id")
    private String positionId;
    @ApiModelProperty("库位名称")
    @TableField("position_name")
    private String positionName;

    @ApiModelProperty("批号")
    @TableField("batch_number")
    private String batchNumber;
    @ApiModelProperty("批号入库日期")
    @TableField("batch_stock_in_date")
    private LocalDateTime batchStockInDate;

    @ApiModelProperty("(库存)子项单位")
    @TableField("store_unit_id")
    private String storeUnitId;
    @ApiModelProperty("(库存)子项单位名称")
    @TableField("store_unit_name")
    private String storeUnitName;
    @ApiModelProperty("(库存)子项单位精度")
    @TableField("store_unit_accuracy")
    private Integer storeUnitAccuracy;
    @ApiModelProperty("(库存)子项单位舍入方式")
    @TableField("store_unit_round_off_type")
    private Integer storeUnitRoundOffType;

    @ApiModelProperty("退料套数")
    @TableField("return_set_number")
    private BigDecimal returnSetNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("退料数量")
    @TableField("return_number")
    private BigDecimal returnNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("可退货数量")
    @TableField(exist = false)
    private BigDecimal canReturnNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("退料基本数量")
    @TableField("return_number_basic")
    private BigDecimal returnNumberBasic;
    @ApiModelProperty("基本单位")
    @TableField("basic_unit_id")
    private String basicUnitId;
    @ApiModelProperty("基本单位编码")
    @TableField("basic_unit_code")
    private String basicUnitCode;
    @ApiModelProperty("基本单位名称")
    @TableField("basic_unit_name")
    private String basicUnitName;
    @ApiModelProperty("基本单位精度")
    @TableField("basic_unit_accuracy")
    private Integer basicUnitAccuracy;
    @ApiModelProperty("基本单位舍入方式")
    @TableField("basic_unit_round_off_type")
    private Integer basicUnitRoundOffType;

    @ApiModelProperty("生产日期")
    @TableField("product_date")
    private LocalDateTime productDate;
    @TableField(exist = false)
    private String productDateFormat;

    @ApiModelProperty("保质期到期日")
    @TableField("period_date")
    private LocalDateTime periodDate;
    @TableField(exist = false)
    private String periodDateFormat;

    @ApiModelProperty("用量类型[1变动2固定]")
    @TableField("dosage_type")
    private String dosageType;
    @ApiModelProperty("分子用量")
    @TableField("numerator_dosage")
    private BigDecimal numeratorDosage;
    @ApiModelProperty("分母用量")
    @TableField("denominator_dosage")
    private BigDecimal denominatorDosage;
    @ApiModelProperty("固定损耗")
    @TableField("fixed_loss")
    private BigDecimal fixedLoss;
    @ApiModelProperty("变动损耗率(%)")
    @TableField("change_loss_rate")
    private BigDecimal changeLossRate;
    @ApiModelProperty("拣货策略")
    @TableField("pick_strategy")
    private String pickStrategy;
    @ApiModelProperty("批号控制方式")
    @TableField("lot_no_control_type")
    private String lotNoControlType;
    @ApiModelProperty("批号控制范围")
    @TableField("lot_no_scope")
    private String lotNoScope;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String materialBillDetailId;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String code;

    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;
    @ApiModelProperty("源销售订单订货客户id")
    @TableField("source_order_customer_id")
    private String sourceOrderCustomerId;
    @ApiModelProperty("源销售订单订货客户名称")
    @TableField("source_order_customer_name")
    private String sourceOrderCustomerName;
    @TableField(exist = false)
    private String projectCode;
    @TableField(exist = false)
    private String contractCode;
    @TableField(exist = false)
    private String isMateialDemand;
    @TableField(exist = false)
    private List<MesProduceReturnDetailCharacteristic> materialCharacteristics;

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

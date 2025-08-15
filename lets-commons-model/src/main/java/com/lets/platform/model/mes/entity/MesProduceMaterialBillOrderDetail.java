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
import java.util.Objects;

/**
 * 生产用料清单-明细
 * @author DING WEI
 * @since 2024-05-31
 */
@Getter
@Setter
@TableName("mes_produce_material_bill_order_detail")
@ApiModel(value = "MesProduceMaterialBillOrderDetail对象", description = "生产用料清单-明细")
public class MesProduceMaterialBillOrderDetail extends BaseEntity {

    @ApiModelProperty("生产工单明细主键(计算明细数量需求)")
    @TableField(exist = false)
    private String produceDetailId;

    @ApiModelProperty("明细编码")
    @TableField(exist = false)
    private String detailCode;

    @TableField(exist = false)
    private String orderCode;
    @TableField(exist = false)
    private String isMateialDemand;
    @ApiModelProperty("生产用料清单主键")
    @TableField("order_id")
    private String orderId;
    @TableField(exist = false)
    private Integer orderStatus;

    @ApiModelProperty("生产工单主键")
    @TableField(exist = false)
    private String produceOrderId;
    @ApiModelProperty("生产工单-明细主键")
    @TableField("produce_order_detail_Id")
    private String produceOrderDetailId;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Long lineNumber;

    /**
     * @see com.lets.platform.model.mes.enums.BillSubTypeEnum
     */
    @ApiModelProperty("子项类型[1标准件，2退回件]")
    @TableField("sub_type")
    private String subType;
    @TableField(exist = false)
    private String subTypeName;

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
    @ApiModelProperty("子项物料类型")
    @TableField("sub_material_type")
    private String subMaterialType;

    @ApiModelProperty("子项单位")
    @TableField("sub_unit_id")
    private String subUnitId;
    @ApiModelProperty("子项单位编码")
    @TableField("sub_unit_code")
    private String subUnitCode;
    @ApiModelProperty("子项单位名称")
    @TableField("sub_unit_name")
    private String subUnitName;
    @ApiModelProperty("子项单位精度")
    @TableField("sub_unit_accuracy")
    private Integer subUnitAccuracy;
    @ApiModelProperty("子项单位舍入方式")
    @TableField("sub_unit_round_off_type")
    private Integer subUnitRoundOffType;

    @ApiModelProperty("BOM版本主键")
    @TableField("bom_id")
    private String bomId;
    @ApiModelProperty("BOM明细主键")
    @TableField("bom_detail_id")
    private String bomDetailId;
    @ApiModelProperty("BOM版本描述")
    @TableField(exist = false)
    private String bomVersionDescribe;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("需求数量")
    @TableField("demand_number")
    private BigDecimal demandNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("可领用数量")
    @TableField("can_use_number")
    private BigDecimal canUseNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("已锁定数量")
    @TableField("locked_number")
    private BigDecimal lockedNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("已领用数量")
    @TableField("used_number")
    private BigDecimal usedNumber;
    @ApiModelProperty("已退料数量")
    @TableField("returned_number")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal returnedNumber;
    @ApiModelProperty(hidden = true)
    @TableField("return_occupy_number")
    private BigDecimal returnOccupyNumber;
    @ApiModelProperty(value = "可退料数量", hidden = true)
    @TableField(exist = false)
    private BigDecimal canReturnNumber;
    @TableField(exist = false)
    private BigDecimal writeBackNumber4Return;
    @ApiModelProperty("库存数量")
    @TableField(exist = false)
    private BigDecimal storeNumber;

    /**
     * @see com.lets.platform.model.mes.enums.BomDosageTypeEnum
     */
    @ApiModelProperty("用量类型[1变动2固定]")
    @TableField("dosage_type")
    private String dosageType;
    @TableField(exist = false)
    private String dosageTypeName;

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

    @ApiModelProperty("生产工单-计划开始时间")
    @TableField("produce_plan_start_time")
    private LocalDateTime producePlanStartTime;

    @ApiModelProperty("生产工单-计划结束时间")
    @TableField("produce_plan_end_time")
    private LocalDateTime producePlanEndTime;

    @ApiModelProperty("MRP已计算数量")
    @TableField("mrp_calculated_quantity")
    private BigDecimal mrpCalculatedQuantity;

    /**
     * @see com.lets.platform.model.psi.enums.ProductionOverTypeEnum
     */
    @ApiModelProperty("超发控制方式[1允许超发、2禁止超发、3按最小发料批量超发]")
    @TableField("production_over_type")
    private Integer productionOverType;

    @ApiModelProperty(value = "[1bom，2web]", hidden = true)
    @TableField("data_source")
    private String dataSource;

    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal oneKittingNeedQuantity;

    @ApiModelProperty("领料数量(produceOrderDetail.kittingQuantity*oneKittingNeedQuantity)")
    @TableField(exist = false)
    private BigDecimal pickingNumber;

    /**
     * @see com.lets.platform.model.mes.enums.produceOrder.PickingWayEnum
     */
    @ApiModelProperty("领料方式")
    @TableField("picking_way")
    private String pickingWay;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String pickingWayName;

    @ApiModelProperty("收发仓库主键")
    @TableField("receive_dispatch_store_id")
    private String receiveDispatchStoreId;
    @ApiModelProperty("收发仓库名称")
    @TableField("receive_dispatch_store_name")
    private String receiveDispatchStoreName;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String sourceOrderType;

    @ApiModelProperty("是否关键件[0否1是]")
    @TableField("production_key_components")
    private Integer productionKeyComponents;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String projectCode;
    @TableField(exist = false)
    private String contractCode;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String sourceOrderCustomerId;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String sourceOrderCustomerName;

    @ApiModelProperty("调入仓库ID")
    @TableField("stock_in_store_id")
    private String stockInStoreId;
    @ApiModelProperty("调入仓库名称")
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
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("已调拨数量")
    @TableField("already_allocation_number")
    private BigDecimal alreadyAllocationNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("调拨占用数量")
    @TableField("occupy_allocation_number")
    private BigDecimal occupyAllocationNumber;

    @ApiModelProperty("发料考虑损耗[01]")
    @TableField("issue_consider_loss")
    private Integer issueConsiderLoss;

    /**
     * 物料扩展规格属性
     */
    @ApiModelProperty("备注1")
    @TableField(exist = false)
    private String remark1;
    @ApiModelProperty("备注2")
    @TableField(exist = false)
    private String remark2;
    @ApiModelProperty("扩展规格属性分类一")
    @TableField(exist = false)
    private String extFl1;
    @ApiModelProperty("扩展规格属性分类二")
    @TableField(exist = false)
    private String extFl2;
    @ApiModelProperty("扩展规格属性分类三")
    @TableField(exist = false)
    private String extFl3;
    @ApiModelProperty("扩展规格属性分类四")
    @TableField(exist = false)
    private String extFl4;
    @ApiModelProperty("扩展规格属性分类五")
    @TableField(exist = false)
    private String extFl5;
    @ApiModelProperty("扩展规格属性分类六")
    @TableField(exist = false)
    private String extFl6;
    @ApiModelProperty("扩展规格属性分类七")
    @TableField(exist = false)
    private String extFl7;
    @ApiModelProperty("扩展规格属性分类八")
    @TableField(exist = false)
    private String extFl8;
    @ApiModelProperty("扩展规格属性分类九")
    @TableField(exist = false)
    private String extFl9;
    @ApiModelProperty("扩展规格属性分类十")
    @TableField(exist = false)
    private String extFl10;
    @ApiModelProperty("扩展规格属性分类十一")
    @TableField(exist = false)
    private String extFl11;
    @ApiModelProperty("扩展规格属性分类十二")
    @TableField(exist = false)
    private String extFl12;
    @ApiModelProperty("扩展规格属性分类十三")
    @TableField(exist = false)
    private String extFl13;
    @ApiModelProperty("扩展规格属性分类十四")
    @TableField(exist = false)
    private String extFl14;
    @ApiModelProperty("扩展规格属性分类十五")
    @TableField(exist = false)
    private String extFl15;
    @ApiModelProperty("扩展规格属性分类十六")
    @TableField(exist = false)
    private String extFl16;
    @ApiModelProperty("扩展规格属性分类十七")
    @TableField(exist = false)
    private String extFl17;
    @ApiModelProperty("扩展规格属性分类十八")
    @TableField(exist = false)
    private String extFl18;
    @ApiModelProperty("扩展规格属性分类十九")
    @TableField(exist = false)
    private String extFl19;
    @ApiModelProperty("扩展规格属性分类二十")
    @TableField(exist = false)
    private String extFl20;
    @ApiModelProperty("扩展规格属性分类二十一")
    @TableField(exist = false)
    private String extFl21;
    @ApiModelProperty("扩展规格属性分类二十二")
    @TableField(exist = false)
    private String extFl22;
    @ApiModelProperty("扩展规格属性分类二十三")
    @TableField(exist = false)
    private String extFl23;
    @ApiModelProperty("扩展规格属性分类二十四")
    @TableField(exist = false)
    private String extFl24;
    @ApiModelProperty("扩展规格属性分类二十五")
    @TableField(exist = false)
    private String extFl25;
    @ApiModelProperty("扩展规格属性分类二十六")
    @TableField(exist = false)
    private String extFl26;
    @ApiModelProperty("扩展规格属性分类二十七")
    @TableField(exist = false)
    private String extFl27;
    @ApiModelProperty("扩展规格属性分类二十八")
    @TableField(exist = false)
    private String extFl28;
    @ApiModelProperty("扩展规格属性分类二十九")
    @TableField(exist = false)
    private String extFl29;
    @ApiModelProperty("扩展规格属性分类三十")
    @TableField(exist = false)
    private String extFl30;
    @ApiModelProperty("扩展规格属性分类三十一")
    @TableField(exist = false)
    private String extFl31;
    @ApiModelProperty("扩展规格属性分类三十二")
    @TableField(exist = false)
    private String extFl32;
    @ApiModelProperty("扩展规格属性分类一")
    @TableField(exist = false)
    private String extFlName1;
    @ApiModelProperty("扩展规格属性分类二")
    @TableField(exist = false)
    private String extFlName2;
    @ApiModelProperty("扩展规格属性分类三")
    @TableField(exist = false)
    private String extFlName3;
    @ApiModelProperty("扩展规格属性分类四")
    @TableField(exist = false)
    private String extFlName4;
    @ApiModelProperty("扩展规格属性分类五")
    @TableField(exist = false)
    private String extFlName5;
    @ApiModelProperty("扩展规格属性分类六")
    @TableField(exist = false)
    private String extFlName6;
    @ApiModelProperty("扩展规格属性分类七")
    @TableField(exist = false)
    private String extFlName7;
    @ApiModelProperty("扩展规格属性分类八")
    @TableField(exist = false)
    private String extFlName8;
    @ApiModelProperty("扩展规格属性分类九")
    @TableField(exist = false)
    private String extFlName9;
    @ApiModelProperty("扩展规格属性分类十")
    @TableField(exist = false)
    private String extFlName10;
    @ApiModelProperty("扩展规格属性分类十一")
    @TableField(exist = false)
    private String extFlName11;
    @ApiModelProperty("扩展规格属性分类十二")
    @TableField(exist = false)
    private String extFlName12;
    @ApiModelProperty("扩展规格属性分类十三")
    @TableField(exist = false)
    private String extFlName13;
    @ApiModelProperty("扩展规格属性分类十四")
    @TableField(exist = false)
    private String extFlName14;
    @ApiModelProperty("扩展规格属性分类十五")
    @TableField(exist = false)
    private String extFlName15;
    @ApiModelProperty("扩展规格属性分类十六")
    @TableField(exist = false)
    private String extFlName16;
    @ApiModelProperty("扩展规格属性分类十七")
    @TableField(exist = false)
    private String extFlName17;
    @ApiModelProperty("扩展规格属性分类十八")
    @TableField(exist = false)
    private String extFlName18;
    @ApiModelProperty("扩展规格属性分类十九")
    @TableField(exist = false)
    private String extFlName19;
    @ApiModelProperty("扩展规格属性分类二十")
    @TableField(exist = false)
    private String extFlName20;
    @ApiModelProperty("扩展规格属性分类二十一")
    @TableField(exist = false)
    private String extFlName21;
    @ApiModelProperty("扩展规格属性分类二十二")
    @TableField(exist = false)
    private String extFlName22;
    @ApiModelProperty("扩展规格属性分类二十三")
    @TableField(exist = false)
    private String extFlName23;
    @ApiModelProperty("扩展规格属性分类二十四")
    @TableField(exist = false)
    private String extFlName24;
    @ApiModelProperty("扩展规格属性分类二十五")
    @TableField(exist = false)
    private String extFlName25;
    @ApiModelProperty("扩展规格属性分类二十六")
    @TableField(exist = false)
    private String extFlName26;
    @ApiModelProperty("扩展规格属性分类二十七")
    @TableField(exist = false)
    private String extFlName27;
    @ApiModelProperty("扩展规格属性分类二十八")
    @TableField(exist = false)
    private String extFlName28;
    @ApiModelProperty("扩展规格属性分类二十九")
    @TableField(exist = false)
    private String extFlName29;
    @ApiModelProperty("扩展规格属性分类三十")
    @TableField(exist = false)
    private String extFlName30;
    @ApiModelProperty("扩展规格属性分类三十一")
    @TableField(exist = false)
    private String extFlName31;
    @ApiModelProperty("扩展规格属性分类三十二")
    @TableField(exist = false)
    private String extFlName32;

    @ApiModelProperty(value = "单据类别", hidden = true)
    @TableField(exist = false)
    private String orderCategoryId;

    @TableField(exist = false)
    private String orderCategoryName;

    @TableField(exist = false)
    private String batchNumber;

    @TableField(exist = false)
    private String reservationStoreId;
    @TableField(exist = false)
    private String reservationStoreName;
    @TableField(exist = false)
    private String reservationAreaId;
    @TableField(exist = false)
    private String reservationAreaName;
    @TableField(exist = false)
    private String reservationPositionId;
    @TableField(exist = false)
    private String reservationPositionName;
    @TableField(exist = false)
    private String reservationBatchNumber;
    @TableField(exist = false)
    private String reservationSpecific;

    public BigDecimal demandNumberNN() {
        if (Objects.isNull(demandNumber)) {
            return BigDecimal.ZERO;
        } else {
            return demandNumber;
        }
    }

    public BigDecimal lockedNumberNN() {
        if (Objects.isNull(lockedNumber)) {
            return BigDecimal.ZERO;
        } else {
            return lockedNumber;
        }
    }

    public BigDecimal usedNumberNN() {
        if (Objects.isNull(usedNumber)) {
            return BigDecimal.ZERO;
        } else {
            return usedNumber;
        }
    }
    public BigDecimal returnedNumberNN() {
        return Objects.isNull(returnedNumber) ? BigDecimal.ZERO : returnedNumber;
    }
    public BigDecimal returnOccupyNumberNN() {
        return Objects.isNull(returnOccupyNumber) ? BigDecimal.ZERO : returnOccupyNumber;
    }

    public BigDecimal getReturnedNumber() {
        return Objects.nonNull(returnedNumber) ? returnedNumber : BigDecimal.ZERO;
    }
}

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
import java.util.Objects;

/**
 * 生产用料清单变更
 * @author DING WEI
 * @since 2025-02-18
 */
@Getter
@Setter
@TableName("mes_produce_material_bill_change_order")
@ApiModel(value = "MesProduceMaterialBillChangeOrder对象", description = "生产用料清单变更")
public class MesProduceMaterialBillChangeOrder extends BaseEntity {

    @ApiModelProperty("单据编号")
    @TableField("code")
    private String code;

    @ApiModelProperty("单据类别")
    @TableField("order_category_id")
    private String orderCategoryId;
    @ApiModelProperty("单据类别编码")
    @TableField("order_category_code")
    private String orderCategoryCode;
    @ApiModelProperty("单据类别名称")
    @TableField("order_category_name")
    private String orderCategoryName;
    @ApiModelProperty("业务类型编码")
    @TableField("business_id")
    private String businessId;
    @ApiModelProperty("业务类型名称")
    @TableField("business_name")
    private String businessName;

    @ApiModelProperty("流水号")
    @TableField("serial_number")
    private Integer serialNumber;
    @TableField(exist = false)
    private String isMateialDemand;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("生产工单-数量")
    @TableField(exist = false)
    private BigDecimal produceNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("生产工单-报工数量")
    @TableField(exist = false)
    private BigDecimal produceReportNumber;
    /**
     * @see com.lets.platform.model.mes.enums.produceOrder.BusinessStatusEnum
     */
    @ApiModelProperty("生产工单-业务状态")
    @TableField(exist = false)
    private String produceBusinessStatus;
    @TableField(exist = false)
    private String produceBusinessStatusName;
    @ApiModelProperty("生产工单-主键")
    @TableField("produce_order_id")
    private String produceOrderId;
    @ApiModelProperty("生产工单-编码")
    @TableField("produce_order_code")
    private String produceOrderCode;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("生产工单-单据日期")
    @TableField("produce_order_time")
    private LocalDateTime produceOrderTime;
    @ApiModelProperty("生产工单-明细主键")
    @TableField("produce_order_detail_id")
    private String produceOrderDetailId;
    @ApiModelProperty("生产工单-行号")
    @TableField("produce_line_number")
    private Long produceLineNumber;
    @ApiModelProperty("生产工单-单据类别主键")
    @TableField("produce_category_id")
    private String produceCategoryId;
    @ApiModelProperty("生产工单-单据类别名称")
    @TableField("produce_category_name")
    private String produceCategoryName;
    @ApiModelProperty("生产工单-物料主键")
    @TableField("produce_material_id")
    private String produceMaterialId;
    @ApiModelProperty("生产工单-物料编码")
    @TableField("produce_material_code")
    private String produceMaterialCode;
    @ApiModelProperty("生产工单-物料名称")
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
    @ApiModelProperty("生产工单-生产单位编码")
    @TableField("produce_produce_unit_code")
    private String produceProduceUnitCode;
    @ApiModelProperty("生产工单-生产单位名称")
    @TableField("produce_produce_unit_name")
    private String produceProduceUnitName;
    @ApiModelProperty("生产工单-生产单位精度")
    @TableField("produce_produce_unit_accuracy")
    private Integer produceProduceUnitAccuracy;
    @ApiModelProperty("生产工单-生产单位舍入方式")
    @TableField("produce_produce_unit_round_off_type")
    private Integer produceProduceUnitRoundOffType;
    @ApiModelProperty("生产工单-供应商")
    @TableField("produce_supplier_id")
    private String produceSupplierId;
    @TableField("produce_supplier_name")
    private String produceSupplierName;

    @ApiModelProperty("生产工单-BOM主键")
    @TableField("produce_bom_id")
    private String produceBomId;
    @ApiModelProperty("生产工单-BOM版本")
    @TableField("produce_bom_version")
    private String produceBomVersion;
    @ApiModelProperty("BOM版本描述")
    @TableField(exist = false)
    private String produceBomVersionDescribe;

    @ApiModelProperty("生产工单-工艺路线")
    @TableField("produce_route_id")
    private String produceRouteId;
    @ApiModelProperty("生产工单-工艺路线名称")
    @TableField("produce_route_name")
    private String produceRouteName;

    @ApiModelProperty("生产单元")
    @TableField("factory_mode_id")
    private String factoryModeId;
    @ApiModelProperty("生产单元名称")
    @TableField("factory_mode_name")
    private String factoryModeName;

    @ApiModelProperty("是否智能车间[NY]")
    @TableField("intelligence_workshop")
    private String intelligenceWorkshop;

    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;
    @ApiModelProperty("源销售订单单订货客户id")
    @TableField("source_order_customer_id")
    private String sourceOrderCustomerId;
    @ApiModelProperty("源销售订单订货客户名称")
    @TableField("source_order_customer_name")
    private String sourceOrderCustomerName;

    @ApiModelProperty("状态")
    @TableField("status")
    private Integer status;
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("是否生效[01]")
    @TableField("take_effect")
    private Integer takeEffect;
    @TableField(exist = false)
    private String takeEffectName;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    private LocalDateTime auditTime;
    @ApiModelProperty("审核人员")
    @TableField("audit_user")
    private String auditUser;
    @ApiModelProperty("审核人员名称")
    @TableField("audit_user_name")
    private String auditUserName;

    @TableField(exist = false)
    private List<MesProduceMaterialBillChangeOrderDetail> details;

    /**
     * @see com.lets.platform.model.psi.enums.ChangeTypeEnum
     */
    @ApiModelProperty("变更类型[1修改，2新增]")
    @TableField(exist = false)
    private String changeType;
    @TableField(exist = false)
    private String changeTypeName;

    @ApiModelProperty("明细编码")
    @TableField(exist = false)
    private String detailCode;

    @ApiModelProperty("默认发料仓库")
    @TableField(exist = false)
    private String productionIssueStoreId;
    @TableField(exist = false)
    private String productionIssueStoreName;
    /**
     * @see com.lets.platform.common.pojo.enums.YesOrNo
     */
    @TableField(exist = false)
    private String productionIssueStoreEnableArea;
    @ApiModelProperty("默认发料库区")
    @TableField(exist = false)
    private String productionIssueAreaId;
    @TableField(exist = false)
    private String productionIssueAreaName;
    /**
     * @see com.lets.platform.common.pojo.enums.YesOrNo
     */
    @TableField(exist = false)
    private String productionIssueAreaEnablePosition;
    @ApiModelProperty("默认发料库位")
    @TableField(exist = false)
    private String productionIssuePositionId;
    @TableField(exist = false)
    private String productionIssuePositionName;

    @ApiModelProperty("基本单位")
    @TableField(exist = false)
    private String basicUnitId;
    @TableField(exist = false)
    private String basicUnitName;
    @TableField(exist = false)
    private Integer basicUnitAccuracy;
    @TableField(exist = false)
    private Integer basicUnitRoundOffType;

    /**
     * @see com.lets.platform.model.psi.enums.PickStrategyEnum
     */
    @ApiModelProperty("拣货策略")
    @TableField(exist = false)
    private String pickStrategy;
    @ApiModelProperty("批号控制方式")
    @TableField(exist = false)
    private String lotNoControlType;
    @ApiModelProperty("批号控制范围")
    @TableField(exist = false)
    private String lotNoScope;

    @ApiModelProperty("生产工单主键")
    @TableField(exist = false)
    private String orderId;

    @ApiModelProperty("行号")
    @TableField(exist = false)
    private Long lineNumber;

    /**
     * @see com.lets.platform.model.mes.enums.BillSubTypeEnum
     */
    @ApiModelProperty("子项类型[1标准件，2退回件]")
    @TableField(exist = false)
    private String subType;
    @TableField(exist = false)
    private String subTypeName;

    @ApiModelProperty("子项物料主键")
    @TableField(exist = false)
    private String subMaterialId;
    @ApiModelProperty("子项物料编码")
    @TableField(exist = false)
    private String subMaterialCode;
    @ApiModelProperty("子项物料名称")
    @TableField(exist = false)
    private String subMaterialName;
    @ApiModelProperty("子项物料规格型号")
    @TableField(exist = false)
    private String subMaterialSpecs;
    @ApiModelProperty("子项物料类型")
    @TableField(exist = false)
    private String subMaterialType;

    @ApiModelProperty("子项单位")
    @TableField(exist = false)
    private String subUnitId;
    @ApiModelProperty("子项单位编码")
    @TableField(exist = false)
    private String subUnitCode;
    @ApiModelProperty("子项单位名称")
    @TableField(exist = false)
    private String subUnitName;
    @ApiModelProperty("子项单位精度")
    @TableField(exist = false)
    private Integer subUnitAccuracy;
    @ApiModelProperty("子项单位舍入方式")
    @TableField(exist = false)
    private Integer subUnitRoundOffType;

    @ApiModelProperty("BOM版本主键")
    @TableField(exist = false)
    private String bomId;
    @ApiModelProperty("BOM版本名称")
    @TableField(exist = false)
    private String bomVersion;
    @ApiModelProperty("BOM明细主键")
    @TableField(exist = false)
    private String bomDetailId;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("需求数量(变更前)")
    @TableField(exist = false)
    private BigDecimal beforeDemandNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("需求数量(变更后)")
    @TableField(exist = false)
    private BigDecimal demandNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("可领用数量(变更前)")
    @TableField(exist = false)
    private BigDecimal beforeCanUseNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("可领用数量(变更后)")
    @TableField(exist = false)
    private BigDecimal canUseNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("可申请数量")
    @TableField(exist = false)
    private BigDecimal canApplyNumber;
    @ApiModelProperty("可领用数量(基本单位)")
    @TableField(exist = false)
    private BigDecimal canUseNumberBasic;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("已锁定数量")
    @TableField(exist = false)
    private BigDecimal lockedNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("已领用数量")
    @TableField(exist = false)
    private BigDecimal usedNumber;
    @ApiModelProperty("已退料数量")
    @TableField(exist = false)
    private BigDecimal returnedNumber;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private BigDecimal returnOccupyNumber;
    @ApiModelProperty("可退用数量(基本单位)")
    @TableField(exist = false)
    private BigDecimal canReturnNumberBasic;

    /**
     * @see com.lets.platform.model.mes.enums.BomDosageTypeEnum
     */
    @ApiModelProperty("用量类型[1变动2固定]")
    @TableField(exist = false)
    private String dosageType;
    @TableField(exist = false)
    private String dosageTypeName;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("分子用量(变更前)")
    @TableField(exist = false)
    private BigDecimal beforeNumeratorDosage;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("分子用量(变更后)")
    @TableField(exist = false)
    private BigDecimal numeratorDosage;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("分母用量(变更前)")
    @TableField(exist = false)
    private BigDecimal beforeDenominatorDosage;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("分母用量(变更后)")
    @TableField(exist = false)
    private BigDecimal denominatorDosage;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("固定损耗(变更前)")
    @TableField(exist = false)
    private BigDecimal beforeFixedLoss;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("固定损耗(变更后)")
    @TableField(exist = false)
    private BigDecimal fixedLoss;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("变动损耗率(%)(变更前)")
    @TableField(exist = false)
    private BigDecimal beforeChangeLossRate;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("变动损耗率(%)(变更后)")
    @TableField(exist = false)
    private BigDecimal changeLossRate;

    @ApiModelProperty("生产工单-计划开始时间")
    @TableField(exist = false)
    private LocalDateTime producePlanStartTime;

    @ApiModelProperty("生产工单-计划结束时间")
    @TableField(exist = false)
    private LocalDateTime producePlanEndTime;

    @ApiModelProperty("MRP已计算")
    @TableField(exist = false)
    private Integer mrpCalculated;

    /**
     * @see com.lets.platform.model.psi.enums.ProductionOverTypeEnum
     */
    @ApiModelProperty("超发控制方式[1允许超发、2禁止超发、3按最小发料批量超发]")
    @TableField(exist = false)
    private Integer productionOverType;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String dataSource;

    @ApiModelProperty("MRP计算状态")
    @TableField(exist = false)
    private String mrpCalculateStatus;
    @ApiModelProperty("是否齐套,这里的齐套是是否领料完成")
    @TableField(exist = false)
    private String isComplete;

    @ApiModelProperty("MRP计算状态")
    @TableField(exist = false)
    private String mrpCalculateStatusName;

    @ApiModelProperty("MRP已计算数量")
    @TableField(exist = false)
    private BigDecimal mrpCalculatedQuantity;

    /**
     * @see com.lets.platform.model.mes.enums.produceOrder.PickingWayEnum
     */
    @ApiModelProperty("领料方式(变更前)")
    @TableField(exist = false)
    private String beforePickingWay;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String beforePickingWayName;
    @ApiModelProperty("领料方式(变更后)")
    @TableField(exist = false)
    private String pickingWay;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String pickingWayName;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String projectCode;

    @ApiModelProperty("调入仓库ID(变更前)")
    @TableField(exist = false)
    private String beforeStockInStoreId;
    @ApiModelProperty("调入仓库名称(变更前)")
    @TableField(exist = false)
    private String beforeStockInStoreName;
    @ApiModelProperty("调入仓库ID(变更后)")
    @TableField(exist = false)
    private String stockInStoreId;
    @ApiModelProperty("调入仓库名称(变更后)")
    @TableField(exist = false)
    private String stockInStoreName;

    @ApiModelProperty("调入库区ID(变更前)")
    @TableField(exist = false)
    private String beforeStockInAreaId;
    @ApiModelProperty("调入库区名称(变更前)")
    @TableField(exist = false)
    private String beforeStockInAreaName;
    @ApiModelProperty("调入库区ID(变更后)")
    @TableField(exist = false)
    private String stockInAreaId;
    @ApiModelProperty("调入库区名称(变更后)")
    @TableField(exist = false)
    private String stockInAreaName;

    @ApiModelProperty("调入库位ID(变更前)")
    @TableField(exist = false)
    private String beforeStockInPositionId;
    @ApiModelProperty("调入库位名称(变更前)")
    @TableField(exist = false)
    private String beforeStockInPositionName;
    @ApiModelProperty("调入库位ID(变更后)")
    @TableField(exist = false)
    private String stockInPositionId;
    @ApiModelProperty("调入库位名称(变更后)")
    @TableField(exist = false)
    private String stockInPositionName;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("已调拨数量")
    @TableField(exist = false)
    private BigDecimal alreadyAllocationNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("调拨占用数量")
    @TableField(exist = false)
    private BigDecimal occupyAllocationNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("可调拨数量")
    @TableField(exist = false)
    private BigDecimal canAllocationNumber;

    @ApiModelProperty("发料考虑损耗[01]")
    @TableField(exist = false)
    private Integer issueConsiderLoss;
    @TableField(exist = false)
    private String billOrderId;
    @TableField(exist = false)
    private String billDetailId;

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

    public BigDecimal returnedNumberNN() {
        return Objects.isNull(returnedNumber) ? BigDecimal.ZERO : returnedNumber;
    }
    public BigDecimal lockedNumberNN() {
        return Objects.isNull(lockedNumber) ? BigDecimal.ZERO : lockedNumber;
    }
    public BigDecimal returnOccupyNumberNN() {
        return Objects.isNull(returnOccupyNumber) ? BigDecimal.ZERO : returnOccupyNumber;
    }

    @ApiModelProperty("MRP数量")
    @TableField(exist = false)
    private BigDecimal mrpQuantity;
}

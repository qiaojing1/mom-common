package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lets.platform.common.pojo.annotation.ValidBigDecimal;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.mes.interfaces.ProductionParamInterface;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 * 生产报工单-明细
 *
 * @author csy
 * @since 2023-12-22
 */
@Getter
@Setter
@TableName("mes_produce_report_order_detail")
@ApiModel(value = "MesProduceReportOrderDetail对象", description = "生产报工单-明细")
public class MesProduceReportOrderDetail extends BaseEntity implements ProductionParamInterface {

    @ApiModelProperty("单据主键")
    @TableField("order_id")
    private String orderId;
    @TableField(exist = false)
    private Integer orderStatus;

    @ApiModelProperty("行号")
    @TableField("line_number")
    @JsonProperty("lineNumber")
    private Long lineNumber;

    @ApiModelProperty("生产单元")
    @TableField("factory_mode_id")
    private String factoryModeId;

    @ApiModelProperty("生产单元")
    @TableField("factory_mode_Name")
    private String factoryModeName;

    @ApiModelProperty("产品类型")
    @TableField("product_type")
    private String productType;

    @TableField(exist = false)
    private String productTypeName;

    @ApiModelProperty("物料主键")
    @TableField("material_id")
    private String materialId;

    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;

    @ApiModelProperty("物料名称")
    @TableField("material_name")
    private String materialName;

    @ApiModelProperty("物料规格型号")
    @TableField("material_specs")
    private String materialSpecs;

    @ApiModelProperty("物料类型")
    @TableField("material_type")
    private String materialType;

    @ApiModelProperty("物料特征属性")
    @TableField("material_specific")
    private String materialSpecific;

    @ApiModelProperty("生产单位")
    @TableField("produce_unit_id")
    private String produceUnitId;

    @ApiModelProperty("生产单位编码")
    @TableField("produce_unit_code")
    private String produceUnitCode;

    @ApiModelProperty("生产单位名称")
    @TableField("produce_unit_name")
    private String produceUnitName;

    @ApiModelProperty("生产单位精度")
    @TableField("produce_unit_accuracy")
    private Integer produceUnitAccuracy;

    @ApiModelProperty("生产单位舍入方式")
    @TableField("produce_unit_round_off_type")
    private Integer produceUnitRoundOffType;

    @ApiModelProperty("报工数量")
    @TableField("number")
    private BigDecimal number;

    @ApiModelProperty("占用数量（完工入库单）")
    @TableField("occupy_number")
    private BigDecimal occupyNumber;

    @ApiModelProperty("已入库数量（完工入库单）")
    @TableField("already_stock_in_number")
    private BigDecimal alreadyStockInNumber;

    @ApiModelProperty("批号")
    @TableField("batch_number")
    private String batchNumber;

    @ApiModelProperty("工时")
    @TableField("work_hour")
    private BigDecimal workHour;

    @ApiModelProperty("完工检验")
    @TableField("is_finish_check")
    private String isFinishCheck;

    @ApiModelProperty("入库仓库主键")
    @TableField("stock_in_store_id")
    private String stockInStoreId;

    @ApiModelProperty("入库仓库名称")
    @TableField("stock_in_store_name")
    private String stockInStoreName;

    @ApiModelProperty("入库库区主键")
    @TableField("stock_in_area_id")
    private String stockInAreaId;

    @ApiModelProperty("入库库区名称")
    @TableField("stock_in_area_name")
    private String stockInAreaName;

    @ApiModelProperty("入库库位主键")
    @TableField("stock_in_position_id")
    private String stockInPositionId;

    @ApiModelProperty("入库库位名称")
    @TableField("stock_in_position_name")
    private String stockInPositionName;

    @ApiModelProperty("开时时间")
    @TableField("start_time")
    private LocalDateTime startTime;

    @ApiModelProperty("报工时间")
    @TableField("report_time")
    private LocalDateTime reportTime;

    @ApiModelProperty("源单单据主键")
    @TableField("source_order_id")
    private String sourceOrderId;

    @ApiModelProperty("源单单据编码")
    @TableField("source_order_code")
    private String sourceOrderCode;

    @ApiModelProperty("源单单据明细主键")
    @TableField("source_detail_id")
    private String sourceDetailId;

    @ApiModelProperty("源单单据行号")
    @TableField("source_line_number")
    private Integer sourceLineNumber;

    @ApiModelProperty("源单单据类型")
    @TableField("dispatch_id")
    private String dispatchId;

    @ApiModelProperty("剩余可入库数量")
    @TableField(exist = false)
    private BigDecimal remindCanStockInNumber;

    @TableField("version")
    private Integer version;
    @TableField("material_storable")
    private String materialStorable;

    @TableField(exist = false)
    private boolean allowExceedOrderReportOrStockIn;
    @TableField(exist = false)
    private boolean wipStockInInProportion;

    @TableField(exist = false)
    private String reportOrderNumber;
    @TableField(exist = false)
    private String upperLimitNumber;

    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;

    @ApiModelProperty("源销售订单订货客户id")
    @TableField("source_order_customer_id")
    private String sourceOrderCustomerId;

    @ApiModelProperty("源销售订单订货客户名称")
    @TableField("source_order_customer_name")
    private String sourceOrderCustomerName;

    @ApiModelProperty("检验占用数量")
    @TableField("inspect_occupy_quantity")
    private BigDecimal inspectOccupyQuantity;

    @ApiModelProperty("已检验数量")
    @TableField("inspect_quantity")
    private BigDecimal inspectQuantity;

    @ApiModelProperty("报废数量")
    @TableField("scrap_number")
    private BigDecimal scrapNumber;

    @ApiModelProperty("不良数量")
    @TableField("defect_quantity")
    private BigDecimal defectQuantity;

    @ApiModelProperty("返修数量")
    @TableField("repair_number")
    private BigDecimal repairNumber;

    @ApiModelProperty("返工数量")
    @TableField("rework_number")
    private BigDecimal reworkNumber;

    @TableField(exist = false)
    private List<MesProduceReportOrderDetailSpecific> characteristicList;

    @ApiModelProperty("合格数量")
    @TableField("qualified_number")
    private BigDecimal qualifiedNumber;

    @ApiModelProperty("不合格数量")
    @TableField("unqualified_quantity")
    private BigDecimal unqualifiedQuantity;

    @ApiModelProperty("可入库报废数量")
    @TableField("can_stock_in_scrap_number")
    private BigDecimal canStockInScrapNumber;

    @ApiModelProperty("完工入库占用报废数量")
    @TableField("stock_in_occupy_scrap_number")
    private BigDecimal stockInOccupyScrapNumber;

    @ApiModelProperty("已完工入库报废数量")
    @TableField("stock_in_scrap_number")
    private BigDecimal stockInScrapNumber;

    @ApiModelProperty("完工入库占用返工数量")
    @TableField("stock_in_occupy_rework_number")
    private BigDecimal stockInOccupyReworkNumber;

    @ApiModelProperty("已完工入库返工数量")
    @TableField("stock_in_rework_number")
    private BigDecimal stockInReworkNumber;

    @ApiModelProperty("完工入库占用不良数量")
    @TableField("stock_in_occupy_defect_quantity")
    private BigDecimal stockInOccupyDefectQuantity;

    @ApiModelProperty("已完工入库不良数量")
    @TableField("stock_in_defect_quantity")
    private BigDecimal stockInDefectQuantity;

    @TableField(exist = false)
    private BigDecimal canStockInNumber;

    @TableField(exist = false)
    private BigDecimal canStockInQualifiedQuantity;

    @TableField(exist = false)
    private BigDecimal canStockInScrapQuantity;

    @TableField(exist = false)
    private BigDecimal canStockInDefectNumber;

    @TableField(exist = false)
    private BigDecimal canStockInReworkNumber;

    @ApiModelProperty("序列号")
    @TableField(exist = false)
    private String serialNumber;

    @ApiModelProperty("报工产线主键")
    @TableField("production_line_id")
    private String productionLineId;
    @ApiModelProperty("报工产线编码")
    @TableField("production_line_code")
    private String productionLineCode;
    @ApiModelProperty("报工产线名称")
    @TableField("production_line_name")
    private String productionLineName;

    @ApiModelProperty("生产工单-生产部门id")
    @TableField(exist = false)
    private String productionOrgId;
    @ApiModelProperty("生产工单的计划开工时间")
    @TableField(exist = false)
    private LocalDateTime planStartTime;

    @TableField(exist = false)
    private String key;
    @TableField(exist = false)
    private String orderCategoryId;
    @TableField(exist = false)
    private MesProductionArchiveScheme productionArchiveScheme;
    @TableField(exist = false)
    private List<MesProductionParam> productionParamList;
    @TableField(exist = false)
    private String projectCode;
    @TableField(exist = false)
    private String contractCode;
    @TableField(exist = false)
    private String isMateialDemand;
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
    @ApiModelProperty("图号")
    @TableField(exist = false)
    private String drawingNumber;
    public BigDecimal qualifiedNumberNotNull() {
        if (Objects.isNull(qualifiedNumber)) {
            return BigDecimal.ZERO;
        } else {
            return qualifiedNumber;
        }
    }

    public BigDecimal getOccupyNumberNotNull() {
        if (Objects.isNull(occupyNumber)) {
            return BigDecimal.ZERO;
        }
        return occupyNumber;
    }

    public BigDecimal alreadyStockInNumberNotNull() {
        if (Objects.isNull(alreadyStockInNumber)) {
            return BigDecimal.ZERO;
        } else {
            return alreadyStockInNumber;
        }
    }

    @Override
    public String getOrderDetailId() {
        return getId();
    }

    @Override
    public String getCustomerId() {
        return sourceOrderCustomerId;
    }
}

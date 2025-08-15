package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
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
 * 生产工单报工单
 *
 * @author csy
 * @since 2023-12-22
 */
@Getter
@Setter
@ApiModel(value = "MesProduceReportOrder对象", description = "生产工单报工单")
public class MesProduceReportOrderVO extends BaseEntity implements ProductionParamInterface {

    private List<MesProduceReportOrderDetailSpecific> materialCharacteristicList;

    private String orderId;
    private String detailId;
    @ApiModelProperty("单据编号")
    private String code;
    private String detailCode;
    @ApiModelProperty("单据类别主键")
    private String orderCategoryId;
    @ApiModelProperty("单据类别名称")
    private String orderCategoryName;
    @ApiModelProperty("单据日期")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime orderTime;
    @ApiModelProperty("单据状态")
    private Integer status;
    private String statusName;
    @ApiModelProperty("生产部门")
    private String produceOrgId;
    private String produceOrgName;
    @ApiModelProperty("报工人员")
    private String produceUserId;
    private String produceUserName;
    @ApiModelProperty("行号")
    private Long lineNumber;
    @ApiModelProperty("物料主键")
    private String materialId;
    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;
    @ApiModelProperty("物料名称")
    private String materialName;
    @ApiModelProperty("物料规格型号")
    private String materialSpecs;
    @ApiModelProperty("物料特征属性")
    private String materialSpecific;
    @ApiModelProperty("生产单元")
    private String factoryModeId;
    @ApiModelProperty("生产单元")
    private String factoryModeName;
    @ApiModelProperty("生产单位")
    private String produceUnitId;
    @ApiModelProperty("生产单位编码")
    private String produceUnitCode;
    @ApiModelProperty("生产单位名称")
    private String produceUnitName;
    @ApiModelProperty("生产单位精度")
    private Integer produceUnitAccuracy;
    @ApiModelProperty("生产单位舍入方式")
    private Integer produceUnitRoundOffType;
    @ApiModelProperty("报工数量")
    private BigDecimal number;
    @ApiModelProperty("已检验数量")
    private BigDecimal inspectQuantity;
    @ApiModelProperty("合格数量")
    private BigDecimal qualifiedNumber;
    @ApiModelProperty("不合格数量")
    private BigDecimal unqualifiedQuantity;
    @ApiModelProperty("报废数量")
    private BigDecimal scrapNumber;
    @ApiModelProperty("不良数量")
    private BigDecimal defectQuantity;
    @ApiModelProperty("返修数量")
    private BigDecimal repairNumber;
    @ApiModelProperty("返工数量")
    private BigDecimal reworkNumber;
    @ApiModelProperty("可入库数量")
    private BigDecimal canStockInNumber;
    @ApiModelProperty("占用数量")
    private BigDecimal occupyNumber;
    @ApiModelProperty("已入库数量")
    private BigDecimal alreadyStockInNumber;
    private String batchNumber;
    @ApiModelProperty("开时时间")
    private LocalDateTime startTime;
    @ApiModelProperty("报工时间")
    private LocalDateTime reportTime;
    @ApiModelProperty("保质期到期日")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime expirationTime;
    private String expirationDateControlType;
    private String expirationDateUnit;
    private String expirationDateManaged;
    private Short expirationDate;
    @ApiModelProperty("源单单据主键")
    private String sourceOrderId;
    @ApiModelProperty("源单单据编码")
    private String sourceOrderCode;
    @ApiModelProperty("源单单据明细主键")
    private String sourceDetailId;
    @ApiModelProperty("源单单据行号")
    private Integer sourceLineNumber;
    @ApiModelProperty("物料基本单位")
    private String basicUnitId;
    private String basicUnitName;
    private String basicUnitCode;
    private Integer basicUnitAccuracy;
    private Integer basicUnitRoundOffType;
    private BigDecimal basicQuantity;
    private BigDecimal basicSource;
    private BigDecimal basicTarget;
    @ApiModelProperty("物料仓库 库区 库位")
    private String inventoryStoreId;
    private String inventoryAreaId;
    private String inventoryPositionId;
    private String inventoryStoreName;
    private String inventoryAreaName;
    private String inventoryPositionName;
    @ApiModelProperty("参考单位ID")
    private String inventoryReferenceUnitId;
    private String inventoryReferenceUnitCode;
    @ApiModelProperty("参考单位名称")
    private String inventoryReferenceUnitName;
    @ApiModelProperty("参考单位精度")
    private Integer inventoryReferenceUnitAccuracy;
    @ApiModelProperty("参考单位舍入类型")
    private Integer inventoryReferenceUnitRoundOffType;
    private BigDecimal referenceQuantity;
    private BigDecimal referenceSource;
    private BigDecimal referenceTarget;
    @ApiModelProperty("工时")
    private BigDecimal workHour;
    @ApiModelProperty("计划跟踪号")
    private String trackNo;
    @ApiModelProperty("源销售订单订货客户id")
    private String sourceOrderCustomerId;
    @ApiModelProperty("源销售订单订货客户名称")
    private String sourceOrderCustomerName;
    @ApiModelProperty("序列号")
    private String serialNumber;
    @ApiModelProperty("报工产线主键")
    private String productionLineId;
    @ApiModelProperty("报工产线编码")
    private String productionLineCode;
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
    @ApiModelProperty("报工产线名称")
    private String productionLineName;
    private MesProductionArchiveScheme productionArchiveScheme;
    private List<MesProductionParam> productionParamList;
    private String projectCode;
    private String contractCode;
    @TableField(exist = false)
    private String isMateialDemand;
    private LocalDateTime auditTime;
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
    public BigDecimal occupyNumberNN() {
        if (Objects.isNull(occupyNumber)) {
            return BigDecimal.ZERO;
        }
        return occupyNumber;
    }

    @Override
    public String getOrderDetailId() {
        return detailId;
    }

    @Override
    public String getCustomerId() {
        return sourceOrderCustomerId;
    }
}

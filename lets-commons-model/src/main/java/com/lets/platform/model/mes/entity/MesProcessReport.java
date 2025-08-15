package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
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

/**
 * 工序汇报单
 *
 * @author DING WEI
 * @since 2024-01-02
 */
@Getter
@Setter
@TableName("mes_process_report")
@ApiModel(value = "MesProcessReport对象", description = "工序汇报单")
public class MesProcessReport extends BaseEntity implements ProductionParamInterface {

    @TableField(exist = false)
    List<MesProductionParam> productionParamList;
    @ApiModelProperty("单据编号")
    @TableField("code")
    private String code;
    @ApiModelProperty("流水号")
    @TableField("serial_number")
    private Integer serialNumber;
    @ApiModelProperty("单据类别主键")
    @TableField("order_category_id")
    private String orderCategoryId;
    @ApiModelProperty("单据类别名称")
    @TableField("order_category_name")
    private String orderCategoryName;
    @ApiModelProperty("业务类型编码")
    @TableField("business_id")
    private String businessId;
    @ApiModelProperty("业务类型名称")
    @TableField("business_name")
    private String businessName;
    @ApiModelProperty("单据日期")
    @TableField("order_time")
    private LocalDateTime orderTime;
    @TableField(exist = false)
    private String orderTimeFormat;
    @ApiModelProperty("生产部门")
    @TableField("produce_org_id")
    private String produceOrgId;
    @ApiModelProperty("生产部门名称")
    @TableField("produce_org_name")
    private String produceOrgName;
    @ApiModelProperty("生产人员")
    @TableField("produce_user_id")
    private String produceUserId;
    @ApiModelProperty("生产人员名称")
    @TableField("produce_user_name")
    private String produceUserName;
    @ApiModelProperty("生产单元")
    @TableField("produce_factory_mode_id")
    private String produceFactoryModeId;
    @ApiModelProperty("生产单元名称")
    @TableField("produce_factory_mode_name")
    private String produceFactoryModeName;
    @ApiModelProperty("单据状态[0:创建,1:暂存,2:审核中,3:已审核,4:已过账]")
    @TableField("status")
    private Integer status;
    @TableField(exist = false)
    private String statusName;
    @ApiModelProperty("作废状态[0:否;1:是]")
    @TableField("cancel")
    private Integer cancel;
    @TableField(exist = false)
    private String cancelName;
    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;
    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    private LocalDateTime auditTime;
    @ApiModelProperty("审核人")
    @TableField("audit_user")
    private String auditUser;
    @ApiModelProperty("审核人名称")
    @TableField("audit_user_name")
    private String auditUserName;
    @ApiModelProperty("是否生成汇报入库单(首件-工位机报工-委外接收审核)(YN)")
    @TableField("generate_wip")
    private String generateWip;
    /**
     * +++++++++++++++++++++明细+++++++++++++++++++++
     */
    @TableField(exist = false)
    private List<MesProcessReportDetail> details;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("计件工资")
    @TableField(exist = false)
    private BigDecimal workPrice;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("工时单价")
    @TableField(exist = false)
    private BigDecimal hourPrice;
    @TableField(exist = false)
    private BigDecimal totalPrice;
    @TableField(exist = false)
    private Boolean enableSingleWage;
    @TableField(exist = false)
    private String isSingleWage;
    @TableField(exist = false)
    private String isSingleWageName;
    @ApiModelProperty("明细主键")
    @TableField(exist = false)
    private String detailId;
    @ApiModelProperty("单据主键")
    @TableField(exist = false)
    private String orderId;
    @ApiModelProperty("派工单ID")
    @TableField(exist = false)
    private String dispatchId;
    @ApiModelProperty("派工单CODE")
    @TableField(exist = false)
    private String dispatchCode;
    @ApiModelProperty("行号")
    @TableField(exist = false)
    private Long lineNumber;
    @ApiModelProperty("生产工单-主键")
    @TableField(exist = false)
    private String produceOrderId;
    @ApiModelProperty("生产工单-单号")
    @TableField(exist = false)
    private String produceOrderCode;
    @ApiModelProperty("生产工单-行号")
    @TableField(exist = false)
    private Long produceLineNumber;
    @ApiModelProperty("生产工单-明细主键")
    @TableField(exist = false)
    private String produceDetailId;
    @ApiModelProperty("生产工单-批号")
    @TableField(exist = false)
    private String produceBatchNumber;
    @ApiModelProperty("物料主键")
    @TableField(exist = false)
    private String materialId;
    @ApiModelProperty("物料编码")
    @TableField(exist = false)
    private String materialCode;
    @ApiModelProperty("物料名称")
    @TableField(exist = false)
    private String materialName;
    @ApiModelProperty("物料规格型号")
    @TableField(exist = false)
    private String materialSpecs;
    @ApiModelProperty("物料类型")
    @TableField(exist = false)
    private String materialType;
    @TableField(exist = false)
    private String materialTypeName;
    @ApiModelProperty("物料特征属性")
    @TableField(exist = false)
    private String materialSpecific;
    @ApiModelProperty("工序号")
    @TableField(exist = false)
    private String processNo;
    @ApiModelProperty("工序主键")
    @TableField(exist = false)
    private String processId;
    @ApiModelProperty("工序编码")
    @TableField(exist = false)
    private String processCode;
    @ApiModelProperty("工序名称")
    @TableField(exist = false)
    private String processName;
    @ApiModelProperty("工序类型")
    @TableField(exist = false)
    private String processType;
    @TableField(exist = false)
    private String processTypeName;
    @ApiModelProperty("工序组主键")
    @TableField(exist = false)
    private String processGroupId;
    @ApiModelProperty("工序组名称")
    @TableField(exist = false)
    private String processGroupName;
    @ApiModelProperty("工序单位主键")
    @TableField(exist = false)
    private String processUnitId;
    @ApiModelProperty("工序单位名称")
    @TableField(exist = false)
    private String processUnitName;
    @ApiModelProperty("工序单位精度")
    @TableField(exist = false)
    private Integer processUnitAccuracy;
    @ApiModelProperty("工序单位舍入方式")
    @TableField(exist = false)
    private Integer processUnitRoundOffType;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("完工数量")
    @TableField(exist = false)
    private BigDecimal finishWorkNumber;
    @ApiModelProperty("工序检验[0:否;1:是]")
    @TableField(exist = false)
    private Integer processInspect;
    @TableField(exist = false)
    private String processInspectName;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("合格数量")
    @TableField(exist = false)
    private BigDecimal richNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("工废数量")
    @TableField(exist = false)
    private BigDecimal processScrapNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("料废数量")
    @TableField(exist = false)
    private BigDecimal materialScrapNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("返修数量")
    @TableField(exist = false)
    private BigDecimal repairNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("损耗数量")
    @TableField(exist = false)
    private BigDecimal lossNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("不良数量")
    @TableField(exist = false)
    private BigDecimal poorNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("报废数量")
    @TableField(exist = false)
    private BigDecimal scrapNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("合格率")
    @TableField(exist = false)
    private BigDecimal richRate;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("废品率")
    @TableField(exist = false)
    private BigDecimal scrapRate;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("返修率")
    @TableField(exist = false)
    private BigDecimal repairRate;
    @ApiModelProperty("班次主键")
    @TableField(exist = false)
    private String shiftId;
    @ApiModelProperty("班次名称")
    @TableField(exist = false)
    private String shiftName;
    @ApiModelProperty(value = "班次时间段主键", hidden = true)
    @TableField(exist = false)
    private String shiftTimesId;
    @ApiModelProperty("班组主键")
    @TableField(exist = false)
    private String teamsId;
    @ApiModelProperty("班组名称")
    @TableField(exist = false)
    private String teamsName;
    @ApiModelProperty("设备主键")
    @TableField(exist = false)
    private String deviceId;
    @ApiModelProperty("设备名称")
    @TableField(exist = false)
    private String deviceName;
    @ApiModelProperty("操作工主键")
    @TableField(exist = false)
    private String operatorId;
    @ApiModelProperty("操作工名称")
    @TableField(exist = false)
    private String operatorName;
    @ApiModelProperty("工时(min)")
    @TableField(exist = false)
    private Integer standardTime;
    @ApiModelProperty("源单类型[1：工序计划单]")
    @TableField(exist = false)
    private String sourceOrderType;
    @TableField(exist = false)
    private String sourceOrderTypeName;
    @ApiModelProperty("源单主键(工序计划单-主键)")
    @TableField(exist = false)
    private String sourceOrderId;
    @ApiModelProperty("源单编码(工序计划单-编码)")
    @TableField(exist = false)
    private String sourceOrderCode;
    @ApiModelProperty("源单明细主键(工序计划单-明细-主键)")
    @TableField(exist = false)
    private String sourceOrderDetailId;
    @ApiModelProperty("源单行号(工序计划工序号)")
    @TableField(exist = false)
    private String sourceLineNumber;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private Long workTime;
    @ApiModelProperty("计划跟踪号")
    @TableField(exist = false)
    private String trackNo;
    @ApiModelProperty("源销售订单订货客户id")
    @TableField(exist = false)
    private String sourceOrderCustomerId;
    @ApiModelProperty("源销售订单订货客户名称")
    @TableField(exist = false)
    private String sourceOrderCustomerName;
    @TableField(exist = false)
    private BigDecimal alreadyInspectNumber;
    @TableField(exist = false)
    private BigDecimal occupyInspectNumber;
    @TableField(exist = false)
    private BigDecimal alreadyStockInNumber;
    @TableField(exist = false)
    private BigDecimal occupyStockInNumber;
    @ApiModelProperty("超产数量异动")
    @TableField(exist = false)
    private BigDecimal processOverProduceNumber;
    @ApiModelProperty(value = "标准产能", hidden = true)
    @TableField(exist = false)
    private BigDecimal standardCapacity;
    /**
     * @see com.lets.platform.model.base.enums.StandardCapacityUnitEnum
     */
    @TableField(exist = false)
    private String standardCapacityUnit;
    @TableField(exist = false)
    private String projectCode;
    @TableField(exist = false)
    private String contractCode;
    @TableField(exist = false)
    private String isMateialDemand;
    @TableField(exist = false)
    private MesProductionArchiveScheme productionArchiveScheme;

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

    @ApiModelProperty("工单报工单主键")
    @TableField(exist = false)
    private String produceReportId;

    @Override
    public String getOrderDetailId() {
        return detailId;
    }

    @Override
    public String getCustomerId() {
        return sourceOrderCustomerId;
    }
}

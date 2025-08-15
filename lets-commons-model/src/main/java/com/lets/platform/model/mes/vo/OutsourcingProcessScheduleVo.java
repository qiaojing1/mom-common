package com.lets.platform.model.mes.vo;

import cn.hutool.core.date.DateTime;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.mes.entity.MesProcessPlanDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 * 委外工序进度表
 * @author zhang weiyan
 * @since 2024-08-12
 */
@Getter
@Setter
@ApiModel(value = "MesProcessPlan对象", description = "委外工序进度表")
public class OutsourcingProcessScheduleVo extends BaseEntity {

    @ApiModelProperty("单据编号")
    private String code;
    @ApiModelProperty("单据日期")
    private LocalDateTime orderTime;
    /**
     * @see com.lets.platform.model.mes.enums.processPlan.PlanTypeEnum
     */
    @ApiModelProperty("计划类型[1主计划、2返修计划、3子计划、4增补计划]")
    private String planType;
    private String planTypeName;

    @ApiModelProperty("生产工单-主键")
    private String produceOrderId;
    @ApiModelProperty("生产工单-单号")
    private String produceOrderCode;
    @ApiModelProperty("生产工单-行号")
    private Long produceLineNumber;
    @ApiModelProperty("生产工单-明细主键")
    private String produceDetailId;
    @ApiModelProperty("生产工单-源单单据主键")
    private String produceSourceOrderId;
    @ApiModelProperty("生产工单-源单单据编码")
    private String produceSourceOrderCode;
    @ApiModelProperty("生产工单-源单单据明细主键")
    private String produceSourceDetailId;
    @ApiModelProperty("生产工单-源单单据行号")
    private Long produceSourceLineNumber;

    /**
     * @see com.lets.platform.model.mes.enums.processPlan.DemandSourceTypeEnum
     */
    @ApiModelProperty("需求来源类型[1:计划订单、2:销售订单、3:生产工单]")
    private Integer demandSourceType;
    private String demandSourceTypeName;

    @ApiModelProperty("生产工单-生产部门")
    private String produceOrgId;
    @ApiModelProperty("生产工单-生产部门名称")
    private String produceOrgName;
    @ApiModelProperty("生产工单-生产人员")
    private String produceUserId;
    @ApiModelProperty("生产工单-生产人员名称")
    private String produceUserName;

    @ApiModelProperty("生产单元")
    private String produceFactoryModeId;
    @ApiModelProperty("生产单元名称")
    private String produceFactoryModeName;

    @ApiModelProperty("生产工单-物料主键")
    private String produceMaterialId;
    @ApiModelProperty("生产工单-物料编码")
    private String produceMaterialCode;
    @ApiModelProperty("生产工单-物料名称")
    private String produceMaterialName;
    @ApiModelProperty("生产工单-物料规格型号")
    private String produceMaterialSpecs;
    @ApiModelProperty("生产工单-物料类型")
    private String produceMaterialType;
    @ApiModelProperty("生产工单-物料特征属性")
    private String produceMaterialSpecific;
    @ApiModelProperty("生产工单-BOM版本")
    private String produceBomId;
    @ApiModelProperty("生产工单-BOM版本")
    private String produceBomVersion;
    @ApiModelProperty("生产工单-工艺路线")
    private String produceRouteId;
    @ApiModelProperty("生产工单-工艺路线名称")
    private String produceRouteName;

    @ApiModelProperty("生产工单-计划开始时间")
    private LocalDateTime producePlanStartTime;
    private String producePlanStartTimeFormat;
    @ApiModelProperty("生产工单-计划结束时间")
    private LocalDateTime producePlanEndTime;
    private String producePlanEndTimeFormat;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("生产工单-基本数量")
    private BigDecimal produceBasicNumber;
    @ApiModelProperty("生产工单-批号")
    private String produceBatchNumber;

    @ApiModelProperty("生产工单-生产单位主键")
    private String produceUnitId;
    @ApiModelProperty("生产工单-生产单位编码")
    private String produceUnitCode;
    @ApiModelProperty("生产工单-生产单位名称")
    private String produceUnitName;
    @ApiModelProperty("生产工单-生产单位精度")
    private Integer produceUnitAccuracy;
    @ApiModelProperty("生产工单-生产单位舍入方式")
    private Integer produceUnitRoundOffType;
    @ApiModelProperty("生产工单-数量")
    private BigDecimal produceNumber;

    @ApiModelProperty("单据状态[0:创建,1:暂存,2:审核中,3:已审核,4:已过账]")
    private Integer status;
    private String statusName;
    @ApiModelProperty("关闭状态[0:关闭;1:正常]")
    private Integer enable;
    private String enableName;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("审核时间")
    private LocalDateTime auditTime;
    @ApiModelProperty("审核人")
    private String auditUser;
    @ApiModelProperty("审核人名称")
    private String auditUserName;

    @ApiModelProperty("是否能编辑-目前IPQC生成的返修计划不可编辑(YN)")
    private String canEdit;

    @ApiModelProperty("生产工单-计划状态")
    private String planStatus;
    private String planStatusName;
    @ApiModelProperty("生产工单-任务状态")
    private String taskStatus;
    private String taskStatusName;
    @ApiModelProperty("生产工单-业务状态")
    private String businessStatus;
    private String businessStatusName;

    @ApiModelProperty("采购计价单位主键")
    private String purchasePricingUnitId;
    @ApiModelProperty("采购计价单位编码")
    private String purchasePricingUnitCode;
    @ApiModelProperty("采购计价单位名称")
    private String purchasePricingUnitName;
    @ApiModelProperty("采购计价单位精度")
    private Integer purchasePricingUnitAccuracy;
    @ApiModelProperty("采购计价单位舍入方式")
    private Integer purchasePricingUnitRoundOffType;

    @ApiModelProperty("明细")
    private List<MesProcessPlanDetail> details;

    private String detailId;
    @ApiModelProperty("单据主键")
    private String orderId;
    @ApiModelProperty("工序号")
    private String processNo;

    @ApiModelProperty("工艺路线-工序主键")
    private String routeProcessId;
    @ApiModelProperty("工序主键")
    private String processId;
    @ApiModelProperty("工序编码")
    private String processCode;
    @ApiModelProperty("工序名称")
    private String processName;
    /**
     * @see com.lets.platform.model.common.enums.CommonProcessTypeEnum
     */
    @ApiModelProperty("工序类型")
    private String processType;
    private String processTypeName;
    /**
     * @see com.lets.platform.model.common.enums.ProcessTechniqueEnum
     */
    private Integer processTechnique;
    private String processTechniqueName;
    @ApiModelProperty("工序组主键")
    private String processGroupId;
    @ApiModelProperty("工序组名称")
    private String processGroupName;

    @ApiModelProperty("生产单元")
    private String factoryModeId;
    @ApiModelProperty("生产单元名称")
    private String factoryModeName;
    @ApiModelProperty("计划开始时间")
    private LocalDateTime planStartTime;
    private String planStartTimeFormat;
    @ApiModelProperty("计划结束时间")
    private LocalDateTime planEndTime;
    private String planEndTimeFormat;
    @ApiModelProperty("工序单位主键")
    private String processUnitId;
    @ApiModelProperty("工序单位名称")
    private String processUnitName;
    @ApiModelProperty("工序单位精度")
    private Integer processUnitAccuracy;
    @ApiModelProperty("工序单位舍入方式")
    private Integer processUnitRoundOffType;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("工序数量(生产工单中的数量*转换系数)")
    private BigDecimal processNumber;
    @ApiModelProperty("基本批量")
    private BigDecimal basicBatchSize;
    @ApiModelProperty("转换系数")
    private BigDecimal convertRatio;
    @ApiModelProperty("计件工资")
    private BigDecimal workPrice;
    @ApiModelProperty("准备时长(min)")
    private Integer prepareTime;
    @ApiModelProperty("标准工时(min)")
    private Integer standardTime;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("合格数量")
    private BigDecimal richNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("不合格数量")
    private BigDecimal unqualifiedNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("报废数量")
    private BigDecimal scrapNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("不良数量")
    private BigDecimal poorNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("返修数量")
    private BigDecimal repairNumber;
    @ApiModelProperty("让步接收数量")
    private BigDecimal giveInNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("损耗数量")
    private BigDecimal lossNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("转入数量")
    private BigDecimal rollInNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("转出数量")
    private BigDecimal rollOutNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("结存数量")
    private BigDecimal remainNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("合格率")
    private BigDecimal qualifiedRatio;

    /**
     * @see com.lets.platform.model.mes.enums.processPlan.PlanDetailStatusEnum
     */
    @ApiModelProperty("状态")
    private Integer detailStatus;
    private String detailStatusName;

    @ApiModelProperty("是否作废[0否1是]")
    private Integer cancel;
    private String cancelName;
    @ApiModelProperty("工序检验[0否1是]")
    private Integer processInspect;
    private String processInspectName;

    @ApiModelProperty("备注")
    private String detailRemark;

    @ApiModelProperty("副本工艺路线主键")
    private String copyRouteId;
    @ApiModelProperty("副本工艺路线明细主键")
    private String copyRouteDetailId;

    /**
     * @see com.lets.platform.model.mes.enums.processPlan.PlanDataSourceEnum
     */
    @ApiModelProperty(value = "数据来源[0：工单下发、1：页面新增]", hidden = true)
    private String dataSource;

    @ApiModelProperty(hidden = true)
    private String sameRouteDetailId;


    // 批量派工
    private BigDecimal alreadyDispatchNumber;
    /**
     * @see com.lets.platform.common.pojo.enums.FinishEnum
     */
    private String dispatchStatus;
    private String dispatchStatusName;
    private String alreadyDispatchNumberStr;

    @ApiModelProperty("计划跟踪号")
    private String trackNo;
    @ApiModelProperty("源销售订单订货客户id")
    private String sourceOrderCustomerId;
    @ApiModelProperty("源销售订单订货客户名称")
    private String sourceOrderCustomerName;

    @ApiModelProperty("已经委外发出数量(计价单位)")
    private BigDecimal alreadyOutsourcingPricingNumber;
    @ApiModelProperty("委外发出占用数量")
    private BigDecimal occupyOutsourcingNumber;
    @ApiModelProperty("已经委外接收数量")
    private BigDecimal alreadyOutsourcingInNumber;
    @ApiModelProperty("已经委外接收数量(计价单位)")
    private BigDecimal alreadyOutsourcingInPricingNumber;
    @ApiModelProperty("委外接收占用数量")
    private BigDecimal occupyOutsourcingInNumber;
    @ApiModelProperty("委外接收占用数量(计价单位)")
    private BigDecimal occupyOutsourcingInPricingNumber;

    private String outsourcingSupplierName;
    private String outsourcingSupplierId;
    private String outsourcingSupplierCode;
    private LocalDateTime maxOrderTime;
    private LocalDateTime minOrderTime;
    // 委外周期 (天) 工序计划中委外工序的最晚的转出类型转移单单据日期 - 最早转入类型的转移单单据日期，工序状态=完工时不显示
    private long outsourcingReduce;

    public BigDecimal getRichNumber() {
        return Objects.nonNull(richNumber) ? richNumber : BigDecimal.ZERO;
    }

    public BigDecimal getUnqualifiedNumber() {
        return Objects.nonNull(unqualifiedNumber) ? unqualifiedNumber : BigDecimal.ZERO;
    }

    public BigDecimal getScrapNumber() {
        return Objects.nonNull(scrapNumber) ? scrapNumber : BigDecimal.ZERO ;
    }

    public BigDecimal getPoorNumber() {
        return Objects.nonNull(poorNumber) ? poorNumber : BigDecimal.ZERO ;
    }

    public BigDecimal getRepairNumber() {
        return Objects.nonNull(repairNumber) ? repairNumber : BigDecimal.ZERO ;
    }

    public BigDecimal getGiveInNumber() {
        return Objects.nonNull(giveInNumber) ? giveInNumber : BigDecimal.ZERO ;
    }

    public BigDecimal getLossNumber() {
        return Objects.nonNull(lossNumber) ? lossNumber : BigDecimal.ZERO ;
    }

    public BigDecimal getRollInNumber() {
        return Objects.nonNull(rollInNumber) ? rollInNumber : BigDecimal.ZERO ;
    }

    public BigDecimal getRollOutNumber() {
        return Objects.nonNull(rollOutNumber) ? rollOutNumber : BigDecimal.ZERO ;
    }

    public BigDecimal getRemainNumber() {
        return Objects.nonNull(remainNumber) ? remainNumber : BigDecimal.ZERO ;
    }
}

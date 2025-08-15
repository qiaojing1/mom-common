package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.mes.enums.produceOrder.ProduceChangeTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 生产工单-变更
 * @author DING WEI
 * @since 2023-12-08
 */
@Getter
@Setter
@TableName("mes_produce_order_change")
@ApiModel(value = "MesProduceOrderChange对象", description = "生产工单-变更")
public class MesProduceOrderChange extends BaseEntity {

    @ApiModelProperty("单据编号")
    @TableField("code")
    private String code;

    @ApiModelProperty("单据类别主键")
    @TableField("order_category_id")
    private String orderCategoryId;
    @ApiModelProperty("单据类别名称")
    @TableField("order_category_name")
    private String orderCategoryName;

    @ApiModelProperty("业务类型")
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

    /**
     * @see com.lets.platform.model.mes.enums.produceOrder.ProduceChangeReasonEnum
     */
    @ApiModelProperty("变更原因[1生产计划调整2客户需求变更]")
    @TableField("change_reason")
    private String changeReason;
    @TableField(exist = false)
    private String changeReasonName;

    @ApiModelProperty("计划部门主键")
    @TableField("plan_org_id")
    private String planOrgId;
    @ApiModelProperty("计划部门名称")
    @TableField("plan_org_name")
    private String planOrgName;

    @ApiModelProperty("计划人员主键")
    @TableField("plan_user_id")
    private String planUserId;
    @ApiModelProperty("计划人员名称")
    @TableField("plan_user_name")
    private String planUserName;

    @ApiModelProperty("生产单元主键")
    @TableField("default_factory_mode_id")
    private String defaultFactoryModeId;
    @ApiModelProperty("生产单元名称")
    @TableField("default_factory_mode_name")
    private String defaultFactoryModeName;

    @ApiModelProperty("工艺路线主键")
    @TableField("default_route_id")
    private String defaultRouteId;
    @ApiModelProperty("工艺路线名称")
    @TableField("default_route_name")
    private String defaultRouteName;

    @ApiModelProperty("单据状态")
    @TableField("status")
    private Integer status;
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    private LocalDateTime auditTime;
    @ApiModelProperty("审核人员")
    @TableField("audit_user")
    private String auditUser;
    @ApiModelProperty("审核人员名称")
    @TableField("audit_user_name")
    private String auditUserName;

    @ApiModelProperty("变更明细")
    @TableField(exist = false)
    private List<MesProduceOrderChangeDetail> details;

    /**
     * +++++++++++++++++++++++++++++++++++++++++++++++++++明细字段+++++++++++++++++++++++++++++++++++++++++++++++++++
     */

    @ApiModelProperty("明细主键")
    @TableField(exist = false)
    private String detailId;
    @ApiModelProperty("单据主键")
    @TableField(exist = false)
    private String orderId;

    @ApiModelProperty("行号")
    @TableField(exist = false)
    private Long lineNumber;

    /**
     * @see ProduceChangeTypeEnum
     */
    @ApiModelProperty("变更方式[1修改]")
    @TableField(exist = false)
    private String changeType;
    @TableField(exist = false)
    private String changeTypeName;
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
    @ApiModelProperty("物料特征属性")
    @TableField(exist = false)
    private String materialSpecificName;
    @ApiModelProperty("物料分组主键")
    @TableField(exist = false)
    private String materialGroupId;
    @ApiModelProperty("批号控制方式[0不管控,1不可有批号,2必须有批号]")
    @TableField(exist = false)
    private String lotNoControlType;
    @ApiModelProperty("批号应用范围[0全部,1库存管理,2生产管理]")
    @TableField(exist = false)
    private String lotNoScope;
    @ApiModelProperty("日产量")
    @TableField(exist = false)
    private BigDecimal productionDailyOutput;

    @ApiModelProperty("产品类型[1主产品]")
    @TableField(exist = false)
    private String productType;
    @TableField(exist = false)
    private String productTypeName;

    @ApiModelProperty("生产单位")
    @TableField(exist = false)
    private String produceUnitId;
    @ApiModelProperty("生产单位编码")
    @TableField(exist = false)
    private String produceUnitCode;
    @ApiModelProperty("生产单位名称")
    @TableField(exist = false)
    private String produceUnitName;
    @ApiModelProperty("生产单位精度")
    @TableField(exist = false)
    private Integer produceUnitAccuracy;
    @ApiModelProperty("生产单位舍入方式")
    @TableField(exist = false)
    private Integer produceUnitRoundOffType;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("变更前数量")
    @TableField(exist = false)
    private BigDecimal beforeNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("变更后数量")
    @TableField(exist = false)
    private BigDecimal afterNumber;

    @ApiModelProperty("生产单元")
    @TableField(exist = false)
    private String factoryModeId;
    @ApiModelProperty("生产单元名称")
    @TableField(exist = false)
    private String factoryModeName;

    @ApiModelProperty("BOM版本")
    @TableField(exist = false)
    private String bomId;
    @ApiModelProperty("BOM版本")
    @TableField(exist = false)
    private String bomVersion;

    @ApiModelProperty("工艺路线")
    @TableField(exist = false)
    private String routeId;
    @ApiModelProperty("工艺路线名称")
    @TableField(exist = false)
    private String routeName;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("计划开始时间")
    @TableField(exist = false)
    private LocalDateTime planStartTime;
    @TableField(exist = false)
    private String planStartTimeFormat;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("计划结束时间")
    @TableField(exist = false)
    private LocalDateTime planEndTime;
    @TableField(exist = false)
    private String planEndTimeFormat;

    @ApiModelProperty("批号")
    @TableField(exist = false)
    private String batchNumber;

    @ApiModelProperty("基本单位")
    @TableField(exist = false)
    private String basicUnitId;
    @ApiModelProperty("基本单位编码")
    @TableField(exist = false)
    private String basicUnitCode;
    @ApiModelProperty("基本单位名称")
    @TableField(exist = false)
    private String basicUnitName;
    @ApiModelProperty("基本单位精度")
    @TableField(exist = false)
    private Integer basicUnitAccuracy;
    @ApiModelProperty("基本单位舍入类型")
    @TableField(exist = false)
    private Integer basicUnitRoundOffType;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("基本数量")
    @TableField(exist = false)
    private BigDecimal basicNumber;

    @ApiModelProperty("计划状态")
    @TableField(exist = false)
    private String planStatus;
    @TableField(exist = false)
    private String planStatusName;

    @ApiModelProperty("任务状态")
    @TableField(exist = false)
    private String taskStatus;
    @TableField(exist = false)
    private String taskStatusName;

    @ApiModelProperty("业务状态")
    @TableField(exist = false)
    private String businessStatus;
    @TableField(exist = false)
    private String businessStatusName;

    @ApiModelProperty("领料状态")
    @TableField(exist = false)
    private String pickingStatus;
    @TableField(exist = false)
    private String pickingStatusName;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("未处理不良数量")
    @TableField(exist = false)
    private BigDecimal untreatedPoorNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("合格数量")
    @TableField(exist = false)
    private BigDecimal richNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("合格品入库数量")
    @TableField(exist = false)
    private BigDecimal stockInRichNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("不合格品入库数量")
    @TableField(exist = false)
    private BigDecimal stockInPoorNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("报废数量")
    @TableField(exist = false)
    private BigDecimal scrapNumber;
    @ApiModelProperty("成品率")
    @TableField(exist = false)
    private BigDecimal yieldRate;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("预计报废数量")
    @TableField(exist = false)
    private BigDecimal expectScrapNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("报废入库数量")
    @TableField(exist = false)
    private BigDecimal stockInScrapNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("待入库数量")
    @TableField(exist = false)
    private BigDecimal waitStockInNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("报工数量")
    @TableField(exist = false)
    private BigDecimal reportNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("让步数量")
    @TableField(exist = false)
    private BigDecimal giveWayNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("返修数量")
    @TableField(exist = false)
    private BigDecimal repairNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("返工数量")
    @TableField(exist = false)
    private BigDecimal reworkNumber;

    @ApiModelProperty("入库仓库主键")
    @TableField(exist = false)
    private String stockInStoreId;
    @ApiModelProperty("入库仓库名称")
    @TableField(exist = false)
    private String stockInStoreName;
    @ApiModelProperty("入库库区主键")
    @TableField(exist = false)
    private String stockInAreaId;
    @ApiModelProperty("入库库区名称")
    @TableField(exist = false)
    private String stockInAreaName;
    @ApiModelProperty("入库库位主键")
    @TableField(exist = false)
    private String stockInPositionId;
    @ApiModelProperty("入库库位名称")
    @TableField(exist = false)
    private String stockInPositionName;

    @ApiModelProperty("上限允差(%)")
    @TableField(exist = false)
    private BigDecimal upperLimitPercent;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("上限数量")
    @TableField(exist = false)
    private BigDecimal upperLimitNumber;
    @ApiModelProperty("下限允差(%)")
    @TableField(exist = false)
    private BigDecimal lowerLimitPercent;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("下限数量")
    @TableField(exist = false)
    private BigDecimal lowerLimitNumber;

    @ApiModelProperty("完工时间")
    @TableField(exist = false)
    private LocalDateTime finishTime;

    @ApiModelProperty("关闭时间")
    @TableField(exist = false)
    private LocalDateTime closeTime;

    @ApiModelProperty("订单需求日期")
    @TableField(exist = false)
    private LocalDateTime orderDemandTime;

    @ApiModelProperty("备注")
    @TableField(exist = false)
    private String detailRemark;

    @ApiModelProperty("源单单据主键")
    @TableField(exist = false)
    private String sourceOrderId;
    @ApiModelProperty("源单单据编码")
    @TableField(exist = false)
    private String sourceOrderCode;
    @ApiModelProperty("源单单据明细主键")
    @TableField(exist = false)
    private String sourceDetailId;
    @ApiModelProperty("源单行号")
    @TableField(exist = false)
    private Integer sourceLineNumber;
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
    private String projectCode;
    @TableField(exist = false)
    private String contractCode;
}

package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.psi.entity.PsiMaterialInventory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * 生产工单
 *
 * @author DING WEI
 * @since 2023-12-05
 */
@Getter
@Setter
@TableName("mes_produce_order")
@ApiModel(value = "MesProduceOrder对象", description = "生产工单")
public class MesProduceOrder extends BaseEntity {

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private Integer index;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String sheetName;

    @ApiModelProperty("明细主键")
    @TableField(exist = false)
    private String detailId;

    @ApiModelProperty("单据编号")
    @TableField("code")
    private String code;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String excelCode;

    @NotBlank(message = "Order.orderCategoryId", groups = {Save.class, Update.class})
    @ApiModelProperty("单据类别主键")
    @TableField("order_category_id")
    private String orderCategoryId;
    @ApiModelProperty("单据类别主键")
    @TableField("order_category_Code")
    private String orderCategoryCode;
    @ApiModelProperty("单据类别名称")
    @TableField("order_category_name")
    private String orderCategoryName;

    @ApiModelProperty("业务类型")
    @TableField("business_id")
    private String businessId;

    @ApiModelProperty("业务类型名称")
    @TableField("business_name")
    private String businessName;

    @ApiModelProperty("供应商主键")
    @TableField("supplier_id")
    private String supplierId;
    @ApiModelProperty("供应商名称")
    @TableField("supplier_name")
    private String supplierName;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "Order.orderTime", groups = {Save.class, Update.class})
    @ApiModelProperty("单据日期")
    @TableField("order_time")
    private LocalDateTime orderTime;
    @TableField(exist = false)
    private String orderTimeFormat;

    //    @NotBlank(message = "ProduceOrder.planOrgId", groups = {Save.class, Update.class})
    @ApiModelProperty("计划部门主键")
    @TableField("plan_org_id")
    private String planOrgId;
    @ApiModelProperty("计划部门名称")
    @TableField("plan_org_name")
    private String planOrgName;

    //    @NotBlank(message = "ProduceOrder.planUserId", groups = {Save.class, Update.class})
    @ApiModelProperty("计划人员主键")
    @TableField("plan_user_id")
    private String planUserId;
    @ApiModelProperty("计划人员名称")
    @TableField("plan_user_name")
    private String planUserName;

    @ApiModelProperty("默认生产单元主键")
    @TableField("default_factory_mode_id")
    private String defaultFactoryModeId;
    @ApiModelProperty("默认生产单元名称")
    @TableField("default_factory_mode_name")
    private String defaultFactoryModeName;
    @ApiModelProperty("默认工艺路线主键")
    @TableField("default_route_id")
    private String defaultRouteId;
    @ApiModelProperty("默认工艺路线名称")
    @TableField("default_route_name")
    private String defaultRouteName;

    /**
     * @see com.lets.platform.model.base.enums.OrderStatusEnum
     */
    @ApiModelProperty("单据状态")
    @TableField("status")
    private Integer status;
    @TableField(exist = false)
    private String statusName;

    @Length(max = 200, message = "Order.remark", groups = {Save.class, Update.class})
    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;
    @TableField(exist = false)
    private String detailRemark;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    private LocalDateTime auditTime;
    @ApiModelProperty("审核人员")
    @TableField("audit_user")
    private String auditUser;
    @ApiModelProperty("审核人员名称")
    @TableField("audit_user_name")
    private String auditUserName;

    @ApiModelProperty(value = "用来区分是前端还是服务内部投放的数据", hidden = true)
    @TableField(exist = false)
    private String orderSource;

    @ApiModelProperty("合并工单")
    @TableField("merge_order")
    private Integer mergeOrder;

    /**
     * ++++++++++++++++++++++++++++明细字段++++++++++++++++++++++++++++
     */
    @ApiModelProperty("单据主键")
    @TableField(exist = false)
    private String orderId;

    @ApiModelProperty("行号")
    @TableField(exist = false)
    private Long lineNumber;

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
    @ApiModelProperty("是否开始可存货")
    @TableField(exist = false)
    private String materialStorable;


    @ApiModelProperty("特征属性")
    @TableField(exist = false)
    private List<MesProduceOrderDetailSpecific> detailSpecifics;
    @ApiModelProperty("物料特征属性名称")
    @TableField(exist = false)
    private String materialSpecific;
    @ApiModelProperty("批号控制方式[0不管控,1不可有批号,2必须有批号]")
    @TableField(exist = false)
    private String lotNoControlType;
    @ApiModelProperty("批号应用范围[0全部,1库存管理,2生产管理]")
    @TableField(exist = false)
    private String lotNoScope;
    @ApiModelProperty("日产量")
    @TableField(exist = false)
    private BigDecimal productionDailyOutput;

    /**
     * @see com.lets.platform.model.mes.enums.produceOrder.ProductTypeEnum
     */
    @ApiModelProperty("产品类型")
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
    @ApiModelProperty("生产单位舍入类型")
    @TableField(exist = false)
    private Integer produceUnitRoundOffType;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("数量")
    @TableField(exist = false)
    private BigDecimal number;
    @TableField(exist = false)
    private String numberFormat;

    @ApiModelProperty("生产单元主键")
    @TableField(exist = false)
    private String factoryModeId;
    @ApiModelProperty("生产单元名称")
    @TableField(exist = false)
    private String factoryModeName;

    @ApiModelProperty("BOM版本")
    @TableField(exist = false)
    private String bomId;
    @TableField(exist = false)
    private String bomVersion;
    @ApiModelProperty("BOM版本描述")
    @TableField(exist = false)
    private String bomVersionDescribe;

    @ApiModelProperty("工艺路线")
    @TableField(exist = false)
    private String routeId;
    @TableField(exist = false)
    private String routeName;
    @TableField(exist = false)
    private String redRouteName;

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
    @ApiModelProperty("最晚工单报工单报工时间")
    @TableField(exist = false)
    private LocalDateTime lastReportTime;

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

    /**
     * @see com.lets.platform.model.mes.enums.produceOrder.PlanStatusEnum
     */
    @ApiModelProperty("计划状态")
    @TableField(exist = false)
    private String planStatus;
    @TableField(exist = false)
    private String planStatusName;


    /**
     * @see com.lets.platform.model.mes.enums.produceOrder.TaskStatusEnum
     */
    @ApiModelProperty("任务状态")
    @TableField(exist = false)
    private String taskStatus;
    @TableField(exist = false)
    private String taskStatusName;

    /**
     * @see com.lets.platform.model.mes.enums.produceOrder.BusinessStatusEnum
     */
    @ApiModelProperty("业务状态")
    @TableField(exist = false)
    private String businessStatus;
    @TableField(exist = false)
    private String businessStatusName;

    /**
     * @see com.lets.platform.model.mes.enums.produceOrder.PickingStatusEnum
     */
    @ApiModelProperty("领料状态")
    @TableField(exist = false)
    private String pickingStatus;
    @TableField(exist = false)
    private String pickingStatusName;

    /**
     * @see com.lets.platform.model.mes.enums.produceOrder.CuttingStatusEnum
     */
    @ApiModelProperty("下料状态[0未发出、1部分发出、2全部发出、3未接收、4部分接收、5全部接收]")
    @TableField(exist = false)
    private Integer cuttingStatus;
    @TableField(exist = false)
    private String cuttingStatusName;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("未处理不良数量")
    @TableField(exist = false)
    private BigDecimal poorNumber;
    @TableField(exist = false)
    private String poorNumberFormat;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("合格数量")
    @TableField(exist = false)
    private BigDecimal richNumber;
    @TableField(exist = false)
    private String richNumberFormat;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("合格品入库数量")
    @TableField(exist = false)
    private BigDecimal stockInRichNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("合格品待入库数量")
    @TableField(exist = false)
    private BigDecimal waitStockInQualifiedQuantity;
    @TableField(exist = false)
    private String stockInRichNumberFormat;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("不合格品入库数量")
    @TableField(exist = false)
    private BigDecimal stockInPoorNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("不合格品入库数量")
    @TableField(exist = false)
    private BigDecimal stockInDefectQuantity;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("不合格品入库数量")
    @TableField(exist = false)
    private BigDecimal stockInReworkQuantity;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("在制品数量")
    @TableField(exist = false)
    private BigDecimal quantityProcess;

    @TableField(exist = false)
    private String stockInPoorNumberFormat;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("报废数量")
    @TableField(exist = false)
    private BigDecimal scrapNumber;
    @TableField(exist = false)
    private String scrapNumberFormat;

    @ApiModelProperty("成品率")
    @TableField(exist = false)
    private BigDecimal yieldRate;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("预计报废数量")
    @TableField(exist = false)
    private BigDecimal expectScrapNumber;
    @TableField(exist = false)
    private String expectScrapNumberFormat;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("报废入库数量")
    @TableField(exist = false)
    private BigDecimal stockInScrapNumber;
    @TableField(exist = false)
    private String stockInScrapNumberFormat;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("待入库数量")
    @TableField(exist = false)
    private BigDecimal waitStockInNumber;
    @TableField(exist = false)
    private String waitStockInNumberFormat;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("报工数量")
    @TableField(exist = false)
    private BigDecimal reportNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("超产数量")
    @TableField(exist = false)
    private BigDecimal overProduceNumber;
    @TableField(exist = false)
    private String reportNumberFormat;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("让步数量")
    @TableField(exist = false)
    private BigDecimal giveWayNumber;
    @TableField(exist = false)
    private String giveWayNumberFormat;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("返修数量")
    @TableField(exist = false)
    private BigDecimal repairNumber;
    @TableField(exist = false)
    private String repairNumberFormat;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("返工数量")
    @TableField(exist = false)
    private BigDecimal reworkNumber;
    @TableField(exist = false)
    private String reworkNumberFormat;

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
    @TableField(exist = false)
    private String upperLimitNumberFormat;

    @ApiModelProperty("下限允差(%)")
    @TableField(exist = false)
    private BigDecimal lowerLimitPercent;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("下限数量")
    @TableField(exist = false)
    private BigDecimal lowerLimitNumber;
    @TableField(exist = false)
    private String lowerLimitNumberFormat;

    @ApiModelProperty("完工时间")
    @TableField(exist = false)
    private LocalDateTime finishTime;

    @ApiModelProperty("关闭时间")
    @TableField(exist = false)
    private LocalDateTime closeTime;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("订单需求日期")
    @TableField(exist = false)
    private LocalDateTime orderDemandTime;

    @ApiModelProperty("源单类型")
    @TableField(exist = false)
    private String sourceOrderType;
    @TableField(exist = false)
    private String sourceOrderTypeName;
    @ApiModelProperty("源单单据主键")
    @TableField(exist = false)
    private String sourceOrderId;
    @ApiModelProperty("源单单据编码")
    @TableField(exist = false)
    private String sourceOrderCode;
    @ApiModelProperty("源单单据明细主键")
    @TableField(exist = false)
    private String sourceDetailId;
    @ApiModelProperty("源单单据行号")
    @TableField(exist = false)
    private Long sourceLineNumber;
    @ApiModelProperty("计划跟踪号")
    @TableField(exist = false)
    private String trackNo;
    @ApiModelProperty("源销售订单订货客户id")
    @TableField(exist = false)
    private String sourceOrderCustomerId;
    @ApiModelProperty("源销售订单订货客户名称")
    @TableField(exist = false)
    private String sourceOrderCustomerName;
    @ApiModelProperty("实际开工时间")
    @TableField(exist = false)
    private LocalDateTime realStartTime;
    @ApiModelProperty("序列号")
    @TableField(exist = false)
    private String serialNumber;
    @TableField(exist = false)
    private String isMateialDemand;
    @NotEmpty(message = "ProduceOrder.details", groups = {Save.class, Update.class})
    @TableField(exist = false)
    private List<MesProduceOrderDetail> details;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private MesProduceOrderCopyBom bomCopy;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private MesProduceOrderCopyRoute routeCopy;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private PsiMaterialInventory inventory;

    @TableField(exist = false)
    private boolean allowExceedOrderReportOrStockIn;
    @TableField(exist = false)
    private boolean wipStockInInProportion;
    @TableField(exist = false)
    private BigDecimal occupyNumber;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private List<MesProduceOrderDetailSpecific> materialCharacteristicList;

    @TableField(exist = false)
    private Boolean isMrp;

    @ApiModelProperty("生产进度")
    @TableField(exist = false)
    private BigDecimal progress;

    @TableField(exist = false)
    private List<Map<String, Object>> progressList;

    @TableField(exist = false)
    private String intelligenceWorkshop;

    @TableField(exist = false)
    private String detailCode;

    @TableField(exist = false)
    private String isOverdue;

    @TableField(exist = false)
    private String almostOverdue;

    @TableField(exist = false)
    private String generateMaterialBarcodeMoment;
    @ApiModelProperty(value = "首件检验")
    @TableField(exist = false)
    private String isFirstCheck;
    @ApiModelProperty(value = "首检状态[1:未首检;2:首检中;3:已首检]")
    @TableField(exist = false)
    private String firstCheckStatus;
    @TableField(exist = false)
    private String projectCode;
    @TableField(exist = false)
    private String contractCode;

    @ApiModelProperty("是否是投放")
    @TableField(exist = false)
    private boolean putIn;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("已委外数量")
    @TableField(exist = false)
    private BigDecimal alreadyOutsourcingNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("委外占用数量")
    @TableField(exist = false)
    private BigDecimal occupyOutsourcingNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("可委外数量")
    @TableField(exist = false)
    private BigDecimal canOutsourcingNumber;

    @ApiModelProperty("是否有生产要求内容标识[YN]")
    @TableField(exist = false)
    private String isProduceDemand;

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

    /**
     * @see com.lets.platform.model.psi.enums.PlanOrderKittingStatusEnum
     */
    @ApiModelProperty("齐套状态")
    @TableField(exist = false)
    private String kittingStatus;

    @TableField(exist = false)
    private List<MesProduceOrderDetail> oldDetailList;

    @ApiModelProperty("产值分配")
    @TableField(exist = false)
    private List<MesProduceOrderDetailOutputPercent> outputPercentList;
    @ApiModelProperty("图号")
    @TableField(exist = false)
    private String drawingNumber;
    public BigDecimal reportNumberNN() {
        if (Objects.isNull(reportNumber)) {
            return BigDecimal.ZERO;
        } else {
            return reportNumber;
        }
    }

    public BigDecimal repairNumberNN() {
        if (Objects.isNull(repairNumber)) {
            return BigDecimal.ZERO;
        } else {
            return repairNumber;
        }
    }

    public BigDecimal stockInRichNumberNN() {
        if (Objects.isNull(stockInRichNumber)) {
            return BigDecimal.ZERO;
        } else {
            return stockInRichNumber;
        }
    }

    public BigDecimal stockInPoorNumberNN() {
        if (Objects.isNull(stockInPoorNumber)) {
            return BigDecimal.ZERO;
        } else {
            return stockInPoorNumber;
        }
    }

    public BigDecimal stockInScrapNumberNN() {
        if (Objects.isNull(stockInScrapNumber)) {
            return BigDecimal.ZERO;
        } else {
            return stockInScrapNumber;
        }
    }

}

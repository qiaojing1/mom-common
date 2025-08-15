package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.enums.YesOrNo;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.Map;

/**
 * 单据类别管理
 *
 * @author DING WEI
 * @since 2023-07-31
 */
@Getter
@Setter
@TableName("psi_order_category")
@ApiModel(value = "PsiOrderCategory对象", description = "单据类别管理")
public class PsiOrderCategory extends BaseEntity {

    @ExcelIgnore
    @TableField(exist = false)
    private Integer index;

    @ColumnWidth(40)
    @ExcelProperty("单据类别编码")
    @ApiModelProperty("编码")
    @TableField("code")
    private String code;

    @ColumnWidth(40)
    @ExcelProperty("单据类别名称")
    @Length(min = 1, max = 20, message = "PsiOrderCategory.name", groups = {Save.class, Update.class})
    @ApiModelProperty("名称")
    @TableField("name")
    private String name;

    @ExcelIgnore
    @NotBlank(message = "PsiOrderCategory.orderNature", groups = {Save.class, Update.class})
    @ApiModelProperty("单据性质(菜单编码)")
    @TableField("order_nature")
    private String orderNature;

    @ColumnWidth(20)
    @ExcelProperty("单据性质")
    @TableField(exist = false)
    private String orderNatureName;

    @ExcelIgnore
    @ValidatedEnum(message = "PsiOrderCategory.isDefaultOrder", enumClass = YesOrNo.class, required = true, groups = {Save.class, Update.class})
    @ApiModelProperty("是否默认单别[N否Y是]")
    @TableField("is_default_order")
    private String isDefaultOrder;
    @ColumnWidth(30)
    @ExcelProperty("是否默认单别")
    @TableField(exist = false)
    private String isDefaultOrderName;

    @ColumnWidth(30)
    @ExcelProperty("描述")
    @Length(max = 40, message = "PsiOrderCategory.description", groups = {Save.class, Update.class})
    @ApiModelProperty("描述")
    @TableField("description")
    private String description;

    @ExcelIgnore
    @ApiModelProperty("默认打印模板")
    @TableField(value = "print_template", fill = FieldFill.UPDATE)
    private String printTemplate;
    @ExcelIgnore
    @TableField(exist = false)
    private String printTemplateName;

    @ExcelIgnore
    @ValidatedEnum(message = "PsiOrderCategory.isPrintTemplateLock", enumClass = YesOrNo.class, required = true, groups = {Save.class, Update.class})
    @ApiModelProperty("是否打印模板锁定[N否Y是]")
    @TableField("is_print_template_lock")
    private String isPrintTemplateLock;
    @ExcelIgnore
    @TableField(exist = false)
    private String isPrintTemplateLockName;

    @ExcelIgnore
    @Min(value = 0, message = "PsiOrderCategory.maxPrintTimes", groups = {Save.class, Update.class})
    @Max(value = 9999999999L, message = "PsiOrderCategory.maxPrintTimes", groups = {Save.class, Update.class})
    @ApiModelProperty("最大打印次数[0不控制]")
    @TableField("max_print_times")
    private Long maxPrintTimes;
    @ExcelIgnore
    @TableField(exist = false)
    private String maxPrintTimesFormat;

    @ExcelIgnore
    @ValidatedEnum(message = "PsiOrderCategory.isExaminePrint", enumClass = YesOrNo.class, required = true, groups = {Save.class, Update.class})
    @ApiModelProperty("是否审核后打印[N否Y是]")
    @TableField("is_examine_print")
    private String isExaminePrint;
    @ExcelIgnore
    @TableField(exist = false)
    private String isExaminePrintName;

    @ExcelIgnore
    @ValidatedEnum(message = "PsiOrderCategory.isSupportPurchase", enumClass = YesOrNo.class, required = true, groups = {Save.class, Update.class})
    @ApiModelProperty("是否支持采购件[N否Y是]")
    @TableField("is_support_purchase")
    private String isSupportPurchase;
    @ExcelIgnore
    @TableField(exist = false)
    private String isSupportPurchaseName;

    @ExcelIgnore
    @ValidatedEnum(message = "PsiOrderCategory.isSupportSelfControl", enumClass = YesOrNo.class, required = true, groups = {Save.class, Update.class})
    @ApiModelProperty("是否支持自制件[N否Y是]")
    @TableField("is_support_self_control")
    private String isSupportSelfControl;
    @ExcelIgnore
    @TableField(exist = false)
    private String isSupportSelfControlName;

    @ExcelIgnore
    @ValidatedEnum(message = "PsiOrderCategory.isSupportOutsourcing", enumClass = YesOrNo.class, required = true, groups = {Save.class, Update.class})
    @ApiModelProperty("是否支持委外件[N否Y是]")
    @TableField("is_support_outsourcing")
    private String isSupportOutsourcing;
    @ExcelIgnore
    @TableField(exist = false)
    private String isSupportOutsourcingName;

    @ExcelIgnore
    @ValidatedEnum(message = "PsiOrderCategory.isSupportCost", enumClass = YesOrNo.class, required = true, groups = {Save.class, Update.class})
    @ApiModelProperty("是否支持费用件[N否Y是]")
    @TableField("is_support_cost")
    private String isSupportCost;
    @ExcelIgnore
    @TableField(exist = false)
    private String isSupportCostName;

    @ExcelIgnore
    @ValidatedEnum(message = "PsiOrderCategory.isSupportVirtually", enumClass = YesOrNo.class, required = true, groups = {Save.class, Update.class})
    @ApiModelProperty("是否支持虚拟件[N否Y是]")
    @TableField("is_support_virtually")
    private String isSupportVirtually;
    @ExcelIgnore
    @TableField(exist = false)
    private String isSupportVirtuallyName;

    @ExcelIgnore
    @ValidatedEnum(message = "PsiOrderCategory.isSupportService", enumClass = YesOrNo.class, required = true, groups = {Save.class, Update.class})
    @ApiModelProperty("是否支持服务件[N否Y是]")
    @TableField("is_support_service")
    private String isSupportService;
    @ExcelIgnore
    @TableField(exist = false)
    private String isSupportServiceName;

    @ExcelIgnore
    @ValidatedEnum(message = "PsiOrderCategory.isSupportAsset", enumClass = YesOrNo.class, required = true, groups = {Save.class, Update.class})
    @ApiModelProperty("是否支持资产件[N否Y是]")
    @TableField("is_support_asset")
    private String isSupportAsset;
    @ExcelIgnore
    @TableField(exist = false)
    private String isSupportAssetName;

    @ExcelIgnore
    @ValidatedEnum(message = "PsiOrderCategory.isSupportSuppliedPart", enumClass = YesOrNo.class, required = true, groups = {Save.class, Update.class})
    @ApiModelProperty("是否支持客供件[N否Y是]")
    @TableField("is_support_supplied_part")
    private String isSupportSuppliedPart;
    @ExcelIgnore
    @TableField(exist = false)
    private String isSupportSuppliedPartName;

    @ExcelIgnore
    @ValidatedEnum(message = "PsiOrderCategory.purchaseOverApplyNumber", enumClass = YesOrNo.class, groups = {Save.class, Update.class})
    @ApiModelProperty("是否允许采购超申请数量[N否Y是]")
    @TableField("purchase_over_apply_number")
    private String purchaseOverApplyNumber;
    @ExcelIgnore
    @TableField(exist = false)
    private String purchaseOverApplyNumberName;

    @ExcelIgnore
    @ValidatedEnum(message = "PsiOrderCategory.enableTrackNo", enumClass = YesOrNo.class, groups = {Save.class, Update.class})
    @ApiModelProperty("是否启用计划跟踪号[N否Y是]")
    @TableField("enable_track_no")
    private String enableTrackNo;

    @ExcelIgnore
    @TableField(exist = false)
    private String enableTrackName;

    /**
     * @see com.lets.platform.model.psi.enums.TrackNoGenerateRuleEnum
     */
    @ExcelIgnore
    @ApiModelProperty("计划跟踪号生成规则 1:订单号 2:订单号+行号 3:项目号 4:合同号 5:订单号+'-'+行号 6:主计划回写")
    @TableField("track_no_rule")
    private String trackNoRule;
    @ExcelIgnore
    @ApiModelProperty("工位机-报工自动入库")
    @TableField("report_auto_stock_in")
    private String reportAutoStockIn;
    @ExcelIgnore
    @ApiModelProperty("工位机-自动完工入库单状态")
    @TableField("auto_wip_stock_in_status")
    private Integer autoWipStockInStatus;
    @ExcelIgnore
    @ApiModelProperty("允许人工录入")
    @TableField("allow_man_input")
    private String allowManInput;
    @ExcelIgnore
    @ApiModelProperty("提交自动创建物料")
    @TableField("auto_add_material")
    private String autoAddMaterial;

    @ExcelIgnore
    @ValidatedEnum(message = "PsiOrderCategory.autoGenerateInspectionOrder", enumClass = YesOrNo.class, groups = {Save.class, Update.class})
    @ApiModelProperty("审核自动生成完工检验单[N否Y是]")
    @TableField("auto_generate_inspection_order")
    private String autoGenerateInspectionOrder;

    @ExcelIgnore
    @ApiModelProperty("默认报废入库[N否Y是]")
    @TableField("default_stock_in_scrap")
    private String defaultStockInScrap;

    @ExcelIgnore
    @ApiModelProperty("默认报废自动处理[Y:是;N:否]")
    @TableField("default_auto_handle_scrap")
    private String defaultAutoHandleScrap;
    @ExcelIgnore
    @ApiModelProperty("默认返工自动处理[Y:是;N:否]")
    @TableField("default_auto_handle_reword")
    private String defaultAutoHandleReword;
    @ExcelIgnore
    @ApiModelProperty("默认不良自动处理[Y:是;N:否]")
    @TableField("default_auto_handle_poor")
    private String defaultAutoHandlePoor;
    @ExcelIgnore
    @ApiModelProperty("默认良品自动处理[Y:是;N:否]")
    @TableField("default_auto_handle_rich")
    private String defaultAutoHandleRich;

    @ExcelIgnore
    @ApiModelProperty("良品入库-限定仓库")
    @TableField("qualified_store_id")
    private String qualifiedStoreId;
    @ExcelIgnore
    @TableField(exist = false)
    private String qualifiedStoreName;

    @ExcelIgnore
    @ApiModelProperty("良品入库-限定库区")
    @TableField("qualified_area_id")
    private String qualifiedAreaId;
    @ExcelIgnore
    @TableField(exist = false)
    private String qualifiedAreaName;

    @ExcelIgnore
    @ApiModelProperty("良品入库-限定库位")
    @TableField("qualified_position_id")
    private String qualifiedPositionId;
    @ExcelIgnore
    @TableField(exist = false)
    private String qualifiedPositionName;

    @ExcelIgnore
    @ApiModelProperty("不良品入库-限定仓库")
    @TableField("defect_store_id")
    private String defectStoreId;
    @ExcelIgnore
    @TableField(exist = false)
    private String defectStoreName;

    @ExcelIgnore
    @ApiModelProperty("不良品入库-限定库区")
    @TableField("defect_area_id")
    private String defectAreaId;
    @ExcelIgnore
    @TableField(exist = false)
    private String defectAreaName;

    @ExcelIgnore
    @ApiModelProperty("不良品入库-限定库位")
    @TableField("defect_position_id")
    private String defectPositionId;
    @ExcelIgnore
    @TableField(exist = false)
    private String defectPositionName;

    @ExcelIgnore
    @ApiModelProperty("报废品入库-限定仓库")
    @TableField("scrap_store_id")
    private String scrapStoreId;
    @ExcelIgnore
    @TableField(exist = false)
    private String scrapStoreName;

    @ExcelIgnore
    @ApiModelProperty("报废品入库-限定库区")
    @TableField("scrap_area_id")
    private String scrapAreaId;
    @ExcelIgnore
    @TableField(exist = false)
    private String scrapAreaName;

    @ExcelIgnore
    @ApiModelProperty("报废品入库-限定库位")
    @TableField("scrap_position_id")
    private String scrapPositionId;
    @ExcelIgnore
    @TableField(exist = false)
    private String scrapPositionName;

    @ExcelIgnore
    @ApiModelProperty("返工品入库-限定仓库")
    @TableField("rework_store_id")
    private String reworkStoreId;
    @ExcelIgnore
    @TableField(exist = false)
    private String reworkStoreName;

    @ExcelIgnore
    @ApiModelProperty("返工品入库-限定库区")
    @TableField("rework_area_id")
    private String reworkAreaId;
    @ExcelIgnore
    @TableField(exist = false)
    private String reworkAreaName;

    @ExcelIgnore
    @ApiModelProperty("返工品入库-限定库位")
    @TableField("rework_position_id")
    private String reworkPositionId;
    @ExcelIgnore
    @TableField(exist = false)
    private String reworkPositionName;

    @ApiModelProperty("检验单默认处理结果")
    @ExcelIgnore
    @TableField(value = "default_handle_result",updateStrategy = FieldStrategy.ALWAYS)
    private String defaultHandleResult;

    @ApiModelProperty("审核自动生成外派检验")
    @ExcelIgnore
    @TableField("auto_osqc")
    private String autoOsqc;

    @ApiModelProperty("自动生成单据目标状态")
    @ExcelIgnore
    @TableField("to_status")
    private Integer toStatus;


    @ExcelIgnore
    @TableField("is_presets")
    private String isPresets;

    @ExcelIgnore
    @TableField("business_code")
    private String businessCode;

    @ExcelIgnore
    @TableField(exist = false)
    private String businessName;

    @ExcelIgnore
    @TableField(exist = false)
    private String isPresetsName;
    @ExcelIgnore
    @ApiModelProperty("审核自动生成IQC检验单[Y:是;N:否]")
    @TableField("generate_iqc_order")
    private String generateIqcOrder;
    @ExcelIgnore
    @ApiModelProperty("审核自动生成PQC检验单[Y:是;N:否]")
    @TableField("generate_pqc_order")
    private String generatePqcOrder;
    @ExcelIgnore
    @ApiModelProperty("审核自动生成SPQC检验单[Y:是;N:否]")
    @TableField("generate_spqc_order")
    private String generateSpqcOrder;
    @ExcelIgnore
    @ApiModelProperty("审核自动生成退货检验单[Y:是;N:否]")
    @TableField("generate_rqc_order")
    private String generateRqcOrder;
    @ExcelIgnore
    @ApiModelProperty("审核自动生成工序委外检验单[Y:是;N:否]")
    @TableField("generate_sipqc_order")
    private String generateSipqcOrder;
    @ExcelIgnore
    @ApiModelProperty("不良、报废、返工默认处理[1:置留;2:调拨;]")
    @TableField("default_defect_action")
    private String defaultDefectAction;
    @ExcelIgnore
    @ApiModelProperty("启用参数化下单")
    @TableField("parametric")
    private String parametric;
    @ExcelIgnore
    @ApiModelProperty("用料清单新增限制BOM物料[Y:是;N:否]")
    @TableField("allow_bom_add_bill")
    private String allowBomAddBill;
    @ExcelIgnore
    @ApiModelProperty("审核自动生成首件检验单[Y:是;N:否]")
    @TableField("generate_faiqc_order")
    private String generateFaiqcOrder;
    @ExcelIgnore
    @ApiModelProperty("退回自动请检[Y:是;N:否]")
    @TableField("return_auto_inspection_apply")
    private String returnAutoInspectionApply;
    @ExcelIgnore
    @ApiModelProperty("启用发货装箱设置[Y:是;N:否]")
    @TableField("delivery_picking")
    private String deliveryPicking;
    @ExcelIgnore
    @ApiModelProperty("审核自动生成库存检验申请单")
    @TableField("auto_generate_inspect_application_order")
    private String autoGenerateInspectApplicationOrder;
    @ExcelIgnore
    @ApiModelProperty("审核自动生成检验单")
    @TableField("generate_inspection_order")
    private String generateInspectionOrder;
    @ExcelIgnore
    @ApiModelProperty("物料分组id")
    @TableField("material_group_id")
    private String materialGroupId;
    @ExcelIgnore
    @ApiModelProperty("审核自动下达[Y:是;N:否](生产工单)")
    @TableField("approve_auto_issued")
    private String approveAutoIssued;
    @ExcelIgnore
    @ApiModelProperty("投放单据状态")
    @TableField("put_in_order_status")
    private Integer putInOrderStatus;
    @ExcelIgnore
    @TableField(exist = false)
    private String materialGroupName;

    @ExcelIgnore
    @ApiModelProperty("是否启用[0停用1启用]")
    @TableField("enable")
    private Integer enable;

    @ExcelIgnore
    @TableField(exist = false)
    private String enableName;

    @ExcelIgnore
    @ApiModelProperty("是否删除[N否Y是]")
    @TableField(value = "deleted", fill = FieldFill.INSERT)
    private String deleted;

    @ApiModelProperty("生产工单定时下达")
    @TableField("produce_order_scheduled_release")
    private String produceOrderScheduledRelease;
    @ApiModelProperty("生产工单提前下达时间（h）")
    @TableField("produce_order_advance_release_hour")
    private Integer produceOrderAdvanceReleaseHour;
    @ApiModelProperty("生产工单下达齐套性检查")
    @TableField("produce_order_release_set_check")
    private String produceOrderReleaseSetCheck;
    @ApiModelProperty("齐套校验方式[1全部齐套|2关键件齐套]")
    @TableField("kitting_check_type")
    private String kittingCheckType;
    @ApiModelProperty("生产工单定时领料")
    @TableField("produce_order_scheduled_picking")
    private String produceOrderScheduledPicking;
    @ApiModelProperty("生产工单提前领料时间（h）")
    @TableField("produce_order_advance_picking_hour")
    private Integer produceOrderAdvancePickingHour;
    @ApiModelProperty("启用生产工单下达自动领料")
    @TableField("produce_order_release_picking")
    private String produceOrderReleasePicking;
    @ApiModelProperty("生产工单下达自动领料单据状态")
    @TableField("produce_order_release_picking_status")
    private Integer produceOrderReleasePickingStatus;
    @ApiModelProperty("定时下达任务主键")
    @TableField("scheduled_release_job_id")
    private Integer scheduledReleaseJobId;
    @ApiModelProperty("定时领料任务主键")
    @TableField("scheduled_picking_job_id")
    private Integer scheduledPickingJobId;

    @ApiModelProperty("允许生产超销售订单数量")
    @TableField("allow_produce_over_sale")
    private String allowProduceOverSale;

    @ApiModelProperty("允许采购超销售订单数量")
    @TableField("allow_purchase_over_sale")
    private String allowPurchaseOverSale;

    @ApiModelProperty("是否启用确认数量发货")
    @TableField("allow_confirm_quantity_delivery")
    private String allowConfirmQuantityDelivery;

    @ApiModelProperty("备件明细新增限制设备台账中的备件明细")
    @TableField("only_device_spare_parts")
    private String onlyDeviceSpareParts;

    @ApiModelProperty("报价单默认有效期")
    @TableField("quotation_order_validity_period")
    private Integer quotationOrderValidityPeriod;

    @ApiModelProperty("报价单默认有效期单位 0:年 1:月 2:日")
    @TableField("quotation_order_validity_period_unit")
    private String quotationOrderValidityPeriodUnit;

    @ApiModelProperty("报价单下发时可下发数量是否管控")
    @TableField("quotation_order_distribute_num_control")
    private String quotationOrderDistributeNumControl;

    @ApiModelProperty("生产工单下达自动生成试压工单")
    @TableField("generate_detect_order")
    private String generateDetectOrder;

    @ApiModelProperty("计划订单投放方式[0:全部合并;1:按相同计划跟踪号合并;2:不合并]")
    @TableField("put_in_mode")
    private Integer putInMode;

    @ApiModelProperty("启用订单逾期标记[YN](生产 采购 销售)")
    @TableField("enable_overdue_mark")
    private String enableOverdueMark;

    @ApiModelProperty("启用即将订单逾期标记[YN](生产 采购 销售)")
    @TableField("enable_almost_overdue_mark")
    private String enableAlmostOverdueMark;

    @ApiModelProperty("提前天数")
    @TableField("advance_day")
    private Integer advanceDay;

    @ExcelIgnore
    @ApiModelProperty("采购入库单过账自动生成应付单[N否Y是]")
    @TableField("auto_generate_ap_doc")
    private String autoGenerateApDoc;

    @ExcelIgnore
    @ApiModelProperty("采购入库单过账后自动生成的应付单单据状态")
    @TableField("generated_ap_doc_status")
    private Integer generatedApDocStatus;

    @ExcelIgnore
    @ApiModelProperty("采购发票登记审核自动生成应付单[N否Y是]")
    @TableField("auto_generate_finance_ap_doc")
    private String autoGenerateFinanceApDoc;

    @ExcelIgnore
    @ApiModelProperty("采购发票登记审核后自动生成的应付单单据状态")
    @TableField("generated_finance_ap_doc_status")
    private Integer generatedFinanceApDocStatus;

    @ExcelIgnore
    @ApiModelProperty("出库过账自动生成应收单[N否Y是]")
    @TableField("auto_generate_ar_doc")
    private String autoGenerateArDoc;

    @ExcelIgnore
    @ApiModelProperty("出库过账自动生成的应付单单据状态")
    @TableField("generated_ar_doc_status")
    private Integer generatedArDocStatus;

    @ExcelIgnore
    @ApiModelProperty("限定需求单据类别")
    @TableField("limit_source_order_category_id")
    private String limitSourceOrderCategoryId;

    @ExcelIgnore
    @TableField(exist = false)
    private List<PsiOrderCategoryDetailField> fieldList;

    @ExcelIgnore
    @TableField(exist = false)
    private Map<String, PsiOrderCategoryDetailField> fieldMap;

    @ExcelIgnore
    @TableField(exist = false)
    private List<PsiOrderCategoryLimit> limitList;

    @ExcelIgnore
    @TableField(exist = false)
    private List<String> limitMaterialGroup;

    @ExcelIgnore
    @TableField(exist = false)
    private List<String> limitProductionUnit;

    @ExcelIgnore
    @ApiModelProperty("审核自动计划确认[Y:是;N:否]")
    @TableField("auto_confirm")
    private String autoConfirm;

    @ExcelIgnore
    @ApiModelProperty("确认自动投放[Y:是;N:否]")
    @TableField("auto_put_in")
    private String autoPutIn;

    @ExcelIgnore
    @ApiModelProperty("领料申请审核自动生成过账的领料单[Y:是;N:否]")
    @TableField("picking_apply_auto_picking")
    private String pickingApplyAutoPicking;

    @ExcelIgnore
    @ApiModelProperty("启用检验任务[Y:是;N:否]")
    @TableField("use_inspect_task")
    private String useInspectTask;

    @ExcelIgnore
    @ApiModelProperty("自动生成检验任务[Y:是;N:否]")
    @TableField("auto_inspect_task")
    private String autoInspectTask;
}

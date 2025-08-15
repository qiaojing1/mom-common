package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.common.pojo.annotation.ValidBigDecimal;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.mes.dto.PsiProducePlanCopyBom;
import com.lets.platform.model.psi.mrpModel.BomModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 * 计划订单
 *
 * @author DING WEI
 * @since 2023-12-18
 */
@Getter
@Setter
@TableName("psi_produce_plan")
@ApiModel(value = "PsiProducePlan对象", description = "计划订单")
public class PsiProducePlan extends BaseEntity implements PlanOrder {

    @ApiModelProperty("单据编号")
    @TableField("code")
    private String code;

    @NotBlank(message = "ProducePlan.orderCategoryId", groups = {Save.class, Update.class})
    @ApiModelProperty("单据类别主键")
    @TableField("order_category_id")
    private String orderCategoryId;
    @ApiModelProperty("单据类别编码")
    @TableField("order_category_code")
    private String orderCategoryCode;
    @ApiModelProperty("单据类别名称")
    @TableField("order_category_name")
    private String orderCategoryName;

    @TableField(exist = false)
    private String businessCode;

    @NotNull(message = "ProducePlan.orderTime", groups = {Save.class, Update.class})
    @ApiModelProperty("单据日期")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @TableField("order_time")
    private LocalDateTime orderTime;

    @ApiModelProperty("申请部门主键")
    @TableField("apply_org_id")
    private String applyOrgId;
    @ApiModelProperty("申请部门名称")
    @TableField("apply_org_name")
    private String applyOrgName;
    @ApiModelProperty("申请人主键")
    @TableField("apply_user_id")
    private String applyUserId;
    @ApiModelProperty("申请人名称")
    @TableField("apply_user_name")
    private String applyUserName;

    @ApiModelProperty("生产单元主键")
    @TableField("factory_mode_id")
    private String factoryModeId;
    @ApiModelProperty("生产单元名称")
    @TableField("factory_mode_name")
    private String factoryModeName;

    @ApiModelProperty("BOM版本")
    @TableField("bom_id")
    private String bomId;
    @ApiModelProperty("BOM版本名称")
    @TableField("bom_version")
    private String bomVersion;
    @ApiModelProperty("BOM版本描述")
    @TableField(exist = false)
    private String bomVersionDescribe;
    @TableField(exist = false)
    private PsiProducePlanCopyBom bomCopy;

    @NotBlank(message = "ProducePlan.materialId", groups = {Save.class, Update.class})
    @ApiModelProperty("物料主键")
    @TableField("material_id")
    private String materialId;
    @NotBlank(message = "ProducePlan.materialCode", groups = {Save.class, Update.class})
    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;
    @NotBlank(message = "ProducePlan.materialName", groups = {Save.class, Update.class})
    @ApiModelProperty("物料名称")
    @TableField("material_name")
    private String materialName;
    @ApiModelProperty("物料规格型号")
    @TableField("material_specs")
    private String materialSpecs;
    @ApiModelProperty("物料类型")
    @TableField("material_type")
    private String materialType;
    @TableField(exist = false)
    private String materialTypeName;
    @ApiModelProperty("物料特征属性")
    @TableField("material_specific")
    private String materialSpecific;
    @ApiModelProperty("物料特征属性名称")
    @TableField("material_specific_name")
    private String materialSpecificName;
    @ApiModelProperty("物料分组主键")
    @TableField("material_group_id")
    private String materialGroupId;

    @ApiModelProperty("采购前置期(天)")
    @TableField("purchase_lead_day")
    private Long purchaseLeadDay;
    @ApiModelProperty("启用采购动态前置期")
    @TableField("purchase_dynamic_lead")
    private Integer purchaseDynamicLead;
    @ApiModelProperty("采购变动前置期(天)")
    @TableField("purchase_change_lead_day")
    private Long purchaseChangeLeadDay;
    @ApiModelProperty("采购变动批量")
    @TableField("purchase_variable_lot_quantity")
    private BigDecimal purchaseVariableLotQuantity;
    @ApiModelProperty("生产前置期(天)")
    @TableField("production_lead_day")
    private Long productionLeadDay;
    @ApiModelProperty("启用生产动态前置期")
    @TableField("production_dynamic_lead")
    private Integer productionDynamicLead;
    @ApiModelProperty("生产变动前置期(天)")
    @TableField("production_change_lead_day")
    private Long productionChangeLeadDay;
    @ApiModelProperty("生产变动批量")
    @TableField("production_variable_lot_quantity")
    private BigDecimal productionVariableLotQuantity;
    @ApiModelProperty("检验前置期(天)")
    @TableField("inspection_lead_day")
    private Long inspectionLeadDay;
    @ApiModelProperty("启用检验动态前置期")
    @TableField("inspection_dynamic_lead")
    private Integer inspectionDynamicLead;
    @ApiModelProperty("检验变动前置期(天)")
    @TableField("inspection_change_lead_day")
    private Long inspectionChangeLeadDay;
    @ApiModelProperty("检验变动批量")
    @TableField("inspection_variable_lot_quantity")
    private BigDecimal inspectionVariableLotQuantity;

    /**
     * @see com.lets.platform.model.psi.enums.OrderSourceEnum
     */
    @ApiModelProperty("单据来源[1手动创建2运算创建]")
    @TableField("order_source")
    private String orderSource;
    @TableField(exist = false)
    private String orderSourceName;

    @ApiModelProperty("运算主键")
    @TableField("mrp_calculate_id")
    private String mrpCalculateId;
    @ApiModelProperty("运算编号")
    @TableField("mrp_calculate_code")
    private String mrpCalculateCode;

    @ApiModelProperty("源单单据主键")
    @TableField("source_order_id")
    private String sourceOrderId;

    @ApiModelProperty("源单单据编码")
    @TableField("source_order_code")
    private String sourceOrderCode;

    @ApiModelProperty("源单单据类型")
    @TableField("source_order_type")
    private String sourceOrderType;

    @ApiModelProperty("源单单据明细主键")
    @TableField("source_detail_id")
    private String sourceDetailId;

    @ApiModelProperty("源单单据行号")
    @TableField("source_line_number")
    private Integer sourceLineNumber;

    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;

    @ApiModelProperty("源销售订单订货客户id")
    @TableField("source_order_customer_id")
    private String sourceOrderCustomerId;
    @ApiModelProperty("源销售订单订货客户名称")
    @TableField("source_order_customer_name")
    private String sourceOrderCustomerName;

    /**
     * @see com.lets.platform.model.psi.enums.PlanOrderStatusEnum
     */
    @ApiModelProperty("计划状态")
    @TableField("plan_status")
    private String planStatus;
    @TableField(exist = false)
    private String planStatusName;
    @ApiModelProperty("单据状态")
    @TableField("status")
    private Integer status;
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ValidBigDecimal(message = "ProducePlan.number", required = true, max = "10000000000", includeMax = false, groups = {Save.class, Update.class})
    @ApiModelProperty("数量")
    @TableField("number")
    private BigDecimal number;

    @ApiModelProperty("已投放数量")
    @TableField("put_in_number")
    private BigDecimal putInNumber;

    @TableField(exist = false)
    private BigDecimal quantity;

    @NotBlank(message = "ProducePlan.unitId", groups = {Save.class, Update.class})
    @ApiModelProperty("单位")
    @TableField("unit_id")
    private String unitId;
    @ApiModelProperty("单位编码")
    @TableField("unit_code")
    private String unitCode;
    @ApiModelProperty("单位名称")
    @TableField("unit_name")
    private String unitName;
    @ApiModelProperty("单位精度")
    @TableField("unit_accuracy")
    private Integer unitAccuracy;
    @ApiModelProperty("单位舍入方式")
    @TableField("unit_round_off_type")
    private Integer unitRoundOffType;
    @ApiModelProperty("另一个单据类别单位")
    @TableField("other_unit_id")
    private String otherUnitId;
    @ApiModelProperty("另一个单据类别单位编码")
    @TableField("other_unit_code")
    private String otherUnitCode;
    @ApiModelProperty("另一个单据类别单位名称")
    @TableField("other_unit_name")
    private String otherUnitName;
    @ApiModelProperty("另一个单据类别单位精度")
    @TableField("other_unit_accuracy")
    private Integer otherUnitAccuracy;
    @ApiModelProperty("另一个单据类别单位舍入方式")
    @TableField("other_unit_round_off_type")
    private Integer otherUnitRoundOffType;

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
    @ApiModelProperty("基本数量")
    @TableField(exist = false)
    private BigDecimal basicNumber;

    @ApiModelProperty("单位和基本单位转换")
    @TableField(exist = false)
    private String unitAndBasicConvert;
    @TableField(exist = false)
    private String basicAndUnitConvert;
    @ApiModelProperty("BOM生产单位和基本单位转换")
    @TableField(exist = false)
    private String bomAndOrderConvert;
    @TableField(exist = false)
    private String orderAndBomConvert;

    @NotNull(message = "ProducePlan.yieldRate", groups = {Save.class, Update.class})
    @ApiModelProperty("成品率")
    @TableField("yield_rate")
    private BigDecimal yieldRate;
    @ApiModelProperty("成品数量")
    @TableField("yield_number")
    private BigDecimal yieldNumber;

    @NotNull(message = "ProducePlan.planStartTime", groups = {Save.class, Update.class})
    @ApiModelProperty("计划开始时间")
    @TableField("plan_start_time")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime planStartTime;
    @NotNull(message = "ProducePlan.planEndTime", groups = {Save.class, Update.class})
    @ApiModelProperty("计划完成时间")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @TableField("plan_end_time")
    private LocalDateTime planEndTime;
    @ApiModelProperty("投放时间")
    @TableField("put_in_time")
    private LocalDateTime putInTime;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    private LocalDateTime auditTime;
    @ApiModelProperty("审核人")
    @TableField("audit_user")
    private String auditUser;
    @ApiModelProperty("审核人名称")
    @TableField("audit_user_name")
    private String auditUserName;

    @ApiModelProperty("关闭状态")
    @TableField("enable")
    private Integer enable;
    @TableField(exist = false)
    private String enableName;

    @TableField(exist = false)
    private List<PsiProducePlanSpecific> detailSpecifics;

    @ApiModelProperty("投放下去的单据单位主键")
    @TableField(exist = false)
    private String putInOrderUnitId;
    @ApiModelProperty("投放下去的单据单位编码")
    @TableField(exist = false)
    private String putInOrderUnitCode;
    @ApiModelProperty("单位转换KEY")
    @TableField(exist = false)
    private String unitConvertKey;

    //物料可存货属性
    @TableField(exist = false)
    private Integer storable;

    @TableField(exist = false)
    private BomModel bomModel;

    @ApiModelProperty("MRP任务ID")
    @TableField("mrp_task_id")
    private String mrpTaskId;

    @ApiModelProperty("MRP来源ID")
    @TableField("mrp_source_id")
    private String mrpSourceId;

    @ApiModelProperty("MRP来源明细ID")
    @TableField("mrp_source_detail_id")
    private String mrpSourceDetailId;

    @ApiModelProperty("MRP数量(基本单位)")
    @TableField("mrp_quantity")
    private BigDecimal mrpQuantity;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("计划进度")
    @TableField(exist = false)
    private BigDecimal planProcessRate;

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
    @ApiModelProperty("项目编号")
    @TableField(exist = false)
    private String projectCode;
    @TableField(exist = false)
    private String contractCode;

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


    @TableField(exist = false)
    private List<PsiMrpSupplyAndDemandDetail> mrpSupplyAndDemandDetailList;
    @TableField(exist = false)
    private String isMateialDemand;
    @TableField(exist = false)
    private boolean inner;

    @TableField(exist = false)
    private List<BomModel> flatBomList;
    @TableField(exist = false)
    private List<PsiProducePlanMaterialBill> materialBillOrderDetailList;

    @ApiModelProperty("齐套数量")
    @TableField("kitting_number")
    private BigDecimal kittingNumber;
    @TableField(exist = false)
    private String kittingNumberFormat;
    /**
     * @see com.lets.platform.model.psi.enums.PlanOrderKittingStatusEnum
     */
    @ApiModelProperty("齐套状态[0:未计算，1:齐套，2:部分齐套，3:不齐套]")
    @TableField("kitting_status")
    private String kittingStatus;
    @TableField(exist = false)
    private String kittingStatusName;


    @TableField(exist = false)
    private PsiOrderCategory sourceOrderCategory;

    @TableField(exist = false)
    private PsiOrderCategory targetOrderCategory;

    @TableField("source_root_id")
    @ExcelIgnore
    private String sourceRootId;

    @TableField("source_root_code")
    @ExcelIgnore
    private String sourceRootCode;

    @TableField("source_root_type")
    @ExcelIgnore
    private String sourceRootType;

    @TableField("source_root_detail_id")
    @ExcelIgnore
    private String sourceRootDetailId;

    @TableField("source_root_line_number")
    @ExcelIgnore
    private Long sourceRootLineNumber;

    @TableField("bom_detail_id")
    @ExcelIgnore
    private String bomDetailId;

    @TableField(exist = false)
    private String isOverdue;

    @TableField(exist = false)
    private boolean isInventory;

    @ApiModelProperty("可用库存量")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal availableInventoryQuantity;

    @ApiModelProperty("在制数量 在制数量=工单数量-合格品入库数量-报废数量-不良品入库数量-返工品入库数量")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal quantityProcess;
    @ApiModelProperty("图号")
    @TableField(exist = false)
    private String drawingNumber;
    public BigDecimal putInNumberNotNull() {
        if (Objects.isNull(putInNumber)) {
            return BigDecimal.ZERO;
        } else {
            return putInNumber;
        }
    }
}

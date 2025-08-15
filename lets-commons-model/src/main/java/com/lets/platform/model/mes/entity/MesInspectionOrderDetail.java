package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonFile;
import com.lets.platform.model.psi.entity.PsiMaterialBarcode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 检验单物料明细
 * </p>
 *
 * @author FZY
 * @since 2024-01-19
 */
@Getter
@Setter
@TableName("mes_inspection_order_detail")
@ApiModel(value = "MesInspectionOrderDetail对象", description = "检验单物料明细")
public class MesInspectionOrderDetail extends BaseEntity {

    @ApiModelProperty("检验单ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("业务类型")
    @TableField(exist = false)
    private String businessCode;

    @ApiModelProperty("单据类别Id")
    @TableField(exist = false)
    private String orderCategoryId;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Long lineNumber;

    @ApiModelProperty("物料ID")
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

    @ApiModelProperty("特征属性")
    @TableField("material_specific")
    private String materialSpecific;

    @ApiModelProperty("特征属性名称")
    @TableField("material_characteristic_names")
    private String materialCharacteristicNames;

    @ApiModelProperty("批号控制方式[0不管控,1不可有批号,2必须有批号]")
    @TableField("lot_no_control_type")
    private String lotNoControlType;

    @ApiModelProperty("批号应用范围[0全部,1库存管理,2生产管理]")
    @TableField("lot_no_scope")
    private String lotNoScope;

    @ApiModelProperty("单位ID")
    @TableField("unit_id")
    private String unitId;

    @ApiModelProperty("单位编码")
    @TableField("unit_code")
    private String unitCode;

    @ApiModelProperty("单位精度")
    @TableField("unit_accuracy")
    private Integer unitAccuracy;

    @ApiModelProperty("单位舍入类型")
    @TableField("unit_round_off_type")
    private Integer unitRoundOffType;

    @ApiModelProperty("单位名称")
    @TableField("unit_name")
    private String unitName;

    @ApiModelProperty("仓库ID")
    @TableField("store_id")
    private String storeId;

    @ApiModelProperty("仓库名称")
    @TableField("store_name")
    private String storeName;

    @ApiModelProperty("库区ID")
    @TableField("area_id")
    private String areaId;

    @ApiModelProperty("库区名称")
    @TableField("area_name")
    private String areaName;

    @ApiModelProperty("库位ID")
    @TableField("position_id")
    private String positionId;

    @ApiModelProperty("库位名称")
    @TableField("position_name")
    private String positionName;

    @ApiModelProperty("批号")
    @TableField("batch_number")
    private String batchNumber;

    @ApiModelProperty("批次数量")
    @TableField("inspection_quantity")
    private BigDecimal inspectionQuantity;

    @ApiModelProperty("样本数量")
    @TableField("sample_quantity")
    private Integer sampleQuantity;

    @ApiModelProperty("Ac")
    @TableField("ac")
    private Integer ac;

    @ApiModelProperty("Re")
    @TableField("re")
    private Integer re;

    @ApiModelProperty("合格数量")
    @TableField("qualified_quantity")
    private BigDecimal qualifiedQuantity;

    @ApiModelProperty("不合格数量")
    @TableField("unqualified_quantity")
    private BigDecimal unqualifiedQuantity;

    @ApiModelProperty("样本破坏数量")
    @TableField("samples_destroyed_quantity")
    private BigDecimal samplesDestroyedQuantity;

    @ApiModelProperty("检验结果")
    @TableField("result")
    private String result;

    @ApiModelProperty("检验结果")
    @TableField(exist = false)
    private String resultName;

    @ApiModelProperty("抽样方案ID")
    @TableField("sampling_plan_id")
    private String samplingPlanId;

    @ApiModelProperty("抽样方案名称")
    @TableField("sampling_plan_name")
    private String samplingPlanName;

    @ApiModelProperty("客户ID")
    @TableField("customer_id")
    private String customerId;

    @ApiModelProperty("客户名称")
    @TableField("customer_name")
    private String customerName;

    @ApiModelProperty("供应商ID")
    @TableField("supply_supplier_id")
    private String supplySupplierId;

    @ApiModelProperty("供应商名称")
    @TableField("supply_supplier_name")
    private String supplySupplierName;

    @ApiModelProperty("生产单元ID")
    @TableField("factory_mode_id")
    private String factoryModeId;

    @ApiModelProperty("生产单元名称")
    @TableField("factory_mode_name")
    private String factoryModeName;

    @ApiModelProperty("工序ID")
    @TableField("process_id")
    private String processId;

    @ApiModelProperty("工序编码")
    @TableField("process_code")
    private String processCode;

    @ApiModelProperty("工序名称")
    @TableField("process_name")
    private String processName;

    @ApiModelProperty("工序（提供给pda上使用）")
    @TableField(exist = false)
    private String process;

    /**
     * @see com.lets.platform.model.psi.enums.SourceOrderTypeEnum
     */
    @ApiModelProperty("源单类型")
    @TableField("source_order_type")
    private String sourceOrderType;
    @ApiModelProperty("源单类型")
    @TableField(exist = false)
    private String sourceOrderTypeName;

    @ApiModelProperty("源单ID")
    @TableField("source_id")
    private String sourceId;

    @ApiModelProperty("源单单号")
    @TableField("source_code")
    private String sourceCode;

    @ApiModelProperty("源单明细ID")
    @TableField("source_detail_id")
    private String sourceDetailId;

    @ApiModelProperty("源单行号")
    @TableField("source_line_number")
    private Long sourceLineNumber;

    @ApiModelProperty("源单据类别ID")
    @TableField("source_order_category_id")
    private String sourceOrderCategoryId;

    @ApiModelProperty("源单据类别名称")
    @TableField("source_order_category_name")
    private String sourceOrderCategoryName;

    @ApiModelProperty("备注")
    @TableField("detail_remark")
    private String detailRemark;

    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;

    @ApiModelProperty("项目编号")
    @TableField("project_code")
    private String projectCode;

    @TableField(exist = false)
    private String contractCode;

    @ApiModelProperty("检验状态")
    @TableField("inspection_status")
    private Integer inspectionStatus;

    @ApiModelProperty("执行状态")
    @TableField("execution_status")
    private Integer executionStatus;

    @ApiModelProperty("执行状态")
    @TableField(exist = false)
    private String executionStatusName;

    @ApiModelProperty("检验状态")
    @TableField(exist = false)
    private Integer inspectionStatusName;

    @ApiModelProperty("源销售订单订货客户id")
    @TableField("source_order_customer_id")
    private String sourceOrderCustomerId;

    @ApiModelProperty("源销售订单订货客户名称")
    @TableField("source_order_customer_name")
    private String sourceOrderCustomerName;

    @ApiModelProperty("是否智能车间[N:否;Y:是]")
    @TableField("intelligence_workshop")
    private String intelligenceWorkshop;

    @ApiModelProperty("抽样方式")
    @TableField("sample_type")
    private String sampleType;

    @ApiModelProperty("检验项目")
    @TableField("inspect_item_ids")
    private String inspectItemIds;

    @ApiModelProperty("不良品处理明细")
    @TableField(exist = false)
    private List<MesInspectionOrderDetailUnqualifiedHandle> unqualifiedHandleList;

    @ApiModelProperty("缺陷记录")
    @TableField(exist = false)
    private List<MesInspectionOrderDetailRecord> recordList;

    @ApiModelProperty("仓库库区库位拼接起来的名称")
    @TableField(exist = false)
    private String storeLinkedName;

    @ApiModelProperty("文件列表")
    @TableField(exist = false)
    private List<CommonFile> fileList;
    @TableField(exist = false)
    private String isMateialDemand;
    @TableField(exist = false)
    private String sourceOrderMaterialCode;

    @ApiModelProperty("缺陷记录")
    @TableField(exist = false)
    private List<PsiMaterialBarcode> barcodeList;

    @TableField(exist = false)
    private LocalDateTime auditTime;

    @TableField(exist = false)
    private String orderStatus;

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

    @TableField(exist = false)
    private List<MesInspectionTaskOrder> taskList;

    @ApiModelProperty(value = "未入库报废数量", hidden = true)
    @TableField(exist = false)
    private BigDecimal notStockInScrapNumber;
}

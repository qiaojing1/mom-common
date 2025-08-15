package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.common.pojo.base.SimpleDict;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

/**
 * 物料条码明细
 *
 * @author FZY
 * @since 2024-03-12
 */
@Getter
@Setter
@TableName("psi_material_barcode")
@ApiModel(value = "PsiMaterialBarcode对象", description = "物料条码明细")
public class PsiMaterialBarcode extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("包装箱条码")
    @TableField(exist = false)
    private String containerBoxBarcode;

    @ApiModelProperty("物料条码明细ID")
    @TableField("detail_id")
    private String detailId;

    @ApiModelProperty("物料条码管理ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("物料条码")
    @TableField("barcode")
    private String barcode;

    @ApiModelProperty("物料分组ID")
    @TableField(exist = false)
    private String materialGroupId;

    @ApiModelProperty("物料ID")
    @TableField("material_id")
    private String materialId;

    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;

    @ApiModelProperty("物料名称")
    @TableField("material_name")
    private String materialName;

    @ApiModelProperty("物料类型")
    @TableField("material_type")
    private String materialType;

    @ApiModelProperty("物料规格型号")
    @TableField("material_specs")
    private String materialSpecs;

    @ApiModelProperty("特征属性")
    @TableField("material_specific")
    private String materialSpecific;

    @ApiModelProperty("特征属性名称")
    @TableField("material_characteristic_names")
    private String materialCharacteristicNames;

    @TableField(exist = false)
    private List<PsiStoreMaterialSpecific> specificList;

    @ApiModelProperty("标签数量(库存单位)")
    @TableField("quantity")
    private BigDecimal quantity;

    @ApiModelProperty("标签数量(基本单位)")
    @TableField("basic_quantity")
    private BigDecimal basicQuantity;

    @ApiModelProperty("标签拆分数量")
    @TableField(exist = false)
    private BigDecimal splitQuantity;

    @ApiModelProperty("库存单位ID")
    @TableField("basic_unit_id")
    private String basicUnitId;

    @ApiModelProperty("库存单位编码")
    @TableField("basic_unit_code")
    private String basicUnitCode;

    @ApiModelProperty("库存单位名称")
    @TableField("basic_unit_name")
    private String basicUnitName;

    @ApiModelProperty("库存单位精度")
    @TableField("basic_unit_accuracy")
    private Integer basicUnitAccuracy;

    @ApiModelProperty("库存单位舍入类型")
    @TableField("basic_unit_round_off_type")
    private String basicUnitRoundOffType;

    @ApiModelProperty("库存单位ID")
    @TableField("inventory_unit_id")
    private String inventoryUnitId;

    @ApiModelProperty("库存单位编码")
    @TableField("inventory_unit_code")
    private String inventoryUnitCode;

    @ApiModelProperty("库存单位名称")
    @TableField("inventory_unit_name")
    private String inventoryUnitName;

    @ApiModelProperty("库存单位精度")
    @TableField("inventory_unit_accuracy")
    private Integer inventoryUnitAccuracy;

    @ApiModelProperty("库存单位舍入类型")
    @TableField("inventory_unit_round_off_type")
    private String inventoryUnitRoundOffType;

    @ApiModelProperty("批号")
    @TableField("batch_number")
    private String batchNumber;

    @ApiModelProperty("生产日期")
    @TableField("production_date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime productionDate;

    @ApiModelProperty("供应商ID")
    @TableField("supplier_id")
    private String supplierId;

    @ApiModelProperty("供应商名称")
    @TableField("supplier_name")
    private String supplierName;

    @ApiModelProperty("客户ID")
    @TableField("customer_id")
    private String customerId;

    @ApiModelProperty("客户名称")
    @TableField("customer_name")
    private String customerName;

    @ApiModelProperty("源单ID")
    @TableField("source_id")
    private String sourceId;

    @ApiModelProperty("源单单号")
    @TableField("source_code")
    private String sourceCode;

    @ApiModelProperty("源单物料明细ID")
    @TableField("source_detail_id")
    private String sourceDetailId;

    @ApiModelProperty("源单类型ID")
    @TableField("source_category_id")
    private String sourceCategoryId;

    @ApiModelProperty("源单类型名称")
    @TableField("source_category_name")
    private String sourceCategoryName;

    @ApiModelProperty("源单行号")
    @TableField("source_line_number")
    private Long sourceLineNumber;

    @ApiModelProperty("源单日期")
    @TableField("source_date")
    private LocalDateTime sourceDate;

    @ApiModelProperty("打印模板ID")
    @TableField("export_template_id")
    private String exportTemplateId;

    @ApiModelProperty("打印模板名称")
    @TableField("export_template_name")
    private String exportTemplateName;

    /**
     * @see com.lets.platform.model.psi.enums.BarcodeStatusEnum
     */
    @ApiModelProperty("标签状态[1:正常;2:作废;3:置疑]")
    @TableField("status")
    private Integer status;

    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("检验状态[1:合格;2:不合格]")
    @TableField("inspect_status")
    private Integer inspectStatus;

    @TableField(exist = false)
    private String inspectStatusName;

    @ApiModelProperty("不良状态[1:报废;2:让步接收;4:返修]")
    @TableField("defect_status")
    private String defectStatus;

    @TableField(exist = false)
    private String defectStatusName;

    /**
     * @see com.lets.platform.model.psi.enums.BarcodeStockInStatusEnum
     */
    @ApiModelProperty("入库状态[0:未入库;1:已入库]")
    @TableField("stock_in_status")
    private Integer stockInStatus;

    @TableField(exist = false)
    private String stockInStatusName;

    /**
     * @see com.lets.platform.model.psi.enums.BarcodeStockOutStatusEnum
     */
    @ApiModelProperty("出库状态[0:未出库;1:已出库]")
    @TableField("stock_out_status")
    private Integer stockOutStatus;

    @TableField(exist = false)
    private String stockOutStatusName;

    @ApiModelProperty("装箱状态[0:未装箱;1:已装箱]")
    @TableField("package_status")
    private String packageStatus;

    @TableField(exist = false)
    private String packageStatusName;

    @ApiModelProperty("装箱状态[0:未装箱;1:已装箱]")
    @TableField("ship_status")
    private String shipStatus;

    @TableField(exist = false)
    private String shipStatusName;

    @ApiModelProperty("入库时间")
    @TableField("stock_in_time")
    private LocalDateTime stockInTime;

    @ApiModelProperty("出库时间")
    @TableField("stock_out_time")
    private LocalDateTime stockOutTime;

    @ApiModelProperty("打印次数")
    @TableField("print_number")
    private Integer printNumber;

    @ApiModelProperty("母标签条码ID")
    @TableField("parent_barcode_id")
    private String parentBarcodeId;

    @ApiModelProperty("母标签条码")
    @TableField("parent_barcode")
    private String parentBarcode;

    @ApiModelProperty("仓库ID")
    @TableField("store_id")
    private String storeId;

    @TableField("store_code")
    private String storeCode;

    @TableField("store_name")
    private String storeName;

    @ApiModelProperty("仓库ID")
    @TableField("area_id")
    private String areaId;

    @TableField("area_code")
    private String areaCode;

    @TableField("area_name")
    private String areaName;

    @ApiModelProperty("仓库ID")
    @TableField("position_id")
    private String positionId;

    @TableField("position_code")
    private String positionCode;

    @TableField("position_name")
    private String positionName;

    @ApiModelProperty("容器ID")
    @TableField("container_id")
    private String containerId;

    @TableField(exist = false)
    private String containerCode;

    @TableField(exist = false)
    private String containerName;

    @TableField(exist = false)
    private Integer containerType;

    @TableField(exist = false)
    private String containerTypeName;

    @ApiModelProperty("容器标签码ID")
    @TableField("container_code_id")
    private String containerCodeId;

    @ApiModelProperty("容器标签码")
    @TableField("container_barcode")
    private String containerBarcode;

    @TableField("relate_order_id")
    private String relateOrderId;

    @TableField("relate_order_code")
    private String relateOrderCode;

    @TableField("relate_order_detail_id")
    private String relateOrderDetailId;

    @TableField("relate_order_line_number")
    private Long relateOrderLineNumber;

    @ApiModelProperty("报工状态[Y已报工N未报工]")
    @TableField("report_status")
    private String reportStatus;

    @ApiModelProperty("装箱状态[Y已装箱N未装箱]")
    @TableField("packing_status")
    private String packingStatus;
    @TableField(exist = false)
    private String packingStatusName;

    @TableField(exist = false)
    private LocalDateTime scanTime;

    @ApiModelProperty("源单数量")
    @TableField(exist = false)
    private BigDecimal sourceQuantity;

    @ApiModelProperty("申请数量")
    @TableField(exist = false)
    private BigDecimal targetQuantity;

    @ApiModelProperty("单据ID")
    @TableField(exist = false)
    private String orderId;

    @ApiModelProperty("单据编码")
    @TableField(exist = false)
    private String orderCode;

    @TableField(exist = false)
    private String targetStoreId;

    @TableField(exist = false)
    private String targetStoreCode;

    @TableField(exist = false)
    private String targetStoreName;

    @TableField(exist = false)
    private String targetAreaId;

    @TableField(exist = false)
    private String targetAreaCode;

    @TableField(exist = false)
    private String targetAreaName;

    @TableField(exist = false)
    private String targetPositionId;

    @TableField(exist = false)
    private String targetPositionCode;

    @TableField(exist = false)
    private String targetPositionName;

    @ApiModelProperty("总最新日期")
    @TableField(exist = false)
    private LocalDateTime lastDate;

    @ApiModelProperty("总最旧日期")
    @TableField(exist = false)
    private LocalDateTime oldestDate;

    @ApiModelProperty("库位内最新日期")
    @TableField(exist = false)
    private LocalDateTime positionLastDate;

    @ApiModelProperty("库位内最旧日期")
    @TableField(exist = false)
    private LocalDateTime positionOldestDate;

    @ApiModelProperty("标签码列表")
    @TableField(exist = false)
    private List<String> barcodeCodeList;

    @TableField(exist = false)
    private String targetDetailId;

    @TableField(exist = false)
    private Long targetLineNumber;

    @ApiModelProperty("额外的信息")
    @TableField(exist = false)
    private Map<String, Object> extraInfo;

    @ApiModelProperty("订货客户")
    @TableField(exist = false)
    private String orderCustomerId;
    @TableField(exist = false)
    private String orderCustomerName;
    @ApiModelProperty("单据类别")
    @TableField(exist = false)
    private String orderCategoryCode;
    @TableField(exist = false)
    private String orderCategoryId;
    @TableField(exist = false)
    private String orderCategoryName;

    @TableField(exist = false)
    private String serialNumber;

    @TableField(exist = false)
    private String trackNo;
    @TableField(exist = false)
    private List<PsiMaterialBarcodeSerial> serialList;

    @ApiModelProperty("规则ID")
    @TableField(exist = false)
    private String ruleId;

    @TableField(exist = false)
    private String ruleName;

    @TableField(exist = false)
    private String barCodeType;

    @TableField(exist = false)
    private Map<String, Object> map;

    /**
     * @see com.lets.platform.model.psi.enums.BarcodeGenerateSourceEnum
     */
    @ApiModelProperty("生成来源")
    @TableField("generate_source")
    private String generateSource;
    @ApiModelProperty("生产单元")
    @TableField("factory_mode_id")
    private String factoryModeId;
    @TableField("factory_mode_code")
    private String factoryModeCode;
    @TableField("factory_mode_name")
    private String factoryModeName;

    @TableField(exist = false)
    private List<SimpleDict<?>> extFieldList;
}

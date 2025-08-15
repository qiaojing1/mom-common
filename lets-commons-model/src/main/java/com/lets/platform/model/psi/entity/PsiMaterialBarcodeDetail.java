package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 物料条码明细
 * </p>
 *
 * @author FZY
 * @since 2024-03-12
 */
@Getter
@Setter
@TableName("psi_material_barcode_detail")
@ApiModel(value = "PsiMaterialBarcodeDetail对象", description = "物料条码明细")
public class PsiMaterialBarcodeDetail extends BaseEntity {

    @ApiModelProperty("父ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("需生成数量")
    @TableField("quantity")
    private BigDecimal quantity;

    @ApiModelProperty("条码标准包装量")
    @TableField("package_quantity")
    private BigDecimal packageQuantity;

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

    @ApiModelProperty("单据数量")
    @TableField("order_quantity")
    private BigDecimal orderQuantity;

    @ApiModelProperty("作废数量")
    @TableField("invalid_quantity")
    private BigDecimal invalidQuantity;

    @ApiModelProperty("已生成数量")
    @TableField("generate_quantity")
    private BigDecimal generateQuantity;

    @ApiModelProperty("可生成数量")
    @TableField("remain_quantity")
    private BigDecimal remainQuantity;

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

    @ApiModelProperty("是否需要检验")
    @TableField("is_require_inspect")
    private Integer isRequireInspect;

    @ApiModelProperty("规则ID")
    @TableField("rule_id")
    private String ruleId;

    @ApiModelProperty("规则名称")
    @TableField("rule_name")
    private String ruleName;

    @ApiModelProperty("打印模板ID")
    @TableField("export_template_id")
    private String exportTemplateId;

    @ApiModelProperty("打印模板名称")
    @TableField("export_template_name")
    private String exportTemplateName;

    @ApiModelProperty("第三方生成的条码")
    @TableField(exist = false)
    private List<String> extBarcodeList;

    @TableField(exist = false)
    private BigDecimal productionStockInUpperLimit;

    @TableField(exist = false)
    private String productionUnitId;
}

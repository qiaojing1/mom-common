package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * <p>
 * 容器物料单据记录表
 * </p>
 *
 * @author FZY
 * @since 2024-08-29
 */
@Getter
@Setter
@TableName("psi_container_material_record")
@ApiModel(value = "PsiContainerMaterialRecord对象", description = "容器物料单据记录表")
public class PsiContainerMaterialRecord extends BaseEntity {

    @ApiModelProperty("容器ID")
    @TableField("container_id")
    private String containerId;
    @ApiModelProperty("容器编码")
    @TableField(exist = false)
    private String containerCode;
    @ApiModelProperty("容器名称")
    @TableField(exist = false)
    private String containerName;

    @ApiModelProperty("容器条码ID")
    @TableField("container_barcode_id")
    private String containerBarcodeId;

    @ApiModelProperty("容器条码")
    @TableField("container_barcode")
    private String containerBarcode;

    @ApiModelProperty("物料主键")
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

    @ApiModelProperty("物料类型")
    @TableField("material_type")
    private String materialType;

    @ApiModelProperty("物料特征属性")
    @TableField("material_specific")
    private String materialSpecific;

    @ApiModelProperty("物料特征属性名称")
    @TableField("material_specific_name")
    private String materialSpecificName;

    @ApiModelProperty("批号")
    @TableField("batch_number")
    private String batchNumber;

    @ApiModelProperty("数量")
    @TableField("quantity")
    private BigDecimal quantity;

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

    @ApiModelProperty("关联单据ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("关联单据单号")
    @TableField("order_code")
    private String orderCode;

    @ApiModelProperty("关联单据单据类别ID")
    @TableField("order_category_id")
    private String orderCategoryId;

    @ApiModelProperty("关联单据单据类别名称")
    @TableField("order_category_name")
    private String orderCategoryName;

    @ApiModelProperty("关联单据物料明细ID")
    @TableField("order_detail_id")
    private String orderDetailId;

    @ApiModelProperty("关联单据行号")
    @TableField("order_line_number")
    private Long orderLineNumber;

    /**
     * @see com.lets.platform.model.psi.enums.ContainerMaterialRecordTypeEnum
     */
    @ApiModelProperty("类型[1合格品、2不良品]")
    @TableField("type")
    private String type;

    @ApiModelProperty("关联单据明细源单据明细主键")
    @TableField("order_source_detail_id")
    private String orderSourceDetailId;
}

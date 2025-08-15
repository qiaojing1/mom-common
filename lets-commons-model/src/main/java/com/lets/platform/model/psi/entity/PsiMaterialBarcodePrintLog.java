package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 物料条码打印日志
 * </p>
 *
 * @author FZY
 * @since 2024-03-15
 */
@Getter
@Setter
@TableName("psi_material_barcode_print_log")
@ApiModel(value = "PsiMaterialBarcodePrintLog对象", description = "物料条码打印日志")
public class PsiMaterialBarcodePrintLog extends BaseEntity {

    @ApiModelProperty("物料条码ID")
    @TableField("barcode_id")
    private String barcodeId;

    @ApiModelProperty("物料条码")
    @TableField("barcode")
    private String barcode;

    @ApiModelProperty("物料ID")
    @TableField("material_id")
    private String materialId;

    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;

    @ApiModelProperty("物料名称")
    @TableField("material_name")
    private String materialName;
}

package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.businessEntity.BaseSerialEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 物料条码关联序列号
 * </p>
 *
 * @author FZY
 * @since 2024-08-22
 */
@Getter
@Setter
@TableName("psi_material_barcode_serial")
@ApiModel(value = "PsiMaterialBarcodeSerial对象", description = "物料条码关联序列号")
public class PsiMaterialBarcodeSerial extends BaseSerialEntity {

    @ApiModelProperty("物流条码id")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("源单关联序列号id")
    @TableField("source_serial_id")
    private String sourceSerialId;

    @ApiModelProperty("源单类型")
    @TableField("source_order_type")
    private String sourceOrderType;

    @ApiModelProperty("源单ID")
    @TableField("source_order_id")
    private String sourceOrderId;

    @ApiModelProperty("源单明细ID")
    @TableField("source_order_detail_id")
    private String sourceOrderDetailId;

    @ApiModelProperty("序列号前缀")
    @TableField("prefix_serial")
    private String prefixSerial;

    @ApiModelProperty("序列号后缀流水")
    @TableField("suffix_serial")
    private String suffixSerial;

    @ApiModelProperty("完整序列号编码")
    @TableField("total_serial")
    private String totalSerial;

    public PsiMaterialBarcodeSerial() {
    }

    public PsiMaterialBarcodeSerial(String prefixSerial, String suffixSerial) {
        this.prefixSerial = prefixSerial;
        this.suffixSerial = suffixSerial;
        this.totalSerial = prefixSerial + suffixSerial;
    }
}

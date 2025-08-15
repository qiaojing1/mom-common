package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.vo.MaterialSpecific;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 应收单物料明细特征属性
 * </p>
 *
 * @author csy
 * @since 2025-08-08
 */
@Getter
@Setter
@TableName("psi_sale_ar_doc_material_characteristic")
@ApiModel(value = "PsiSaleArDocMaterialCharacteristic对象", description = "应收单物料明细特征属性")
public class PsiSaleArDocMaterialCharacteristic extends MaterialSpecific {

    @ApiModelProperty("应收单物料明细ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("应收单ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Long lineNumber;

    @ApiModelProperty("物料编码ID")
    @TableField("material_id")
    private String materialId;
}

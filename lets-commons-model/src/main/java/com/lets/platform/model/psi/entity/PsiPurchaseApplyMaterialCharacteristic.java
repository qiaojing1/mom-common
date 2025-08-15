package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.common.vo.MaterialSpecific;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 采购申请单物料明细特征属性
 * </p>
 *
 * @author csy
 * @since 2023-11-23
 */
@Getter
@Setter
@TableName("psi_purchase_apply_material_characteristic")
@ApiModel(value = "PsiPurchaseApplyMaterialCharacteristic对象", description = "采购申请单物料明细特征属性")
public class PsiPurchaseApplyMaterialCharacteristic extends MaterialSpecific {

    @ApiModelProperty("物料明细ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("采购申请单ID")
    @TableField("apply_order_id")
    private String applyOrderId;

    @TableField("line_number")
    private Integer lineNumber;

    @ApiModelProperty("物料编码ID")
    @TableField("material_id")
    private String materialId;
}

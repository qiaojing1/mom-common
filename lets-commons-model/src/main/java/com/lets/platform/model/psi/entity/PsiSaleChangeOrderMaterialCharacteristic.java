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
 * 销售订单物料明细特征属性
 * </p>
 *
 * @author FZY
 * @since 2023-11-23
 */
@Getter
@Setter
@TableName("psi_sale_change_order_material_characteristic")
@ApiModel(value = "PsiSaleChangeOrderMaterialCharacteristic对象", description = "销售变更单物料明细特征属性")
public class PsiSaleChangeOrderMaterialCharacteristic extends MaterialSpecific {

    @ApiModelProperty("销售订单物料明细ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("销售订单ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Long lineNumber;

    @ApiModelProperty("物料编码ID")
    @TableField("material_id")
    private String materialId;
}

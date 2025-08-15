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
 * 销售退货申请单物料明细特征属性
 * </p>
 *
 * @author zhangweiyan
 * @since 2025-06-07
 */
@Getter
@Setter
@TableName("psi_sale_return_application_order_material_characteristic")
@ApiModel(value = "PsiSaleReturnApplicationOrderMaterialCharacteristic对象", description = "销售退货申请单物料明细特征属性")
public class PsiSaleReturnApplicationOrderMaterialCharacteristic extends MaterialSpecific {

    @ApiModelProperty("销售退货申请单物料明细ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("销售退货申请单ID")
    @TableField("order_id")
    private String orderId;
}

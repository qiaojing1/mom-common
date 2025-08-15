package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 采购退货申请单物料明细特征属性
 * </p>
 *
 * @author csy
 * @since 2023-11-28
 */
@Getter
@Setter
@TableName("psi_purchase_return_apply_order_material_characteristic")
@ApiModel(value = "PsiPurchaseReturnApplyOrderMaterialCharacteristic对象", description = "采购退货申请单物料明细特征属性")
public class PsiPurchaseReturnApplyOrderMaterialCharacteristic extends BaseEntity {

    @ApiModelProperty("物料明细ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("单据ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Long lineNumber;

    @ApiModelProperty("物料编码ID")
    @TableField("material_id")
    private String materialId;

    @ApiModelProperty("物料特征属性ID")
    @TableField("specific_id")
    private String specificId;

    @ApiModelProperty("物料特征属性名称")
    @TableField("specific_name")
    private String specificName;

    @ApiModelProperty("值来源[1用户数据字典,2手工输入]")
    @TableField("value_source")
    private Short valueSource;

    @ApiModelProperty("物料特征属性值")
    @TableField("value")
    private String value;

    @ApiModelProperty("物料特征属性值名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("是否必填")
    @TableField("required")
    private Byte required;
}

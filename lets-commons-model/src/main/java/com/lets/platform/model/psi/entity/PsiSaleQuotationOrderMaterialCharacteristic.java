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

import java.util.Objects;

/**
 * <p>
 * 销售报价单物料明细特征属性
 * </p>
 *
 * @author FZY
 * @since 2023-11-20
 */
@Getter
@Setter
@TableName("psi_sale_quotation_order_material_characteristic")
@ApiModel(value = "PsiSaleQuotationOrderMaterialCharacteristic对象", description = "销售报价单物料明细特征属性")
public class PsiSaleQuotationOrderMaterialCharacteristic extends BaseEntity {

    @ApiModelProperty("销售报价单物料明细ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("销售报价单ID")
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
    private String valueSource;

    @ApiModelProperty("物料特征属性值")
    @TableField("value")
    private String value;

    @ApiModelProperty("物料特征属性值名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("是否必填")
    @TableField("required")
    private Integer required;

}

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
 * 销售发票登记单物料明细特征属性
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-03-12
 */
@Getter
@Setter
@TableName("psi_sale_invoice_registration_detail_characteristic")
@ApiModel(value = "PsiSaleInvoiceRegistrationDetailCharacteristic对象", description = "销售发票登记单物料明细特征属性")
public class PsiSaleInvoiceRegistrationDetailCharacteristic extends BaseEntity {

    @ApiModelProperty("销售发票登记物料明细ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("销售发票登记单ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Integer lineNumber;

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

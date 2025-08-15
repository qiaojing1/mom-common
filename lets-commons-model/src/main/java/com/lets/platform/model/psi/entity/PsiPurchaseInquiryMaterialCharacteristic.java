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
 * 采购询价单物料明细特征属性
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-10-23
 */
@Getter
@Setter
@TableName("psi_purchase_inquiry_material_characteristic")
@ApiModel(value = "PsiPurchaseInquiryMaterialCharacteristic对象", description = "采购询价单物料明细特征属性")
public class PsiPurchaseInquiryMaterialCharacteristic extends BaseEntity {

    @ApiModelProperty("采购询价单ID")
    @TableField("inquiry_order_id")
    private String inquiryOrderId;

    @ApiModelProperty("是否必填")
    @TableField("required")
    private Integer required;

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
    private Integer valueSource;

    @ApiModelProperty("物料特征属性值")
    @TableField("VALUE")
    private String value;

    @ApiModelProperty("物料特征属性值名称")
    @TableField("NAME")
    private String name;
}

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
 * 工序委外价目表物料明细特征属性
 * </p>
 *
 * @author zhangweiyan
 * @since 2025-02-07
 */
@Getter
@Setter
@TableName("psi_outsourcing_price_list_material_characteristic")
@ApiModel(value = "PsiOutsourcingPriceListMaterialCharacteristic对象", description = "工序委外价目表物料明细特征属性")
public class PsiOutsourcingPriceListMaterialCharacteristic extends BaseEntity {

    @ApiModelProperty("采购价目表物料明细ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("采购价目表ID")
    @TableField("price_list_id")
    private String priceListId;

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
    private Short valueSource;

    @ApiModelProperty("物料特征属性值")
    @TableField("VALUE")
    private String value;

    @ApiModelProperty("物料特征属性值名称")
    @TableField("NAME")
    private String name;
}

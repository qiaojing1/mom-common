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
 * 盘点出库入单-特征属性
 * @author DINGWEI
 * @since 2023-10-16
 */
@Getter
@Setter
@TableName("psi_inventory_stock_order_detail_specific")
@ApiModel(value = "PsiInventoryStockOrderDetailSpecific对象", description = "盘点出库入单-特征属性")
public class PsiInventoryStockOrderDetailSpecific extends BaseEntity {

    @ApiModelProperty("盘点出库入单名字主键")
    @TableField("detail_id")
    private String detailId;

    @ApiModelProperty("盘点出库入单主键")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("物料特征属性")
    @TableField("specific_id")
    private String specificId;

    @ApiModelProperty("物料特征属性名称")
    @TableField("specific_name")
    private String specificName;

    @ApiModelProperty("物料特征属性值")
    @TableField("value")
    private String value;

    @ApiModelProperty("值来源[1用户数据字典,2手工输入]")
    @TableField("value_source")
    private String valueSource;

    @ApiModelProperty("物料特征属性值名称")
    @TableField("name")
    private String name;
}

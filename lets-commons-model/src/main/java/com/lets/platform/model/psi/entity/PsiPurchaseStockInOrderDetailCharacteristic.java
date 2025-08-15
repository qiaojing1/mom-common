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
 * 采购入库单-明细-特征属性
 * </p>
 *
 * @author zhangweiyan
 * @since 2025-05-15
 */
@Getter
@Setter
@TableName("psi_purchase_stock_in_order_detail_characteristic")
@ApiModel(value = "PsiPurchaseStockInOrderDetailCharacteristic对象", description = "采购入库单-明细-特征属性")
public class PsiPurchaseStockInOrderDetailCharacteristic extends BaseEntity {

    @ApiModelProperty("采购入库单主键")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("采购入库单物料明细主键")
    @TableField("detail_id")
    private String detailId;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Long lineNumber;

    @ApiModelProperty("物料主键")
    @TableField("material_id")
    private String materialId;

    @ApiModelProperty("物料特征属性主键")
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

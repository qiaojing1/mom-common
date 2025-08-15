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
 * 物料条码单据绑定表
 * </p>
 *
 * @author FZY
 * @since 2024-04-17
 */
@Getter
@Setter
@TableName("psi_barcode_order_bind")
@ApiModel(value = "PsiBarcodeOrderBind对象", description = "物料条码单据绑定表")
public class PsiBarcodeOrderBind extends BaseEntity {

    @ApiModelProperty("条码ID")
    @TableField("barcode_id")
    private String barcodeId;

    @ApiModelProperty("条码标签码")
    @TableField("barcode_code")
    private String barcodeCode;

    @ApiModelProperty("PDA功能菜单")
    @TableField("pda_menu_code")
    private String pdaMenuCode;

    @ApiModelProperty("目标单据ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("目标单据单号")
    @TableField("order_code")
    private String orderCode;

    @ApiModelProperty("目标单据单据类别ID")
    @TableField("order_category_id")
    private String orderCategoryId;

    @ApiModelProperty("目标单据单据类别名称")
    @TableField("order_category_name")
    private String orderCategoryName;

    @ApiModelProperty("目标单据物料明细ID")
    @TableField("order_detail_id")
    private String orderDetailId;

    @ApiModelProperty("目标单据行号")
    @TableField("order_line_number")
    private Long orderLineNumber;
}

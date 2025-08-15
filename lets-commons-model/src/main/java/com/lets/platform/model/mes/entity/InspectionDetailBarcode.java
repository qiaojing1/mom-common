package com.lets.platform.model.mes.entity;

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
 * 检验单明细与物料条码关系表
 * </p>
 *
 * @author FZY
 * @since 2024-12-20
 */
@Getter
@Setter
@TableName("inspection_detail_barcode")
@ApiModel(value = "InspectionDetailBarcode对象", description = "检验单明细与物料条码关系表")
public class InspectionDetailBarcode extends BaseEntity {

    @ApiModelProperty("检验单ID")
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

    @ApiModelProperty("检验单明细ID")
    @TableField("order_detail_id")
    private String orderDetailId;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Long lineNumber;

    @ApiModelProperty("条码ID")
    @TableField("barcode_id")
    private String barcodeId;

    @ApiModelProperty("条码标签码")
    @TableField("barcode_code")
    private String barcodeCode;
}

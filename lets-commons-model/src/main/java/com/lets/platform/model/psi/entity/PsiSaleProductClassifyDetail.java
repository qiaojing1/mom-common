package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 销售产品分类-明细
 * @author DING WEI
 * @since 2024-05-14
 */
@Getter
@Setter
@TableName("psi_sale_product_classify_detail")
@ApiModel(value = "PsiSaleProductClassifyDetail对象", description = "销售产品分类-明细")
public class PsiSaleProductClassifyDetail extends BaseEntity {

    @ExcelIgnore
    @TableField(exist = false)
    private Integer index;
    @ExcelIgnore
    @TableField(exist = false)
    private String sheetName;

    @ExcelIgnore
    @ApiModelProperty("分类主键")
    @TableField("order_id")
    private String orderId;

    @ColumnWidth(40)
    @ExcelProperty("产品分类")
    @TableField(exist = false)
    private String orderName;

    @ExcelIgnore
    @ApiModelProperty("物料主键")
    @TableField("material_id")
    private String materialId;

    @ColumnWidth(40)
    @ExcelProperty("物料编码")
    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;
    @ColumnWidth(40)
    @ExcelProperty("物料名称")
    @ApiModelProperty("物料名称")
    @TableField("material_name")
    private String materialName;
    @ColumnWidth(40)
    @ExcelProperty("规格型号")
    @ApiModelProperty("规格型号")
    @TableField("material_specs")
    private String materialSpecs;
}

package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.baomidou.mybatisplus.annotation.TableField;
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
@ApiModel(value = "销售产品分类-明细-导入", description = "销售产品分类-明细-导入")
public class PsiSaleProductClassifyDetailExcel {

    @ColumnWidth(40)
    @ExcelProperty("产品分类")
    @TableField(exist = false)
    private String orderName;

    @ColumnWidth(40)
    @ExcelProperty("物料编码")
    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;
}

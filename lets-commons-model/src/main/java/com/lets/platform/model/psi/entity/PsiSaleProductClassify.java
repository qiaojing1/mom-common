package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * 销售产品分类
 * @author DING WEI
 * @since 2024-05-14
 */
@Getter
@Setter
@TableName("psi_sale_product_classify")
@ApiModel(value = "PsiSaleProductClassify对象", description = "销售产品分类")
public class PsiSaleProductClassify extends BaseEntity {

    @ExcelIgnore
    @TableField(exist = false)
    private Integer index;
    @ExcelIgnore
    @TableField(exist = false)
    private String sheetName;

    @ExcelIgnore
    @ApiModelProperty("编码")
    @TableField("code")
    private String code;

    @ColumnWidth(40)
    @ExcelProperty("产品分类")
    @NotBlank(message = "SaleProductClassify.name", groups = {Save.class, Update.class})
    @ApiModelProperty("名称")
    @TableField("name")
    private String name;

    @Length(max = 200, message = "Order.remark", groups = {Save.class, Update.class})
    @ColumnWidth(60)
    @ExcelProperty("备注")
    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ExcelIgnore
    @NotEmpty(message = "OrderDetail.NotEmpty", groups = {Save.class, Update.class})
    @TableField(exist = false)
    private List<PsiSaleProductClassifyDetail> details;
}

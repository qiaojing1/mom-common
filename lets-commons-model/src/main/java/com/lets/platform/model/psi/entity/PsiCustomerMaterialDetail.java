package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
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
 * 客户物料-明细
 * </p>
 *
 * @author csy
 * @since 2024-06-19
 */
@Getter
@Setter
@TableName("psi_customer_material_detail")
@ApiModel(value = "PsiCustomerMaterialDetail对象", description = "客户物料-明细")
public class PsiCustomerMaterialDetail extends BaseEntity {

    @ExcelIgnore
    @TableField(exist = false)
    private Integer rowIndex;

    @TableField(exist = false)
    @ExcelIgnore
    private String customerId;

    @TableField(exist = false)
    @ExcelIgnore
    private String suitCustomerRange;

    @ApiModelProperty("单据编码")
    @ExcelIgnore
    @TableField("order_id")
    private String orderId;
    @TableField(exist = false)
    @ExcelProperty("单据编号")
    private String orderCode;

    @ApiModelProperty("编码")
    @TableField("customer_material_code")
    @ExcelProperty("客户物料编码")
    private String customerMaterialCode;
//    private String code;

    @ApiModelProperty("名称")
    @TableField("customer_material_name")
    @ExcelProperty("客户物料名称")
    private String customerMaterialName;

    @ExcelIgnore
    @ApiModelProperty("物料id")
    @TableField("material_id")
    private String materialId;

    @ApiModelProperty("是否为自动创建的客户物料YN")
    @TableField("is_auto_create")
    private String isAutoCreate;

    @ExcelProperty("物料编码")
    @TableField(exist = false)
    private String materialCode;

    @ExcelIgnore
    @TableField(exist = false)
    private String materialName;
    @ExcelIgnore
    @TableField(exist = false)
    private String specs;
    @ExcelIgnore
    @TableField(exist = false)
    private String groupName;
    @ExcelIgnore
    @TableField(exist = false)
    private String drawNo;
    @ExcelIgnore
    @TableField(exist = false)
    private String basicUnitName;
}

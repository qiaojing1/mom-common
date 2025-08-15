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

import java.util.List;

/**
 * <p>
 * 客户物料
 * </p>
 *
 * @author csy
 * @since 2024-06-19
 */
@Getter
@Setter
@TableName("psi_customer_material")
@ApiModel(value = "PsiCustomerMaterial对象", description = "客户物料")
public class PsiCustomerMaterial extends BaseEntity {

    @ExcelIgnore
    @TableField(exist = false)
    private Integer rowIndex;

    @ApiModelProperty("编码")
    @TableField("code")
    @ExcelProperty("方案编号")
    private String code;

    @ApiModelProperty("名称")
    @TableField("name")
    @ExcelProperty("方案名称")
    private String name;

    @ApiModelProperty("限定方式 1:客户 2:客户分组")
    @TableField("suit_customer_range")
    @ExcelProperty("限定方式")
    private String suitCustomerRange;
    @ApiModelProperty("限定方式 1:客户 2:客户分组")
    @TableField(exist = false)
    @ExcelIgnore
    private String suitCustomerRangeName;

    @ApiModelProperty("限定对象id")
    @TableField("target_id")
    @ExcelIgnore
    private String targetId;
    @ApiModelProperty("限定对象名称")
    @TableField(exist = false)
    @ExcelIgnore
    private String targetName;
    @ApiModelProperty("限定对象编码")
    @TableField(exist = false)
    @ExcelProperty("客户编码")
    private String customCode;
    @TableField(exist = false)
    @ExcelIgnore
    private String customName;
    @TableField(exist = false)
    @ExcelProperty("客户分组编码")
    private String customGroupCode;
    @TableField(exist = false)
    @ExcelIgnore
    private String customGroupName;

    @ApiModelProperty("备注")
    @TableField("remark")
    @ExcelProperty("备注")
    private String remark;

    @ExcelIgnore
    @TableField("enable")
    private Integer enable;

    @ExcelIgnore
    @TableField(exist = false)
    private String enableName;


    @ExcelIgnore
    @TableField(exist = false)
    private List<PsiCustomerMaterialDetail> details;

    @ExcelIgnore
    @TableField(exist = false)
    private String orderId;

    @ExcelIgnore
    @TableField(exist = false)
    private String customerMaterialId;

    @ExcelIgnore
    @TableField(exist = false)
    private String customerMaterialCode;

    @ExcelIgnore
    @TableField(exist = false)
    private String customerMaterialName;

    @ExcelIgnore
    @TableField(exist = false)
    private String materialId;

    @ExcelIgnore
    @TableField(exist = false)
    private String materialCode;

    @ExcelIgnore
    @TableField(exist = false)
    private String materialName;
}

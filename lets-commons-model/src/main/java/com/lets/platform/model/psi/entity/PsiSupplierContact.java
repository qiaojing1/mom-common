package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Pattern;

/**
 * <p>
 * 供应商联系方式
 * </p>
 *
 * @author csy
 * @since 2023-07-26
 */
@Getter
@Setter
@TableName("psi_supplier_contact")
@ApiModel(value = "PsiSupplierContact对象", description = "供应商联系方式")
public class PsiSupplierContact extends BaseEntity {

    @ExcelIgnore
    @TableField(exist = false)
    private Integer index;
    @TableField(exist = false)
    @ExcelIgnore
    private String sheetName;

    @ApiModelProperty("供应商主键")
    @TableField("supplier_id")
    @ExcelIgnore
    private String supplierId;
    @ExcelProperty("供应商名称")
    @TableField(exist = false)
    private String supplierName;

    @ApiModelProperty("联系人")
    @TableField("name")
    @ExcelProperty("联系人")
    @Length(min=1,max=20,message = "PsiSupplierContact.name", groups = {Save.class, Update.class})
    private String name;

    @ApiModelProperty("联系电话")
    @TableField("phone")
    @ExcelProperty("联系电话")
    @Pattern(regexp = GlobalConstant.NUMBER_DASH_1_20, message = "PsiSupplierContact.phone", groups = {Save.class, Update.class})
    private String phone;

    @ApiModelProperty("邮箱")
    @TableField("email")
    @ExcelProperty("邮箱")
    @Pattern(regexp=GlobalConstant.NOT_CHINESE_0_40,message = "PsiSupplierContact.email", groups = {Save.class, Update.class})
    private String email;

    @ApiModelProperty("职务")
    @TableField("duty")
    @ExcelProperty("职务")
    @Length(max=20,message = "PsiSupplierContact.duty", groups = {Save.class, Update.class})
    private String duty;

    @ApiModelProperty("送货地址")
    @TableField("address")
    @ExcelProperty("送货地址")
    @Length(min=1,max=50,message = "PsiSupplierContact.address", groups = {Save.class, Update.class})
    private String address;

    @ApiModelProperty("是否默认")
    @TableField("default_selected")
    @ExcelProperty("是否默认")
    private String isDefault;
    @ApiModelProperty("是否默认")
    @TableField(exist = false)
    @ExcelIgnore
    private String isDefaultName;

    @ApiModelProperty("是否删除[N否Y是]")
      @TableField(value = "deleted", fill = FieldFill.INSERT)
    @ExcelIgnore
    private String deleted;
}

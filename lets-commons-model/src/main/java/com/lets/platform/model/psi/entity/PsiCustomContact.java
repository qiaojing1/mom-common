package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.enums.YesOrNo;
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
 * 客户联系方式
 * @author DINGWEI
 * @since 2023-07-25
 */
@Getter
@Setter
@TableName("psi_custom_contact")
@ApiModel(value = "PsiCustomContact对象", description = "客户联系方式")
public class PsiCustomContact extends BaseEntity {

    @ExcelIgnore
    @TableField(exist = false)
    private Integer index;
    @ExcelIgnore
    @TableField(exist = false)
    private String sheetName;

    @ExcelIgnore
    @ApiModelProperty("客户主键")
    @TableField("custom_id")
    private String customId;
    @ColumnWidth(20)
    @ExcelProperty(value = "客户名称", index = 0)
    @TableField(exist = false)
    private String customName;

    @ColumnWidth(20)
    @ExcelProperty(value = "联系人", index = 1)
    @Length(max = 20, message = "PsiCustomContact.name", groups = {Save.class, Update.class})
    @ApiModelProperty("联系人")
    @TableField("name")
    private String name;

    @ColumnWidth(20)
    @ExcelProperty(value = "联系电话", index = 2)
    @Pattern(regexp = GlobalConstant.NUMBER_LINE_0_21, message = "PsiCustomContact.phone", groups = {Save.class, Update.class})
    @ApiModelProperty("联系电话")
    @TableField("phone")
    private String phone;

    @ColumnWidth(20)
    @ExcelProperty(value = "职务", index = 3)
    @Length(max = 20, message = "PsiCustomContact.duties", groups = {Save.class, Update.class})
    @ApiModelProperty("职务")
    @TableField("duties")
    private String duties;

    @ColumnWidth(20)
    @ExcelProperty(value = "邮箱", index = 4)
    @ApiModelProperty("邮箱")
    @TableField("email")
    private String email;

    @ColumnWidth(20)
    @ExcelProperty(value = "送货地址", index = 5)
    @Length(max = 50, message = "PsiCustomContact.address", groups = {Save.class, Update.class})
    @ApiModelProperty("送货地址")
    @TableField("address")
    private String address;

    @ExcelIgnore
    @ValidatedEnum(enumClass = YesOrNo.class, required = true, message = "PsiCustomContact.isDefault", groups = {Save.class, Update.class})
    @ApiModelProperty("是否默认[N否Y是]")
    @TableField("is_default")
    private String isDefault;
    @ColumnWidth(20)
    @ExcelProperty(value = "是否默认", index = 6)
    @TableField(exist = false)
    private String isDefaultName;

    @ExcelIgnore
    @ApiModelProperty("是否删除[N否Y是]")
    @TableField(value = "deleted", fill = FieldFill.INSERT)
    private String deleted;
}

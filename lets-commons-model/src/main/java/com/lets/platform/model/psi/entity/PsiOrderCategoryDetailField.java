package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.enums.YesOrNo;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

/**
 * 单据类别管理
 * @author DING WEI
 * @since 2023-07-31
 */
@Getter
@Setter
@TableName("psi_order_category_detail_field")
@ApiModel(value = "PsiOrderCategoryDetailField对象", description = "单据类别管理")
public class PsiOrderCategoryDetailField extends BaseEntity {

    @ExcelIgnore
    @TableField(exist = false)
    private Integer index;

    @ExcelIgnore
    @ApiModelProperty("单据类别主键")
    @TableField("order_id")
    private String orderId;
    @ColumnWidth(20)
    @ExcelProperty("单据类别")
    @TableField(exist = false)
    private String orderName;

    @ExcelIgnore
    @NotBlank(message = "PsiOrderCategoryDetailField.fieldId", groups = {Save.class, Update.class})
    @ApiModelProperty("字段")
    @TableField("field_id")
    private String fieldId;
    @ColumnWidth(20)
    @ExcelProperty("字段名称")
    @TableField(exist = false)
    private String fieldName;

    @ExcelIgnore
    @ApiModelProperty("默认值")
    @TableField("default_value")
    private String defaultValue;

    @ColumnWidth(20)
    @ExcelProperty("默认值")
    @ApiModelProperty("默认值的名称")
    @TableField("default_name")
    private String defaultName;

    @ExcelIgnore
    @ValidatedEnum(enumClass = YesOrNo.class, message = "PsiOrderCategoryDetailField.isNotNull", groups = {Save.class, Update.class})
    @ApiModelProperty("是否必填[N否Y是]")
    @TableField("is_not_null")
    private String isNotNull;
    @ColumnWidth(20)
    @ExcelProperty("是否必填")
    @TableField(exist = false)
    private String isNotNullName;

    @ExcelIgnore
    @ValidatedEnum(enumClass = YesOrNo.class, message = "PsiOrderCategoryDetailField.isReadOnly", groups = {Save.class, Update.class})
    @ApiModelProperty("是否只读[N否Y是]")
    @TableField("is_read_only")
    private String isReadOnly;
    @ColumnWidth(20)
    @ExcelProperty("是否只读")
    @TableField(exist = false)
    private String isReadOnlyName;

    @ExcelIgnore
    @ValidatedEnum(enumClass = YesOrNo.class, message = "PsiOrderCategoryDetailField.isHide", groups = {Save.class, Update.class})
    @ApiModelProperty("是否隐藏[N否Y是]")
    @TableField("is_hide")
    private String isHide;
    @ColumnWidth(20)
    @ExcelProperty("是否隐藏")
    @TableField(exist = false)
    private String isHideName;

    @ExcelIgnore
    @ApiModelProperty("是否启用[0停用1启用]")
    @TableField("enable")
    private Integer enable;

    @ExcelIgnore
    @ApiModelProperty("是否删除[N否Y是]")
    @TableField(value = "deleted", fill = FieldFill.INSERT)
    private String deleted;

    @ExcelIgnore
    @TableField(exist = false)
    private String type;
    @ExcelIgnore
    @TableField(exist = false)
    private String field;
    @ExcelIgnore
    @TableField(exist = false)
    private String name;
    @ExcelIgnore
    @TableField(exist = false)
    private String componentType;
    @ExcelIgnore
    @TableField(exist = false)
    private String props;
    @ExcelIgnore
    @TableField(exist = false)
    private String orderNature;
    @ExcelIgnore
    @TableField(exist = false)
    private String checkHandlerBean;
    @ExcelIgnore
    @TableField(exist = false)
    private String checkResult;
    @ExcelIgnore
    @TableField(exist = false)
    private String fieldKey;
    @ExcelIgnore
    @TableField(exist = false)
    private String fieldRelation;
}

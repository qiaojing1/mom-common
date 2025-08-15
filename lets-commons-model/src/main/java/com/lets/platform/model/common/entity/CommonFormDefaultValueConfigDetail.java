package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 表单默认值配置
 * </p>
 *
 * @author FZY
 * @since 2023-08-04
 */
@Getter
@Setter
@TableName("common_form_default_value_config_detail")
@ApiModel(value = "CommonFormDefaultValueConfigDetail对象", description = "表单默认值配置")
public class CommonFormDefaultValueConfigDetail extends BaseEntity {

    @ApiModelProperty("父ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("字段KEY")
    @TableField("field_key")
    private String fieldKey;

    @ApiModelProperty("字段KEY")
    @TableField("field_name_key")
    private String fieldNameKey;

    @ApiModelProperty("字段名称")
    @TableField("field_name")
    private String fieldName;

    @ApiModelProperty("字段映射关系")
    @TableField("field_relation")
    private String fieldRelation;

    @ApiModelProperty("是否下拉")
    @TableField("is_select")
    private Integer isSelect;

    @ApiModelProperty("是否应用单据类别")
    @TableField("use_order_category")
    private Integer useOrderCategory;

    @ApiModelProperty("是否标签")
    @TableField("is_tab")
    private Integer isTab;

    @ApiModelProperty("组件名称")
    @TableField("component_name")
    private String componentName;

    @ApiModelProperty("下拉地址")
    @TableField("field_url")
    private String fieldUrl;

    @ApiModelProperty("下拉值")
    @TableField("select_value")
    private String selectValue;

    @ApiModelProperty("下拉名称")
    @TableField("select_label")
    private String selectLabel;

    @ApiModelProperty("默认值")
    @TableField("default_value")
    private String defaultValue;

    @ApiModelProperty("默认名称")
    @TableField("default_name")
    private String defaultName;
}

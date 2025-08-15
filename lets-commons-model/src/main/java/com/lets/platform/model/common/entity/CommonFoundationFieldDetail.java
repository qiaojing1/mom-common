/*
 * csy
 */

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
 * 打印模板区分依据字段
 * </p>
 *
 * @author csy
 * @since 2024-08-01
 */
@Getter
@Setter
@TableName("common_foundation_field_detail")
@ApiModel(value = "CommonFoundationFieldDetail对象", description = "打印模板区分依据字段")
public class CommonFoundationFieldDetail extends BaseEntity {

    @ApiModelProperty("模板id")
    @TableField("template_id")
    private String templateId;

    @ApiModelProperty("依据字段id")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("分类字段值id")
    @TableField("default_value")
    private String defaultValue;

    @ApiModelProperty("分类字段值name")
    @TableField("default_name")
    private String defaultName;
}

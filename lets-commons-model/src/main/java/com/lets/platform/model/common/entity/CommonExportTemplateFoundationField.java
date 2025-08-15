/*
 * csy
 */

package com.lets.platform.model.common.entity;

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
 * 打印模板区分依据字段
 * </p>
 *
 * @author csy
 * @since 2024-08-01
 */
@Getter
@Setter
@TableName("common_export_template_foundation_field")
@ApiModel(value = "CommonExportTemplateFoundationField对象", description = "打印模板区分依据字段")
public class CommonExportTemplateFoundationField extends BaseEntity {

    @ApiModelProperty("菜单编码")
    @TableField("menu_code")
    private String menuCode;

    @ApiModelProperty("字段")
    @TableField("field")
    private String field;

    @ApiModelProperty("字段名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("组件类型[例:moduleSelect,dict]")
    @TableField("component_type")
    private String componentType;

    @ApiModelProperty("组件参数")
    @TableField("props")
    private String props;
}

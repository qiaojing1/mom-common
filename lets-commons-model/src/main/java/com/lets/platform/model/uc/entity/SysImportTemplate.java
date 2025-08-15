package com.lets.platform.model.uc.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 导入模板
 * @author DING WEI
 * @since 2025-07-22
 */
@Getter
@Setter
@TableName("sys_import_template")
@ApiModel(value = "SysImportTemplate对象", description = "导入模板")
public class SysImportTemplate extends BaseEntity {

    @ApiModelProperty("模板编码")
    @TableField("code")
    private String code;

    @ApiModelProperty("模板名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("菜单编码")
    @TableField("menu_code")
    private String menuCode;

    @ApiModelProperty("菜单名称")
    @TableField("menu_name")
    private String menuName;

    @ApiModelProperty("版本号")
    @TableField("version")
    private String version;

    @ApiModelProperty("不同sheet关联字段")
    @TableField("relation_field")
    private String relationField;

    @ApiModelProperty("是否启用")
    @TableField("enable")
    private Integer enable;
    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private List<SysImportTemplateDetail> details;
}

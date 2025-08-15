package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 导出(打印)-字段信息
 * @author DING WEI
 * @since 2023-10-19
 */
@Getter
@Setter
@TableName("common_export_field")
@ApiModel(value = "CommonExportField对象", description = "导出(打印)-字段信息")
public class CommonExportField extends BaseEntity {

    @ApiModelProperty("菜单编码(功能)")
    @TableField("menu_code")
    private String menuCode;
    @ApiModelProperty("菜单名称(功能)")
    @TableField(exist = false)
    private String menuName;

    @ApiModelProperty("字段类型[1主表单字段,2子表单字段,3企业字段,4其他模板，5物料字段]")
    @TableField("field_type")
    private String fieldType;
    @TableField(exist = false)
    private String fieldTypeName;

    @ApiModelProperty("名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("字段")
    @TableField("field")
    private String field;
}

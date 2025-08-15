package com.lets.platform.model.uc.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 导入模板-字段
 * @author DING WEI
 * @since 2025-07-22
 */
@Getter
@Setter
@TableName("sys_import_template_detail")
@ApiModel(value = "SysImportTemplateDetail对象", description = "导入模板-字段")
public class SysImportTemplateDetail extends BaseEntity {

    @ApiModelProperty("模板主键")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("字段主键")
    @TableField("field_id")
    private String fieldId;
    @ApiModelProperty("字段key")
    @TableField(exist = false)
    private String fieldKey;
    @ApiModelProperty("字段名称")
    @TableField("field_name")
    private String fieldName;

    @ApiModelProperty("sheet名称")
    @TableField("sheet_name")
    private String sheetName;

    @ApiModelProperty("是否必填")
    @TableField("required")
    private Integer required;
    @TableField(exist = false)
    private String requiredName;

    @ApiModelProperty("是否必选")
    @TableField("necessary_selected")
    private Integer necessarySelected;
    @TableField(exist = false)
    private String necessarySelectedName;
    @ApiModelProperty("是否系统必须导入")
    @TableField(exist = false)
    private Integer sysNecessaryImport;

    @ApiModelProperty("是否导入")
    @TableField("necessary_import")
    private Integer necessaryImport;
    @TableField(exist = false)
    private String necessaryImportName;

    @ApiModelProperty("批注")
    @TableField(exist = false)
    private String annotations;
}

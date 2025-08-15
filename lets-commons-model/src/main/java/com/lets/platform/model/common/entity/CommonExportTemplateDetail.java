package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * <p>
 * 导出(打印)模板-变量明细
 * </p>
 *
 * @author DING WEI
 * @since 2023-10-19
 */
@Getter
@Setter
@TableName("common_export_template_detail")
@ApiModel(value = "CommonExportTemplateDetail对象", description = "导出(打印)模板-变量明细")
public class CommonExportTemplateDetail extends BaseEntity {

    @ApiModelProperty("模板主键")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("变量名称")
    @TableField("variable_name")
    private String variableName;

    /**
     * @see com.lets.platform.model.common.enums.ExportTemplateVariableTypeEnum
     */
    @ApiModelProperty("变量类型[1文本,2二维码,3条形码,4图片]")
    @TableField("variable_type")
    private String variableType;
    @TableField(exist = false)
    private String variableTypeName;

    /**
     * @see com.lets.platform.model.common.enums.ExportTemplateVariableSourceEnum
     */
    @ApiModelProperty("变量来源[1主表单字段,2子表单字段,3企业字段,4其他模板,5固定值,6物料字段]")
    @TableField("variable_source")
    private String variableSource;
    @TableField(exist = false)
    private String variableSourceName;

    @ApiModelProperty("变量字段")
    @TableField("variable_field")
    private String variableField;
    @TableField(exist = false)
    private List<String> variableFieldNames;

    @ApiModelProperty("宽度")
    @TableField("width")
    private Integer width;

    @ApiModelProperty("高度")
    @TableField("height")
    private Integer height;

    @ApiModelProperty("变量字段格式化(时间格式[yyyy-MM-dd等])")
    @TableField("variable_format")
    private String variableFormat;

    @ApiModelProperty("变量前缀")
    @TableField("variable_pre")
    private String variablePre;

    @ApiModelProperty("文本长度")
    @TableField("length")
    private Long length;
}

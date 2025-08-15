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

import java.util.List;

/**
 * <p>
 * 导出(打印)模板-模板名称明细
 * </p>
 *
 * @author qiao jing
 * @since 2025-07-02
 */
@Getter
@Setter
@TableName("common_export_template_name_detail")
@ApiModel(value = "CommonExportTemplateNameDetail对象", description = "导出(打印)模板-模板名称明细")
public class CommonExportTemplateNameDetail extends BaseEntity {

    @ApiModelProperty("模板主键")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("变量名称")
    @TableField("variable_name")
    private String variableName;

    @ApiModelProperty("变量类型[1文本,2二维码,3条形码,4图片]")
    @TableField("variable_type")
    private String variableType;

    @ApiModelProperty("变量来源[1主表单字段,2子表单字段,3企业字段,4其他模板,5固定值]")
    @TableField("variable_source")
    private String variableSource;

    @ApiModelProperty("变量字段")
    @TableField("variable_field")
    private String variableField;
    @TableField(exist = false)
    private List variableFieldNames;

    @ApiModelProperty("宽度")
    @TableField("width")
    private String width;

    @ApiModelProperty("高度")
    @TableField("height")
    private String height;

    @ApiModelProperty("时间格式")
    @TableField("variable_format")
    private String variableFormat;

    @ApiModelProperty("变量前缀")
    @TableField("variable_pre")
    private String variablePre;
}

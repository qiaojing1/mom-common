package com.lets.platform.model.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 自定义导出(打印)模板-变量
 * @author: DING WEI
 * @date: 2022/9/20 10:36
 */
@Data
@ApiModel("自定义导出(打印)模板-变量")
public class ExportTemplateDetailVo {

    @ApiModelProperty("主键")
    private String detailId;

    @ApiModelProperty("模板主键")
    private String orderId;

    @ApiModelProperty("变量名称")
    private String variableName;

    @ApiModelProperty("变量类型[1文本，2二维码，3条形码，4图片]")
    private String variableType;
    private String variableTypeName;

    @ApiModelProperty("变量来源[1主表单字段，2子表单字段，3企业字段，4其他模板]")
    private String variableSource;
    private String variableSourceName;

    @ApiModelProperty("变量字段")
    private String variableField;
    private List<String> variableFieldNames;

    @ApiModelProperty("宽度")
    private Integer width;

    @ApiModelProperty("高度")
    private Integer height;

}

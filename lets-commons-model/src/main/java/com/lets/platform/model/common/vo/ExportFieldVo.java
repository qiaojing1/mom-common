package com.lets.platform.model.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 导出模板 字段 展示对象
 * @author: DING WEI
 * @date: 2022/9/21 10:29
 */
@Data
@ApiModel("导出模板 字段 展示对象")
public class ExportFieldVo {

    @ApiModelProperty("主键")
    private String id;

    @ApiModelProperty("菜单编码(功能)")
    private String menuCode;

    @ApiModelProperty("字段类型[1主表单字段，2子表单字段，3企业字段，4其他模板,5物料字段]")
    private String fieldType;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("字段")
    private String field;

}

package com.lets.platform.model.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 表字段信息 展示对象
 * @author: DING WEI
 * @date: 2022/6/23 14:45
 */
@Data
@ApiModel("表字段信息 展示对象")
public class TableFieldInfoVo {

    @ApiModelProperty("字段")
    private String field;
    @ApiModelProperty("别名")
    private String alias;
    @ApiModelProperty("备注")
    private String text;
    @ApiModelProperty("字段类型")
    private String dataType;
    @ApiModelProperty("字段长度")
    private Integer dataLen;
    @ApiModelProperty("数字长度")
    private Integer numberLen;
    @ApiModelProperty("小数精度")
    private Integer digits;
    @ApiModelProperty("是否可空")
    private String allowBlank;
    @ApiModelProperty("是否主键")
    private String isPrimary;
    @ApiModelProperty("默认值")
    private String defaultValue;
    @ApiModelProperty("是否自增")
    private String increment;

}

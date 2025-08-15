package com.lets.platform.model.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 表信息 展示对象
 * @author: DING WEI
 * @date: 2022/6/23 14:45
 */
@Data
@ApiModel("表信息 展示对象")
public class TableInfoVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("表明")
    private String tableName;
    @ApiModelProperty("表注释")
    private String tableComment;

}

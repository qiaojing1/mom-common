package com.lets.platform.model.common.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: 下载zip
 * @author: DING WEI
 * @date: 9/18/21 2:38 PM
 */
@Data
@ApiModel("多个文件压缩成zip下载")
public class ZipFileDTO {

    @ApiModelProperty("文件ID")
    private String id;

    @ApiModelProperty("文件名前缀")
    private String prefix;

    @ApiModelProperty("文件名")
    private String name;
}

package com.lets.platform.model.common.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @description: 下载zip
 * @author: DING WEI
 * @date: 9/18/21 2:38 PM
 */
@Data
@ApiModel("多个文件压缩成zip下载")
public class DownloadZipDTO {

    @ApiModelProperty("压缩后的ZIP名称")
    private String zipFileName;

    private List<ZipFileDTO> fileList;
}

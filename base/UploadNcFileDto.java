package com.lets.platform.common.pojo.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * 上传NC文件
 * @author: DING WEI
 * @date: 2023/2/23 14:19
 */
@Data
@ApiModel("上传NC文件")
public class UploadNcFileDto {

    @ApiModelProperty("网关IP")
    private String gatewayIp;
    private String deviceId;
    @ApiModelProperty("设备编码")
    private String deviceCode;
    @ApiModelProperty("NC目录")
    private String ncUri;

    @ApiModelProperty("文件名称")
    private String filename;

    @ApiModelProperty("文件地址")
    private String fileUrl;

    @ApiModelProperty("文件大小")
    private Long fileSize;

    @ApiModelProperty("程序名称")
    private String programName;

}

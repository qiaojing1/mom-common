package com.lets.platform.model.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description 大屏数据模板表
 * @author wangjx
 * @date 2022-04-08
 */
@Data
@ApiModel("大屏数据模板表")
public class ReportTemplateVo {
    private String id;
    /**
     * 大屏名称
     */
    @ApiModelProperty("大屏名称")
    private String name;

    /**
     * 大屏类型1:web端2:手机端
     */
    @ApiModelProperty("大屏类型1:web端2:手机端")
    private String type;
    /**
     * 缩略图
     */
    @ApiModelProperty("缩略图")
    private String thumbnail;
    private String thumbnailId;


    /**
     * 租户id
     */
    @ApiModelProperty("租户id")
    private String tenancyId;
    private String data;

}

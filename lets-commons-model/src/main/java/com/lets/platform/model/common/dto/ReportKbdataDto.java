package com.lets.platform.model.common.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author wangjx
 * @description 大屏数据表
 * @date 2022-04-08
 */
@Data
@ApiModel("大屏数据表")
public class ReportKbdataDto {
    private String id;

    /**
     * 大屏名称
     */
    @ApiModelProperty(value = "大屏名称")
    @NotBlank(message = "ReportKbdataDto.name")
    private String name;

    /**
     * 大屏英文名
     */
    @ApiModelProperty(value = "大屏英文名称")
    @NotBlank(message = "ReportKbdataDto.nameEn")
    private String nameEn;

    /**
     * 大屏类型[1:主看板;2:看板组件]
     */
    @ApiModelProperty(value = "大屏类型[1:主看板;2:看板组件]")
    private Integer kanbanType;

    /**
     * 大屏类型1:web端2:手机端
     */
    @ApiModelProperty(value = "大屏类型1:web端2:手机端")
    private String type;

    /**
     * 发布(0:未发布;1:已发布
     */
    @ApiModelProperty(value = "发布(0:未发布;1:已发布)")
    private String releaseStatus;

    /**
     * 页面整体布局json
     */
    @ApiModelProperty(value = "页面整体布局json")
    private String data;

    /**
     * 缩略图
     */
    @ApiModelProperty(value = "缩略图")
    private String thumbnailId;

    /**
     * 发布成功的功能号
     */
    @ApiModelProperty(value = "发布成功的功能号")
    private String module;
}

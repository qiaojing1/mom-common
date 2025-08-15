package com.lets.platform.model.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author wangjx
 * @description 大屏数据表
 * @date 2022-04-08
 */
@Data
@ApiModel("大屏数据反参")
public class ReportKbdataVo {
    private String id;
    /**
     * 大屏名称
     */
    @ApiModelProperty("大屏名称")
    private String name;
    @ApiModelProperty("大屏地址")
    private String url;

    /**
     * 大屏英文名
     */
    @ApiModelProperty("大屏英文名")
    private String nameEn;

    /**
     * 大屏类型[1:主看板;2:看板组件]
     */
    @ApiModelProperty(value = "大屏类型[1:主看板;2:看板组件]")
    private Integer kanbanType;

    /**
     * 大屏类型1:web端2:手机端
     */
    @ApiModelProperty("大屏类型1:web端2:手机端")
    private String type;

    /**
     * 发布(0:未发布;1:已发布
     */
    @ApiModelProperty("发布(0:未发布;1:已发布")
    private String releaseStatus;

    private String releaseStatusName;

    /**
     * 页面整体布局json
     */
    @ApiModelProperty("页面整体布局json")
    private String data;
    private String releaseData;

    /**
     * 缩略图
     */
    @ApiModelProperty("缩略图")
    private String thumbnail;
    private String releaseThumbnail;

    /**
     * 发布成功的功能号
     */
    @ApiModelProperty("发布成功的功能号")
    private String module;

    /**
     * 租户id
     */
    @ApiModelProperty("租户id")
    private String tenancyId;

    /**
     * 发布缩略图
     */
    private String releaseThumbnailId;

    /**
     * 缩略图
     */
    private String thumbnailId;

}

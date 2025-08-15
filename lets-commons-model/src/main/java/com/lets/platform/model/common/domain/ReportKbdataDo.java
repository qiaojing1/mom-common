package com.lets.platform.model.common.domain;

import com.lets.platform.common.pojo.base.BaseDo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description 大屏数据表
 * @author wangjx
 * @date 2022-04-08
 */
@Data
@ApiModel("大屏数据表")
public class ReportKbdataDo extends BaseDo {

    /**
     * 大屏名称
     */
    private String name;

    /**
     * 大屏英文名
     */
    private String nameEn;

    /**
     * 大屏类型[1:主看板;2:看板组件]
     */
    private Integer kanbanType;

    /**
     * 大屏类型1:web端2:手机端
     */
    private String type;

    /**
     * 发布(0:未发布;1:已发布
     */
    private String releaseStatus;

    /**
     * 页面整体布局json
     */
    private String data;
    /**
     * 发布json
     */
    private String releaseData;
    /**
     *  发布缩略图
     */
    private String releaseThumbnailId;

    /**
     * 缩略图
     */
    private String thumbnailId;

    /**
     * 发布成功的功能号
     */
    private String module;

    /**
     * 租户id
     */
    private String tenancyId;

}

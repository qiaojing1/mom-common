package com.lets.platform.model.common.query;

import com.lets.platform.common.pojo.base.PageQuery;
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
public class ReportKbdataQuery extends PageQuery {
    private String id;
    /**
     * 大屏名称
     */
    @ApiModelProperty(value = "大屏名称")
    private String name;
    @ApiModelProperty(value = "大屏地址")
    private String url;

    /**
     * 大屏英文名
     */
    @ApiModelProperty(value = "大屏英文名")
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
    @ApiModelProperty(value = "发布(0:未发布;1:已发布")
    private String releaseStatus;

    /**
     * 发布成功的功能号
     */
    @ApiModelProperty(value = "发布成功的功能号")
    private String module;

    /**
     * 租户id
     */
    @ApiModelProperty(value = "租户id")
    private String tenancyId;

}

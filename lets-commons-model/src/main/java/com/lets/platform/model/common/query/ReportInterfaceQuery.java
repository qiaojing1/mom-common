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
public class ReportInterfaceQuery extends PageQuery {
    private String id;
    /**
     * 接口名称
     */
    @ApiModelProperty("接口名称")
    private String name;

    /**
     * 接口地址
     */
    @ApiModelProperty("接口地址")
    private String url;

    /**
     * 大屏使用 y/n
     */
    @ApiModelProperty("大屏使用 Y/N")
    private String interfaceKb;

    /**
     * 看板使用 y/n
     */
    @ApiModelProperty("看板使用 Y/N")
    private String interfaceReport;


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
    private String interfaceId;

}

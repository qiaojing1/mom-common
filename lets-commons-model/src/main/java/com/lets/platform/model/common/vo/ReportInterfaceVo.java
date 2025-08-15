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
@ApiModel("大屏数据接口反参")
public class ReportInterfaceVo {
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
     * 备注
     */
    @ApiModelProperty("备注")
    private String remark;

    /**
     * 功能
     */
    @ApiModelProperty("功能")
    private String module;


    /**
     * 租户id
     */
    @ApiModelProperty("租户id")
    private String tenancyId;

}

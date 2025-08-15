package com.lets.platform.model.common.domain;

import com.lets.platform.common.pojo.base.BaseDo;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * @description 大屏数据接口表
 * @author wangjx
 * @date 2022-04-08
 */
@Data
@ApiModel("大屏数据接口表")
public class ReportInterfaceDo extends BaseDo {

    /**
     * 接口名称
     */
    private String name;

    /**
     * 接口地址
     */
    private String url;

    /**
     * 大屏使用 y/n
     */
    private String interfaceKb;

    /**
     * 看板使用 y/n
     */
    private String interfaceReport;

    /**
     * 备注
     */
    private String remark;

    /**
     * 功能
     */
    private String module;

    /**
     * 租户id
     */
    private String tenancyId;

}

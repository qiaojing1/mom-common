package com.lets.platform.model.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Etl任务 展示对象
 * @author: DING WEI
 * @date: 2022/7/6 13:33
 */
@Data
@ApiModel("Etl任务 展示对象")
public class EtlDesignJobVo {

    @ApiModelProperty("主键")
    private String id;

    @ApiModelProperty("设计资源主键")
    private String designId;

    @ApiModelProperty("任务名称")
    private String name;

    @ApiModelProperty("状态 0:停止 1:运行")
    private String status;
    private String statusName;

    @ApiModelProperty("运行方式 1点击执行，2定时执行")
    private String type;

    @ApiModelProperty("定时执行时的cron表达式")
    private String cron;

    @ApiModelProperty("上次运行时间")
    private Long lastRunTime;

    @ApiModelProperty("上次增量截止主键")
    private String lastUpdateId;

    @ApiModelProperty("上次增量截止时间")
    private String lastUpdateTime;

    @ApiModelProperty("创建时间")
    private Long createTime;

    @ApiModelProperty("创建者")
    private String createUser;

    @ApiModelProperty("创建者名称")
    private String createUserName;

    @ApiModelProperty("更新时间")
    private Long updateTime;

    @ApiModelProperty("更新者")
    private String updateUser;

    @ApiModelProperty("更新者名称")
    private String updateUserName;

    @ApiModelProperty("租户主键")
    private String tenancyId;

    @ApiModelProperty(hidden = true)
    private Integer xxlJobTaskId;

}

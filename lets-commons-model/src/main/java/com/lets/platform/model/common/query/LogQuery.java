package com.lets.platform.model.common.query;

import com.lets.platform.common.pojo.base.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Set;

/**
 * @description: 日志查询对象
 * @author: DING WEI
 * @date: 8/18/21 6:08 PM
 */
@Data
@ApiModel("日志查询对象")
public class LogQuery extends PageQuery {

    @ApiModelProperty("开始时间")
    private Long beginTime;

    @ApiModelProperty("结束时间")
    private Long endTime;

    @ApiModelProperty("所属菜单")
    private String belongMenu;

    @ApiModelProperty("登录帐号")
    private String username;

    @ApiModelProperty("用户姓名")
    private String createUserName;

    @ApiModelProperty(hidden = true)
    private Set<String> createUserSet;

    @ApiModelProperty("触发事件")
    private String triggerEvent;

    @ApiModelProperty(hidden = true)
    private String macAddress;
    private String strongPointId;

    @ApiModelProperty(hidden = true)
    private String tenancyId;

}

package com.lets.platform.model.uc.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 用户实体
 * @ClassName SysUserDo
 * @author: DING WEI
 * @create: 2021/04/23 13:50
 * @Version 1.0
 **/
@Data
public class StationSysUserVo {

    private String id;
    private String name;

    private String username;

    private String roleName;
    private String roleType;

    @ApiModelProperty("租户id")
    private String tenancyId;

}
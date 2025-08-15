package com.lets.platform.common.pojo.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @description: 用户数据权限
 * @author: DING WEI
 * @date: 8/23/21 4:13 PM
 */
@Data
@ApiModel("用户数据权限")
public class UserDataPermission implements Serializable {

    private static final long serialVersionUID = 7150479627515026983L;

    @ApiModelProperty("主键")
    private String id;

    @ApiModelProperty("用户主键")
    private String userId;
    @ApiModelProperty(hidden = true)
    private List<String> userIds;

    @ApiModelProperty("组织主键")
    private String orgId;

    @ApiModelProperty("启用停用")
    private String enable;

    @ApiModelProperty("允许下属")
    private String allowChild;

    @ApiModelProperty("开始时间")
    private Long beginTime;

    @ApiModelProperty("截止时间")
    private Long endTime;

    @ApiModelProperty(hidden = true)
    private Long now;
}

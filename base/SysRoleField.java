package com.lets.platform.common.pojo.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 角色字段
 * @author: DING WEI
 * @date: 2022/11/22 15:11
 */
@Data
@ApiModel("角色字段")
public class SysRoleField implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    private String id;

    @ApiModelProperty("角色")
    private String roleId;

    @ApiModelProperty("字段权限主键")
    private String permissionId;

    @ApiModelProperty(value = "租户", hidden = true)
    private String tenancyId;

    @ApiModelProperty(hidden = true)
    private String menuCode;
    @ApiModelProperty(hidden = true)
    private String type;
    @ApiModelProperty(hidden = true)
    private String field;
    /**
     * @see com.lets.platform.common.pojo.enums.JavaFieldTypeEnum
     */
    @ApiModelProperty(hidden = true)
    private String javaType;

}

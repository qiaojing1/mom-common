package com.lets.platform.model.uc.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 人员角色
 * </p>
 *
 * @author DING WEI
 * @since 2023-04-12
 */
@Getter
@Setter
@TableName("sys_user_role")
@ApiModel(value = "SysUserRole对象", description = "人员角色")
public class SysUserRole extends BaseEntity {

    @ApiModelProperty("用户编号")
    @TableField("user_id")
    private String userId;

    @ApiModelProperty("角色id")
    @TableField("role_id")
    private String roleId;

    @TableField(exist = false)
    private String roleName;
}

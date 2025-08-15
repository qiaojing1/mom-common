package com.lets.platform.model.uc.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * <p>
 * 供应商用户分组
 * </p>
 *
 * @author csy
 * @since 2025-03-25
 */
@Getter
@Setter
@TableName("sys_user_group")
@ApiModel(value = "SysUserGroup对象", description = "供应商用户分组")
public class SysUserGroup extends BaseEntity {

    @ApiModelProperty("分组编码")
    @TableField("code")
    private String code;

    @ApiModelProperty("分组名称")
    @TableField("name")
    private String name;

    @TableField("parent_id")
    private String parentId;

    @TableField(exist = false)
    private List<SysUserGroup> children;
}

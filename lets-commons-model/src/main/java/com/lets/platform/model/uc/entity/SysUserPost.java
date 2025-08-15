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

/**
 * <p>
 * 人员岗位关系
 * </p>
 *
 * @author DING WEI
 * @since 2023-06-25
 */
@Getter
@Setter
@TableName("sys_user_post")
@ApiModel(value = "SysUserPost对象", description = "人员岗位关系")
public class SysUserPost extends BaseEntity {

    @ApiModelProperty("用户主键")
    @TableField("user_id")
    private String userId;

    @ApiModelProperty("岗位主键")
    @TableField("post_id")
    private String postId;

    @TableField(exist = false)
    private String postName;
}

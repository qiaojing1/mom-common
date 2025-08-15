package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 班组-人员
 * @author zhangweiyan
 * @since 2024-07-01
 */
@Getter
@Setter
@TableName("common_teams_users")
@ApiModel(value = "CommonTeamsUsers对象", description = "班组-人员")
public class CommonTeamsUsers extends BaseEntity {

    @ApiModelProperty("班组id")
    @TableField("teams_id")
    private String teamsId;
    @TableField(exist = false)
    private String teamsName;

    @ApiModelProperty("人员id")
    @TableField("user_id")
    private String userId;
    @TableField(exist = false)
    private String userName;

    @TableField(exist = false)
    private String loginId;
    @TableField(exist = false)
    private String name;
    @TableField(exist = false)
    private String postNames;
    @TableField(exist = false)
    private String orgName;
}

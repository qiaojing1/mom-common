package com.lets.platform.model.common.entity;

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
 * 班组
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-07-01
 */
@Getter
@Setter
@TableName("common_teams")
@ApiModel(value = "CommonTeams对象", description = "班组")
public class CommonTeams extends BaseEntity {

    @ApiModelProperty("班组编号")
    @TableField("code")
    private String code;

    @ApiModelProperty("班组名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("生产车间")
    @TableField("factory_mode_id")
    private String factoryModeId;
    @TableField(exist = false)
    private String factoryModeName;

    @ApiModelProperty("人数")
    @TableField("number")
    private Integer number;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("单据状态")
    @TableField("enable")
    private Integer enable;
    @TableField(exist = false)
    private String enableName;

    @TableField(exist = false)
    private List<CommonTeamsUsers> users;
}

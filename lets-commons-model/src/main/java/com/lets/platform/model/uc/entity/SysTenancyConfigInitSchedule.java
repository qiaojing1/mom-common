package com.lets.platform.model.uc.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 租户配置初始化进度表
 * @author DING WEI
 * @since 2023-04-23
 */
@Getter
@Setter
@TableName("sys_tenancy_config_init_schedule")
@ApiModel(value = "SysTenancyConfigInitSchedule对象", description = "租户配置初始化进度表")
public class SysTenancyConfigInitSchedule extends BaseEntity {

    @ApiModelProperty("初始化业务标识(唯一)")
    @TableField("code")
    private String code;

    @ApiModelProperty("初始化业务名称")
    @TableField("name")
    private String name;

    @JsonIgnore
    @ApiModelProperty("需要初始化的SQL脚本")
    @TableField("exe_sql")
    private String exeSql;
    @JsonIgnore
    @TableField("json_value")
    private String jsonValue;

    @ApiModelProperty("1:已完成;0:未完成")
    @TableField("status")
    private String status;
    /**
     * @see com.lets.platform.common.pojo.enums.FinishEnum
     */
    @ApiModelProperty("状态名称")
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty(value = "服务名称|所属模块", hidden = true)
    @TableField("server_name")
    private String serverName;

    @JsonIgnore
    @ApiModelProperty(value = "调用地址", hidden = true)
    @TableField("url")
    private String url;

    @JsonIgnore
    @ApiModelProperty(value = "需要回滚的主键", hidden = true)
    @TableField("back_id")
    private String backId;
}

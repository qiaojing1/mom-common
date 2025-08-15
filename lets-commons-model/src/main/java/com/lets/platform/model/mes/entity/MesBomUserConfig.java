package com.lets.platform.model.mes.entity;

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
 * bom中展示方式配置;根据用户存储一个用户一条
 * </p>
 *
 * @author qiaojing
 * @since 2025-01-08
 */
@Getter
@Setter
@TableName("mes_bom_user_config")
@ApiModel(value = "MesBomUserConfig对象", description = "bom中展示方式配置;根据用户存储一个用户一条")
public class MesBomUserConfig extends BaseEntity {

    @ApiModelProperty("用户id")
    @TableField("user_id")
    private String userId;

    @ApiModelProperty("配置值")
    @TableField("config_value")
    private String configValue;
}

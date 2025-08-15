package com.lets.platform.model.common.entity;

import cn.hutool.core.collection.CollUtil;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.uc.entity.SysUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <p>
 * 消息推送配置-推送升级人员阶梯
 * </p>
 *
 * @author csy
 * @since 2024-09-11
 */
@Getter
@Setter
@TableName("common_send_config_upgrade")
@ApiModel(value = "CommonSendConfigUpgrade对象", description = "消息推送配置-推送升级人员阶梯")
public class CommonSendConfigUpgrade extends BaseEntity {

    @ApiModelProperty("持续时间")
    @TableField("duration")
    private Integer duration;

    @ApiModelProperty("通知人员")
    @TableField("users")
    private String users;
    @TableField(exist = false)
    private Set<CommonSendConfigUser> userList;

    @ApiModelProperty("推送配置id")
    @TableField("config_id")
    private String configId;

    public Set<CommonSendConfigUser> getUserList() {
        if (CollUtil.isEmpty(userList)) {
            userList= new HashSet<>();
        }
        return userList;
    }
}

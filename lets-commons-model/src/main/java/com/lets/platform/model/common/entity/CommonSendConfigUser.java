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

import java.util.Objects;

/**
 * <p>
 * 消息推送配置-人员配置
 * </p>
 *
 * @author csy
 * @since 2023-11-30
 */
@Getter
@Setter
@ApiModel(value = "CommonSendConfigUser对象", description = "消息推送配置-人员配置")
public class CommonSendConfigUser extends BaseEntity {

    @ApiModelProperty("人员id")
    private String userId;

    @ApiModelProperty("推送配置id")
    private String configId;

    @ApiModelProperty("人员名称")
    private String userName;
    @ApiModelProperty("系统账号")
    private String loginId;
    @ApiModelProperty("部门名称")
    private String departmentName;
    @ApiModelProperty("角色")
    private String roleName;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommonSendConfigUser that = (CommonSendConfigUser) o;
        return Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), userId);
    }
}

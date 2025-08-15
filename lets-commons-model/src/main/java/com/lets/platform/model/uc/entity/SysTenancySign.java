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
 * 第三方系统配置
 * </p>
 *
 * @author csy
 * @since 2024-03-25
 */
@Getter
@Setter
@TableName("sys_tenancy_sign")
@ApiModel(value = "SysTenancySign对象", description = "第三方系统配置")
public class SysTenancySign extends BaseEntity {

    @ApiModelProperty("租户编码")
    @TableField("tenancy_code")
    private String tenancyCode;

    @ApiModelProperty("密钥")
    @TableField("sign")
    private String sign;

    @ApiModelProperty("第三方名称")
    @TableField("ext_name")
    private String extName;

    @ApiModelProperty("用户ID")
    @TableField("user_id")
    private String userId;

    @ApiModelProperty("用户名称")
    @TableField("user_name")
    private String userName;
}

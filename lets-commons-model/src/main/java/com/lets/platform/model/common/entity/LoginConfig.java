package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 登录页配置
 * </p>
 *
 * @author FZY
 * @since 2023-06-08
 */
@Getter
@Setter
@TableName("login_config")
@ApiModel(value = "LoginConfig对象", description = "登录页配置")
public class LoginConfig {
    @ApiModelProperty("首页大LOGO")
    @TableField("login_logo")
    private String loginLogo;

    @TableField(exist = false)
    private CommonFile loginLogoFile;

    @ApiModelProperty("登录表单上方LOGO")
    @TableField("form_logo")
    private String formLogo;

    @TableField(exist = false)
    private CommonFile formLogoFile;

    @ApiModelProperty("欢迎词")
    @TableField("welcome_word")
    private String welcomeWord;

    @ApiModelProperty("默认租户id")
    @TableField(value = "tenancy_id")
    private String tenancyId;

    @ApiModelProperty("登陆页背景图地址")
    @TableField(value = "video")
    private String video;

    @TableField(exist = false)
    private CommonFile videoFile;

    @ApiModelProperty("默认租户id")
    @TableField(exist = false)
    private String tenancyCode;
}

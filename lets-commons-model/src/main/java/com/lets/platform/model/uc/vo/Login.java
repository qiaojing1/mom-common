package com.lets.platform.model.uc.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

/**
 * <p>
 * 操作用户信息表
 * </p>
 *
 * @author DING WEI
 * @since 2023-04-12
 */
@Getter
@Setter
@ApiModel(value = "登录")
public class Login {
    @NotBlank(message = "login.SysUser.username", groups = {com.lets.platform.common.pojo.valid.Login.class})
    @ApiModelProperty(value = "用户名称",required = true)
    private String username;
    @NotBlank(message = "login.SysUser.password", groups = {com.lets.platform.common.pojo.valid.Login.class})
    @ApiModelProperty(value = "密码",required = true)
    private String password;
    @NotBlank(message = "login.SysUser.tenancyCode", groups = {com.lets.platform.common.pojo.valid.Login.class})
    @ApiModelProperty(value = "租户编码",required = true)
    private String tenancyCode;
    private String clientType;
    /**
     * 工位机MAC地址
     */
    private String macAddress;
    /**
     * 前端登录的时候可能会传过来的ip,如果有的话,后端不自动获取（登陆日志中）
     */
    private String loginIp;
    @JsonProperty(value = "HMICode")
    private String HMICode;
    /**
     * 扫码或刷卡
     */
    private String loginType;
}
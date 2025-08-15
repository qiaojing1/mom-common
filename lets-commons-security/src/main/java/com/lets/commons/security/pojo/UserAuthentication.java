package com.lets.commons.security.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Collection;

/**
 * 用户认证主体对象
 *
 * @Author DING WEI
 * @Date 2021/04/23 13:50
 * @Version 1.0
 **/
@Data
public class UserAuthentication implements Serializable {

    private static final long serialVersionUID = 1582174765048504886L;

    /**
     * 主键
     */
    private String id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号
     */
    private String phoneNumber;

    /**
     * 状态
     */
    private String status;

    /**
     * 名称
     */
    private String name;

    private String deleted;

    /**
     * 租户id
     */
    private String tenancyId;

    private String clientId;

    private String roleId;

    private String roleName;
    /**
     * 角色类型[0超级管理员,1系统管理员,2普通角色]
     */
    private String roleType;
    /**
     * 创建方式[1系统创建 2非系统创建]
     */
    private String createType;

    /**
     * 禁止登录[01]
     */
    private String forbidLogin;
    private String orgId;

    private String supplierId;
    private String supplierName;

    /**
     * 角色集合
     */
    private Collection<String> roles;
}
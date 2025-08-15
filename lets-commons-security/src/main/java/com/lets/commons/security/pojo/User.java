package com.lets.commons.security.pojo;


import java.util.ArrayList;
import java.util.Collection;

/**
 * 用户对象
 * @Author DING WEI
 * @Date 2021/04/23 13:50
 * @Version 1.0
 **/
public class User {

    private static final long serialVersionUID = 1414360047862738902L;

    /**
     * 用户状态，1：正常，0：停用，2: 锁定
     */
    public static final String USER_STATUS_ENABLED = "1";
    public static final String USER_STATUS_DISABLED = "0";
    public static final String USER_STATUS_LOCKED = "2";

    /**
     * 主键
     * */
    private String id;

    /**
     * 用户名
     * */
    private String username;

    /**
     * 密码
     * */
    private String password;

    /**
     * 状态
     * */
    private String status;

    /**
     * 手机号
     * */
    private String phoneNumber;

    /**
     * 邮箱
     * */
    private String email;

    /**
     * 真实姓名
     * */
    private String name;

    /**
     * 公司id
     * */
    private String companyId;

    /**
     * 租户id
     * */
    private String tenancyId;
    /**
     * 租户编码
     * */
    private String tenancyCode;

    /**
     * 角色类型[0超级管理员,1系统管理员,2普通角色]
     * 权限等级 0 > 1 > 2
     * 若系统后续业务改变成一个人拥有多个角色时,此处的角色类型为最大权限的角色类型
     **/
    private String roleType;
    /** 用户创建方式[1系统创建、2非系统创建] */
    private String createType;

    /**
     * 资源集合
     * */
    private Collection<String> resources = new ArrayList<>();

    /**
     * 角色集合
     * */
    private Collection<String> roles = new ArrayList<>();

    /**
     * 权限集合
     * */
//    private Collection<GrantedAuthority> grantedAuthorities;

    /** mom_web;wechat_applet;station_machine */
    private String clientId;
    private Long loginTime;

    /** 工位机MAC地址 */
    private String macAddress;
    /** 登录的ip */
    private String loginIp;
    /** 据点主键 */
    private String strongPointId;
    /** 部门id */
    private String orgId;
    /** 供应商id */
    private String supplierId;

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public Long getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Long loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * 获取当前用户所具有的角色资源集合
     * SimpleGrantedAuthority 是 GrantedAuthority 实现
     * */
////    @Override
////    public Collection<? extends GrantedAuthority> getAuthorities() {
////        if (Objects.isNull(this.grantedAuthorities) && Objects.nonNull(this.roles)) {
////            this.grantedAuthorities = this.getRoles().stream()
////                    .map(role -> new SimpleGrantedAuthority(role))
////                    .collect(Collectors.toList());
////        }
////        return grantedAuthorities;
////    }
//
    public String getPassword() {
        return this.password;
    }
    public String getUsername() {
        return this.username;
    }
    public boolean isAccountNonExpired() {
        return true;
    }
    public boolean isAccountNonLocked() {
        return USER_STATUS_ENABLED.equals(status);
    }
    public boolean isCredentialsNonExpired() {
        return true;
    }
    public boolean isEnabled() {
        return USER_STATUS_ENABLED.equals(status);
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Collection<String> getRoles() {
        return roles;
    }

    public void setRoles(Collection<String> roles) {
        this.roles = roles;
    }

    public Collection<String> getResources() {
        return resources;
    }

    public void setResources(Collection<String> resources) {
        this.resources = resources;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void eraseCredentials() {
        this.password = null;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getTenancyId() {
        return tenancyId;
    }
    public String getTenancyCode() {
        return tenancyCode;
    }

    public void setTenancyId(String tenancyId) {
        this.tenancyId = tenancyId;
    }
    public void setTenancyCode(String tenancyCode) {
        this.tenancyCode = tenancyCode;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getCreateType() {
        return createType;
    }

    public void setCreateType(String createType) {
        this.createType = createType;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public String getStrongPointId() {
        return strongPointId;
    }

    public void setStrongPointId(String strongPointId) {
        this.strongPointId = strongPointId;
    }
}
package com.lets.commons.security.pojo;


import java.io.Serializable;

/**
 * @Author: LY
 * @Date: 2020/5/9 15:41
 */
public class UserDetailInfoVo implements Serializable {
    private String jti;

    private String clientType;

    private UserVo user;

    public String getJti() {
        return jti;
    }

    public void setJti(String jti) {
        this.jti = jti;
    }

    public UserVo getUser() {
        return user;
    }

    public void setUser(UserVo user) {
        this.user = user;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }
}

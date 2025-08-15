package com.lets.platform.model.uc.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by 乔静 on 2019/12/18
 */
@Data
public class StationLoginUserVO implements Serializable {
    private static final long serialVersionUID = 1L;
    //用户ID
    private String userId;
    //登录类型
    private String loginType;
    //登录账号
    private String loginId;
    //密码
    private String password;
    //工位机号
    private String stationNum;
    private String tenancyCode;
    private String loginIp;
    private String macAddress;

}

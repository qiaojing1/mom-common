package com.lets.platform.model.uc.entity;

import com.lets.platform.model.collection.entity.CollectionRangeConfig;
import com.lets.platform.model.common.entity.CommonToleranceValue;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: LY
 * @Date: 2020/5/8 18:05
 */
public class LoginVo implements Serializable {

    private String access_token;

    private SysUserDetailVo userVo;

    //试压客户端客户端升级配置
    @Setter
    @Getter
    private String ipAndPort;
    @Setter
    @Getter
    private String userName;
    @Setter
    @Getter
    private String password;


    @Getter
    @Setter
    private List<CommonToleranceValue> toleranceValues;

    @Getter
    @Setter
    private List<CollectionRangeConfig> rangeConfigs;

    private String token_uuid;

    private List<String> warning = new ArrayList<>();

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public SysUserDetailVo getUserVo() {
        return userVo;
    }

    public void setUserVo(SysUserDetailVo userVo) {
        this.userVo = userVo;
    }

    public String getToken_uuid() {
        return token_uuid;
    }

    public void setToken_uuid(String token_uuid) {
        this.token_uuid = token_uuid;
    }

    public List<String> getWarning() {
        return warning;
    }

    public void setWarning(List<String> warning) {
        this.warning = warning;
    }
}
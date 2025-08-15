package com.lets.platform.common.pojo.base;

import org.springframework.util.StringUtils;

import javax.validation.constraints.NotNull;

/**
 * @Author: qiao jing
 * 单参数描述，具备对象映射能力，以达到参数交互的目的
 * @Date: 2020/5/25 11:09
 */
public class BaseParam <T> {

    private String keyName;
    private String displayName;
    private T t;

    /*
    * displayName 为空时与keyName相同
    * */
    public  BaseParam(@NotNull String keyName, String displayName, T t){
        this.keyName = keyName;
        this.displayName = StringUtils.isEmpty(displayName) ?  keyName: displayName;
        this.t = t;
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

package com.lets.platform.common.pojo.base;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @Author: gm
 * @Date: 2022/6/20 15:52
 */
public class SoapEntity implements Serializable {

    private static final long serialVersionUID = 5375692319290002075L;

    private List<SoapEntity> childs;

    private String prefix;//属性前缀

    private String tag;//标签

    private String value;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<SoapEntity> getChilds() {
        return childs;
    }

    public void setChilds(List<SoapEntity> childs) {
        this.childs = childs;
    }
}

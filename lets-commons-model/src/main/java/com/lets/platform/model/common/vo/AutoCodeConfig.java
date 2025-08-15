package com.lets.platform.model.common.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

/**
 * 编码规则配置
 */
@Getter
@Setter
public class AutoCodeConfig {
    boolean isAutoCode;
    Set<String> fieldKeys;

    public AutoCodeConfig() {
        this.isAutoCode = false;
        this.fieldKeys = new HashSet<>();
    }

    public AutoCodeConfig(boolean isAutoCode) {
        this.isAutoCode = isAutoCode;
        this.fieldKeys = new HashSet<>();
    }
}

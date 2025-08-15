package com.lets.platform.common.pojo.enums;

import lombok.Getter;

/**
 * I18n国际化 类型
 * @author DING WEI
 * @date 2023/4/14 17:05
 * @version 1.0
 */
@Getter
public enum I18nTypeEnum implements IEnum<String> {

    EN_US("en-US", "英文"),
    ZH_CH("zh-CN", "中文"),
    JA_JP("ja-JP", "日文"),
    ;

    private final String code;
    private final String name;

    private I18nTypeEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public String getValue() {
        return code;
    }
}

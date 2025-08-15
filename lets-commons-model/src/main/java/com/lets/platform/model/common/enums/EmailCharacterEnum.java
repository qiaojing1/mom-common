package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;

/**
 * 邮件编码 枚举
 *
 * @ClassName EmailCharacterEnum
 * @author: QIAO
 * @create: 2021/08/17 13:32
 * @Version 1.0
 **/
public enum EmailCharacterEnum implements IEnum<Object> {

    UTF8("1", "国际化编码(utf8)"),
    JTZW("2", "简体中文"),
    FTZW("3", "繁体中文"),;

    private String value;

    private String source;

    EmailCharacterEnum(String value, String source) {
        this.value = value;
        this.source = source;
    }

    @Override
    public String getValue() {
        return value;
    }
}

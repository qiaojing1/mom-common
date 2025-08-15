package com.lets.platform.common.pojo.enums;

/**
 * 默认查询类型
 * @author DING WEI
 * @date 2023/8/25 13:48
 * @version 1.0
 */
public enum DefaultSelectTypeEnum implements IEnum<Object> {

    DEFAULT_PAGE("defaultPage", "默认分页"),
    DEFAULT_LIST("defaultList", "默认列表"),
    DEFAULT_NULL("defaultNull", "默认"),
    ;

    private final String value;

    private final String source;

    DefaultSelectTypeEnum(String value, String source) {
        this.value = value;
        this.source = source;
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getSource() {
        return source;
    }
}

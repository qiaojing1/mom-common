package com.lets.platform.model.device.enums;

import com.lets.platform.common.pojo.enums.IEnum;

/**
 * 方法来源 枚举
 *
 * @ClassName MethodSourceEnum
 * @author: DING WEI
 * @create: 2021/04/27 13:32
 * @Version 1.0
 **/
public enum MethodSourceEnum implements IEnum<Object> {

    SAVE("save", "保存"),
    UPDATE("update", "更新"),
    DELETE("delete", "删除");

    private String value;

    private String source;

    MethodSourceEnum(String value, String source) {
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

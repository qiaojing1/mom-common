package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;


/**
 * 上下 枚举
 *
 * @ClassName UpOrDownEnum
 * @author: QIAO
 * @create: 2021/08/20 15:45
 * @Version 1.0
 **/
public enum UpOrDownEnum implements IEnum<Object> {

    UP("0", "上"),
    DOWN("1", "下"),
    ;

    private String value;

    private String source;

    UpOrDownEnum(String value, String source) {
        this.value = value;
        this.source = source;
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getName() {
        return source;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (UpOrDownEnum element : UpOrDownEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue().toString();
            }
        }
        return null;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (UpOrDownEnum element : UpOrDownEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }
}

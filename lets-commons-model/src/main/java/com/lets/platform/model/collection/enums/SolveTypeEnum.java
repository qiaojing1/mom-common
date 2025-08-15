package com.lets.platform.model.collection.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 处理方式 枚举
 *
 * @ClassName SolveTypeEnum
 * @author: zhangweiyan
 * @create: 2024/12/03 13:32
 * @Version 1.0
 **/
public enum SolveTypeEnum implements IEnum<Object> {

    REPAIR("1", "维修"),
    MAINTENANCE("2", "保养"),
    NOTHING("3", "不做处理"),
    ;

    private String value;

    private String name;

    SolveTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String getValue() {
        return value;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (SolveTypeEnum element : SolveTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (SolveTypeEnum element : SolveTypeEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }
}

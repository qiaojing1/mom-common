package com.lets.platform.model.psi.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 容器类型 枚举 @ClassName ResetPeriodEnum
 *
 * @author: QIAO
 * @create: 2021/08/18 08:45 @Version 1.0
 */
public enum ContainerCodeStatusEnum implements IEnum<Object> {
    AVAILABLE(0, "未使用"),
    USING(1, "使用中"),
    SCRAPE(2, "已作废"),
    ;

    private final Integer value;

    private final String name;

    ContainerCodeStatusEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Integer getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ContainerCodeStatusEnum element : ContainerCodeStatusEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static boolean containsName(String name) {
        if (StringUtils.isEmpty(name)) {
            return false;
        }
        for (ContainerCodeStatusEnum element : ContainerCodeStatusEnum.values()) {
            if (name.equals(element.getName())) {
                return true;
            }
        }
        return false;
    }

    public static String getName(Integer value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (ContainerCodeStatusEnum element : ContainerCodeStatusEnum.values()) {
            if (value == element.getValue()) {
                return element.getName();
            }
        }
        return null;
    }

    public boolean equals(Integer value) {
        return this.value.equals(value);
    }

    @Override
    public Integer getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}

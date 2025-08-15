package com.lets.platform.model.psi.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 * 容器类型 枚举 @ClassName ResetPeriodEnum
 *
 * @author: QIAO
 * @create: 2021/08/18 08:45 @Version 1.0
 */
public enum ContainerTypeEnum implements IEnum<Object> {
    PLATE(1, "托盘"),
    BOX(2, "包装箱"),
    TRANS(3, "转运容器"),
    ;

    private final Integer value;

    @Getter
    private final String name;

    ContainerTypeEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Integer getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ContainerTypeEnum element : ContainerTypeEnum.values()) {
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
        for (ContainerTypeEnum element : ContainerTypeEnum.values()) {
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
        for (ContainerTypeEnum element : ContainerTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    public boolean equals(Integer value) {
        return this.value.equals(value);
    }
}

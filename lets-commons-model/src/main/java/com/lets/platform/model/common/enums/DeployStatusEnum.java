package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 * 发布状态 枚举
 */
public enum DeployStatusEnum implements IEnum<Integer> {

    NOT_DEPLOY(0, "未发布"),
    DEPLOY(1, "已发布");

    private final Integer value;

    @Getter
    private final String name;

    DeployStatusEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Integer getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (DeployStatusEnum element : DeployStatusEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static String getName(Integer value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (DeployStatusEnum element : DeployStatusEnum.values()) {
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
}

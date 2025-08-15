package com.lets.platform.model.psi.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * @author zhangweiyan
 * @EnumName TransferDirection
 * @Description 调拨方向枚举
 * @Date 2024/3/5 15:11
 **/
public enum TransferDirection implements IEnum<Object> {
    SEND_OUT("1", "发出"),
    SEND_BACK("2", "退回")
    ;

    private final String value;

    private final String name;

    TransferDirection(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (TransferDirection element : TransferDirection.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }


    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (TransferDirection element : TransferDirection.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static boolean containsValue(String value) {
        if (StrUtil.isEmpty(value)) {
            return false;
        }
        for (TransferDirection element : TransferDirection.values()) {
            if (value.equals(element.getValue())) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsName(String name) {
        if (StrUtil.isEmpty(name)) {
            return false;
        }
        for (TransferDirection element : values()) {
            if (name.equals(element.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}

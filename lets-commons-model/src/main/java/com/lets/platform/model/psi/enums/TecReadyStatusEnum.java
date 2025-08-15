package com.lets.platform.model.psi.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * @ClassName TestStatusEnum
 * @Description 试压工单试压状态
 * @Author CHEN SHAOYONG
 * @Date 2024/2/20
 */
public enum TecReadyStatusEnum implements IEnum<Object> {
    NOT_START("0", "未开始"),
    ING("1", "进行中"),
    DONE("2", "已完成"),
            ;

    private String value;

    private String name;

    TecReadyStatusEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (TecReadyStatusEnum element : TecReadyStatusEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    @Override
    public String getValue() {
        return value;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (TecReadyStatusEnum element : TecReadyStatusEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static boolean containsName(String name) {
        if (StringUtils.isEmpty(name)) {
            return false;
        }
        for (TecReadyStatusEnum element : TecReadyStatusEnum.values()) {
            if (name.equals(element.getName())) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }
}

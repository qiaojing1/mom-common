package com.lets.platform.model.psi.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 确认状态
 * @author DING WEI
 * @date 2025/3/28 14:23
 * @version 1.0
 */
public enum ConfirmStatusEnum implements IEnum<Object> {

    NOT_CONFIRM("0", "未确认"),
    YES_CONFIRM("1", "已确认"),

    ;

    private String value;

    private String name;

    ConfirmStatusEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ConfirmStatusEnum element : ConfirmStatusEnum.values()) {
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
        for (ConfirmStatusEnum element : ConfirmStatusEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getAllName() {
        List<String> allName = new ArrayList<>();
        allName.add(NOT_CONFIRM.getName());
        allName.add(YES_CONFIRM.getName());
        return allName;
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

}

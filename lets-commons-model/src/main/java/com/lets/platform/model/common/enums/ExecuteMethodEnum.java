package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import com.lets.platform.model.psi.enums.IsOrNotEnum;
import org.springframework.util.StringUtils;


/**
 * 用户数据字典类型
 * @author DING WEI
 * @date 2023/7/15 9:06
 * @version 1.0
 */
public enum ExecuteMethodEnum implements IEnum<Object> {

    ONLINE("1", "在线加工"),
    LOCAL("2", "本地加工"),
    ;

    private String value;

    private String name;

    ExecuteMethodEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ExecuteMethodEnum element : values()) {
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
        for (ExecuteMethodEnum element : values()) {
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
        for (ExecuteMethodEnum element : ExecuteMethodEnum.values()) {
            if (name.equals(element.getName())) {
                return true;
            }
        }
        return false;
    }
}

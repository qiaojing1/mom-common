package com.lets.platform.model.mes.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 缺陷等级
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/11/7 17:16
 */
public enum AdverseLevelEnum implements IEnum<Object> {

    SERIOUS("1", "严重缺陷"),
    SLIGHT("2", "轻微缺陷"),
    FATAL("3", "致命缺陷"),

    ;

    private final String value;

    @Getter
    private final String name;

    AdverseLevelEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (AdverseLevelEnum element : AdverseLevelEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static String getName(String value) {
        if (StrUtil.isEmpty(value)) {
            return null;
        }
        for (AdverseLevelEnum element : AdverseLevelEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getAllNames() {
        List<String> names = new ArrayList<>();
        for (AdverseLevelEnum element : AdverseLevelEnum.values()) {
            names.add(element.name);
        }
        return names;
    }

    public static boolean containsName(String name) {
        if (!StringUtils.isEmpty(name)) {
            AdverseLevelEnum[] var = values();
            for (AdverseLevelEnum element : var) {
                if (name.equals(element.getName())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String getValue() {
        return value;
    }
}

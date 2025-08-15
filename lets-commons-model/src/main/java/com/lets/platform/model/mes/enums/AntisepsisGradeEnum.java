package com.lets.platform.model.mes.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 防腐等级
 *
 */
public enum AntisepsisGradeEnum implements IEnum<Object> {

    NORMAL("1", "普通级"),
    STRENGTHEN("2", "加强级"),
    SUPER_STRENGTHEN("3", "特加强级"),

    ;

    private final String value;

    @Getter
    private final String name;

    AntisepsisGradeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (AntisepsisGradeEnum element : AntisepsisGradeEnum.values()) {
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
        for (AntisepsisGradeEnum element : AntisepsisGradeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getAllNames() {
        List<String> names = new ArrayList<>();
        for (AntisepsisGradeEnum element : AntisepsisGradeEnum.values()) {
            names.add(element.name);
        }
        return names;
    }

    public static boolean containsName(String name) {
        if (!StringUtils.isEmpty(name)) {
            AntisepsisGradeEnum[] var = values();
            for (AntisepsisGradeEnum element : var) {
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

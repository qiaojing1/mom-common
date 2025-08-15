package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 巡检状态
 *
 * @author DING WEI
 * @version 1.0
 * @date 2025/08/7 17:16
 */
public enum InspectionStatusEnum implements IEnum<Object> {

    ERROR(0, "质量异常"),
    NORMAL(1, "正常"),

    ;

    private final Integer value;

    @Getter
    private final String name;

    InspectionStatusEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Integer getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (InspectionStatusEnum element : InspectionStatusEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static String getName(Integer value) {
        if (Objects.isNull(value)) {
            return null;
        }
        for (InspectionStatusEnum element : InspectionStatusEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getAllNames() {
        List<String> names = new ArrayList<>();
        for (InspectionStatusEnum element : InspectionStatusEnum.values()) {
            names.add(element.name);
        }
        return names;
    }

    public static boolean containsName(String name) {
        if (!StringUtils.isEmpty(name)) {
            InspectionStatusEnum[] var = values();
            for (InspectionStatusEnum element : var) {
                if (name.equals(element.getName())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Integer getValue() {
        return value;
    }
}

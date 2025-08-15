package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;


/**
 * 单据状态
 */
public enum ProjectStatusEnum implements IEnum<Object> {

    NOT_PRODUCTION(0, "未排产"),
    NOT_EXECUTED(1, "未执行"),
    IN_PROGRESS(2, "执行中"),
    COMPLETED(3, "已完工"),
    SHIPPED(4, "已发货"),
    ACCEPTANCE(5, "已验收"),
    WARRANTY_EXPIRED(6, "质保期满");;

    private final Integer value;

    @Getter
    private final String name;

    ProjectStatusEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Integer getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ProjectStatusEnum element : values()) {
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
        for (ProjectStatusEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static ProjectStatusEnum getSelf(Integer value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (ProjectStatusEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element;
            }
        }
        return null;
    }

    public static List<Integer> getValues() {
        List<Integer> values = new ArrayList<>();
        for (ProjectStatusEnum element : values()) {
            values.add(element.getValue());
        }
        return values;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    public String getValueStr() {
        return String.valueOf(value);
    }


    public boolean equals(Integer value) {
        return this.value.equals(value);
    }
}

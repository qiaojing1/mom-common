package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 生产工单合并类型[1按数量增补]
 *
 * @author DING WEI
 * @version 1.0
 * @date 2024/5/31 13:40
 */
public enum ProduceMergeTypeEnum implements IEnum<Object> {

    NUMBER(1, "按数量增补"),
    ;

    private final Integer value;

    @Getter
    private final String name;

    ProduceMergeTypeEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Integer getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ProduceMergeTypeEnum element : ProduceMergeTypeEnum.values()) {
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
        for (ProduceMergeTypeEnum element : ProduceMergeTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static boolean containsName(String name) {
        if (!StringUtils.isEmpty(name)) {
            for (ProduceMergeTypeEnum element : values()) {
                if (name.equals(element.getName())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static List<String> getNames() {
        return Arrays.stream(values()).map(ProduceMergeTypeEnum::getName).collect(Collectors.toList());
    }

    @Override
    public Integer getValue() {
        return value;
    }

    public boolean equals(Integer value) {
        return this.value.equals(value);
    }

}

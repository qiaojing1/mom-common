package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 * 抽样严格程度 [1:正常;2:放宽;3:加严]
 */
public enum SamplingRigorLevelEnum implements IEnum<String> {
    NORMAL("1", "正常"),
    RELAX("2", "放宽"),
    TIGHTEN_UP("3", "加严"),
    ;

    private final String value;

    @Getter
    private final String name;

    SamplingRigorLevelEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (SamplingRigorLevelEnum element : SamplingRigorLevelEnum.values()) {
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
        for (SamplingRigorLevelEnum element : SamplingRigorLevelEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }


    @Override
    public String getValue() {
        return value;
    }

    public boolean equals(String value) {
        return this.value.equals(value);
    }

}

package com.lets.platform.model.psi.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 * 报价采纳状态[0:未采纳,1:已采纳]
 * @author DING WEI
 * @date 2025/3/28 11:14
 * @version 1.0
 */
public enum QuoteAdoptStatusEnum implements IEnum<Object> {

    IS(1, "已采纳"),
    NOT(0, "未采纳");

    private final Integer value;

    @Getter
    private final String name;

    QuoteAdoptStatusEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Integer getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (QuoteAdoptStatusEnum element : QuoteAdoptStatusEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static Integer getIntegerValue(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (QuoteAdoptStatusEnum element : QuoteAdoptStatusEnum.values()) {
            if (Integer.valueOf(value).equals(element.getValue())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static Integer getValue(Boolean isOrNot) {
        if (isOrNot) {
            return IS.getValue();
        } else {
            return NOT.getValue();
        }
    }

    public static String getName(Integer value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (QuoteAdoptStatusEnum element : QuoteAdoptStatusEnum.values()) {
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
        for (QuoteAdoptStatusEnum element : QuoteAdoptStatusEnum.values()) {
            if (name.equals(element.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    public boolean equals(Integer value) {
        return this.value.equals(value);
    }

    public boolean equals(String value) {
        return this.value.toString().equals(value);
    }

}

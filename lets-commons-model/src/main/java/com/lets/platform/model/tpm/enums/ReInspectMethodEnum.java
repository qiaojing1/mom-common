package com.lets.platform.model.tpm.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 复检方式[1:全部复检,2:按周期随机复检]
 * @author DING WEI
 * @date 2024/12/24 16:01
 * @version 1.0
 */
public enum ReInspectMethodEnum implements IEnum<Object> {

    ALL("1","全部复检"),
    RANDOM("2","按周期随机复检"),
    ;

    private String value;

    private String name;

    ReInspectMethodEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ReInspectMethodEnum element : ReInspectMethodEnum.values()) {
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
        for (ReInspectMethodEnum element : ReInspectMethodEnum.values()) {
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


    public String getName() {
        return name;
    }

}

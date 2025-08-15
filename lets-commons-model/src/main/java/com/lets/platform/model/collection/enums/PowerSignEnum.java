package com.lets.platform.model.collection.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 电标识（尖峰平谷）
 * @author DING WEI
 * @date 2022/12/3 14:26
 * @version 1.0
 */
public enum PowerSignEnum implements IEnum<Object> {

    TIP("1", "尖"),
    PEAK("2", "峰"),
    FLAT("3", "平"),
    VALLEY("4", "谷"),
    ;

    private String value;

    private String name;

    PowerSignEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String getValue() {
        return value;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (PowerSignEnum element : PowerSignEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }
}

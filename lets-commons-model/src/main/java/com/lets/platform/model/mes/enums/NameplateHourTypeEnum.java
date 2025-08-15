package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 * 额定工时任务分类
 *
 * @author Qiao
 * @version 1.0
 * @date 9/17/21 10:52
 */
public enum NameplateHourTypeEnum implements IEnum<Object> {

    machinery("1", "机械装配"),
    electrical("2", "电气装配"),
    scene("3", "现场安调"),
    server("4", "服务质保"),
    other("5", "厂内其他"),
    ;

    private final String value;

    @Getter
    private final String name;

    NameplateHourTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (NameplateHourTypeEnum element : NameplateHourTypeEnum.values()) {
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
        for (NameplateHourTypeEnum element : NameplateHourTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static NameplateHourTypeEnum getSelf(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (NameplateHourTypeEnum element : NameplateHourTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element;
            }
        }
        return null;
    }

    public static boolean containName(String value) {
        if (StringUtils.isEmpty(value)) {
            return false;
        }
        for (NameplateHourTypeEnum element : NameplateHourTypeEnum.values()) {
            if (value.equals(element.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getValue() {
        return value;
    }


    public boolean equals(String value) {
        return this.value.equals(value);
    }

}

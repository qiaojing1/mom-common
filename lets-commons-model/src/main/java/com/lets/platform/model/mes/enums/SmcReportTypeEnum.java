package com.lets.platform.model.mes.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 报工类型
 *
 * @author csy
 * @version 1.0
 * @date 2024/7/11
 */
public enum SmcReportTypeEnum implements IEnum<Object> {

    NAMEPLATE("1", "额定工时"),
    NON_PROJECT("2", "非项目工时"),
    SERVER("3", "服务质保工时"),

    ;

    private final String value;

    @Getter
    private final String name;

    SmcReportTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (SmcReportTypeEnum element : SmcReportTypeEnum.values()) {
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
        for (SmcReportTypeEnum element : SmcReportTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static SmcReportTypeEnum getSelf(String value) {
        if (StrUtil.isEmpty(value)) {
            return null;
        }
        for (SmcReportTypeEnum element : SmcReportTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element;
            }
        }
        return null;
    }

    public static List<String> getAllNames() {
        List<String> names = new ArrayList<>();
        for (SmcReportTypeEnum element : SmcReportTypeEnum.values()) {
            names.add(element.name);
        }
        return names;
    }

    public static boolean containsName(String name) {
        if (!StringUtils.isEmpty(name)) {
            SmcReportTypeEnum[] var = values();
            for (SmcReportTypeEnum element : var) {
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

    public boolean equals(String value) {
        return this.value.equals(value);
    }
}

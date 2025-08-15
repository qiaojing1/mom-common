package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 安装包类型
 * @author DING WEI
 * @date 2024/1/15 16:55
 * @version 1.0
 */
public enum InstallPackageTypeEnum implements IEnum<Object> {

    WORKSTATION_MACHINE("1", "工位机"),
    PDA("2", "手持终端"),
    ;

    private String value;

    private String name;

    InstallPackageTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (InstallPackageTypeEnum element : InstallPackageTypeEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue().toString();
            }
        }
        return null;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (InstallPackageTypeEnum element : InstallPackageTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }
}

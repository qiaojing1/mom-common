package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;


/**
 * 打印导出 枚举
 * @author DING WEI
 * @date 2023/10/20 11:02
 * @version 1.0
 */
public enum PrintTypeEnum implements IEnum<Object> {

    PRINT("1", "直接打印"),
    EXPORT("2", "导出文件"),
    BARTENDER("3", "Bartender打印"),
    ;

    private String value;

    private String source;

    PrintTypeEnum(String value, String source) {
        this.value = value;
        this.source = source;
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getName() {
        return source;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (PrintTypeEnum element : PrintTypeEnum.values()) {
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
        for (PrintTypeEnum element : PrintTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }
}

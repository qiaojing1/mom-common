package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;


/**
 * 打印模板 枚举
 * @author DING WEI
 * @date 2023/10/20 11:02
 * @version 1.0
 */
public enum PrintTemplateTypeEnum implements IEnum<Object> {

    MAIN(1, "主模板"),
    SUB(2, "子模板"),
    ;

    private int value;

    private String source;

    PrintTemplateTypeEnum(int value, String source) {
        this.value = value;
        this.source = source;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    public String getName() {
        return source;
    }

    public static int getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return 0;
        }
        for (PrintTemplateTypeEnum element : PrintTemplateTypeEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return 0;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (PrintTemplateTypeEnum element : PrintTemplateTypeEnum.values()) {
            if (value.equals(element.getValue().toString())) {
                return element.getName();
            }
        }
        return null;
    }
}

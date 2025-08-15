package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 导出-模板 变量类型 枚举
 * @author DING WEI
 * @date 2022/9/20 17:33
 * @version 1.0
 */
public enum ExportTemplateVariableTypeEnum implements IEnum<Object> {

    TEXT("1", "文本"),
    QR_CODE("2", "二维码"),
    BAR_CODE("3", "条形码"),
    IMAGE("4", "图片"),
    OTHER_TEMPLATE("5", "其他模板"),
    ;

    private String value;

    private String name;

    ExportTemplateVariableTypeEnum(String value, String name) {
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
        for (ExportTemplateVariableTypeEnum element : ExportTemplateVariableTypeEnum.values()) {
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
        for (ExportTemplateVariableTypeEnum element : ExportTemplateVariableTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }
}
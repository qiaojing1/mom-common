package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 导出-模板 变量来源 枚举
 * @author DING WEI
 * @date 2022/9/20 17:33
 * @version 1.0
 */
public enum ExportTemplateVariableSourceEnum implements IEnum<Object> {

    MAIN_FORM_FIELD("1", "主表单字段"),
    CHILD_FORM_FIELD("2", "子表单字段"),
    TENANCY_FIELD("3", "企业字段"),
    OTHER_TEMPLATE("4", "其他模板"),
    CONSTANT("5", "固定值"),
    MATERIAL("6", "物料字段"),
    SPECIFIC("7", "物料特征属性"),
    ;

    private String value;

    private String name;

    ExportTemplateVariableSourceEnum(String value, String name) {
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
        for (ExportTemplateVariableSourceEnum element : ExportTemplateVariableSourceEnum.values()) {
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
        for (ExportTemplateVariableSourceEnum element : ExportTemplateVariableSourceEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }
}

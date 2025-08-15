package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 导出-模板 状态 枚举
 * @author DING WEI
 * @date 2022/9/20 17:33
 * @version 1.0
 */
public enum ExportTemplateStatusEnum implements IEnum<Object> {

    NOT_PUBLISH("0", "未发布"),
    PUBLISH_ED("1", "已发布");

    private String value;

    private String name;

    ExportTemplateStatusEnum(String value, String name) {
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
        for (ExportTemplateStatusEnum element : ExportTemplateStatusEnum.values()) {
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
        for (ExportTemplateStatusEnum element : ExportTemplateStatusEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }
}

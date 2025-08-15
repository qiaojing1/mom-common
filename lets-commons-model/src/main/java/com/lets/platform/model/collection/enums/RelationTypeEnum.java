package com.lets.platform.model.collection.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 首页配置关联类型 枚举
 *
 * @ClassName RelationTypeEnum
 * @author: QIAO JING
 * @create: 2021/12/07 13:32
 * @Version 1.0
 **/
public enum RelationTypeEnum implements IEnum<Object> {

    EXAMPLE_FORMULA("1", "生产单元"),
    TEMPLATE_FORMULA("2", "网关"),
    INSTANCE_FORMULA("3", "其他"),
    ;

    private String value;

    private String name;

    RelationTypeEnum(String value, String name) {
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
        for (RelationTypeEnum element : RelationTypeEnum.values()) {
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

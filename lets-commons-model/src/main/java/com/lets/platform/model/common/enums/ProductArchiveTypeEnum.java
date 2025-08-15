package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 产品打印类型
 * @author DING WEI
 * @date 2024/9/18 15:47
 * @version 1.0
 */
public enum ProductArchiveTypeEnum implements IEnum<Object> {

    ALL("1", "全部"),
    ORDER("2", "单据"),
    ENCLOSURE("3", "单据附件"),
    ;

    private String value;

    private String name;

    ProductArchiveTypeEnum(String value, String name) {
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
        for (ProductArchiveTypeEnum element : ProductArchiveTypeEnum.values()) {
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
        for (ProductArchiveTypeEnum element : ProductArchiveTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }
}

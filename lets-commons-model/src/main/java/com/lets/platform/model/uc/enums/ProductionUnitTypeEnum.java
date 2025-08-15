package com.lets.platform.model.uc.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 生产车间类型
 *
 * @author FZY
 * @version 1.0
 * @date 2023/6/9 17:55
 **/
public enum ProductionUnitTypeEnum implements IEnum<Object> {

    FACTORY("1", "工厂"),
    WORKSHOP("2", "车间"),
    PRODUCTION_LINE("3", "产线"),
    STATION("4", "工位");

    private final String value;
    private final String name;

    ProductionUnitTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (ProductionUnitTypeEnum element : ProductionUnitTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ProductionUnitTypeEnum element : ProductionUnitTypeEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static String getNames() {
        String[] names = new String[ProductionUnitTypeEnum.values().length];
        for (int i = 0; i < ProductionUnitTypeEnum.values().length; i++) {
            names[i] = ProductionUnitTypeEnum.values()[i].getName();
        }
        return String.join(",", names);
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}

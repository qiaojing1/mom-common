package com.lets.platform.model.mes.enums.produceOrder;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 产品类型
 * @author DING WEI
 * @date 2023/11/7 17:16
 * @version 1.0
 */
public enum ProductTypeEnum implements IEnum<Object> {

    MAIN("1", "主产品"),

    ;

    private String value;

    private String name;

    ProductTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ProductTypeEnum element : ProductTypeEnum.values()) {
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
        for (ProductTypeEnum element : ProductTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getAllName() {
        List<String> allName = new ArrayList<>();
        allName.add(MAIN.getName());
        return allName;
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

}

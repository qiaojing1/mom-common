package com.lets.platform.model.mes.enums.produceOrder;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 原料齐套状态
 * @author DING WEI
 * @date 2023/11/7 17:16
 * @version 1.0
 */
public enum MaterialKittingEnum implements IEnum<Object> {

    NOT_KITTING("0", "未齐套"),
    YES_KITTING("1", "已齐套"),

    ;

    private String value;

    private String name;

    MaterialKittingEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (MaterialKittingEnum element : MaterialKittingEnum.values()) {
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
        for (MaterialKittingEnum element : MaterialKittingEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getAllName() {
        List<String> allName = new ArrayList<>();
        allName.add(NOT_KITTING.getName());
        allName.add(YES_KITTING.getName());
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

package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ProcessType
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2023/11/6
 */
public enum CommonProcessTypeEnum implements IEnum<Object> {
    PROCESSING("1","加工"),
    PACKAGE("2","包装"),
    OUT_SOURCE("3","委外"),
    INSPECT("4","检验"),
    STOCK_IN("5","油漆"),
    STOCK_OUT("6","出库"),
    Mechanical_assembly("7","机械装配"),
    Electrical_assembly("8","电气装配"),
    Supplement("9","增补"),
    Maintenance("10","维保"),
    Scene("11","现场"),
    Others("12","其他"),
    DETECT("13","试压"),
    ;



    private String value;
    private String name;

    CommonProcessTypeEnum(String value, String name){
        this.name=name;
        this.value=value;
    }
    @Override
    public Object getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (CommonProcessTypeEnum element : CommonProcessTypeEnum.values()) {
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
        for (CommonProcessTypeEnum element : CommonProcessTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getAllName() {
        List<String> result = new ArrayList<>();
        for (CommonProcessTypeEnum element : CommonProcessTypeEnum.values()) {
            result.add(element.getName());
        }
        return result;
    }
}

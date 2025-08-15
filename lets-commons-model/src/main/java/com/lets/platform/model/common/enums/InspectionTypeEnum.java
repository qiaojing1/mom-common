package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 自制检验类型
 * @author DING WEI
 * @date 2025/4/28 13:33
 * @version 1.0
 */
public enum InspectionTypeEnum implements IEnum<Object> {

    SELF("1","自检"),
    PQC("2","PQC"),
    SIPQC("3","SIPQC"),
    ;

    private String value;
    private String name;

    InspectionTypeEnum(String value, String name){
        this.name=name;
        this.value=value;
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
        for (InspectionTypeEnum element : InspectionTypeEnum.values()) {
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
        for (InspectionTypeEnum element : InspectionTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }


    public static List<String> getAllName() {
        List<String> result = new ArrayList<>();
        for (InspectionTypeEnum element : InspectionTypeEnum.values()) {
            result.add(element.getName());
        }
        return result;
    }
}

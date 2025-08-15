package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 缺陷等级
 * @author DING WEI
 * @date 2023/11/7 17:16
 * @version 1.0
 */
public enum DefectConsequenceEnum implements IEnum<Object> {

    FIXABLE("1", "可修复"),
    NOT_FIXABLE("2", "不可修复"),
    SCRAP("3", "报废"),
    ACCEPTABLE("4", "可接受"),
    ;

    private String value;

    private String name;

    DefectConsequenceEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (DefectConsequenceEnum element : DefectConsequenceEnum.values()) {
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
        for (DefectConsequenceEnum element : DefectConsequenceEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getAllNames() {
        List<String> names = new ArrayList<>();
        for (DefectConsequenceEnum element : DefectConsequenceEnum.values()) {
            names.add(element.name);
        }
        return names;
    }


    @Override
    public String getValue() {
        return value;
    }


    public String getName() {
        return name;
    }

}

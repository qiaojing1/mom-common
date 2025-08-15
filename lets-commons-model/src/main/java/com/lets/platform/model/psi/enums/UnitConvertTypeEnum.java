package com.lets.platform.model.psi.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 单位转换类型
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/7/11 9:15
 */
public enum UnitConvertTypeEnum implements IEnum<Object> {

    REGULAR("1", "固定"), SWIM("2", "浮动"),
    ;
    // TODO 其他表字段

    private final String value;

    @Getter
    private final String name;

    UnitConvertTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (UnitConvertTypeEnum element : values()) {
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
        for (UnitConvertTypeEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getAllName() {
        List<String> allName = new ArrayList<>();
        for (UnitConvertTypeEnum element : values()) {
            allName.add(element.getName());
        }
        return allName;
    }

    public static boolean containsName(String name) {
        if (StrUtil.isEmpty(name)) {
            return false;
        }
        boolean res = false;
        for (UnitConvertTypeEnum element : UnitConvertTypeEnum.values()) {
            if (name.equals(element.getName())) {
                res = true;
                break;
            }
        }
        return res;
    }

    @Override
    public String getValue() {
        return value;
    }
}
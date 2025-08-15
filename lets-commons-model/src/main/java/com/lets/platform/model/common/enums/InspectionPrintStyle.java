package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 自动线类型 1单工序产线、2流水产线、3混合产线
 * @author DING WEI
 * @date 2024/7/2 14:03
 * @version 1.0
 */
public enum InspectionPrintStyle implements IEnum<Object> {

    NORMAL("1", "普通"),
    LINE_ROW_CONVERSION("2", "行列转换"),
    ALL_MAIN_TABLE("3", "全部主表"),
    ;

    private String value;

    private String name;

    InspectionPrintStyle(String value, String name) {
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
        for (InspectionPrintStyle element : InspectionPrintStyle.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static InspectionPrintStyle getByValue(String value) {
        if (StringUtils.isEmpty(value)) {
            return NORMAL;
        }
        for (InspectionPrintStyle element : InspectionPrintStyle.values()) {
            if (value.equals(element.getValue())) {
                return element;
            }
        }
        return NORMAL;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (InspectionPrintStyle element : InspectionPrintStyle.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }
}

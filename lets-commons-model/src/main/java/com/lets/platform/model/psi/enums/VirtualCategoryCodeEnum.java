package com.lets.platform.model.psi.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;


/**
 * 保存至计划跟踪号表内使用的虚构的单据类别
 */
public enum VirtualCategoryCodeEnum implements IEnum<Object> {

    GXHB("GXHB", "工序汇报单"),
    PGMX("PGMX", "派工明细"),
    SCYL("SCYL", "生产用料"),
    YMRP("YMRP", "一级MRP"),
    ZYD("ZYD", "转运单"),
    ZXD("ZXD", "装箱单"),
    CGBG("CGBG", "采购变更"),
    XSBG("XSBG", "销售变更"),
    ;

    private final String value;

    private final String name;

    VirtualCategoryCodeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (VirtualCategoryCodeEnum element : values()) {
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
        for (VirtualCategoryCodeEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getValues() {
        List<String> values = new ArrayList<>();
        for (VirtualCategoryCodeEnum element : values()) {
            values.add(element.getValue());
        }
        return values;
    }

    public static boolean containsValue(String value) {
        if (StrUtil.isEmpty(value)) {
            return false;
        }
        for (VirtualCategoryCodeEnum element : VirtualCategoryCodeEnum.values()) {
            if (value.equals(element.getValue())) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsName(String name) {
        if (StrUtil.isEmpty(name)) {
            return false;
        }
        for (VirtualCategoryCodeEnum element : values()) {
            if (name.equals(element.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}

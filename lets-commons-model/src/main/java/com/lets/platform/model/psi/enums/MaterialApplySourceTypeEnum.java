package com.lets.platform.model.psi.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;


/**
 * 拣货策略
 */
public enum MaterialApplySourceTypeEnum implements IEnum<Object> {

    CONTRACT("1", "合同管理","e547f7f0-1fd2-4dcf-a7d3-cd63497d5a0c"),
    QUOTATION("2", "销售报价单","c6e36fe9-8aa2-4505-a7d0-9bee50643a48"),
    SALEBILL("3", "销售订单","321ac6d7-52a0-4429-8029-4bb9706ea332"),
    ;

    private final String value;

    private final String name;
    private final String menuCode;

    MaterialApplySourceTypeEnum(String value, String name,String menuCode) {
        this.value = value;
        this.name = name;
        this.menuCode=menuCode;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (MaterialApplySourceTypeEnum element : values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static String getValueByMenuCode(String menuCode) {
        if (StringUtils.isEmpty(menuCode)) {
            return null;
        }
        for (MaterialApplySourceTypeEnum element : values()) {
            if (menuCode.equals(element.getMenuCode())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (MaterialApplySourceTypeEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getValues() {
        List<String> values = new ArrayList<>();
        for (MaterialApplySourceTypeEnum element : values()) {
            values.add(element.getValue());
        }
        return values;
    }

    public static boolean containsValue(String value) {
        if (StrUtil.isEmpty(value)) {
            return false;
        }
        for (MaterialApplySourceTypeEnum element : MaterialApplySourceTypeEnum.values()) {
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
        for (MaterialApplySourceTypeEnum element : values()) {
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
    public String getMenuCode() {
        return menuCode;
    }
}

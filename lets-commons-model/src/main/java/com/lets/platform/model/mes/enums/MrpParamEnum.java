package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * MRP参数 枚举
 * @author Qiao
 * @date 8/31/21 18:52
 * @version 1.0
 */
public enum MrpParamEnum implements IEnum<Object> {

    STORE("1", "参与MRP运算的仓库"),
    AVAILABLE_STORE("2", "是否考虑可用库存"),
    SAFE_STOCK("3", "是否考虑安全库存"),
    ESTIMATE_IN("4", "是否考虑预计入库"),
    ;

    private String value;

    private String name;

    MrpParamEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (MrpParamEnum element : MrpParamEnum.values()) {
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
        for (MrpParamEnum element : MrpParamEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }


    @Override
    public String getValue() {
        return value;
    }


    public String getName() {
        return name;
    }

}

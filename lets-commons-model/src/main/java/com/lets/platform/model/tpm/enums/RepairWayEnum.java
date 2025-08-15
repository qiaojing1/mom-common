package com.lets.platform.model.tpm.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 维修方式[1：内修、2：委外、3：无需维修]
 * @author DING WEI
 * @date 2024/11/18 14:35
 * @version 1.0
 */
public enum RepairWayEnum implements IEnum<Object> {

    INTERNAL_REPAIR("1","内修"),
    OUTSOURCING("2","委外"),
    NO_NEED("3", "无需维修"),
    ;

    private String value;

    private String name;

    RepairWayEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (RepairWayEnum element : RepairWayEnum.values()) {
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
        for (RepairWayEnum element : RepairWayEnum.values()) {
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

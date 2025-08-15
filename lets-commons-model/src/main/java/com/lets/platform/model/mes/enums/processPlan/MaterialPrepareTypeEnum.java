package com.lets.platform.model.mes.enums.processPlan;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 类型[1:主物料(派工单中的物料),2:工艺路线中的物料]
 * @author DING WEI
 * @date 2023/12/26 15:36
 * @version 1.0
 */
public enum MaterialPrepareTypeEnum implements IEnum<Object> {

    MAIN_MATERIAL("1", "派工单中的物料"),
    ROUTE_PROCESS_MATERIAL("2", "工艺路线中的物料"),
    ;

    private String value;

    private String name;

    MaterialPrepareTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (MaterialPrepareTypeEnum element : MaterialPrepareTypeEnum.values()) {
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
        for (MaterialPrepareTypeEnum element : MaterialPrepareTypeEnum.values()) {
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

package com.lets.platform.model.mes.enums.produceOrder;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 领料状态
 * @author DING WEI
 * @date 2023/11/7 17:16
 * @version 1.0
 */
public enum PickingStatusEnum implements IEnum<Object> {

    NOT_PICKING("0", "未领料"),
    PART_PICKING("1", "部分领料"),
    YES_PICKING("2", "已领料"),

    ;

    private String value;

    private String name;

    PickingStatusEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (PickingStatusEnum element : PickingStatusEnum.values()) {
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
        for (PickingStatusEnum element : PickingStatusEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getAllName() {
        List<String> allName = new ArrayList<>();
        allName.add(NOT_PICKING.getName());
        allName.add(PART_PICKING.getName());
        allName.add(YES_PICKING.getName());
        return allName;
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

}

package com.lets.platform.model.mes.enums.produceOrder;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 扫码-码类型[1:物料条码2:周转箱码]
 * @author DING WEI
 * @date 2024/10/21 15:00
 * @version 1.0
 */
public enum PursuanceScanCodeTypeEnum implements IEnum<Object> {

    MATERIAL("1", "物料条码"),
    TURNOVER_BOX("2", "周转箱码"),
    START_WORK("3", "上工人员码"),
    STOP_WORK("4", "下工人员码"),
    ;

    private String value;

    private String name;

    PursuanceScanCodeTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (PursuanceScanCodeTypeEnum element : PursuanceScanCodeTypeEnum.values()) {
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
        for (PursuanceScanCodeTypeEnum element : PursuanceScanCodeTypeEnum.values()) {
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

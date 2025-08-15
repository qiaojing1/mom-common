package com.lets.platform.model.mes.enums.produceOrder;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 类型[1:生产配料、2:半成品生产、3:生产执行-开工报工、3-1:扫码上料、3-2:扫码执行、3-3:扫码装箱]
 * @author DING WEI
 * @date 2024/10/21 15:00
 * @version 1.0
 */
public enum PursuanceRecordTypeEnum implements IEnum<Object> {

    START_STOP_WORK("0", "上工下工"),
    BATCHING("1", "生产配料"),
    PARTIALLY("2", "半成品生产"),
    PRODUCE_PURSUANCE("3", "生产执行-开工报工"),
    SCAN_FEED("3-1", "生产执行-扫码上料"),
    SCAN_PURSUANCE("3-2", "生产执行-扫码执行"),
    SCAN_PACKING("3-3", "生产执行-扫码装箱"),
    SCAN_CHECK("4", "生产执行-扫码校验"),
    ;

    private String value;

    private String name;

    PursuanceRecordTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (PursuanceRecordTypeEnum element : PursuanceRecordTypeEnum.values()) {
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
        for (PursuanceRecordTypeEnum element : PursuanceRecordTypeEnum.values()) {
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

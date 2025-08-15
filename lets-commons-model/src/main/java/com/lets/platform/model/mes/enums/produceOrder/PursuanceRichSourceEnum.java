package com.lets.platform.model.mes.enums.produceOrder;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 报工合格品数量来源
 * @author DING WEI
 * @date 2024/10/21 15:00
 * @version 1.0
 */
public enum PursuanceRichSourceEnum implements IEnum<Object> {

    SCAN_PACKING("1", "扫码装箱"),
    SCAN_PACKING_UN_COMPLETE("1-1", "扫码装箱(未完成)"),
    EXTERNAL_CODE("2", "外部码"),

    ;

    private String value;

    private String name;

    PursuanceRichSourceEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (PursuanceRichSourceEnum element : PursuanceRichSourceEnum.values()) {
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
        for (PursuanceRichSourceEnum element : PursuanceRichSourceEnum.values()) {
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

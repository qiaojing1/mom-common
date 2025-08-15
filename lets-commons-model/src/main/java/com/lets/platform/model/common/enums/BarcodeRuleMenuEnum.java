package com.lets.platform.model.common.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 * [0:生产配料,1:扫单执行,2:扫单收货,3:生产备料,4:扫码调拨]
 * @author DING WEI
 * @date 2025/1/14 10:12
 * @version 1.0
 */
public enum BarcodeRuleMenuEnum implements IEnum<Object> {

    PRODUCE_BATCHING("0", "生产配料"),
    SCAN_PURSUANCE("1", "扫单执行"),
    SCAN_DELIVERY("2", "扫单收货"),
    PRODUCE_FEED("3", "生产备料"),
    BARCODE_TRANSFER("4", "扫码调拨"),
    EXTERNAL_BARCODE("5", "生产执行"),
    SCAN_FEED("6", "扫码上料"),
    ;

    private final String value;

    @Getter
    private final String name;

    BarcodeRuleMenuEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (BarcodeRuleMenuEnum element : BarcodeRuleMenuEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static String getName(String value) {
        if (StrUtil.isEmpty(value)) {
            return null;
        }
        for (BarcodeRuleMenuEnum element : BarcodeRuleMenuEnum.values()) {
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

    public boolean equals(String value) {
        return this.value.equals(value);
    }

}

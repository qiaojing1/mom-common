package com.lets.platform.common.pojo.enums;

import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 * 出库、入库
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/9/9 11:31
 */
public enum StockTypeEnum implements IEnum<Object> {

    STOCK_IN("stock_in", "入库"),
    STOCK_OUT("stock_out", "出库"),
    ;

    private final String value;

    @Getter
    private final String source;

    StockTypeEnum(String value, String source) {
        this.value = value;
        this.source = source;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (StockTypeEnum element : StockTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getSource();
            }
        }
        return null;
    }

    @Override
    public String getValue() {
        return value;
    }

}

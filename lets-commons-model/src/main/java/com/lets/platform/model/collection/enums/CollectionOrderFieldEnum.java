package com.lets.platform.model.collection.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 排序字段 枚举
 *
 * @ClassName CollectionOrderFieldEnum
 * @author: DING WEI
 * @create: 2021/04/27 13:32
 * @Version 1.0
 **/
public enum CollectionOrderFieldEnum implements IEnum<Object> {

    DEFAULT("default", "m.create_time"),

    BEFORE_AFTER("beforeAfter", "temp.beforeAfter,"),
    DEVICE_DATA_ITEM_DEFAULT("dataItemSort", "temp.dataItemSort"),

    START_TIME("startTime", "m.start_time"),
    START_TIME_TT("startTime", "tt.start_time"),
    START_TIME_DEVICE("startTime", "ld.create_time"),
    SORT("sort", "sort"),

    COLLECTOR_CODE("collectorCode", "m.collector_code"),
    DATA_ITEM_SIGN("dataItemSign", "m.data_item_sign"),
    ;

    // TODO 其他表字段

    private String value;

    private String field;

    CollectionOrderFieldEnum(String value, String field) {
        this.value = value;
        this.field = field;
    }

    @Override
    public String getValue() {
        return value;
    }

    public static String getOrderField(String value) {
        if (StringUtils.isEmpty(value)) {
            return DEFAULT.field;
        }
        for (CollectionOrderFieldEnum element : CollectionOrderFieldEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getField();
            }
        }
        return null;
    }

    public String getField() {
        return field;
    }
}

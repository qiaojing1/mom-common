package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 排序字段 枚举
 *
 * @ClassName CommonOrderFieldEnum
 * @author: DING WEI
 * @create: 2021/04/27 13:32
 * @Version 1.0
 **/
public enum CommonOrderFieldEnum implements IEnum<Object> {

    DEFAULT("default", "m.create_time"),

    // TODO 其他表字段
    //common_dict  字典表
    DICTSORT("dictSort", "m.dict_sort"),

    //common_currency   币种
    STATUS("status", "m.status"),

    //common_process  工序
    CREATETIME("createTime", "m.create_time"),
    SORT("sort", "sort"),
    ORDERTIME("Order.orderTime", "m.order_time"),

    ;

    private String value;

    private String field;

    CommonOrderFieldEnum(String value, String field) {
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
        for (CommonOrderFieldEnum element : CommonOrderFieldEnum.values()) {
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

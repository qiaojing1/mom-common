package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;


/**
 * ETL连接组件-连接类型 枚举
 *
 * @ClassName EtlComposeJoinTypeEnum
 * @author: DING WEI
 * @create: 2022/06/25 08:45
 * @Version 1.0
 **/
public enum EtlComposeJoinTypeEnum implements IEnum<Object> {

    LEFT_OUT_JOIN("1", "左连接"),
    RIGHT_OUT_JOIN("2", "右连接"),
    INNER_JOIN("3", "内连接"),
    FULL_OUT_JOIN("4", "全连接"),
    ;

    private String value;

    private String source;

    EtlComposeJoinTypeEnum(String value, String source) {
        this.value = value;
        this.source = source;
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getName() {
        return source;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (EtlComposeJoinTypeEnum element : EtlComposeJoinTypeEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue().toString();
            }
        }
        return null;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (EtlComposeJoinTypeEnum element : EtlComposeJoinTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }
}

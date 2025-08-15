package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;


/**
 * 集群部署消息类型 枚举
 *
 * @ClassName Common4ClusterTypeEnum
 * @author: DING WEI
 * @create: 2021/08/18 08:45
 * @Version 1.0
 **/
public enum Common4ClusterTypeEnum implements IEnum<Object> {

    WEBSOCKET("1", "webSocket消息"),
    DATASOURCE("2", "数据源删除"),
    ;

    private String value;

    private String source;

    Common4ClusterTypeEnum(String value, String source) {
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
        for (Common4ClusterTypeEnum element : Common4ClusterTypeEnum.values()) {
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
        for (Common4ClusterTypeEnum element : Common4ClusterTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }
}

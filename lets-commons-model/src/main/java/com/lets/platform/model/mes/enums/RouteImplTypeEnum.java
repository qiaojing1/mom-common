package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 工艺路线保存-实现类型 枚举
 * @author DING WEI
 * @date 8/31/21 18:52
 * @version 1.0
 */
public enum RouteImplTypeEnum implements IEnum<Object> {

    STANDARD("standard", "标准产品"),
    LM_MOULD("lmMould", "联盟模具"),
    YDFM_MODULE("ydfmModule", "盐电阀门"),
    ;

    private String value;

    private String name;

    RouteImplTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (RouteImplTypeEnum element : RouteImplTypeEnum.values()) {
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
        for (RouteImplTypeEnum element : RouteImplTypeEnum.values()) {
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

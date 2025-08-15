package com.lets.platform.common.pojo.constant;

import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 工作流操作 枚举
 *
 * @author fzy
 * @since 2024-05-16
 */
@Getter
public enum FlowTraceEnum {
    BOM("4d19e433-bcef-4a85-b245-8f8a01cf3ac4", "BOM维护","sendMessageBussinessFlowAtom"),//BOM
    PROCESS_ROUTE("910c73c4-5d7f-4396-97e2-97c39a4e36aa", "工艺路线","sendMessageBussinessFlowAtom"),//工艺路线
    CHECK("a273145d-735a-4ab6-a9f9-830fd7ffcc33", "检验方案配置","sendMessageBussinessFlowAtom"),//质检
    ;

    private final String code;

    private final String name;

    private final String businessKey;

    FlowTraceEnum(String code, String name,String businessKey) {
        this.code = code;
        this.name = name;
        this.businessKey = businessKey;
    }


    public static String getCode(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (FlowTraceEnum element : FlowTraceEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getCode();
            }
        }
        return null;
    }

    public static String getName(String code) {
        if (StringUtils.isEmpty(code)) {
            return null;
        }
        for (FlowTraceEnum element : FlowTraceEnum.values()) {
            if (code.equals(element.getCode())) {
                return element.getName();
            }
        }
        return null;
    }

}

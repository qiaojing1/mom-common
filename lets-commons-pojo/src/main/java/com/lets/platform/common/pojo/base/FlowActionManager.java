package com.lets.platform.common.pojo.base;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.annotation.FlowAction;
import com.lets.platform.common.pojo.constant.FlowActionMethodEnum;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 流程操作管理
 *
 * @author FZY
 * @since 2023-11-10
 */
public class FlowActionManager {

    private static final Map<String, Method> FLOW_ACTION_MAP = new HashMap<>();

    public static void register(String menuCode, FlowAction action, Method method) {
        String key = String.format("%s::%s", StrUtil.isNotEmpty(action.menuCode()) ? action.menuCode() : menuCode, action.method().getCode());
        FLOW_ACTION_MAP.put(key, method);
    }

    public static Method getMethod(String module, FlowActionMethodEnum actionMethodEnum) {
        String key = String.format("%s::%s", module, actionMethodEnum.getCode());
        return FLOW_ACTION_MAP.get(key);
    }

    public static Map<String, Method> getRegister() {
        return FLOW_ACTION_MAP;
    }
}

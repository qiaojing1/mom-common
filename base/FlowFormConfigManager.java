package com.lets.platform.common.pojo.base;

import com.lets.platform.common.pojo.annotation.FlowFormConfiguration;

import java.util.HashMap;
import java.util.Map;

/**
 * 流程操作管理
 *
 * @author FZY
 * @since 2023-11-10
 */
public class FlowFormConfigManager {

    private static final Map<String, FlowFormConfiguration> FLOW_FORM_CONFIG_MAP = new HashMap<>();

    public static void register(String menuCode, FlowFormConfiguration flowFormConfiguration) {
        FLOW_FORM_CONFIG_MAP.put(menuCode, flowFormConfiguration);
    }

    public static FlowFormConfiguration getConfiguration(String menuCode) {
        return FLOW_FORM_CONFIG_MAP.get(menuCode);
    }

    public static Map<String, FlowFormConfiguration> getRegister() {
        return FLOW_FORM_CONFIG_MAP;
    }
}

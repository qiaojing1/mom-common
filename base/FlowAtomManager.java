package com.lets.platform.common.pojo.base;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.annotation.FlowAtom;
import com.lets.platform.common.pojo.constant.DefaultFlowAtomEnum;
import com.lets.platform.common.pojo.enums.WorkflowTypeEnum;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 流程原子服务管理
 *
 * @author FZY
 * @since 2023-11-10
 */
public class FlowAtomManager {

    private static final Map<String, Method> FLOW_ATOM_MAP = new HashMap<>();
    private static final Map<String, List<Map<String, String>>> APPROVAL_PROCESS_MAP = new HashMap<>();
    private static final Map<String, List<Map<String, String>>> OPERATION_PROCESS_MAP = new HashMap<>();

    public static void register(String menuCode, FlowAtom atom, Method method) {
        if (StrUtil.isNotEmpty(atom.menuCode())) {
            menuCode = atom.menuCode();
        }
        WorkflowTypeEnum type = atom.type();
        String businessKey = StrUtil.emptyToDefault(atom.businessKey(), StrUtil.EMPTY);
        String code = atom.code();
        String name = atom.name();

        if (StrUtil.isEmpty(menuCode) || StrUtil.isEmpty(code) || StrUtil.isEmpty(name)) {
            return;
        }

        String key = String.format("%s::%s::%s::%s", menuCode, type.getValue(), businessKey, code);
        FLOW_ATOM_MAP.put(key, method);
        List<Map<String, String>> list = null;
        if (WorkflowTypeEnum.APPROVAL_PROCESS.equals(type)) {
            list = APPROVAL_PROCESS_MAP.get(menuCode);
        } else if (WorkflowTypeEnum.OPERATION_PROCESS.equals(type)) {
            if (StrUtil.isEmpty(businessKey)) {
                return;
            }
            list = OPERATION_PROCESS_MAP.get(menuCode + "_" + businessKey);
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        Map<String, String> map = new HashMap<>();
        map.put("code", code);
        map.put("name", name);
        map.put("isOnlyEndAtom", atom.isOnlyEndAtom());
        list.add(map);
        if (WorkflowTypeEnum.APPROVAL_PROCESS.equals(type)) {
            APPROVAL_PROCESS_MAP.put(menuCode, list);
        } else if (WorkflowTypeEnum.OPERATION_PROCESS.equals(type)) {
            OPERATION_PROCESS_MAP.put(menuCode + "_" + businessKey, list);
        }
    }

    public static List<Map<String, String>> getFlowAtomList(String menuCode, String type, String businessKey) {
        List<Map<String, String>> result = null;
        if (WorkflowTypeEnum.APPROVAL_PROCESS.getValue().equals(type)) {
            result = APPROVAL_PROCESS_MAP.get(menuCode);
        } else if (WorkflowTypeEnum.OPERATION_PROCESS.getValue().equals(type)) {
            if (StrUtil.isNotEmpty(businessKey)) {
                result = OPERATION_PROCESS_MAP.get(menuCode + "_" + businessKey);
            }
        }
        if (CollUtil.isEmpty(result)) {
            result = new ArrayList<>();
        }

        for (DefaultFlowAtomEnum defaultFlowAtom : DefaultFlowAtomEnum.values()) {
            if (result.stream().noneMatch(item -> defaultFlowAtom.equals(item.get("code")))) {
                Map<String, String> map = new HashMap<>();
                map.put("code", defaultFlowAtom.getCode());
                map.put("name", defaultFlowAtom.getName());
                map.put("isOnlyEndAtom", defaultFlowAtom.getIsOnlyEndAtom());
                result.add(map);
            }
        }

        return result;
    }

    public static Method getFlowAtom(String menuCode, String code) {
        return getFlowAtom(menuCode, WorkflowTypeEnum.APPROVAL_PROCESS, StrUtil.EMPTY, code);
    }

    public static Method getFlowAtom(String menuCode, WorkflowTypeEnum type, String businessKey, String code) {
        String typeValue = StrUtil.EMPTY;
        if (menuCode == null) {
            menuCode = StrUtil.EMPTY;
        }
        if (type != null) {
            typeValue = type.getValue();
        }
        if (businessKey == null) {
            businessKey = StrUtil.EMPTY;
        }
        if (code == null) {
            code = StrUtil.EMPTY;
        }
        String key = String.format("%s::%s::%s::%s", menuCode, typeValue, businessKey, code);
        return FLOW_ATOM_MAP.get(key);
    }
}

package com.lets.platform.common.pojo.constant;

import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 * 工作流操作 枚举
 *
 * @author fzy
 * @since 2023-04-06
 */
@Getter
public enum DefaultFlowAtomEnum {
    SEND_MESSAGE_FLOW_ATOM("sendMessageFlowAtom", "消息推送", "N"),
    ;
    private final String code;
    private final String name;
    private final String isOnlyEndAtom;

    DefaultFlowAtomEnum(String code, String name, String isOnlyEndAtom) {
        this.code = code;
        this.name = name;
        this.isOnlyEndAtom = isOnlyEndAtom;
    }

    public static String getCode(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (DefaultFlowAtomEnum element : DefaultFlowAtomEnum.values()) {
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
        for (DefaultFlowAtomEnum element : DefaultFlowAtomEnum.values()) {
            if (code.equals(element.getCode())) {
                return element.getName();
            }
        }
        return null;
    }

    public static Boolean contains(String code) {
        for (DefaultFlowAtomEnum element : DefaultFlowAtomEnum.values()) {
            if (element.getCode().equals(code)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(String code) {
        return this.code.equals(code);
    }
}

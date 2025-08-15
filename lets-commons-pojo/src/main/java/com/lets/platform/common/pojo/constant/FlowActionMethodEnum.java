package com.lets.platform.common.pojo.constant;

import cn.hutool.core.util.StrUtil;
import lombok.Getter;

/**
 * 工作流操作 枚举
 *
 * @author fzy
 * @since 2023-04-06
 */
@Getter
public enum FlowActionMethodEnum {
    QUERY("query", "获取数据"),
    SUBMIT("submit", "提交"),
    APPROVE("approve", "通过"),
    REJECT("reject", "否决"),
    BACK("back", "驳回"),
    REVOKE("revoke", "撤回"),
    REVERSE("reverse", "反审"),
    SAVE("save", "保存"),
    ;

    private final String code;

    private final String name;

    FlowActionMethodEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public static String getName(String code) {
        if (StrUtil.isEmpty(code)) {
            return null;
        }
        for (FlowActionMethodEnum element : FlowActionMethodEnum.values()) {
            if (code.equals(element.getCode())) {
                return element.getName();
            }
        }
        return null;
    }
}

package com.lets.platform.model.tpm.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;
import com.lets.platform.model.tpm.enums.*;
/**
 * 预警规则步骤 枚举
 * @ClassName WarnRuleStepEnums
 * @author: DING WEI
 * @create: 2021/01/14 18:01
 * @Version 1.0
 **/
public enum WarnRuleStepEnums implements IEnum<Object> {

    WARN_RULE_WAIT_RES("1", "待响应"),
    WARN_RULE_HANDLE_ING("2", "处理中"),
    WARN_RULE_WAIT_EXAMINE("3", "待审核");

    private String value;

    private String name;

    @Override
    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    WarnRuleStepEnums(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (WarnRuleStepEnums element : WarnRuleStepEnums.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static WarnRuleStepEnums getElement(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (WarnRuleStepEnums element : WarnRuleStepEnums.values()) {
            if (value.equals(element.getValue())) {
                return element;
            }
        }
        return null;
    }

}

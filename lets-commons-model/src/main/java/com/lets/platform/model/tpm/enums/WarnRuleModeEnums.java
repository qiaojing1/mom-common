package com.lets.platform.model.tpm.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 预警规则模块 枚举
 * @ClassName WarnRuleModeEnums
 * @author: DING WEI
 * @create: 2021/01/14 18:01
 * @Version 1.0
 **/
public enum WarnRuleModeEnums implements IEnum<Object> {

    TPM("1", "设备保全管理"),
    DIE_FIXTURE("2", "模治具管理"),
    OTHER("3", "其他模块"),
    SE("4", "安环管理"),
    ;

    private String value;

    private String name;

    @Override
    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    WarnRuleModeEnums(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (WarnRuleModeEnums element : WarnRuleModeEnums.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static WarnRuleModeEnums getElement(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (WarnRuleModeEnums element : WarnRuleModeEnums.values()) {
            if (value.equals(element.getValue())) {
                return element;
            }
        }
        return null;
    }

}

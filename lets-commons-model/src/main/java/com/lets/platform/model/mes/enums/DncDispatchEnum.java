package com.lets.platform.model.mes.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * DNC程序下发类型
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/11/7 17:16
 */
public enum DncDispatchEnum implements IEnum<Object> {

    NORMAL("1", "直接下发"),
    PROCESS_TASK("2", "工序任务调用"),
    ;

    private final String value;

    @Getter
    private final String name;

    DncDispatchEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (DncDispatchEnum element : DncDispatchEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static String getName(String value) {
        if (StrUtil.isEmpty(value)) {
            return null;
        }
        for (DncDispatchEnum element : DncDispatchEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getAllNames() {
        List<String> names = new ArrayList<>();
        for (DncDispatchEnum element : DncDispatchEnum.values()) {
            names.add(element.name);
        }
        return names;
    }

    public static boolean containsName(String name) {
        if (!StringUtils.isEmpty(name)) {
            DncDispatchEnum[] var = values();
            for (DncDispatchEnum element : var) {
                if (name.equals(element.getName())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String getValue() {
        return value;
    }
}

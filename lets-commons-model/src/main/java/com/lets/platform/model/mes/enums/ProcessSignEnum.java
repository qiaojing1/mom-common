package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 工序标识 枚举
 * @author Qiao
 * @date 11/18/21 14:30
 * @version 1.0
 */
public enum ProcessSignEnum implements IEnum<Object> {

    FIRST_PROCESS("0", "首道工序"),
    LAST_PROCESS("1", "末道工序"),
    ONLY_ONE_PROCESS("2", "只有一道工序(既是首道也是末道)"),
    ;

    private String value;

    private String name;

    ProcessSignEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ProcessSignEnum element : ProcessSignEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static List<String> getFirstProcess() {
        List<String> lastProcess = new ArrayList<>();
        lastProcess.add(FIRST_PROCESS.getValue());
        lastProcess.add(ONLY_ONE_PROCESS.getValue());
        return lastProcess;
    }

    public static List<String> getLastProcess() {
        List<String> lastProcess = new ArrayList<>();
        lastProcess.add(LAST_PROCESS.getValue());
        lastProcess.add(ONLY_ONE_PROCESS.getValue());
        return lastProcess;
    }

    public static List<String> getAllProcess() {
        List<String> lastProcess = new ArrayList<>();
        lastProcess.add(FIRST_PROCESS.getValue());
        lastProcess.add(LAST_PROCESS.getValue());
        lastProcess.add(ONLY_ONE_PROCESS.getValue());
        return lastProcess;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (ProcessSignEnum element : ProcessSignEnum.values()) {
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

package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

public enum ProcessFileTypeEnum implements IEnum<Object> {

    PROCESS("process", "工艺卡片"),
    DRAWING("drawing", "加工图纸"),
    JobProInsBenchmark("JobProInsBenchmark", "岗位产品检验基准书"),
    ProErrorPreWarning("ProErrorPreWarning", "产品防错和警示"),
    StaOpeInsProRework("StaOpeInsProRework", "产品返工标准作业指导书"),
    HOMEWORK_GUIDEBOOK("HomeworkGuidebook", "作业指导书"),
    ;

    private String value;

    private String source;

    ProcessFileTypeEnum(String value, String source) {
        this.value = value;
        this.source = source;
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getName() {
        return source;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ProcessFileTypeEnum element : ProcessFileTypeEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue().toString();
            }
        }
        return null;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (ProcessFileTypeEnum element : ProcessFileTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }
}

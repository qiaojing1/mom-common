package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 质检抽样标准变更类型 [1来料检验，2过程检验]
 * @author DING WEI
 * @date 03/28/23 10:52
 * @version 1.0
 */
public enum QualityCheckSampleStandardChangeTypeEnum implements IEnum<Object> {

    INCOMING("1", "来料检验"),
    PROCESS("2", "过程检验"),
    ;

    private String value;

    private String name;

    QualityCheckSampleStandardChangeTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (QualityCheckSampleStandardChangeTypeEnum element : QualityCheckSampleStandardChangeTypeEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (QualityCheckSampleStandardChangeTypeEnum element : QualityCheckSampleStandardChangeTypeEnum.values()) {
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

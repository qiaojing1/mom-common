package com.lets.platform.model.mes.enums.produceOrder;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 生成物料条码时机[1:扫码上料;2:报工]
 * @author DING WEI
 * @date 2024/10/24 18:36
 * @version 1.0
 */
public enum GenerateMaterialBarcodeMomentEnum implements IEnum<Object> {

    SCAN_FEEDING("1", "扫码上料"),
    REPORT("2", "报工"),

    ;

    private final String value;

    @Getter
    private final String name;

    GenerateMaterialBarcodeMomentEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (GenerateMaterialBarcodeMomentEnum element : GenerateMaterialBarcodeMomentEnum.values()) {
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
        for (GenerateMaterialBarcodeMomentEnum element : GenerateMaterialBarcodeMomentEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getAllName() {
        List<String> allName = new ArrayList<>();
        allName.add(SCAN_FEEDING.getName());
        allName.add(REPORT.getName());
        return allName;
    }

    @Override
    public String getValue() {
        return value;
    }

    public boolean equals(String value) {

        return this.value.equals(value);

    }

}

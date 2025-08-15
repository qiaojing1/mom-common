package com.lets.platform.model.psi.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 条码生成来源 [scanFeed：扫码上料，report：工单报工]
 * @author DING WEI
 * @date 2024/11/4 13:52
 * @version 1.0
 */
public enum BarcodeGenerateSourceEnum implements IEnum<String> {

    SCAN_FEED("scanFeed", "扫码上料"),
    SCAN_PACKING("scanPacking", "扫码装箱"),
    REPORT("report", "工单报工"),
    ;

    private String value;
    @Getter
    private String name;


    BarcodeGenerateSourceEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static BarcodeGenerateSourceEnum getEnum(String value) {
        for (BarcodeGenerateSourceEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element;
            }
        }
        return null;
    }

    public static String getName(String value) {
        if (StrUtil.isEmpty(value)) {
            return null;
        }
        for (BarcodeGenerateSourceEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static Set<String> getValues() {
        return Arrays.stream(values()).map(BarcodeGenerateSourceEnum::getValue).collect(Collectors.toSet());
    }

    @Override
    public String getValue() {
        return value;
    }

    public boolean equals(String value) {
        return this.value.equals(value);
    }
}

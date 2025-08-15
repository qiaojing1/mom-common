package com.lets.platform.model.psi.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 采购下发-汇总类型[1主供应商,2系统自动推荐,3货源清单,4申请建议供应商]
 * @author DING WEI
 * @date 2024/3/11 15:51
 * @version 1.0
 */
public enum PurchaseDistributeSummaryTypeEnum implements IEnum<Object> {

    MATERIAL_AND_DEMAND_DATE(1, "按物料+需求日期汇总"),
    MATERIAL(2, "按物料汇总"),
    NO(3, "不汇总"),
    ;

    private final Integer value;

    private final String name;

    PurchaseDistributeSummaryTypeEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Integer getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (PurchaseDistributeSummaryTypeEnum element : values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static String getName(Integer value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (PurchaseDistributeSummaryTypeEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<Integer> getValues() {
        List<Integer> values = new ArrayList<>();
        for (PurchaseDistributeSummaryTypeEnum element : values()) {
            values.add(element.getValue());
        }
        return values;
    }

    public static boolean containsValue(String value) {
        if (StrUtil.isEmpty(value)) {
            return false;
        }
        for (PurchaseDistributeSummaryTypeEnum element : PurchaseDistributeSummaryTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsName(String name) {
        if (StrUtil.isEmpty(name)) {
            return false;
        }
        for (PurchaseDistributeSummaryTypeEnum element : values()) {
            if (name.equals(element.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}

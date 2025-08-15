package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 质检计划类型 枚举
 * @author DING WEI
 * @date 9/17/21 10:52
 * @version 1.0
 */
public enum QualityCheckPlanTypeEnum implements IEnum<Object> {

    PURCHASE_RECEIVE("1", "采购收货质检"),
    ALLOCATION_RECEIVE("2", "调拨收货质检"),
    SALES_STOCK_OUT("3", "销售出库质检"),
    ALLOCATION_STOCK_OUT("4", "调拨出库质检"),
    COMPLETE_STOCK_IN("5", "完工入库质检"),
    PRODUCE_FIRST("6", "生产首件质检"),
    PRODUCE_FINISH("7", "生产完成质检"),
    PRODUCE_PROCESS("8", "生产过程质检"),
    ;

    private String value;

    private String name;

    QualityCheckPlanTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (QualityCheckPlanTypeEnum element : QualityCheckPlanTypeEnum.values()) {
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
        for (QualityCheckPlanTypeEnum element : QualityCheckPlanTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getDetail4Material() {
        List<String> types = new ArrayList<>();
        types.add(PURCHASE_RECEIVE.getValue());
        types.add(ALLOCATION_RECEIVE.getValue());
        types.add(SALES_STOCK_OUT.getValue());
        types.add(ALLOCATION_STOCK_OUT.getValue());
        types.add(COMPLETE_STOCK_IN.getValue());
        return types;
    }

    public static List<String> getDetail4Process() {
        List<String> types = new ArrayList<>();
        types.add(PRODUCE_FIRST.getValue());
        types.add(PRODUCE_FINISH.getValue());
        types.add(PRODUCE_PROCESS.getValue());
        return types;
    }

    @Override
    public String getValue() {
        return value;
    }


    public String getName() {
        return name;
    }

}

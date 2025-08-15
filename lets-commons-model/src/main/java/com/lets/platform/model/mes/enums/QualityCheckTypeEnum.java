package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 质检类型 枚举
 * @author Qiao
 * @date 8/31/21 18:52
 * @version 1.0
 */
public enum QualityCheckTypeEnum implements IEnum<Object> {

    FIRST_ONE("1", "生产首件检", "派工批次", ""),
    COMPLETE_STOCK_IN("2", "完工入库检", "入库单", ""),
    STOCK_IN("3", "入库检", "收货单", "入库"),
    STOCK_OUT("4", "出库检", "出库单", "出库"),
    PRODUCE_PROCESS("5", "生产过程检", "派工批次", ""),
    PRODUCE_FINISH("6", "生产完成检", "派工批次", ""),
    ;

    private String value;

    private String name;

    private String relationOrder;

    private String checkResultMsg;

    QualityCheckTypeEnum(String value, String name, String relationOrder, String checkResultMsg) {
        this.value = value;
        this.name = name;
        this.relationOrder = relationOrder;
        this.checkResultMsg = checkResultMsg;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (QualityCheckTypeEnum element : QualityCheckTypeEnum.values()) {
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
        for (QualityCheckTypeEnum element : QualityCheckTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static String getCheckResultMsg(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (QualityCheckTypeEnum element : QualityCheckTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getCheckResultMsg();
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

    public String getRelationOrder() {
        return relationOrder;
    }

    public String getCheckResultMsg() {
        return checkResultMsg;
    }

}

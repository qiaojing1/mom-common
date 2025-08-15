package com.lets.platform.model.mes.enums.processPlan;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 需求来源类型[1:计划订单、2:销售订单、3:生产工单]
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/12/26 15:36
 */
public enum DemandSourceTypeEnum implements IEnum<Object> {

    PSI_PRODUCE_PLAN(1, "计划订单"),
    PSI_SALES_ORDER(2, "销售订单"),
    MES_PRODUCE_ORDER(3, "生产工单"),
    MES_REPORT_ORDER(4, "工单报工单"),
    MES_PROCESS_REPORT(5, "工序汇报单"),
    MES_DISPATCH_DETAIL(6, "派工单明细"),
    ;

    private final Integer value;

    private final String name;

    DemandSourceTypeEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Integer getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (DemandSourceTypeEnum element : DemandSourceTypeEnum.values()) {
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
        for (DemandSourceTypeEnum element : DemandSourceTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

}

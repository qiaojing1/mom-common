package com.lets.platform.model.mes.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import com.lets.platform.common.pojo.enums.OrderBusinessEnum;
import com.lets.platform.common.pojo.exception.LetsException;
import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 * 检验类型
 */
public enum InspectTypeEnum implements IEnum<String> {
    INCOMING_INSPECTION("1", OrderBusinessEnum.IQC, "进料检验"),
    IN_PROCESS_INSPECTION("2", OrderBusinessEnum.IPQC, "自制工序检验"),
    OUTSOURCED_PROCESS_INSPECTION("3", OrderBusinessEnum.SIPQC, "委外工序检验"),
    FINAL_INSPECTION("4", OrderBusinessEnum.FQC, "完工检验"),
    INVENTORY_INSPECTION("5", OrderBusinessEnum.INQC, "库存检验"),
    SHIPPING_INSPECTION("6", OrderBusinessEnum.OQC, "发货检验"),
    RETURN_INSPECTION("7", OrderBusinessEnum.RQC, "退货检验"),
    PRODUCTION_MATERIAL_RETURN_INSPECTION("8", OrderBusinessEnum.PRQC, "生产退料检验"),
    OUTSOURCED_MATERIAL_RETURN_INSPECTION("9", OrderBusinessEnum.SPRQC, "委外退料检验"),
    PRODUCTION_PATROL_INSPECTION("10", OrderBusinessEnum.SCXJ, "生产巡检"),
    OTHER_INSPECTION("11", OrderBusinessEnum.QTJY, "其他检验"),
    FIRST_INSPECTION("12", OrderBusinessEnum.FAIQC, "首件检验"),
    OUT_SOURCE_INSPECTION("13", OrderBusinessEnum.OSQC, "外派检验"),
    SPQC_INSPECTION("14", OrderBusinessEnum.SPQC, "工序首件检验"),
    ;

    private final String value;
    @Getter
    private final OrderBusinessEnum orderBusinessEnum;
    @Getter
    private final String name;

    InspectTypeEnum(String value, OrderBusinessEnum orderBusinessEnum, String name) {
        this.value = value;
        this.orderBusinessEnum = orderBusinessEnum;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (InspectTypeEnum element : InspectTypeEnum.values()) {
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
        for (InspectTypeEnum element : InspectTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static String getInspectType(String businessCode) {
        if (StringUtils.isEmpty(businessCode)) {
            throw new LetsException(0, "未找到业务类型");
        }
        for (InspectTypeEnum element : InspectTypeEnum.values()) {
            if (businessCode.equals(element.getOrderBusinessEnum().getCode())) {
                return element.getValue();
            }
        }
        throw new LetsException(0, "未找到业务类型");
    }

    public static String getBusinessCode(String value) {
        if (StrUtil.isEmpty(value)) {
            return null;
        }
        for (InspectTypeEnum element : InspectTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getOrderBusinessEnum().getCode();
            }
        }
        return null;
    }

    @Override
    public String getValue() {
        return value;
    }

    public boolean equals(String value) {
        return this.value.equals(value);
    }

}

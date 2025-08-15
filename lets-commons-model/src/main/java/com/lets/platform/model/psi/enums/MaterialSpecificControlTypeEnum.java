package com.lets.platform.model.psi.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import com.lets.platform.model.psi.entity.PsiMaterialCharacteristic;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * 物料属性
 */
public enum MaterialSpecificControlTypeEnum implements IEnum<Object> {

    SALE_CONTROL("1", "销售控制"),
    INVENTORY_CONTROL("2", "库存控制"),
    PURCHASE_CONTROL("3", "采购控制"),
    PLAN_CONTROL("4", "计划控制"),
    PRODUCTION_CONTROL("5", "生产控制"),
    QUALITY_CONTROL("6", "质量控制");

    private final String value;

    @Getter
    private final String name;

    MaterialSpecificControlTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static MaterialSpecificControlTypeEnum getControlTypeEnum(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (MaterialSpecificControlTypeEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element;
            }
        }
        return null;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (MaterialSpecificControlTypeEnum element : values()) {
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
        for (MaterialSpecificControlTypeEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static boolean isControl(String value, PsiMaterialCharacteristic characteristic) {
        if (StrUtil.isEmpty(value) || characteristic == null || !Objects.equals(characteristic.getEnable(), IsOrNotEnum.IS.getValue())) {
            return false;
        }
        MaterialSpecificControlTypeEnum typeEnum = getControlTypeEnum(value);
        if (typeEnum == null) {
            return false;
        }
        switch (typeEnum) {
            case SALE_CONTROL:
                return Objects.equals(characteristic.getSaleControl(), IsOrNotEnum.IS.getValue());
            case INVENTORY_CONTROL:
                return Objects.equals(characteristic.getInventoryControl(), IsOrNotEnum.IS.getValue());
            case PURCHASE_CONTROL:
                return Objects.equals(characteristic.getPurchaseControl(), IsOrNotEnum.IS.getValue());
            case PLAN_CONTROL:
                return Objects.equals(characteristic.getPlanControl(), IsOrNotEnum.IS.getValue());
            case PRODUCTION_CONTROL:
                return Objects.equals(characteristic.getProductionControl(), IsOrNotEnum.IS.getValue());
            case QUALITY_CONTROL:
                return Objects.equals(characteristic.getQualityControl(), IsOrNotEnum.IS.getValue());
            default:
                return false;
        }
    }

    public static List<String> getValues() {
        List<String> codes = new ArrayList<>();
        for (MaterialSpecificControlTypeEnum element : values()) {
            codes.add(element.getValue());
        }
        return codes;
    }

    @Override
    public String getValue() {
        return value;
    }

}

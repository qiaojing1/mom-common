package com.lets.platform.model.collection.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import com.lets.platform.model.device.enums.TypeClassifyEnum;

/**
 * 能耗-水电气类型 枚举
 * @author DING WEI
 * @date 2024/12/30 15:00
 * @version 1.0
 */
public enum EnergyTypeEnum implements IEnum<Object> {

    POWER("1","电", "coll_energy_day_power", "用电"),
    WATER("3","水", "coll_energy_day_water", "用水"),
    GAS("2","气", "coll_energy_day_gas", "用气");

    @Override
    public String getValue() {
        return value;
    }

    public String getName(){
        return name;
    }

    public String getTable() {
        return table;
    }
    public String getName2() {
        return name2;
    }

    EnergyTypeEnum(String value, String name, String table, String name2){
        this.value = value;
        this.name = name;
        this.table = table;
        this.name2 = name2;
    }

    private String value;
    private String name;
    private String table;
    private String name2;

    public static String getByTypeClassify(String typeClassify) {
        if (TypeClassifyEnum.POWER.getValue().equals(typeClassify)) {
            return POWER.getValue();
        } else if (TypeClassifyEnum.GAS.getValue().equals(typeClassify) || TypeClassifyEnum.COMPRESS_GAS.getValue().equals(typeClassify)) {
            return GAS.getValue();
        } else if (TypeClassifyEnum.WATER.getValue().equals(typeClassify)) {
            return WATER.getValue();
        }
        return "";
    }

    public static String getTableByType(String type) {
        if (POWER.getValue().equals(type)) {
            return POWER.getTable();
        } else if (GAS.getValue().equals(type)) {
            return GAS.getTable();
        } else if (WATER.getValue().equals(type)) {
            return WATER.getTable();
        }
        return null;
    }

    public static String getName(String value) {
        for (EnergyTypeEnum typeEnum : values()) {
            if (typeEnum.getValue().equals(value)) {
                return typeEnum.getName();
            }
        }
        return null;
    }

    public static String getName2(String value) {
        for (EnergyTypeEnum typeEnum : values()) {
            if (typeEnum.getValue().equals(value)) {
                return typeEnum.getName2();
            }
        }
        return null;
    }
    public static String getValueByName2(String name2) {
        for (EnergyTypeEnum typeEnum : values()) {
            if (typeEnum.getName2().equals(name2)) {
                return typeEnum.getValue();
            }
        }
        return null;
    }
}

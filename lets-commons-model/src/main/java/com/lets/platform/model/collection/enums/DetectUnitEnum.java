package com.lets.platform.model.collection.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import com.lets.platform.model.collection.vo.DetectUnitExcelVo;
import com.lets.platform.model.collection.vo.MaterialExcelVo;
import com.lets.platform.model.collection.vo.PowerSourceExcelVo;
import com.lets.platform.model.collection.vo.PressureLevelExcelVo;
import org.springframework.util.StringUtils;

public enum DetectUnitEnum implements IEnum<Object> {

    CALIBER("1","口径单位匹配配置" ,"口径","117cbfd4-44ac-49c8-aa19-d3162c287359", DetectUnitExcelVo.class),
    PRESSURE("2", "压力单位匹配配置","压力","b07ec6f8-3b74-4552-b470-7659ad06f9ff",DetectUnitExcelVo.class),
    POWER_SOURCE("3", "驱动方式匹配配置","驱动方式","10d59898-ed39-48a8-89d7-e4c7a138ccb1", PowerSourceExcelVo.class),
    PRESSURE_LEVEL("4", "压力等级匹配配置","压力等级","ae5039dc-16e8-4c2e-98bf-80b6de7da69e", PressureLevelExcelVo.class),
    MATERIAL("5", "材质匹配配置","材质","8c8c6b10-227f-4614-927e-8bb650bb0ce9", MaterialExcelVo.class)
    ;

    private String value;
    private String menuName;
    private String name;
    private String menuCode;
    private Class<?> clazz;

    DetectUnitEnum(String value,String menuName, String name, String menuCode,Class<?> clazz) {
        this.value = value;
        this.name = name;
        this.menuCode = menuCode;
        this.menuName=menuName;
        this.clazz=clazz;
    }

    @Override
    public String getValue() {
        return value;
    }

    public static String getValue(String menuCode){
        if (StringUtils.isEmpty(menuCode)) {
            return null;
        }
        for (DetectUnitEnum element : DetectUnitEnum.values()) {
            if (menuCode.equals(element.getMenuCode())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static Class<?> getClazz(String menuCode){
        if (StringUtils.isEmpty(menuCode)) {
            return null;
        }
        for (DetectUnitEnum element : DetectUnitEnum.values()) {
            if (menuCode.equals(element.getMenuCode())) {
                return element.getClazz();
            }
        }
        return null;
    }

    public static String getMenuName(String menuCode){
        if (StringUtils.isEmpty(menuCode)) {
            return null;
        }
        for (DetectUnitEnum element : DetectUnitEnum.values()) {
            if (menuCode.equals(element.getMenuCode())) {
                return element.getMenuName();
            }
        }
        return null;
    }

    public String getMenuCode() {
        return menuCode;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (DetectUnitEnum element : DetectUnitEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }



    public String getMenuName(){
        return menuName;
    }

    public String getName() {
        return name;
    }
    public Class<?> getClazz() {
        return clazz;
    }
}

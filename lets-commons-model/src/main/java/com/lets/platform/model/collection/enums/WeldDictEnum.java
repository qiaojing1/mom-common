package com.lets.platform.model.collection.enums;

import org.springframework.util.StringUtils;

/**
 * @ClassName WeldDictEnum
 * @Description 焊接数据字典
 * @Author CHEN SHAOYONG
 * @Date 2023/1/6 13:51
 * @Version 1.0
 */
public enum WeldDictEnum {
    MATERIAL("1","母材材质","material"),
    WELD_DIAM("2","焊材直径","weld_diam"),
    PROCESS_CODE("3","工艺编号","process_number"),
    WELD_STANDARDS("4","焊接标准","weld_standards"),
    WELD_METHOD("5","焊接方法","weld_method"),
    WELD_TYPE("6","焊接类型","weld_type"),
    WELD_THICK("7","焊接厚度","weld_thick"),
    WELD_LAYER("8","焊层","weld_layer"),
    WELD_MATERIAL("9","焊材","weld_material"),
    WELD_POSITION("10","焊接位置","weld_position"),
    MATERIAL_THICK("11","母材厚度","material_thick");

    private String value;
    private String name;
    private String fieldName;

    WeldDictEnum(String value,String name,String fieldName){
        this.name=name;
        this.value=value;
        this.fieldName=fieldName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (WeldDictEnum element : WeldDictEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static String getFieldName(String value){
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (WeldDictEnum element : WeldDictEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getFieldName();
            }
        }
        return null;
    }


    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}

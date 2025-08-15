package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 * CAD解析A3字段
 * @author DING WEI
 * @date 2025/4/7 15:30
 * @version 1.0
 */
public enum CadA3FieldEnum implements IEnum<Object> {

    MATERIAL_CODE("materialCode", "物料编码", "code"),
    MATERIAL_NAME("materialName", "物料名称", "name"),
    MATERIAL_SPECS("materialSpecs", "规格型号", "specs"),
    MATERIAL_TYPE("materialType", "物料类型", "type"),
    DRAWING_NUMBER("drawingNumber", "图号", "drawing_number"),
    MAIN_MATERIAL("mainMaterial", "主材质", "main_material"),
    NET_WEIGHT("netWeight", "净重", "net_weight"),
    NUMBER("number", "数量"),
    ;

    private String value;

    @Getter
    private String name;
    @Getter
    private String materialField;

    CadA3FieldEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    CadA3FieldEnum(String value, String name, String materialField) {
        this.value = value;
        this.name = name;
        this.materialField = materialField;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (CadA3FieldEnum element : CadA3FieldEnum.values()) {
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
        for (CadA3FieldEnum element : CadA3FieldEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static String getMaterialField(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (CadA3FieldEnum element : CadA3FieldEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getMaterialField();
            }
        }
        return null;
    }


    @Override
    public String getValue() {
        return value;
    }

}

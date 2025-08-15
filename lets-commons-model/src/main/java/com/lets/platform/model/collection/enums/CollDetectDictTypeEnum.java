package com.lets.platform.model.collection.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import com.lets.platform.model.collection.vo.*;
import org.springframework.util.StringUtils;

import java.util.Objects;

/**
 * 试压字典菜单
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/10/30 15:23
 */
public enum CollDetectDictTypeEnum implements IEnum<Object> {

    VALVE_TYPE("2be97327-e908-469f-8755-05258206e80b", "阀门类型", "阀门类型", "", "1", CollValveTypeExcelVo.class),
    VALVE_CLASSIFY("ba0c440c-6f54-46b6-90ac-ea3ddde1d43c", "阀门分类", "阀门分类", "", "2", CollValveClassificationExcelVo.class),
    CALIBER("9bf6e827-c241-425a-b590-86e936e7cd82", "口径", "口径(DN)", "口径(NPS)", "3", CollCaliberExcelVo.class),
    STANDARD("f9fb20a4-0742-4828-b792-5dfdaf36e182", "标准", "标准", "", "4", CollValveStandardExcelVo.class),
    PRESSURE("f76ae18a-a8f9-4ada-862a-f1281f008aa6", "压力", "压力(PN)", "压力(CLASS)", "5", CollPressureExcelVo.class),
    MEDIA("8d2dad5d-3eec-4b27-8760-5328327996b9", "介质", "介质", "", "6", CollMediumExcelVo.class),
    CONDITION("1b9cbaf2-dc5a-4410-a5a4-96023c3cb10f", "工况", "工况", "", "7", CollValveWorkConditionExcelVo.class),
    VALVE_MATERIAL("4ed022f8-8667-48f8-b6b8-30b5df126b64", "材质", "材质", "", "8", CollMaterialQualityExcelVo.class),
    PROJECT("43c25457-0ed0-42b0-9747-07bd4dc01942", "试验项目", "试验项目", "", "9", CollTestItemsExcelVo.class),
    DEFECT_CAUSE("13bfb4a6-2cc0-46e0-a7f7-e3193bb8c004", "不良原因", "不良原因", "", "10", CollAdverseCausesExcelVo.class),
    LEAKAGE_LEVEL("e164ba07-f049-4225-9a37-e512e31d5393", "泄漏等级", "泄漏等级", "", "11", CollLeakageLevelExcelVo.class),
    LEAKAGE_UNIT("2c91e4f7-129e-4d75-a62f-7fc3d22eb4be", "泄漏率单位", "泄漏率单位", "", "12", CollLeakageRateUnitExcelVo.class),
    PRESSURE_SIGN("e1e705e5-fb4a-4312-94e1-f6ec8da76217", "压力符号", "压力符号", "", "13", PressureSignExcelVo.class),
    ;

    private String value;

    private String name;
    private String name2;

    private String menuCode;
    private String menuName;

    private Class<?> excelClass;

    CollDetectDictTypeEnum(String menuCode, String menuName, String name, String name2, String value, Class<?> excelClass) {
        this.value = value;
        this.name = name;
        this.name2 = name2;
        this.menuCode = menuCode;
        this.menuName = menuName;
        this.excelClass = excelClass;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (CollDetectDictTypeEnum element : CollDetectDictTypeEnum.values()) {
            if (name.equals(element.getName()) || name.equals(element.getMenuCode())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (CollDetectDictTypeEnum element : CollDetectDictTypeEnum.values()) {
            if (value.equals(element.getValue()) || value.equals(element.getMenuCode())) {
                return element.getName();
            }
        }
        return null;
    }

    public static String getName2(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (CollDetectDictTypeEnum element : CollDetectDictTypeEnum.values()) {
            if (value.equals(element.getValue()) || value.equals(element.getMenuCode())) {
                return element.getName2();
            }
        }
        return null;
    }

    public static String getMenuNameByCode(String menuCode) {
        if (StringUtils.isEmpty(menuCode)) {
            return null;
        }
        for (CollDetectDictTypeEnum element : CollDetectDictTypeEnum.values()) {
            if (menuCode.equals(element.getMenuCode())) {
                return element.getMenuName();
            }
        }
        return null;
    }

    public static Class<?> getClassByMenuCode(String menuCode) {
        if (StringUtils.isEmpty(menuCode)) {
            return null;
        }
        for (CollDetectDictTypeEnum element : CollDetectDictTypeEnum.values()) {
            if (menuCode.equals(element.getMenuCode())) {
                return element.getExcelClass();
            }
        }
        return null;
    }

    public static Class<?> getClassByMenuValue(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (CollDetectDictTypeEnum element : CollDetectDictTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getExcelClass();
            }
        }
        return null;
    }

    public static boolean containsTargetObj(Class<?> clazz) {
        if (Objects.isNull(clazz)) {
            return false;
        }
        for (CollDetectDictTypeEnum element : CollDetectDictTypeEnum.values()) {
            if (clazz.equals(element.getExcelClass())) {
                return true;
            }
        }
        return false;
    }

    public static CollDetectDictTypeEnum getSelfByValue(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (CollDetectDictTypeEnum element : CollDetectDictTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element;
            }
        }
        return null;
    }

    /**
     * 判断是否包含入参value
     *
     * @return
     */
    public static boolean containsValue(String value) {
        if (StringUtils.isEmpty(value)) {
            return false;
        }
        boolean res = false;
        for (CollDetectDictTypeEnum element : CollDetectDictTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                res = true;
                break;
            }
        }
        return res;
    }

    public static String getNameByMenuCode(String menuCode) {
        if (StringUtils.isEmpty(menuCode)) {
            return null;
        }
        for (CollDetectDictTypeEnum element : CollDetectDictTypeEnum.values()) {
            if (menuCode.equals(element.getMenuCode())) {
                return element.getName();
            }
        }
        return null;
    }

    public static String getValueByMenuCode(String menuCode) {
        if (StringUtils.isEmpty(menuCode)) {
            return null;
        }
        for (CollDetectDictTypeEnum element : CollDetectDictTypeEnum.values()) {
            if (menuCode.equals(element.getMenuCode())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static CollDetectDictTypeEnum getByMenuCode(String menuCode) {
        if (StringUtils.isEmpty(menuCode)) {
            return null;
        }
        for (CollDetectDictTypeEnum element : CollDetectDictTypeEnum.values()) {
            if (menuCode.equals(element.getMenuCode())) {
                return element;
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

    public String getName2() {
        return name2;
    }

    public String getMenuCode() {
        return menuCode;
    }

    public Class<?> getExcelClass() {
        return excelClass;
    }

    public String getMenuName() {
        return menuName;
    }
}

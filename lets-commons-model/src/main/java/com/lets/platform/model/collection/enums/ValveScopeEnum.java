package com.lets.platform.model.collection.enums;

import cn.hutool.core.text.CharSequenceUtil;
import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.Objects;

/**
 * @author zhangweiyan
 * @ClassName ValveScopeEnum
 * @Description 阀门分类应用范围
 * @Date 2024/1/8 15:21
 **/
public enum ValveScopeEnum implements IEnum<Object> {
    Holding_Time("1", "保压时长"),
    Sealing_Leakage_Rate_Test("2", "密封试验泄漏率"),
    Routine_Performance_Test("3", "常规性能试验"),
    Evasive_Leakage_Test("4", "逸散性泄漏试验"),
    Low_Temperature_Sealing_Test("5", "低温密封试验"),
    Cleanliness_Performance_Test("6", "洁净性能试验"),
    Movement("7", "动作试验"),
    Press("8", "压力试验"),
    Life("9", "寿命试验"),
    Flow("10", "流阻试验"),
    Hot("11", "热水试验"),
    Inspect("12", "检验"),
    ;

    private String value;

    private String name;

    ValveScopeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String getValue() {
        return value;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (ValveScopeEnum element : ValveScopeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static String getValueByName(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ValveScopeEnum element : ValveScopeEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    /**
     * 判断是否包含入参value
     * @return
     */
    @SuppressWarnings("Duplicates")
    public static boolean containsValue(String value) {
        if (StringUtils.isEmpty(value)) {
            return false;
        }
        boolean res = false;
        for (ValveScopeEnum element : ValveScopeEnum.values()) {
            if (value.equals(element.getName())) {
                res = true;
                break;
            }
        }
        return res;
    }

    /**
     * 判断是否包含入参name
     * @return
     */
    @SuppressWarnings("Duplicates")
    public static boolean containsName(String name) {
        if (StringUtils.isEmpty(name)) {
            return false;
        }
        boolean res = false;
        for (ValveScopeEnum element : ValveScopeEnum.values()) {
            if (name.equals(element.getName())) {
                res = true;
                break;
            }
        }
        return res;
    }

    public static String getValueScope(TestTypeEnum menu){
        if(Objects.isNull(menu)){
            return null;
        }
        switch (menu){
            case ROUTINE:
                return Routine_Performance_Test.getValue();
            case CLEAN:
                return Cleanliness_Performance_Test.getValue();
            case MOVEMENT:
                return Movement.getValue();
            case LOW_TEMP_SEAL:
                return Low_Temperature_Sealing_Test.getValue();
            case EVASIVE_LEAKAGE:
                return Evasive_Leakage_Test.getValue();
            case PRESSURE:
                return Press.getValue();
            case LIFE:
                return Life.getValue();
            case FLOW:
                return Flow.getValue();
            case HOT:
                return Hot.getValue();
        }
        return null;
    }

    public String getName() {
        return name;
    }
}

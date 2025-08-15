package com.lets.platform.model.collection.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import com.lets.platform.common.pojo.exception.LetsException;
import com.lets.platform.model.collection.entity.CollectionEvasiveLeakageTest;
import com.lets.platform.model.collection.entity.CollectionLifeTest;
import com.lets.platform.model.collection.entity.CollectionRoutinePerformanceTest;
import com.lets.platform.model.collection.vo.CollectionFlowTestExcelVo;
import com.lets.platform.model.collection.vo.LowTempExcelVo;
import com.lets.platform.model.collection.vo.MovementTestExcelVo;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @ClassName TestTypeEnum
 * @Description 测试类型
 * @Author CHEN SHAOYONG
 * @Date 2023/1/12 15:41
 * @Version 1.0
 */
public enum TestTypeEnum implements IEnum<Object> {
    ROUTINE("1", "常规性能试验", "7e1d1d62-e424-4704-9f25-6da9b26e813f", CollectionRoutinePerformanceTest.class, "collection_routine_performance_test"),
    EVASIVE_LEAKAGE("5", "逸散性泄漏试验", "", CollectionEvasiveLeakageTest.class, "collection_evasive_leakage_test"),
    LOW_TEMP_SEAL("2", "低温密封试验", "a161d67e-f61e-4104-9be3-dfb38ee37166", LowTempExcelVo.class, "collection_routine_performance_test"),
    CLEAN("3", "洁净性能试验", "0651f68b-23ce-4f41-8bb8-d20bdd48e013", CollectionRoutinePerformanceTest.class, "collection_routine_performance_test"),
    MOVEMENT("4", "动作试验", "0a960a99-b2ac-438e-b757-37f7820b5376", MovementTestExcelVo.class, "collection_routine_performance_test"),
    PRESSURE("8", "压力试验", "fa588f8f-f1b4-464c-bfb4-41b5451c55e7", null, "collection_pressure_test"),
    LIFE("6", "寿命试验", "f4de230f-d4e3-4806-bcea-783ad99121f8", CollectionLifeTest.class, "collection_life_test"),
    FLOW("7", "流阻试验", "8d977759-9bc7-4620-a97f-9994a603fcf2", CollectionFlowTestExcelVo.class, "collection_life_test"),
    HOT("9", "热水试验", "85b46336-e1f1-46d1-b01e-3590b282f9ba", CollectionFlowTestExcelVo.class, "collection_life_test"),
    ;

    private String value;
    private String name;
    private String menuCode;
    @Getter
    private String tableName;
    private Class<?> clazz;

    TestTypeEnum(String value, String name, String menuCode, Class<?> clazz, String tableName) {
        this.name = name;
        this.menuCode = menuCode;
        this.value = value;
        this.tableName = tableName;
        this.clazz = clazz;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (TestTypeEnum element : TestTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static Class<?> getClazz(String menuCode) {
        if (StringUtils.isEmpty(menuCode)) {
            return null;
        }
        for (TestTypeEnum element : TestTypeEnum.values()) {
            if (menuCode.equals(element.getMenuCode())) {
                return element.getClazz();
            }
        }
        return null;
    }

    public static String getValueByMenuCode(String menuCode) {
        if (StringUtils.isEmpty(menuCode)) {
            return null;
        }
        for (TestTypeEnum element : TestTypeEnum.values()) {
            if (menuCode.equals(element.getMenuCode())) {
                return element.getValue();
            }
        }
        return null;
    }


    public static String getNameByMenuCode(String menuCode) {
        if (StringUtils.isEmpty(menuCode)) {
            return null;
        }
        for (TestTypeEnum element : TestTypeEnum.values()) {
            if (menuCode.equals(element.getMenuCode())) {
                return element.getName();
            }
        }
        return null;
    }

    public static TestTypeEnum getSelfByMenuCode(String menuCode) {
        if (StringUtils.isEmpty(menuCode)) {
            return null;
        }
        for (TestTypeEnum element : TestTypeEnum.values()) {
            if (menuCode.equals(element.getMenuCode())) {
                return element;
            }
        }
        return null;
    }

    public static TestTypeEnum getSelfByValue(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (TestTypeEnum element : TestTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element;
            }
        }
        throw new LetsException(0, "指定试验类型不存在");
    }

    public static TestTypeEnum getSelfByName(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (TestTypeEnum element : TestTypeEnum.values()) {
            if (name.equals(element.getName())) {
                return element;
            }
        }
        throw new LetsException(0, "指定试验类型不存在");
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (TestTypeEnum element : TestTypeEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        throw new LetsException(0, "指定试验类型不存在");
    }

    public static boolean containRoutine(String name) {
        if (StrUtil.isEmpty(name)) {
            return false;
        }
        for (TestTypeEnum element : Arrays.stream(TestTypeEnum.values())
                .filter(x -> !(x.equals(TestTypeEnum.EVASIVE_LEAKAGE) || x.equals(TestTypeEnum.MOVEMENT))).collect(Collectors.toSet())) {
            if (name.equals(element.getName())) {
                return true;
            }
        }
        return false;
    }

    public static String getValveScopeByMenuCode(String menuCode) {
        TestTypeEnum selfByMenuCode = getSelfByMenuCode(menuCode);
        if (Objects.isNull(selfByMenuCode)) {
            return null;
        }
        switch (selfByMenuCode) {
            case LIFE:
                return ValveScopeEnum.Life.getValue();
            case FLOW:
                return ValveScopeEnum.Flow.getValue();
            case HOT:
                return ValveScopeEnum.Hot.getValue();
            default:
                return null;
        }
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public String getMenuCode() {
        return menuCode;
    }

    public Class<?> getClazz() {
        return clazz;
    }
}

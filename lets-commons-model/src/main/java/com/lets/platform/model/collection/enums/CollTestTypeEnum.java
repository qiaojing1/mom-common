package com.lets.platform.model.collection.enums;

/**
 * @author zhangweiyan
 * @ClassName CollTestTypeEnum
 * @Description 试验类型
 * @Date 2024/1/27 14:49
 **/
public enum CollTestTypeEnum {
    RoutinePerformanceTest("1", "常规性能试验", ""),
    ;

    private String code;

    private String name;

    private String menuCode;

    CollTestTypeEnum(String code, String name, String menuCode) {
        this.code = code;
        this.name = name;
        this.menuCode = menuCode;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getMenuCode() {
        return menuCode;
    }
}

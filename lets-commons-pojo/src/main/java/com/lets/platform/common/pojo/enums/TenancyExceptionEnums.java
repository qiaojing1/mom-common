package com.lets.platform.common.pojo.enums;

/**
 * 处理状态枚举类
 *
 * @Author DING WEI
 * @Date 2021/04/23 13:50
 * @Version 1.0
 **/
public enum TenancyExceptionEnums implements EnumUnit<TenancyExceptionEnums> {
    /**
     * PARENT_CODE_IS_NOT_EXIST
     */
    BEGIN_TIME_IS_AFTER_END_TIME("TENANCY.BEGIN_TIME_IS_AFTER_END_TIME", "开始时间不能大于结束时间"),
    ;
    private final String code;
    private final String desc;

    private TenancyExceptionEnums(String code, String desc) {
        this.desc = desc;
        this.code = code;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getDescription() {
        return desc;
    }

}

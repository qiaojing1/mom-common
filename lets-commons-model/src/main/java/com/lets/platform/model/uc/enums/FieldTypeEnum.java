package com.lets.platform.model.uc.enums;

/**
 * 目录或程序;
 *
 * @author Qiao
 * @Date 2017年10月18日
 */
public enum FieldTypeEnum {
    LIST_FIELD(0, "列表字段"),
    FORM_FIELD(1, "表单字段");

    private final Integer code;
    private final String desc;

    private FieldTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static FieldTypeEnum getEnumByCode(Integer code) {
        if (code == 0)
            return LIST_FIELD;
        else if (code == 1)
            return FORM_FIELD;
        return null;
    }

    public Integer getCode() {
        return code;
    }

    public String getDescription() {
        return desc;
    }

}

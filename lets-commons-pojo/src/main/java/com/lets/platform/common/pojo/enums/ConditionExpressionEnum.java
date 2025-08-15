package com.lets.platform.common.pojo.enums;

import org.springframework.util.StringUtils;

/**
 * ConditionEnum
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/4/18 14:13
 */
public enum ConditionExpressionEnum implements IEnum<Object> {

    EQUALS("=", "等于"),
    NOT_EQUALS("<>", "不等于"),
    LIKE("like", "模糊查询"),
    NOT_LIKE("notLike", "模糊查询没有这个关键字"),
    LEFT_LIKE("leftLike", "以什么结尾"),
    RIGHT_LIKE("rightLike", "以什么开头"),
    LT("<", "小于"),
    LE("<=", "小于等于"),
    GT(">", "大于"),
    GE(">=", "大于等于"),
    IN("in", "范围"),
    IN_SQL("inSql", "把参数放入in后面的()中"),
    NOT_IN("notIn", "不在范围"),
    NOT_IN_SQL("notInSql", "把参数放入not in后面的()中"),
    BETWEEN("between", "在...中"),
    IS_NULL("isNull", "为空，传的时候value随便给个值"),
    IS_NOT_NULL("isNotNull", "不为空，传的时候value随便给个值"),
    ;

    private final String value;

    private final String describe;

    ConditionExpressionEnum(String value, String describe) {
        this.value = value;
        this.describe = describe;
    }

    public static ConditionExpressionEnum getEnumByValue(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (ConditionExpressionEnum element : ConditionExpressionEnum.values()) {
            if (value.equals(element.getValue())) {
                return element;
            }
        }
        return null;
    }

    public static String getDescribeByValue(String value) {
        if (StringUtils.isEmpty(value)) {
            return value;
        }
        for (ConditionExpressionEnum element : ConditionExpressionEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getDescribe();
            }
        }
        return null;
    }

    public static String getValueByName(String name) {
        if (StringUtils.isEmpty(name)) {
            return name;
        }
        for (ConditionExpressionEnum element : ConditionExpressionEnum.values()) {
            if (name.equals(element.getDescribe())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static boolean containsName(String name) {
        if (StringUtils.isEmpty(name)) {
            return false;
        }
        for (ConditionExpressionEnum element : ConditionExpressionEnum.values()) {
            if (name.equals(element.getDescribe())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getDescribe() {
        return describe;
    }
}

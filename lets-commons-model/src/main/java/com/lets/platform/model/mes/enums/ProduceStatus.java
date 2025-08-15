package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 生产状态
 * @author Qiao
 * @date 9/17/21 10:52
 * @version 1.0
 */
public enum ProduceStatus implements IEnum<Object> {

    NOT("0", "未转计划"),
    WAIT("1", "待下发"),
    ING("2", "生产中"),
    ALREADY("3", "已下发"),
    SUSPEND("4", "已暂停"),
    CANCLE("5", "已取消"),
    FINISH("6", "已完成"),
    FORCEFINISH("7", "强制完成"),
    CLOSE_THE_CASE("8", "结案"),
    ;

    private String value;

    private String name;

    ProduceStatus(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ProduceStatus element : ProduceStatus.values()) {
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
        for (ProduceStatus element : ProduceStatus.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
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

}

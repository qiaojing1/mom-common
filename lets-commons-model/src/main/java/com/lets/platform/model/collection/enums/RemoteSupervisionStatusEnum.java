package com.lets.platform.model.collection.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 图表类型 枚举
 *
 * @ClassName RelationTypeEnum
 * @author: QIAO JING
 * @create: 2021/12/07 13:32
 * @Version 1.0
 **/
public enum RemoteSupervisionStatusEnum implements IEnum<Object> {

    ENABLE("1", "开启"),
    TEMP("2", "暂时开启"),
    CLOSE("3", "关闭"),
    ;

    private String value;

    private String name;

    RemoteSupervisionStatusEnum(String value, String name) {
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
        for (RemoteSupervisionStatusEnum element : RemoteSupervisionStatusEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }
}

package com.lets.platform.model.uc.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 菜单类型 枚举
 *
 * @author DING WEI
 * @version 1.0
 * @date 2021/4/30 17:55
 **/
public enum MenuKindEnum implements IEnum<Object> {

    WEB("0", "web端"),
    WECHAT_APPLET("1", "微信小程序"),
    STATION_MACHINE("2", "工位机"),
    MOBILE_APP("3", "app"),
    ;

    private final String code;
    private final String desc;

    MenuKindEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static String getDesc(String code) {
        if (StringUtils.isEmpty(code)) {
            return null;
        }
        for (MenuKindEnum element : MenuKindEnum.values()) {
            if (code.equals(element.getValue())) {
                return element.getDescription();
            }
        }
        return null;
    }

    @Override
    public String getValue() {
        return code;
    }

    public String getDescription() {
        return desc;
    }

}

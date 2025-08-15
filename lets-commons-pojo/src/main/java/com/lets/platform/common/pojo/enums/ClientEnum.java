package com.lets.platform.common.pojo.enums;

import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 * 登陆端 枚举
 *
 * @author DING WEI
 * @version 1.0
 * @date 2021/4/30 17:55
 **/
public enum ClientEnum implements IEnum<Object> {

    WEB_MOM(0, "0", "mom_web", "web端"),
    WECHAT_APPLET(1, "1", "wechat_applet", "微信小程序"),
    STATION_MACHINE(2, "2", "station_machine", "工位机"),
    MOBILE_APP(3, "3", "mobile_app", "APP"),
    VPTMS_MACHINE(4, "4", "vptms_machine", "试压工位机"),
    EXT(5, "5", "ext", "外部系统"),
    XXL_JOB(6, "6", "xxl_job", "定时任务调度中心"),
    MRP(7, "7", "mrp", "mrp运算"),
    FLOWABLE(8, "8", "flowable", "工作流自动处理"),
    ;
    private final Integer intValue;
    private final String code;
    @Getter
    private final String clientId;
    private final String desc;

    ClientEnum(Integer intValue, String code, String clientId, String desc) {
        this.intValue = intValue;
        this.code = code;
        this.clientId = clientId;
        this.desc = desc;
    }

    public static String getClientTypeById(String clientId) {
        if (StringUtils.isEmpty(clientId)) {
            return null;
        }
        for (ClientEnum element : ClientEnum.values()) {
            if (clientId.equals(element.getClientId())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static String getDesc(String code) {
        if (StringUtils.isEmpty(code)) {
            return null;
        }
        for (ClientEnum element : ClientEnum.values()) {
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

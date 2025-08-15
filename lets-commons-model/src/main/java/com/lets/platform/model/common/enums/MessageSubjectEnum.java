package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 消息主题 枚举
 * @author DING WEI
 * @date 2022/12/20 16:28
 * @version 1.0
 */
public enum MessageSubjectEnum implements IEnum<Object> {

    ALARM("1", "告警", "", ""),
    WARN("2", "预警", "", ""),
    COLLECTION_ERROR("3", "采集器异常", "%s-%s-%s异常掉线，请及时联系相关运维人员处理", "%s-%s-%s异常掉线恢复，请悉知"),
    SERVER_ERROR("4", "服务异常", "%s服务出现异常, 无法正常使用, 请及时联系相关运维人员处理", "%s服务异常恢复, 可以正常使用, 请悉知"),
    SYS_ERROR("5", "系统异常", "时序数据库写入异常，请及时联系相关运维人员处理", "时序数据库写入异常恢复，请悉知"),
    TPM_ORDER("6", "TPM工单预警", "", ""),
    PREPARE_STORE("7", "备件库存预警", "", ""),
    DIE_ORDER("8", "模治具工单预警", "", ""),
    SE_WARN("9", "安环预警", "", ""),
    WORK_FLOW("10", "审批工作流", "", ""),
    REAL_TIME_DATA("11", "实时数据", "", ""),
    BUSINESS_FLOW("12", "业务流", "", ""),
    LOCK_STATUS("13", "设备解锁状态", "", ""),
    SCAN_CODE_STATUS("14", "设备扫码状态", "", ""),
    MRP_NOTIFY("15", "MRP通知", "", ""),
    JOINT_NOTIFY("16", "对接通知", "", ""),
    SCAN_ORDER_NOTICE_OTHER_HMI("17", "扫码通知其他工位机", "", ""),
    LOG_OUT("18", "退出登录", "", ""),
    ;

    private String value;

    private String name;

    private String startMessageTemp;
    private String endMessageTemp;

    MessageSubjectEnum(String value, String name, String startMessageTemp, String endMessageTemp) {
        this.value = value;
        this.name = name;
        this.startMessageTemp = startMessageTemp;
        this.endMessageTemp = endMessageTemp;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (MessageSubjectEnum element : MessageSubjectEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue().toString();
            }
        }
        return null;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (MessageSubjectEnum element : MessageSubjectEnum.values()) {
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

    public String getStartMessageTemp() {
        return startMessageTemp;
    }

    public String getEndMessageTemp() {
        return endMessageTemp;
    }

}

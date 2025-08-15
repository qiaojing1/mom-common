package com.lets.platform.model.tpm.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;
/**
 * 消息模版 枚举
 * @ClassName TpmMsgTempEnums
 * @author: DING WEI
 * @create: 2021/01/14 18:01
 * @Version 1.0
 **/
public enum TpmMsgTempEnums implements IEnum<Object> {

    ORDER_WARN_MSG("orderWarnMsg", "工单预警消息模版", "[{type}提醒-{status}] 已超时 {durationTime}分钟,单号:[{order}];{pushTime}"),
    STORAGE_STOCK_WARN_MSG("storageStockWarnMsg", "备件库存预警消息模版", "[备件安全库存提醒]剩余量已小于安全库存;备件:{sparePart};{pushTime}"),
    DIE_LIFE_WARN_MSG("dieLifeWarnMsg", "模治具寿命预警消息模版", "[模治具寿命提醒] 模治具:[{dieSign}]剩余寿命即将耗尽;请及时处理;{pushTime}"),
    DEVICE_FAULT_MSG("deviceFaultMsg", "设备故障消息模板", "您有一条[维修工单]{taskType},单号:[{order}];{factoryModeName};{deviceName}([{deviceCode}])出现[{fault}],请及时处理;{pushTime}"),
    DEVICE_REPORT_MSG("deviceReportMsg", "设备报修消息模板", "您有一条[报修工单]{taskType},单号:[{order}];{factoryModeName};{deviceName}([{deviceCode}])已维修完成,请及时审核;{pushTime}"),
    OTHER_FAULT_MSG("otherFaultMsg", "零星故障消息模板", "您有一条[维修工单]{taskType},单号:[{order}];{factoryModeName};出现[{fault}],请及时处理;{pushTime}"),
    OTHER_REPORT_MSG("otherReportMsg", "零星报修消息模板", "您有一条[报修工单]{taskType},单号:[{order}];{factoryModeName};已维修完成,请及时审核;{pushTime}"),
    SE_DEVICE_MSG("seDeviceMsg", "特种设备管理消息模板", "{deviceName}检测状态为{status}，请及时处理;{pushTime}"),
    SE_JOB_CERTIFICATE_MSG("seJobCertificateMsg", "特种作业证书消息模板", "{userName}-{code}证书状态为{status}，请及时处理;{pushTime}"),
    ;

    private String value;

    private String name;

    private String temp;

    @Override
    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public String getTemp() {
        return temp;
    }

    TpmMsgTempEnums(String value, String name, String temp) {
        this.value = value;
        this.name = name;
        this.temp = temp;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (TpmMsgTempEnums element : TpmMsgTempEnums.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static TpmMsgTempEnums getElement(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (TpmMsgTempEnums element : TpmMsgTempEnums.values()) {
            if (value.equals(element.getValue())) {
                return element;
            }
        }
        return null;
    }

}

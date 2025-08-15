package com.lets.platform.model.device.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 排序字段 枚举
 *
 * @ClassName OrderFieldEnum
 * @author: DING WEI
 * @create: 2021/04/27 13:32
 * @Version 1.0
 **/
public enum DeviceOrderFieldEnum implements IEnum<Object> {

    // lets_device 设备表
    DEVICE_DEFAULT("device_default", "m.device_code"),
    DEVICE_PRODUCTION_LINE_NAME("productionLineName", "m.production_line_id"),
    DEVICE_ASSETS_STATUS_NAME("assetsStatusName", "m.assets_status"),

    // lets_device_factory表相关
    DEVICE_FACTORY_DEFAULT("factory_default", "m.create_time"),
    DEVICE_FACTORY_UPDATE_TIME("updateTime", "m.update_time"),
    CODE("code", "m.mode_code"),
    // lets_device表相关
    DEVICE_ASSETS_STATUS("assetsStatus", "m.assets_status"),

    DEVICE_TYPE_NAME("typeName", "convert(m.type_name using gbk)"),
    DEVICE_MODEL_NAME("modelName", "convert(m.model_name using gbk)"),
    DEVICE_SUPPLIER_NAME("supplierName", "convert(m.supplier_name using gbk)"),
    DEVICE_MANUFACTURER_NAME("manufacturerName", "convert(m.manufacturer_name using gbk)"),
    DEVICE_CONTROLLER_NAME("controllerName", "convert(m.controller_name using gbk)"),
    ;

    // TODO 其他表字段

    private String value;

    private String field;

    DeviceOrderFieldEnum(String value, String field) {
        this.value = value;
        this.field = field;
    }

    @Override
    public String getValue() {
        return value;
    }

    public static String getOrderField(String value) {
        if (StringUtils.isEmpty(value)) {
            return DEVICE_FACTORY_DEFAULT.field;
        }
        for (DeviceOrderFieldEnum element : DeviceOrderFieldEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getField();
            }
        }
        return null;
    }

    public String getField() {
        return field;
    }
}

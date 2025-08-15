package com.lets.platform.common.pojo.enums;

import org.springframework.util.StringUtils;

/**
 * 系统参数code 枚举
 *
 * @ClassName ParamCodeEnum
 * @author: Qiao
 * @create: 2021/09/01 17:36
 * @Version 1.0
 **/
public enum ParamCodeEnum implements IEnum<Object> {

    SALESQUOTATION("salesQuotation", "启用销售报价管理"),

    ARRIVE_GOODS_MANAGER("arriveGoodsManager", "启用到货管理"),
    STOCK_OUT_APPLY_USER_CHECK("stockOutApplyUserCheck", "启用出库领用人校验"),
    QUALITY_CHECK_MANAGER("qualityCheckManager", "启用质量管理"),

    LINE_STORE_MANAGER_DIM("lineStoreManagerDim", "线边库管理维度"),

    PRODUCE_MANAGER("produceManager", "启用生产管理"),

    PRODUCE_PLAN("producePlan", "启用自动生成生产计划"),

    AUTO_CONFIRM("autoConfirm", "启用自动报修"),
    ENERGY_INTERVAL_WATER("energyIntervalWater", "能耗间隔-水"),
    ENERGY_INTERVAL_POWER("energyIntervalPower", "能耗间隔-电"),
    ENERGY_INTERVAL_GAS("energyIntervalGas", "能耗间隔-气"),

    SE_DEVICE_THRESHOLD("seOfDeviceThreshold", "设备检测预警阈值（天）"),
    SE_CERTIFICATE_THRESHOLD("seOfCertificateThreshold", "特种证书预警阈值（天）"),
    TIMELY_RESPONSE_TIME("timelyResponseTime", "及时响应时间"),
    ;
    private String value;
    private String description;

    ParamCodeEnum(String value, String description) {
        this.value = value;
        this.description = description;
    }

    public static String getSort(String value) {
        if (StringUtils.isEmpty(value)) {
            return value;
        }
        for (ParamCodeEnum element : ParamCodeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getDescription();
            }
        }
        return null;
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }
}

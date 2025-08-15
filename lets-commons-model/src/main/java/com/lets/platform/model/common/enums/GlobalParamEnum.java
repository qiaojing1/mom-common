package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import com.lets.platform.common.pojo.enums.YesOrNo;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;


/**
 * 全局参数 枚举
 *
 * @ClassName CodeTypeEnum
 * @author: DING WEI
 * @create: 2021/08/18 08:45
 * @Version 1.0
 **/
public enum GlobalParamEnum implements IEnum<Object> {

    /** Y启用N停用 默认启用 */
    SALES_QUOTATION("salesQuotation", "启用销售报价单管理", YesOrNo.YES.getValue(), "销售管理"),
    /** Y启用N停用 默认启用 */
    ARRIVE_GOODS_MANAGER("arriveGoodsManager", "启用到货管理", YesOrNo.YES.getValue(), "仓库管理"),
    /** Y启用 N停用 默认停用 启用质量管理 */
    QUALITY_CHECK_MANAGER("qualityCheckManager", "启用质量管理", YesOrNo.NO.getValue(), "质量管理"),
    /** Y启用 N停用 默认启用 出库申请人校验 */
    STOCK_OUT_APPLY_USER_CHECK("stockOutApplyUserCheck", "启用出库领用人校验", YesOrNo.NO.getValue(), "仓库管理"),
    /** Y启用N停用 默认停用 */
    PRODUCE_MANAGER("produceManager", "启用生产管理", YesOrNo.NO.getValue(), "生产管理"),
    /** 1工厂2车间3产线 */
    LINE_STORE_MANAGER_DIM("lineStoreManagerDim", "线边库管理维度", "2", "线边库管理"),
    /** Y启用 N停用 默认启用 自动生成生产计划 */
    PRODUCE_PLAN("producePlan", "启用自动生成生产计划", YesOrNo.YES.getValue(), "MRP管理"),
    /** Y启用 N停用 默认启用 启用自动报修 */
    AUTO_CONFIRM("autoConfirm", "启用自动报修", YesOrNo.YES.getValue(), "报修管理"),

    ERROR_OFFLINE_REMIND("errorOfflineRemind", "启用异常掉线提醒", YesOrNo.YES.getValue(), "采集管理"),
    /** 采集数据和服务时间 延时过大提醒 */
    DATA_DELAYED_REMIND("dataRelayedRemind", "启用数据延时提醒", YesOrNo.YES.getValue(), "采集管理"),
    LOGIN_OUT_TIME("loginOutTime", "客户端自动退出时间（min）", "100", "试压监测"),
    PRESSURE_RATE("pressureRate", "泄压百分比（%）", "0", "试压监测"),
    ENERGY_INTERVAL_WATER("energyIntervalWater", "能耗间隔-水", "1", "能耗间隔"),
    ENERGY_INTERVAL_POWER("energyIntervalPower", "能耗间隔-电", "1", "能耗间隔"),
    ENERGY_INTERVAL_GAS("energyIntervalGas", "能耗间隔-气", "1", "能耗间隔"),
    TIMELY_RESPONSE_TIME("timelyResponseTime", "及时响应时间", "15", "报修管理"),

    /** 安环管理 */
    SE_DEVICE_THRESHOLD("seOfDeviceThreshold", "设备检测预警阈值（天）", "30", "安环管理"),
    SE_CERTIFICATE_THRESHOLD("seOfCertificateThreshold", "特种证书预警阈值（天）", "30", "安环管理"),
    ;

    private String value;

    private String source;

    private String defaultValue;

    private String group;

    GlobalParamEnum(String value, String source, String defaultValue, String group) {
        this.value = value;
        this.source = source;
        this.defaultValue = defaultValue;
        this.group = group;
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getName() {
        return source;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public String getGroup() {
        return group;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (GlobalParamEnum element : GlobalParamEnum.values()) {
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
        for (GlobalParamEnum element : GlobalParamEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> findAllValue() {
        List<String> allValue = new ArrayList<>();
        for (GlobalParamEnum element : GlobalParamEnum.values()) {
            allValue.add(element.getValue());
        }
        return allValue;
    }
}

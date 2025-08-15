package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 机器人状态
 * @author Qiao
 * @date 9/17/21 10:52
 * @version 1.0
 */
public enum AgvStatusEnum implements IEnum<Object> {

    COMPLETED("1", "任务完成"),
    Executing("2", "任务执行中"),
    Abnormal("3", "任务异常"),
    Idle("4", "任务空闲"),
    stopped("5", "机器人暂停"),
    Lifting("6", "举升货架状态"),
    Charging("7", "充电状态"),
    Batteryarcing("8", "弧线行走中"),
    Fully("9", "充满维护"),
    Carried("11", "背货未识别"),
    Excessive("12", "货架偏角过大"),
    Motion("13", "运动库异常"),
    Unable("14", "货码无法识别"),
    mismatch("15", "货码不匹配"),
    normal("16", "举升异常"),
    abnormal("17", "充电桩异常"),
    increase("18", "电量无增加"),
    directive("20", "充电指令角度错误"),
    directiveError("21", "平台下发指令错误"),
    unloading("23", "外力下放"),
    Misaligned("24", "货架位置偏移"),
    Trolley("25", "小车不在锁定区"),
    failed("26", "下放重试失败"),
    Uneven("27", "货架摆歪"),
    low("28", "举升电池电量太低"),
    reversing("29", "后退角度偏大"),
    detected("30", "未背货架举升"),
    lock("31", "区域锁定失败"),
    Rotation("33", "旋转申请暂时失败"),
    maps("34", "地图切换点地码未识别"),
    ;

    private String value;

    private String name;

    AgvStatusEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (AgvStatusEnum element : AgvStatusEnum.values()) {
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
        for (AgvStatusEnum element : AgvStatusEnum.values()) {
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

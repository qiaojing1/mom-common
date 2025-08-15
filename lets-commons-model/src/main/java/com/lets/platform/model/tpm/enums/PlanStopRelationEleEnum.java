package com.lets.platform.model.tpm.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 计划停机关联要素[1:保养工单,2:点检工单,3:巡检工单]
 * @author DING WEI
 * @date 2024/12/17 15:01
 * @version 1.0
 */
public enum PlanStopRelationEleEnum implements IEnum<Object> {

    MAINTENANCE("1","保养工单", "randomReInspectCycleMain"),
    SPOT("2","点检工单", "randomReInspectCycleSpot"),
    INSPECTION("3", "巡检工单", ""),
    ;

    private String value;

    private String name;

    private String jobGroup;

    PlanStopRelationEleEnum(String value, String name, String jobGroup) {
        this.value = value;
        this.name = name;
        this.jobGroup = jobGroup;
    }

    public static PlanStopRelationEleEnum getEnum(String value) {
        for (PlanStopRelationEleEnum element : PlanStopRelationEleEnum.values()) {
            if (value.equals(element.getValue())) {
                return element;
            }
        }
        return null;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (PlanStopRelationEleEnum element : PlanStopRelationEleEnum.values()) {
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
        for (PlanStopRelationEleEnum element : PlanStopRelationEleEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getAllJobGroup() {
        List<String> allJobGroups = new ArrayList<>();
        allJobGroups.add(MAINTENANCE.getJobGroup());
        allJobGroups.add(SPOT.getJobGroup());
        return allJobGroups;
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public String getJobGroup() {
        return jobGroup;
    }
}

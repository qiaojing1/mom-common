package com.lets.platform.model.common.entity;

import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @ClassName CommonNoticeBaseInfo
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2023/12/1
 */
@Data
public class CommonNoticeBaseInfo {
    /** 预警规则 Map<String ruleId, CommonNoticeRule> */
    private Map<String, CommonNoticeRule> ruleMap;

    /** 预警关联设备以及消息配置 Map<String ruleId, NoticeRelationDeviceAndMessagePushConfig> */
    private Map<String, NoticeRelationDeviceAndMessagePushConfig> ruleDeviceAndMsgMap;

    /** 预警条件 Map<String ruleId, List<CommonNoticeCondition>> */
    private Map<String, List<CommonNoticeCondition>> ruleConditionMap;

    /** 最新预警记录 Map<String deviceId, CommonNoticeRecord> */
    private Map<String, CommonNoticeRecord> newestRecordMap;



    public Map<String, CommonNoticeRule> getRuleDoMapNotNull() {
        if (Objects.isNull(ruleMap)) {
            return new HashMap<>();
        }
        return ruleMap;
    }

    public Map<String, NoticeRelationDeviceAndMessagePushConfig> getRuleDeviceAndMsgMapNotNull() {
        if (Objects.isNull(ruleDeviceAndMsgMap)) {
            return new HashMap<>();
        }
        return ruleDeviceAndMsgMap;
    }

    public Map<String, List<CommonNoticeCondition>> getRuleConditionMapNotNull() {
        if (Objects.isNull(ruleConditionMap)) {
            return new HashMap<>();
        }
        return ruleConditionMap;
    }

    public Map<String, CommonNoticeRecord> getNewestRecordMapNotNull() {
        if (Objects.isNull(newestRecordMap)) {
            return new HashMap<>();
        }
        return newestRecordMap;
    }
}

package com.lets.platform.model.common.entity;

import lombok.Data;

import java.util.List;

/**
 * @ClassName NoticeRelationDeviceAndMessagePushConfig
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2023/12/1
 */
@Data
public class NoticeRelationDeviceAndMessagePushConfig {

    private String id;
    private String noticeRuleId;
    private List<String> deviceIds;
    private List<CommonSendConfig> sendConfigs;
    private String tenancyId;
}

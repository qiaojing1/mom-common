package com.lets.platform.model.common.domain;

import com.lets.platform.common.pojo.base.BaseDo;
import lombok.Data;

@Data
public class MessageConfDo extends BaseDo {
    private String configId;

    private String tenancyId;

    private String configType;

    private String configTypeName;

    private String cropId;

    private String agentId;

    private String secret;

    private String registerPhone;

    private String accessKeyId;

    private String accessKeySecret;

    private String isSsl;

    private String smtp;

    private String smtpPort;

    private String emailAccount;

    private String emailPassword;

    private String emailCharacter;

    private String configStatus;

    private String createUser;

    private Long createTime;

    private Long updateTime;

    private String updateUser;

}

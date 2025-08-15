package com.lets.platform.model.common.vo;

import com.lets.platform.common.pojo.base.BaseDo;
import lombok.Data;

/**
 * 消息配置
 *
 * @version 1.0
 * @ClassName MessageConfVo
 * @author: QIAO
 * @create: 2021/08/17 15:24
 **/
@Data
public class MessageConfVo extends BaseDo {
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
}

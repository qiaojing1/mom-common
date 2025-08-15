package com.lets.platform.model.common.dto;

import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.enums.StatusEnum;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.common.enums.MessageTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

/**
 * 消息配置传参对象
 *
 * @version 1.0
 * @ClassName MessageConfDto
 * @author: QIAO
 * @create: 2021/08/17 14:07
 **/
@Data
@ApiModel("消息配置传参对象")
public class MessageConfDto {
    @NotBlank(message = "MessageConfDto.id", groups = {Update.class})
    @ApiModelProperty("消息设置主键[U]")
    private String id;
    @ValidatedEnum(enumClass = MessageTypeEnum.class, message = "MessageConfDto.configType", groups = {Save.class, Update.class})
    @ApiModelProperty("消息类型 1:平台 2:企业微信 3:钉钉消息 4:短信 5:邮箱 6:电话语音")
    private String configType;
    @ApiModelProperty(hidden = true)
    private String configTypeName;
    @Length(max = 20, message = "MessageConfDto.cropId", groups = {Save.class, Update.class})
    @ApiModelProperty(value = "企业id", required = true)
    private String cropId;
    @Length(max = 20, message = "MessageConfDto.agentId", groups = {Save.class, Update.class})
    @ApiModelProperty(value = "agentId", required = true)
    private String agentId;
    @Length(max = 50, message = "MessageConfDto.secret", groups = {Save.class, Update.class})
    @ApiModelProperty(value = "secret", required = true)
    private String secret;
    @Length(max = 11, message = "MessageConfDto.registerPhone", groups = {Save.class, Update.class})
    @ApiModelProperty(value = "注册手机号", required = true)
    private String registerPhone;
    @Length(max = 30, message = "MessageConfDto.accessKeyId", groups = {Save.class, Update.class})
    @ApiModelProperty(value = "accessKeyId", required = true)
    private String accessKeyId;
    @Length(max = 30, message = "MessageConfDto.accessKeySecret", groups = {Save.class, Update.class})
    @ApiModelProperty(value = "accessKeySecret", required = true)
    private String accessKeySecret;
    @ApiModelProperty("邮件服务器是否要求加密连接(SSL)")
    private String isSsl;
    @Length(max = 20, message = "MessageConfDto.smtp", groups = {Save.class, Update.class})
    @ApiModelProperty(value = "发送邮件服务器地址(SMTP)", required = true)
    private String smtp;
    @Length(max = 20, message = "MessageConfDto.smtpPort", groups = {Save.class, Update.class})
    @ApiModelProperty(value = "服务器端口", required = true)
    private String smtpPort;
    @Length(max = 20, message = "MessageConfDto.emailAccount", groups = {Save.class, Update.class})
    @ApiModelProperty(value = "邮件发送帐号", required = true)
    private String emailAccount;
    @Length(max = 20, message = "MessageConfDto.emailPassword", groups = {Save.class, Update.class})
    @ApiModelProperty(value = "密码", required = true)
    private String emailPassword;
//    @Length(max = 2, message = "[邮件编码]长度0~2，输入：中文、字母、数字、符号", groups = {Save.class, Update.class})
    @ApiModelProperty("邮件编码")
    private String emailCharacter;
    @ValidatedEnum(enumClass = StatusEnum.class, message = "MessageConfDto.configStatus", groups = {Save.class, Update.class})
    @ApiModelProperty("状态：0:停用 1:启用")
    private String configStatus;
}

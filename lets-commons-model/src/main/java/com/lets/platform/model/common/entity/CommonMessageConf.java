package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.enums.StatusEnum;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.enums.MessageTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

/**
 * <p>
 * 消息配置
 * </p>
 *
 * @author qiaojing
 * @since 2023-07-05
 */
@Getter
@Setter
@TableName("common_message_conf")
@ApiModel(value = "CommonMessageConf对象", description = "消息配置")
public class CommonMessageConf extends BaseEntity {

    @ApiModelProperty("消息类型 1:平台 2:企业微信 3:钉钉消息 4:短信 5:邮箱 6:电话语音")
    @TableField("config_type")
    @ValidatedEnum(enumClass = MessageTypeEnum.class, message = "MessageConfDto.configType", groups = {Save.class, Update.class})
    private String configType;

    @ApiModelProperty("消息类型 1:平台 2:企业微信 3:钉钉消息 4:短信 5:邮箱 6:电话语音")
    @TableField("config_type_name")
    private String configTypeName;

    @ApiModelProperty("企业id  企业微信类型下此字段必填")
    @TableField("crop_id")
    @Length(max = 20, message = "MessageConfDto.cropId", groups = {Save.class, Update.class})
    private String cropId;

    @ApiModelProperty("agentId 企业微信类型下此字段必填")
    @TableField("agent_id")
    @Length(max = 20, message = "MessageConfDto.agentId", groups = {Save.class, Update.class})
    private String agentId;

    @ApiModelProperty("Secret 企业微信类型下此字段必填")
    @TableField("secret")
    @Length(max = 50, message = "MessageConfDto.secret", groups = {Save.class, Update.class})
    private String secret;

    @ApiModelProperty("注册手机号 短信类型下此字段必填")
    @TableField("register_phone")
    @Length(max = 11, message = "MessageConfDto.registerPhone", groups = {Save.class, Update.class})
    private String registerPhone;

    @ApiModelProperty("AccessKey ID 短信类型下此字段必填")
    @TableField("access_key_id")
    @Length(max = 30, message = "MessageConfDto.accessKeyId", groups = {Save.class, Update.class})
    private String accessKeyId;

    @ApiModelProperty("AccessKey Secret 短信类型下此字段必填")
    @TableField("access_key_secret")
    @Length(max = 30, message = "MessageConfDto.accessKeySecret", groups = {Save.class, Update.class})
    private String accessKeySecret;

    @ApiModelProperty("邮件服务器是否要求加密连接(SSL) Y:是  N:否 邮件类型下此字段必填")
    @TableField("is_ssl")
    private String isSsl;

    @ApiModelProperty("发送邮件服务器地址(SMTP) 邮件类型下此字段必填")
    @TableField("smtp")
    @Length(max = 20, message = "MessageConfDto.smtp", groups = {Save.class, Update.class})
    private String smtp;

    @ApiModelProperty("服务器端口 邮件类型下此字段必填")
    @TableField("smtp_port")
    @Length(max = 20, message = "MessageConfDto.smtpPort", groups = {Save.class, Update.class})
    private String smtpPort;

    @ApiModelProperty("邮件发送账号 邮件类型下此字段必填")
    @TableField("email_account")
    @Length(max = 20, message = "MessageConfDto.emailAccount", groups = {Save.class, Update.class})
    private String emailAccount;

    @ApiModelProperty("邮件发送密码 邮件类型下此字段必填")
    @TableField("email_password")
    @Length(max = 20, message = "MessageConfDto.emailPassword", groups = {Save.class, Update.class})
    private String emailPassword;

    @ApiModelProperty("邮件编码 1:utf8 2:简体中文 3:繁体中文 邮件类型下此字段必填")
    @TableField("email_character")
    private String emailCharacter;

    @ApiModelProperty("状态 0:禁用 1:启用")
    @ValidatedEnum(enumClass = StatusEnum.class, message = "MessageConfDto.configStatus", groups = {Save.class, Update.class})
    @TableField("enable")
    private String enable;
}

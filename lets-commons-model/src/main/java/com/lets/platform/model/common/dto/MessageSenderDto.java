package com.lets.platform.model.common.dto;

import com.alibaba.fastjson.JSONObject;
import com.lets.platform.common.pojo.enums.OtherSysEnum;
import com.lets.platform.model.common.domain.MessageInfoDo;
import com.lets.platform.model.uc.entity.SysUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

/**
 * 发送消息参数
 *
 * @version 1.0
 * @ClassName MessageSenderDto
 * @author: QIAO
 * @create: 2021/08/18 08:07
 **/
@Data
@ApiModel("发送消息参数")
public class MessageSenderDto {
    @ApiModelProperty("消息类型,可以支持多个  1:平台 2:企业微信 3:钉钉消息 4:短信 5:邮箱 6:电话语音")
    private List<String> messageTypes;

    @NotBlank(message = "MessageSenderDto.messageContent")
    @ApiModelProperty("消息内容")
    private String messageContent;
    @NotBlank(message = "MessageSenderDto.messageTitle")
    @ApiModelProperty("消息标题")
    private String messageTitle;
    @ApiModelProperty("钉钉群URL,可以支持多个,钉钉发送消息时需要传入")
    private List<String> dingDingUrls;
    @ApiModelProperty("用户,可以支持多个,需要传入")
    private List<SysUser> receiveUsers;
    @ApiModelProperty(hidden = true)
    private List<String> receiveUserIds;
    @ApiModelProperty("短信发送模板,短信和电话发送消息时需要传入")
    private String templateCode;
    @ApiModelProperty("短信发送模板参数,短信和电话发送消息需要传入,是一个json格式")
    private String templateParam;
    @ApiModelProperty("签名,短信发送消息需要传入")
    private String signName;
    @ApiModelProperty("被叫显号,电话发送消息需要传入")
    private String calledShowNumber;

    /**
     * @see com.lets.platform.common.pojo.enums.NotifyTypeEnum
     */
    @ApiModelProperty("平台标识,目前 告警1,询问2 留置3,通知4")
    private String platformSign;
    @ApiModelProperty("订单id")
    private String orderId;
    @ApiModelProperty("订单编号,根据需要传入")
    private String code;
    @ApiModelProperty("业务编码")
    private String bussCode;
    @ApiModelProperty("operUrl,前端用于判断哪个页面的功能")
    private String operUrl;
    private String tenancyId;
    private MessageInfoDo messageInfo;
    @ApiModelProperty(value = "流程实例ID", required = true)
    private String processInstanceId;
    @ApiModelProperty(value = "流程功能ID", required = true)
    private String moduleId;
    /**
     * 钉钉、企业微信 个性化格式的消息
     */
    private JSONObject dingdingJsonObject;
    private JSONObject wechatJsonObject;

    private String subject;

    private String isTodo;
    private String orderCategoryId;
    private String orderCategoryName;
    private String chatId; //企业微信是否发送群聊
    /**
     * 预警、告警：开始、结束
     * start、end
     */
    private String action;

    private String senderLoginId;

    private OtherSysEnum otherSysEnum;

    public void addReceiveUserId(String userId) {
        if (this.receiveUserIds == null) {
            this.receiveUserIds = new ArrayList<>();
        }
        this.receiveUserIds.add(userId);
    }
}

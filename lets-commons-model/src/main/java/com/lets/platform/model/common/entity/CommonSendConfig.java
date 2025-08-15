package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang.StringUtils;
import org.hibernate.validator.constraints.Length;

import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * 消息推送配置
 * </p>
 *
 * @author csy
 * @since 2023-11-30
 */
@Data
@TableName("common_send_config")
@ApiModel(value = "CommonSendConfig对象", description = "消息推送配置")
public class CommonSendConfig extends BaseEntity {

    @ApiModelProperty("消息名称")
    @TableField("name")
    @Length(min = 1, max = 20, message = "长度1~20，支持中文、字母、数字和常用符号", groups = {Save.class, Update.class})
    private String name;

    @ApiModelProperty("消息类型 1:平台 2:企业微信 3:钉钉消息 4:短信 5:邮箱 6:电话语音,多选,隔开")
    @TableField("send_way")
    private String sendWay;
    @TableField(exist = false)
    private String sendWayName;

    @ApiModelProperty("钉钉群url,推送方式为钉钉时必填")
    @TableField("url")
    private String url;

    @ApiModelProperty("推送类型 1:报警 2:预警 3:异常提醒")
    @TableField("send_type")
    private String sendType;
    @TableField(exist = false)
    private String sendTypeName;

    @ApiModelProperty("启用消息升级")
    @TableField("upgrade")
    private String upgrade;

    //开始时间(如08:23,存储为823)
    @ApiModelProperty(hidden = true)
    @TableField("start_time_int")
    private Integer startTimeInt;

    //结束时间(如08:23,存储为823)
    @ApiModelProperty(hidden = true)
    @TableField("end_time_int")
    private Integer endTimeInt;

    @ApiModelProperty("开始时间")
    @TableField("start_time")
    private String startTime;

    @ApiModelProperty("结束时间")
    @TableField("end_time")
    private String endTime;

    //开始时间~结束时间
    @ApiModelProperty(hidden = true)
    @TableField("start_end_time")
    private String startEndTime;

    /**
     * @see com.lets.platform.model.collection.enums.CollectionOfflineTypeEnum
     */
    @ApiModelProperty("异常类型：3：采集器异常 4：服务异常 5：系统异常")
    @TableField("exception_type")
    private String exceptionType;
    @TableField(exist = false)
    private String exceptionTypeName;

    @ApiModelProperty("推送时间间隔")
    @TableField("push_interval_time")
    private Long pushIntervalTime;

    @ApiModelProperty("接收人员Ids 人员入参,隔开")
    @TableField("receive_users")
    private String receiveUsers;

    @ApiModelProperty("启用状态")
    @TableField("enable")
    private Integer enable;
    @TableField(exist = false)
    private String enableName;

    @TableField(exist = false)
    private String deviceId;
    @TableField(exist = false)
    private String ruleId;

    @TableField(exist = false)
    private List<CommonSendConfigUpgrade> upgrades;

    @TableField(exist = false)
    private List<CommonSendConfigNoticeRule> rules;
    @ApiModelProperty("人员返参")
    @TableField(exist = false)
    private List<CommonSendConfigUser> users;
    @TableField(exist = false)
    private List<CommonSendConfigDevice> devices;

    @TableField(exist = false)
    private List<String> pushTypeAsList;

    public List<String> getPushTypeAsList() {
        if (StringUtils.isNotBlank(this.sendWay)) {
            return Arrays.asList(sendWay.split(GlobalConstant.COMMA_HALF_ANGLE));
        } else {
            return Arrays.asList();
        }
    }
}

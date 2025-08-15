package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 消息推送配置-预警规则
 * </p>
 *
 * @author csy
 * @since 2023-11-30
 */
@Getter
@Setter
@TableName("common_send_config_notice_rule")
@ApiModel(value = "CommonSendConfigNoticeRule对象", description = "消息推送配置-预警规则")
public class CommonSendConfigNoticeRule extends BaseEntity {

    @ApiModelProperty("预警规则id")
    @TableField("notice_rule_id")
    private String noticeRuleId;

    @ApiModelProperty("推送配置id")
    @TableField("config_id")
    private String configId;

    @TableField(exist = false)
    private String ruleName;
    @TableField(exist = false)
    private String effectiveTime;
    @TableField(exist = false)
    private String ruleLevel;
    @TableField(exist = false)
    private String ruleType;
}

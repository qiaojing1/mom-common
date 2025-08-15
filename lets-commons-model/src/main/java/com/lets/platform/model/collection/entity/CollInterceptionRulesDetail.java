package com.lets.platform.model.collection.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 报警拦截规则表体
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-04-16
 */
@Getter
@Setter
@TableName("coll_interception_rules_detail")
@ApiModel(value = "CollInterceptionRulesDetail对象", description = "报警拦截规则表体")
public class CollInterceptionRulesDetail extends BaseEntity {

    @ApiModelProperty("拦截规则表头id")
    @TableField("rule_id")
    private String ruleId;

    @ApiModelProperty("设备id")
    @TableField("device_id")
    private String deviceId;

    @ApiModelProperty("设备编码")
    @TableField(exist = false)
    private String deviceCode;

    @ApiModelProperty("设备名称")
    @TableField(exist = false)
    private String deviceName;

    @ApiModelProperty("设备类型id")
    @TableField(exist = false)
    private String deviceTypeId;

    @ApiModelProperty("设备类型id")
    @TableField(exist = false)
    private String deviceTypeName;

    @ApiModelProperty("设备型号id")
    @TableField(exist = false)
    private String deviceModelId;

    @ApiModelProperty("设备型号id")
    @TableField(exist = false)
    private String deviceModelName;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    // 当前设备所关联的所有报警码
    @TableField(exist = false)
    private List<String> interceptionCodes = new ArrayList<>();

    @TableField(exist = false)
    private List<String> allRuleIds = new ArrayList<>();

    @Override
    public String toString() {
        return "CollInterceptionRulesDetail{" +
                "ruleId='" + ruleId + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", deviceCode='" + deviceCode + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", deviceTypeId='" + deviceTypeId + '\'' +
                ", deviceTypeName='" + deviceTypeName + '\'' +
                ", deviceModelId='" + deviceModelId + '\'' +
                ", deviceModelName='" + deviceModelName + '\'' +
                ", remark='" + remark + '\'' +
                ", interceptionCodes=" + interceptionCodes.toString() +
                ", allRuleIds=" + allRuleIds.toString() +
                '}';
    }
}

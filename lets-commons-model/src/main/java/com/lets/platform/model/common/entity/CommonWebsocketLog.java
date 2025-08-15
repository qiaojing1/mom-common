package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * WebSocket日志表
 * @author DING WEI
 * @since 2024-10-18
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("common_websocket_log")
@ApiModel(value = "CommonWebsocketLog对象", description = "WebSocket日志表")
public class CommonWebsocketLog extends BaseEntity {

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String sign;

    @ApiModelProperty("工位机主键")
    @TableField("hmi_id")
    private String hmiId;
    @ApiModelProperty("工位机编码")
    @TableField("hmi_code")
    private String hmiCode;
    @ApiModelProperty("工位机名称")
    @TableField("hmi_name")
    private String hmiName;

    @ApiModelProperty("连接备注")
    @TableField("create_remark")
    private String createRemark;

    @ApiModelProperty("断开备注")
    @TableField("update_remark")
    private String updateRemark;

}

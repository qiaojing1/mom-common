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

import java.time.LocalDateTime;

/**
 * <p>
 * 预警记录
 * </p>
 *
 * @author csy
 * @since 2023-12-01
 */
@Getter
@Setter
@TableName("common_notice_record")
@ApiModel(value = "CommonNoticeRecord对象", description = "预警记录")
public class CommonNoticeRecord extends BaseEntity {

    @ApiModelProperty("预警规则主键")
    @TableField("rule_id")
    private String ruleId;
    @ApiModelProperty("预警规则主键")
    @TableField(exist = false)
    private String ruleName;
    @TableField(exist = false)
    private String levelName;

    @ApiModelProperty("设备主键")
    @TableField("device_id")
    private String deviceId;
    @TableField(exist = false)
    private String deviceName;
    @TableField(exist = false)
    private CommonDevice device;

    @ApiModelProperty("菜单编码")
    @TableField("menu_code")
    private String menuCode;
    @TableField("menu_name")
    private String menuName;

    @ApiModelProperty("单据信息")
    @TableField("order_id")
    private String orderId;
    @TableField("order_code")
    private String orderCode;


    @ApiModelProperty("预警内容")
    @TableField("notice_content")
    private String noticeContent;

    @ApiModelProperty("预警原因")
    @TableField("notice_reason")
    private String noticeReason;

    @ApiModelProperty("预警开始时间")
    @TableField("start_time")
    private LocalDateTime startTime;
    @TableField(exist = false)
    private LocalDateTime oldStartTime;

    @ApiModelProperty("预警结束时间")
    @TableField("end_time")
    private LocalDateTime endTime;

    @ApiModelProperty("状态[0未读,1已读]")
    @TableField("status")
    private String status;

    @ApiModelProperty("处理时间")
    @TableField("deal_time")
    private LocalDateTime dealTime;

    @ApiModelProperty("数据来源(目前写死的MDC)")
    @TableField("notice_origin")
    private String noticeOrigin;

    @TableField(exist = false)
    private String isTodo;

    @TableField(exist = false)
    private String orderCategoryId;
    @TableField(exist = false)
    private String orderCategoryName;

    @TableField(exist = false)
    private String factoryModeId;
    @TableField(exist = false)
    private String factoryModeName;


}

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
 * 消息记录
 * </p>
 *
 * @author qiaojing
 * @since 2023-07-05
 */
@Getter
@Setter
@TableName("common_message_record")
@ApiModel(value = "CommonMessageRecord对象", description = "消息记录")
public class CommonMessageRecord extends BaseEntity {

    @ApiModelProperty("内容")
    @TableField("content")
    private String content;

    @ApiModelProperty("消息主题")
    @TableField("subject")
    private String subject;
    @TableField(exist = false)
    private String subjectName;

    @ApiModelProperty("状态 0:未读 1:已读")
    @TableField("status")
    private String status;
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("用户")
    @TableField("user_id")
    private String userId;
    @ApiModelProperty("订单id")
    @TableField("order_id")
    private String orderId;
    @ApiModelProperty("订单code")
    @TableField("order_code")
    private String orderCode;
    @ApiModelProperty("单据类别")
    @TableField("order_category_id")
    private String orderCategoryId;
    @ApiModelProperty("单据类别名称")
    @TableField("order_category_name")
    private String orderCategoryName;
    @ApiModelProperty("菜单编码")
    @TableField("menu_code")
    private String menuCode;
    @ApiModelProperty("任务待办")
    @TableField("is_todo")
    private String isTodo;
    @TableField(exist = false)
    private String openUrl;
    @TableField(exist = false)
    private Integer isIncludeDetails;
}

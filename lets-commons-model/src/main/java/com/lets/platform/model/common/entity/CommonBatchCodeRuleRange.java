package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 批号自动编码适用范围表
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-08-14
 */
@Getter
@Setter
@TableName("common_batch_code_rule_range")
@ApiModel(value = "CommonBatchCodeRuleRange对象", description = "批号自动编码适用范围表")
public class CommonBatchCodeRuleRange extends BaseEntity {

    @ApiModelProperty("批号主表id")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("适用范围, 0:物料；1:客户")
    @TableField("type")
    private String type;

    @ApiModelProperty("目标id")
    @TableField("target_id")
    private String targetId;

    @ApiModelProperty("目标编码")
    @TableField("target_code")
    private String targetCode;

    @ApiModelProperty("目标名称")
    @TableField("target_name")
    private String targetName;
}

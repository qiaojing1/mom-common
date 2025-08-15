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
 * 条码自动编码规则配置范围
 * </p>
 *
 * @author FZY
 * @since 2024-10-22
 */
@Getter
@Setter
@TableName("common_barcode_rule_range")
@ApiModel(value = "CommonBarcodeRuleRange对象", description = "条码自动编码规则配置范围")
public class CommonBarcodeRuleRange extends BaseEntity {

    @ApiModelProperty("主表id")
    @TableField("parent_id")
    private String parentId;

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

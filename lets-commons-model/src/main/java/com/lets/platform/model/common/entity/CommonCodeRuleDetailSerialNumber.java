package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import java.time.LocalDate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 自动编码流水号重置关联表
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-09-02
 */
@Getter
@Setter
@TableName("common_code_rule_detail_serial_number")
@ApiModel(value = "CommonCodeRuleDetailSerialNumber对象", description = "自动编码流水号重置关联表")
public class CommonCodeRuleDetailSerialNumber extends BaseEntity {

    @ApiModelProperty("明细表id")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("需要根据哪个字段进行重置")
    @TableField("field")
    private String field;

    @ApiModelProperty("字段的值")
    @TableField("field_value")
    private String fieldValue;

    @ApiModelProperty("上次重置日期")
    @TableField("last_reset_date")
    private LocalDate lastResetDate;

    @ApiModelProperty("上次重置字段值")
    @TableField("last_reset_value")
    private String lastResetValue;

    @ApiModelProperty("当前流水号")
    @TableField("current_serial_number")
    private Integer currentSerialNumber;
}

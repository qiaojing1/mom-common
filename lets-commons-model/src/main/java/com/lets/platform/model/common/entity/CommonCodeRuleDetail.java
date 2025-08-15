package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

/**
 * <p>
 * 编码规则配置明细
 * </p>
 *
 * @author FZY
 * @since 2023-07-05
 */
@Getter
@Setter
@TableName("common_code_rule_detail")
@ApiModel(value = "CommonCodeRuleDetail对象", description = "编码规则配置明细")
public class CommonCodeRuleDetail extends BaseEntity {

    @ApiModelProperty("主表id")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("编码类型 1:固定值 2:字段值 3:日期时间 4:流水号")
    @TableField("type")
    private String type;

    @ApiModelProperty("来源字段")
    @TableField("field")
    private String field;

    @ApiModelProperty("固定值")
    @TableField("value")
    private String value;

    @ApiModelProperty("长度")
    @TableField("length")
    private Integer length;

    @ApiModelProperty("日期格式")
    @TableField("format")
    private String format;

    @ApiModelProperty("重置周期 1:日 2:周 3:月 4:年")
    @TableField("reset_period")
    private String resetPeriod;

    @ApiModelProperty("上次重置日期")
    @TableField("last_reset_date")
    private LocalDate lastResetDate;

    @ApiModelProperty("排序")
    @TableField("sort")
    private Integer sort;

    @ApiModelProperty("当前流水号")
    @TableField("current_serial_number")
    private Integer currentSerialNumber;

    @ApiModelProperty("补位符")
    @TableField("supply_symbol")
    private String supplySymbol;

    @ApiModelProperty("关联字段")
    @TableField(exist = false)
    private CommonCodeField codeField;


    @ApiModelProperty("来源字段")
    @TableField(exist = false)
    private List<String> fields;

    @ApiModelProperty("开始位置")
    @TableField("start_index")
    private Integer startIndex;

    @ApiModelProperty("切割长度")
    @TableField("sub_length")
    private Integer subLength;
}

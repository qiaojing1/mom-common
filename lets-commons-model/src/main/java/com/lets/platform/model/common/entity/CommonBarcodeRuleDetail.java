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
 * 条码自动编码规则配置明细
 * </p>
 *
 * @author FZY
 * @since 2024-10-22
 */
@Getter
@Setter
@TableName("common_barcode_rule_detail")
@ApiModel(value = "CommonBarcodeRuleDetail对象", description = "条码自动编码规则配置明细")
public class CommonBarcodeRuleDetail extends BaseEntity {

    @ApiModelProperty("主表id")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("编码类型 1:固定值 2:字段值 3:日期时间 4:流水号 5:物料字段")
    @TableField("type")
    private String type;

    @TableField(exist = false)
    private String typeName;

    /**
     * @see com.lets.platform.model.common.enums.BarcodeRuleParseFieldEnum
     */
    @ApiModelProperty("来源字段")
    @TableField("field")
    private String field;

    @TableField(exist = false)
    private String fieldName;

    @ApiModelProperty("补位符")
    @TableField("filling_character")
    private String fillingCharacter;

    @ApiModelProperty("固定值")
    @TableField("value")
    private String value;

    @ApiModelProperty("长度")
    @TableField("length")
    private Integer length;

    @ApiModelProperty("日期格式[除了日期格式外,0：转成小写,1转成大写]")
    @TableField("format")
    private String format;

    @TableField(exist = false)
    private String formatName;

    @ApiModelProperty("重置周期 1:日 2:周 3:月 4:年")
    @TableField("reset_period")
    private String resetPeriod;

    @TableField(exist = false)
    private String resetPeriodName;

    @ApiModelProperty("上次重置日期")
    @TableField("last_reset_date")
    private LocalDate lastResetDate;

    @ApiModelProperty("上次重置字段值")
    @TableField("last_reset_value")
    private String lastResetValue;

    @ApiModelProperty("当前流水号")
    @TableField("current_serial_number")
    private Integer currentSerialNumber;

    @ApiModelProperty("排序")
    @TableField("sort")
    private Integer sort;

    @ApiModelProperty("开始位置")
    @TableField("start_index")
    private Integer startIndex;

    @ApiModelProperty("索引")
    @TableField("split_index")
    private Integer splitIndex;

    @ApiModelProperty("流水号最小值")
    @TableField("min_serial")
    private String minSerial;

    @ApiModelProperty("流水号最大值")
    @TableField("max_serial")
    private String maxSerial;

    @ApiModelProperty("关联字段")
    @TableField(exist = false)
    private CommonCodeField codeField;
}

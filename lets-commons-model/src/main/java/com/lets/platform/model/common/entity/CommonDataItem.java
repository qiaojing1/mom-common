package com.lets.platform.model.common.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.common.pojo.annotation.ValidBigDecimal;
import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.enums.ThresholdDetectionMethodEnum;
import com.lets.platform.model.psi.enums.IsOrNotEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

/**
 * <p>
 * 数据项表
 * </p>
 *
 * @author zhangweiyan
 * @since 2023-10-31
 */
@Getter
@Setter
@TableName("common_data_item")
@ApiModel(value = "CommonDataItem对象", description = "数据项表")
public class CommonDataItem extends BaseEntity {

    @ApiModelProperty("编码")
    @TableField("code")
    @ExcelIgnore
    private String code;

    @ApiModelProperty("名称")
    @TableField("name")
    @ExcelIgnore
    private String name;

    @ApiModelProperty("源数据项标识")
    @TableField("source_field")
    @ColumnWidth(20)
    @ExcelProperty("原始数据项标识")
    @NotBlank
    private String sourceField;

    @ApiModelProperty("数据项名称")
    @TableField("field_name")
    @ColumnWidth(20)
    @ExcelProperty("数据项名称")
    @Length(min = 1, max = 20, message = "CommonItem.name", groups = {Save.class, Update.class})
    @NotBlank
    private String fieldName;

    @ApiModelProperty("数据项标识")
    @TableField("field")
    @ColumnWidth(20)
    @ExcelProperty("数据项标识")
    @NotBlank
    private String field;

    @ApiModelProperty("数据项单位")
    @TableField("unit")
    @ColumnWidth(20)
    @ExcelProperty("数据项单位")
    private String unit;

    @ApiModelProperty("数据项分组id")
    @TableField("group_id")
    @NotBlank
    @ExcelIgnore
    private String groupId;

    @ApiModelProperty("数据项分组名称")
    @TableField(exist = false)
    @ColumnWidth(20)
    @ExcelProperty("数据项分组")
    private String groupName;

    @ApiModelProperty("数据项来源")
    @NotBlank
    @TableField("item_source")
    @ExcelIgnore
    private String itemSource;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    @ColumnWidth(20)
    @ExcelProperty("数据项来源")
    private String itemSourceName;

    /**
     * @see com.lets.platform.model.common.enums.NewDataItemTypeEnum
     */
    @ApiModelProperty("数据项类型")
    @NotBlank
    @TableField("item_type")
    @ExcelIgnore
    private String itemType;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    @ColumnWidth(20)
    @ExcelProperty("数据项类型")
    private String itemTypeName;

    @ApiModelProperty("描述")
    @TableField("description")
    @ExcelIgnore
    private String description;

    @ExcelIgnore
    @ApiModelProperty("启用阈值检测[0:否,1:是]")
    @TableField("threshold_detection")
    @ValidatedEnum(enumClass = IsOrNotEnum.class, message = "[启用阈值检测]非法", groups = {Save.class, Update.class})
    private Integer thresholdDetection;
    @ColumnWidth(30)
    @ExcelProperty("启用阈值检测")
    @TableField(exist = false)
    private String thresholdDetectionFormat;

    /**
     * @see com.lets.platform.model.common.enums.ThresholdDetectionMethodEnum
     */
    @ColumnWidth(30)
    @ExcelProperty("阈值检测方式")
    @ApiModelProperty("阈值检测方式[1:标准值、2：区间值]")
    @TableField("threshold_detection_method")
    @ValidatedEnum(enumClass = ThresholdDetectionMethodEnum.class, message = "[阈值检测方式]非法，请选择[标准值、区间值]", groups = {Save.class, Update.class})
    private String thresholdDetectionMethod;
    @ExcelIgnore
    @TableField(exist = false)
    private String thresholdDetectionMethodName;

    @ExcelIgnore
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("标准值")
    @ValidBigDecimal(message = "[标准值]取值范围[0, 999999999.99]", max = "999999999.99", includeMin = true, groups = {Save.class, Update.class})
    @TableField("standard_value")
    private BigDecimal standardValue;
    @ColumnWidth(20)
    @ExcelProperty("标准值")
    @TableField(exist = false)
    private String standardValueFormat;

    @ExcelIgnore
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("上限值")
    @ValidBigDecimal(message = "[上限值]取值范围[0, 999999999.99]", max = "999999999.99", includeMin = true, groups = {Save.class, Update.class})
    @TableField("upper_limit_value")
    private BigDecimal upperLimitValue;
    @ColumnWidth(20)
    @ExcelProperty("上限值")
    @TableField(exist = false)
    private String upperLimitValueFormat;

    @ExcelIgnore
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("下限值")
    @ValidBigDecimal(message = "[下限值]取值范围[0, 999999999.99]", max = "999999999.99", includeMin = true, groups = {Save.class, Update.class})
    @TableField("lower_limit_value")
    private BigDecimal lowerLimitValue;
    @ColumnWidth(20)
    @ExcelProperty("下限值")
    @TableField(exist = false)
    private String lowerLimitValueFormat;

    @ApiModelProperty(name = "该元素在excel中的行数", hidden = true)
    @ExcelIgnore
    @TableField(exist = false)
    private Integer index;

    /**
     * 历史参数使用字段
     */
    @ExcelIgnore
    @TableField(exist = false)
    private String collectorId;
    @ExcelIgnore
    @TableField(exist = false)
    private String collectorCode;
    @ExcelIgnore
    @TableField(exist = false)
    private String collectorName;
    @ExcelIgnore
    @TableField(exist = false)
    private String itemKey;
    @ExcelIgnore
    @TableField(exist = false)
    private String itemValue;
    @ExcelIgnore
    @TableField(exist = false)
    private String routeProcessId;
    @ExcelIgnore
    @TableField(exist = false)
    private String deviceId;
}

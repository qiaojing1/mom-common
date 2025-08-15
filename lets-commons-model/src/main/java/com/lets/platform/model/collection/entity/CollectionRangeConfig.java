package com.lets.platform.model.collection.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;

import java.math.BigDecimal;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 量程配置
 * </p>
 *
 * @author csy
 * @since 2024-06-24
 */
@Getter
@Setter
@TableName("collection_range_config")
@ApiModel(value = "CollectionRangeConfig对象", description = "量程配置")
public class CollectionRangeConfig extends BaseEntity {

    @ExcelIgnore
    @TableField(exist = false)
    private Integer rowIndex;

    @ExcelIgnore
    @TableField(exist = false)
    private String name;

    @ExcelIgnore
    @ApiModelProperty("设备Id")
    @TableField("device_id")
    private String deviceId;
    @ExcelProperty("设备编码")
    @TableField(exist = false)
    private String deviceCode;

    @ExcelProperty("通道")
    @ApiModelProperty("通道")
    @TableField("channel")
    private String channel;

    @ExcelIgnore
    @ApiModelProperty("压力符号id")
    @TableField("pressure_sign_id")
    private String pressureSignId;

    @ExcelProperty("压力符号")
    @ApiModelProperty("压力符号")
    @TableField("pressure_sign")
    private String pressureSign;

    @ExcelIgnore
    @ApiModelProperty("压力Id")
    @TableField("pressure_id")
    private String pressureId;

    @ExcelProperty("压力")
    @ApiModelProperty("压力值")
    @TableField("pressure_value")
    private String pressureValue;

    @ExcelIgnore
    @ApiModelProperty("量程上限")
    @TableField("upper_limit")
    private BigDecimal upperLimit;
    @ExcelProperty("量程上限（MPa）")
    @TableField(exist = false)
    private String upperLimitStr;

    @ExcelIgnore
    @ApiModelProperty("低压量程上限")
    @TableField("low_pressure_upper_limit")
    private BigDecimal lowPressureUpperLimit;
    @ExcelProperty("低压量程上限（MPa）")
    @TableField(exist = false)
    private String lowPressureUpperLimitStr;

    @ExcelIgnore
    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ExcelIgnore
    @ApiModelProperty("前端量程仪表盘配置")
    @TableField("props")
    private String props;

    @ExcelIgnore
    @ApiModelProperty("大量程数量")
    @TableField("large_scale_num")
    private String largeScaleNum;

    @ExcelIgnore
    @ApiModelProperty("小量程数量")
    @TableField("small_scale_num")
    private String smallScaleNum;
}

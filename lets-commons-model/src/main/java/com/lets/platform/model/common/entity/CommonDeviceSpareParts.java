package com.lets.platform.model.common.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 设备—备件清单
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-10-30
 */
@Getter
@Setter
@TableName("common_device_spare_parts")
@ApiModel(value = "CommonDeviceSpareParts对象", description = "设备—备件清单")
public class CommonDeviceSpareParts extends BaseEntity {

    @ApiModelProperty("设备id")
    @TableField("device_id")
    @ExcelIgnore
    private String deviceId;

    @ApiModelProperty("设备id")
    @TableField(exist = false)
    @ExcelProperty("设备编码")
    private String deviceCode;

    @ApiModelProperty("设备类型id")
    @TableField(exist = false)
    @ExcelIgnore
    private String deviceTypeId;

    @ApiModelProperty("设备型号id")
    @TableField(exist = false)
    @ExcelIgnore
    private String deviceModelId;

    @ApiModelProperty("备件编码（备件既是物料）")
    @TableField("material_code")
    @ExcelProperty("备件编码")
    private String materialCode;

    @ApiModelProperty("备件id")
    @TableField("material_id")
    @ExcelIgnore
    private String materialId;

    @ApiModelProperty("备件名称")
    @TableField(exist = false)
    @ExcelIgnore
    private String materialName;

    @ApiModelProperty("备件规格")
    @TableField(exist = false)
    @ExcelIgnore
    private String materialSpecs;

    @ApiModelProperty("单位id")
    @TableField("unit_id")
    @ExcelIgnore
    private String unitId;

    @ApiModelProperty("基本单位id")
    @TableField(exist = false)
    @ExcelIgnore
    private String basicUnitId;

    @ApiModelProperty("单位编码")
    @TableField("unit_code")
    @ExcelIgnore
    private String unitCode;

    @ApiModelProperty("名称")
    @TableField("unit_name")
    @ExcelIgnore
    private String unitName;

    @ApiModelProperty("精度")
    @TableField("unit_accuracy")
    @ExcelIgnore
    private Integer unitAccuracy;

    @ApiModelProperty("舍入类型[4四舍五入、0直接进位、1直接舍位]")
    @TableField("unit_round_off_type")
    @ExcelIgnore
    private Integer unitRoundOffType;

    @ApiModelProperty("数量")
    @TableField("quantity")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ExcelIgnore
    private BigDecimal quantity;
    @TableField(exist = false)
    @ExcelProperty("数量")
    private String quantityStr;

    @ApiModelProperty("更换方式 0:选择更换 1:必须更换")
    @TableField("change_way")
    @ExcelProperty("更换方式")
    private String changeWay;
    @TableField(exist = false)
    @ExcelIgnore
    private String changeWayName;

    @ApiModelProperty("是否启用寿命监控 N否Y是")
    @TableField("lifetime_monitoring")
    @ExcelIgnore
    private String lifetimeMonitoring;
    @TableField(exist = false)
    @ExcelProperty("是否启用寿命监控")
    private String lifetimeMonitoringName;

    @ApiModelProperty("寿命扣减方式 0:计次 1:计时 (计时表示标准寿命为多少天，计次表示标准寿命为多少次)")
    @TableField("lifetime_counting_way")
    @ExcelProperty("寿命扣减方式")
    private String lifetimeCountingWay;
    @TableField(exist = false)
    @ExcelIgnore
    private String lifetimeCountingWayName;

    @ApiModelProperty("标准使用寿命")
    @TableField("std_usable_lifetime")
    @ExcelIgnore
    private Integer stdUsableLifetime;
    @TableField(exist = false)
    @ExcelProperty("标准使用寿命")
    private String stdUsableLifetimeStr;

    @ApiModelProperty("备件初始寿命计时日期")
    @TableField("date_of_production")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ExcelIgnore
    private LocalDate dateOfProduction;
    @ExcelProperty("备件初始寿命计时日期")
    @TableField(exist = false)
    private String dateOfProductionStr;

    @ApiModelProperty("计次关联数据项id")
    @TableField("data_item_id")
    @ExcelIgnore
    private String dataItemId;
    @ApiModelProperty("计次关联数据项名称")
    @TableField(exist = false)
    @ExcelProperty("计次关联数据项")
    private String dataItemName;

    @TableField(exist = false)
    @ExcelIgnore
    private Integer excelIndex;

    /**
     * 以下为通过备件领用清单补充的相关数据
     */
    @TableField(exist = false)
    @ExcelIgnore
    @ApiModelProperty("更换时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime lastChangeTime;

    @TableField(exist = false)
    @ExcelIgnore
    @ApiModelProperty("更换原因")
    private String lastChangeReason;

    @TableField(exist = false)
    @ExcelIgnore
    @ApiModelProperty("更换方式")
    private String lastChangeWay;

    @TableField(exist = false)
    @ExcelIgnore
    @ApiModelProperty("关联工单")
    private String lastChangeOrderCode;

    @TableField(exist = false)
    @ExcelIgnore
    @ApiModelProperty("已使用寿命(天/次)")
    private String alreadyUsedLife;

    @TableField(exist = false)
    @ExcelIgnore
    @ApiModelProperty("下次更换时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime nextChangeTime;
}

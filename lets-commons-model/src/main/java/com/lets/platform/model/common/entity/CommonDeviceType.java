package com.lets.platform.model.common.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.config.StringArrayToStringDeserialize;
import com.lets.platform.common.pojo.config.StringToStringArraySerializer;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.device.enums.TypeClassifyEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Pattern;
import java.math.BigDecimal;

/**
 * <p>
 * 设备类型
 * </p>
 *
 * @author DING WEI
 * @since 2023-10-26
 */
@Getter
@Setter
@TableName("common_device_type")
@ApiModel(value = "CommonDeviceType对象", description = "设备类型")
public class CommonDeviceType extends BaseEntity {

    @ExcelIgnore
    @TableField(exist = false)
    private Integer index;

    @ColumnWidth(40)
    @ExcelProperty("设备类型名称")
    @Length(min = 1, max = 20, message = "CommonDeviceType.name", groups = {Save.class, Update.class})
    @ApiModelProperty("名称")
    @TableField("name")
    private String name;

    @ColumnWidth(40)
    @ExcelProperty("设备类型编码")
    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_20, message = "CommonDeviceType.code", groups = {Save.class, Update.class})
    @ApiModelProperty("编码")
    @TableField("code")
    private String code;

    @ExcelIgnore
    @ValidatedEnum(enumClass = TypeClassifyEnum.class, required = true, message = "CommonDeviceType.classify", groups = {Save.class, Update.class})
    @ApiModelProperty("设备类型分类[1电表,2天然气表,3水表,4压缩空气表,5其他设备]")
    @TableField("classify")
    private String classify;
    @ColumnWidth(40)
    @ExcelProperty("设备类型分类")
    @TableField(exist = false)
    private String classifyName;


    @TableField(value = "hour_factor",updateStrategy = FieldStrategy.IGNORED)
    @ExcelIgnore
    private BigDecimal hourFactor;
    @TableField(exist = false)
    @ColumnWidth(40)
    @ExcelProperty("工时系数")
    private String hourFactorStr;


    @ExcelIgnore
    @ApiModelProperty("是否启用[0停用1启用]")
    @TableField("enable")
    private Integer enable;
    @ExcelIgnore
    @TableField(exist = false)
    private String enableName;

    @ExcelIgnore
    @TableField(exist = false)
    private String assetsCode;
    @ExcelIgnore
    @TableField(exist = false)
    private String deviceTypeId;
    @ExcelIgnore
    @TableField(exist = false)
    private String deviceModelId;
    @ExcelIgnore
    @TableField(exist = false)
    private String deviceControllerId;
    @ExcelIgnore
    @TableField(exist = false)
    private String factoryModeId;

    @ExcelIgnore
    @ApiModelProperty("点检执行限制")
    @TableField("spot_execute_limit")
    private Integer spotExecuteLimit;

    @ExcelIgnore
    @ApiModelProperty("点检执行限制")
    @TableField(exist = false)
    private String spotExecuteLimitName;

    @ExcelIgnore
    @ApiModelProperty("点检适用设备状态ids")
    @TableField("spot_suit_device_status_id")
    private String spotSuitDeviceStatusId;

    @ExcelIgnore
    @ApiModelProperty("点检适用设备状态ids")
    @TableField("spot_suit_device_status_name")
    private String spotSuitDeviceStatusName;

    @ExcelIgnore
    @ApiModelProperty("点检限制时长（min）")
    @TableField("spot_limit_time")
    private Integer spotLimitTime;

    @ExcelIgnore
    @ApiModelProperty("保养执行限制")
    @TableField("maintenance_execute_limit")
    private Integer maintenanceExecuteLimit;

    @ExcelIgnore
    @ApiModelProperty("保养执行限制")
    @TableField(exist = false)
    private String maintenanceExecuteLimitName;

    @ExcelIgnore
    @ApiModelProperty("保养适用设备状态ids")
    @TableField("maintenance_suit_device_status_id")
    private String maintenanceSuitDeviceStatusId;

    @ExcelIgnore
    @ApiModelProperty("保养适用设备状态ids")
    @TableField("maintenance_suit_device_status_name")
    private String maintenanceSuitDeviceStatusName;

    @ExcelIgnore
    @ApiModelProperty("保养类型")
    @TableField("maintenance_type")
    @JsonSerialize(using = StringToStringArraySerializer.class)
    @JsonDeserialize(using = StringArrayToStringDeserialize.class)
    private String maintenanceType;

    @ExcelIgnore
    @ApiModelProperty("保养限制时长（min）")
    @TableField("maintenance_limit_time")
    private Integer maintenanceLimitTime;

    @ExcelIgnore
    @TableField(exist = false)
    private String sourceStatus;
    @ExcelIgnore
    @TableField(exist = false)
    private String targetStatus;
    @ExcelIgnore
    @TableField(exist = false)
    private Integer time;
}

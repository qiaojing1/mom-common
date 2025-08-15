package com.lets.platform.model.common.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.lets.platform.common.pojo.config.StringArrayToStringDeserialize;
import com.lets.platform.common.pojo.config.StringToStringArraySerializer;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Pattern;
import java.util.List;

/**
 * <p>
 * 设备型号
 * </p>
 *
 * @author DING WEI
 * @since 2023-10-26
 */
@Getter
@Setter
@TableName("common_device_model")
@ApiModel(value = "CommonDeviceModel对象", description = "设备型号")
public class CommonDeviceModel extends BaseEntity {

    @ExcelIgnore
    @TableField(exist = false)
    private Integer index;

    @ColumnWidth(40)
    @ExcelProperty("设备型号名称")
    @Length(min = 1, max = 20, message = "CommonDeviceModel.name", groups = {Save.class, Update.class})
    @ApiModelProperty("名称")
    @TableField("name")
    private String name;

    @ColumnWidth(40)
    @ExcelProperty("设备型号编码")
    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_20, message = "CommonDeviceModel.code", groups = {Save.class, Update.class})
    @ApiModelProperty("编码")
    @TableField("code")
    private String code;

    @ExcelIgnore
    @ApiModelProperty("设备类型")
    @TableField("type_id")
    private String typeId;
    @ColumnWidth(40)
    @ExcelProperty("设备类型名称")
    @TableField(exist = false)
    private String typeName;

    @ExcelIgnore
    @TableField("servo_axes_number")
    private Integer servoAxesNumber;
    @ExcelProperty("伺服轴数")
    @ColumnWidth(40)
    @TableField(exist = false)
    private String servoAxesNumberStr;

    @ExcelIgnore
    @TableField("spindles_number")
    private Integer spindlesNumber;
    @ColumnWidth(40)
    @ExcelProperty("主轴数")
    @TableField(exist = false)
    private String spindlesNumberStr;

    @ExcelIgnore
    @TableField("spindles_maximum_speed")
    private Integer spindlesMaximumSpeed;
    @ExcelProperty("主轴最高转速")
    @ColumnWidth(40)
    @TableField(exist = false)
    private String spindlesMaximumSpeedStr;

    @ExcelIgnore
    @ApiModelProperty("是否启用[0停用1启用]")
    @TableField("enable")
    private Integer enable;
    @ExcelIgnore
    @TableField(exist = false)
    private String enableName;

    @ExcelIgnore
    @TableField("3d_file_id")
    private String fileIds;
    @ExcelIgnore
    @TableField(exist = false)
    private List<String> fileIdList;
    @ExcelIgnore
    @TableField(exist = false)
    private List<CommonFile> commonFileList;

    /**
     * 1：不限制 2：按设备状态 3：按执行时间
     */
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
    @ApiModelProperty("点检适用设备状态name")
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
}

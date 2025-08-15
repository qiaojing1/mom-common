package com.lets.platform.model.tpm.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonFile;
import com.lets.platform.model.tpm.enums.MaintenanceType;
import com.lets.platform.model.tpm.enums.PhotographyControlMethodEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 * 保养项目
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-11-07
 */
@Getter
@Setter
@TableName("tpm_maintenance_program")
@ApiModel(value = "TpmMaintenanceProgram对象", description = "保养项目")
public class TpmMaintenanceProgram extends BaseEntity {

    @ApiModelProperty("保养项名称")
    @TableField("name")
    @ExcelProperty("保养项名称")
    private String name;

    @ApiModelProperty("保养项分组编码")
    @TableField("code")
    @ExcelIgnore
    private String code;

    @ApiModelProperty("保养项分组id（如果当前数据是分组则该字段无值）")
    @TableField("group_id")
    @ExcelIgnore
    private String groupId;
    @TableField(exist = false)
    @ExcelProperty("保养项分组")
    private String groupName;

    @ApiModelProperty("保养周期 1:每天 2:每周 3:每月 4:每季度 5:每半年 6:每年")
    @TableField("maintenance_cycle")
    @ExcelIgnore
    private String maintenanceCycle;
    @TableField(exist = false)
    @ExcelProperty("保养周期")
    private String maintenanceCycleName;

    @ApiModelProperty("保养内容")
    @TableField("maintenance_content")
    @ExcelProperty("保养内容")
    private String maintenanceContent;

    /**
     * @see MaintenanceType
     */
    @ApiModelProperty("保养等级 1:日常保养 2:一级保养 3:二级保养 4:设备大修")
    @TableField("maintenance_type")
    @ExcelIgnore
    private String maintenanceType;
    @TableField(exist = false)
    @ExcelProperty("保养等级")
    private String maintenanceTypeName;

    @ApiModelProperty("是否为分组数据 Y是N否")
    @TableField("is_group")
    @ExcelIgnore
    private String isGroup;

    /**
     * @see PhotographyControlMethodEnum
     */
    @ApiModelProperty("拍照控制方式 N:不控制 Y:必须拍照")
    @TableField("photography_control_method")
    @ExcelIgnore
    private String photographyControlMethod;
    @TableField(exist = false)
    @ExcelProperty("拍照控制方式")
    private String photographyControlMethodName;

    @ApiModelProperty("适用设备范围 1:通用 2:设备类型 3:设备型号 4:设备(该参数仅在当前数据为分组数据时有效)")
    @TableField("suit_device_range")
    @ExcelIgnore
    private String suitDeviceRange;
    @TableField(exist = false)
    @ExcelIgnore
    private String suitDeviceRangeName;

    @ApiModelProperty("预计保养时长(H)")
    @TableField("expected_maintenance_duration")
    @ExcelIgnore
    private BigDecimal expectedMaintenanceDuration;
    @TableField(exist = false)
    @ExcelProperty("预计保养时长(H)")
    private String expectedMaintenanceDurationStr;

    @ApiModelProperty("图片id")
    @TableField("image_id")
    @ExcelIgnore
    private String imageIds;

    @ApiModelProperty("附件id")
    @TableField("file_ids")
    @ExcelIgnore
    private String fileIds;

    @ApiModelProperty("文件列表")
    @TableField(exist = false)
    @ExcelIgnore
    private List<CommonFile> files;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    @ExcelIgnore
    private Integer excelIndex;

    /**
     * 适用范围 （当前数据为分组时为适用范围；当前数据为保养项目时为备件清单）
     */
    @TableField(exist = false)
    @ExcelIgnore
    private List<TpmMaintenanceProgramRanges> suitableRanges;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    @ExcelIgnore
    private List<TpmMaintenanceProgram> children;

    @TableField(exist = false)
    @ExcelIgnore
    private String deviceId;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    @ExcelIgnore
    private String inspectUserId;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    @ExcelIgnore
    private String inspectUserName;
}

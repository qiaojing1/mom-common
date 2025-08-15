package com.lets.platform.model.tpm.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.tpm.enums.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * <p>
 * 保养计划-保养项目
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-11-13
 */
@Getter
@Setter
@TableName("tpm_maintenance_items_plan_items")
@ApiModel(value = "TpmMaintenanceItemsPlanItems对象", description = "保养计划-保养项目")
public class TpmMaintenanceItemsPlanItems extends BaseEntity {

    @ApiModelProperty("计划id")
    @TableField("plan_id")
    private String planId;

    @ApiModelProperty("设备明细id")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("保养项id")
    @TableField("item_id")
    private String itemId;

    @ApiModelProperty("保养项名称")
    @TableField("item_name")
    private String itemName;

    @ApiModelProperty("保养项分组id")
    @TableField("item_group_id")
    private String itemGroupId;

    @ApiModelProperty("保养项分组名称")
    @TableField("item_group_name")
    private String itemGroupName;

    /**
     * @see ConfigCycle
     */
    @ApiModelProperty("保养周期 1:每天 2:每周 3:每月 4:每季度 5:每半年 6:每年")
    @TableField(exist = false)
    @ExcelIgnore
    private String inspectionCycle;
    @TableField(exist = false)
    private String inspectionCycleName;

    @ApiModelProperty("保养内容")
    @TableField("maintenance_content")
    private String maintenanceContent;

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

    @ApiModelProperty("预计保养时长(H)")
    @TableField("expected_maintenance_duration")
    @ExcelIgnore
    private BigDecimal expectedMaintenanceDuration;
    @TableField(exist = false)
    @ExcelProperty("预计保养时长(H)")
    private String expectedMaintenanceDurationStr;

    @ApiModelProperty("图片id")
    @TableField("maintenance_image_id")
    @ExcelIgnore
    private String maintenanceImageIds;
}

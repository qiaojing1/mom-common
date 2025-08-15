package com.lets.platform.model.tpm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * <p>
 * 点检计划-设备明细
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-11-11
 */
@Getter
@Setter
@TableName("tpm_inspection_items_plan_devices")
@ApiModel(value = "TpmInspectionItemsPlanDevices对象", description = "点检计划-设备明细")
public class TpmInspectionItemsPlanDevices extends BaseEntity {

    @ApiModelProperty("计划id")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("序号")
    @TableField("line_number")
    private Integer lineNumber;

    @ApiModelProperty("设备id")
    @TableField("device_id")
    private String deviceId;

    @ApiModelProperty("设备编码")
    @TableField("device_code")
    private String deviceCode;

    @ApiModelProperty("设备名称")
    @TableField("device_name")
    private String deviceName;

    @ApiModelProperty("设备类型id")
    @TableField("device_type_id")
    private String deviceTypeId;
    @TableField(exist = false)
    @ApiModelProperty("设备类型")
    private String deviceTypeName;

    @ApiModelProperty("设备型号")
    @TableField("device_model_id")
    private String deviceModelId;
    @TableField(exist = false)
    @ApiModelProperty("设备型号")
    private String deviceModelName;

    @ApiModelProperty("执行人员id")
    @TableField("execution_user_id")
    private String executionUserId;

    @ApiModelProperty("执行人员名称")
    @TableField("execution_user_name")
    private String executionUserName;

    @ApiModelProperty("协助人员id（上限5人）")
    @TableField("assist_user_ids")
    private String assistUserIds;

    @ApiModelProperty("执行人员名称（上限5人）")
    @TableField("assist_user_names")
    private String assistUserNames;

    @TableField(exist = false)
    @ApiModelProperty("点检项目列表")
    private List<TpmInspectionItemsPlanItems> itemsList;
}

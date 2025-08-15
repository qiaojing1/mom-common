package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * HMI配置关联工序信息
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-04-28
 */
@Getter
@Setter
@TableName("common_hmi_setting_processes")
@ApiModel(value = "CommonHmiSettingProcesses对象", description = "HMI配置关联工序信息")
public class CommonHmiSettingProcesses extends BaseEntity {

    @ApiModelProperty("HMI配置表头id")
    @TableField("setting_id")
    private String settingId;

    @ApiModelProperty("工序id")
    @TableField("process_id")
    private String processId;

    @ApiModelProperty("工序编码")
    @TableField("code")
    private String code;

    @ApiModelProperty("工序名称")
    @TableField("name")
    private String name;
}

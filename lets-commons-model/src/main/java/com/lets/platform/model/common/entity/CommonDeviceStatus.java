package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 设备状态配置
 * </p>
 *
 * @author zhangweiyan
 * @since 2023-11-13
 */
@Getter
@Setter
@TableName("common_device_status")
@ApiModel(value = "CommonDeviceStatus对象", description = "设备状态配置")
public class CommonDeviceStatus extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("状态小类编码")
    @TableField("code")
    private String code;

    @ApiModelProperty("状态小类名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("状态大类code")
    @TableField("parent_code")
    @NotBlank
    private String parentCode;

    @ApiModelProperty("状态大类名称")
    @TableField(exist = false)
    private String parentName;

    @ApiModelProperty("是否启用 0：未启用；1：已启用")
    @TableField("enable")
    private Integer enable;

    @ApiModelProperty("颜色编码")
    @TableField("color")
    @NotBlank
    private String color;

    @ApiModelProperty("描述")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("状态小类列表")
    @TableField(exist = false)
    private List<CommonDeviceStatus> children;
}

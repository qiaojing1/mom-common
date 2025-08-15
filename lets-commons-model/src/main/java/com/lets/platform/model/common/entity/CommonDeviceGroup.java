package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
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
 * 设备台账分组
 * </p>
 *
 * @author DING WEI
 * @since 2023-10-30
 */
@Getter
@Setter
@TableName("common_device_group")
@ApiModel(value = "CommonDeviceGroup对象", description = "设备台账分组")
public class CommonDeviceGroup extends BaseEntity {

    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_20, message = "DeviceGroup.code", groups = {Save.class, Update.class})
    @ApiModelProperty("编码")
    @TableField("code")
    private String code;

    @Length(min = 1, max = 20, message = "DeviceGroup.name", groups = {Save.class, Update.class})
    @ApiModelProperty("名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("父级分组")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty(value = "分组类型[1空压机分组2照明分组]", hidden = true)
    @TableField("type")
    private String type;

    @Length(max = 40, message = "DeviceGroup.description", groups = {Save.class, Update.class})
    @ApiModelProperty("描述")
    @TableField("description")
    private String remark;

    @TableField(exist = false)
    private List<CommonDeviceGroup> children;
}

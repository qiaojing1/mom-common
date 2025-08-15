package com.lets.platform.model.device.dto;

import com.lets.platform.common.pojo.base.BaseDo;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

/**
 * 工厂建模传参对象
 *
 * @version 1.0
 * @ClassName DeviceFactoryModeDto
 * @author: Qiao
 * @create: 2021/08/20 22:51
 **/
@Data
@ApiModel("工厂建模传参对象")
public class DeviceFactoryModeDto extends BaseDo {
    @NotBlank(message = "DeviceFactoryModeDto.id", groups = {Update.class})
    @ApiModelProperty("工厂建模[U]")
    private String id;
    @Length(min = 1, max = 20, message = "DeviceFactoryModeDto.modeName", groups = {Save.class, Update.class})
    @ApiModelProperty(value = "单元名称", required = true)
    private String modeName;
    @Length(min = 1, max = 20, message = "DeviceFactoryModeDto.code", groups = {Update.class})
    @ApiModelProperty(value = "单元编码", required = true)
    private String code;
    @Length(min = 1, max = 20, message = "DeviceFactoryModeDto.modeType", groups = {Save.class, Update.class})
    @ApiModelProperty(value = "单元类型", required = true)
    private String modeType;
    @Length(min = 0, max = 20, message = "DeviceFactoryModeDto.parentModeCode", groups = {Save.class, Update.class})
    @ApiModelProperty(value = "上级单元")
    private String parentModeCode;
    @Length(min = 1, max = 20, message = "DeviceFactoryModeDto.managerUser", groups = {Save.class, Update.class})
    @ApiModelProperty(value = "负责人", required = true)
    private String managerUser;
    @ApiModelProperty(value = "状态 0:停用 1:启用", required = true)
    private String status;

    @ApiModelProperty(value = "菜单编码", required = true)
    private String menuCode;


}

package com.lets.platform.model.device.dto;

import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

/**
 * 设备型号
 *
 * @version 1.0
 * @ClassName DeviceModelDto
 * @author: DING WEI
 * @create: 2021/05/12 16:14
 **/
@Data
@ApiModel("设备型号传参")
public class DeviceModelDto {

    @NotBlank(message = "DeviceModelDto.id", groups = {Update.class})
    @ApiModelProperty("型号主键")
    private String id;

    @Length(min = 1, max = 20, message = "DeviceModelDto.modelName", groups = {Save.class, Update.class})
    @ApiModelProperty(value = "型号名称", required = true)
    private String modelName;

    @ApiModelProperty(hidden = true)
    private String tenancyId;

    @ApiModelProperty(hidden = true)
    private String excludeId;

}

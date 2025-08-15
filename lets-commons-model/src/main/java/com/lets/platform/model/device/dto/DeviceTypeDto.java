package com.lets.platform.model.device.dto;

import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * 设备类型
 *
 * @version 1.0
 * @ClassName DeviceTypeDto
 * @author: DING WEI
 * @create: 2021/05/12 16:14
 **/
@Data
@ApiModel("设备类型传参")
public class DeviceTypeDto {

    @NotBlank(message = "DeviceTypeDto.id", groups = {Update.class})
    @ApiModelProperty("类型主键")
    private String id;

    @Pattern(regexp = GlobalConstant.CHINESE_LETTER_NUMBER_UNDERLINE_1_20, message = "DeviceTypeDto.typeName", groups = {Save.class, Update.class})
    @ApiModelProperty(value = "类型名称", required = true)
    private String typeName;

    @ApiModelProperty(hidden = true)
    private String tenancyId;

    private String typeClassify;

    @ApiModelProperty(hidden = true)
    private String excludeId;

}

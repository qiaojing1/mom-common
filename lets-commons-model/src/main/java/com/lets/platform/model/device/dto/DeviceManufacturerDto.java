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
 * 设备生产商
 *
 * @version 1.0
 * @ClassName DeviceManufacturerDto
 * @author: DING WEI
 * @create: 2021/05/12 16:14
 **/
@Data
@ApiModel("设备生产商传参")
public class DeviceManufacturerDto {

    @NotBlank(message = "DeviceManufacturerDto.id", groups = {Update.class})
    @ApiModelProperty("生产商主键")
    private String id;

    @Pattern(regexp = GlobalConstant.CHINESE_LETTER_NUMBER_UNDERLINE_1_20, message = "DeviceManufacturerDto.manufacturerName", groups = {Save.class, Update.class})
    @ApiModelProperty(value = "生产商名称", required = true)
    private String manufacturerName;

    @ApiModelProperty(hidden = true)
    private String tenancyId;

    @ApiModelProperty(hidden = true)
    private String excludeId;

}

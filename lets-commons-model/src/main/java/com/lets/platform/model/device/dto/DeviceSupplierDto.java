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
 * 设备供应商
 *
 * @version 1.0
 * @ClassName DeviceSupplierDo
 * @author: DING WEI
 * @create: 2021/05/12 16:14
 **/
@Data
@ApiModel("设备供应商传参")
public class DeviceSupplierDto {

    @NotBlank(message = "DeviceSupplierDto.id", groups = {Update.class})
    @ApiModelProperty("供应商主键")
    private String id;

    @Pattern(regexp = GlobalConstant.CHINESE_LETTER_NUMBER_UNDERLINE_1_20, message = "DeviceSupplierDto.supplierName", groups = {Save.class, Update.class})
    @ApiModelProperty(value = "供应商名称", required = true)
    private String supplierName;

    @ApiModelProperty(hidden = true)
    private String tenancyId;

    @ApiModelProperty(hidden = true)
    private String excludeId;

}

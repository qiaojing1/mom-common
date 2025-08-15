package com.lets.platform.model.device.dto;

import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * 设备备品备件清单 数据传输对象
 * @author: DING WEI
 * @date: 2022/7/20 10:36
 */
@Data
@ApiModel("设备备品备件清单 数据传输对象")
public class PrepareRelation4DeviceDto {

    @NotBlank(message = "PrepareRelation4DeviceDto.deviceId", groups = {Save.class, Update.class})
    @ApiModelProperty("设备主键")
    private String deviceId;

    @ApiModelProperty("备件物料")
    private List<String> materialIds;

}

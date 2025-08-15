package com.lets.platform.model.device.vo;

import com.lets.platform.common.pojo.base.BaseDo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 设备
 *
 * @version 1.0
 * @ClassName DeviceVo
 * @author: DING WEI
 * @create: 2021/05/12 14:24
 **/
@Data
public class DeviceSimpleVo extends BaseDo {

    private String deviceName;
    @ApiModelProperty("生产单元id")
    private String factoryModeId;
    @ApiModelProperty("生产单元名称")
    private String factoryModeName;
    @ApiModelProperty("单级生产单元名称")
    private String singleFactoryModeName;
}

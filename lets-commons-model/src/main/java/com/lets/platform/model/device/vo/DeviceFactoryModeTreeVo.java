package com.lets.platform.model.device.vo;

import com.lets.platform.common.pojo.base.BaseDo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;


/**
 * 工厂建模Tree
 *
 * @version 1.0
 * @ClassName DeviceFactoryModeTreeVo
 * @author: Qiao
 * @create: 2021/08/20 22:58
 **/
@Data
public class DeviceFactoryModeTreeVo  extends BaseDo {
    @ApiModelProperty("租户名称")
    private String tenancyName;
    @ApiModelProperty("工厂建模信息")
    private List<DeviceFactoryModeVo> deviceFactoryModeVo;
}

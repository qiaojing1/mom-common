package com.lets.platform.model.device.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 设备层级
 *
 * @version 1.0
 * @ClassName DeviceLevelVo
 * @author: Qiao
 * @create: 2022/12/05 18:24
 **/
@Data
public class DeviceLevelVo implements Serializable {

    private static final long serialVersionUID = 1L;
    @ApiModelProperty("生产单元名称")
    private String modeName;
    private String modeId;
    private String allParentName;
    @ApiModelProperty("生产单元编码")
    private String code;
    private String modeCode;
    @ApiModelProperty("生产单元类型")
    private String modeType;
    @ApiModelProperty(hidden = true)
    private String tenancyId;
    @ApiModelProperty("所属设备列表")
    private List<DeviceSimpleVo> sonDevices;

}

package com.lets.platform.model.device.vo;

import com.lets.platform.model.common.entity.CommonFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 大屏-设备 展示对象
 *
 * @version 1.0
 * @ClassName DeviceBigScreenVo
 * @author: DING WEI
 * @create: 2021/05/12 14:24
 **/
@Data
@ApiModel("大屏-设备 展示对象")
public class DeviceBigScreenVo {

    private String id;

    @ApiModelProperty("设备名称")
    private String deviceName;

    @ApiModelProperty("设备编码")
    private String code;

    @ApiModelProperty("设备图片")
    private CommonFile deviceImagesFile;
    @ApiModelProperty("设备图片id")
    private String deviceImages;

    @ApiModelProperty("今日运行时长")
    private String wordDuration;

    @ApiModelProperty("今日产量")
    private String output;

    @ApiModelProperty("运行状态")
    private String workStatus;
    private String workStatusName;

    @ApiModelProperty("运行状态颜色")
    private String colour;
}

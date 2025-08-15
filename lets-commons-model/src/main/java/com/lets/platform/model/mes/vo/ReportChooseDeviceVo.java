package com.lets.platform.model.mes.vo;

import com.lets.platform.model.common.entity.CommonDevice;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 报工选择设备列表
 * @author: DING WEI
 * @date: 2024/9/4 9:16
 */
@Data
@ApiModel("报工选择设备列表")
public class ReportChooseDeviceVo {

    @ApiModelProperty("是否弹框[NY]")
    private String alert;

    @ApiModelProperty("设备列表")
    private List<CommonDevice> deviceList;

}

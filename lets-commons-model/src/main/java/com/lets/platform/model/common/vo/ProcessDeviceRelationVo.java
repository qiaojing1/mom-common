package com.lets.platform.model.common.vo;

import com.lets.platform.common.pojo.base.BaseDo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 工序设备关联Vo
 */
@Data
@ApiModel("工序设备关联")
public class ProcessDeviceRelationVo extends BaseDo {
    /**
     * 工序id
     */
    @ApiModelProperty(value = "工序id")
    private String processId;

    /**
     * 序号
     */
    @ApiModelProperty(value = "序号")
    private String order;

    /**
     * 设备id
     */
    @ApiModelProperty(value = "设备id")
    private String deviceId;
    /**
     * 设备编码
     */
    @ApiModelProperty(value = "设备编码")
    private String deviceCode;
    /**
     * 设备名称
     */
    @ApiModelProperty(value = "设备名称")
    private String deviceName;

    @ApiModelProperty(value = "类型id")
    private String typeId;

    @ApiModelProperty(value = "类型名称")
    private String typeName;
    @ApiModelProperty(value = "型号名称")
    private String modelName;
    @ApiModelProperty(value = "型号id")
    private String modelId;
    /**
     * 租户id
     */
    private String tenancyId;

}

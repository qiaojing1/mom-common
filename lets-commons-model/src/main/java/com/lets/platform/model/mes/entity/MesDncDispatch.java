package com.lets.platform.model.mes.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @ClassName MesDncDispatch
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2024/3/5
 */
@Data
@ApiModel("程序下发管理")
public class MesDncDispatch {
    @ApiModelProperty("设备id 下发入参")
    private String id;
    @ApiModelProperty("设备编码")
    private String code;
    @ApiModelProperty("设备名称")
    private String name;
    @ApiModelProperty("设备类型")
    private String typeId;
    private String typeName;
    @ApiModelProperty("设备型号")
    private String modelId;
    private String modelName;
    @ApiModelProperty("设备控制器")
    private String controllerId;
    private String controllerName;
    @ApiModelProperty("设备状态")
    private String deviceStatus;
    private String deviceStatusName;
    @ApiModelProperty("当前执行程序")
    private String executeProgram4Now;
    @ApiModelProperty("当前下发程序")
    private String dispatchProgram4Now;
    @ApiModelProperty("下发时间")
    private LocalDateTime dispatchTime;
    @ApiModelProperty("操作员")
    private String operator;
    @ApiModelProperty(hidden = true)
    private String tenancyId;
    /**
     * @see com.lets.platform.model.mes.enums.DncDispatchEnum
     */
    @ApiModelProperty("下发类型")
    private String dispatchType;

    @ApiModelProperty("程序档案id 下发入参")
    private List<String> programIds;
}

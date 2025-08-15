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
public class MesDncPostback {
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
    @ApiModelProperty("回传时间")
    private LocalDateTime postbackTime;
    @ApiModelProperty("操作员")
    private String operator;


    private List<String> programIds;
}

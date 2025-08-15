package com.lets.platform.model.mes.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 设备运行参数 展示对象
 * @author: DING WEI
 * @date: 2024/1/9 18:23
 */
@Data
@ApiModel("设备运行参数 展示对象")
public class DeviceRunParamVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("派工单主键")
    private String dispatchId;

    @ApiModelProperty("类型[1:工艺文档,2:产品工艺变更通知,3:设备运行参数]")
    private String relationType;
    @ApiModelProperty("关联数据(工艺文档类型、变更通知主键、设备主键)")
    private String relationValue;
    @ApiModelProperty("是否准备")
    private String isPrepare;

    @ApiModelProperty("设备实时状态")
    private String smallStatusCode;
    @ApiModelProperty("设备实时状态名称")
    private String smallStatusName;

    @ApiModelProperty("点位数据")
    private List<DeviceRunParamItemVo> itemVoList;

}

package com.lets.platform.model.common.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 工艺路线-明细-工序信息 传输对象
 * @author DING WEI
 * @since 2023-11-15
 */
@Getter
@Setter
@ApiModel(value = "CommonRouteProcess 传输对象", description = "工艺路线-明细-工序信息 传输对象")
public class CommonRouteProcessDto {

    @ApiModelProperty("工艺路线主键")
    private String orderId;

    @ApiModelProperty("工序组主键")
    private String processGroupId;

    @ApiModelProperty("工序组名称")
    private String processGroupName;

    @ApiModelProperty("组排序")
    private Integer step;

    @ApiModelProperty("工序")
    private List<CommonRouteProcess> processList;
}

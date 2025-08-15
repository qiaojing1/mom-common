package com.lets.platform.model.device.query;

import com.lets.platform.common.pojo.base.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName DeviceProcedureBindProcessDo
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2023/2/22
 */
@Data
@ApiModel("程序绑定")
public class DeviceProcedureBindProcessQuery extends PageQuery {

    @ApiModelProperty("物料编码")
    private String materialCode;
    @ApiModelProperty("工艺路线编码")
    private String processRouteCode;
    @ApiModelProperty("是否完整")
    private String isComplete;

    @ApiModelProperty("物料描述")
    private String materialDesc;
    @ApiModelProperty("工艺路线分类")
    private String processRouteCategory;

    @ApiModelProperty(hidden = true)
    private String tenancyId;
    private String deviceId;
    private String materialId;
    private String processId;
    private String routeId;
    private String procedureId;
}

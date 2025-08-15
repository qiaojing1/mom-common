package com.lets.platform.model.device.query;

import com.lets.platform.common.pojo.base.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("程序档案")
public class DeviceProcedureFileQuery extends PageQuery {

    @ApiModelProperty(value = "父级程序id",required = true)
    private String id;
    @ApiModelProperty(value = "程序编码")
    private String code;

    @ApiModelProperty("程序名称")
    private String name;

    @ApiModelProperty("程序版本")
    private String version;

    @ApiModelProperty("控制器id")
    private String controllerId;

    @ApiModelProperty("审核状态")
    private String status;

    @ApiModelProperty("启用/停用状态")
    private String enable;

    @ApiModelProperty(hidden = true)
    private String tenancyId;
}

package com.lets.platform.model.device.query;

import com.lets.platform.common.pojo.base.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("程序变更")
public class DeviceProcedureFileChangeQuery extends PageQuery {
    @ApiModelProperty("单据编号")
    private String code;

    @ApiModelProperty("开始时间")
    private String startTime;
    @ApiModelProperty("结束时间")
    private String endTime;

    @ApiModelProperty("程序编码")
    private String procedureCode;

    @ApiModelProperty("name")
    private String name;

    @ApiModelProperty("程序版本")
    private String version;

    @ApiModelProperty("变更人员")
    private String userName;

    @ApiModelProperty("控制器id")
    private String controllerId;

    @ApiModelProperty("审核状态")
    private String status;

    @ApiModelProperty(hidden = true)
    private String tenancyId;
}

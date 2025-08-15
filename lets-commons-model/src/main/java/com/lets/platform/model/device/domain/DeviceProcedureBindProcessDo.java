package com.lets.platform.model.device.domain;

import com.alibaba.excel.EasyExcel;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.base.BaseDo;
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
@ApiModel("程序绑定工序")
@TableName("device_procedure_bind_process")
public class DeviceProcedureBindProcessDo extends BaseDo {
    @TableField("procedure_process_route_id")
    private String procedureProcessRouteId;
    @TableField("procedure_id")
    @ApiModelProperty("程序id")
    private String procedureId;
    @TableField(exist = false)
    @ApiModelProperty("程序名称")
    private String procedureName;
    @TableField(exist = false)
    @ApiModelProperty("程序版本")
    private String procedureVersion;
    @TableField("process_id")
    @ApiModelProperty("工序id")
    private String processId;
    @TableField(exist = false)
    @ApiModelProperty("工序名称")
    private String processName;
    @TableField("tenancy_id")
    private String tenancyId;
    @TableField("procedure_code")
    private String procedureCode;

    @TableField(exist = false)
    private String orderId;
    @TableField(exist = false)
    private Integer sort;
    @TableField(exist = false)
    private Integer step;

}

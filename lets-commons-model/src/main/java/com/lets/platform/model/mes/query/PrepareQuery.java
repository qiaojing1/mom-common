package com.lets.platform.model.mes.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 准备 查询对象
 * @author: DING WEI
 * @date: 2024/1/9 16:55
 */
@Data
@ApiModel("准备 查询对象")
public class PrepareQuery {

    @NotBlank(message = "PrepareQuery.dispatchId")
    @ApiModelProperty("工序任务主键")
    private String dispatchId;

    @NotBlank(message = "PrepareQuery.hmiId")
    @ApiModelProperty("HMI主键")
    private String hmiId;

    @ApiModelProperty(value = "是否填充上下工序信息", hidden = true)
    private Integer fillProcessInfo;
    @ApiModelProperty(value = "是否查询HMI配置", hidden = true)
    private Boolean findHmiSetting = Boolean.TRUE;
    /**
     * @see com.lets.platform.model.mes.enums.processPlan.MaterialPrepareTypeEnum
     */
    @ApiModelProperty(value = "类型", hidden = true)
    private String type;

}

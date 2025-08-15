package com.lets.platform.model.mes.dto;

import com.baomidou.mybatisplus.core.incrementer.DefaultIdentifierGenerator;
import com.lets.platform.model.common.entity.CommonHmiSettings;
import com.lets.platform.model.mes.entity.MesDispatchDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

/**
 * 任务执行-开工、暂停、继续
 * @author: DING WEI
 * @date: 2024/1/11 18:50
 */
@Data
@ApiModel("任务执行-开工、暂停、继续")
public class TaskExeActionButtonDto {

    @NotBlank(message = "DISPATCH_ID_NOT_BLANK")
    @ApiModelProperty("工序任务主键")
    private String dispatchId;
    @ApiModelProperty(hidden = true)
    private MesDispatchDetail dispatchDetail;

    @NotBlank(message = "PrepareQuery.hmiId")
    @ApiModelProperty("HMI主键")
    private String hmiId;

    @ApiModelProperty(hidden = true)
    private String tenancyId;
    @ApiModelProperty(hidden = true)
    private String userId;
    @ApiModelProperty(hidden = true)
    private String name;
    @ApiModelProperty(hidden = true)
    private LocalDateTime now;
    @ApiModelProperty(hidden = true)
    private CommonHmiSettings hmiSettings;

    @ApiModelProperty(value = "是否提示异常信息", hidden = true)
    private Boolean tipErrorMsg = Boolean.TRUE;
}

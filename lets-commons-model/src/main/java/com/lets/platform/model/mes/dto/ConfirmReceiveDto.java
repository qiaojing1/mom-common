package com.lets.platform.model.mes.dto;

import com.lets.platform.model.mes.entity.MesDispatchDetailMaterialPrepare;
import com.lets.platform.model.mes.entity.MesProduceOrderDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * 确认接受 传输对象
 * @author: DING WEI
 * @date: 2024/1/11 13:51
 */
@Data
@ApiModel("确认接受 传输对象")
public class ConfirmReceiveDto {

    @NotBlank(message = "PrepareQuery.dispatchId")
    @ApiModelProperty("当前工序任务(派工单)")
    private String dispatchId;

    @NotBlank(message = "PrepareQuery.hmiId")
    @ApiModelProperty("HMI主键")
    private String hmiId;

    /**
     * @see com.lets.platform.model.mes.enums.processPlan.MaterialPrepareTypeEnum
     */
    @ApiModelProperty(value = "类型", hidden = true)
    private String type;
    @NotEmpty(message = "ConfirmReceiveDto.materialPrepareList")
    @ApiModelProperty("接收物料")
    private List<MesDispatchDetailMaterialPrepare> materialPrepareList;

    @ApiModelProperty(hidden = true)
    private MesProduceOrderDetail produceOrderDetail;

}

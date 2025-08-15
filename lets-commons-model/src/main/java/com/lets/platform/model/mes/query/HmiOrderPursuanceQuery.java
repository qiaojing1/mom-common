package com.lets.platform.model.mes.query;

import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.valid.Save;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * 工位机-工单执行-查询对象
 * @author: DING WEI
 * @date: 2024/10/14 16:14
 */
@Data
@ApiModel("工位机-工单执行-查询对象")
public class HmiOrderPursuanceQuery {

    @ApiModelProperty("明细主键")
    private String id;

    @ApiModelProperty("关键字(派工任务-模糊查询[工单编码 工序计划编码 任务编码])")
    private String keyWord;

    /**
     * @see com.lets.platform.model.mes.enums.produceOrder.TaskStatusEnum
     */
    @ApiModelProperty("任务状态")
    private List<String> statusList;
    @NotBlank(message = "MesDispatchDetailQuery.hmiCode", groups = {Save.class})
    @ApiModelProperty("HMI主键")
    private String hmiId;
    @ApiModelProperty("用户id")
    private String userId;

    @ApiModelProperty("是否隐藏已完成(true、false)")
    private Boolean hiddenFinish;

    @ApiModelProperty(value = "页码,默认0")
    private Integer current = GlobalConstant.ZERO;

    @ApiModelProperty(value = "页长,默认27")
    private Integer size = 27;

}

package com.lets.platform.model.mes.query;

import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * 派工-明细 查询对象
 * @author DING WEI
 * @date 2024/1/5 16:46
 * @version 1.0
 */
@Data
@ApiModel(value = "派工-明细 查询对象", description = "派工-明细 查询对象")
public class MesDispatchDetailQuery {

    @ApiModelProperty("关键字(派工任务-精确查询[工单编码 工序计划编码 任务编码])")
    private String preciseKeyWord;

    @ApiModelProperty("关键字(派工任务-模糊查询[工单编码 工序计划编码 任务编码])")
    private String keyWord;

    /**
     * @see com.lets.platform.model.mes.enums.DispatchDetailStatusEnum
     */
    @ApiModelProperty("任务状态")
    private List<Integer> statusList;

    @ApiModelProperty("工序")
    private List<String> processIds;

    @NotBlank(message = "MesDispatchDetailQuery.hmiCode", groups = {Save.class})
    @ApiModelProperty("HMI主键")
    private String hmiId;
    @ApiModelProperty("用户id")
    private String userId;
    @ApiModelProperty("单据日期")
    private String orderTime;

    @ApiModelProperty("逾期类型(0当期,1逾期,不传全部)")
    private Integer overdueType;

    @ApiModelProperty("是否隐藏完工(true、false)")
    private Boolean hiddenFinish;

    /**
     * @see com.lets.platform.model.mes.enums.HmiOperationTypeEnum
     */
    @ApiModelProperty("0:不可接收,1:可接收,2:可报工,3:不可报工")
    private String operationType;

    @NotBlank(message = "CURRENT_TASK_NOT_BLANK", groups = {Update.class})
    @ApiModelProperty("当前工序任务主键")
    private String dispatchId;
    @ApiModelProperty("生产工单编号")
    private String produceOrderCode;
    @ApiModelProperty("工序计划编号")
    private String sourceOrderCode;
    @ApiModelProperty("0上一任务、1下一任务")
    private Integer direction;
    @ApiModelProperty("汇报单编号")
    private String code;

    @ApiModelProperty("是否二次派工[YN]")
    private String secondaryDispatching;

    @ApiModelProperty(value = "页码,默认0")
    private Integer current = GlobalConstant.ZERO;

    @ApiModelProperty(value = "页长,默认27")
    private Integer size = 27;
}

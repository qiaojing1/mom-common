package com.lets.platform.model.mes.dto;

import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.model.mes.enums.produceOrder.PursuanceRecordTypeEnum;
import com.lets.platform.model.psi.entity.PsiProduceOrderPursuanceRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * 工单执行-数据传输
 * @author: DING WEI
 * @date: 2024/10/21 15:38
 */
@Data
@ApiModel("工单执行-数据传输")
public class PursuanceSaveDto {

    @NotBlank(message = "生产工单明细主键不能为空")
    @ApiModelProperty("生产工单明细主键")
    private String produceDetailId;

    @NotBlank(message = "工位机主键不能为空")
    @ApiModelProperty("工位机主键")
    private String hmiId;

    @ApiModelProperty("容器主键")
    private String containerId;

    @ValidatedEnum(enumClass = PursuanceRecordTypeEnum.class, required = true, message = "扫码业务类型不能为空")
    private String type;

    @NotEmpty(message = "配料不能为空")
    private List<PsiProduceOrderPursuanceRecord> list;

}

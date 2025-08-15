package com.lets.platform.model.mes.dto;

import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.model.mes.enums.produceOrder.CuttingStatusEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * 生产工单-快速修改
 * @author DING WEI
 * @date 2025/6/17 18:18
 * @version 1.0
 */
@Data
public class ProduceOrderQuickModifyDto {

    @NotEmpty(message = "请选择快速修改的数据")
    @ApiModelProperty("需要修改的数据的id")
    private List<String> ids;

    @ApiModelProperty("下料状态")
    @ValidatedEnum(enumClass = CuttingStatusEnum.class, message = "下料状态错误")
    private Integer cuttingStatus;
}

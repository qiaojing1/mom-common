package com.lets.platform.model.psi.dto;

import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.model.psi.enums.PurchaseDistributeSummaryTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * 采购下发 参数
 * @author: DING WEI
 * @date: 2024/3/12 9:46
 */
@Data
@ApiModel("采购下发 参数")
public class PurchaseDistributeDto {

    @ValidatedEnum(enumClass = PurchaseDistributeSummaryTypeEnum.class, required = true, message = "汇总类型非法")
    @ApiModelProperty("汇总类型")
    private Integer type;

    @NotBlank(message = "PLEASE_CHOOSE_CATEGORY")
    @ApiModelProperty("单据类别")
    private String orderCategoryId;

    @NotEmpty(message = "PLEASE_CHOOSE_DISTRIBUTE_DATA")
    @ApiModelProperty("采购申请明细")
    private List<PurchaseDistributeDetailDto> details;

}

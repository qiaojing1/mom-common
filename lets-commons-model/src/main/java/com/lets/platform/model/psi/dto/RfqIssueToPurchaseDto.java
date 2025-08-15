/*
 * csy
 */

/*
 * csy
 */

package com.lets.platform.model.psi.dto;

import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.model.psi.enums.PurchaseDistributeSummaryTypeEnum;
import com.lets.platform.model.psi.vo.PsiPurchaseRfqVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;


@Data
@ApiModel("采购下发 参数")
public class RfqIssueToPurchaseDto {

    @ApiModelProperty("单据类别")
    private String orderCategoryId;

    @ApiModelProperty("采购询价明细")
    private List<PsiPurchaseRfqVO> details;

}

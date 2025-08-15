package com.lets.platform.model.mes.vo;

import com.lets.platform.model.psi.entity.PsiProduceOrderPursuanceRecord;
import com.lets.platform.model.psi.vo.ExternalBarcodeVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 工单执行-合格数量
 * @author: DING WEI
 * @date: 2024/10/25 14:15
 */
@Data
@ApiModel("工单执行-合格数量")
public class PursuanceRichNumberVo {

    @ApiModelProperty("合格数量")
    private BigDecimal richNumber;

    @ApiModelProperty("不良数量")
    private BigDecimal poorNumber;

    @ApiModelProperty("产量")
    private BigDecimal output;

    /**
     * @see com.lets.platform.model.mes.enums.produceOrder.PursuanceRichSourceEnum
     */
    @ApiModelProperty("合格数量来源[1:扫码装箱;2:外部码]")
    private String source;

    @ApiModelProperty(hidden = true)
    private PsiProduceOrderPursuanceRecord pursuanceStartWork;

    @ApiModelProperty("最新外部码")
    private ExternalBarcodeVo newestExternalBarcode;
}

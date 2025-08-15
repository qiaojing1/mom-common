/*
 * csy
 */

/*
 * csy
 */

/*
 * csy
 */

package com.lets.platform.model.collection.dto;

import com.lets.platform.model.mes.entity.BatDispatchDto;
import com.lets.platform.model.mes.entity.MesProcessPlanDetail;
import com.lets.platform.model.mes.entity.MesProduceOrderDetailSerial;
import com.lets.platform.model.mes.entity.MesProduceOrderDetailSpecific;
import com.lets.platform.model.psi.entity.PsiMaterial;
import com.lets.platform.model.psi.entity.PsiOrderCategory;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * @ClassName DetectOrderFromMesDto
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2024/8/23
 */
@Data
public class DetectOrderFromMesParams {

    private String materialId;
    private String currentOrderCategoryId;
    private String lrpNo;
    private String trackNo;
    private String sourceOrderId;
    private String sourceOrderCode;
    private Long sourceOrderLineNumber;
    private String sourceOrderDetailId;

    private String produceOrderDetailId;

    private BigDecimal number;

    private String saleOrderCode;
    private String lineNumber;

    private String processId;
    private String processName;
}

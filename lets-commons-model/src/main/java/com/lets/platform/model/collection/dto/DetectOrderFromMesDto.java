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

import java.util.List;
import java.util.Map;

/**
 * @ClassName DetectOrderFromMesDto
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2024/8/23
 */
@Data
public class DetectOrderFromMesDto {
    private List<DetectOrderFromMesParams> detectProcess;
    private Map<String, PsiMaterial> materialMap;
    private List<MesProduceOrderDetailSpecific> specifics;
    private BatDispatchDto dispatchDto;
    /**
     * 生产工单序列号=>产品编号，生产工单下达自动生成
     */
    private Map<String, List<MesProduceOrderDetailSerial>> serialMap;
    private PsiOrderCategory sourceOrderCategory;

    private String sourceOrderType;
    private String targetOrderCategoryId;
    private String isSave;

}

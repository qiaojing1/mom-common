package com.lets.platform.model.mes.dto;

import com.lets.platform.model.psi.entity.PsiProducePlanBom;
import com.lets.platform.model.psi.entity.PsiProducePlanBomDetail;
import lombok.Data;

import java.util.List;
import java.util.Set;

/**
 * BOM数据拷贝传输
 * @author: DING WEI
 * @date: 2023/12/6 11:22
 */
@Data
public class PsiProducePlanCopyBom {

    private Set<String> produceDetailIds;
    private List<PsiProducePlanBom> bomList;
    private List<PsiProducePlanBomDetail> detailList;

}

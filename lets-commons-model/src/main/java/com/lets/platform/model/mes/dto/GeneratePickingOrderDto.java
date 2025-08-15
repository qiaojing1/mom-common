package com.lets.platform.model.mes.dto;

import com.lets.platform.model.psi.entity.PsiStorageStore;
import com.lets.platform.model.psi.enums.IsOrNotEnum;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Map;

/**
 * 生成领料单 数据传输对象
 * @author: DING WEI
 * @date: 2024/9/6 17:18
 */
@Data
public class GeneratePickingOrderDto {

    private Map<String, BigDecimal> produceDetailIdAndNumberMap;
    private LocalDateTime now;

    private String preMsg;

    private PsiStorageStore psiStorageStore;
    private IsOrNotEnum fromPurchase;

}

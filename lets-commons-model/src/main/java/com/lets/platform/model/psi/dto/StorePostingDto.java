package com.lets.platform.model.psi.dto;

import com.lets.platform.common.pojo.enums.OperateTypeEnum;
import com.lets.platform.common.pojo.enums.StockTypeEnum;
import com.lets.platform.model.psi.entity.PsiStoreMaterialRecord;
import lombok.Data;

import java.util.List;

/**
 * 过账-库存异动参数
 * @author: DING WEI
 * @date: 2023/12/14 14:31
 */
@Data
public class StorePostingDto {

    private List<PsiStoreMaterialRecord> storeList;

    private StockTypeEnum stockTypeEnum;
    private OperateTypeEnum operateTypeEnum;
    private Boolean tipSourceLineNumber;

}

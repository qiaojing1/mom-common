package com.lets.platform.client.psi.fallback;

import com.lets.platform.client.psi.StoreMaterialRecordClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.psi.dto.StoreDto;
import com.lets.platform.model.psi.dto.StorePostingDto;
import com.lets.platform.model.psi.entity.PsiMonthStockReport;
import com.lets.platform.model.psi.query.PsiMonthStockReportQuery;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * StoreMaterialRecordClient
 * @author DING WEI
 * @date 2023/11/17 14:26
 * @version 1.0
 */
@Service
public class StoreMaterialRecordClientFallback extends BaseController implements StoreMaterialRecordClient {
    @Override
    public RespMsgBean<List<StoreDto>> store(StorePostingDto postingDto) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<List<PsiMonthStockReport>> stockReport(PsiMonthStockReportQuery query) {
        return success(SUCCESS, new ArrayList<>());
    }

}

package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.StoreMaterialRecordClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.psi.dto.StoreDto;
import com.lets.platform.model.psi.dto.StorePostingDto;
import com.lets.platform.model.psi.entity.PsiMonthStockReport;
import com.lets.platform.model.psi.query.PsiMonthStockReportQuery;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * StoreMaterialRecordClient
 * @author DING WEI
 * @date 2023/11/17 14:26
 * @version 1.0
 */
@FeignClient(value = "psi",fallback = StoreMaterialRecordClientFallback.class)
public interface StoreMaterialRecordClient {

    @PostMapping("/psiStoreMaterialRecord/store")
    RespMsgBean<List<StoreDto>> store(@RequestBody StorePostingDto postingDto);

    @ApiOperation(value = "库存月度报表")
    @PostMapping("/psiStoreMaterialRecord/stockReport")
    public RespMsgBean<List<PsiMonthStockReport>> stockReport(@RequestBody PsiMonthStockReportQuery query);

}

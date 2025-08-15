package com.lets.platform.client.common.fallback;

import com.lets.platform.client.common.client.QueryInfluxDbClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.collection.dto.QueryInfluxDbDto;
import com.lets.platform.model.common.dto.HistoryProcessStatisticsDto;
import com.lets.platform.model.mes.entity.MesProduceJobSingletonProcess;
import com.lets.platform.model.psi.vo.PursuanceBarcodeTrackDetailVo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 查询InfluxDb
 * @author DING WEI
 * @date 2024/5/9 13:58
 * @version 1.0
 */
@Service
public class QueryInfluxDbClientFallback extends BaseController implements QueryInfluxDbClient {

    @Override
    public RespMsgBean<BigDecimal> queryInfluxDb(QueryInfluxDbDto queryInfluxDbDto) {
        return success(BigDecimal.ZERO);
    }

    @Override
    public RespMsgBean<Map<String, List<HistoryProcessStatisticsDto>>> getExportData(List<MesProduceJobSingletonProcess> findHistoryItem) {
        return success(new HashMap<>());
    }

    @Override
    public RespMsgBean<Map<String, List<HistoryProcessStatisticsDto>>> getExportDataBarcodeTrack(List<PursuanceBarcodeTrackDetailVo> findHistoryItem) {
        return success(SUCCESS, new HashMap<>());
    }
    @Override
    public RespMsgBean<Map<String,Object>> queryInfluxDbLimit1(@RequestBody QueryInfluxDbDto queryInfluxDbDto) {
        return success(SUCCESS, new HashMap<>());
    }

}

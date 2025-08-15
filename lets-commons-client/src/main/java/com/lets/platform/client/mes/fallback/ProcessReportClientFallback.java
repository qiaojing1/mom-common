package com.lets.platform.client.mes.fallback;

import com.lets.platform.client.mes.ProcessReportClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.mes.dto.ReportDto;
import com.lets.platform.model.mes.entity.MesProcessReport;
import com.lets.platform.model.mes.entity.MesProcessReportDetail;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.*;

/**
 * 工序汇报单 feign接口 服务降级
 *
 * @author DING WEI
 * @version 1.0
 * @date 2024/5/22 14:11
 */
@Service
public class ProcessReportClientFallback extends BaseController implements ProcessReportClient {

    @Override
    public RespMsgBean<Map<String, MesProcessReport>> findByIds4Map(Collection<String> ids) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<Map<String, MesProcessReportDetail>> findByIds4DetailMap(Collection<String> ids) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<List<MesProcessReportDetail>> findByIds4DetailList(Collection<String> ids) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<Integer> updateList4StockIn(List<MesProcessReportDetail> list) {
        return failure(FAILURE);
    }

    @Override
    public RespMsgBean report(@Validated @RequestBody ReportDto reportDto) {
        return success(SUCCESS);
    }
}

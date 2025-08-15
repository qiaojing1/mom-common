package com.lets.platform.client.psi.fallback;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.lets.platform.client.psi.ProduceOrderPursuanceRecordClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.AutoConditionEntity;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.mes.vo.SjProduceReportOrderVo;
import com.lets.platform.model.psi.entity.PsiProduceOrderPursuanceRecord;
import com.lets.platform.model.psi.entity.PsiProduceOrderPursuanceRecordKeys;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 生产工单-执行记录(工位机) 控制器 接口
 * @author DING WEI
 * @date 2025/2/17 15:54
 * @version 1.0
 */
@Service
public class ProduceOrderPursuanceRecordClientFallback extends BaseController implements ProduceOrderPursuanceRecordClient {

    @Override
    public RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(ExportWithTemplateDto dto) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<List<SjProduceReportOrderVo>> perfect4Sj(List<SjProduceReportOrderVo> records) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<List<PsiProduceOrderPursuanceRecord>> findList(int size,
                                                                      int current,String startTime,String endTime) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean batSave(List<PsiProduceOrderPursuanceRecordKeys> records) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean deleteByRecords(List<String> deleteIds) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<IPage<PsiProduceOrderPursuanceRecord>> defaultPage(AutoConditionEntity autoConditionEntity) {
        return success(SUCCESS);
    }
}

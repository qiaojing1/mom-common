package com.lets.platform.client.collection.fallback;

import com.lets.platform.client.collection.client.DetectOrderClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.collection.dto.DetectOrderFromMesDto;
import com.lets.platform.model.collection.entity.CollectionDetectOrder;
import com.lets.platform.model.collection.entity.CollectionDetectOrderProject;
import com.lets.platform.model.collection.entity.CollectionQualityCertification;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.common.dto.GetInspectItemInfoDto;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 设备历史状态
 *
 * @author: DING WEI
 * @date: 2023/12/1 8:59
 */
@Service
public class DetectOrderClientFallback extends BaseController implements DetectOrderClient {

    public RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(ExportWithTemplateDto dto) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<Map<String,Object>> generateOrderFromMes(DetectOrderFromMesDto dto) {
        return failure();
    }

    @Override
    public RespMsgBean<Map<String, List<CollectionDetectOrder>>> findBySourceDetailIds(Collection<String> sourceDetailIds) {
        return failure();
    }

    @Override
    public RespMsgBean<CollectionDetectOrder> extractOrderInfo(GetInspectItemInfoDto dto) {
        return failure();
    }

    @Override
    public RespMsgBean<List<CollectionDetectOrderProject>> getDetectInspectItem(GetInspectItemInfoDto dto) {
        return failure();
    }

    @Override
    public RespMsgBean batSaveQualityCertification(List<CollectionQualityCertification> list) {
        return failure();
    }
}

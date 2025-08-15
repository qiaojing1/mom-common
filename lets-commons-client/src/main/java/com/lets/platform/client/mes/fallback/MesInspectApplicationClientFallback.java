package com.lets.platform.client.mes.fallback;

import com.lets.platform.client.mes.MesInspectApplicationClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.mes.entity.MesInspectionApplicationOrder;
import com.lets.platform.model.mes.entity.MesInspectionApplicationOrderDetail;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 检验方案 Feign接口
 *
 * @author FZY
 */
@Service
public class MesInspectApplicationClientFallback extends BaseController implements MesInspectApplicationClient {

    @Override
    public RespMsgBean<Map<String, MesInspectionApplicationOrder>> findByIds4Map(Collection<String> ids) {
        return failure();
    }

    @Override
    public RespMsgBean<List<MesInspectionApplicationOrderDetail>> findDetailByIds(Collection<String> detailIds) {
        return failure();
    }

    @Override
    public RespMsgBean<Void> saveAndApprove(MesInspectionApplicationOrder order) {
        return failure();
    }

    @Override
    public RespMsgBean<String> defaultSaveOrUpdate(MesInspectionApplicationOrder order) {
        return failure();
    }
}

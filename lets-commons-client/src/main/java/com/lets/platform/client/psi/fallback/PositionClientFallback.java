package com.lets.platform.client.psi.fallback;

import com.lets.platform.client.psi.PositionClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.psi.entity.PsiStoragePosition;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * StoreClient
 * @author DING WEI
 * @date 2023/11/17 14:26
 * @version 1.0
 */
@Service
public class PositionClientFallback extends BaseController implements PositionClient {
    @Override
    public RespMsgBean<PsiStoragePosition> findById4Do(String id) {
        return success(SUCCESS);
    }
    @Override
    public RespMsgBean<Map<String, PsiStoragePosition>> findByIds4Map(Collection<String> ids) {
        return success(SUCCESS);
    }
    @Override
    public RespMsgBean<Map<String, PsiStoragePosition>> findByCodes4Map(Collection<String> codes) {
        return success(SUCCESS);
    }
    @Override
    public RespMsgBean<Map<String, PsiStoragePosition>> findByNames4Map(Collection<String> names) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(ExportWithTemplateDto dto) {
        return success(SUCCESS, new ArrayList<>());
    }


}

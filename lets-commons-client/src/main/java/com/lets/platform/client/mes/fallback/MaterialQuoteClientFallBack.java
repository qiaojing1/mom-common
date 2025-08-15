/*
 * csy
 */

package com.lets.platform.client.mes.fallback;

import com.lets.platform.client.mes.ArchivingPlanClient;
import com.lets.platform.client.mes.MaterialQuoteClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.mes.vo.MesArchivingPlanVo;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * 产品档案归档方案feign
 *
 * @author zhangweiyan
 * @version 1.0
 * @date 2024/9/24 17:38
 */
@Service
public class MaterialQuoteClientFallBack extends BaseController implements MaterialQuoteClient {


    @Override
    public RespMsgBean<Map<String, Set<String>>> handle(Collection<String> ids) {
        return success(new HashMap<>());
    }

    @Override
    public RespMsgBean<Map<String, Set<String>>> handleGroup(Collection<String> ids) {
        return success(new HashMap<>());
    }
}

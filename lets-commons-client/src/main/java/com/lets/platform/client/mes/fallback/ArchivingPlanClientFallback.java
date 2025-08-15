package com.lets.platform.client.mes.fallback;

import com.lets.platform.client.mes.ArchivingPlanClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.mes.vo.MesArchivingPlanVo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 产品档案归档方案feign
 *
 * @author zhangweiyan
 * @version 1.0
 * @date 2024/9/24 17:38
 */
@Service
public class ArchivingPlanClientFallback extends BaseController implements ArchivingPlanClient {

    @Override
    public RespMsgBean<List<ExportWithTemplateDto>> printData(MesArchivingPlanVo planVo) {
        return success(SUCCESS, new ArrayList<>());
    }
}

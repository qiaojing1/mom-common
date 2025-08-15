package com.lets.platform.client.psi.fallback;

import com.lets.platform.client.psi.IssueClient;
import com.lets.platform.client.psi.PackageOrderClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.common.pojo.model.IssueInfo;
import com.lets.platform.common.pojo.model.IssueParam;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.mes.entity.MesInspectionOrder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class PackageOrderClientFallback extends BaseController implements PackageOrderClient {
    @Override
    public RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate( ExportWithTemplateDto dto) {
        return failure();
    }

    @Override
    public RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplateShipOrder(ExportWithTemplateDto dto) {
        return failure();
    }
}

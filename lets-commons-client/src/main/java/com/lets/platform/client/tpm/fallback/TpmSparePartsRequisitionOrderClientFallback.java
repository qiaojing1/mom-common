package com.lets.platform.client.tpm.fallback;

import com.lets.platform.client.tpm.client.TpmInspectionItemsPlanClient;
import com.lets.platform.client.tpm.client.TpmSparePartsRequisitionOrderClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


/**
 * StoreClient
 * @author DING WEI
 * @date 2023/11/17 14:26
 * @version 1.0
 */
@Service
public class TpmSparePartsRequisitionOrderClientFallback extends BaseController implements TpmSparePartsRequisitionOrderClient {

    @Override
    public RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(ExportWithTemplateDto dto) {
        return success(SUCCESS, new ArrayList<>());
    }
}

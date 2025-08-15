package com.lets.platform.client.psi.fallback;

import com.lets.platform.client.psi.PurchaseStockInClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.psi.entity.PsiPurchaseStockInOrder;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 销售退货单 接口
 *
 * @author QIAO JING
 * @version 1.0
 * @date 2023/10/19 14:27
 */
@Service
public class PurchaseStockInClientFallback extends BaseController implements PurchaseStockInClient {

    @Override
    public RespMsgBean<?> saveAndPosting(PsiPurchaseStockInOrder stockInOrder) {
        return failure();
    }

    @Override
    public RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(ExportWithTemplateDto templateDto) {
        return failure();
    }

    @Override
    public RespMsgBean<Map<String, Object>> findStockInWithDelivery() {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<Map<String, List<BigDecimal>>> findStockInCount(String startTime, String endTime, String queryType) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<Map<String, List<BigDecimal>>> actualMaterialCollection(String startTime, String endTime, String queryType) {
        return success(SUCCESS, new HashMap<>());
    }


}

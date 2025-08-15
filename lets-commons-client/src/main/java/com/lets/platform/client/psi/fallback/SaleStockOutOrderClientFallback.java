package com.lets.platform.client.psi.fallback;

import com.lets.platform.client.psi.SaleStockOutOrderClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.psi.entity.PsiSaleStockOutOrder;
import com.lets.platform.model.psi.vo.PsiSaleStockOutOrderVO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 销售出库Feign 接口
 *
 * @author QIAO JING
 * @version 1.0
 * @date 2023/10/19 14:27
 */
@Service
public class SaleStockOutOrderClientFallback extends BaseController implements SaleStockOutOrderClient {
    @Override
    public RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(ExportWithTemplateDto dto) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<List<PsiSaleStockOutOrderVO>> queryByDetailIds(String id) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<?> saveAndPosting(PsiSaleStockOutOrder entity) {
        return null;
    }

    @Override
    public RespMsgBean<Map<String, Object>> findDeliveryQuantity() {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<Map<String, Object>> findDeliveryCount() {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<Map<String, Object>> findDeliveryErrorCount() {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<Long> findCountBySourceDetailId(List<String> ids) {
        return failure(FAILURE);
    }
}

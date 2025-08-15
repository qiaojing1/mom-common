package com.lets.platform.client.psi.fallback;

import com.lets.platform.client.psi.SaleReturnApplicationOrderClient;
import com.lets.platform.client.psi.SaleReturnOrderClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.psi.entity.PsiSaleReturnApplicationOrder;
import com.lets.platform.model.psi.entity.PsiSaleReturnApplicationOrderMaterial;
import com.lets.platform.model.psi.entity.PsiSaleReturnOrder;
import com.lets.platform.model.psi.entity.PsiWipCompletionStockInOrder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;
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
public class SaleReturnOrderClientFallback extends BaseController implements SaleReturnOrderClient {

    @Override
    public RespMsgBean<?> saveAndPosting(PsiSaleReturnOrder stockInOrder) {
        return failure();
    }

    @Override
    public RespMsgBean<Long> queryCount(Collection<String> ids) {
        return failure();
    }
}

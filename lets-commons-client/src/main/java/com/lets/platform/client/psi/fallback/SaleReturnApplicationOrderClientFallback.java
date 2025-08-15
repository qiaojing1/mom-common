package com.lets.platform.client.psi.fallback;

import com.lets.platform.client.psi.SaleReturnApplicationOrderClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.psi.entity.PsiSaleReturnApplicationOrder;
import com.lets.platform.model.psi.entity.PsiSaleReturnApplicationOrderMaterial;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 销售退货申请单 接口
 *
 * @author QIAO JING
 * @version 1.0
 * @date 2023/10/19 14:27
 */
@Service
public class SaleReturnApplicationOrderClientFallback extends BaseController implements SaleReturnApplicationOrderClient {
    @Override
    public RespMsgBean<Map<String, PsiSaleReturnApplicationOrder>> findByIds4Map(@RequestBody Collection<String> ids) {
        return failure();
    }

    @Override
    public RespMsgBean<Map<String, PsiSaleReturnApplicationOrderMaterial>> findByIds4MapDetail(Collection<String> detailIds) {
        return failure();
    }

    @Override
    public RespMsgBean<Void> updateDetailBatch(List<PsiSaleReturnApplicationOrderMaterial> detailList) {
        return failure();
    }
}

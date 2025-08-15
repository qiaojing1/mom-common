package com.lets.platform.client.psi.fallback;

import com.lets.platform.client.psi.SaleOrderClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.psi.dto.UpdateSaleOrderQuantityDTO;
import com.lets.platform.model.psi.entity.PsiSaleOrder;
import com.lets.platform.model.psi.entity.PsiSaleOrderMaterial;
import com.lets.platform.model.psi.entity.PsiSaleOrderMaterialDemand;
import com.lets.platform.model.psi.vo.PsiSaleOrderVO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 采购订单Feign 接口
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/10/19 14:27
 */
@Service
public class SaleOrderClientFallback extends BaseController implements SaleOrderClient {

    @Override
    public RespMsgBean<Long> getOrderCount() {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(ExportWithTemplateDto dto) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<List<PsiSaleOrderVO>> queryByDetailIds(List<String> sourceIds) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<PsiSaleOrderMaterialDemand> findMaterialDemand(String planId) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<PsiSaleOrderMaterial> findById(String id) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<PsiSaleOrderMaterial> findSaleMaterial4ProduceOrder(String producePlanId) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<Map<String, PsiSaleOrderMaterial>> findByIds4Map(Collection<String> ids) {
        return failure();
    }

    @Override
    public RespMsgBean<Void> updateProduceQuantity(List<UpdateSaleOrderQuantityDTO> updateSaleOrderQuantityDTOS) {
        return failure();
    }

    @Override
    public RespMsgBean<String> defaultSave(PsiSaleOrder saleOrder) {
        return null;
    }
}

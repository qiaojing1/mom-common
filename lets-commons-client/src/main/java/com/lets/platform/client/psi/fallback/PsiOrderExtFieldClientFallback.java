/*
 * csy
 */

package com.lets.platform.client.psi.fallback;

import com.lets.platform.client.psi.OrderTrackClient;
import com.lets.platform.client.psi.PsiOrderExtFieldClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.psi.dto.InspectDTO;
import com.lets.platform.model.psi.entity.PsiOrderExtField;
import com.lets.platform.model.psi.entity.PsiOrderTrack;
import com.lets.platform.model.psi.entity.PsiPurchaseOrderDetail;
import com.lets.platform.model.psi.entity.PsiSaleOrderMaterial;
import com.lets.platform.model.psi.vo.UpdateOrderTrackVo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.*;

/**
 * @author zhangweiyan
 * @ClassName OrderTrackClientFallback
 * @Description TODO
 * @Date 2024/4/22 11:23
 **/
@Service
public class PsiOrderExtFieldClientFallback extends BaseController implements PsiOrderExtFieldClient {

    @Override
    public RespMsgBean<List<PsiOrderExtField>> findBySourceDetailId(Collection<String> sourceDetailIds) {
        return failure();
    }
}

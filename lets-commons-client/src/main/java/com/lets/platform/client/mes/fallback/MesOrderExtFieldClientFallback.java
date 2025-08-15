/*
 * csy
 */

package com.lets.platform.client.mes.fallback;

import com.lets.platform.client.mes.MesOrderExtFieldClient;
import com.lets.platform.client.psi.PsiOrderExtFieldClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.mes.dto.OrderExtFieldDTO;
import com.lets.platform.model.mes.entity.MesOrderExtField;
import com.lets.platform.model.psi.entity.PsiOrderExtField;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author zhangweiyan
 * @ClassName OrderTrackClientFallback
 * @Description TODO
 * @Date 2024/4/22 11:23
 **/
@Service
public class MesOrderExtFieldClientFallback extends BaseController implements MesOrderExtFieldClient {

    @Override
    public RespMsgBean<List<MesOrderExtField>> findBySourceDetailId(Collection<String> sourceDetailIds) {
        return success(new ArrayList<>());
    }

    @Override
    public  RespMsgBean<List<Map<String,Object>>> supplyExtField(OrderExtFieldDTO dto) {
        return success(new ArrayList<>());
    }

    @Override
    public  RespMsgBean<Map<String,Object>> supplyExtFieldSingle(OrderExtFieldDTO dto) {
        return success(new HashMap<>());
    }
}

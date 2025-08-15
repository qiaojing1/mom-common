/*
 * csy
 */

package com.lets.platform.client.mes;

import com.lets.platform.client.mes.fallback.MesOrderExtFieldClientFallback;
import com.lets.platform.client.psi.fallback.PsiOrderExtFieldClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.mes.dto.OrderExtFieldDTO;
import com.lets.platform.model.mes.entity.MesOrderExtField;
import com.lets.platform.model.psi.entity.PsiOrderExtField;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * StoreClient
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/11/17 14:26
 */
@FeignClient(value = "mes", fallback = MesOrderExtFieldClientFallback.class)
public interface MesOrderExtFieldClient {

    @PostMapping("/mesOrderExtField/findBySourceDetailId")
    RespMsgBean<List<MesOrderExtField>> findBySourceDetailId(@RequestBody Collection<String> sourceDetailIds) ;


    @PostMapping("/mesOrderExtField/supplyExtField")
     RespMsgBean<List<Map<String,Object>>> supplyExtField(@RequestBody OrderExtFieldDTO dto);

    @PostMapping("/mesOrderExtField/supplyExtFieldSingle")
     RespMsgBean<Map<String,Object>> supplyExtFieldSingle(@RequestBody OrderExtFieldDTO dto);
}

package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.PositionClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.psi.entity.PsiStoragePosition;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * StoreClient
 * @author DING WEI
 * @date 2023/11/17 14:26
 * @version 1.0
 */
@FeignClient(value = "psi",fallback = PositionClientFallback.class)
public interface PositionClient {

    @GetMapping("/psiStoragePosition/findById4Do")
    RespMsgBean<PsiStoragePosition> findById4Do(@RequestParam("id") String id);
    @PostMapping("/psiStoragePosition/findByIds4Map")
    RespMsgBean<Map<String, PsiStoragePosition>> findByIds4Map(@RequestBody Collection<String> ids);
    @PostMapping("/psiStoragePosition/findByCodes4Map")
    RespMsgBean<Map<String, PsiStoragePosition>> findByCodes4Map(@RequestBody Collection<String> codes);
    @PostMapping("/psiStoragePosition/findByNames4Map")
    RespMsgBean<Map<String, PsiStoragePosition>> findByNames4Map(@RequestBody Collection<String> names);

    @PostMapping("/psiStoragePosition/batGetDate4ExportTemplate")
    RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(@RequestBody ExportWithTemplateDto dto);

}

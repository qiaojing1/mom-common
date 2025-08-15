package com.lets.platform.client.tpm.client;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lets.platform.client.tpm.fallback.TpmCallRepairOrderClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.AutoConditionEntity;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.tpm.entity.TpmCallRepairOrder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * TpmCallRepairOrderClient
 * @author zhangweiyan
 * @date 2025/02/07 14:26
 * @version 1.0
 */
@FeignClient(value = "tpm",fallback = TpmCallRepairOrderClientFallback.class)
public interface TpmCallRepairOrderClient {

    @PostMapping("/tpmCallRepairOrder/findPage")
    RespMsgBean<Page<TpmCallRepairOrder>> findPage(@RequestBody() AutoConditionEntity entity);

    @PostMapping("/tpmCallRepairOrder/batGetDate4ExportTemplate")
    RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(@RequestBody ExportWithTemplateDto dto);

}

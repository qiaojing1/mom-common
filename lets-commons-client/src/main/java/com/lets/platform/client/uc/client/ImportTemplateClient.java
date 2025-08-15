package com.lets.platform.client.uc.client;

import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.uc.entity.SysImportTemplate;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 导入模板Feign接口
 * @author DING WEI
 * @date 2025/7/23 8:54
 * @version 1.0
 */
@FeignClient(value = "uc")
public interface ImportTemplateClient {

    @GetMapping("/sysImportTemplate/defaultFindById")
    RespMsgBean<SysImportTemplate> defaultFindById(@RequestParam(value = "id", required = false) String id);
}

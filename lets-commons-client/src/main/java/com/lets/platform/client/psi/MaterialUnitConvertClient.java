package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.MaterialUnitConvertClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.psi.entity.PsiMaterialUnitConvert;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * 物料单位转换Feign接口
 */
@FeignClient(value = "psi",fallback = MaterialUnitConvertClientFallback.class)
public interface MaterialUnitConvertClient {

    @GetMapping("/psiMaterialUnitConvert/getList")
    RespMsgBean<List<PsiMaterialUnitConvert>> getList();
}

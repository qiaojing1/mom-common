package com.lets.platform.client.psi;

import cn.hutool.json.JSONObject;
import com.lets.platform.client.psi.fallback.ExtClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.base.BaseBatchInformationVO;
import com.lets.platform.model.mes.entity.MesProduceReportOrder;
import com.lets.platform.model.psi.entity.PsiContainerCode;
import com.lets.platform.model.psi.entity.PsiMaterialBarcode;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * ExtClient
 * @author DING WEI
 * @date 2023/11/17 14:26
 * @version 1.0
 */
@FeignClient(value = "psi",fallback = ExtClientFallback.class)
public interface ExtClient {

    @PostMapping("/ext/pushMaterialStore")
    RespMsgBean<JSONObject> pushMaterialStore(@RequestBody JSONObject jsonObject);

    @PostMapping("/ext/pushMateialStoreToZSH")
    RespMsgBean pushMateialStoreToZSH(@RequestBody JSONObject jsonObject);

    @PostMapping("/ext/addYongyouMaterialBarCode")
    RespMsgBean<List<Map<String,String>>> addYongyouMaterialBarCode(@RequestBody List<PsiMaterialBarcode> barcodeList);

    @PostMapping("/ext/addYongyouContainer")
    RespMsgBean<Map<String, String>> addYongyouContainer(@RequestBody PsiContainerCode containerCode);

    @PostMapping("/ext/addYongyouProduceReportOrder")
    RespMsgBean<Map<String, String>> addYongyouProduceReportOrder(@RequestBody MesProduceReportOrder reportOrder);

    @PostMapping("/ext/synProduceOrder")
    RespMsgBean<BaseBatchInformationVO> synProduceOrder(@RequestBody String date);

    @GetMapping("/ext/synProduceOrderGet")
    RespMsgBean<BaseBatchInformationVO> synProduceOrderGet(@RequestParam("date") String date);

    @PostMapping("/ext/synMaterial")
    RespMsgBean<BaseBatchInformationVO> synMaterial(com.alibaba.fastjson.JSONObject jsonObject);
}

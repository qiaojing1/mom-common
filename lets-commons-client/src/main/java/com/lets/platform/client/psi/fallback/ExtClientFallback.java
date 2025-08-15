package com.lets.platform.client.psi.fallback;

import cn.hutool.json.JSONObject;
import com.lets.platform.client.psi.ExtClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.base.BaseBatchInformationVO;
import com.lets.platform.model.mes.entity.MesProduceReportOrder;
import com.lets.platform.model.psi.entity.PsiContainerCode;
import com.lets.platform.model.psi.entity.PsiMaterialBarcode;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ExtClient
 * @author DING WEI
 * @date 2023/11/17 14:26
 * @version 1.0
 */
@Service
public class ExtClientFallback extends BaseController implements ExtClient {

    @Override
    public RespMsgBean<JSONObject> pushMaterialStore(@RequestBody JSONObject jsonObject) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean pushMateialStoreToZSH(JSONObject jsonObject) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<List<Map<String, String>>> addYongyouMaterialBarCode(List<PsiMaterialBarcode> barcodeList) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<Map<String, String>> addYongyouContainer(PsiContainerCode containerCode) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<Map<String, String>> addYongyouProduceReportOrder(MesProduceReportOrder reportOrder) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<BaseBatchInformationVO> synProduceOrder(String date) {
        return success(SUCCESS, new BaseBatchInformationVO());
    }
    @Override
    public RespMsgBean<BaseBatchInformationVO> synProduceOrderGet(String date) {
        return success(SUCCESS, new BaseBatchInformationVO());
    }
    @Override
    public RespMsgBean<BaseBatchInformationVO> synMaterial(com.alibaba.fastjson.JSONObject jsonObject) {
        return success(SUCCESS, new BaseBatchInformationVO());
    }


}

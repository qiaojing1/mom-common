package com.lets.platform.client.tpm.fallback;

import com.lets.platform.client.tpm.client.BorrowOrderClient;
import com.lets.platform.client.tpm.client.CalibrateOrderClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


/**
 * TpmCallRepairOrderClient
 *
 * @author zhangweiyan
 * @version 1.0
 * @date 2025/01/22 14:26
 */
@Service
public class CalibrateOrderClientFallback extends BaseController implements CalibrateOrderClient {


    @Override
    public RespMsgBean<Map<String, Long>> findOrderCount(List<String> deviceIds) {
        return success(SUCCESS);
    }
}

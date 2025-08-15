package com.lets.platform.client.psi.fallback;

import cn.hutool.json.JSONObject;
import com.lets.platform.client.psi.CustomMarketClient;
import com.lets.platform.client.psi.ExtClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.uc.entity.SysUser;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

/**
 * ExtClient
 * @author DING WEI
 * @date 2023/11/17 14:26
 * @version 1.0
 */
@Service
public class CustomMarketClientFallback extends BaseController implements CustomMarketClient {


    @Override
    public RespMsgBean<List<SysUser>> findSaleableUser(String customerId) {
        return success(SUCCESS, new ArrayList<>());
    }
}

package com.lets.platform.client.psi.fallback;

import com.lets.platform.client.psi.AccountTermClient;
import com.lets.platform.client.psi.AreaClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.psi.entity.PsiStorageArea;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Map;

/**
 * StoreClient
 * @author DING WEI
 * @date 2023/11/17 14:26
 * @version 1.0
 */
@Service
public class AccountTermClientFallback extends BaseController implements AccountTermClient {

    @Override
    public RespMsgBean<?> checkPostingTerm(LocalDate date) {
        return success(SUCCESS);
    }
}

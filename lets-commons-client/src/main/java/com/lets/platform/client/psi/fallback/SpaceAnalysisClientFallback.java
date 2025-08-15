package com.lets.platform.client.psi.fallback;

import com.lets.platform.client.psi.SpaceAnalysisClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.psi.entity.PsiSpecsAnalysis;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class SpaceAnalysisClientFallback extends BaseController implements SpaceAnalysisClient {


    @Override
    public RespMsgBean<Map<String, Object>> analysis(String specs) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<PsiSpecsAnalysis> defaultFindById(String id) {
        return success(SUCCESS, new PsiSpecsAnalysis());
    }
}

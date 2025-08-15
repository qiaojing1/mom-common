package com.lets.platform.client.common.fallback;

import com.lets.platform.client.common.client.XxlClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * XXL定时任务feign接口 服务降级
 * @author DING WEI
 * @date 2024/12/25 8:37
 * @version 1.0
 */
@Service
public class XxlClientFallback extends BaseController implements XxlClient {

    @Override
    public RespMsgBean<Set<String>> findApp(String appName) {
        return success(SUCCESS, new HashSet<>());
    }

    @Override
    public RespMsgBean<List<String>> findApps(Collection<String> appNames) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<List<Integer>> findJobId(String appName, String executorParam) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<List<Integer>> findJobIds(Collection<String> appNames, String executorParam) {
        return success(SUCCESS, new ArrayList<>());
    }
}

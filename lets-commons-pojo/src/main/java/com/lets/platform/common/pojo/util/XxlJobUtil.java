package com.lets.platform.common.pojo.util;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lets.platform.common.pojo.base.ServiceAssert;
import com.lets.platform.common.pojo.base.XxlJobGroup;
import com.lets.platform.common.pojo.base.XxlJobInfo;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.exception.LetsException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.net.HttpCookie;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

@Slf4j
@Component
public class XxlJobUtil {

    private static final String REMOVE_URL = "/jobinfo/remove";
    private static final String BATCH_REMOVE_URL = "/jobinfo/batchRemove";
    private static final String TRIGGER_URL = "/jobinfo/trigger";
    private static final String GET_GROUP_ID = "/jobgroup/getGroupId";
    private static final String SAVE_GROUP = "/jobgroup/save";
    private static final String ADD_JOB = "/jobinfo/add";
    private static final String START_JOB = "/jobinfo/start";
    private static final String BATCH_START_JOB = "/jobinfo/batchStart";
    private static final String STOP_JOB = "/jobinfo/stop";
    private static final String BATCH_STOP_JOB = "/jobinfo/batchStop";
    private static final String UPDATE_JOB = "/jobinfo/update";
    private static final String GET_JOB = "/jobinfo/pageList";
    private static final String FIND_BYID = "/jobinfo/findById";
    private final static Map<String, String> loginCookie = new ConcurrentHashMap<>();

    @Value("${xxl.job.admin.addresses:}")
    private String adminAddresses;

    @Value("${xxl.job.admin.username:admin}")
    private String username;

    @Value("${xxl.job.admin.password:123456}")
    private String password;

    @Value("${xxl.job.executor.ip:localhost}")
    private String ip;
    @Value("${xxl.job.executor.port:9999}")
    private String port;

    @Resource
    private ObjectMapper objectMapper;

    public void trigger(int id, String executorParam) {
        trigger(id, executorParam, StrUtil.EMPTY);
    }

    public void trigger(int id, String executorParam, String addressList) {
        Map<String, Object> param = new HashMap<>();
        param.put("id", id);
        param.put("executorParam", executorParam);
        param.put("addressList", addressList);
        try {
            JSONObject jsonObject = objectMapper.readValue(formPost(TRIGGER_URL, param), JSONObject.class);
            String code = jsonObject.getString("code");
            if (!StrUtil.equals(code, "200")) {
                ServiceAssert.getThrow(GlobalConstant.ZERO, "立即执行失败");
            }
        } catch (Exception e) {
            ServiceAssert.getThrow(GlobalConstant.ZERO, "立即执行失败");
        }
    }

    public String update(int id, String cron) {
        Map<String, Object> param = new HashMap<>();
        param.put("id", id);
        param.put("jobCron", cron);
        return formPost(UPDATE_JOB, param);
    }
    public JSONObject findById(int id) {
        Map<String, Object> param = new HashMap<>();
        param.put("id", id);
        String result = jsonPost(FIND_BYID, param);
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject = objectMapper.readValue(result, JSONObject.class);
        } catch (JsonProcessingException e) {
            throw new LetsException(GlobalConstant.ZERO, "查询定时任务失败");
        }

        if(CollUtil.isNotEmpty(jsonObject)) {
            return Objects.nonNull(jsonObject.getJSONObject("content")) ?
                    jsonObject.getJSONObject("content") : null;
        }
        return null;
    }

    public String update(XxlJobInfo xxlJobInfo) {

        Map<String, Object> map = objectMapper.convertValue(xxlJobInfo,Map.class);

        return formPost(UPDATE_JOB, map);
    }
    public Integer select(String appName, String executorParam) {
        Map<String, Object> param = new HashMap<>();
        param.put("appname", appName);
//        param.put("executorParam", executorParam);
        String result = jsonPost(GET_GROUP_ID, param);
        JSONObject jsonObject;
        try {
            jsonObject = objectMapper.readValue(result, JSONObject.class);
        } catch (JsonProcessingException e) {
            throw new LetsException(GlobalConstant.ZERO, "查询定时任务失败");
        }
        Integer id = null;
        Integer code = jsonObject.getInteger("code");
        if (code == 200) {
            Integer jobGroup = jsonObject.getInteger("content");
            param = new HashMap<>();

            param.put("jobGroup", jobGroup);
            param.put("triggerStatus", -1);
            param.put("jobDesc", null);
            param.put("executorHandler", null);
            param.put("author", null);
            param.put("executorParam", executorParam);
            result = formPost(GET_JOB, param);
            try {
                jsonObject = objectMapper.readValue(result, JSONObject.class);
            } catch (JsonProcessingException e) {
                throw new LetsException(GlobalConstant.ZERO, "查询定时任务失败");
            }

            if(CollUtil.isNotEmpty(jsonObject)) {
                id = CollUtil.isNotEmpty(jsonObject.getJSONArray("data")) ? jsonObject.getJSONArray("data").getJSONObject(0).getInteger("id") : null;
            }
        }
        return id;
    }

    public List<Integer> selectIds(String appName, String executorParam, boolean filterTemp) {
        Map<String, Object> param = new HashMap<>();
        param.put("appname", appName);
//        param.put("executorParam", executorParam);
        String result = jsonPost(GET_GROUP_ID, param);
        JSONObject jsonObject;
        try {
            jsonObject = objectMapper.readValue(result, JSONObject.class);
        } catch (JsonProcessingException e) {
            throw new LetsException(GlobalConstant.ZERO, "查询定时任务失败");
        }
        List<Integer> ids = null;
        Integer code = jsonObject.getInteger("code");
        if (code == 200) {
            Integer jobGroup = jsonObject.getInteger("content");
            param = new HashMap<>();

            param.put("jobGroup", jobGroup);
            param.put("triggerStatus", -1);
            param.put("jobDesc", null);
            param.put("executorHandler", null);
            param.put("author", null);
            param.put("executorParam", executorParam);
            result = formPost(GET_JOB, param);
            try {
                jsonObject = objectMapper.readValue(result, JSONObject.class);
            } catch (JsonProcessingException e) {
                throw new LetsException(GlobalConstant.ZERO, "查询定时任务失败");
            }

            if(CollUtil.isNotEmpty(jsonObject)) {
                ids = CollUtil.isNotEmpty(jsonObject.getJSONArray("data")) ? jsonObject.getJSONArray("data")
                        .stream().filter(f -> !filterTemp || !((String) ((LinkedHashMap) f).getOrDefault("jobDesc", "")).contains("temp"))
                        .map(e -> (Integer) ((LinkedHashMap) e).getOrDefault("id", "-1")).collect(Collectors.toList()) : null;
            }
        }
        return ids;
    }

    public String remove(int id) {
        Map<String, Object> param = new HashMap<>();
        param.put("id", id);
        String formPost = formPost(REMOVE_URL, param);
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject = objectMapper.readValue(formPost, JSONObject.class);
        } catch (JsonProcessingException e) {
            throw new LetsException(GlobalConstant.ZERO, "删除定时任务失败");
        }
        Integer code = jsonObject.getInteger("code");
        if (code == 200) {
            return formPost;
        } else {
            ServiceAssert.getThrow(0, "删除定时任务失败;" + jsonObject.getString("msg"));
        }
        return formPost;
    }

    public String batchRemove(List<Integer> ids) {
        String jsonPost = jsonPost(BATCH_REMOVE_URL, ids);
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject = objectMapper.readValue(jsonPost, JSONObject.class);
        } catch (JsonProcessingException e) {
            throw new LetsException(GlobalConstant.ZERO, "批量删除定时任务失败");
        }
        Integer code = jsonObject.getInteger("code");
        if (code == 200) {
            return jsonPost;
        } else {
            ServiceAssert.getThrow(0, "批量删除定时任务失败;" + jsonObject.getString("msg"));
        }
        return jsonPost;
    }

    public void start(int id) {
        try {
            JSONObject jsonObject = objectMapper.readValue(jsonPost(START_JOB + "?id=" + id, new HashMap<>()), JSONObject.class);
            String code = jsonObject.getString("code");
            if (!StrUtil.equals(code, "200")) {
                throw new LetsException(GlobalConstant.ZERO, "启动定时任务失败");
            }
        } catch (JsonProcessingException e) {
            throw new LetsException(GlobalConstant.ZERO, "启动定时任务失败");
        }
    }

    public void batchStart(List<Integer> ids) {
        try {
            JSONObject jsonObject = objectMapper.readValue(jsonPost(BATCH_START_JOB, ids), JSONObject.class);
            String code = jsonObject.getString("code");
            if (!StrUtil.equals(code, "200")) {
                throw new LetsException(GlobalConstant.ZERO, "批量启动定时任务失败");
            }
        } catch (JsonProcessingException e) {
            throw new LetsException(GlobalConstant.ZERO, "批量启动定时任务失败");
        }
    }

    public void stop(int id) {
        try {
            JSONObject jsonObject = objectMapper.readValue(jsonPost(STOP_JOB + "?id=" + id, new HashMap<>()), JSONObject.class);
            String code = jsonObject.getString("code");
            if (!StrUtil.equals(code, "200")) {
                throw new LetsException(GlobalConstant.ZERO, "停用定时任务失败");
            }
        } catch (JsonProcessingException e) {
            throw new LetsException(GlobalConstant.ZERO, "停用定时任务失败");
        }
    }

    public void batchStop(List<Integer> ids) {
        try {
            JSONObject jsonObject = objectMapper.readValue(jsonPost(BATCH_STOP_JOB, ids), JSONObject.class);
            String code = jsonObject.getString("code");
            if (!StrUtil.equals(code, "200")) {
                throw new LetsException(GlobalConstant.ZERO, "批量停用定时任务失败");
            }
        } catch (JsonProcessingException e) {
            throw new LetsException(GlobalConstant.ZERO, "批量停用定时任务失败");
        }
    }

    public Integer add(XxlJobInfo jobInfo, String appname) {
        Map<String, Object> param = new HashMap<>();
        param.put("appname", appname);
        String result = jsonPost(GET_GROUP_ID, param);
        JSONObject jsonObject;
        try {
            jsonObject = objectMapper.readValue(result, JSONObject.class);
        } catch (JsonProcessingException e) {
            throw new LetsException(GlobalConstant.ZERO, "新增定时任务失败");
        }
        Integer code = jsonObject.getInteger("code");
        if (code == 200) {
            String jobGroup = jsonObject.getString("content");
            if(StringUtils.isEmpty(jobGroup)) {
                //新增一个
                XxlJobGroup xxlJobGroup  = new XxlJobGroup();
                xxlJobGroup.setAppname(appname);
                xxlJobGroup.setTitle(StringUtils.isNotBlank(jobInfo.getTitle()) ? jobInfo.getTitle() : appname);
                xxlJobGroup.setAddressType(1);
                xxlJobGroup.setAddressList("http://" + ip + ":" + port);
                result = formPost(SAVE_GROUP, xxlJobGroup.getAddParams());
                try {
                    jsonObject = objectMapper.readValue(result, JSONObject.class);
                } catch (JsonProcessingException e) {
                    throw new LetsException(GlobalConstant.ZERO, "新增定时任务失败");
                }
                code = jsonObject.getInteger("code");
                if (code == 200) {
                    jobGroup = jsonObject.getString("content");
                }
            }

            jobInfo.setJobGroup(Integer.parseInt(jobGroup));
            result = formPost(ADD_JOB, jobInfo.getAddParams());
            try {
                jsonObject = objectMapper.readValue(result, JSONObject.class);
            } catch (JsonProcessingException e) {
                throw new LetsException(GlobalConstant.ZERO, "新增定时任务失败");
            }
            code = jsonObject.getInteger("code");
            if (code == 200) {
                String id = jsonObject.getString("content");
                return Integer.parseInt(id);
            } else {
                ServiceAssert.getThrow(0, "创建定时任务失败;" + jsonObject.getString("msg"));
            }
        } else {
            ServiceAssert.getThrow(0, "创建定时任务失败;" + jsonObject.getString("msg"));
        }
        return null;
    }

    public Integer addAndStart(XxlJobInfo jobInfo, String appname) {
        Integer xxlJobId = add(jobInfo, appname);
        try {
            start(xxlJobId);
        } catch (Exception e) {
            remove(xxlJobId);
            ServiceAssert.getThrow(0, "定时任务服务异常");
        }
        return xxlJobId;
    }

    /**
     * 创建任务并开启 且立即执行一次
     * @param jobInfo
     * @param appname 执行器名称
     * @return
     * @author DING WEI
     * @date 2024/8/28 9:59
     * @version 1.0
     */
    public Integer addAndStartAndTrigger(XxlJobInfo jobInfo, String appname) {
        Integer xxlJobId = addAndStart(jobInfo, appname);
        try {
            trigger(xxlJobId, jobInfo.getExecutorParam());
        } catch (Exception e) {
            remove(xxlJobId);
            ServiceAssert.getThrow(0, "定时任务异常");
        }
        return xxlJobId;
    }

    public String formPost(String URL, Map<String, Object> params) {
        try (HttpResponse response = HttpRequest.post(adminAddresses + URL).form(params).cookie(getCookie()).execute()) {
            if (response.header("location") != null && response.header("location").equals("/toLogin")) {
                loginCookie.remove("XXL_JOB_LOGIN_IDENTITY");
                try (HttpResponse retryResponse = HttpRequest.post(adminAddresses + URL).form(params).cookie(getCookie()).execute()) {
                    if (retryResponse.header("location") != null && retryResponse.header("location").equals("/toLogin")) {
                        throw new LetsException(0, "登录失败");
                    }
                    return retryResponse.body();
                }
            }
            return response.body();
        } catch (Exception e) {
            ServiceAssert.getThrow(0, "定时任务服务异常");
        }
        return null;
    }

    public String jsonPost(String URL, Map<String, Object> params) {
        String paramString;
        try {
            paramString = objectMapper.writeValueAsString(params);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        try (HttpResponse response = HttpRequest.post(adminAddresses + URL).body(paramString).cookie(getCookie()).execute()) {
            if (response.header("location") != null && response.header("location").equals("/toLogin")) {
                loginCookie.remove("XXL_JOB_LOGIN_IDENTITY");
                try (HttpResponse retryResponse = HttpRequest.post(adminAddresses + URL).body(paramString).cookie(getCookie()).execute()) {
                    if (retryResponse.header("location") != null && retryResponse.header("location").equals("/toLogin")) {
                        throw new LetsException(0, "登录失败");
                    }
                    return retryResponse.body();
                }
            }
            return response.body();
        }
    }

    public String jsonPost(String URL, List<Integer> ids) {
        String paramString;
        try {
            paramString = objectMapper.writeValueAsString(ids);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        try (HttpResponse response = HttpRequest.post(adminAddresses + URL).body(paramString).cookie(getCookie()).execute()) {
            if (response.header("location") != null && response.header("location").equals("/toLogin")) {
                loginCookie.remove("XXL_JOB_LOGIN_IDENTITY");
                try (HttpResponse retryResponse = HttpRequest.post(adminAddresses + URL).body(paramString).cookie(getCookie()).execute()) {
                    if (retryResponse.header("location") != null && retryResponse.header("location").equals("/toLogin")) {
                        throw new LetsException(0, "登录失败");
                    }
                    return retryResponse.body();
                }
            }
            return response.body();
        }
    }

    public String login() {
        String url = adminAddresses + "/login";
        List<HttpCookie> cookies;
        try (HttpResponse response = HttpRequest.post(url).form("userName", username).form("password", password).execute()) {
            cookies = response.getCookies();
        }
        Optional<HttpCookie> cookieOpt = cookies.stream().filter(cookie -> cookie.getName().equals("XXL_JOB_LOGIN_IDENTITY")).findFirst();
        if (!cookieOpt.isPresent()) {throw new RuntimeException("get xxl-job cookie error!");}
        return cookieOpt.get().getValue();
    }

    public String getCookie() {
        for (int i = 0; i < 3; i++) {
            String cookieStr = loginCookie.computeIfAbsent("XXL_JOB_LOGIN_IDENTITY", (k) -> login());
            if (cookieStr != null) {
                return "XXL_JOB_LOGIN_IDENTITY=" + cookieStr;
            }
        }
        throw new RuntimeException("get xxl-job cookie error!");
    }
}
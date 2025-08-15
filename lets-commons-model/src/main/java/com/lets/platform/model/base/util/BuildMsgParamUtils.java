package com.lets.platform.model.base.util;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;
import com.lets.platform.common.pojo.util.DateUtil;
import com.lets.platform.model.collection.entity.CollDeviceWarnRecord;
import com.lets.platform.model.common.entity.CommonDevice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 构建发送消息参数工具类
 * @author: DING WEI
 * @date: 2023/12/1 9:14
 */
public class BuildMsgParamUtils {

    private static final Logger log = LoggerFactory.getLogger(BuildMsgParamUtils.class);

    public static JSONObject getWeixinParam4MiniProgramNotice(CollDeviceWarnRecord mdcDeviceWarn, CommonDevice device) {
        JSONObject param = new JSONObject();
        param.put("touser", "1001");
        param.put("msgtype", "miniprogram_notice");
        JSONObject messContent = new JSONObject();
        messContent.put("title", device.getName() + "报警");
        messContent.put("page", "/pages/alarm/home");
        messContent.put("description", DateUtil.getDateFormat(new Date(), "MM月dd日 HH:mm:ss"));
        messContent.put("emphasis_first_item", true);
        List<Map<String, Object>> list = new ArrayList<>();
        Map<String, Object> key1 = Maps.newHashMap();
        key1.put("key", mdcDeviceWarn.getWarningReason());
        key1.put("value", mdcDeviceWarn.getWarningNumber());
        Map<String, Object> key2 = Maps.newHashMap();
        key2.put("key", "资产编号");
        key2.put("value", device.getAssetsCode());

        Map<String, Object> key3 = Maps.newHashMap();
        key3.put("key", "报警时间");
        key3.put("value", mdcDeviceWarn.getWarningTime().format(DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒")));

        list.add(key1);
        list.add(key2);
        list.add(key3);
        messContent.put("content_item", list);
        param.put("miniprogram_notice", messContent);
        param.put("miniprogram_notice", messContent);

        log.info(param.toJSONString());
        return param;
    }

    public static JSONObject getWeixinParam4Markdown(CollDeviceWarnRecord mdcDeviceWarn, CommonDevice device, String title, String mess) {
        JSONObject param = new JSONObject();
        param.put("touser", "1001");
        param.put("msgtype", "markdown");
        JSONObject markdown = new JSONObject();
        markdown.put("content", mess);
        param.put("markdown", markdown);
        param.put("enable_duplicate_check", 0);
        param.put("duplicate_check_interval", 1800);
        log.info(param.toJSONString());
        return param;
    }
    public static JSONObject getWeixinParam4Markdown(String mess) {
        JSONObject param = new JSONObject();
        param.put("touser", "1001");
        param.put("msgtype", "markdown");
        JSONObject markdown = new JSONObject();
        markdown.put("content", "### " + mess);
        param.put("markdown", markdown);
        param.put("enable_duplicate_check", 0);
        param.put("duplicate_check_interval", 1800);
        log.info(param.toJSONString());
        return param;
    }

    /**
     * 钉钉消息通知
     * @param title  消息标题
     * @param mess   消息内容
     */
    public static JSONObject getDingParam(String title, String mess) {
        JSONObject request = new JSONObject();
        request.put("msgtype", "markdown");
        JSONObject markdown = new JSONObject();
        markdown.put("title", title);
        markdown.put("text", "### " + mess);
        request.put("markdown", markdown);
        JSONObject at = new JSONObject();
        at.put("isAtAll", true);
        request.put("at", at);
        return request;
    }
}

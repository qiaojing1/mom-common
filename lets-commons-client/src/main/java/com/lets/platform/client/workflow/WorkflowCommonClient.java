package com.lets.platform.client.workflow;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.base.BaseBatchInformationVO;
import com.lets.platform.model.base.BaseProcessEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "common")
public interface WorkflowCommonClient {

    /** 工艺路线 */
    @GetMapping("/route/queryById")
    RespMsgBean<JSONArray> routeQueryById(@RequestParam("id") String id);
    @PostMapping("/route/submit")
    RespMsgBean<BaseBatchInformationVO> routeSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);
    @PostMapping("/route/reject")
    RespMsgBean<?> routeReject(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/route/approve")
    RespMsgBean<?> routeApprove(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/route/backOrRevoke")
    RespMsgBean<?> routeBackOrRevoke(BaseProcessEntity<?> processEntity);
    @PostMapping("/route/reverse")
    RespMsgBean<?> routeReverse(@RequestBody BaseProcessEntity<?> entity);


    @GetMapping("/commonMeter/queryById")
    RespMsgBean<JSONArray> commonMeterQueryById(@RequestParam("id") String id);
    @PostMapping("/commonMeter/submit")
    RespMsgBean<BaseBatchInformationVO> commonMeterSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);
    @PostMapping("/commonMeter/reject")
    RespMsgBean<?> commonMeterReject(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/commonMeter/approve")
    RespMsgBean<?> commonMeterApprove(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/commonMeter/backOrRevoke")
    RespMsgBean<?> commonMeterBackOrRevoke(BaseProcessEntity<?> processEntity);
    @PostMapping("/commonMeter/reverse")
    RespMsgBean<?> commonMeterReverse(@RequestBody BaseProcessEntity<?> entity);

    @GetMapping("/commonTransactionApproval/queryById")
    RespMsgBean<JSONArray> transactionQueryById(@RequestParam("id") String id);
    @PostMapping("/commonTransactionApproval/submit")
    RespMsgBean<BaseBatchInformationVO> transactionSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);
    @PostMapping("/commonTransactionApproval/reject")
    RespMsgBean<?> transactionReject(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/commonTransactionApproval/approve")
    RespMsgBean<?> transactionApprove(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/commonTransactionApproval/backOrRevoke")
    RespMsgBean<?> transactionBackOrRevoke(BaseProcessEntity<?> processEntity);
    @PostMapping("/commonTransactionApproval/reverse")
    RespMsgBean<?> transactionReverse(@RequestBody BaseProcessEntity<?> entity);
}

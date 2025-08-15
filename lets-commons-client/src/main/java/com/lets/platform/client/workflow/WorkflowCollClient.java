package com.lets.platform.client.workflow;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.base.BaseBatchInformationVO;
import com.lets.platform.model.base.BaseProcessEntity;
import com.lets.platform.model.collection.entity.CollectionDetectOrder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "collection")
public interface WorkflowCollClient {
    @GetMapping("/collectionDetectOrder/queryById")
    RespMsgBean<JSONArray> detectOrderQueryById(@RequestParam("id") String id);

    @PostMapping("/collectionDetectOrder/workFlowSave")
    RespMsgBean<BaseBatchInformationVO> detectOrderSave(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/collectionDetectOrder/submit")
    RespMsgBean<BaseBatchInformationVO> detectOrderSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/collectionDetectOrder/reject")
    RespMsgBean<?> detectOrderReject(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/collectionDetectOrder/approve")
    RespMsgBean<?> detectOrderApprove(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/collectionDetectOrder/backOrRevoke")
    RespMsgBean<?> detectOrderBackOrRevoke(BaseProcessEntity<?> processEntity);

    @PostMapping("/collectionDetectOrder/reverse")
    RespMsgBean<?> detectOrderReverse(@RequestBody BaseProcessEntity<?> entity);



    @GetMapping("/collectionDetectReport/queryById")
    RespMsgBean<JSONArray> reportQueryById(@RequestParam("id") String id);
    @PostMapping("/collectionDetectReport/submit")
    RespMsgBean<?> reportSubmit(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/collectionDetectReport/reject")
    RespMsgBean<?> reportReject(@RequestBody BaseProcessEntity<?> entity) ;

    @PostMapping("/collectionDetectReport/approve")
    RespMsgBean<?> reportApprove(@RequestBody BaseProcessEntity<?> entity) ;

    @PostMapping("/collectionDetectReport/backOrRevoke")
    RespMsgBean<?> reportBackOrRevoke(@RequestBody BaseProcessEntity<?> entity) ;

    @PostMapping("/collectionDetectReport/reverse")
    RespMsgBean<?> reportReverse(@RequestBody BaseProcessEntity<?> entity);



    @GetMapping("/collectionDetectBatchReport/queryById")
    RespMsgBean<JSONArray> batchReportQueryById(@RequestParam("id") String id);
    @PostMapping("/collectionDetectBatchReport/submit")
    RespMsgBean<?> batchReportSubmit(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/collectionDetectBatchReport/reject")
    RespMsgBean<?> batchReportReject(@RequestBody BaseProcessEntity<?> entity) ;

    @PostMapping("/collectionDetectBatchReport/approve")
    RespMsgBean<?> batchReportApprove(@RequestBody BaseProcessEntity<?> entity) ;

    @PostMapping("/collectionDetectBatchReport/backOrRevoke")
    RespMsgBean<?> batchReportBackOrRevoke(@RequestBody BaseProcessEntity<?> entity) ;

    @PostMapping("/collectionDetectBatchReport/reverse")
    RespMsgBean<?> batchReportReverse(@RequestBody BaseProcessEntity<?> entity);



    @GetMapping("/collectionTestSynopsis/queryById")
    RespMsgBean<JSONArray> synopsisQueryById(@RequestParam("id") String id);
    @PostMapping("/collectionTestSynopsis/submit")
    RespMsgBean<?> synopsisSubmit(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/collectionTestSynopsis/reject")
    RespMsgBean<?> synopsisReject(@RequestBody BaseProcessEntity<?> entity) ;

    @PostMapping("/collectionTestSynopsis/approve")
    RespMsgBean<?> synopsisApprove(@RequestBody BaseProcessEntity<?> entity) ;

    @PostMapping("/collectionTestSynopsis/backOrRevoke")
    RespMsgBean<?> synopsisBackOrRevoke(@RequestBody BaseProcessEntity<?> entity) ;

    @PostMapping("/collectionTestSynopsis/reverse")
    RespMsgBean<?> synopsisReverse(@RequestBody BaseProcessEntity<?> entity);
}

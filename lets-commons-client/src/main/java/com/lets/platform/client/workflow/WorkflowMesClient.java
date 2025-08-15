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

@FeignClient(value = "mes")
public interface WorkflowMesClient {
    @GetMapping("/mesProduceOrder/queryById")
    RespMsgBean<JSONArray> produceOrderQueryById(@RequestParam("id") String id);

    @PostMapping("/mesProduceOrder/submit")
    RespMsgBean<BaseBatchInformationVO> produceOrderSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/mesProduceOrder/reject")
    RespMsgBean<?> produceOrderReject(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/mesProduceOrder/approve")
    RespMsgBean<?> produceOrderApprove(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/mesProduceOrder/backOrRevoke")
    RespMsgBean<?> produceOrderBackOrRevoke(BaseProcessEntity<?> processEntity);

    @PostMapping("/mesProduceOrder/reverse")
    RespMsgBean<?> produceOrderReverse(@RequestBody BaseProcessEntity<?> entity);

    /** 生产领料 */
    @GetMapping("/mesProducePicking/queryById")
    RespMsgBean<JSONArray> producePickingOrderQueryById(@RequestParam("id") String id);
    @PostMapping("/mesProducePicking/submit")
    RespMsgBean<?> producePickingOrderSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);
    @PostMapping("/mesProducePicking/reject")
    RespMsgBean<?> producePickingOrderReject(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/mesProducePicking/approve")
    RespMsgBean<?> producePickingOrderApprove(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/mesProducePicking/backOrRevoke")
    RespMsgBean<?> producePickingOrderBackOrRevoke(BaseProcessEntity<?> processEntity);
    @PostMapping("/mesProducePicking/reverse")
    RespMsgBean<?> producePickingOrderReverse(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/mesProducePicking/posting")
    RespMsgBean<?> producePickingOrderPosting(@RequestBody BaseProcessEntity<?> entity);

    /** 生产领料申请 */
    @PostMapping("/producePickingApply/workFlowSave")
    RespMsgBean<?> producePickingApplyOrderSave(@RequestBody BaseProcessEntity<JSONObject> entity);
    @GetMapping("/producePickingApply/queryById")
    RespMsgBean<JSONArray> producePickingApplyOrderQueryById(@RequestParam("id") String id);
    @PostMapping("/producePickingApply/submit")
    RespMsgBean<?> producePickingApplyOrderSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);
    @PostMapping("/producePickingApply/reject")
    RespMsgBean<?> producePickingApplyOrderReject(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/producePickingApply/approve")
    RespMsgBean<?> producePickingApplyOrderApprove(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/producePickingApply/backOrRevoke")
    RespMsgBean<?> producePickingApplyOrderBackOrRevoke(BaseProcessEntity<?> processEntity);
    @PostMapping("/producePickingApply/reverse")
    RespMsgBean<?> producePickingApplyOrderReverse(@RequestBody BaseProcessEntity<?> entity);

    @GetMapping("/mesProduceReportOrder/queryById")
    RespMsgBean<JSONArray> produceReportOrderQueryById(@RequestParam("id") String id);

    @PostMapping("/mesProduceReportOrder/submit")
    RespMsgBean<BaseBatchInformationVO> produceReportOrderSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/mesProduceReportOrder/reject")
    RespMsgBean<?> produceReportOrderReject(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/mesProduceReportOrder/approve")
    RespMsgBean<?> produceReportOrderApprove(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/mesProduceReportOrder/backOrRevoke")
    RespMsgBean<?> produceReportOrderBackOrRevoke(BaseProcessEntity<?> processEntity);

    @PostMapping("/mesProduceReportOrder/reverse")
    RespMsgBean<?> produceReportOrderReverse(@RequestBody BaseProcessEntity<?> entity);

    @GetMapping("/mesDncProgramFile/queryById")
    RespMsgBean<JSONArray> programFileQueryById(@RequestParam("id") String id);

    @PostMapping("/mesDncProgramFile/submit")
    RespMsgBean<BaseBatchInformationVO> programFileSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/mesDncProgramFile/reject")
    RespMsgBean<?> programFileReject(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/mesDncProgramFile/approve")
    RespMsgBean<?> programFileApprove(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/mesDncProgramFile/backOrRevoke")
    RespMsgBean<?> programFileBackOrRevoke(BaseProcessEntity<?> processEntity);

    @PostMapping("/mesDncProgramFile/reverse")
    RespMsgBean<?> programFileReverse(@RequestBody BaseProcessEntity<?> entity);

    /**
     * 工序委外发出
     */
    @GetMapping("/mesProcessOutsourcingOut/queryById")
    RespMsgBean<JSONArray> processOutsourcingOutQueryById(@RequestParam("id") String id);
    @PostMapping("/mesProcessOutsourcingOut/submit")
    RespMsgBean<BaseBatchInformationVO> processOutsourcingOutSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);
    @PostMapping("/mesProcessOutsourcingOut/reject")
    RespMsgBean<?> processOutsourcingOutReject(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/mesProcessOutsourcingOut/approve")
    RespMsgBean<?> processOutsourcingOutApprove(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/mesProcessOutsourcingOut/backOrRevoke")
    RespMsgBean<?> processOutsourcingOutBackOrRevoke(BaseProcessEntity<?> processEntity);
    @PostMapping("/mesProcessOutsourcingOut/reverse")
    RespMsgBean<?> processOutsourcingOutReverse(@RequestBody BaseProcessEntity<?> entity);

    /**
     * 工序委外接收
     */
    @GetMapping("/mesProcessOutsourcingIn/queryById")
    RespMsgBean<JSONArray> processOutsourcingInQueryById(@RequestParam("id") String id);
    @PostMapping("/mesProcessOutsourcingIn/submit")
    RespMsgBean<BaseBatchInformationVO> processOutsourcingInSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);
    @PostMapping("/mesProcessOutsourcingIn/reject")
    RespMsgBean<?> processOutsourcingInReject(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/mesProcessOutsourcingIn/approve")
    RespMsgBean<?> processOutsourcingInApprove(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/mesProcessOutsourcingIn/backOrRevoke")
    RespMsgBean<?> processOutsourcingInBackOrRevoke(BaseProcessEntity<?> processEntity);
    @PostMapping("/mesProcessOutsourcingIn/reverse")
    RespMsgBean<?> processOutsourcingInReverse(@RequestBody BaseProcessEntity<?> entity);

    /**
     * 工序委外结算
     */
    @GetMapping("/processOutsourcingSettlement/queryById")
    RespMsgBean<JSONArray> processOutsourcingSettlementQueryById(@RequestParam("id") String id);
    @PostMapping("/processOutsourcingSettlement/submit")
    RespMsgBean<BaseBatchInformationVO> processOutsourcingSettlementSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);
    @PostMapping("/processOutsourcingSettlement/reject")
    RespMsgBean<?> processOutsourcingSettlementReject(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/processOutsourcingSettlement/approve")
    RespMsgBean<?> processOutsourcingSettlementApprove(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/processOutsourcingSettlement/backOrRevoke")
    RespMsgBean<?> processOutsourcingSettlementBackOrRevoke(BaseProcessEntity<?> processEntity);
    @PostMapping("/processOutsourcingSettlement/reverse")
    RespMsgBean<?> processOutsourcingSettlementReverse(@RequestBody BaseProcessEntity<?> entity);

    /**
     * 工序委外合并发出
     */
    @GetMapping("/processOutsourcingBatchOut/queryById")
    RespMsgBean<JSONArray> processOutsourcingBatchOutQueryById(@RequestParam("id") String id);
    @PostMapping("/processOutsourcingBatchOut/submit")
    RespMsgBean<BaseBatchInformationVO> processOutsourcingBatchOutSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);
    @PostMapping("/processOutsourcingBatchOut/reject")
    RespMsgBean<?> processOutsourcingBatchOutReject(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/processOutsourcingBatchOut/approve")
    RespMsgBean<?> processOutsourcingBatchOutApprove(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/processOutsourcingBatchOut/backOrRevoke")
    RespMsgBean<?> processOutsourcingBatchOutBackOrRevoke(BaseProcessEntity<?> processEntity);
    @PostMapping("/processOutsourcingBatchOut/reverse")
    RespMsgBean<?> processOutsourcingBatchOutReverse(@RequestBody BaseProcessEntity<?> entity);

    /**
     * 工序委外接收发出
     */
    @GetMapping("/processOutsourcingBatchIn/queryById")
    RespMsgBean<JSONArray> processOutsourcingBatchInQueryById(@RequestParam("id") String id);
    @PostMapping("/processOutsourcingBatchIn/submit")
    RespMsgBean<BaseBatchInformationVO> processOutsourcingBatchInSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);
    @PostMapping("/processOutsourcingBatchIn/reject")
    RespMsgBean<?> processOutsourcingBatchInReject(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/processOutsourcingBatchIn/approve")
    RespMsgBean<?> processOutsourcingBatchInApprove(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/processOutsourcingBatchIn/backOrRevoke")
    RespMsgBean<?> processOutsourcingBatchInBackOrRevoke(BaseProcessEntity<?> processEntity);
    @PostMapping("/processOutsourcingBatchIn/reverse")
    RespMsgBean<?> processOutsourcingBatchInReverse(@RequestBody BaseProcessEntity<?> entity);

    /**
     * BOM
     */
    @GetMapping("/mesBom/queryById")
    RespMsgBean<JSONArray> bomQueryById(@RequestParam("id") String id);

    @PostMapping("/mesBom/submit")
    RespMsgBean<BaseBatchInformationVO> bomSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/mesBom/reject")
    RespMsgBean<?> bomReject(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/mesBom/approve")
    RespMsgBean<?> bomApprove(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/mesBom/backOrRevoke")
    RespMsgBean<?> bomBackOrRevoke(BaseProcessEntity<?> processEntity);

    @PostMapping("/mesBom/reverse")
    RespMsgBean<?> bomReverse(@RequestBody BaseProcessEntity<?> entity);

    @GetMapping("/mesKittingAnalysisPlan/queryById")
    RespMsgBean<JSONArray> kittingAnalysisPlanQueryById(@RequestParam("id") String id);

    @PostMapping("/mesKittingAnalysisPlan/submit")
    RespMsgBean<BaseBatchInformationVO> kittingAnalysisPlanSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/mesKittingAnalysisPlan/reject")
    RespMsgBean<?> kittingAnalysisPlanReject(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/mesKittingAnalysisPlan/approve")
    RespMsgBean<?> kittingAnalysisPlanApprove(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/mesKittingAnalysisPlan/backOrRevoke")
    RespMsgBean<?> kittingAnalysisPlanBackOrRevoke(BaseProcessEntity<?> processEntity);

    @PostMapping("/mesKittingAnalysisPlan/reverse")
    RespMsgBean<?> kittingAnalysisPlanReverse(@RequestBody BaseProcessEntity<?> entity);


    @GetMapping("/mesReportRecord/queryById")
    RespMsgBean<JSONArray> reportRecordQueryById(@RequestParam("id") String id);

    @PostMapping("/mesReportRecord/submit")
    RespMsgBean<?> reportRecordSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/mesReportRecord/reject")
    RespMsgBean<?> reportRecordReject(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/mesReportRecord/approve")
    RespMsgBean<?> reportRecordApprove(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/mesReportRecord/backOrRevoke")
    RespMsgBean<?> reportRecordBackOrRevoke(BaseProcessEntity<?> processEntity);

    @PostMapping("/mesReportRecord/reverse")
    RespMsgBean<?> reportRecordReverse(@RequestBody BaseProcessEntity<?> entity);

    @GetMapping("/mesProjectOrder/queryById")
    RespMsgBean<JSONArray> projectOrderQueryById(@RequestParam("id") String id);

    @PostMapping("/mesProjectOrder/submit")
    RespMsgBean<?> projectOrderByIdSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/mesProjectOrder/reject")
    RespMsgBean<?> projectOrderByIdReject(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/mesProjectOrder/approve")
    RespMsgBean<?> projectOrderByIdApprove(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/mesProjectOrder/backOrRevoke")
    RespMsgBean<?> projectOrderByIdBackOrRevoke(BaseProcessEntity<?> processEntity);

    @PostMapping("/mesProjectOrder/reverse")
    RespMsgBean<?> projectOrderByIdReverse(@RequestBody BaseProcessEntity<?> entity);

    @GetMapping("/mesInspectionApplicationOrder/queryById")
    RespMsgBean<JSONArray> inspectApplicationOrderQueryById(@RequestParam("id") String id);

    @PostMapping("/mesInspectionApplicationOrder/submit")
    RespMsgBean<BaseBatchInformationVO> inspectApplicationOrderSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/mesInspectionApplicationOrder/reject")
    RespMsgBean<?> inspectApplicationOrderReject(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/mesInspectionApplicationOrder/approve")
    RespMsgBean<?> inspectApplicationOrderApprove(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/mesInspectionApplicationOrder/backOrRevoke")
    RespMsgBean<?> inspectApplicationOrderBackOrRevoke(BaseProcessEntity<?> processEntity);

    @PostMapping("/mesInspectionApplicationOrder/reverse")
    RespMsgBean<?> inspectApplicationOrderReverse(@RequestBody BaseProcessEntity<?> entity);

    @GetMapping("/mesInspectionOrder/queryById")
    RespMsgBean<JSONArray> inspectOrderQueryById(@RequestParam("id") String id);

    @PostMapping("/mesInspectionOrder/submit")
    RespMsgBean<BaseBatchInformationVO> inspectOrderSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/mesInspectionOrder/reject")
    RespMsgBean<?> inspectOrderReject(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/mesInspectionOrder/approve")
    RespMsgBean<?> inspectOrderApprove(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/mesInspectionOrder/backOrRevoke")
    RespMsgBean<?> inspectOrderBackOrRevoke(BaseProcessEntity<?> processEntity);

    @PostMapping("/mesInspectionOrder/reverse")
    RespMsgBean<?> inspectOrderReverse(@RequestBody BaseProcessEntity<?> entity);
    /**
     * 工序计划
     */
    @GetMapping("/mesProcessPlan/queryById")
    RespMsgBean<JSONArray> processPlanQueryById(@RequestParam("id") String id);

    @PostMapping("/mesProcessPlan/submitById")
    RespMsgBean<?> processPlanSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/mesProcessPlan/reject")
    RespMsgBean<?> processPlanReject(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/mesProcessPlan/auditById")
    RespMsgBean<?> processPlanApprove(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/mesProcessPlan/revokeById")
    RespMsgBean<?> processPlanBackOrRevoke(BaseProcessEntity<?> processEntity);

    @PostMapping("/mesProcessPlan/reverseById")
    RespMsgBean<?> processPlanReverse(@RequestBody BaseProcessEntity<?> entity);

    /**
     * 检验任务
     */
    @GetMapping("/mesInspectionTaskOrder/queryById")
    RespMsgBean<JSONArray> inspectionTaskQueryById(@RequestParam("id") String id);

    @PostMapping("/mesInspectionTaskOrder/submit")
    RespMsgBean<?> inspectionTaskSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/mesInspectionTaskOrder/reject")
    RespMsgBean<?> inspectionTaskReject(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/mesInspectionTaskOrder/approve")
    RespMsgBean<?> inspectionTaskApprove(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/mesInspectionTaskOrder/backOrRevoke")
    RespMsgBean<?> inspectionTaskBackOrRevoke(BaseProcessEntity<?> processEntity);

    @PostMapping("/mesInspectionTaskOrder/reverse")
    RespMsgBean<?> inspectionTaskReverse(@RequestBody BaseProcessEntity<?> entity);

    /**
     * 不合格品处理任务
     */
    @GetMapping("/mesInspectionUnqualifiedTask/queryById")
    RespMsgBean<JSONArray> inspectionUnqualifiedTaskQueryById(@RequestParam("id") String id);

    @PostMapping("/mesInspectionUnqualifiedTask/submit")
    RespMsgBean<?> inspectionUnqualifiedTaskSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/mesInspectionUnqualifiedTask/reject")
    RespMsgBean<?> inspectionUnqualifiedTaskReject(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/mesInspectionUnqualifiedTask/approve")
    RespMsgBean<?> inspectionUnqualifiedTaskApprove(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/mesInspectionUnqualifiedTask/backOrRevoke")
    RespMsgBean<?> inspectionUnqualifiedTaskBackOrRevoke(BaseProcessEntity<?> processEntity);

    @PostMapping("/mesInspectionUnqualifiedTask/reverse")
    RespMsgBean<?> inspectionUnqualifiedTaskReverse(@RequestBody BaseProcessEntity<?> entity);

    /**
     * 零件检验尺寸库
     */
    @GetMapping("/mesPartsInspectionSize/queryById")
    RespMsgBean<JSONArray> mesPartsInspectionSizeQueryById(@RequestParam("id") String id);

    @PostMapping("/mesPartsInspectionSize/submit")
    RespMsgBean<?> mesPartsInspectionSizeTaskSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/mesPartsInspectionSize/reject")
    RespMsgBean<?> mesPartsInspectionSizeTaskReject(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/mesPartsInspectionSize/approve")
    RespMsgBean<?> mesPartsInspectionSizeApprove(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/mesPartsInspectionSize/backOrRevoke")
    RespMsgBean<?> mesPartsInspectionSizeBackOrRevoke(BaseProcessEntity<?> processEntity);

    @PostMapping("/mesPartsInspectionSize/reverse")
    RespMsgBean<?> mesPartsInspectionSizeReverse(@RequestBody BaseProcessEntity<?> entity);

    /**
     * 工序汇报
     */
    @GetMapping("/mesProcessReport/queryById")
    RespMsgBean<JSONArray> mesProcessReportQueryById(@RequestParam("id") String id);

    @PostMapping("/mesProcessReport/submit")
    RespMsgBean<?> mesProcessReportSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/mesProcessReport/reject")
    RespMsgBean<?> mesProcessReportReject(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/mesProcessReport/approve")
    RespMsgBean<?> mesProcessReportApprove(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/mesProcessReport/backOrRevoke")
    RespMsgBean<?> mesProcessReportBackOrRevoke(BaseProcessEntity<?> processEntity);

    @PostMapping("/mesProcessReport/reverse")
    RespMsgBean<?> mesProcessReportReverse(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/mesProcessReport/workFlowSave")
    RespMsgBean<?> mesProcessReportOrderSave(@RequestBody BaseProcessEntity<JSONObject> entity);
}

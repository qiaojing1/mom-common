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

@FeignClient(value = "tpm")
public interface WorkflowTpmClient {

    /** 点检工单 */
    @GetMapping("/tpmInspectionItemsOrder/queryById")
    RespMsgBean<JSONArray> inspectionItemsOrderQueryById(@RequestParam("id") String id);
    @PostMapping("/tpmInspectionItemsOrder/submit")
    RespMsgBean<BaseBatchInformationVO> inspectionItemsOrderSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);
    @PostMapping("/tpmInspectionItemsOrder/reject")
    RespMsgBean<?> inspectionItemsOrderReject(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/tpmInspectionItemsOrder/approve")
    RespMsgBean<?> inspectionItemsOrderApprove(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/tpmInspectionItemsOrder/backOrRevoke")
    RespMsgBean<?> inspectionItemsOrderBackOrRevoke(BaseProcessEntity<?> processEntity);
    @PostMapping("/tpmInspectionItemsOrder/reverse")
    RespMsgBean<?> inspectionItemsOrderReverse(@RequestBody BaseProcessEntity<?> entity);

    /** 保养工单 */
    @GetMapping("/tpmMaintenanceItemsOrder/queryById")
    RespMsgBean<JSONArray> maintenanceItemsOrderQueryById(@RequestParam("id") String id);
    @PostMapping("/tpmMaintenanceItemsOrder/submit")
    RespMsgBean<BaseBatchInformationVO> maintenanceItemsOrderSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);
    @PostMapping("/tpmMaintenanceItemsOrder/reject")
    RespMsgBean<?> maintenanceItemsOrderReject(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/tpmMaintenanceItemsOrder/approve")
    RespMsgBean<?> maintenanceItemsOrderApprove(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/tpmMaintenanceItemsOrder/backOrRevoke")
    RespMsgBean<?> maintenanceItemsOrderBackOrRevoke(BaseProcessEntity<?> processEntity);
    @PostMapping("/tpmMaintenanceItemsOrder/reverse")
    RespMsgBean<?> maintenanceItemsOrderReverse(@RequestBody BaseProcessEntity<?> entity);

    /** 故障报修工单 */
    @GetMapping("/tpmCallRepairOrder/queryById")
    RespMsgBean<JSONArray> callRepairOrderQueryById(@RequestParam("id") String id);
    @PostMapping("/tpmCallRepairOrder/submit")
    RespMsgBean<BaseBatchInformationVO> callRepairOrderSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);
    @PostMapping("/tpmCallRepairOrder/reject")
    RespMsgBean<?> callRepairOrderReject(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/tpmCallRepairOrder/approve")
    RespMsgBean<?> callRepairOrderApprove(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/tpmCallRepairOrder/backOrRevoke")
    RespMsgBean<?> callRepairOrderBackOrRevoke(BaseProcessEntity<?> processEntity);
    @PostMapping("/tpmCallRepairOrder/reverse")
    RespMsgBean<?> callRepairOrderReverse(@RequestBody BaseProcessEntity<?> entity);

    /** 维修工单 */
    @GetMapping("/repairOrder/queryById")
    RespMsgBean<JSONArray> repairOrderQueryById(@RequestParam("id") String id);
    @PostMapping("/repairOrder/submit")
    RespMsgBean<BaseBatchInformationVO> repairOrderSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);
    @PostMapping("/repairOrder/reject")
    RespMsgBean<?> repairOrderReject(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/repairOrder/approve")
    RespMsgBean<?> repairOrderApprove(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/repairOrder/backOrRevoke")
    RespMsgBean<?> repairOrderBackOrRevoke(BaseProcessEntity<?> processEntity);
    @PostMapping("/repairOrder/reverse")
    RespMsgBean<?> repairOrderReverse(@RequestBody BaseProcessEntity<?> entity);

    /** 委外维修 */
    @GetMapping("/tpmOutsourcingRepairOrder/queryById")
    RespMsgBean<JSONArray> outsourcingRepairOrderQueryById(@RequestParam("id") String id);
    @PostMapping("/tpmOutsourcingRepairOrder/submit")
    RespMsgBean<BaseBatchInformationVO> outsourcingRepairOrderSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);
    @PostMapping("/tpmOutsourcingRepairOrder/reject")
    RespMsgBean<?> outsourcingRepairOrderReject(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/tpmOutsourcingRepairOrder/approve")
    RespMsgBean<?> outsourcingRepairOrderApprove(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/tpmOutsourcingRepairOrder/backOrRevoke")
    RespMsgBean<?> outsourcingRepairOrderBackOrRevoke(BaseProcessEntity<?> processEntity);
    @PostMapping("/tpmOutsourcingRepairOrder/reverse")
    RespMsgBean<?> outsourcingRepairOrderReverse(@RequestBody BaseProcessEntity<?> entity);

    /** 维修知识库 */
    @GetMapping("/tpmRepairKnowledgeLib/queryById")
    RespMsgBean<JSONArray> repairKnowledgeLibQueryById(@RequestParam("id") String id);
    @PostMapping("/tpmRepairKnowledgeLib/submit")
    RespMsgBean<BaseBatchInformationVO> repairKnowledgeLibSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);
    @PostMapping("/tpmRepairKnowledgeLib/reject")
    RespMsgBean<?> repairKnowledgeLibReject(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/tpmRepairKnowledgeLib/approve")
    RespMsgBean<?> repairKnowledgeLibApprove(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/tpmRepairKnowledgeLib/backOrRevoke")
    RespMsgBean<?> repairKnowledgeLibBackOrRevoke(BaseProcessEntity<?> processEntity);
    @PostMapping("/tpmRepairKnowledgeLib/reverse")
    RespMsgBean<?> repairKnowledgeLibReverse(@RequestBody BaseProcessEntity<?> entity);

    /** 备件领用单 */
    @PostMapping("/tpmSparePartsRequisitionOrder/workFlowSave")
    RespMsgBean<JSONArray> sparePartsRequisitionOrderSave(@RequestBody BaseProcessEntity<JSONObject> entity);
    @GetMapping("/tpmSparePartsRequisitionOrder/queryById")
    RespMsgBean<JSONArray> sparePartsRequisitionOrderQueryById(@RequestParam("id") String id);
    @PostMapping("/tpmSparePartsRequisitionOrder/submit")
    RespMsgBean<BaseBatchInformationVO> sparePartsRequisitionOrderSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);
    @PostMapping("/tpmSparePartsRequisitionOrder/reject")
    RespMsgBean<?> sparePartsRequisitionOrderReject(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/tpmSparePartsRequisitionOrder/approve")
    RespMsgBean<?> sparePartsRequisitionOrderApprove(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/tpmSparePartsRequisitionOrder/backOrRevoke")
    RespMsgBean<?> sparePartsRequisitionOrderBackOrRevoke(BaseProcessEntity<?> processEntity);
    @PostMapping("/tpmSparePartsRequisitionOrder/reverse")
    RespMsgBean<?> sparePartsRequisitionOrderReverse(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/tpmSparePartsRequisitionOrder/posting")
    RespMsgBean<?> sparePartsRequisitionOrderPosting(@RequestBody BaseProcessEntity<?> entity);

    /** 巡检工单 */
    @GetMapping("/tpmInspectionProjectOrder/queryById")
    RespMsgBean<JSONArray> inspectionProjectOrderQueryById(@RequestParam("id") String id);
    @PostMapping("/tpmInspectionProjectOrder/submit")
    RespMsgBean<BaseBatchInformationVO> inspectionProjectOrderSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);
    @PostMapping("/tpmInspectionProjectOrder/reject")
    RespMsgBean<?> inspectionProjectOrderReject(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/tpmInspectionProjectOrder/approve")
    RespMsgBean<?> inspectionProjectOrderApprove(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/tpmInspectionProjectOrder/backOrRevoke")
    RespMsgBean<?> inspectionProjectOrderBackOrRevoke(BaseProcessEntity<?> processEntity);
    @PostMapping("/tpmInspectionProjectOrder/reverse")
    RespMsgBean<?> inspectionProjectOrderReverse(@RequestBody BaseProcessEntity<?> entity);

    /** 复检工单 */
    @GetMapping("/tpmRepeatInspectOrder/queryById")
    RespMsgBean<JSONArray> repeatInspectQueryById(@RequestParam("id") String id);
    @PostMapping("/tpmRepeatInspectOrder/submit")
    RespMsgBean<BaseBatchInformationVO> repeatInspectSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);
    @PostMapping("/tpmRepeatInspectOrder/reject")
    RespMsgBean<?> repeatInspectReject(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/tpmRepeatInspectOrder/approve")
    RespMsgBean<?> repeatInspectApprove(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/tpmRepeatInspectOrder/backOrRevoke")
    RespMsgBean<?> repeatInspectBackOrRevoke(BaseProcessEntity<?> processEntity);
    @PostMapping("/tpmRepeatInspectOrder/reverse")
    RespMsgBean<?> repeatInspectReverse(@RequestBody BaseProcessEntity<?> entity);

    /** 资产处置单 */
    @GetMapping("/tpmAssetDisposal/queryById")
    RespMsgBean<JSONArray> assetDisposalQueryById(@RequestParam("id") String id);
    @PostMapping("/tpmAssetDisposal/submit")
    RespMsgBean<BaseBatchInformationVO> assetDisposalSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);
    @PostMapping("/tpmAssetDisposal/reject")
    RespMsgBean<?> assetDisposalReject(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/tpmAssetDisposal/approve")
    RespMsgBean<?> assetDisposalApprove(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/tpmAssetDisposal/backOrRevoke")
    RespMsgBean<?> assetDisposalBackOrRevoke(BaseProcessEntity<?> processEntity);
    @PostMapping("/tpmAssetDisposal/reverse")
    RespMsgBean<?> assetDisposalReverse(@RequestBody BaseProcessEntity<?> entity);


    /** 资产借用 */
    @GetMapping("/tpmAssetBorrowOrder/queryById")
    RespMsgBean<JSONArray> borrowQueryById(@RequestParam("id") String id);
    @PostMapping("/tpmAssetBorrowOrder/submit")
    RespMsgBean<BaseBatchInformationVO> borrowSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);
    @PostMapping("/tpmAssetBorrowOrder/reject")
    RespMsgBean<?> borrowReject(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/tpmAssetBorrowOrder/approve")
    RespMsgBean<?> borrowApprove(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/tpmAssetBorrowOrder/backOrRevoke")
    RespMsgBean<?> borrowBackOrRevoke(BaseProcessEntity<?> processEntity);
    @PostMapping("/tpmAssetBorrowOrder/reverse")
    RespMsgBean<?> borrowReverse(@RequestBody BaseProcessEntity<?> entity);

    /** 资产校准 */
    @GetMapping("/tpmAssetCalibrateOrder/queryById")
    RespMsgBean<JSONArray> calibrateQueryById(@RequestParam("id") String id);
    @PostMapping("/tpmAssetCalibrateOrder/submit")
    RespMsgBean<BaseBatchInformationVO> calibrateSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);
    @PostMapping("/tpmAssetCalibrateOrder/reject")
    RespMsgBean<?> calibrateReject(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/tpmAssetCalibrateOrder/approve")
    RespMsgBean<?> calibrateApprove(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/tpmAssetCalibrateOrder/backOrRevoke")
    RespMsgBean<?> calibrateBackOrRevoke(BaseProcessEntity<?> processEntity);
    @PostMapping("/tpmAssetCalibrateOrder/reverse")
    RespMsgBean<?> calibrateReverse(@RequestBody BaseProcessEntity<?> entity);
}

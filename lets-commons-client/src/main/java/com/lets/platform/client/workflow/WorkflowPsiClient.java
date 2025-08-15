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

@FeignClient(value = "psi")
public interface WorkflowPsiClient {
    @PostMapping("/psiUnplannedStockInOrder/autoPostingById")
    RespMsgBean<String> unplannedStockInOrderAutoPostingById(BaseProcessEntity<?> entity);

    @GetMapping("/psiUnplannedStockInOrder/queryById")
    RespMsgBean<JSONArray> unplannedStockInOrderQueryById(@RequestParam("id") String id);

    @PostMapping("/psiUnplannedStockInOrder/submitProcess")
    RespMsgBean<BaseBatchInformationVO> unplannedStockInOrderSubmitById(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/psiUnplannedStockInOrder/rejectProcess")
    RespMsgBean<?> unplannedStockInOrderRejectById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiUnplannedStockInOrder/approveProcess")
    RespMsgBean<?> unplannedStockInOrderApproveById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiUnplannedStockInOrder/backOrRevokeProcess")
    RespMsgBean<?> unplannedStockInOrderBackOrRevokeById(BaseProcessEntity<?> processEntity);

    @PostMapping("/psiUnplannedStockInOrder/reverseProcess")
    RespMsgBean<?> unplannedStockInOrderReverseById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiUnplannedStockOutOrder/autoPostingById")
    RespMsgBean<String> unplannedStockOutOrderAutoPostingById(BaseProcessEntity<?> entity);

    @GetMapping("/psiUnplannedStockOutOrder/queryById")
    RespMsgBean<JSONArray> unplannedStockOutOrderQueryById(@RequestParam("id") String id);

    @PostMapping("/psiUnplannedStockOutOrder/submitProcess")
    RespMsgBean<?> unplannedStockOutOrderSubmitById(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/psiUnplannedStockOutOrder/rejectProcess")
    RespMsgBean<?> unplannedStockOutOrderRejectById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiUnplannedStockOutOrder/approveProcess")
    RespMsgBean<?> unplannedStockOutOrderApproveById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiUnplannedStockOutOrder/backOrRevokeProcess")
    RespMsgBean<?> unplannedStockOutOrderBackOrRevokeById(BaseProcessEntity<?> processEntity);

    @PostMapping("/psiUnplannedStockOutOrder/reverseProcess")
    RespMsgBean<?> unplannedStockOutOrderReverseById(@RequestBody BaseProcessEntity<?> entity);

    @GetMapping("/psiSaleQuotationOrder/queryById")
    RespMsgBean<JSONArray> saleQuotationOrderQueryById(@RequestParam("id") String id);

    @PostMapping("/psiSaleQuotationOrder/submit")
    RespMsgBean<BaseBatchInformationVO> saleQuotationOrderSubmitById(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/psiSaleQuotationOrder/workFlowSave")
    RespMsgBean<BaseBatchInformationVO> saleQuotationOrderSave(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/psiSaleQuotationOrder/reject")
    RespMsgBean<?> saleQuotationOrderRejectById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiSaleQuotationOrder/approve")
    RespMsgBean<?> saleQuotationOrderApproveById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiSaleQuotationOrder/backOrRevoke")
    RespMsgBean<?> saleQuotationOrderBackOrRevokeById(BaseProcessEntity<?> processEntity);

    @PostMapping("/psiSaleQuotationOrder/reverse")
    RespMsgBean<?> saleQuotationOrderReverseById(@RequestBody BaseProcessEntity<?> entity);

    @GetMapping("/psiSaleChangeOrder/queryById")
    RespMsgBean<JSONArray> saleChangeOrderQueryById(@RequestParam("id") String id);

    @PostMapping("/psiSaleChangeOrder/submit")
    RespMsgBean<BaseBatchInformationVO> saleChangeOrderSubmitById(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/psiSaleChangeOrder/reject")
    RespMsgBean<?> saleChangeOrderRejectById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiSaleChangeOrder/approve")
    RespMsgBean<?> saleChangeOrderApproveById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiSaleChangeOrder/backOrRevoke")
    RespMsgBean<?> saleChangeOrderBackOrRevokeById(BaseProcessEntity<?> processEntity);

    @PostMapping("/psiSaleChangeOrder/reverse")
    RespMsgBean<?> saleChangeOrderReverseById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiSaleChangeOrder/effect")
    RespMsgBean<?> saleChangeOrderEffectById(@RequestBody BaseProcessEntity<?> entity);

    @GetMapping("/psiSaleReturnApplicationOrder/queryById")
    RespMsgBean<JSONArray> saleReturnApplicationOrderQueryById(@RequestParam("id") String id);

    @PostMapping("/psiSaleReturnApplicationOrder/submit")
    RespMsgBean<BaseBatchInformationVO> saleReturnApplicationOrderSubmitById(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/psiSaleReturnApplicationOrder/reject")
    RespMsgBean<?> saleReturnApplicationOrderRejectById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiSaleReturnApplicationOrder/approve")
    RespMsgBean<?> saleReturnApplicationOrderApproveById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiSaleReturnApplicationOrder/backOrRevoke")
    RespMsgBean<?> saleReturnApplicationOrderBackOrRevokeById(BaseProcessEntity<?> processEntity);

    @PostMapping("/psiSaleReturnApplicationOrder/reverse")
    RespMsgBean<?> saleReturnApplicationOrderReverseById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiSaleReturnOrder/posting")
    RespMsgBean<String> saleReturnOrderAutoPostingById(BaseProcessEntity<?> entity);

    @GetMapping("/psiSaleReturnOrder/queryById")
    RespMsgBean<JSONArray> saleReturnOrderQueryById(@RequestParam("id") String id);

    @PostMapping("/psiSaleReturnOrder/submit")
    RespMsgBean<BaseBatchInformationVO> saleReturnOrderSubmitById(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/psiSaleReturnOrder/reject")
    RespMsgBean<?> saleReturnOrderRejectById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiSaleReturnOrder/approve")
    RespMsgBean<?> saleReturnOrderApproveById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiSaleReturnOrder/backOrRevoke")
    RespMsgBean<?> saleReturnOrderBackOrRevokeById(BaseProcessEntity<?> processEntity);

    @PostMapping("/psiSaleReturnOrder/reverse")
    RespMsgBean<?> saleReturnOrderReverseById(@RequestBody BaseProcessEntity<?> entity);

    @GetMapping("/psiSaleInvoiceRegistration/queryById")
    RespMsgBean<JSONArray> saleInvoiceRegisterQueryById(@RequestParam("id") String id);

    @PostMapping("/psiSaleInvoiceRegistration/submit")
    RespMsgBean<BaseBatchInformationVO> saleInvoiceRegisterSubmitById(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/psiSaleInvoiceRegistration/reject")
    RespMsgBean<?> saleInvoiceRegisterRejectById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiSaleInvoiceRegistration/approve")
    RespMsgBean<?> saleInvoiceRegisterApproveById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiSaleInvoiceRegistration/backOrRevoke")
    RespMsgBean<?> saleInvoiceRegisterBackOrRevokeById(BaseProcessEntity<?> processEntity);

    @PostMapping("/psiSaleInvoiceRegistration/reverse")
    RespMsgBean<?> saleInvoiceRegisterReverseById(@RequestBody BaseProcessEntity<?> entity);

    @GetMapping("/psiPurchaseInvoiceRegister/queryById")
    RespMsgBean<JSONArray> purchaseInvoiceRegisterQueryById(@RequestParam("id") String id);

    @PostMapping("/psiPurchaseInvoiceRegister/submit")
    RespMsgBean<BaseBatchInformationVO> purchaseInvoiceRegisterSubmitById(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/psiPurchaseInvoiceRegister/reject")
    RespMsgBean<?> purchaseInvoiceRegisterRejectById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiPurchaseInvoiceRegister/approve")
    RespMsgBean<?> purchaseInvoiceRegisterApproveById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiPurchaseInvoiceRegister/backOrRevoke")
    RespMsgBean<?> purchaseInvoiceRegisterBackOrRevokeById(BaseProcessEntity<?> processEntity);

    @PostMapping("/psiPurchaseInvoiceRegister/reverse")
    RespMsgBean<?> purchaseInvoiceRegisterReverseById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiSaleOrder/workFlowSave")
    RespMsgBean<BaseBatchInformationVO> saleOrderWorkFlowSave(@RequestBody BaseProcessEntity<JSONObject> entity);

    @GetMapping("/psiSaleOrder/queryById")
    RespMsgBean<JSONArray> saleOrderQueryById(@RequestParam("id") String id);

    @PostMapping("/psiSaleOrder/submit")
    RespMsgBean<BaseBatchInformationVO> saleOrderSubmitById(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/psiSaleOrder/reject")
    RespMsgBean<?> saleOrderRejectById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiSaleOrder/approve")
    RespMsgBean<?> saleOrderApproveById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiSaleOrder/backOrRevoke")
    RespMsgBean<?> saleOrderBackOrRevokeById(BaseProcessEntity<?> processEntity);

    @PostMapping("/psiSaleOrder/reverse")
    RespMsgBean<?> saleOrderReverseById(@RequestBody BaseProcessEntity<?> entity);

    @GetMapping("/psiSaleReplacementOrder/queryById")
    RespMsgBean<JSONArray> saleReplacementOrderQueryById(@RequestParam("id") String id);

    @PostMapping("/psiSaleReplacementOrder/submit")
    RespMsgBean<BaseBatchInformationVO> saleReplacementOrderSubmitById(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/psiSaleReplacementOrder/reject")
    RespMsgBean<?> saleReplacementOrderRejectById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiSaleReplacementOrder/approve")
    RespMsgBean<?> saleReplacementOrderApproveById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiSaleReplacementOrder/backOrRevoke")
    RespMsgBean<?> saleReplacementOrderBackOrRevokeById(BaseProcessEntity<?> processEntity);

    @PostMapping("/psiSaleReplacementOrder/reverse")
    RespMsgBean<?> saleReplacementOrderReverseById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiSaleStockOutOrder/posting")
    RespMsgBean<String> saleStockOutOrderPosting(BaseProcessEntity<?> entity);

    @GetMapping("/psiSaleStockOutOrder/queryById")
    RespMsgBean<JSONArray> saleStockOutOrderQueryById(@RequestParam("id") String id);

    @PostMapping("/psiSaleStockOutOrder/submit")
    RespMsgBean<?> saleStockOutOrderSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/psiSaleStockOutOrder/reject")
    RespMsgBean<?> saleStockOutOrderReject(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiSaleStockOutOrder/approve")
    RespMsgBean<?> saleStockOutOrderApprove(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiSaleStockOutOrder/backOrRevoke")
    RespMsgBean<?> saleStockOutOrderBackOrRevoke(BaseProcessEntity<?> processEntity);

    @PostMapping("/psiSaleStockOutOrder/reverse")
    RespMsgBean<?> saleStockOutOrderReverse(@RequestBody BaseProcessEntity<?> entity);

    @GetMapping("/psiPurchaseApplyOrder/queryById")
    RespMsgBean<JSONArray> psiPurchaseApplyOrderQueryById(@RequestParam("id") String id);

    @PostMapping("/psiPurchaseApplyOrder/submit")
    RespMsgBean<BaseBatchInformationVO> psiPurchaseApplyOrderSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/psiPurchaseApplyOrder/reject")
    RespMsgBean<?> psiPurchaseApplyOrderReject(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiPurchaseApplyOrder/approve")
    RespMsgBean<?> psiPurchaseApplyOrderApprove(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiPurchaseApplyOrder/backOrRevoke")
    RespMsgBean<?> psiPurchaseApplyOrderBackOrRevoke(BaseProcessEntity<?> processEntity);

    @PostMapping("/psiPurchaseApplyOrder/reverse")
    RespMsgBean<?> psiPurchaseApplyOrderReverse(@RequestBody BaseProcessEntity<?> entity);

    @GetMapping("/psiPurchaseRfq/queryById")
    RespMsgBean<JSONArray> psiPurchaseInquiryQueryById(@RequestParam("id") String id);

    @PostMapping("/psiPurchaseRfq/submit")
    RespMsgBean<BaseBatchInformationVO> psiPurchaseInquirySubmit(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/psiPurchaseRfq/reject")
    RespMsgBean<?> psiPurchaseInquiryReject(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiPurchaseRfq/approve")
    RespMsgBean<?> psiPurchaseInquiryApprove(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiPurchaseRfq/backOrRevoke")
    RespMsgBean<?> psiPurchaseInquiryBackOrRevoke(BaseProcessEntity<?> processEntity);

    @PostMapping("/psiPurchaseRfq/reverse")
    RespMsgBean<?> psiPurchaseInquiryReverse(@RequestBody BaseProcessEntity<?> entity);

    @GetMapping("/psiDeliveryNotifyOrder/queryById")
    RespMsgBean<JSONArray> psiSaleDeliveryNotifyOrderQueryById(@RequestParam("id") String id);

    @PostMapping("/psiDeliveryNotifyOrder/submit")
    RespMsgBean<BaseBatchInformationVO> psiSaleDeliveryNotifyOrderSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/psiDeliveryNotifyOrder/workFlowSave")
    RespMsgBean<JSONArray> psiSaleDeliveryNotifyOrderSave(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/psiDeliveryNotifyOrder/reject")
    RespMsgBean<?> psiSaleDeliveryNotifyOrderReject(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiDeliveryNotifyOrder/approve")
    RespMsgBean<?> psiSaleDeliveryNotifyOrderApprove(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiDeliveryNotifyOrder/backOrRevoke")
    RespMsgBean<?> psiSaleDeliveryNotifyOrderBackOrRevoke(BaseProcessEntity<?> processEntity);

    @PostMapping("/psiDeliveryNotifyOrder/reverse")
    RespMsgBean<?> psiSaleDeliveryNotifyOrderReverse(@RequestBody BaseProcessEntity<?> entity);

    @GetMapping("/psiPurchaseOrder/queryById")
    RespMsgBean<JSONArray> psiPurchaseOrderQueryById(@RequestParam("id") String id);

    @PostMapping("/psiPurchaseOrder/submit")
    RespMsgBean<BaseBatchInformationVO> psiPurchaseOrderSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/psiPurchaseOrder/reject")
    RespMsgBean<?> psiPurchaseOrderReject(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiPurchaseOrder/approve")
    RespMsgBean<?> psiPurchaseOrderApprove(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiPurchaseOrder/backOrRevoke")
    RespMsgBean<?> psiPurchaseOrderBackOrRevoke(BaseProcessEntity<?> processEntity);

    @PostMapping("/psiPurchaseOrder/reverse")
    RespMsgBean<?> psiPurchaseOrderReverse(@RequestBody BaseProcessEntity<?> entity);

    /*完工入库*/
    @PostMapping("/psiWipCompletionStockInOrder/posting")
    RespMsgBean<String> wipCompletionStockInOrderPosting(BaseProcessEntity<?> entity);

    @GetMapping("/psiWipCompletionStockInOrder/queryById")
    RespMsgBean<JSONArray> wipCompletionStockInOrderQueryById(@RequestParam("id") String id);

    @PostMapping("/psiWipCompletionStockInOrder/submit")
    RespMsgBean<BaseBatchInformationVO> wipCompletionStockInOrderSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/psiWipCompletionStockInOrder/reject")
    RespMsgBean<?> wipCompletionStockInOrderReject(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiWipCompletionStockInOrder/approve")
    RespMsgBean<?> wipCompletionStockInOrderApprove(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiWipCompletionStockInOrder/backOrRevoke")
    RespMsgBean<?> wipCompletionStockInOrderBackOrRevoke(BaseProcessEntity<?> processEntity);

    @PostMapping("/psiWipCompletionStockInOrder/reverse")
    RespMsgBean<?> wipCompletionStockInOrderReverse(@RequestBody BaseProcessEntity<?> entity);

    /*采购入库*/
    @PostMapping("/psiPurchaseStockInOrder/posting")
    RespMsgBean<String> purchaseStockInOrderPosting(BaseProcessEntity<?> entity);

    @GetMapping("/psiPurchaseStockInOrder/queryById")
    RespMsgBean<JSONArray> purchaseStockInOrderQueryById(@RequestParam("id") String id);

    @PostMapping("/psiPurchaseStockInOrder/submit")
    RespMsgBean<BaseBatchInformationVO> purchaseStockInOrderSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/psiPurchaseStockInOrder/reject")
    RespMsgBean<?> purchaseStockInOrderReject(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiPurchaseStockInOrder/approve")
    RespMsgBean<?> purchaseStockInOrderApprove(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiPurchaseStockInOrder/backOrRevoke")
    RespMsgBean<?> purchaseStockInOrderBackOrRevoke(BaseProcessEntity<?> processEntity);

    @PostMapping("/psiPurchaseStockInOrder/reverse")
    RespMsgBean<?> purchaseStockInOrderReverse(@RequestBody BaseProcessEntity<?> entity);

    /*采购收货*/
    @GetMapping("/purchaseDeliveryOrder/queryById")
    RespMsgBean<JSONArray> purchaseDeliveryOrderQueryById(@RequestParam("id") String id);

    @PostMapping("/purchaseDeliveryOrder/submit")
    RespMsgBean<BaseBatchInformationVO> purchaseDeliveryOrderSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/purchaseDeliveryOrder/reject")
    RespMsgBean<?> purchaseDeliveryOrderReject(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/purchaseDeliveryOrder/approve")
    RespMsgBean<?> purchaseDeliveryOrderApprove(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/purchaseDeliveryOrder/backOrRevoke")
    RespMsgBean<?> purchaseDeliveryOrderBackOrRevoke(BaseProcessEntity<?> processEntity);

    @PostMapping("/purchaseDeliveryOrder/reverse")
    RespMsgBean<?> purchaseDeliveryOrderReverse(@RequestBody BaseProcessEntity<?> entity);

    /*采购发票登记*/
    @GetMapping("/psiPurchaseInvoiceOrder/queryById")
    RespMsgBean<JSONArray> purchaseInvoiceOrderQueryById(@RequestParam("id") String id);

    @PostMapping("/psiPurchaseInvoiceOrder/submit")
    RespMsgBean<BaseBatchInformationVO> purchaseInvoiceOrderSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/psiPurchaseInvoiceOrder/reject")
    RespMsgBean<?> purchaseInvoiceOrderReject(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiPurchaseInvoiceOrder/approve")
    RespMsgBean<?> purchaseInvoiceOrderApprove(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiPurchaseInvoiceOrder/backOrRevoke")
    RespMsgBean<?> purchaseInvoiceOrderBackOrRevoke(BaseProcessEntity<?> processEntity);

    @PostMapping("/psiPurchaseInvoiceOrder/reverse")
    RespMsgBean<?> purchaseInvoiceOrderReverse(@RequestBody BaseProcessEntity<?> entity);

    /*直接调拨单*/
    @GetMapping("/psiTransferOrder/queryById")
    RespMsgBean<JSONArray> transferOrderQueryById(@RequestParam("id") String id);

    @PostMapping("/psiTransferOrder/submit")
    RespMsgBean<?> transferOrderSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/psiTransferOrder/reject")
    RespMsgBean<?> transferOrderReject(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiTransferOrder/approve")
    RespMsgBean<?> transferOrderApprove(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiTransferOrder/backOrRevoke")
    RespMsgBean<?> transferOrderBackOrRevoke(BaseProcessEntity<?> processEntity);

    @PostMapping("/psiTransferOrder/reverse")
    RespMsgBean<?> transferOrderReverse(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiTransferOrder/posting")
    RespMsgBean<?> transferOrderPosting(@RequestBody BaseProcessEntity<?> entity);

    /*一级MRP计划*/
    @GetMapping("/psiMrpPlan/queryById")
    RespMsgBean<JSONArray> mrpPlanQueryById(@RequestParam("id") String id);

    @PostMapping("/psiMrpPlan/submit")
    RespMsgBean<BaseBatchInformationVO> mrpPlanSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/psiMrpPlan/reject")
    RespMsgBean<?> mrpPlanReject(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiMrpPlan/approve")
    RespMsgBean<?> mrpPlanApprove(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiMrpPlan/backOrRevoke")
    RespMsgBean<?> mrpPlanBackOrRevoke(BaseProcessEntity<?> processEntity);

    @PostMapping("/psiMrpPlan/reverse")
    RespMsgBean<?> mrpPlanReverse(@RequestBody BaseProcessEntity<?> entity);

    /*MPS*/
    @GetMapping("/psiMpsPlan/queryById")
    RespMsgBean<JSONArray> mpsPlanQueryById(@RequestParam("id") String id);

    @PostMapping("/psiMpsPlan/submit")
    RespMsgBean<BaseBatchInformationVO> mpsPlanSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/psiMpsPlan/reject")
    RespMsgBean<?> mpsPlanReject(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiMpsPlan/approve")
    RespMsgBean<?> mpsPlanApprove(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiMpsPlan/backOrRevoke")
    RespMsgBean<?> mpsPlanBackOrRevoke(BaseProcessEntity<?> processEntity);

    @PostMapping("/psiMpsPlan/reverse")
    RespMsgBean<?> mpsPlanReverse(@RequestBody BaseProcessEntity<?> entity);

    /**
     * 合同管理
     **/
    @GetMapping("/psiContractOrder/queryById")
    RespMsgBean<JSONArray> contractOrderQueryById(@RequestParam("id") String id);

    @PostMapping("/psiContractOrder/submit")
    RespMsgBean<BaseBatchInformationVO> contractOrderSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/psiContractOrder/reject")
    RespMsgBean<?> contractOrderReject(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiContractOrder/approve")
    RespMsgBean<?> contractOrderApprove(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiContractOrder/backOrRevoke")
    RespMsgBean<?> contractOrderBackOrRevoke(BaseProcessEntity<?> processEntity);

    @PostMapping("/psiContractOrder/reverse")
    RespMsgBean<?> contractOrderReverse(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiContractOrder/workFlowSave")
    RespMsgBean<BaseBatchInformationVO> contractOrderWorkFlowSave(@RequestBody BaseProcessEntity<JSONObject> entity);

    /**
     * 物料管理
     */
    @GetMapping("/psiMaterial/queryById")
    RespMsgBean<JSONArray> materialQueryById(@RequestParam("id") String id);

    @PostMapping("/psiMaterial/submit")
    RespMsgBean<BaseBatchInformationVO> materialSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/psiMaterial/reject")
    RespMsgBean<?> materialReject(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiMaterial/approve")
    RespMsgBean<?> materialApprove(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiMaterial/backOrRevoke")
    RespMsgBean<?> materialBackOrRevoke(BaseProcessEntity<?> processEntity);

    @PostMapping("/psiMaterial/reverse")
    RespMsgBean<?> materialReverse(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiMaterial/updateMaterialLife")
    RespMsgBean<?> updateMaterialLife(BaseProcessEntity<?> entity);

    /**
     * 物料申请
     */
    @GetMapping("/psiMaterialApply/queryById")
    RespMsgBean<JSONArray> materialApplyQueryById(@RequestParam("id") String id);


    @PostMapping("/psiMaterialApply/submit")
    RespMsgBean<?> materialApplySubmit(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/psiMaterialApply/reject")
    RespMsgBean<?> materialApplyReject(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiMaterialApply/approve")
    RespMsgBean<?> materialApplyApprove(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiMaterialApply/backOrRevoke")
    RespMsgBean<?> materialApplyBackOrRevoke(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiMaterialApply/reverse")
    RespMsgBean<?> materialApplyReverse(@RequestBody BaseProcessEntity<?> entity);

    /**
     * 销售预测单
     */
    @GetMapping("/salePredictionOrder/queryById")
    RespMsgBean<JSONArray> salePredictionOrderQueryById(@RequestParam("id") String id);

    @PostMapping("/salePredictionOrder/submit")
    RespMsgBean<?> salePredictionOrderSubmit(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/salePredictionOrder/reject")
    RespMsgBean<?> salePredictionOrderReject(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/salePredictionOrder/approve")
    RespMsgBean<?> salePredictionOrderApprove(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/salePredictionOrder/backOrRevoke")
    RespMsgBean<?> salePredictionOrderBackOrRevoke(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/salePredictionOrder/reverse")
    RespMsgBean<?> salePredictionOrderReverse(@RequestBody BaseProcessEntity<?> entity);

    @GetMapping("/psiPurchaseChangeOrder/queryById")
    RespMsgBean<JSONArray> purchaseChangeOrderQueryById(@RequestParam("id") String id);

    @PostMapping("/psiPurchaseChangeOrder/submit")
    RespMsgBean<BaseBatchInformationVO> purchaseChangeOrderSubmitById(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/psiPurchaseChangeOrder/reject")
    RespMsgBean<?> purchaseChangeOrderRejectById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiPurchaseChangeOrder/approve")
    RespMsgBean<?> purchaseChangeOrderApproveById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiPurchaseChangeOrder/backOrRevoke")
    RespMsgBean<?> purchaseChangeOrderBackOrRevokeById(BaseProcessEntity<?> processEntity);

    @PostMapping("/psiPurchaseChangeOrder/reverse")
    RespMsgBean<?> purchaseChangeOrderReverseById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiPurchaseChangeOrder/effect")
    RespMsgBean<?> purchaseChangeOrderEffectById(@RequestBody BaseProcessEntity<?> entity);

    @GetMapping("/psiStepTransferOrder/queryById")
    RespMsgBean<JSONArray> stepTransferOrderQueryById(@RequestParam("id") String id);

    @PostMapping("/psiStepTransferOrder/submit")
    RespMsgBean<?> stepTransferOrderSubmitById(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/psiStepTransferOrder/reject")
    RespMsgBean<?> stepTransferOrderRejectById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiStepTransferOrder/approve")
    RespMsgBean<?> stepTransferOrderApproveById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiStepTransferOrder/backOrRevoke")
    RespMsgBean<?> stepTransferOrderBackOrRevokeById(BaseProcessEntity<?> processEntity);

    @PostMapping("/psiStepTransferOrder/posting")
    RespMsgBean<?> stepTransferOrderPosting(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiStepTransferOrder/reverse")
    RespMsgBean<?> stepTransferOrderReverseById(@RequestBody BaseProcessEntity<?> entity);


    @GetMapping("/psiStepTransferInOrder/queryById")
    RespMsgBean<JSONArray> stepTransferInOrderQueryById(@RequestParam("id") String id);

    @PostMapping("/psiStepTransferInOrder/submit")
    RespMsgBean<BaseBatchInformationVO> stepTransferInOrderSubmitById(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/psiStepTransferInOrder/reject")
    RespMsgBean<?> stepTransferInOrderRejectById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiStepTransferInOrder/approve")
    RespMsgBean<?> stepTransferInOrderApproveById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiStepTransferInOrder/backOrRevoke")
    RespMsgBean<?> stepTransferInOrderBackOrRevokeById(BaseProcessEntity<?> processEntity);

    @PostMapping("/psiStepTransferInOrder/posting")
    RespMsgBean<?> stepTransferInOrderPosting(BaseProcessEntity<?> processEntity);

    @PostMapping("/psiStepTransferInOrder/reverse")
    RespMsgBean<?> stepTransferInOrderReverseById(@RequestBody BaseProcessEntity<?> entity);



    @GetMapping("/psiSalePriceList/queryById")
    RespMsgBean<JSONArray> salePriceListQueryById(@RequestParam("id") String id);

    @PostMapping("/psiSalePriceList/submitById")
    RespMsgBean<?> salePriceListSubmitById(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/psiSalePriceList/reject")
    RespMsgBean<?> salePriceListRejectById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiSalePriceList/approveById")
    RespMsgBean<?> salePriceListApproveById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiSalePriceList/revokeById")
    RespMsgBean<?> salePriceListBackOrRevokeById(BaseProcessEntity<?> processEntity);

    @PostMapping("/psiSalePriceList/reverseById")
    RespMsgBean<?> salePriceListReverseById(@RequestBody BaseProcessEntity<?> entity);

    @GetMapping("/psiPurchasePriceList/queryById")
    RespMsgBean<JSONArray> purchasePriceListQueryById(@RequestParam("id") String id);

    @PostMapping("/psiPurchasePriceList/submitById")
    RespMsgBean<?> purchasePriceListSubmitById(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/psiPurchasePriceList/reject")
    RespMsgBean<?> purchasePriceListRejectById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiPurchasePriceList/auditById")
    RespMsgBean<?> purchasePriceListApproveById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiPurchasePriceList/revokeById")
    RespMsgBean<?> purchasePriceListBackOrRevokeById(BaseProcessEntity<?> processEntity);

    @PostMapping("/psiPurchasePriceList/reverseById")
    RespMsgBean<?> purchasePriceListReverseById(@RequestBody BaseProcessEntity<?> entity);

    @GetMapping("/psiOutsourcingPriceList/queryById")
    RespMsgBean<JSONArray> outsourcingPriceListQueryById(@RequestParam("id") String id);

    @PostMapping("/psiOutsourcingPriceList/submitById")
    RespMsgBean<?> outsourcingPriceListSubmitById(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/psiOutsourcingPriceList/reject")
    RespMsgBean<?> outsourcingPriceListRejectById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiOutsourcingPriceList/auditById")
    RespMsgBean<?> outsourcingPriceListApproveById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiOutsourcingPriceList/revokeById")
    RespMsgBean<?> outsourcingPriceListBackOrRevokeById(BaseProcessEntity<?> processEntity);

    @PostMapping("/psiOutsourcingPriceList/reverseById")
    RespMsgBean<?> outsourcingPriceListReverseById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiProducePlan/confirmById")
    RespMsgBean<?> planedConfirmById(@RequestBody BaseProcessEntity<?> entity);

    @GetMapping("/psiProducePlan/queryById")
    RespMsgBean<JSONArray> planedQueryById(@RequestParam("id") String id);

    @PostMapping("/psiProducePlan/submitById")
    RespMsgBean<?> planedSubmitById(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/psiProducePlan/reject")
    RespMsgBean<?> planedRejectById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiProducePlan/auditById")
    RespMsgBean<?> planedApproveById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiProducePlan/revokeById")
    RespMsgBean<?> planedBackOrRevokeById(BaseProcessEntity<?> processEntity);

    @PostMapping("/psiProducePlan/reverseById")
    RespMsgBean<?> planedReverseById(@RequestBody BaseProcessEntity<?> entity);

    /**
     * 应付单
     */
    @GetMapping("/psiPurchaseApDoc/queryById")
    RespMsgBean<JSONArray> purchaseApDocQueryById(@RequestParam("id") String id);

    @PostMapping("/psiPurchaseApDoc/submit")
    RespMsgBean<BaseBatchInformationVO> purchaseApDocSubmitById(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/psiPurchaseApDoc/reject")
    RespMsgBean<?> purchaseApDocRejectById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiPurchaseApDoc/approve")
    RespMsgBean<?> purchaseApDocApproveById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiPurchaseApDoc/backOrRevoke")
    RespMsgBean<?> purchaseApDocBackOrRevokeById(BaseProcessEntity<?> processEntity);

    @PostMapping("/psiPurchaseApDoc/reverse")
    RespMsgBean<?> purchaseApDocReverseById(@RequestBody BaseProcessEntity<?> entity);
    /**
     * 付款退款单
     */
    @GetMapping("/psiPurchasePaymentRefundDoc/queryById")
    RespMsgBean<JSONArray> refundDocQueryById(@RequestParam("id") String id);

    @PostMapping("/psiPurchasePaymentRefundDoc/submit")
    RespMsgBean<BaseBatchInformationVO> refundDocSubmitById(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/psiPurchasePaymentRefundDoc/reject")
    RespMsgBean<?> refundDocRejectById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiPurchasePaymentRefundDoc/approve")
    RespMsgBean<?> refundDocApproveById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiPurchasePaymentRefundDoc/backOrRevoke")
    RespMsgBean<?> refundDocBackOrRevokeById(BaseProcessEntity<?> processEntity);

    @PostMapping("/psiPurchasePaymentRefundDoc/reverse")
    RespMsgBean<?> refundDocReverseById(@RequestBody BaseProcessEntity<?> entity);

    /**
     *  应收单
     */
    @GetMapping("/psiSaleArDoc/queryById")
    RespMsgBean<JSONArray> saleArQueryById(@RequestParam("id") String id);

    @PostMapping("/psiSaleArDoc/submit")
    RespMsgBean<BaseBatchInformationVO> saleArDocSubmitById(@RequestBody BaseProcessEntity<JSONObject> entity);

    @PostMapping("/psiSaleArDoc/reject")
    RespMsgBean<?> saleArDocRejectById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiSaleArDoc/approve")
    RespMsgBean<?> saleArDocApproveById(@RequestBody BaseProcessEntity<?> entity);

    @PostMapping("/psiSaleArDoc/backOrRevoke")
    RespMsgBean<?> saleArDocBackOrRevokeById(BaseProcessEntity<?> processEntity);

    @PostMapping("/psiSaleArDoc/reverse")
    RespMsgBean<?> saleArDocReverseById(@RequestBody BaseProcessEntity<?> entity);

    /** 协同报价单 */
    @GetMapping("/psiCooperateQuoteOrder/queryById")
    RespMsgBean<JSONArray> psiCooperateQuoteOrderQueryById(@RequestParam("id") String id);
    @PostMapping("/psiCooperateQuoteOrder/submit")
    RespMsgBean<BaseBatchInformationVO> psiCooperateQuoteOrderSubmitById(@RequestBody BaseProcessEntity<JSONObject> entity);
    @PostMapping("/psiCooperateQuoteOrder/reject")
    RespMsgBean<?> psiCooperateQuoteOrderRejectById(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/psiCooperateQuoteOrder/approve")
    RespMsgBean<?> psiCooperateQuoteOrderApproveById(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/psiCooperateQuoteOrder/backOrRevoke")
    RespMsgBean<?> psiCooperateQuoteOrderBackOrRevokeById(BaseProcessEntity<?> processEntity);
    @PostMapping("/psiCooperateQuoteOrder/reverse")
    RespMsgBean<?> psiCooperateQuoteOrderReverseById(@RequestBody BaseProcessEntity<?> entity);

    /** 协同送货单 */
    @GetMapping("/psiCooperateDeliverOrder/queryById")
    RespMsgBean<JSONArray> psiCooperateDeliverOrderQueryById(@RequestParam("id") String id);
    @PostMapping("/psiCooperateDeliverOrder/submit")
    RespMsgBean<BaseBatchInformationVO> psiCooperateDeliverOrderSubmitById(@RequestBody BaseProcessEntity<JSONObject> entity);
    @PostMapping("/psiCooperateDeliverOrder/reject")
    RespMsgBean<?> psiCooperateDeliverOrderRejectById(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/psiCooperateDeliverOrder/approve")
    RespMsgBean<?> psiCooperateDeliverOrderApproveById(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/psiCooperateDeliverOrder/backOrRevoke")
    RespMsgBean<?> psiCooperateDeliverOrderBackOrRevokeById(BaseProcessEntity<?> processEntity);
    @PostMapping("/psiCooperateDeliverOrder/reverse")
    RespMsgBean<?> psiCooperateDeliverOrderReverseById(@RequestBody BaseProcessEntity<?> entity);


    @GetMapping("/psiSourceList/queryById")
    RespMsgBean<JSONArray> psiSourceListQueryById(@RequestParam("id") String id);
    @PostMapping("/psiSourceList/submitById")
    RespMsgBean<BaseBatchInformationVO> psiSourceListSubmitById(@RequestBody BaseProcessEntity<JSONObject> entity);
    @PostMapping("/psiSourceList/reject")
    RespMsgBean<?> psiSourceListRejectById(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/psiSourceList/auditById")
    RespMsgBean<?> psiSourceListApproveById(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/psiSourceList/revokeById")
    RespMsgBean<?> psiSourceListBackOrRevokeById(BaseProcessEntity<?> processEntity);
    @PostMapping("/psiSourceList/reverseById")
    RespMsgBean<?> psiSourceListOrderReverseById(@RequestBody BaseProcessEntity<?> entity);

    @GetMapping("/psiPaymentOrder/queryById")
    RespMsgBean<JSONArray> psiPaymentOrderQueryById(@RequestParam("id") String id);
    @PostMapping("/psiPaymentOrder/submit")
    RespMsgBean<BaseBatchInformationVO> psiPaymentOrderSubmitById(@RequestBody BaseProcessEntity<JSONObject> entity);
    @PostMapping("/psiPaymentOrder/reject")
    RespMsgBean<?> psiPaymentOrderRejectById(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/psiPaymentOrder/approve")
    RespMsgBean<?> psiPaymentOrderApproveById(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/psiPaymentOrder/backOrRevoke")
    RespMsgBean<?> psiPaymentOrderBackOrRevokeById(BaseProcessEntity<?> processEntity);
    @PostMapping("/psiPaymentOrder/reverse")
    RespMsgBean<?> psiPaymentOrderOrderReverseById(@RequestBody BaseProcessEntity<?> entity);

    @GetMapping("/psiReceiptOrder/queryById")
    RespMsgBean<JSONArray> psiReceiptOrderQueryById(@RequestParam("id") String id);
    @PostMapping("/psiReceiptOrder/submit")
    RespMsgBean<BaseBatchInformationVO> psiReceiptOrderSubmitById(@RequestBody BaseProcessEntity<JSONObject> entity);
    @PostMapping("/psiReceiptOrder/reject")
    RespMsgBean<?> psiReceiptOrderRejectById(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/psiReceiptOrder/approve")
    RespMsgBean<?> psiReceiptOrderApproveById(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/psiReceiptOrder/backOrRevoke")
    RespMsgBean<?> psiReceiptOrderBackOrRevokeById(BaseProcessEntity<?> processEntity);
    @PostMapping("/psiReceiptOrder/reverse")
    RespMsgBean<?> psiReceiptOrderOrderReverseById(@RequestBody BaseProcessEntity<?> entity);

    @GetMapping("/psiMaterialSubstitutionPlan/queryById")
    RespMsgBean<JSONArray> materialSubstitutionPlanQueryById(@RequestParam("id") String id);
    @PostMapping("/psiMaterialSubstitutionPlan/submit")
    RespMsgBean<BaseBatchInformationVO> materialSubstitutionPlanSubmitById(@RequestBody BaseProcessEntity<JSONObject> entity);
    @PostMapping("/psiMaterialSubstitutionPlan/reject")
    RespMsgBean<?> materialSubstitutionPlanRejectById(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/psiMaterialSubstitutionPlan/approve")
    RespMsgBean<?> materialSubstitutionPlanApproveById(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/psiMaterialSubstitutionPlan/backOrRevoke")
    RespMsgBean<?> materialSubstitutionPlanBackOrRevokeById(BaseProcessEntity<?> processEntity);
    @PostMapping("/psiMaterialSubstitutionPlan/reverse")
    RespMsgBean<?> materialSubstitutionPlanReverseById(@RequestBody BaseProcessEntity<?> entity);

    @GetMapping("/psiCustom/queryById")
    RespMsgBean<JSONArray> psiCustomQueryById(@RequestParam("id") String id);
    @PostMapping("/psiCustom/submit")
    RespMsgBean<BaseBatchInformationVO> psiCustomSubmitById(@RequestBody BaseProcessEntity<JSONObject> entity);
    @PostMapping("/psiCustom/reject")
    RespMsgBean<?> psiCustomRejectById(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/psiCustom/approve")
    RespMsgBean<?> psiCustomApproveById(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/psiCustom/backOrRevoke")
    RespMsgBean<?> psiCustomBackOrRevokeById(BaseProcessEntity<?> processEntity);
    @PostMapping("/psiCustom/reverse")
    RespMsgBean<?> psiCustomReverseById(@RequestBody BaseProcessEntity<?> entity);

    @GetMapping("/psiSupplier/queryById")
    RespMsgBean<JSONArray> psiSupplierQueryById(@RequestParam("id") String id);
    @PostMapping("/psiSupplier/submit")
    RespMsgBean<BaseBatchInformationVO> psiSupplierSubmitById(@RequestBody BaseProcessEntity<JSONObject> entity);
    @PostMapping("/psiSupplier/reject")
    RespMsgBean<?> psiSupplierRejectById(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/psiSupplier/approve")
    RespMsgBean<?> psiSupplierApproveById(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/psiSupplier/backOrRevoke")
    RespMsgBean<?> psiSupplierBackOrRevokeById(BaseProcessEntity<?> processEntity);
    @PostMapping("/psiSupplier/reverse")
    RespMsgBean<?> psiSupplierReverseById(@RequestBody BaseProcessEntity<?> entity);

    @GetMapping("/psiAccountTerm/queryById")
    RespMsgBean<JSONArray> psiAccountTermQueryById(@RequestParam("id") String id);
    @PostMapping("/psiAccountTerm/submit")
    RespMsgBean<?> psiAccountTermSubmitById(@RequestBody BaseProcessEntity<JSONObject> entity);
    @PostMapping("/psiAccountTerm/reject")
    RespMsgBean<?> psiAccountTermRejectById(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/psiAccountTerm/approve")
    RespMsgBean<?> psiAccountTermApproveById(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/psiAccountTerm/backOrRevoke")
    RespMsgBean<?> psiAccountTermBackOrRevokeById(BaseProcessEntity<?> processEntity);
    @PostMapping("/psiAccountTerm/reverse")
    RespMsgBean<?> psiAccountTermReverseById(@RequestBody BaseProcessEntity<?> entity);


    @GetMapping("/psiAccountTermRecord/queryById")
    RespMsgBean<JSONArray> psiAccountTermRecordQueryById(@RequestParam("id") String id);
    @PostMapping("/psiAccountTermRecord/submit")
    RespMsgBean<?> psiAccountTermRecordSubmitById(@RequestBody BaseProcessEntity<JSONObject> entity);
    @PostMapping("/psiAccountTermRecord/reject")
    RespMsgBean<?> psiAccountTermRecordRejectById(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/psiAccountTermRecord/approve")
    RespMsgBean<?> psiAccountTermRecordApproveById(@RequestBody BaseProcessEntity<?> entity);
    @PostMapping("/psiAccountTermRecord/backOrRevoke")
    RespMsgBean<?> psiAccountTermRecordBackOrRevokeById(BaseProcessEntity<?> processEntity);
    @PostMapping("/psiAccountTermRecord/reverse")
    RespMsgBean<?> psiAccountTermRecordReverseById(@RequestBody BaseProcessEntity<?> entity);

}

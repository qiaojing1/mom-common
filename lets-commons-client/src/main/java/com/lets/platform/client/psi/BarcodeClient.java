package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.BarcodeClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.psi.dto.AutoBarcodeDTO;
import com.lets.platform.model.psi.dto.BarcodePrintDTO;
import com.lets.platform.model.psi.dto.GenContainerCodeDto;
import com.lets.platform.model.psi.entity.*;
import com.lets.platform.model.psi.vo.MaterialBarcodeSourceInfoQuery;
import com.lets.platform.model.psi.vo.RecommendPositionQuery;
import com.lets.platform.model.psi.vo.RecommendPositionVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * 计量单位Feign接口
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/7/5 17:38
 */
@FeignClient(value = "psi", fallback = BarcodeClientFallback.class)
public interface BarcodeClient {

    @GetMapping("/psiContainer/getContainerById")
    RespMsgBean<PsiContainer> getContainerById(@RequestParam("id") String id);

    @GetMapping("/psiContainer/getContainerByCode")
    RespMsgBean<PsiContainer> getContainerByCode(@RequestParam("code") String code,
                                                 @RequestParam(value = "tenancyId", required = false) String tenancyId);

    @PostMapping("/psiContainer/genOneContainerCode")
    RespMsgBean<PsiContainerCode> genOneContainerCode(@RequestBody GenContainerCodeDto dto);

    @PostMapping("/psiContainer/genContainerCode")
    RespMsgBean<Boolean> genContainerCode(@RequestBody List<String> list, @RequestParam("number") Integer number);

    @PostMapping("/psiMaterialBarcodeManage/defaultSaveAndReturn")
    RespMsgBean<List<PsiMaterialBarcode>> defaultSaveAndReturn(@RequestBody PsiMaterialBarcodeManage entity);

    @PostMapping("/psiMaterialBarcodeManage/getSourceInfo")
    RespMsgBean<List<PsiMaterialBarcodeDetail>> getSourceInfo(@RequestBody MaterialBarcodeSourceInfoQuery query);

    @GetMapping("/psiMaterialBarcode/findByBarcodeCode")
    RespMsgBean<PsiMaterialBarcode> findByBarcodeCode(@RequestParam("code") String barcode,
                                                      @RequestParam(value = "tenancyId", required = false) String tenancyId);

    @PostMapping("/psiMaterialBarcode/findByBarcodeCodes")
    RespMsgBean<List<PsiMaterialBarcode>> findByBarcodeCodes(@RequestBody List<String> barcodeCodes);

    @PostMapping("/psiMaterialBarcode/recommendPositionList")
    RespMsgBean<List<RecommendPositionVO>> recommendPositionList(@RequestBody RecommendPositionQuery recommendPositionQuery);

    @PostMapping("/psiMaterialBarcode/updateReportStatus")
    RespMsgBean<Boolean> updateReportStatus(@RequestBody Collection<String> ids, @RequestParam("reportStatus") String reportStatus);

    @PostMapping("/psiMaterialBarcode/updatePackingStatus")
    RespMsgBean<Boolean> updatePackingStatus(@RequestBody Collection<String> ids, @RequestParam("packingStatus") String packingStatus);

    @PostMapping("/psiMaterialBarcodeManage/autoBarcode")
    RespMsgBean<List<PsiMaterialBarcode>> autoBarcode(@RequestBody List<AutoBarcodeDTO> sourceList);

    @PostMapping("/psiMaterialBarcode/print")
    RespMsgBean<Void> print(@RequestBody BarcodePrintDTO params);

    @PostMapping("/psiMaterialBarcode/findBarcodeBySourceDetailId")
    RespMsgBean<List<PsiMaterialBarcode>> findBarcodeBySourceDetailId(@RequestBody Collection<String> sourceDetailIds);
}

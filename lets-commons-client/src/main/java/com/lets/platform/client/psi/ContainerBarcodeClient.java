package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.ContainerBarcodeClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.mes.dto.HandleContainerNumberDto;
import com.lets.platform.model.psi.entity.PsiContainerCode;
import com.lets.platform.model.psi.entity.PsiContainerMaterialRecord;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

@FeignClient(value = "psi", fallback = ContainerBarcodeClientFallback.class)
public interface ContainerBarcodeClient {

    @GetMapping("/psiContainerCode/findByBarcodeAndTenancyId")
    RespMsgBean<PsiContainerCode> findByBarcodeAndTenancyId(@RequestParam("barcode") String barcode, @RequestParam("tenancyId") String tenancyId);

    @PostMapping("/psiContainerCode/batGetDate4ExportTemplate")
    RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(@RequestBody ExportWithTemplateDto dto);

    @PostMapping("/psiContainerMaterialRecord/putIn")
    RespMsgBean<Void> putIn(@RequestBody List<PsiContainerMaterialRecord> list);

    @PostMapping("/psiContainerMaterialRecord/findTotalInfo4Dispatch")
    RespMsgBean<PsiContainerMaterialRecord> findTotalInfo4Dispatch(@RequestBody HandleContainerNumberDto numberDto);

    @PostMapping("/psiContainerMaterialRecord/findVehicleList/valve")
    RespMsgBean<List<PsiContainerMaterialRecord>> findVehicleList4Valve(@RequestBody HandleContainerNumberDto numberDto);
    @PostMapping("/psiContainerMaterialRecord/findUsedVehicleCode4Valve/valve")
    RespMsgBean<Set<String>> findUsedVehicleCode4Valve(@RequestBody HandleContainerNumberDto numberDto);

    @PostMapping("/psiContainerMaterialRecord/batSave/valve")
    RespMsgBean batSave4Valve(@RequestBody List<PsiContainerMaterialRecord> records);

    @PostMapping("/psiContainerMaterialRecord/delete/valve")
    RespMsgBean delete4Valve(@RequestBody Collection<String> ids);

    @PostMapping("/psiContainerMaterialRecord/handleNumberWhenReceive")
    RespMsgBean<Map<String, BigDecimal>> handleContainerNumberWhenReceive(@RequestBody HandleContainerNumberDto numberDto);
    @PostMapping("/psiContainerMaterialRecord/handleNumberWhenRevokeReceive")
    RespMsgBean handleNumberWhenRevokeReceive(@RequestBody Map<String, BigDecimal> revokeNumberMap);

    @PostMapping("/psiContainerCode/findById4valve")
    RespMsgBean<PsiContainerCode> findById4Valve(@RequestBody HandleContainerNumberDto numberDto);
}

package com.lets.platform.client.psi.fallback;

import com.lets.platform.client.psi.ContainerBarcodeClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.mes.dto.HandleContainerNumberDto;
import com.lets.platform.model.psi.entity.PsiContainerCode;
import com.lets.platform.model.psi.entity.PsiContainerMaterialRecord;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;

@Service
public class ContainerBarcodeClientFallback extends BaseController implements ContainerBarcodeClient {

    @Override
    public RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(ExportWithTemplateDto dto) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<Void> putIn(List<PsiContainerMaterialRecord> list) {
        return failure(FAILURE);
    }

    @Override
    public RespMsgBean<PsiContainerMaterialRecord> findTotalInfo4Dispatch(HandleContainerNumberDto numberDto) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<List<PsiContainerMaterialRecord>> findVehicleList4Valve(HandleContainerNumberDto numberDto) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<PsiContainerCode> findByBarcodeAndTenancyId(String barcode, String tenancyId) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<Set<String>> findUsedVehicleCode4Valve(HandleContainerNumberDto numberDto) {
        return success(SUCCESS, new HashSet<>());
    }

    @Override
    public RespMsgBean batSave4Valve(List<PsiContainerMaterialRecord> records) {
        return failure(FAILURE);
    }

    @Override
    public RespMsgBean delete4Valve(Collection<String> ids) {
        return failure(FAILURE);
    }

    @Override
    public RespMsgBean<Map<String, BigDecimal>> handleContainerNumberWhenReceive(HandleContainerNumberDto numberDto) {
        return failure(FAILURE);
    }

    @Override
    public RespMsgBean handleNumberWhenRevokeReceive(Map<String, BigDecimal> revokeNumberMap) {
        return failure(FAILURE);
    }

    @Override
    public RespMsgBean<PsiContainerCode> findById4Valve(HandleContainerNumberDto numberDto) {
        return success(SUCCESS);
    }

}

package com.lets.platform.client.psi.fallback;

import com.lets.platform.client.psi.BarcodeClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.psi.dto.AutoBarcodeDTO;
import com.lets.platform.model.psi.dto.BarcodePrintDTO;
import com.lets.platform.model.psi.dto.GenContainerCodeDto;
import com.lets.platform.model.psi.entity.*;
import com.lets.platform.model.psi.vo.MaterialBarcodeSourceInfoQuery;
import com.lets.platform.model.psi.vo.RecommendPositionQuery;
import com.lets.platform.model.psi.vo.RecommendPositionVO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 计量单位Feign接口
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/7/5 17:38
 */
@Service
public class BarcodeClientFallback extends BaseController implements BarcodeClient {

    @Override
    public RespMsgBean<PsiContainer> getContainerById(String id) {
        return success(FIND_SUCCESS);
    }

    @Override
    public RespMsgBean<PsiContainer> getContainerByCode(String code, String tenancyId) {
        return success(FIND_SUCCESS);
    }

    @Override
    public RespMsgBean<PsiContainerCode> genOneContainerCode(GenContainerCodeDto dto) {
        return failure(FAILURE);
    }

    @Override
    public RespMsgBean genContainerCode(List<String> list, Integer number) {
        return failure(FAILURE);
    }

    @Override
    public RespMsgBean<List<PsiMaterialBarcode>> defaultSaveAndReturn(PsiMaterialBarcodeManage entity) {
        return failure(FAILURE, new ArrayList<>());
    }

    @Override
    public RespMsgBean<List<PsiMaterialBarcodeDetail>> getSourceInfo(MaterialBarcodeSourceInfoQuery query) {
        return success(FIND_SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<PsiMaterialBarcode> findByBarcodeCode(String barcode, String tenancyId) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<List<PsiMaterialBarcode>> findByBarcodeCodes(List<String> barcodeCodes) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<List<RecommendPositionVO>> recommendPositionList(RecommendPositionQuery recommendPositionQuery) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<Boolean> updateReportStatus(Collection<String> ids, String reportStatus) {
        return failure(FAILURE, Boolean.FALSE);
    }

    @Override
    public RespMsgBean<Boolean> updatePackingStatus(Collection<String> ids, String packingStatus) {
        return failure(FAILURE, Boolean.FALSE);
    }

    @Override
    public RespMsgBean<List<PsiMaterialBarcode>> autoBarcode(List<AutoBarcodeDTO> sourceList) {
        return failure(FAILURE, new ArrayList<>());
    }

    @Override
    public RespMsgBean<Void> print(BarcodePrintDTO params) {
        return failure(FAILURE);
    }

    @Override
    public RespMsgBean<List<PsiMaterialBarcode>> findBarcodeBySourceDetailId(Collection<String> sourceDetailIds) {
        return failure(FAILURE);
    }
}

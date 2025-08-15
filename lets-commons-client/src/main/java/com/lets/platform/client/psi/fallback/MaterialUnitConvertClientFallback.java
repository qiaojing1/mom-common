package com.lets.platform.client.psi.fallback;

import com.lets.platform.client.psi.MaterialUnitConvertClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.psi.entity.PsiMaterialUnitConvert;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 物料单位转换Feign接口
 */
@Service
public class MaterialUnitConvertClientFallback extends BaseController implements MaterialUnitConvertClient {

    @Override
    public RespMsgBean<List<PsiMaterialUnitConvert>> getList() {
        return success(SUCCESS);
    }
}

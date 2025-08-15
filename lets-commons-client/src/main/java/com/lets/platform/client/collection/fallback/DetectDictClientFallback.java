/*
 * csy
 */

/*
 * csy
 */

package com.lets.platform.client.collection.fallback;

import com.lets.platform.client.collection.client.DetectDictClient;
import com.lets.platform.client.collection.client.QualityCertificationClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.collection.entity.CollectionDetectDict;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 设备历史状态
 *
 * @author: DING WEI
 * @date: 2023/12/1 8:59
 */
@Service
public class DetectDictClientFallback extends BaseController implements DetectDictClient {


    @Override
    public RespMsgBean<List<CollectionDetectDict>> queryByType(List<String> types) {
        return success(new ArrayList<>());
    }

    @Override
    public RespMsgBean<CollectionDetectDict> findValveClassify(String valveTypeId,String standardId, String scope) {
        return success(SUCCESS, null);
    }
}

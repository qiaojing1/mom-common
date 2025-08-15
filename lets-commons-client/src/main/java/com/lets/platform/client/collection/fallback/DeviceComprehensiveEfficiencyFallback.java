package com.lets.platform.client.collection.fallback;

import com.lets.platform.client.collection.client.DetectReportClient;
import com.lets.platform.client.collection.client.DeviceComprehensiveEfficiencyClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.collection.entity.CollDeviceComprehensiveEfficiency;
import com.lets.platform.model.collection.entity.CollectionDetectReport;
import com.lets.platform.model.collection.entity.CollectionDetectReportVideo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 设备历史状态
 * @author: DING WEI
 * @date: 2023/12/1 8:59
 */
@Service
public class DeviceComprehensiveEfficiencyFallback extends BaseController implements DeviceComprehensiveEfficiencyClient {

    @Override
    public RespMsgBean<List<CollDeviceComprehensiveEfficiency>> calcEfficiency(String date) {
        return success(SUCCESS, new ArrayList<>());
    }
}

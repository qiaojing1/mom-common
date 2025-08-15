package com.lets.platform.client.psi;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.lets.platform.client.psi.fallback.ProduceOrderPursuanceRecordClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.AutoConditionEntity;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.mes.vo.SjProduceReportOrderVo;
import com.lets.platform.model.psi.entity.PsiProduceOrderPursuanceRecord;
import com.lets.platform.model.psi.entity.PsiProduceOrderPursuanceRecordKeys;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * 生产工单-执行记录(工位机) 控制器 接口
 *
 * @author QIAO JINT
 * @version 1.0
 * @date 2025/02/11 14:27
 */
@FeignClient(value = "psi",fallback = ProduceOrderPursuanceRecordClientFallback.class)
public interface ProduceOrderPursuanceRecordClient {
    @PostMapping("/pursuanceRecord/batGetDate4ExportTemplate")
    RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(@RequestBody ExportWithTemplateDto dto);

    @PostMapping("/pursuanceRecord/perfect4Sj")
    RespMsgBean<List<SjProduceReportOrderVo>> perfect4Sj(@RequestBody List<SjProduceReportOrderVo> records);

    @GetMapping("/pursuanceRecord/findList")
    RespMsgBean<List<PsiProduceOrderPursuanceRecord>> findList(@RequestParam(value = "size")int size,
                                                               @RequestParam(value = "current")int current,
                                                               @RequestParam(value = "startTime")String startTime, @RequestParam(value = "endTime")String endTime);
    @PostMapping("/psiProduceOrderPursuanceRecordKeys/batSave")
    RespMsgBean batSave(@RequestBody List<PsiProduceOrderPursuanceRecordKeys> records);

    @PostMapping("/psiProduceOrderPursuanceRecordKeys/deleteByRecords")
    RespMsgBean deleteByRecords(@RequestBody List<String> deleteIds);


    @PostMapping("/pursuanceRecord/defaultPage")
    RespMsgBean<IPage<PsiProduceOrderPursuanceRecord>> defaultPage(@RequestBody AutoConditionEntity autoConditionEntity);
}

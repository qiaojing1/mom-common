package com.lets.platform.client.common.client;

import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.common.dto.AutoBatchDto;
import com.lets.platform.model.common.entity.CommonBatchCodeRule;
import com.lets.platform.model.common.query.AutoCodeQuery;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 批号-自动编码 Feign接口
 **/
@FeignClient(value = "common")
public interface AutoBatchNumberClient {

    @PostMapping("/commonBatchCodeRule/autoCode")
    RespMsgBean<Map<String, Object>> autoCode(@RequestBody Map<String, Object> data);

    @PostMapping("/commonBatchCodeRule/autoVersion")
    RespMsgBean<Map<String, Object>> autoVersion(@RequestBody Map<String, Object> data);

    @GetMapping("/commonBatchCodeRule/isAutoVersion")
    RespMsgBean<Boolean> isAutoVersion(@RequestParam(value = "menuCode") String menuCode,
                                       @RequestParam(value = "tableName") String tableName);

    @PostMapping("/commonBatchCodeRule/autoVersionBatch")
    RespMsgBean<List<Map<String, Object>>> autoVersionBatch(@RequestBody List<Map<String, Object>> dataList);

    @PostMapping("/commonBatchCodeRule/autoCodeBatch")
    RespMsgBean<List<Map<String, Object>>> autoCodeBatch(@RequestBody List<Map<String, Object>> dataList);

    @PostMapping("/commonBatchCodeRule/autoCodeBatch")
    RespMsgBean<List<Map<String, Object>>> autoCodeBatch(@RequestBody List<Map<String, Object>> dataList,
                                                         @RequestParam(value = "menuCode") String menuCode);

    @PostMapping("/commonBatchCodeRule/autoCodeBatch")
    RespMsgBean<List<Map<String, Object>>> autoCodeBatch(@RequestBody List<Map<String, Object>> dataList,
                                                         @RequestParam(value = "menuCode") String menuCode,
                                                         @RequestParam(value = "tableName") String tableName,
                                                         @RequestParam(value = "startSerial") String startSerial
    );

    @PostMapping("/commonBatchCodeRule/autoCodeBatch")
    RespMsgBean<List<Map<String, Object>>> autoCodeBatch(@RequestBody List<Map<String, Object>> dataList,
                                                         @RequestParam(value = "menuCode") String menuCode,
                                                         @RequestParam(value = "tableName") String tableName);

    @GetMapping("/commonBatchCodeRule/isAutoCode")
    RespMsgBean<CommonBatchCodeRule> isAutoCode(@RequestParam(value = "menuCode") String menuCode);

    @GetMapping("/commonBatchCodeRule/isAutoCode")
    RespMsgBean<CommonBatchCodeRule> isAutoCode(@RequestParam(value = "menuCode") String menuCode,
                                                @RequestParam(value = "tableName") String tableName);

    @PostMapping("/commonBatchCodeRule/autoCodeBatchWithRule")
    RespMsgBean<List<Map<String, Object>>> autoCodeBatchWithRule(@RequestBody AutoBatchDto batchDto);

    @PostMapping("/commonBatchCodeRule/autoSerialNumber")
    RespMsgBean<List<Map<String, Object>>> autoSerialNumber(@RequestBody AutoCodeQuery query);

    @PostMapping("/commonBatchCodeRule/reverseSerial")
    @ApiOperation("回退流水号流水值")
    RespMsgBean reverseSerial(@RequestBody List<AutoCodeQuery> query);

    @PostMapping("/commonBatchCodeRuleRange/getUsedMaterialIds")
    RespMsgBean<Set<String>> getUsedMaterialIds(@RequestBody Collection<String> materialIds);
}

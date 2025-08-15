package com.lets.platform.client.uc.client;

import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.common.entity.CommonCodeRule;
import com.lets.platform.model.common.entity.CommonCodeRuleDetail;
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
 * 自动编码 Feign接口
 **/
@FeignClient(value = "common")
public interface AutoCodeClient {

    @PostMapping("/commonCodeRule/autoCode")
    RespMsgBean<Map<String, Object>> autoCode(@RequestBody Map<String, Object> data);

    @PostMapping("/commonCodeRule/autoCodeBatch")
    RespMsgBean<List<Map<String, Object>>> autoCodeBatch(@RequestBody List<Map<String, Object>> dataList);

    @PostMapping("/commonCodeRule/autoCodeBatch")
    RespMsgBean<List<Map<String, Object>>> autoCodeBatch(@RequestBody List<Map<String, Object>> dataList, @RequestParam(value = "menuCode") String menuCode);

    @PostMapping("/commonCodeRule/autoCodeBatchWithCategory")
     RespMsgBean<List<Map<String, Object>>> autoCodeBatchWithCategory(@RequestBody List<Map<String, Object>> dataList,
                                                                            @RequestParam(value = "menuCode", required = false) String menuCode,
                                                                            @RequestParam(value = "tableName", required = false) String tableName);

    @PostMapping("/commonCodeRule/autoCodeBatch")
    <T> RespMsgBean<List<Map<String, Object>>> autoCodeBatch(@RequestBody List<T> dataList,
                                                             @RequestParam(value = "menuCode") String menuCode,
                                                             @RequestParam(value = "tableName") String tableName);
    @PostMapping("/commonCodeRule/autoCodeBatch")
    <T> RespMsgBean<List<Map<String, Object>>> autoCodeBatch(@RequestBody List<T> dataList,
                                                             @RequestParam(value = "menuCode", required = false) String menuCode,
                                                             @RequestParam(value = "tableName", required = false) String tableName,
                                                             @RequestParam(value = "tenancyId", required = false) String tenancyId);

    @GetMapping("/commonCodeRule/autoCodeBatchFast")
    RespMsgBean<List<CommonCodeRuleDetail>> autoCodeBatchFast(@RequestParam(value = "menuCode") String menuCode,
                                                              @RequestParam(value = "tableName") String tableName,
                                                              @RequestParam(value = "fieldName") String fieldName,
                                                              @RequestParam(value = "size") Integer size);

    @GetMapping("/commonCodeRule/isAutoCode")
    RespMsgBean<List<CommonCodeRule>> isAutoCode(@RequestParam(value = "menuCode") String menuCode);

    @GetMapping("/commonCodeRule/isAutoCode")
    RespMsgBean<List<CommonCodeRule>> isAutoCode(@RequestParam(value = "menuCode") String menuCode,
                                                 @RequestParam(value = "tableName") String tableName);

    @GetMapping("/commonCodeRule/isAutoCode")
    RespMsgBean<List<CommonCodeRule>> isAutoCode(@RequestParam(value = "menuCode") String menuCode,
                                                 @RequestParam(value = "tableName") String tableName,
                                                 @RequestParam(value = "groupId") String groupId);

    @GetMapping("/commonCodeRule/isAutoCode")
    RespMsgBean<List<CommonCodeRule>> isAutoCode(@RequestParam(value = "menuCode") String menuCode,
                                                 @RequestParam(value = "tableName", required = false) String tableName,
                                                 @RequestParam(value = "groupId", required = false) String groupId,
                                                 @RequestParam(value = "tenancyId", required = false) String tenancyId);

    @GetMapping("/commonCodeRule/isAutoCode")
    RespMsgBean<List<CommonCodeRule>> isAutoCode(@RequestParam(value = "menuCode") String menuCode,
                                                 @RequestParam(value = "tableName", required = false) String tableName,
                                                 @RequestParam(value = "groupId", required = false) String groupId,
                                                 @RequestParam(value = "orderCategoryId", required = false) String orderCategoryId,
                                                 @RequestParam(value = "tenancyId", required = false) String tenancyId);

    @GetMapping("/commonCodeRule/findAllMaterialGroupIds")
    RespMsgBean<Set<String>> findAllMaterialGroupIds(@RequestParam(value = "tenancyId", required = false) String tenancyId,
                                                     @RequestParam(value = "field", required = false) String field);

    @GetMapping("/commonCodeRuleDetail/findDetail4Material")
    RespMsgBean<List<CommonCodeRuleDetail>> findDetail4Material(@RequestParam("groupId") String groupId);

    @PostMapping("/commonCodeRuleDetail/findDetailByParentId")
    RespMsgBean<List<CommonCodeRuleDetail>> findDetailByParentId(@RequestBody Collection<String> ids);

    @PostMapping("/commonCodeRule/findRuleFieldsByAutoCodeFields")
    RespMsgBean<Set<String>> findRuleFieldsByAutoCodeFields(@RequestBody CommonCodeRule commonCodeRule);

    @GetMapping("/commonCodeRule/exportDataBytes")
    RespMsgBean<byte[]> exportDataBytes(@RequestParam("tenancyId") String tenancyId);
}

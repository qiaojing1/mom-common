package com.lets.common.mybatis.templates;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollUtil;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.enums.MethodTypeEnum;
import com.lets.platform.common.pojo.enums.QuoteFieldEnum;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.*;

/**
 * 字段引用处理
 * @author: DING WEI
 * @date: 2023/9/4 9:24
 */
@Component
public class FieldQuoteHandler {

    @Resource
    private RedisTemplate<String, Object> letsRedisTemplate;

    public void handleFieldQuote(Object beforeEntity, Object afterEntity, List<Object> deleteDataList, MethodTypeEnum methodTypeEnum, List<QuoteFieldEnum> quoteFieldList) {
        Map<String, Object> beforeData = new HashMap<>();
        Map<String, Object> afterData = new HashMap<>();
        List<Map<String, Object>> deleteList = new ArrayList<>();
        if (Objects.nonNull(beforeEntity)) {
            beforeData = BeanUtil.beanToMap(beforeEntity);
        }
        if (Objects.nonNull(afterEntity)) {
            afterData = BeanUtil.beanToMap(afterEntity);
        }
        if (CollUtil.isNotEmpty(deleteDataList)) {
            JSONArray jsonArray = JSONArray.parseArray(JSONObject.toJSONString(deleteDataList));
            for (int i = 0; i < jsonArray.size(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                deleteList.add(BeanUtil.beanToMap(jsonObject));
            }
        }
        if (MethodTypeEnum.SAVE.equals(methodTypeEnum)) {
            // 保存
            if (CollUtil.isNotEmpty(afterData)) {
                for (int i = 0; i < quoteFieldList.size(); i++) {
                    QuoteFieldEnum fieldEnum = quoteFieldList.get(i);
                    String redisKey = fieldEnum.getRedisKey();
                    String field = fieldEnum.getAttribute();
                    Object fieldValue = afterData.get(field);
                    if (Objects.nonNull(fieldValue) && StringUtils.isNotBlank(fieldValue.toString())) {
                        Integer quoteTimes = GlobalConstant.ZERO;
                        Object quoteObj = letsRedisTemplate.opsForHash().get(redisKey, fieldValue.toString());
                        if (Objects.nonNull(quoteObj)) {
                            quoteTimes = Integer.parseInt(quoteObj.toString());
                        }
                        letsRedisTemplate.opsForHash().put(redisKey, fieldValue.toString(), quoteTimes + GlobalConstant.ONE);
                    }
                }
            }
        } else if (MethodTypeEnum.UPDATE.equals(methodTypeEnum)) {
            // 更新
            if (CollUtil.isNotEmpty(beforeData) && CollUtil.isNotEmpty(afterData)) {
                for (int i = 0; i < quoteFieldList.size(); i++) {
                    QuoteFieldEnum fieldEnum = quoteFieldList.get(i);
                    String redisKey = fieldEnum.getRedisKey();
                    String field = fieldEnum.getAttribute();
                    Object beforeFieldValue = beforeData.get(field);
                    if (Objects.nonNull(beforeFieldValue) && StringUtils.isNotBlank(beforeFieldValue.toString())) {
                        String beforeField = beforeFieldValue.toString();
                        Integer quoteTimes = GlobalConstant.ZERO;
                        Object quoteObj = letsRedisTemplate.opsForHash().get(redisKey, beforeFieldValue.toString());
                        if (Objects.nonNull(quoteObj)) {
                            quoteTimes = Integer.parseInt(quoteObj.toString());
                        }
                        if (quoteTimes >= GlobalConstant.ONE) {
                            letsRedisTemplate.opsForHash().put(redisKey, beforeFieldValue.toString(), quoteTimes - GlobalConstant.ONE);
                        }
                    }
                    Object afterFieldValue = afterData.get(field);
                    if (Objects.nonNull(afterFieldValue) && StringUtils.isNotBlank(afterFieldValue.toString())) {
                        String afterField = afterFieldValue.toString();
                        Integer quoteTimes = GlobalConstant.ZERO;
                        Object quoteObj = letsRedisTemplate.opsForHash().get(redisKey, afterFieldValue.toString());
                        if (Objects.nonNull(quoteObj)) {
                            quoteTimes = Integer.parseInt(quoteObj.toString());
                        }
                        letsRedisTemplate.opsForHash().put(redisKey, afterFieldValue.toString(), quoteTimes + GlobalConstant.ONE);
                    }
                }
            }
        } else if (MethodTypeEnum.DELETE.equals(methodTypeEnum)) {
            // 删除
            if (CollUtil.isNotEmpty(deleteList)) {
                for (int i = 0; i < quoteFieldList.size(); i++) {
                    QuoteFieldEnum quoteField = quoteFieldList.get(i);
                    String redisKey = quoteField.getRedisKey();
                    String field = quoteField.getAttribute();
                    for (Map<String, Object> objectMap : deleteList) {
                        if (Objects.nonNull(objectMap)) {
                            Object quoteFieldValue = objectMap.get(field);
                            if (Objects.nonNull(quoteFieldValue) && StringUtils.isNotBlank(quoteFieldValue.toString())) {
                                String quoteFieldStrValue = quoteFieldValue.toString();
                                Integer quoteTimes = GlobalConstant.ZERO;
                                Object quoteObj = letsRedisTemplate.opsForHash().get(redisKey, quoteFieldStrValue);
                                if (Objects.nonNull(quoteObj)) {
                                    quoteTimes = Integer.parseInt(quoteObj.toString());
                                }
                                if (quoteTimes >= GlobalConstant.ONE) {
                                    letsRedisTemplate.opsForHash().put(redisKey, quoteFieldStrValue, quoteTimes - GlobalConstant.ONE);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void handleFieldQuote4Import(List<Object> afterEntity, List<QuoteFieldEnum> quoteFieldList) {
        List<Map<String, Object>> importList = new ArrayList<>();
        if (CollUtil.isNotEmpty(afterEntity)) {
            JSONArray jsonArray = JSONArray.parseArray(JSONObject.toJSONString(afterEntity));
            for (int i = 0; i < jsonArray.size(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                importList.add(BeanUtil.beanToMap(jsonObject));
            }
        }
        if (CollUtil.isNotEmpty(importList)) {
            for (Map<String, Object> map : importList) {
                for (QuoteFieldEnum fieldEnum : quoteFieldList) {
                    String redisKey = fieldEnum.getRedisKey();
                    String field = fieldEnum.getAttribute();
                    Object fieldValue = map.get(field);
                    if (Objects.nonNull(fieldValue) && StringUtils.isNotBlank(fieldValue.toString())) {
                        Integer quoteTimes = GlobalConstant.ZERO;
                        Object quoteObj = letsRedisTemplate.opsForHash().get(redisKey, fieldValue.toString());
                        if (Objects.nonNull(quoteObj)) {
                            quoteTimes = Integer.parseInt(quoteObj.toString());
                        }
                        letsRedisTemplate.opsForHash().put(redisKey, fieldValue.toString(), quoteTimes + GlobalConstant.ONE);
                    }
                }
            }
        }
    }

    public void handleFieldQuote4Detail(List<Object> deleteList, MethodTypeEnum methodTypeEnum, List<QuoteFieldEnum> quoteFieldList) {
        List<Map<String, Object>> deleteDataList = new ArrayList<>();
        if (CollUtil.isNotEmpty(deleteList)) {
            for (Object delete : deleteList) {
                deleteDataList.add(BeanUtil.beanToMap(delete));
            }
        }
        if (MethodTypeEnum.DELETE.equals(methodTypeEnum)) {
            // 删除
            if (CollUtil.isNotEmpty(deleteDataList)) {
                for (Map<String, Object> deleteData : deleteDataList) {
                    for (int i = 0; i < quoteFieldList.size(); i++) {
                        QuoteFieldEnum fieldEnum = quoteFieldList.get(i);
                        String redisKey = fieldEnum.getRedisKey();
                        String field = fieldEnum.getAttribute();
                        Object fieldValue = deleteData.get(field);
                        if (Objects.nonNull(fieldValue)) {
                            String quoteFieldStrValue = fieldValue.toString();
                            Integer quoteTimes = GlobalConstant.ZERO;
                            Object quoteObj = letsRedisTemplate.opsForHash().get(redisKey, quoteFieldStrValue);
                            if (Objects.nonNull(quoteObj)) {
                                quoteTimes = Integer.parseInt(quoteObj.toString());
                            }
                            if (quoteTimes >= GlobalConstant.ONE) {
                                letsRedisTemplate.opsForHash().put(redisKey, quoteFieldStrValue, quoteTimes - GlobalConstant.ONE);
                            }
                        }
                    }
                }
            }
        }
        if (MethodTypeEnum.SAVE.equals(methodTypeEnum) || MethodTypeEnum.UPDATE.equals(methodTypeEnum)) {
            // 保存、更新
            if (CollUtil.isNotEmpty(deleteDataList)) {
                for (Map<String, Object> deleteData : deleteDataList) {
                    for (int i = 0; i < quoteFieldList.size(); i++) {
                        QuoteFieldEnum fieldEnum = quoteFieldList.get(i);
                        String redisKey = fieldEnum.getRedisKey();
                        String field = fieldEnum.getAttribute();
                        Object fieldValue = deleteData.get(field);
                        if (Objects.nonNull(fieldValue)) {
                            String quoteFieldStrValue = fieldValue.toString();
                            Integer quoteTimes = GlobalConstant.ZERO;
                            Object quoteObj = letsRedisTemplate.opsForHash().get(redisKey, quoteFieldStrValue);
                            if (Objects.nonNull(quoteObj)) {
                                quoteTimes = Integer.parseInt(quoteObj.toString());
                            }
                            letsRedisTemplate.opsForHash().put(redisKey, quoteFieldStrValue, quoteTimes + GlobalConstant.ONE);
                        }
                    }
                }
            }
        }
    }

}
